package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.collections4.CollectionUtils;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataAccess.PoliceData;
import resources.PropertiesFile;
import uIMaps.UIMapHome;
import uIMaps.UIMapNames;
import uIMaps.UIMapPopup;
import uIMaps.UIMapQA;
import uIMaps.UIMapRecords;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

/**
 * Unit test for simple App.
 */
public class Records {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapRecords uIMapRecords = new UIMapRecords();
	public UIMapNames uIMapNames = new UIMapNames();
	public UIMapHome uIMapHome = new UIMapHome();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public Names names = new Names();
	public Geo geo = new Geo();
	public UIMapQA uIMapQA = new UIMapQA();
	public static String TestResourceFolderPath = PropertiesFile.readPropertiesFile("TestResourceFolderPath");

	public CallEntry callEntry;
	public CallSearch callSearch;
	public CaseSearch caseSearch;
	public CaseUpdate caseUpdate;
	public WalkInEntry walkInEntry;
	public CaseUnits caseUnits;
	public ReportManager reportManager;
	public ReportStatus reportStatus;
	public ReportSearch reportSearch;
	public ACD aCD;
	public FTC fTC;
	public CaseNames caseNames;
	public NameVictim nameVictim;
	public VictimOffender victimOffender;
	public DomesticViolence domesticViolence;
	public Leoka leoka;
	public CaseVehicle caseVehicle;
	public IBRSearch iBRSearch;
	public DVEntry dVEntry;
	public DVSearch dVSearch;
	public UOFEntry uOFEntry;
	public UOFSearchHelpWindow uOFSearchHelpWindow;
	public CaseSuspect caseSuspect;
	public UOFSearch uOFSearch;
	public ALCScreen aLCScreen;
	public OpenRecordsRequestEntry openRecordsRequestEntry;
	public OpenRecordsRequest openRecordsRequest;
	public ReportStatusScreenTab reportStatusScreenTab;
	public BoloScreenTab boloScreenTab;
	public ComplaintEntry complaintEntry;
	public PursuitCaseEntry pursuitCaseEntry;
	public IBRSubmissionEntry iBRSubmissionEntry;
	public IBRSubmissionScreenTab iBRSubmissionScreenTab;
	public ReportRelatedToPF reportRelatedToPF;
	public VehicleProfile vehicleProfile;
	public ProfileSearch profileSearch;
	public ViewTextFileEntry viewTextFileEntry;
	public RedactStatus redactStatus;
	public OpenRecordsRequestHelpWindow openRecordsRequestHelpWindow;
	public QuestionDataEntry questionDataEntry;
	public Questionnarie questionnarie;
	public SendEmail sendEmail;
	public NIBRSCheck nIBRSCheck;
	public UCR uCR;
	public UOFDetail uOFDetail;
	public ReportStatusNarrative reportStatusNarrative;
	public RedactExpungement redactExpungement;
	public ReportStatusViewRedactReport reportStatusViewRedactReport;
	public ReportStatusForRedact reportStatusForRedact;
	public UseOfForceReportEntry useOfForceReportEntry;
	public RepositoryEntry repositoryEntry;
	public PursuitReportEntry pursuitReportEntry;
	public DirectReportEntry directReportEntry;
	public UnitHistorySearch unitHistorySearch;

	public SuspectSearch suspectSearch;
  
		public Records() {

		if (callSearch == null)
			callSearch = new CallSearch();
		if (callEntry == null)
			callEntry = new CallEntry();
		if (caseSearch == null)
			caseSearch = new CaseSearch();
		if (caseUpdate == null)
			caseUpdate = new CaseUpdate();
		if (walkInEntry == null)
			walkInEntry = new WalkInEntry();
		if (caseUnits == null)
			caseUnits = new CaseUnits();
		if (reportManager == null)
			reportManager = new ReportManager();
		if (reportStatus == null)
			reportStatus = new ReportStatus();
		if (reportSearch == null)
			reportSearch = new ReportSearch();
		if (aCD == null)
			aCD = new ACD();
		if (fTC == null)
			fTC = new FTC();
		if (caseNames == null)
			caseNames = new CaseNames();
		if (nameVictim == null)
			nameVictim = new NameVictim();
		if (victimOffender == null)
			victimOffender = new VictimOffender();
		if (domesticViolence == null)
			domesticViolence = new DomesticViolence();
		if (leoka == null)
			leoka = new Leoka();
		if (caseVehicle == null)
			caseVehicle = new CaseVehicle();
		if (iBRSearch == null)
			iBRSearch = new IBRSearch();
		if (dVEntry == null)
			dVEntry = new DVEntry();
		if (dVSearch == null)
			dVSearch = new DVSearch();
		if (uOFEntry == null)
			uOFEntry = new UOFEntry();
		if (uOFSearchHelpWindow == null)
			uOFSearchHelpWindow = new UOFSearchHelpWindow();
		if (uOFSearch == null)
			uOFSearch = new UOFSearch();
		if (aLCScreen == null)
			aLCScreen = new ALCScreen();
		if (openRecordsRequestEntry == null)
			openRecordsRequestEntry = new OpenRecordsRequestEntry();
		if (openRecordsRequest == null)
			openRecordsRequest = new OpenRecordsRequest();
		if (boloScreenTab == null)
			boloScreenTab = new BoloScreenTab();
		if (complaintEntry == null)
			complaintEntry = new ComplaintEntry();
		if (pursuitCaseEntry == null)
			pursuitCaseEntry = new PursuitCaseEntry();
		if (iBRSubmissionEntry == null)
			iBRSubmissionEntry = new IBRSubmissionEntry();
		if (iBRSubmissionScreenTab == null)
			iBRSubmissionScreenTab = new IBRSubmissionScreenTab();
		if (reportRelatedToPF == null)
			reportRelatedToPF = new ReportRelatedToPF();
		if (vehicleProfile == null)
			vehicleProfile = new VehicleProfile();
		if (profileSearch == null)
			profileSearch = new ProfileSearch();
		if (questionnarie == null)
			questionnarie = new Questionnarie();
		if (questionDataEntry == null)
			questionDataEntry = new QuestionDataEntry();
		if (viewTextFileEntry == null)
			viewTextFileEntry = new ViewTextFileEntry();
		if (redactStatus == null)
			redactStatus = new RedactStatus();
		if (openRecordsRequestHelpWindow == null)
			openRecordsRequestHelpWindow = new OpenRecordsRequestHelpWindow();
		if (sendEmail == null)
			sendEmail = new SendEmail();
		if (nIBRSCheck == null)
			nIBRSCheck = new NIBRSCheck();
		if (uCR == null)
			uCR = new UCR();
		if (uOFDetail == null)
			uOFDetail = new UOFDetail();
		if (reportStatusNarrative == null)
			reportStatusNarrative = new ReportStatusNarrative();
		if (redactExpungement == null)
			redactExpungement = new RedactExpungement();		
		if (reportStatusViewRedactReport == null)
			reportStatusViewRedactReport = new ReportStatusViewRedactReport();
		if (reportStatusForRedact == null)
			reportStatusForRedact = new ReportStatusForRedact();
		if (caseSuspect == null)
			caseSuspect = new CaseSuspect();
		if (useOfForceReportEntry == null)
			useOfForceReportEntry = new UseOfForceReportEntry();
			if (repositoryEntry == null)
			repositoryEntry = new RepositoryEntry();
		if (pursuitReportEntry == null)
			pursuitReportEntry = new PursuitReportEntry();
			
			if (directReportEntry == null)
			directReportEntry = new DirectReportEntry();

		if (suspectSearch == null)
			suspectSearch = new SuspectSearch();
		
		if (unitHistorySearch == null)
			unitHistorySearch = new UnitHistorySearch();
		
	}

	public void Reset() {
		uIMapRecords = null;
		uIMapHome = null;
		uIMapNames = null;
		uIMapPopup = null;
	}

	public void switchToCaseUpdate() {
		objectIdentification.windowHandle.switchToWindow("Case Update");
	}

	public void switchToCallSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmCallSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToCaseSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmCBESrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToCallEntry() {
		objectIdentification.windowHandle.switchToWindow("Call Entry");
		Playback.controlReadyThreadWait();
	}
	public void switchToRepositoryEntry() {
		objectIdentification.windowHandle.switchToWindow("Repository Entry");
	}

	public void switchToReportManager() {
		objectIdentification.windowHandle.switchToWindow("Report Manager");
		Playback.controlReadyThreadWait();
	}

	public void switchToReportStatus() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("Report Status");
		Playback.controlReadyThreadWait();
		Playback.pageLoadThreadWait();
	}

	public void switchToReportSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmRptStatus");
		Playback.controlReadyThreadWait();
	}

	public void switchToACD() {
		objectIdentification.windowHandle.switchToWindow("ACD");
		Playback.controlReadyThreadWait();
	}

	public void switchToFTC() {
		Playback.controlReadyThreadWait();
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("FTC");
		Playback.controlReadyThreadWait();
	}

	public void switchToCaseNames() {
		objectIdentification.windowHandle.switchToWindow("Case Names");
		Playback.controlReadyThreadWait();
	}

	public void switchToCaseVehicle() {
		objectIdentification.windowHandle.switchToWindow("Case Vehicle");
		Playback.controlReadyThreadWait();
	}

	public void switchToNameVictim() {
		// objectIdentification.windowHandle.switchToWindow("Name Victim");
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmVictim.aspx?");
		Playback.controlReadyThreadWait();
	}

	public void switchToVictimOffender() {
		// objectIdentification.windowHandle.switchToWindow("Victim Offender");
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmNameVictim.aspx?");
		Playback.controlReadyThreadWait();
	}

	public void switchToWalkInEntry() {
		objectIdentification.windowHandle.switchToWindow("Walk-In Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToDomesticViolence() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmNameDV_Id");
		Playback.controlReadyThreadWait();

	}

	public void switchToRecordsRequestSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmORRequestSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToOpenRecordsRequestEntry() {
		objectIdentification.windowHandle.switchToWindow("Records Request Entry");
		Playback.controlReadyThreadWait();
	}
	public void switchToUseOfForceReportEntry() {
        objectIdentification.windowHandle.switchToWindow("Use of Force - Report Entry - 2545");
    }

	public void switchToRedact() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmRedact");
		Playback.controlReadyThreadWait();
	}

	public void switchToLeoka() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmNameLEOKA_Id");
		Playback.controlReadyThreadWait();
	}

	public void switchToQuestionnarie() {

		objectIdentification.windowHandle.switchToWindow("Questionnaire");
		Playback.controlReadyThreadWait();
	}

	public void switchToQuestionDataEntry() {
		objectIdentification.windowHandle.switchToWindow("Question Data Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToIBRSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("UCR/frmNIBRSReSubSrch");
		Playback.controlReadyThreadWait();
	}
	public void switchToUnitHistorySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Unit History Search");
	}
	public void switchToDVEntry() {
		objectIdentification.windowHandle.switchToWindow("DV Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToDVSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmDvSearch");
		Playback.controlReadyThreadWait();
	}

	public void switchToUOFEntry() {
		objectIdentification.windowHandle.switchToWindow("UOF Entry");
	}

	public void switchToUOFSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Use of Force - Report Entry - 2545");
	}

	public void switchToCaseSuspect() {
		objectIdentification.windowHandle.switchToWindow("Case Suspect");
	}

	public void switchToCaseUnits() {
		objectIdentification.windowHandle.switchToWindow("Case Units");
	}

	public void switchToUOFSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmUOFSrch.aspx");
		Playback.pageLoadThreadWait();
	}

	public void switchToUCR() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("UCR/frmSubmitData");
	}

	public void switchToAccessListControl() {
		objectIdentification.windowHandle.switchToWindow("Access List Control");
	}

	public void switchToReportsStatusScreenTab() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmRptStatusINQ");
		Playback.pageLoadThreadWait();
	}

	public void switchToBoloScreenTab() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmBolo");
		Playback.pageLoadThreadWait();
	}

	public void switchToComplaintEntryScreenTab() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Complaint Entry");
		Playback.pageLoadThreadWait();
	}

	public void switchToPursuitCaseEntry() {
		objectIdentification.windowHandle.switchToWindow("Pursuit - Case Entry");
		Playback.pageLoadThreadWait();
	}

	public void switchToIBRSubmission() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("UCR/frmNIBRSSrch");
		Playback.pageLoadThreadWait();
	}

	public void switchToIBRSubmissionEntry() {
		objectIdentification.windowHandle.switchToWindow("IBR Submission Entry");
		Playback.pageLoadThreadWait();
	}

	public void switchToReportRelatedPF() {
		objectIdentification.windowHandle.switchToWindow("frmRptRelatedToPF");
		Playback.pageLoadThreadWait();
	}

	public void switchToProfileSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Records/frmProfileSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToSuspectSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmSuspectSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToVehicleProfileEntry() {
		objectIdentification.windowHandle.switchToWindow("Vehicle Profile");
		Playback.pageLoadThreadWait();
	}

	public void switchToViewTextFileEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmViewTxtFile");
		Playback.pageLoadThreadWait();
	}

	public void switchToUCRReportPDF() {
		objectIdentification.windowHandle.switchToWindowUsingURL("KPITemp");
		Playback.pageLoadThreadWait();
	}

	public void switchToOpenRecordsRequestHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Open Records Request");
		Playback.controlReadyThreadWait();
	}

	public void switchToCaseSearchWindow() {
		objectIdentification.windowHandle.switchToWindow("Call Search");
		Playback.controlReadyThreadWait();
	}

	public void switchToNIBRSCheckError() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmErrorCheck.aspx");
		Playback.pageLoadThreadWait();
	}

	public void switchToUOFDetail() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingFormName("PnxRptSvr/frmPnxSQLRpt");
		Playback.controlReadyThreadWait();
	}

	public void switchToReportStatusNarrative() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmTextStmtRpt");
		Playback.controlReadyThreadWait();
	}

	public void switchToUCRlogsWindow() {
		objectIdentification.windowHandle.switchToWindow("UCRLog");

	}
	
	 public  void switchToReportStatusForRedact()
     {
         Playback.controlReadyThreadWait();
         objectIdentification.windowHandle.switchToWindowUsingURL("frmIncidentRptOpen.aspx?IsExpunge");
         Playback.controlReadyThreadWait();
         Playback.pageLoadThreadWait();
     }
     public  void switchToReportStatusFoViewRedactReports()
     {
         Playback.controlReadyThreadWait();
         objectIdentification.windowHandle.switchToWindowUsingURL("frmViewRedact.aspx?");
         Playback.controlReadyThreadWait();
         Playback.pageLoadThreadWait();
     }
     public  void switchToRecordsExpungement()
     {
         Playback.controlReadyThreadWait();
         objectIdentification.windowHandle.switchToWindow("Expungement");
         Playback.controlReadyThreadWait();
         Playback.pageLoadThreadWait();
     }

public void switchToDirectReportEntry() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmInvestEntry.aspx?");
		Playback.controlReadyThreadWait();
		Playback.pageLoadThreadWait();
	}
	public class CallEntry {
		public CallEntryMainTab callEntryMainTab = null;
		public CallEntryNamesTab callEntryNamesTab = null;
		public NotesTab notesTab = null;
		public CallSummaryTab callSummaryTab = null;
		public VehicleTab vehicleTab = null;
		public CallEntryUnitsTab callEntryUnitsTab = null;
		public CallEntryRelatedCallsTab callEntryRelatedCallsTab = null;
		public CallEntrySuspectsTab callEntrySuspectsTab = null;
		public CallEntryMapTab callEntryMapTab = null;
		public AttachmentsTab attachmentsTab = null;
		public CallEntryRequestTab callEntryRequestTab = null;
		public CallEntryEditTab callEntryEditTab = null;
		public CallEntryANCATab callEntryANCATab = null;
		public CallEntryDispositionTab callEntryDispositionTab = null;
		public CallEntryApprovalTab callEntryApprovalTab = null;
		

		public CallEntry() {
			if ((this.callEntryMainTab == null)) {
				this.callEntryMainTab = new CallEntryMainTab();
			}

			if ((this.callEntryNamesTab == null)) {
				this.callEntryNamesTab = new CallEntryNamesTab();
			}
			if ((this.callSummaryTab == null)) {
				this.callSummaryTab = new CallSummaryTab();
			}

			if ((this.notesTab == null)) {
				this.notesTab = new NotesTab();
			}

			if ((this.vehicleTab == null)) {
				this.vehicleTab = new VehicleTab();
			}

			if ((this.callEntryUnitsTab == null)) {
				this.callEntryUnitsTab = new CallEntryUnitsTab();
			}

			if ((this.callEntryRelatedCallsTab == null)) {
				this.callEntryRelatedCallsTab = new CallEntryRelatedCallsTab();
			}

			if ((this.callEntrySuspectsTab == null)) {
				this.callEntrySuspectsTab = new CallEntrySuspectsTab();
			}
			if ((this.callEntryMapTab == null)) {
				this.callEntryMapTab = new CallEntryMapTab();
			}
			if ((this.attachmentsTab == null)) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}
			if ((this.callEntryRequestTab == null)) {
				this.callEntryRequestTab = new CallEntryRequestTab();
			}

			if ((this.callEntryEditTab == null)) {
				this.callEntryEditTab = new CallEntryEditTab();
			}

			if ((this.callEntryANCATab == null)) {
				this.callEntryANCATab = new CallEntryANCATab();
			}
			if ((this.callEntryDispositionTab == null)) {
				this.callEntryDispositionTab = new CallEntryDispositionTab();
			}
			if ((this.callEntryApprovalTab == null)) {
				this.callEntryApprovalTab = new CallEntryApprovalTab();
			}

		}

		public void switchToVehicleTab() {
			uIMapRecords.callEntry.uIVehicleTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmVehicle");
			Playback.controlReadyThreadWait();
		}

		public void closeScreen() {
			uIMapRecords.callEntry.driver.close();
		}

		public void uncheckAddressValidateCheckBox() {
			if (uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.isSelected()) {
				uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.click();
			}
		}

		public void clickAddressValidateCheckBox() {
			if (!uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.isSelected()) {
				uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.click();
			}
		}

		public void EnterInitialCFSAsCFS201() {
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys("CFS201");
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys(Keys.TAB);
		}

		public void enterAtInitialCFS() {
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys(PoliceData.getRecordsModuleValue("InitialCFS"));
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys(Keys.TAB);
		}

		public void GetInitialCFS() {
			String InitialCFS = PoliceData.getRecordsModuleValue("InitialCFS").toString();
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys(PoliceData.getRecordsModuleValue("InitialCFS"));
			uIMapRecords.callEntry.uIInitialCFSEdit.sendKeys(Keys.TAB);
		}

		public void clickCaseInfoIcon() {
			uIMapRecords.callEntry.uICaseInfoIcon.click();
		}

		public void TabReceivedSource() {
			uIMapRecords.callEntry.uIReceivedSourceEdit.click();
			uIMapRecords.callEntry.uIReceivedSourceEdit.sendKeys(Keys.TAB);
		}

		public void enterAtReportedLocation() {
			uIMapRecords.callEntry.uIReportedLocationEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReportedLocation"));
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterReportedLocation(String address) {

			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(address);
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void VerifyInactiveAddressAcknowledge() {

			popup.acknowledge.okWithExpectedMessage("(5097) This address is inactive");

		}

		public void VerifyAcknowledgePremiseInactiveAddress() {
			popup.acknowledge.okWithExpectedMessage("(5095) Premise is inactive");
		}

		public void SelectReceivedSource() {
			uIMapRecords.callEntry.uIReceivedSourceSearchButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectReportedLocation() {
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys("L");
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
			geo.switchToCommonNameHelp();
			geo.commonNameHelp.SelectCommonName();
		}

		public void EnterAtCommonNameInReportedField() {
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(PoliceData.getRecordsModuleValue("CommonName"));
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void reportedDate() {
			uIMapRecords.callEntry.uIReportedDateEdit.click();
			uIMapRecords.callEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
		}

		public void reportedTime() {
			uIMapRecords.callEntry.uIReportedTimeEdit.click();
			uIMapRecords.callEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void stackedDate() {
			uIMapRecords.callEntry.uIStackedDateEdit.click();
			uIMapRecords.callEntry.uIStackedDateEdit.sendKeys(Keys.TAB);
		}

		public void stackedTime() {
			uIMapRecords.callEntry.uIStackedTimeEdit.click();
			uIMapRecords.callEntry.uIStackedTimeEdit.sendKeys(Keys.TAB);
		}

		public void finishedDate() {
			uIMapRecords.callEntry.uIFinishedDateEdit.click();
			uIMapRecords.callEntry.uIFinishedDateEdit.sendKeys(Keys.TAB);
		}

		public void finishedTime() {
			uIMapRecords.callEntry.uIFinishedTimeEdit.click();
			uIMapRecords.callEntry.uIFinishedTimeEdit.sendKeys(Keys.TAB);

		}

		public void CallCompletionLocation() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.click();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void VerifyCallCompletionLocationAsReportedLocation(String ReportedLocation) {
			verify.ExpectedPropertyValueIsEqual(ReportedLocation,
					uIMapRecords.callEntry.uICallCompletionLocationEdit.getAttribute("value"));
		}

		public void tabcallCompletionLocationVerify() {
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void enterCADDispositionAsI() {
			uIMapRecords.callEntry.uICADDispositionEdit.sendKeys("I");
			uIMapRecords.callEntry.uICADDispositionEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCADDisposition() {
			uIMapRecords.callEntry.uICADDispositionEdit.sendKeys(PoliceData.getRecordsModuleValue("CADDisposition"));
			uIMapRecords.callEntry.uICADDispositionEdit.sendKeys(Keys.TAB);
		}

		public void ClickSaveButton() {
			uIMapRecords.callEntry.uISaveButton.click();

		}

		public void Verify1051UpdateDataExistsNotesTabAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Notes Tab. You must save or reset.");
		}

		public void ClickSaveCloseButton() {
			uIMapRecords.callEntry.uISaveCloseButton.click();
		}

		public void save() {
			uIMapRecords.callEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapRecords.callEntry.uISaveCloseButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void ClickPrintButton() {
			uIMapRecords.callEntry.uIPrintButton.click();
		}

		public void ClickCitationIcon() {
			uIMapRecords.callEntry.uICitationIcon.click();
		}

		public void ClickResetButton() {
			uIMapRecords.callEntry.uIResetButton.click();
		}

		public void GetCaseYear(String CaseYear) {
			Playback.setTestContextAttribute("CaseYear", uIMapRecords.callEntry.uICaseYearEdit.getAttribute("Value"));
		}

		public void GetCaseNumber(String CaseNumber) {
			Playback.setTestContextAttribute("CaseNumber",
					uIMapRecords.callEntry.uICaseNumberEdit.getAttribute("Value"));
		}

		public void GetCallYear(String CallYear) {
			Playback.setTestContextAttribute("CallYear", uIMapRecords.callEntry.uICallYearEdit.getAttribute("value"));
		}

		public void GetReportedLocation(String ReportedLocation) {
			Playback.controlReadyThreadWait();
			Playback.setTestContextAttribute("ReportedLocation",
					uIMapRecords.callEntry.uIReportedLocationEdit.getAttribute("value"));
		}

		public void GetCallNumber(String callNumber) {
			Playback.setTestContextAttribute("callNumber",
					uIMapRecords.callEntry.uICallNumberEdit.getAttribute("value"));
		}

		public void VerificationCFS() {
			Assert.assertEquals(PoliceData.getRecordsModuleValue("InitialCFS").toString(),
					uIMapRecords.callEntry.uIInitialCFSEdit.getAttribute("value"));

		}

		public void switchToAllTabs() {
			uIMapRecords.callEntry.uINotesTab.click();
			uIMapRecords.callEntry.uIMainTab.click();
			uIMapRecords.callEntry.uINamesTab.click();
			uIMapRecords.callEntry.uISuspectsTab.click();
			uIMapRecords.callEntry.uIUnitsTab.click();
			uIMapRecords.callEntry.uIEditTab.click();
			uIMapRecords.callEntry.uICallSummaryTab.click();
			uIMapRecords.callEntry.uIVehicleTab.click();
			uIMapRecords.callEntry.uIAttachmentsTab.click();
			uIMapRecords.callEntry.uIDispositionTab.click();
			uIMapRecords.callEntry.uIMapTab.click();
			// uIMapRecords.callEntry.uIApprovalTab.click();
		}

		public void clickMainTab() {
			uIMapRecords.callEntry.uIMainTab.click();
		}

		public void SwithchtoNotesTab() {
			uIMapRecords.callEntry.uINotesTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBEComments");
		}

		public void swithchtoNamesTab() {
			uIMapRecords.callEntry.uINamesTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBENames");
			Playback.controlReadyThreadWait();
		}

		public void swithchtoCallSummaryTab() {
			uIMapRecords.callEntry.uICallSummaryTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("Home/frmTextMgr");
			Playback.controlReadyThreadWait();
			
		}

		public void ClickALCIcon() {
			uIMapRecords.callEntry.uIALCIcon.click();
		}

		public void VerifyCallAtActivityNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ActivityNo").substring(0, 2),
					uIMapRecords.callEntry.uICallYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ActivityNo").substring(3),
					uIMapRecords.callEntry.uICallNumberEdit.getAttribute("value"));

		}

		public void Verify1051UpdateDataExistsInVehicleTabAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Vehicle Tab. You must save or reset.");
		}

		public void TabReportedDateTime() {
			uIMapRecords.callEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void TabStackedDateTime() {
			uIMapRecords.callEntry.uIStackedDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIStackedTimeEdit.sendKeys(Keys.TAB);
		}
		
		public void TabFinishedDateTime() {
			uIMapRecords.callEntry.uIFinishedDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIFinishedTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickEditTab() {
			uIMapRecords.callEntry.uIEditTab.click();
		}

		public void switchToUnitsTab() {
			uIMapRecords.callEntry.uIUnitsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBEUnitHistory");
		}

		public void switchToRelatedCallsTab() {
			uIMapRecords.callEntry.uIRelatedCallsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBEACDCalls");
		}

		public void GetInitialCFS(String CFS) {
			String CFSCode = uIMapRecords.callEntry.uIInitialCFSEdit.getAttribute("value");
			String CFSDescription = uIMapRecords.callEntry.uIInitialCFSDescriptionEdit.getAttribute("value");
			CFS = CFSCode + "-" + CFSDescription;
			Playback.setTestContextAttribute("CFS", CFS);
			// System.out.println(CFS);
		}
		// public void GetReportedLocationLabel(out String location)
		// {
		// String location1 = uIMapRecords.callEntry.uIReportedLocationLabel.getText();
		// location = location1.Replace(";PX", ""); //duplicate method called in 160982
		// test case id
		// }

		public void VerifyAtReportedLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReportedLocation"),
					uIMapRecords.callEntry.uIReportedLocationEdit.getAttribute("value"));
		}

		public void EnterAtReportedLocation1() {
			uIMapRecords.callEntry.uIReportedLocationEdit.clear();
			uIMapRecords.callEntry.uIReportedLocationEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReportedLocation1"));
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterAtReportedLocation2() {
			uIMapRecords.callEntry.uIReportedLocationEdit.clear();
			uIMapRecords.callEntry.uIReportedLocationEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReportedLocation2"));
			uIMapRecords.callEntry.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uIReportedLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void VerifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Location"),
					uIMapRecords.callEntry.uICallCompletionLocationEdit.getAttribute("value"));
		}

		public void enterAtLocation1() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location1"));
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterAtLocation2() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location2"));
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void GetReportedDateTime(String reportedDate, String ReportedTime) {
			reportedDate = uIMapRecords.callEntry.uIReportedDateEdit.getAttribute("value");
			Playback.setTestContextAttribute("reportedDate", reportedDate);
			ReportedTime = uIMapRecords.callEntry.uIReportedTimeEdit.getAttribute("value");
			Playback.setTestContextAttribute("ReportedTime", ReportedTime);
		}

		public void switchToSuspectsTab() {
			uIMapRecords.callEntry.uISuspectsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBESuspect");
		}

		public void verifyAtCallNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2),
					uIMapRecords.callEntry.uICallYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo").substring(3),
					uIMapRecords.callEntry.uICallNumberEdit.getAttribute("value"));

		}

		public void switchToMapTab() {
			uIMapRecords.callEntry.uIMapTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void SwithchtoDispositionTab() {
			uIMapRecords.callEntry.uIDispositionTab.click();
		}

		public void enterReceivedSourceAs9() {
			uIMapRecords.callEntry.uIReceivedSourceEdit.sendKeys("9");
			uIMapRecords.callEntry.uIReceivedSourceEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCallCompletionLocation() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.click();
			Playback.controlReadyThreadWait();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.DELETE);
			uIMapRecords.callEntry.uICallCompletionLocationEdit.click();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location"));
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void VerifyAtCallcompletionLocation() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.uICallCompletionLocationEdit.getAttribute("value")
			.contains(PoliceData.getRecordsModuleValue("Location")));
		}

		public void clickGenerateCheckbox() {
			uIMapRecords.callEntry.uIGenerateCheckbox.click();
			Playback.popupThreadWait();
		}

		public void switchToAttachmentTab() {
			uIMapRecords.callEntry.uIAttachmentsTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
			
		}

		public void switchToRequestTab() {

			uIMapRecords.callEntry.uIRequestTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmORDetails");
		}

		public void SelectCADDispositionAsI() {
			uIMapRecords.callEntry.uICADDispositionLookUpIcon.click();
			popup.kPICodedLookup.kPIHelpSelect("I");
		}

		public void enterAtPrimeUnit() {
			uIMapRecords.callEntry.uIPrimeUnitEdit.sendKeys(PoliceData.getRecordsModuleValue("PrimeUnit"));
			uIMapRecords.callEntry.uIPrimeUnitEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public String readCallNo() {
			String Year = uIMapRecords.callEntry.uICallYearEdit.getAttribute("value");
			String Call = uIMapRecords.callEntry.uICallNumberEdit.getAttribute("value");

			String CallNo = Year + "." + Call;
			return CallNo;
		}

		public String readCaseYear() {
			String caseYr = uIMapRecords.callEntry.uICaseYearEdit.getAttribute("value");
			return caseYr;
		}

		public String readCaseNo() {
			String year = uIMapRecords.callEntry.uICaseYearEdit.getAttribute("value");
			String caseNumber = uIMapRecords.callEntry.uICaseNumberEdit.getAttribute("value");
			String caseNo = year+"-"+caseNumber;
			return caseNo;
		}

		public void verifyCallEntrySummaryTabColourAsBlack() {

			String Black = "rgba(0, 0, 0, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.callEntry.uICallSummaryTab.getCssValue("color"), Black);
		}

		public void verifyCallEntrySummaryTabColourAsBlue() {
			String Blue = "rgba(0, 0, 255, 1)";

			verify.ExpectedPropertyValueIsEqual(uIMapRecords.callEntry.uICallSummaryTab.getCssValue("color"), Blue);
		}

		public void verifyRequestTabIsNotDisplayed() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsFalse(uIMapRecords.callEntry.uIRequestTab.isDisplayed());
		}

		public void swithchtoANCATab() {
			uIMapRecords.callEntry.uIANCATab.click();
			objectIdentification.windowHandle.switchToFrame("frmAnimalSrch");
			Playback.controlReadyThreadWait();

		}

		public void clickAddReportButton() {
			uIMapRecords.callEntry.callEntryEditTab.uIAddButton.click();
		}

		public void selectReportDueAsIncidentReport() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callEntryEditTab.uIReportDue, "Incident Report");
		}

		public void selectAtCallDispatcher() {
			uIMapRecords.callEntry.callEntryEditTab.UiDispatcherEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Dispatcher"));
		}

		public void selectAtCallTaker() {
			uIMapRecords.callEntry.callEntryEditTab.uICallTakerEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallTaker"));
		}

		public void verifyEditTabIsDisplayed() {
			uIMapRecords.callEntry.uIEditTab.isDisplayed();
		}

		public void verifyCallSummaryTabIsDisplayed() {
			uIMapRecords.callEntry.uICallSummaryTab.isDisplayed();
		}

		public void verifyDispositionTabIsDisplayed() {
			uIMapRecords.callEntry.uIDispositionTab.isDisplayed();
		}

		public void clickCallCompletionLocationCheckBox() {
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.click();
		}

		public void clickCADDispositionSearchButton() {
			uIMapRecords.callEntry.callEntryEditTab.uICADDispositionLookUpIcon.click();
		}

		public void verifyAtReportedLocation1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReportedLocation1"),
					uIMapRecords.callEntry.uIReportedLocationEdit.getAttribute("value"));
		}

		public void clearLocation() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
		}

		public void verifyLocationInfoIconIsDisplayed() {
			uIMapRecords.callEntry.uILocationInfoIcon.isDisplayed();
		}
		
		public void verifyReportedDateBindedToCurrentDate() {
			Playback.controlReadyThreadWait();
			String Date = uIMapRecords.callEntry.uIReportedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), Date);
		}


		public void verifyStackedDateBindedToCurrentDate() {
			Playback.controlReadyThreadWait();
			String Date = uIMapRecords.callEntry.uIStackedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), Date);
		}

		public void verifyFinishedDateBindedToCurrentDate() {
			Playback.controlReadyThreadWait();
			String Date = uIMapRecords.callEntry.uIFinishedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), Date);
		}


		public void verifyStakedTimeGraterThanReportedTime() {
			Playback.controlReadyThreadWait();
			String stackTime = uIMapRecords.callEntry.uIStackedTimeEdit.getAttribute("value");
			String reportTime = uIMapRecords.callEntry.uIReportedTimeEdit.getAttribute("value");
			
			if(Integer.parseInt(stackTime.substring(6, 8)) >Integer.parseInt(reportTime.substring(6, 8)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else if(Integer.parseInt(stackTime.substring(3, 5)) >Integer.parseInt(reportTime.substring(3, 5)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else
			{
				verify.ExpectedValueIsTrue(false);
			}
			
		}
		
		public void verifyFinishedTimeGreaterThanStackedTime() {
			Playback.controlReadyThreadWait();
			String FinishTime = uIMapRecords.callEntry.uIFinishedTimeEdit.getAttribute("value");
			String StckTime = uIMapRecords.callEntry.uIStackedTimeEdit.getAttribute("value");
			
			if(Integer.parseInt(FinishTime.substring(6, 8)) >Integer.parseInt(StckTime.substring(6, 8)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else if(Integer.parseInt(FinishTime.substring(3, 5)) >Integer.parseInt(StckTime.substring(3, 5)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else
			{
				verify.ExpectedValueIsTrue(false);
			}
		}


		public void verifyFinishedTimeGreaterThanReportedTime() {
			Playback.controlReadyThreadWait();
			String FinishTime = uIMapRecords.callEntry.uIFinishedTimeEdit.getAttribute("value");
			String reportTime = uIMapRecords.callEntry.uIReportedTimeEdit.getAttribute("value");
			
			if(Integer.parseInt(FinishTime.substring(6, 8)) >Integer.parseInt(reportTime.substring(6, 8)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else if(Integer.parseInt(FinishTime.substring(3, 5)) >Integer.parseInt(reportTime.substring(3, 5)))
			{
				verify.ExpectedValueIsTrue(true);
			}
			else
			{
				verify.ExpectedValueIsTrue(false);
			}
		}
		  public void VerifyAdditionSuccessfulMessage()
	        {
	            String UpdateMessage = uIMapRecords.callEntry.uILeftSideStatusBar.getText();
	            verify.ExpectedPropertyValueIsEqual(UpdateMessage,"1002 - Addition Successful");
	            Playback.wait(2000);
	        }


		public void verifyUpdatedSuccessfulStatusMessage() {
			 String UpdateMessage = uIMapRecords.callEntry.uILeftSideStatusBar.getText();
	            verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update successful"));
	            Playback.wait(2000);
		}

		public void verifyAtCommonName()
				 {
					 String text = uIMapRecords.callEntry.uIReportedLocationLabel.getText();
					 verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("CommonName")));
				 }
				 
				 public void verifyAtCommonName1()
				 {
					 String text = uIMapRecords.callEntry.uIReportedLocationLabel.getText();
					 verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("CommonName1")));
				 }

				 public void verifyDispositionTabEnabled() {
						
						verify.ExpectedValueIsTrue(uIMapRecords.callEntry.uIDispositionTab.isEnabled());
					} 

					public void verifyLegacyEventEnabled()
					{
						verify.ExpectedValueIsTrue(uIMapRecords.callEntry.uIEventLegacyComboBox.isEnabled());
					}

					public void verifyLegacyEventVisible()
					{
						verify.ExpectedValueIsTrue(uIMapRecords.callEntry.uIEventLegacyComboBox.isDisplayed());
					}

					public void clickEventLookupIcon()
					    {
					        uIMapRecords.callEntry.uIEventLookupIcon.click();
					        Playback.popupThreadWait();
					    }

					public void verifyAtEventDescription()
					{
					    uIMapRecords.callEntry.uIEventLookupIcon.click();
					    verify.ExpectedValueIsTrue(uIMapRecords.callEntry.uIEventDescEdit.getText().contains(PoliceData.getRecordsModuleValue("EventDescription")));
					    Playback.popupThreadWait();
					}

					public void clickEventBubbleIcon()
					{
					    uIMapRecords.callEntry.uIEventInfoIcon.click();
					    Playback.popupThreadWait();
					}

					public void Verify1051UpdateDataExistsNamesTabAcknowledgeMessage()
	                {
	                    popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Names Tab. You must save or reset.");
	                }

					public void verify1051UpdatedDataExistsAcknowledgeMessage() {
			            popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Tab. You must save or reset.");
			           
			        }

					public void Verify1051UpdateDataExistsRelatedCallsTabAcknowledgeMessage() {
						 popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Related calls Tab. You must save or reset.");
					}

					public void Verify1051UpdateDataExistsVehicleTabAcknowledgeMessage() {
						 popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Vehicle Tab. You must save or reset.");
					}

					
					public void verifyAttachmentTabIsNotBlueColor() 
                {
                    String Blue = "rgba(0, 0, 255, 1)";
                    verify.ExpectedPropertyValueIsNotEqual(uIMapRecords.callEntry.uIAttachmentsTab.getCssValue("color"), Blue);
                }

		public void verifySuspectTabIsBlueColor() {
			String Blue = "rgba(0, 0, 255, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.callEntry.uISuspectsTab.getCssValue("color"), Blue);
		}

					public void Verify1051UpdateDataExistsDispositionTabAckMsg() {
						popup.acknowledge
								.okWithExpectedMessage("(1051) Updated data exists in the Disposition Tab. You must save or reset.");
					}

					public void clickLocationInfoIcon() {
						uIMapRecords.callEntry.uILocationInfoIcon.click();
					}

						public void switchToApprovalTab() {
			uIMapRecords.callEntry.uIApprovalTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

						public void verifyApprovalTabNotDisplayed() {
						
						verify.ExpectedValueIsFalse(	objectIdentification.manualIdentify.controlExist(uIMapRecords.callEntry.uIApprovalTab));
							
						}

						public void verifyCallEntryEditTabColourAsBlue() {																	//Added by Abi
							String Blue = "rgba(0, 0, 255, 1)";
							verify.ExpectedPropertyValueIsEqual(uIMapRecords.callEntry.uIEditTab.getCssValue("color"), Blue);
						}

						public void clickCrashIcon() {																						//Added by Abi
							uIMapRecords.callEntry.uICrashIcon.click();	
						}

						public void verifyCrashIconColorChange() {
								verify.ExpectedValueIsTrue(
										uIMapRecords.caseUpdate.uICrashIcon.getAttribute("src").contains("car_crash1.png"));
						}

						public void VerifyCitationIconColorChange() {
							verify.ExpectedValueIsTrue(
									uIMapRecords.caseUpdate.uICitationIcon.getAttribute("src").contains("summons1.png"));
						}

						public String readReportedDate() {
							String reportedDate = uIMapRecords.callEntry.uIReportedDateEdit.getAttribute("value");
							return reportedDate;
						}

						public String readReportedTime() {
							String reportedtime = uIMapRecords.callEntry.uIReportedTimeEdit.getAttribute("value");
							return reportedtime;
						}

						public void verifyStackedDateAsCurrent() {
							String attribute = uIMapRecords.callEntry.uIStackedDateEdit.getAttribute("value");
							verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
						}

						public void verifyAtCADDisposition() {
							String attribute = uIMapRecords.callEntry.uICADDispositionEdit.getAttribute("value");
							verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("CADDisposition")));
						}

						public void verifyAtCADCFS() {
							String attribute = uIMapRecords.callEntry.uICADCFSEdit.getAttribute("value");
							verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("CADCFS")));

						}

						public void verifyNameTabColorAsBlue() {
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uINamesTab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyVehilceTabColorAsBlue() {
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIVehicleTab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}
						public String readReportedLocation() {
							String attribute = uIMapRecords.callEntry.uIReportedLocationEdit.getAttribute("value");
							return attribute;
						}

						public String readInitialCFSDescription() {
							String attribute = uIMapRecords.callEntry.uIInitialCFSDescriptionEdit.getAttribute("value");
							return attribute;
						}

						public void verifyRelatedCallsTabColorAsBlue() {
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIRelatedCallsTab.getCssValue("color");
							System.out.println(cssValue);
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifySuspectsTabColorAsBlue() {
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uISuspectsTab.getCssValue("color");
							System.out.println(cssValue);
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyRequestTabAsBlueColor()
						{
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIRequestTab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyUnitsTabAsBlueColor() 
						{
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIUnitsTab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyANCATabAsBlueColor()
						{
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIANCATab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyDispositionTabAsBlueColor() 
						{
							String Blue = "rgba(0, 0, 255, 1)";
							String cssValue = uIMapRecords.callEntry.uIDispositionTab.getCssValue("color");
							verify.ExpectedValueIsTrue(cssValue.contains(Blue));
						}

						public void verifyApprovalTabIsNotDisplayed() {
							// TODO Auto-generated method stub
							verify.ExpectedValueIsFalse(uIMapRecords.callEntry.uIApprovalTab.isDisplayed());
						}


	}

	public class CallEntryMainTab {
		public void MouseHoverOnNotesInNotesColumnInGrid(int rowIndex) {
			WebElement cell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryMainTab.uIMainTable, "Notes", rowIndex);
			Actions action = new Actions(Playback.driver);
			action.moveToElement(cell).perform();

		}

		public void VerifyMoverHoverMessageShowAsTestingApplication(int rowIndex) {
			WebElement cell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryMainTab.uIMainTable, "Notes", rowIndex);
			WebElement notes = cell.findElement(By.xpath("//td[contains(text(),'Testing Application')]"));
			verify.ExpectedPropertyValueIsEqual("Testing Application", notes.getText());
		}

		public void TabLocation() {
			uIMapRecords.callEntry.uICallCompletionLocationEdit.clear();
			uIMapRecords.callEntry.uICallCompletionLocationEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.uICallCompletionLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void verifyPrimeOfficerShowsInOfficer1Tab() {
			String primeUnit = uIMapRecords.callEntry.callEntryMainTab.uIOfficer1Edit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Officer1"), primeUnit);

		}

		public void verifyLoggedPrimeOfficerShowsInOfficer1Tab() {
			String primeUnit = uIMapRecords.callEntry.callEntryMainTab.uIOfficer1Edit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("LoggedOfficer"), primeUnit);

		}

		public void verifyAlarmNoByActiveData(String alarmNo)
	        {
	        	String attribute = uIMapRecords.callEntry.callEntryMainTab.uIAlarmNoEdit.getAttribute("value");
	        	verify.ExpectedValueIsTrue(attribute.contains(alarmNo));
	        }

		public void verifyZoneFieldPresent() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryMainTab.uITowZoneEdit.isDisplayed());
		}
		
		public void verifyZoneFieldDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.callEntry.callEntryMainTab.uITowZoneEdit.isEnabled());
			
			
		}
		public void verifyAtExactLocation() {
			String attribute = uIMapRecords.callEntry.callEntryMainTab.uIExactLocationEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("ExactLocation")));
		}

		public void verifyAtCADCFS() {
			String attribute = uIMapRecords.callEntry.callEntryMainTab.uICADCFSEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("CADCFS")));
		}

		public void verifyAtCADDisposition() {
			String attribute = uIMapRecords.callEntry.callEntryMainTab.uICADDispositionEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("CADDisposition")));
		}

		public void verifyAtStackedDateAsCurrentDate() {
			String attribute = uIMapRecords.callEntry.callEntryMainTab.uIStackedEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtFinishedDateAsCurrentDate() {
			String attribute = uIMapRecords.callEntry.callEntryMainTab.uIFinishedEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}
	}

	public class CallEntryNamesTab {

		public void EnterNameType() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.sendKeys("O");
		}

		public void EnterNameTypeID() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys("1566");
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void SelectActivity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox);
		}

		public void clickAddNameButton() {
			uIMapRecords.callEntry.callEntryNamesTab.uIAddNameButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickInternalSaveButton() {
			uIMapRecords.callEntry.callEntryNamesTab.uISaveNamesTabButton.click();
		}

		public void VerifyNamesTabValidation() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Names Tab. You must save or reset.");
		}

		public void enterAtNameID() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.click();
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void VerifyJnameDetailsRemoved() {
			verify.ExpectedPropertyValueIsEqual("",
					uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("",
					uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.getAttribute("value"));
		}

		public void VerifyAddressFieldRemoved() {
			verify.ExpectedPropertyValueIsEqual("",
					uIMapRecords.callEntry.callEntryNamesTab.uIAddressEdit.getAttribute("value"));
		}

		public void VerifyJuvinalNameConfirmMessage() {
			popup.confirm.noWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void enterAtLastName() {
			uIMapRecords.callEntry.callEntryNamesTab.uILastNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapRecords.callEntry.callEntryNamesTab.uIFirstNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
			uIMapRecords.callEntry.callEntryNamesTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity"));
		}

		public void selectActivityAsVictim() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox, "Victim");
		}

		public void selectActivityAsArrested() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox, "Arrested");
		}

		public void SelectActivityAsCaller() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox, "Caller");
		}

		public void VerifyAtActivityInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Activity", rowIndex));
		}
		public void VerifyAtActivity1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Activity", rowIndex));
		}

		public void VerifyAtLastNameFirstNameInGrid(int rowIndex) {
			String name =PoliceData.getRecordsModuleValue("LastName")+", "+PoliceData.getRecordsModuleValue("FirstName");
			verify.ExpectedPropertyValueIsEqual(name,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable,
	                "Name", rowIndex));
		}

		public void saveNamesTab() {
			uIMapRecords.callEntry.callEntryNamesTab.uISaveNamesTabButton.click();
			popup.confirm.yes();
		}

		public void enterAtNameID1() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.click();
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(2));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void SelectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable,
					PoliceData.getRecordsModuleValue("Name"));
		}

		public void SelectRowByAtName1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable,
					PoliceData.getRecordsModuleValue("Name1"));
		}

		public void ClickNameInfoIcon() {
			uIMapRecords.callEntry.callEntryNamesTab.uINamesInfoIcon.click();
		}

		public void VerifyAtActivity() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox));
		}

		public void enterNameID(String nameID) {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.click();
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.sendKeys(nameID.substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(nameID.substring(2));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtJNameID() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.click();
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("JNameID").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("JNameID").substring(2));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtJNameID1() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.click();
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("JNameID1").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("JNameID1").substring(2));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void selectAtActivity1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity1"));
		}

		public void verifyNameInfoIconAsRed() {
			String color = uIMapRecords.callEntry.callEntryNamesTab.uINamesInfoIcon.getAttribute("src");
			verify.ExpectedValueIsTrue(color.contains("Red"));
		}

		public void enterAtBNameID() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("BNameID").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("BNameID").substring(3));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.popupThreadWait();
		}

		public void verifyNameInfoIconAsYellow() {
			String color = uIMapRecords.callEntry.callEntryNamesTab.uINamesInfoIcon.getAttribute("src");
			verify.ExpectedValueIsTrue(color.contains("Yellow"));
		}

		public void selectAtActivity2() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity2"));
		}

		public void enterAtNameID2() {
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(0, 1));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(3));
			uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.popupThreadWait();
		}

		public void selectAtActivity3() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.callEntryNamesTab.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity3"));
		}

		public void selectNameFromHelpWindow() {
			names.nameSearchHelpWindow.SelectName();
			
		}
		public void verifyAtAddress()
		{
			String actualAddress  =uIMapRecords.callEntry.callEntryNamesTab.uIAddressEdit.getAttribute("value");
			 verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Address"), actualAddress);
		}
		public void verifyAtAddressNotContainsJurisAlias()
		{
		 String actualAddress  =uIMapRecords.callEntry.callEntryNamesTab.uIAddressEdit.getAttribute("value");
		verify.ExpectedValueIsFalse( actualAddress.contains(PoliceData.getRecordsModuleValue("JurisAlias")));
		 
		}

		public void verifyAtAddressContainsJurisAlias()
		{
			 String actualAddress  =uIMapRecords.callEntry.callEntryNamesTab.uIAddressEdit.getAttribute("value");
			 verify.ExpectedValueIsTrue( actualAddress.contains(PoliceData.getRecordsModuleValue("JurisAlias")));
		 
		}
		public void verifyUpdateModeEnabled() {
			String ButtonName =uIMapRecords.callEntry.callEntryNamesTab.uIAddNameButton.getAttribute("title");
			verify.ExpectedValueIsTrue(ButtonName.contains("Update"));
		}
		public void verifyUpdatedDataExistinNameTabAcknowledge() {
			popup.switchToAcknowledge();
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

			if (Playback.browserType.equalsIgnoreCase("Chrome")) {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1051) Updated data exists in the Tab. You must save or reset."));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1051) Updated data exists in the Tab. You must save or reset."));
				popup.acknowledge.ok();
			}
		}

		public void verifyUpdatedSuccessfulStatusMessage() {
			 String UpdateMessage = uIMapRecords.callEntry.callEntryNamesTab.uILeftSideStatusBar.getText();
		       verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", UpdateMessage);
		       Playback.wait(2000);
		}

		public void clickSaveNamesTab()
        {
            uIMapRecords.callEntry.callEntryNamesTab.uISaveNamesTabButton.click();
        }

		public void verifyNoDataPresentAcknowledgeMessage()
        {
            popup.acknowledge.okWithExpectedContainMessage("No data present");
        }

		public void verifyActivityAsVictimInGrid(int rowIndex) {
			String gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Activity", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(gridCell.contains("Victim"));
		}

		public void verifyActiveDOBInGrid(String birthDate) {
			String text = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, birthDate)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(birthDate));
		}

		public void verifyAtActivePhoneNo(String phoneNo, int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Phone#", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(phoneNo));
		}

		public void verifyAtAddressInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Address", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Address")));
		}

		public void selectGridRowByActivityAsVictim() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryNamesTab.uINamesTabGridTable, "Victim");

		}

		public void verifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("NameID").substring(0, 1),
					uIMapRecords.callEntry.callEntryNamesTab.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("NameID").substring(2),
					uIMapRecords.callEntry.callEntryNamesTab.uINameTypeIDEdit.getAttribute("value"));
		}

		public void verifyUpdatedDataExistsInTheTabAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Tab. You must save or reset.");

		}
	}

	public class NotesTab {

		public void EnterDateandTime() {
			uIMapRecords.callEntry.notesTab.uINotesDateEdit.click();
			uIMapRecords.callEntry.notesTab.uINotesTimeEdit.click();
		}

		public void TabOuttDateTime() {
			uIMapRecords.callEntry.notesTab.uINotesDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.callEntry.notesTab.uINotesTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectUnit() {
			uIMapRecords.callEntry.notesTab.uIUnitLookupButton.click();
			Playback.threadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterNotesComment() {
			uIMapRecords.callEntry.notesTab.uINotesCommentEdit.sendKeys("Call Entry Details are added");
		}

		public void EnterAtNotes() {
			uIMapRecords.callEntry.notesTab.uINotesCommentEdit.sendKeys(PoliceData.getRecordsModuleValue("Notes"));
		}

		public void EnterAtNotes1() {
			uIMapRecords.callEntry.notesTab.uINotesCommentEdit.clear();
			uIMapRecords.callEntry.notesTab.uINotesCommentEdit.sendKeys(PoliceData.getRecordsModuleValue("Notes1"));
		}

		public void ClickAddButton() {
			uIMapRecords.callEntry.notesTab.uIAddButton.click();
		}

		public void EnterUnit() {
			uIMapRecords.callEntry.notesTab.uIUnitEdit.sendKeys("PRMS");
		}

		public void ClickSaveNotesTabButton() {
			uIMapRecords.callEntry.notesTab.uISaveNotesTabButton.click();
		}

		public void InternalSave() {
			uIMapRecords.callEntry.notesTab.uISaveNotesTabButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtNotesDisappearsFromGrid() {

			verify.ExpectedValueIsFalse(uIMapRecords.callEntry.notesTab.uINotesTable.getText()
					.contains(PoliceData.getRecordsModuleValue("Notes")));

		}

		public void DeleteAtNotesTabRow() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapRecords.callEntry.notesTab.uINotesTable, PoliceData.getRecordsModuleValue("Notes"));
		}

		public void VerifyNotesTabValidation() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Notes Tab. You must save or reset.");
		}

		public void VerifyNotesTabAllFieldsDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapRecords.callEntry.notesTab.uISaveNotesTabButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					uIMapRecords.callEntry.notesTab.uINotesDateEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.callEntry.notesTab.uINotesTimeEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.callEntry.notesTab.uIUnitEdit.getAttribute("class").contains("textboxInactive"));
			// verify.ExpectedValueIsTrue(uIMapRecords.callEntry.notesTab.uIPFCodeEdit.getAttribute("class").contains("textboxInactive"));
			// //new enhancement
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.notesTab.uINotesCommentEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.callEntry.notesTab.uIAddButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.callEntry.notesTab.uIClearButton.getAttribute("disabled")));
		}

		public void Verify8EnterMandatoryDataAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void Verify4DoYouReallyWantToDeleteAckMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void VerifyAtPFInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PF"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.notesTab.uINotesTable,
							PoliceData.getRecordsModuleValue("PF"), "PF").getText());
		}

		public void VerifyAtNotesInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Notes"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.notesTab.uINotesTable,
							PoliceData.getRecordsModuleValue("Notes"), "Notes").getText());
		}

		public void VerifyAtNotes1InGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Notes1"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.notesTab.uINotesTable,
							PoliceData.getRecordsModuleValue("Notes1"), "Notes").getText());
		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapRecords.callEntry.notesTab.uINotesDateEdit.getAttribute("value"));
		}

		public void EnterAtPF() {
			uIMapRecords.callEntry.notesTab.uIPFCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("PF"));
			uIMapRecords.callEntry.notesTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAtPFInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.notesTab.uINotesTable, PoliceData.getRecordsModuleValue("PF"));
		}

		public void clickPFLookUpIcon() {
			// TODO Auto-generated method stub
			uIMapRecords.callEntry.notesTab.uIPFCodeLookup.click();
		}

		public void verifyDataExistsInTabAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedContainMessage("Updated data exists in the Tab. You must save or reset.");
		}

		public void verifyAtDateByUsingNotesInGrid() {
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.notesTab.uINotesTable,
					PoliceData.getRecordsModuleValue("Notes"), "Date").getText();
			verify.ExpectedValueIsTrue(text.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtNotes() {
			String attribute = uIMapRecords.callEntry.notesTab.uINotesCommentEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("Notes")));
		}

		public void verifyAtPF() {
			String attribute = uIMapRecords.callEntry.notesTab.uIPFCodeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("PF")));
		}

		public void verifyPFIBubbleIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.notesTab.uIPFIBubbleIcon.isDisplayed());

		}

		public void clickResetButton() {
			uIMapRecords.callEntry.notesTab.uIResetButton.click();

		}
	}

	public class CallSummaryTab {

		public void selectTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callSummaryTab.uITemplateNameComboBox);
		}
		public void selectFirstAvailableTemplate() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.callEntry.callSummaryTab.uITemplateNameComboBox,1);
		}

		public void clickLoadButton() {
			uIMapRecords.callEntry.callSummaryTab.uILoadButton.click();
		}

		public void clickSaveCallsummaryTab() {
			uIMapRecords.callEntry.callSummaryTab.uISaveCallSummaryTabButton.click();
		}
		public void saveCallsummaryTab() {
			uIMapRecords.callEntry.callSummaryTab.uISaveCallSummaryTabButton.click();
			popup.confirm.yes();
		}

		public void verifyCallSummaryTabValidation() {
			popup.acknowledge.okWithExpectedMessage(
					"(1051) Updated data exists in the Call Summary Tab. You must save or reset.");
		}
		public void verifySaveAndResetButtonsDisabled() {
		verify.ExpectedValueIsFalse(uIMapRecords.callEntry.callSummaryTab.uISaveCallSummaryTabButton.isEnabled());
				verify.ExpectedValueIsFalse(	uIMapRecords.callEntry.callSummaryTab.uIResetButton.isEnabled());
		}
		public void verifySaveAndResetButtonsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callSummaryTab.uISaveCallSummaryTabButton.isEnabled());
					verify.ExpectedValueIsTrue(	uIMapRecords.callEntry.callSummaryTab.uIResetButton.isEnabled());
			}
		
	
		public void verifyOnlySyatemAdminCanEditSummaryTabMessage() {
		String msg =	uIMapRecords.callEntry.callSummaryTab.uISummaryTabGreenMessage.getText();
		
		verify.ExpectedPropertyValueIsEqual(msg, "Only PF# 0 - System, Admin is authorized to edit the Call Summary");
			
		}

	}

	public class VehicleTab {

		public void enterAtVehicleNumber() {
			uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit.sendKeys(PoliceData.getRecordsModuleValue("VehicleNumber"));
		}

		public void GetVehicle(String vehicle) {
			vehicle = uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit.getAttribute("value");
			Playback.setTestContextAttribute("vehicle", vehicle);
		}

		public void enterAtState() {
			uIMapRecords.callEntry.vehicleTab.uIStateComboBox.sendKeys(PoliceData.getRecordsModuleValue("State"));
			uIMapRecords.callEntry.vehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.vehicleTab.uIActivityComboBox, PoliceData.getRecordsModuleValue("Activity"));
			uIMapRecords.callEntry.vehicleTab.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void SelectInsuranceCompany() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.callEntry.vehicleTab.uIInsuranceCompanyComboBox);
			uIMapRecords.callEntry.vehicleTab.uIInsuranceCompanyComboBox.sendKeys(Keys.TAB);
		}

		public void EnterOtherVehicleInformation() {
			uIMapRecords.callEntry.vehicleTab.uIOtherVehicleInformationEdit.sendKeys(Randomized.randomString(10));
		}

		public void clickAddButton() {
			uIMapRecords.callEntry.vehicleTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtActivityInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.vehicleTab.uIVehicleTable,
							PoliceData.getRecordsModuleValue("Activity")).getText());
		}

		public void InternalSave() {
			uIMapRecords.callEntry.vehicleTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void DeleteRowByAtActivity() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapRecords.callEntry.vehicleTab.uIVehicleTable, PoliceData.getRecordsModuleValue("Activity"));
			popup.confirm.yes();
		}
		public void verifyAccessDeniedAcknowledgeMessageFor2414() {
            popup.acknowledge.okWithExpectedContainMessage("Access denied for Screen ID 2414");
        }
		public void VerifyAddedVehicleRemovedFromGrid() {
			verify.ExpectedIntergerValueIsEqualToActual(0, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.callEntry.vehicleTab.uIVehicleTable));
		}

		public void verifyAtPlate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Plate", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("Plate")));
		}
		public void clickDeleteRowByAtActivity() {
            objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
                    uIMapRecords.callEntry.vehicleTab.uIVehicleTable, PoliceData.getRecordsModuleValue("Activity"));
        }
		public void ClickVehicleLookupIcon() {
			uIMapRecords.callEntry.vehicleTab.uIVehicleLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtSerialInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Serial"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Serial", rowIndex));
		}

		public void ClickAtActivityInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.vehicleTab.uIVehicleTable, PoliceData.getRecordsModuleValue("Activity"));
		}

		public void VerifyAtSerial1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Serial1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Serial", rowIndex));
		}

		public void SelectActivity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.callEntry.vehicleTab.uIActivityComboBox);
			uIMapRecords.callEntry.vehicleTab.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyProfileIconInGrid(int rowIndex) {
			WebElement uIProfileCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "P", rowIndex);
			WebElement uIAttachIMG = uIProfileCell.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(uIAttachIMG.getAttribute("src").contains("CitProfile"));
		}

		public void ClickNameInfoIcon() {
			uIMapRecords.callEntry.vehicleTab.uINameInfoIcon.click();
			Playback.waitForControlReady();
		}

		public void verifyRowCountIsZeroInGrid() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.callEntry.vehicleTab.uIVehicleTable);
			verify.ExpectedIntergerValueIsEqualToActual(rowsCount, 0);

		}

		public void enterAtVehicleNumber1() {
			uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit
					.sendKeys(PoliceData.getRecordsModuleValue("VehicleNumber1"));
			uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			uIMapRecords.callEntry.vehicleTab.uIStateComboBox.sendKeys(PoliceData.getRecordsModuleValue("State"));
			uIMapRecords.callEntry.vehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void verifyTowImageDisplayed() {
			WebElement Tow = objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, 0);

			String image = Tow.getAttribute("src");
			System.out.println(image);
			verify.ExpectedValueIsTrue(image.contains("Tow.Png"));
		}

		public void clickResetButton() {
			uIMapRecords.callEntry.vehicleTab.uIVehicleTabResetButton.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyTowRowIsEmptyInGrid() {
			String text = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Tow", 0);
			verify.ExpectedPropertyValueIsEqual(text, "");
		}

		public void clickTowCellInGrid() {
			WebElement Tow = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Tow", 0);
			Tow.click();
		}

		public void enterNCICField() {
			uIMapRecords.callEntry.vehicleTab.uINCICEdit.sendKeys("12345");
			uIMapRecords.callEntry.vehicleTab.uINCICEdit.sendKeys(Keys.TAB);
		}

		public void clickAtTowGridRow(int rowIndex) {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Tow", rowIndex).click();

		}

		public void verifyCountOfRowAs1() {
			Playback.controlReadyThreadWait();
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.callEntry.vehicleTab.uIVehicleTable);
			verify.ExpectedValueIsTrue(count == 1);
		}
		
		public void verifySerialIsNotEmptyInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsNotEqual("", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, "Serial", rowIndex));
		}

		public void selectAtState()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callEntry.vehicleTab.uIStateComboBox, PoliceData.getRecordsModuleValue("vehicleState"));
            uIMapRecords.callEntry.vehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
        }

		public void enterAtNameID()
        {
            uIMapRecords.callEntry.vehicleTab.uINameIDTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
            uIMapRecords.callEntry.vehicleTab.uINameIDTypeEdit.sendKeys(Keys.TAB);
            uIMapRecords.callEntry.vehicleTab.uINameIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
            uIMapRecords.callEntry.vehicleTab.uINameIDEdit.sendKeys(Keys.TAB);
        }

		public void clickVehicleTabSaveButton() {
            uIMapRecords.callEntry.vehicleTab.uIInternalSaveButton.click();
           
        }

		public void verify1051UpdatedDataExistsAcknowledgeMessage() {
            popup.acknowledge.okWithExpectedMessage("(1051)Updated data exists in the Tab. You must save or reset.");
           
        }
		public void verifyUpdatedDataExistsAcknowledgeMessage() {
            popup.acknowledge.okWithExpectedMessage("(1051)Updated data exists in the Tab. You must save or reset.");
           
        }
		public void verifyCustomLabel1IsDisplayed() {
			uIMapRecords.callEntry.vehicleTab.uICustomlabel1.isDisplayed();

		}

		public void verifyCustomLabel2IsDisplayed() {
			uIMapRecords.callEntry.vehicleTab.uICustomlabel2.isDisplayed();

		}

		public void clickcustom1Label() {
			uIMapRecords.callEntry.vehicleTab.uICustomlabel1.click();
		}

		public void verifyCustom1AsMandatory() {
			String Mandatory = uIMapRecords.callEntry.vehicleTab.uICustomlabel1.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(Mandatory, "rgba(153, 0, 0, 1)");

		}

		public void verifyCustom1IsEnbled() {
			uIMapRecords.callEntry.vehicleTab.uICustomEdit1.isEnabled();

		}

			public void verifyCustomFeildIsDisAbled() {
			String Disablefeild = uIMapRecords.callEntry.vehicleTab.uICustomEdit1.getAttribute("readonly");
			System.out.println(Disablefeild+"Vehicle Tab Disabled");
			verify.ExpectedPropertyValueIsEqual(Disablefeild,
					uIMapRecords.callEntry.vehicleTab.uICustomEdit1.getAttribute("readonly"));

		}

			public void enterAtNCICNo() {
				uIMapRecords.callEntry.vehicleTab.uINCICEdit.sendKeys(PoliceData.getRecordsModuleValue("NCICNo"));
				uIMapRecords.callEntry.vehicleTab.uINCICEdit.sendKeys(Keys.TAB);
			}

			public void verifyActiveMakeInGrid(String readMakeDescription) {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, readMakeDescription)
						.getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(readMakeDescription));

			}

			public void verifyActiveModelInGrid(String readModelDescription) {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, readModelDescription)
						.getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(readModelDescription));

			}

			public void verifyActiveSerial(String readVINNo) {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable, readVINNo).getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(readVINNo));
			}

			public void verifyAtNCICNoInGrid() {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable,
								PoliceData.getRecordsModuleValue("NCICNo"))
						.getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(PoliceData.getRecordsModuleValue("NCICNo")));
			}

			public void verifyAtInsurance() {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable,
								PoliceData.getRecordsModuleValue("Insurance"))
						.getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(PoliceData.getRecordsModuleValue("Insurance")));

			}

			public void verifyAtNameInGrid() {
				String gridRowByCellInnerText = objectIdentification.manualIdentify
						.getGridRowByCellInnerText(uIMapRecords.callEntry.vehicleTab.uIVehicleTable,
								PoliceData.getRecordsModuleValue("Name"))
						.getText();
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(PoliceData.getRecordsModuleValue("Name")));
			}

			public void verifyAtVehicleNo() {
				String attribute = uIMapRecords.callEntry.vehicleTab.uIPlateNoEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("VehicleNumber")));
			}

			public void verifyAtNCICNo() {
				String attribute = uIMapRecords.callEntry.vehicleTab.uINCICEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("NCICNo")));
			}

			public void verifyAtLastName() {
				String attribute = uIMapRecords.callEntry.vehicleTab.uILastNameEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("LastName")));
			}

			public void verifyAtFirstName() {
				String attribute = uIMapRecords.callEntry.vehicleTab.uIFirstNameEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("FirstName")));
			}

			public void verifyAtActivity() {
				String dropDownSelectedItem = objectIdentification.manualIdentify
						.getDropDownSelectedItem(uIMapRecords.callEntry.vehicleTab.uIActivityComboBox);
				verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getRecordsModuleValue("Activity")));
			}

			public void verifyActiveInsuranceCompany(String readInsuranceCompany) {
				String dropDownSelectedItem = objectIdentification.manualIdentify
						.getDropDownSelectedItem(uIMapRecords.callEntry.vehicleTab.uIInsuranceCompanyComboBox);
				verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(readInsuranceCompany));
			}


	}

	public class CallEntryUnitsTab {
		public void ClickEditButton() {
			uIMapRecords.callEntry.callEntryUnitsTab.uIEditButton.click();
		}

		public void ClickAtOfficer2InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable,
					PoliceData.getRecordsModuleValue("Officer2"));
			Playback.controlReadyThreadWait();
		}

		public void clickRefreshButton() 
		{
		uIMapRecords.caseUnits.uIResetButton.click();
			
		}

		public void verifyDateAndTimeAsCurrentDateInGrid(int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable, "Date & Time", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtUnitInGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable, PoliceData.getRecordsModuleValue("Unit")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Unit")));
		}
		
		public void verifyAtOfficer1InGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable, PoliceData.getRecordsModuleValue("Officer1")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Officer1")));
		}
		
		public void verifyCCAsDPInGrid(int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable, "CC", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("DP"));
		}
		
		public void verifyDispositionAsAACInGrid(int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable, "Dispo", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("AAC"));
		}
		
		public void verifyAtCommentsInGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUnits.uICaseUnitsGridTable, PoliceData.getRecordsModuleValue("Comments")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Comments")));
		}
		public List<String> readUnitGridEntry() {
			List<String> unitGridValues = objectIdentification.manualIdentify
					.getGridRowCellsValues(uIMapRecords.callEntry.callEntryUnitsTab.uIUnitsTabTable);
			System.out.println(unitGridValues);
			return unitGridValues;
		}
	}

	public class CallEntryRelatedCallsTab {
		public void EnterRelatedCallAtCallNo() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtRelatedCallNo() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCallNo").substring(0, 2));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCallNo").substring(3));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterRelatedCallAtInvalidCallNo() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("InvalidCallNo").substring(0, 2));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("InvalidCallNo").substring(3));
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyLocation(String location) {
			verify.ExpectedPropertyValueIsEqual(location,
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uILocationEdit.getAttribute("value"));
		}

		public void VerifyCFS(String CFS) {
			System.out.println(CFS);
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(CFS,
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uICFSEdit.getAttribute("value"));
		}

		public void VerifyMainCallAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(7048) The main call cannot be added as a related call");
		}

		public void VerifyNumberExistAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1040) Number Does Not Exist");
		}

		public void VerifyAtRelatedCallNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RelatedCallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable, "Call#", rowIndex));
		}

		public void ClickAddButton() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveInternalTab() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void DeleteAtRelatedCallNo() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
					PoliceData.getRecordsModuleValue("RelatedCallNo"));
			popup.confirm.yes();
		}

		public void VerifyRelatedCallRemovedFromGridRowCount() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable) == 0);
		}

		public void ClickResetButton() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIInternalRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickClearButton() {
			Playback.controlReadyThreadWait();
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIClearButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Location"),
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uILocationEdit.getAttribute("value"));
		}

		public void VerifyAtCFS() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uICFSEdit.getAttribute("value"));
		}

		public void EnterNotes() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uINotesEdit.sendKeys(Randomized.randomString(150));
		}

		public void EnterAtNotes() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uINotesEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Notes"));
		}

		public void VerifyAtNotesUsingRelatedCallNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Notes"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
									PoliceData.getRecordsModuleValue("RelatedCallNo"), "Notes")
							.getText());
		}

		public void VerifyAtLocationUsingRelatedCallNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Location"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
									PoliceData.getRecordsModuleValue("RelatedCallNo"), "Location")
							.getText());
		}
		
		public void clickAtRelatedCallNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
					PoliceData.getRecordsModuleValue("RelatedCallNo"));
		}
		
		public void selectRowByAtRelatedCallNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable, PoliceData.getRecordsModuleValue("RelatedCallNo"));
			
		}
		public void verifyUpdateModeEnabled() {
			String ButtonName =uIMapRecords.callEntry.callEntryRelatedCallsTab.uIAddButton.getAttribute("title");
			verify.ExpectedValueIsTrue(ButtonName.contains("Update"));
		}
		public void verifyUpdatedDataExistinRelatedCallsTabAcknowledge() {
			popup.switchToAcknowledge();
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

			if (Playback.browserType.equals("Chrome")) {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1051) Updated data exists in the Related Calls Tab. You must save or reset."));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1051) Updated data exists in the Related Calls Tab. You must save or reset."));
				popup.acknowledge.ok();
			}
		}
		public void verifyUpdatedSuccessfulStatusMessage() {
			 String UpdateMessage = uIMapRecords.callEntry.callEntryRelatedCallsTab.uILeftSideStatusBar.getText();
			 verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", UpdateMessage);
	            Playback.wait(2000);
		}
		
		public void clickSaveInternalTab()
        {
            uIMapRecords.callEntry.callEntryRelatedCallsTab.uIInternalSaveButton.click();
            
        }

		public void verifyUpdatedDataExistsAcknowledgeMessage() {
			 popup.acknowledge.okWithExpectedMessage("(1051)Updated data exists in the Related Calls Tab. You must save or reset.");
		}

		public void selectRowByIndex() {
			objectIdentification.manualIdentify
					.selectGridRowByIndex(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable, 0);

		}
		public void verifyNotValidCallNumberAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7047) Not a valid call number");

		}

		public void clickPoliceCheckBox() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIPoliceCheckBox.click();
		}

		public void verifyRelatedCallNoInfoIconIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallNoInfoIcon.isDisplayed());

		}

		public void clickRelatedCallNoInfoIcon() {
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallNoInfoIcon.click();
		}

		public void selectRowByAtNotes() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
					PoliceData.getRecordsModuleValue("Notes"));

		}

		public void verifyAtProductInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
					PoliceData.getRecordsModuleValue("Product"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getRecordsModuleValue("Product")));
		}

		public void verifyAtJurisInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
					PoliceData.getRecordsModuleValue("Juris"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getRecordsModuleValue("Juris")));
		}

		public void verifyActiveDateInGridByCallNo(String readReportedDate) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
							PoliceData.getRecordsModuleValue("CallNo"), "Date & Time")
					.getText();
			verify.ExpectedValueIsTrue(text.contains(readReportedDate));
		}

		public void verifyActiveLocationInGrid(String readReportedLocation) {
			String text = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
							readReportedLocation)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(readReportedLocation));
		}

		public void verifyActiveCFSInGridByCallNo(String readInitialCFSDescription) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIRelatedCallsTabTable,
							PoliceData.getRecordsModuleValue("CallNo"), "CFS")
					.getText();
			verify.ExpectedValueIsTrue(text.contains(readInitialCFSDescription));
		}

		public void verifyAtRelatedCallNo() {
			String attribute = uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallYearEdit.getAttribute("value");
			String attribute1 = uIMapRecords.callEntry.callEntryRelatedCallsTab.uICallNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2)));
			verify.ExpectedValueIsTrue(attribute1.contains(PoliceData.getRecordsModuleValue("CallNo").substring(3)));
		}

		public void verifyPoliceCheckBoxIsChecked() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryRelatedCallsTab.uIPoliceCheckBox.isSelected());
		}

		public void verifyActiveDateAndTime(String readReportedDate) {
			String attribute = uIMapRecords.callEntry.callEntryRelatedCallsTab.uIDateTimeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(readReportedDate));
		}

		public void verifyActiveLocation(String readReportedLocation) {
			String attribute = uIMapRecords.callEntry.callEntryRelatedCallsTab.uILocationEdit.getAttribute("title");
			verify.ExpectedValueIsTrue(attribute.contains(readReportedLocation));
		}

		public void verifyActiveCFS(String readInitialCFSDescription) {
			String attribute = uIMapRecords.callEntry.callEntryRelatedCallsTab.uICFSEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(readInitialCFSDescription));
		}

		public void verifyAtNotes() {
			String attribute = uIMapRecords.callEntry.callEntryRelatedCallsTab.uINotesEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("Notes")));
		}

		public void enterAtNotes() 
		{
			uIMapRecords.callEntry.callEntryRelatedCallsTab.uINotesEdit.sendKeys(PoliceData.getRecordsModuleValue("Notes"));
			
		}

	}

	public class CallEntrySuspectsTab {
		public void clickAddSuspects() {
			uIMapRecords.callEntry.callEntrySuspectsTab.uIAddSuspectButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickRefresh() {
			uIMapRecords.callEntry.callEntrySuspectsTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Name", rowIndex));
		}

		public void VerifyAtName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Name", rowIndex));
		}

		public void verifyAddedSuspectDisplayInGrid() {
			String innerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Name", 0);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"), innerText);

		}

		public void verifyRaceAsWInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "R", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains("W"));
		}

		public void verifySexAsMInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "S", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains("M"));
		}

		public void verifyAtAgeInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Age", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Age")));
		}

		public void verifyAtHeightInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Ht", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Height")));
		}

		public void verifyAtWeightInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Wt", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Weight")));
		}

		public void verifyEyesAsBlueInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Eyes", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains("BLU"));
		}

		public void verifyHairAsBlackInGrid(int rowIndex) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callEntry.callEntrySuspectsTab.uISuspectTabTable, "Hair", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(text.contains("BLK"));
		}

	}

	public class CallEntryMapTab {
		public void VerifyLatLongValue() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("LatLongValue"),
					uIMapRecords.callEntry.callEntryMapTab.uILatLongValueTextView.getText());
		}

		public void ClickReset() {
			uIMapRecords.callEntry.callEntryMapTab.uIResetButton.click();
			Playback.gridLoadThreadWait();
		}

		public void clickUpdateLatLongButton() {
			uIMapRecords.callEntry.callEntryMapTab.uIUpdateLatLongButton.click();
		}

		public void VerifyYesMasterGeoOverWriteConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.yesWithExpectedMessage(
						"(5115) Master Geo already has Lat/Long. Do you want to overwrite?");

			}
		}

		public void VerifyNoMasterGeoOverWriteConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm
						.noWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm
						.noWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");

			}
		}

		public void verifyYesUpdateLatLongConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude to  41.8470427  /  -87.78467189999999  ?");
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.yesWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude to  41.8470427  /  -87.78467189999999  ?");

			}
		}

		public void verifyNoUpdateLatLongConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.noWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude to  41.8470427  /  -87.78467189999999  ?");
			}
				else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.noWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude to  41.8470427  /  -87.78467189999999  ?");

			}

		}

		public void dragAndDropPointerInMap() {
			
			Playback.actionDriver.moveByOffset(572, 224);
			Playback.actionDriver.clickAndHold();
			Playback.actionDriver.moveByOffset(340, 224);
		}

	}

	public class CallEntryRequestTab {
		public void verifyAtRequestedByInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RequestedBy"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Requested By",
							rowIndex));
		}

		public void clickAddNew() {
			uIMapRecords.callEntry.callEntryRequestTab.uIAddNewButton.click();
		}

		public void verifyActiveRequestNoInGrid(String readRequestNo, int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Request#", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(readRequestNo));
		}

		public void verifyActiveReceivedDateInGrid(String readReceivedDate, int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Rcv'd Date/Time", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(readReceivedDate));
		}

		public void verifyAtStatusInGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, PoliceData.getRecordsModuleValue("Status")).getText();		
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Status")));
		}

		public void verifyReceivedDateAsCurrentDateInGrid(int rowIndex) 
		{
			String currentDate = Randomized.getCurrentDate("MM/DD/YY");
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Rcv\'d Date/Time", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(currentDate));
		}

		public void verifyDueOrClosedDateAs3DaysFutureDate(int rowIndex) 
		{
			String futureDate = Randomized.getFutureDate(3, "MM/DD/YY");
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Due/Closed Date", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(futureDate));
		}
		
		public void verifyDueOrClosedDateAsGreenColorInGrid(int rowIndex)
		{
	       // green rgba(0, 128, 0, 1)
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, "Due/Closed Date", rowIndex).getCssValue("color");
			System.out.println(text);
			verify.ExpectedValueIsTrue(text.contains("rgba(0, 128, 0, 1)"));
		}

		public void verifyAtAssignedToInGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, PoliceData.getRecordsModuleValue("AssignedTo")).getText();		
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("AssignedTo")));
		}

		public void verifyAtRequestDetails() 
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryRequestTab.uIRequestTabResultTable, PoliceData.getRecordsModuleValue("RequestDetails")).getText();		
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("RequestDetails")));
		}

	}

	public class CallEntryEditTab {

		public void verifyCADDispositionIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryEditTab.uICADDispositionEdit.isEnabled());
		}

		public void verifyReportDueIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryEditTab.uIReportDue.isEnabled());
		}

		public void verifyAllOtherFieldsAreInReadOnlyMode() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uILocationEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uICallTakerEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.UiDispatcherEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uICADCFSEdit.getAttribute("readonly"), "true");

		}

		public void enterAtCADDisposition() {
			uIMapRecords.callEntry.callEntryEditTab.uICADDispositionEdit.clear();
			Playback.gridLoadThreadWait();
			uIMapRecords.callEntry.callEntryEditTab.uICADDispositionEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CADDisposition"));
			Playback.gridLoadThreadWait();
			uIMapRecords.callEntry.callEntryEditTab.uICADDispositionEdit.sendKeys(Keys.TAB);
		}

		public void selectAtReportDue() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.callEntry.callEntryEditTab.uIReportDue, PoliceData.getRecordsModuleValue("ReportDue"));
		}

		public void verifyAllOtherTabsAreINReadOnlyMode() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uILocationEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uICallTakerEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.UiDispatcherEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uICADCFSEdit.getAttribute("readonly"), "true");

		}

		public void verifyPrimeUnitIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryEditTab.uIPrimeUnitEdit.isEnabled());
		}

		public void verifyLocationIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryEditTab.uILocationEdit.isEnabled());
		}
		public void verifyCADCFSIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryEditTab.uICADCFSEdit.isEnabled());
		}

		public void verifyOtherFieldsAreInReadOnlyMode() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.uICallTakerEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.callEntry.callEntryEditTab.UiDispatcherEdit.getAttribute("readonly"), "true");
			Playback.gridLoadThreadWait();		

		}
	}

	public class CallEntryANCATab {
		public void clickAddnew() {
			uIMapRecords.callEntry.callEntryANCATab.uIAddnewButton.click();
		}

		public void clickRefresh() {
			uIMapRecords.callEntry.callEntryANCATab.uIRefreshButton.click();
		}

		public void clickPrintIcon() {
			uIMapRecords.callEntry.callEntryANCATab.uIPrintIcon.click();
		}

		public void clickExcelIcon() {
			uIMapRecords.callEntry.callEntryANCATab.uIExcelIcon.click();
		}

		public void verifyDisplayedIcons() {
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryANCATab.uIAddnewButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryANCATab.uIRefreshButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryANCATab.uIPrintIcon.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryANCATab.uIExcelIcon.isDisplayed());
		}

		public void verifyActiveACENoInGrid(String readACENo)
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, readACENo).getText();
			verify.ExpectedValueIsTrue(text.contains(readACENo));
			}
		
		public void verifyAtLocationInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, "Location", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Location")));
			}
		
		public void verifyAtComplaintTypeInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, "Complaint Type", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("ComplaintType")));
			}

		public void verifyOfficerAsAutomationInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, "Officer", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("Prophoenix, Automation"));
			}
		
		public void verifyReportedDateAsCurrentDateInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, "Reported Date", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(Randomized.getCurrentDate("MM/DD/YY")));
		}
		
		public void verifyCFSAsTheftInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, "CFS", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("1 - Theft"));
		}

		public void selectAtComplaintTypeInGrid() 
		{
			 objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.callEntry.callEntryANCATab.uIANCATable, PoliceData.getRecordsModuleValue("ComplaintType"));
		}
	}

	public class CallEntryDispositionTab {

		public void clickDispositionSearchButton() {
			uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionSearchButton.click();
		}

		public void clickAddButton() {
			uIMapRecords.callEntry.callEntryDispositionTab.uIAddButton.click();
		}

		public void enterAtDisposition() {
			uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Disposition"));
			uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtDispositionInGrid()
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionResultTable, PoliceData.getRecordsModuleValue("Disposition")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Disposition")));
		}
		
		public void verifyAtDescriptionInGrid()
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionResultTable, PoliceData.getRecordsModuleValue("Description")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Description")));
		}

		public void selectRowByAtDisposition() 
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionResultTable, PoliceData.getRecordsModuleValue("Disposition"));
			
		}

		public void verifyAtDisposition()
		{
			String attribute = uIMapRecords.callEntry.callEntryDispositionTab.uIDispositionCodeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getRecordsModuleValue("Disposition")));
		}
	}
	
	public class CallEntryApprovalTab {
	public void selectNewActionAsSendForApproval() {
		objectIdentification.manualIdentify
				.selectDropDownOption(uIMapRecords.callEntry.callEntryApprovalTab.uINewActionDropdown, "Send For Approval");
	}

	public void tabDateAndTime() {
		uIMapRecords.callEntry.callEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);

	}

	public void saveInApprovalTab() {
		uIMapRecords.callEntry.callEntryApprovalTab.uISaveApprovalTab.click();
		if (Playback.browserType.contains("Chrome")) {
			popup.confirm.yes();
		} else {
			popup.switchToConfirm();
			Playback.gridLoadThreadWait();
			popup.confirm.yes();

		}
	}

	public void selectNewActionAsApprove() {
		objectIdentification.manualIdentify
				.selectDropDownOption(uIMapRecords.callEntry.callEntryApprovalTab.uINewActionDropdown, "Approve");
	}

	public void verifyAllTheFieldsDisabled() {
	verify.ExpectedValueIsFalse(uIMapRecords.callEntry.callEntryApprovalTab.uISaveApprovalTab.isEnabled());
	verify.ExpectedValueIsFalse(uIMapRecords.callEntry.callEntryApprovalTab.uINewActionDropdown.isEnabled());
		
	}
	public void verifyAllTheFieldsEnabled() {
		verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryApprovalTab.uISaveApprovalTab.isEnabled());
		verify.ExpectedValueIsTrue(uIMapRecords.callEntry.callEntryApprovalTab.uINewActionDropdown.isEnabled());
			
		}
	public void verifyAtByOfficer()
	{
		verify.ExpectedPropertyValueIsEqual(uIMapRecords.callEntry.callEntryApprovalTab.uIByOfficerCode.getAttribute("value"),
				PoliceData.getRecordsModuleValue("LoginOfficer"));
	}
	}

	public class CallSearch {
		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uIJurisDropdown,
					PoliceData.getRecordsModuleValue("Juris"));
		}

		public void selectAtJuris1() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uIJurisDropdown,
					PoliceData.getRecordsModuleValue("Juris1"));
		}

		public void selectJurisAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uIJurisDropdown, "--");
		}

		public void clickSearchButton() {
			uIMapRecords.callSearch.uISearchButton.click();
			Playback.waitForControlReady();
		}

		public void ClickResetButton() {
			Playback.waitForControlReady();
			uIMapRecords.callSearch.uIResetButton.click();
			Playback.waitForControlReady();
		}

		public void ClickDateResetButton() {
			uIMapRecords.callSearch.uIDateResetButton.click();
			Playback.waitForControlReady();
		}

		public void BackButton() {
			uIMapRecords.callSearch.uIBackButton.click();
			Playback.waitForControlReady();
		}

		public void ClickPrintButton() {
			Playback.waitForControlReady();
			uIMapRecords.callSearch.uIPrintButton.click();
			Playback.waitForControlReady();
		}

		public void ClickRefreshButton() {
			uIMapRecords.callSearch.uIRefreshButton.click();
			Playback.waitForControlReady();
		}

		public void ClickShowMapButton() {
			uIMapRecords.callSearch.uIShowMapButton.click();
			Playback.waitForControlReady();
		}

		public void ClickNextButton() {
			uIMapRecords.callSearch.uINextButton.click();
		}

		public void ClickPreviousButton() {
			uIMapRecords.callSearch.uIPreviousButton.click();
		}

		public void clickBackButton() {
			uIMapRecords.callSearch.uIBackButton.click();
			Playback.waitForControlReady();
		}

		public void AddNewButton() {
			uIMapRecords.callSearch.uIAddNewButton.click();

		}

		public void EnterCallYear(String CallYear) {
			uIMapRecords.callSearch.uICallYearEdit.sendKeys(CallYear);
		}

		public void EnterCallNumber(String CallNumber) {
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(CallNumber);
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterNumberControlCallNo() {
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(String.valueOf(Randomized.getRandomNumber()));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(Keys.ENTER);
		}

		public void GetCFSCode() {
			objectIdentification.manualIdentify.getGridCell("grdCBE", "CFS");
		}

		// public void GetCaseDetails(out String CaseYear, out String CaseNumber)
		// {
		// //Browser.NavigateToRecordsModule();
		// uIMapRecords.caseSearch.uISearchButton.click();
		// //objectIdentification.randomIdentify.SelectRandomRow(driver, "grdCBE");
		// objectIdentification.randomIdentify.SelectRandomGirdRow("grdCBE");
		// //CaseYear = uIMapRecords.caseSearch.uICaseYearEdit.getAttribute("Value");
		// //CaseNumber =
		// uIMapRecords.caseSearch.uICaseNumberEdit.getAttribute("Value");
		// //uIMapRecords.caseSearch.uISaveCloseButton.click();

		// }

		public void VerificationCFS() {
			WebElement CFSCell = objectIdentification.manualIdentify.getGridCell("grdCBE",
					PoliceData.getRecordsModuleValue("InitialCFS").toString());
			Assert.assertEquals(CFSCell.getText(), PoliceData.getRecordsModuleValue("InitialCFS").toString());

		}

		public void VerifyCallNumberInGrid(String callNumber) {
			verify.ExpectedPropertyValueIsEqual(callNumber, objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callSearch.uICallSearchTable, callNumber).getText());
		}

		public void VerifyReportedLocationInGrid(String callNumber, String ReportedLocation) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, callNumber);
			verify.ExpectedPropertyValueIsEqual(ReportedLocation, objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "Location").getText());

		}

		public void VerifyAtInitialCFSInGrid(String callNumber) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, callNumber);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("InitialCFS"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "Location").getText());

		}

		public void VerifyAtCADDispositionInGrid(String callNumber) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, callNumber);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CadDisposition"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "Location").getText());

		}

		public void VerifyCallNumberInGrid(String callNumber, String CallYear) {
			verify.ExpectedPropertyValueIsEqual(CallYear + "." + callNumber, objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callSearch.uICallSearchTable, CallYear + "." + callNumber).getText());
		}

		public void VerifyReportedLocationInGrid(String callNumber, String ReportedLocation, String CallYear) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, CallYear + "." + callNumber);
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "Location").getText()
					.contains(ReportedLocation));

		}

		public void VerifyAtInitialCFSInGrid(String callNumber, String CallYear) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, CallYear + "." + callNumber);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("InitialCFS"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "CFS").getText());

		}

		public void VerifyAtCADDispositionInGrid(String callNumber, String CallYear) {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, CallYear + "." + callNumber);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CadDisposition"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callSearch.uICallSearchTable, row, "Disposition").getText());

		}

		public void enterAtCallNo() {
			uIMapRecords.callSearch.uICallYearEdit.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(Keys.TAB);

		}

		public void VerifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}
 
		public void VerifyGreenTickinMapColumn(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "Map", rowIndex).toString()
					.contains("✓"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.callSearch.uICallSearchTable, "Map", rowIndex).getAttribute("class")
					.contains("GreencolorMap"));
		}

		public void SelectLocationAsAddress() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uILocationComboBox,
					"Address");
			uIMapRecords.callSearch.uILocationComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtPremise() {
			uIMapRecords.callSearch.uIPremiseEdit.sendKeys(PoliceData.getRecordsModuleValue("Premise"));
		}

		public void EnterAtStreet() {
			uIMapRecords.callSearch.uIStreetNameEdit.sendKeys(PoliceData.getRecordsModuleValue("Street"));
		}

		public void EnterAtApartment() {
			uIMapRecords.callSearch.uIApartmentEdit.click();
			uIMapRecords.callSearch.uIApartmentEdit.sendKeys(PoliceData.getRecordsModuleValue("Apt"));

		}

		public void SelectRowByAtLocationByUsingAtCall() {
			Playback.pageLoadThreadWait();
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.callSearch.uICallSearchTable, PoliceData.getRecordsModuleValue("CallNo"));
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(row,
					PoliceData.getRecordsModuleValue("Location"));
		}

		public void SelectRowInGrid(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.callSearch.uICallSearchTable, rowIndex);
			row.click();
		}

		public void VerifyGirdRowIsInActiveStatus(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.callSearch.uICallSearchTable, rowIndex);
			verify.ExpectedValueIsTrue(row.getAttribute("class").contains("ActiveRow"));
		}

		public void EnterCurrentDateTime() {
			uIMapRecords.callSearch.uIFromDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapRecords.callSearch.uIFromTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterAtReceivedSource() {
			uIMapRecords.callSearch.uIReceivedSourceCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReceivedSource"));
			uIMapRecords.callSearch.uIReceivedSourceCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterFromDateAs06012015() {
			uIMapRecords.callSearch.uIFromDateEdit.sendKeys("06/01/2015");
		}

		public void EnterToDateAsCurrentDate() {
			uIMapRecords.callSearch.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void clickSelectedCheckbox() {
			if (!uIMapRecords.callSearch.uISelectedCheckbox.isSelected()) {
				uIMapRecords.callSearch.uISelectedCheckbox.click();
			}
		}

		public void SelectThreeRandomRecordsInGrid() {
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapRecords.callSearch.uICallSearchTable);
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapRecords.callSearch.uICallSearchTable);
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapRecords.callSearch.uICallSearchTable);
		}

		public void selectRandomGridRow() {
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapRecords.callSearch.uICallSearchTable);
		}

		public void verifyCheckboxEnabledInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.randomIdentify
					.getRandomGridRowCheckbox(uIMapRecords.callSearch.uICallSearchTable).isEnabled());
		}

		public void VerifySelectedCountAs3() {
			verify.ExpectedPropertyValueIsEqual("3",
					uIMapRecords.callSearch.uISelectedReportsCount.getAttribute("value"));
		}

		public void VerifySelectedCountAs0() {
			verify.ExpectedPropertyValueIsEqual("0",
					uIMapRecords.callSearch.uISelectedReportsCount.getAttribute("value"));
		}

		public void VerifySelectedCountAs6() {
			verify.ExpectedPropertyValueIsEqual("6",
					uIMapRecords.callSearch.uISelectedReportsCount.getAttribute("value"));
		}

		public void ClickPrintIcon() {
			uIMapRecords.callSearch.uIPrintIconButton.click();
		}

		public void RemoveFromDate() {
			uIMapRecords.callSearch.uIFromDateEdit.click();
			uIMapRecords.callSearch.uIFromDateEdit.clear();
		}

		public void VerifyAddresscontainsJurisAndCSZInTheAddressColumn() {

			String address = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callSearch.uICallSearchTable,
					PoliceData.getRecordsModuleValue("CallNumber"), "Location").getText();
			String[] addressDetails = address.split(";");
			String regExp = "^[A-Z]{2},\\s[\\w\\s]+,\\s[A-Z]{2},\\s[0-9]{5}$";
			verify.ExpectedValueIsTrue(Pattern.matches(addressDetails[1], regExp), "Address Fromat Wrong");

		}

		public void EnterAtStreet1() {
			uIMapRecords.callSearch.uIStreet1Edit.sendKeys(PoliceData.getRecordsModuleValue("Street1"));
			uIMapRecords.callSearch.uIStreet1Edit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectLocationAsIntersection() {
			
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uILocationComboBox,"Intersection");
			uIMapRecords.callSearch.uILocationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectLocationAsCommonName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uILocationComboBox,"Common Name");
			uIMapRecords.callSearch.uILocationComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtFromCFSRange() {
			uIMapRecords.callSearch.uICFSRangeFromcodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange"));
			uIMapRecords.callSearch.uICFSRangeFromcodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtToCFSRange() {
			uIMapRecords.callSearch.uICFSRangeToCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("ToCFSRange"));
			uIMapRecords.callSearch.uICFSRangeToCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtFromCFSRange1() {
			uIMapRecords.callSearch.uICFSRangeFromcodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange1"));
			uIMapRecords.callSearch.uICFSRangeFromcodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtToCFSRange1() {
			uIMapRecords.callSearch.uICFSRangeToCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("ToCFSRange1"));
			uIMapRecords.callSearch.uICFSRangeToCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyToCFSRangeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.callSearch.uICFSRangeToCodeEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uICFSRangeDescriptionToEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyFromCFSRangeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.callSearch.uICFSRangeFromcodeEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uICFSRangeFromDescriptionEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyToCFSRangeEditable() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.callSearch.uICFSRangeToCodeEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uICFSRangeDescriptionToEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyFromCFSRangeEditable() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.callSearch.uICFSRangeFromcodeEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uICFSRangeFromDescriptionEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void EnterFromDateAsCurrentDate() {
			uIMapRecords.callSearch.uIFromDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void VerifyAtCallNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable,
							"Call#", rowIndex));
		}

		public void VerifyAtLocationInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "Location", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("Location")));
		}

		public void VerifyAtCallNo1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo1"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable,
							"Call#", rowIndex));
		}

		public void VerifyAtLocation1InGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "Location", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("Location1")));
		}

		public void VerifyAtCallNo2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo2"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable,
							"Call#", rowIndex));
		}

		public void VerifyAtLocation2InGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "Location", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("Location2")));
		}

		public void EnterAtStreet2() {
			uIMapRecords.callSearch.uIStreet2Edit.sendKeys(PoliceData.getRecordsModuleValue("Street2"));
			uIMapRecords.callSearch.uIStreet2Edit.sendKeys(Keys.TAB);
		}

		public void EnterAtCommonName() {
			uIMapRecords.callSearch.uICommonNameEdit.sendKeys(PoliceData.getRecordsModuleValue("CommonName"));
		}

		public void EnterAtCADDisposition() {
			uIMapRecords.callSearch.uICADDispositionCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CADDisposition"));
			uIMapRecords.callSearch.uICADDispositionCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOfficer() {
			uIMapRecords.callSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
			uIMapRecords.callSearch.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAtCallNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable,
					PoliceData.getRecordsModuleValue("CallNo"));
			Playback.controlReadyThreadWait();
		}

		public void EnterAtCallNo1() {
			uIMapRecords.callSearch.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo1").substring(0, 2));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CallNo1").substring(3));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(Keys.TAB);

		}

		public void EnterAtCivilDistrict() {
			uIMapRecords.callSearch.uICivilDistrictCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("CivilDistrict"));
			uIMapRecords.callSearch.uICivilDistrictCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtLocation() {
			uIMapRecords.callSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location"));
		}

		public void ClickLocationVerifyCheckbox() {
			uIMapRecords.callSearch.uILocationVerifyCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtLocationByAtCallNo() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.callSearch.uICallSearchTable,
									PoliceData.getRecordsModuleValue("CallNo"), "Location")
							.getText().contains(PoliceData.getRecordsModuleValue("Location")));
		}

		public void verifyVinFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uIVinNoEdit.isDisplayed());
		}

		public void enterAtVinNo() {
			uIMapRecords.callSearch.uIVinNoEdit.click();
			uIMapRecords.callSearch.uIVinNoEdit.sendKeys(PoliceData.getRecordsModuleValue("VinNo"));
		}

		public void verifyCallCheckBoxesDisplayed(int rowIndex) {
			WebElement ele = objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapRecords.callSearch.uICallSearchTable, rowIndex);
			verify.ExpectedValueIsTrue(ele.isDisplayed());
		}

		public ArrayList<String> selectCallCheckBoxesAndReadCallNo(int count) {
			ArrayList<String> CallNos = new ArrayList<>();

			for (int i = 1; i <= count; i++) {
				Playback.threadWait(600);
				objectIdentification.manualIdentify
						.selectGridRowCheckBoxByIndex(uIMapRecords.callSearch.uICallSearchTable, i);

				CallNos.add(objectIdentification.manualIdentify
						.getGridCellInnerTextByText(uIMapRecords.callSearch.uICallSearchTable, "Call#", i - 1));

			}

			for (String callno : CallNos) {
				System.out.println(callno);
			}
			return CallNos;
		}

		public void enterCallNoByActiveData(String CallNo) {
			uIMapRecords.callSearch.uICallYearEdit.sendKeys(CallNo.substring(0, 2));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(CallNo.substring(3));
			uIMapRecords.callSearch.uICallNumberEdit.sendKeys(Keys.TAB);

			Playback.controlReadyThreadWait();
		}

		public void selectRowByActiveCallNo(String CallNo) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable,
					CallNo);

		}
		
		public void enterAtTracking() {
			uIMapRecords.callSearch.uITrackingEdit.sendKeys(PoliceData.getRecordsModuleValue("TrackingNo"));
			uIMapRecords.callSearch.uITrackingEdit.sendKeys(Keys.TAB);
		}

		public void verifyRowCountIsNotZero() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.callSearch.uICallSearchTable);
			verify.ExpectedIntergerValueIsNotEqualToActual(rowsCount, 0);
		}
		 public void EnterAtStreetName()
	        {
	            uIMapRecords.callSearch.uIStreetNameEdit.sendKeys(PoliceData.getRecordsModuleValue("StreetName"));
	        }
		 
		 public void reloadCallSearch() {
				objectIdentification.manualIdentify.reloadScreen("Call Search");
				
			}
			public void verifyRecordsListedInGrid() {
			 verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.callSearch.uICallSearchTable)>0);
				
			}
			public void EnterAtInvalidStreetName() {
				uIMapRecords.callSearch.uIStreetNameEdit.sendKeys(PoliceData.getRecordsModuleValue("InvalidStreetName"));
				
			}

			public void EnterAtInvalidStreet1() {
				uIMapRecords.callSearch.uIStreet1Edit.sendKeys(PoliceData.getRecordsModuleValue("InvalidStreet1"));
				
			}

			public void EnterAtInvalidCommonName() {
				uIMapRecords.callSearch.uICommonNameEdit.sendKeys(PoliceData.getRecordsModuleValue("InvalidCommonName"));
				
			}

			public void verifyAddressInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uIAddressInfoIconButton.isDisplayed());	
				
			}

			public void EnterAtInvalidLocations(int locNo) {
				if(locNo==0)
				{
				uIMapRecords.callSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("InvalidLocation"));
				  uIMapRecords.callSearch.uILocationEdit.sendKeys(Keys.TAB);
		            Playback.controlReadyThreadWait();
				}
		            else {
		            	uIMapRecords.callSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("InvalidLocation"+locNo+""));
				  uIMapRecords.callSearch.uILocationEdit.sendKeys(Keys.TAB);
		            Playback.controlReadyThreadWait();
		            }
			}

			public void verifyInvalidAddressAcknowledge() {
				  if (Playback.browserType.equals("Chrome"))
		            {
		                popup.acknowledge.okWithExpectedMessage("(5024) Invalid address");
		            }
		            else
		                popup.acknowledge.okWithExpectedMessage(" (5024) Invalid address");
			}

			public void EnterAtLocationCommonName() {
				uIMapRecords.callSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("CommonName"));
				  uIMapRecords.callSearch.uILocationEdit.sendKeys(Keys.TAB);
		            Playback.controlReadyThreadWait();
			}
			public void EnterAtLocationIntersection() {
				uIMapRecords.callSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Intersection"));
				  uIMapRecords.callSearch.uILocationEdit.sendKeys(Keys.TAB);
		            Playback.controlReadyThreadWait();
			}
			public void verifyStreet2Disabled() {
				verify.ExpectedValueIsFalse(uIMapRecords.callSearch.uIStreet2Edit.isEnabled());
				
			}

			public void verifyFromDateAsPreviousDate()
			{
				String attribute = uIMapRecords.callSearch.uIFromDateEdit.getAttribute("value");
				System.out.println(attribute);
				String previousDate = Randomized.getPreviousDate(15, "MM/dd/yyyy");
				System.out.println(previousDate);
				verify.ExpectedValueIsTrue(attribute.contains(Randomized.getPreviousDate(15, "MM/dd/yyyy")));
			}
			
			public void verifyToDateAsCurrentDate()
			{
				String attribute = uIMapRecords.callSearch.uIToDateEdit.getAttribute("value");
				System.out.println(attribute);
				verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
			}

			public void verifyJurisAsPXProphoenix() {
				String text = uIMapRecords.callSearch.uIJurisDropdown.getText();
				verify.ExpectedValueIsTrue(text.contains("PX - ProPhoenix"));
			}

			public void verifyDateAsCurrentDateInGrid(int rowIndex) 
			{
				String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "Date", rowIndex);
				System.out.println(gridCellInnerText);
				if(gridCellInnerText.contains(Randomized.getCurrentDate("MM/dd/yy")))
				{
				verify.ExpectedValueIsTrue(gridCellInnerText.contains(Randomized.getCurrentDate("MM/dd/yy")));
				}
			}

			public void verifyJurisAsBCInGrid()
			{
//				WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, "BC");
				WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callSearch.uICallSearchTable, "BC");
				verify.ExpectedValueIsTrue(gridCell.getText().contains("BC"));
			}

			public void verifyJurisAsNullInGrid() 
			{
				WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapRecords.callSearch.uICallSearchTable, " ");
				verify.ExpectedValueIsTrue(gridCell.getText().contains(" "));
			}
			
			public void verifyStreet2IsEnabled() {
				verify.ExpectedValueIsTrue(uIMapRecords.callSearch.uIStreet2Edit.isEnabled());
			} 
		    public void verifyShowButtonEnabled()
	        {	            
	            verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uIShowMapButton.isDisplayed());
		        verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uIShowMapButton.isEnabled());
	        }
	        public void selectAtLocationCheckboxInGrid()
	        {
	            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, PoliceData.getRecordsModuleValue("Location"));
	        }
	        public void selectAtLocation1CheckboxInGrid()
	        {
	            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, PoliceData.getRecordsModuleValue("Location1"));
	        }
	        
public void selectAtLocation2CheckboxInGrid()
	        {
	            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.callSearch.uICallSearchTable, PoliceData.getRecordsModuleValue("Location2"));
	        }

public int getRowCount()
{
	
	int rowCount= objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.callSearch.uICallSearchTable);
	System.out.println(rowCount);
	return rowCount;
}

public void enterAtFromDate() {
	uIMapRecords.callSearch.uIFromDateEdit.sendKeys(PoliceData.getRecordsModuleValue("FromDate"));
}
public void enterAtToDate() {
	
	uIMapRecords.callSearch.uIToDateEdit.sendKeys(PoliceData.getRecordsModuleValue("ToDate"));
}


public void selectAtVehicleFlag() {
	objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.callSearch.uIVehicleDropdown,
			PoliceData.getRecordsModuleValue("Flag"));
}

public void clickExpiredFlagCheckbox() {
	uIMapRecords.callSearch.uIExpiredFlagCheckBox.click();
	Playback.controlReadyThreadWait();
}

public void verifyCustomLabelIsDisplayed() {
			uIMapRecords.callSearch.uICustomLabel.isDisplayed();
		}
public void verifyCustomFieldIsDisAbled() {
	
	String Disabled = uIMapRecords.callSearch.uICustomEdit.getAttribute("readonly");
	System.out.println(Disabled+"Call Search Feild Disabled");
	verify.ExpectedPropertyValueIsEqual(Disabled,
			uIMapRecords.callSearch.uICustomEdit.getAttribute("readonly"));

}

public void clickcustomFeild() {
			uIMapRecords.callSearch.uICustomLabel.click();
		}

public void verifyCustomFielIsEnabled() {
	uIMapRecords.callSearch.uICustomEdit.isEnabled();

}

public void verify13AccessRestrictedByAUTOAckMsg() {													// Added by Abi
	Playback.pageLoadThreadWait();
	popup.acknowledge.okWithExpectedMessage("(13) Access restricted by Prophoenix, Automation");
}

	}

	public class CaseSearch {
		
		public AdvancedTab advancedTab = null;
		public PoliceForceTab policeForceTab=null;
		public CaseSearch() {
			if ((this.advancedTab == null)) {
				this.advancedTab = new AdvancedTab();
			}
			if ((this.policeForceTab == null)) {
				this.policeForceTab = new PoliceForceTab();
			}
		}

		

		public void ClickAddNew() {
			uIMapRecords.caseSearch.uIAddNewButton.click();

		}

		public void enterAtCaseNo() {
			uIMapRecords.caseSearch.uICaseYearEdit.click();
			uIMapRecords.caseSearch.uICaseYearEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.caseSearch.uICaseNumberEdit.clear();
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtCaseNo1() {

			uIMapRecords.caseSearch.uICaseYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo1").substring(0, 2));
			uIMapRecords.caseSearch.uICaseNumberEdit.clear();
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo1").substring(3));
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtStreet1() {
			uIMapRecords.caseSearch.uIStreet1Edit.sendKeys(PoliceData.getRecordsModuleValue("Street1"));
			uIMapRecords.caseSearch.uIStreet1Edit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			uIMapRecords.caseSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectDomesticViolenceAsNo() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseSearch.uIDomesticViolenceDropDown, "No");
			uIMapRecords.caseSearch.uIDomesticViolenceDropDown.sendKeys(Keys.TAB);
		}

		public void clickBackButton() {
			uIMapRecords.caseSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReset() {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickDateResetButton() {
			uIMapRecords.caseSearch.uIDateResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectRowInGrid(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseSearch.uICaseSearchTable, rowIndex);
			row.click();
		}

		public void VerifyGirdRowIsInActiveStatus(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseSearch.uICaseSearchTable, rowIndex);
			verify.ExpectedValueIsTrue(row.getAttribute("class").contains("ActiveRow"));
		}

		public void EnterCurrentDateTime() {
			uIMapRecords.caseSearch.uIStartDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapRecords.caseSearch.uIStartTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterAtReceivedSource() {
			uIMapRecords.caseSearch.uIReceivedSourceCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReceivedSource"));
			uIMapRecords.caseSearch.uIReceivedSourceCodeEdit.sendKeys(Keys.TAB);
		}

		public void MouserHoverCaseNumberInGrid() {

			String newsrer = uIMapRecords.caseSearch.uIToolTipStatusBar.getText();
			verify.ExpectedValueIsTrue(newsrer.contains("17-000"));
		}

		public void ClickRowAtCaseNumber() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseSearch.uICaseSearchTable, PoliceData.getRecordsModuleValue("CaseNumber"));
		}

		public void ClickRowAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseSearch.uICaseSearchTable, PoliceData.getRecordsModuleValue("CaseNo"));
		}

		public void EnterNumberControlCaseNo() {
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(String.valueOf(Randomized.getRandomNumber()));
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.ENTER);

		}

		public void VerifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void Verify1040NumberNotExistAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1040) Number Does Not Exist");
		}

		public void Verify13AccessRestrictedByAUTOAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(13) Access Restricted by Prophoenix, Automation");
		}

		public void enterToDateAsCurrentDate() {
			uIMapRecords.caseSearch.uIToDateEdit.click();
			uIMapRecords.caseSearch.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void ClickPrint() {
			uIMapRecords.caseSearch.uIPrintIconButton.click();
		}

		public void ClickShowMapButton() {
			uIMapRecords.caseSearch.uIShowMapButton.click();
		}

		public void clickClearMapButton() {
			uIMapRecords.caseSearch.uIClearMapButton.click();
		}

		public void SelectLocationAsIntersection() {
			new Select(uIMapRecords.caseSearch.uILocationComboBox).selectByVisibleText("Intersection");
		}

		public void SelectLocationAsCommonName() {
			new Select(uIMapRecords.caseSearch.uILocationComboBox).selectByVisibleText("Common Name");
		}
		public void enterAtOfficer() {
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseSearch.uICaseSearchTable,
							"Case#", rowIndex));
		}

		public void VerifyAtLocationByAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Location"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable,
							PoliceData.getRecordsModuleValue("CaseNo"), "Location").getText());
		}

		public void EnterAtFromCFSRange() {
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange"));
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtToCFSRange() {
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("ToCFSRange"));
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtFromCFSRange1() {
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange1"));
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtToCFSRange1() {
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("ToCFSRange1"));
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyToCFSRangeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseSearch.uICFSRangeToCodeEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uICFSRangeDescriptionToEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyFromCFSRangeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uICFSRangeFromDescriptionEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyToCFSRangeEditable() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseSearch.uICFSRangeToCodeEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uICFSRangeDescriptionToEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyFromCFSRangeEditable() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uICFSRangeFromDescriptionEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void ClickUsedBodyWornCheckBox() {
			uIMapRecords.caseSearch.advancedTab.uIUsedBodyWornCheckBox.click();
		}

		public void clickAdvancedTab() {
			uIMapRecords.caseSearch.uIAdvancedTab.click();
			Playback.controlReadyThreadWait();
		}
		public void ClickHoldForPublicCheckBox() {
			uIMapRecords.caseSearch.advancedTab.uIHoldForPublicCheckBox.click();
		}

		public void EnterAtCADDisposition() {
			uIMapRecords.caseSearch.uICADDispositionCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CADDisposition"));
			uIMapRecords.caseSearch.uICADDispositionCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtOfficer1() {
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer1"));
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickRowAtCaseNo1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseSearch.uICaseSearchTable, PoliceData.getRecordsModuleValue("CaseNo1"));
		}

		public void EnterAtFromCFSRange2() {
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange2"));
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtToCFSRange2() {
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("ToCFSRange2"));
			uIMapRecords.caseSearch.uICFSRangeToCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtFromCFSRange3() {
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("FromCFSRange3"));
			uIMapRecords.caseSearch.uICFSRangeFromCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtLocation() {
			uIMapRecords.caseSearch.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location"));
			uIMapRecords.caseSearch.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void ClickLocationVerifyCheckbox() {
			uIMapRecords.caseSearch.uILocationVerifyCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtCaseNo(String caseNo) {
			uIMapRecords.caseSearch.uICaseYearEdit
			.sendKeys(caseNo.substring(0, 2));
	uIMapRecords.caseSearch.uICaseNumberEdit.clear();
	uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(caseNo.substring(3));
	uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
		}

		public void ClickCaseNoInfoIcon() {
			uIMapRecords.caseSearch.uICaseNoInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickApprovedReportStatusIconInGrid() {
			uIMapRecords.caseSearch.uIReportsStatusIconInGrid.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReportStatusIconInGrid() {
			uIMapRecords.caseSearch.uIReportsStatusIconInGrid.click();
			Playback.controlReadyThreadWait();
		}

		public void clickReportIconInGrid(int rowCount) {

			WebElement ReportIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable, "Report", rowCount);
			ReportIcon.click();
			Playback.controlReadyThreadWait();

		}

		public void enterCaseNoByActiveData(String Case) {
			uIMapRecords.caseSearch.uICaseYearEdit.sendKeys(Case.substring(0, 2));
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Case.substring(3));
			uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clearCaseNo() {
			uIMapRecords.caseSearch.uICaseYearEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapRecords.caseSearch.uICaseNumberEdit.clear();
		}

		public void clickPrimeOnlyCheckBox() {
			uIMapRecords.caseSearch.uIPrimeOnlyCheckBox.click();
		}

		public void verifyMoverHoverMessageShowAsLoggedOfficerName(int rowIndex) {
			WebElement cell = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable,
					"Prime ", rowIndex);
			WebElement notes = cell.findElement(By.xpath("//td[@title='Prophoenix, Automation - AUTO']"));
			verify.ExpectedPropertyValueIsEqual("Prophoenix, Automation - AUTO", notes.getAttribute("title"));
		}

		public void enterAtLoggedOfficer1() {
			uIMapRecords.caseSearch.uIOfficerCodeEdit.clear();
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("LoggedOfficer1"));
			uIMapRecords.caseSearch.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyMoverHoverMessageShowAsPrimeOfficerName(int rowIndex) {
			WebElement cell = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable,
					"Prime ", rowIndex);
			WebElement notes = cell.findElement(By.xpath("//td[@title='Patrol, Officer - P001']"));
			verify.ExpectedPropertyValueIsEqual("Patrol, Officer - P001", notes.getAttribute("title"));
		}

		public void verifyReportStatusIconInGrid() {
			String icon = uIMapRecords.caseSearch.uIReportsStatusIconInGrid.getAttribute("src");
			verify.ExpectedValueIsTrue(icon.contains("attach_yellow.png"));

		}

		public void clickApprovedReportStatusIconInGrid() {
			uIMapRecords.caseSearch.uIReportsStatusIconInGrid.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseSearch.uIJurisComboBox,
					PoliceData.getRecordsModuleValue("Juris"));
			uIMapRecords.caseSearch.uIJurisComboBox.sendKeys(Keys.TAB);
		}

		public void selectDomesticViolenceAsYes() {
			new Select(uIMapRecords.caseSearch.uIDomesticViolenceDropDown).selectByVisibleText("Yes");
		}

		public void VerifyAt13AccessRestrictedByOfficerAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage(
					"(13) Access restricted by" + " " + PoliceData.getRecordsModuleValue("Officer"));
		}

		public void mouseHoverAtPrimeColumnAndVerify() {
			Actions mousehover = new Actions(Playback.driver);

			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable, "Prime ", 0));

			WebElement ele = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable,
					"Prime ", 0);
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(ele.getAttribute("title"),
					PoliceData.getRecordsModuleValue("SupervisorName"));
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext, "17-000001");

		}

		public void mouseHoverAtCAColumnAndVerify() {
			Actions mousehover = new Actions(Playback.driver);

			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable, "CA", 0));

			WebElement ele = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseSearch.uICaseSearchTable,
					"CA", 0);

			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(ele.getAttribute("title"),
					PoliceData.getRecordsModuleValue("PrimeInvestigatorName"));
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext, "17-000001");

		}

		public void verifyRowsAreDisplayedInGrid() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.caseSearch.uICaseSearchTable);
			verify.ExpectedIntergerValueIsNotEqualToActual(count, 0);
		}

		public void verifyFromAndToDateRangeAs15() {
			String fromDate = uIMapRecords.caseSearch.uIStartDateEdit.getAttribute("value");
			String toDate = uIMapRecords.caseSearch.uIToDateEdit.getAttribute("value");
			String actual = Randomized.getPreviousDate(toDate, "MM/dd/yyyy", 15);
			System.out.println(actual);
			verify.ExpectedPropertyValueIsEqual(fromDate, actual);

		}

		public void selectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseSearch.uICaseSearchTable,
					PoliceData.getRecordsModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void clickSelectedCheckBoxInMenuBar() {
			Playback.pageLoadThreadWait();
			uIMapRecords.caseSearch.uISelectedCheckbox.click();
		}

		public void clickRowAtLocation() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseSearch.uICaseSearchTable, PoliceData.getRecordsModuleValue("Location"));
		}

		public void selectAtJuris1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseSearch.uIJurisComboBox,
					PoliceData.getRecordsModuleValue("Juris1"));
			uIMapRecords.caseSearch.uIJurisComboBox.sendKeys(Keys.TAB);
		}

		public void verifyJurisAsPX() {

			verify.ExpectedPropertyValueIsEqual("PX - ProPhoenix", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.caseSearch.uIJurisComboBox));
		}

		public void selectJurisAsBC() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseSearch.uIJurisComboBox,
					"BC - Brown County Police Department");
			Playback.controlReadyThreadWait();
		}

		public void enterAtFromDate() {
			uIMapRecords.caseSearch.uIStartDateEdit.clear();
			uIMapRecords.caseSearch.uIStartDateEdit.sendKeys(PoliceData.getRecordsModuleValue("FromDate"));
		}

		public void clickReportIconInGridByCaseNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.selectGridRowReportIconByCellInnerText(PoliceData.getRecordsModuleValue("CaseNo"));
		}

		public void clickReportIconInGridByCaseNo1() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.selectGridRowReportIconByCellInnerText(PoliceData.getRecordsModuleValue("CaseNo1"));
		}

		public void verify39AccessDeniedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(39) Access denied for Screen ID 2510");
		}

		public void verify21838AccessDeniedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(21838) Access denied");
		}

		public void clickSelectedCheckBox() {
			if (!uIMapRecords.caseSearch.uISelectedCheckbox.isSelected()) {
				uIMapRecords.caseSearch.uISelectedCheckbox.click();
			}
		}

		public void verifyCaseCheckBoxesDisplayed(int rowIndex) {
			WebElement ele = objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapRecords.caseSearch.uICaseSearchTable, rowIndex);
			verify.ExpectedValueIsTrue(ele.isDisplayed());
		}

		public void selectCaseCheckBoxesByRowCount(int count) {
			for (int i = 1; i <= count; i++) {
				Playback.threadWait(600);
				objectIdentification.manualIdentify
						.selectGridRowCheckBoxByIndex(uIMapRecords.caseSearch.uICaseSearchTable, i);

			}
		}

		public ArrayList<String> selectCaseCheckBoxesAndReadCaseNo(int count) {
			ArrayList<String> CaseNos = new ArrayList<>();

			for (int i = 1; i <= count; i++) {
				Playback.threadWait(600);
				objectIdentification.manualIdentify
						.selectGridRowCheckBoxByIndex(uIMapRecords.caseSearch.uICaseSearchTable, i);

				CaseNos.add(objectIdentification.manualIdentify
						.getGridCellInnerTextByText(uIMapRecords.caseSearch.uICaseSearchTable, "Case#", i - 1));

			}
			return CaseNos;
		}
		
		  public void verifyStreet2IsEnabled() {
				verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.uIStreet2Edit.isEnabled());
			} 
		  
		  public void VerifyAtLocationInGrid(int rowIndex)
		  {
		      verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseSearch.uICaseSearchTable, 
		          "Location", rowIndex).contains(PoliceData.getRecordsModuleValue("Location")));
		  } 
		  public void EnterAtStreet2()
		  {
		      uIMapRecords.caseSearch.uIStreet2Edit.sendKeys(PoliceData.getRecordsModuleValue("Street2"));
		      uIMapRecords.caseSearch.uIStreet2Edit.sendKeys(Keys.TAB);
		  }

		public void enterAtToDate() {
	
	uIMapRecords.caseSearch.uIToDateEdit.sendKeys(PoliceData.getRecordsModuleValue("ToDate"));
}

		public void reloadCaseSearch() {
			
			objectIdentification.manualIdentify.reloadScreen("Case Search");
		}

		 public void VerifyAtToDateInFirstRow()
         {
             verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseSearch.uICaseSearchTable,
                 "Reported Date", 0).contains(PoliceData.getRecordsModuleValue("ToDate").substring(0, 3)));
         }
		 public void VerifyAtFromDateInLastRow()
         {
            int gridTableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.caseSearch.uICaseSearchTable)-1;
            String date = objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseSearch.uICaseSearchTable,
                     "Reported Date", gridTableRowsCount);
             verify.ExpectedValueIsTrue(date.contains(PoliceData.getRecordsModuleValue("FromDate").substring(0, 3)));
          
         }

		 public void clickchargeSearchicon() {
	            uIMapRecords.caseSearch.uIChargeSearchIcon.click();
	        }


		 public void enterGeoCoord() {
	            uIMapRecords.caseSearch.uIGeoCoordsFrom.sendKeys("1");
	            uIMapRecords.caseSearch.uIGeoCoordsTo.sendKeys("10");
	        }

	        public void selectpatrolZone() {
	            objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.caseSearch.uIPatrolZoneComboBox);
	            uIMapRecords.caseSearch.uIPatrolZoneComboBox.sendKeys(Keys.TAB);
	        }

	        public void selectSubZone() {
	            objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.caseSearch.uISubZoneComboBox);
	        }

	        public void selectAtPrimeInvestigator() {

	            uIMapRecords.caseSearch.uIPrimeInvestigator
	                    .sendKeys(PoliceData.getRecordsModuleValue("Prime Investigator"));
	            uIMapRecords.caseSearch.uIPrimeInvestigator.sendKeys(Keys.TAB);

	        }

	        public void clickCaseStatusChargeIcon() {
	            uIMapRecords.caseSearch.uICaseStatusSearchIcon.click();

	        }

	        public void clickOfficerSearchIcon() {
	            uIMapRecords.caseSearch.uIofficerSearchIcon.click();
	        }
	        public void clickPoliceForceTab() {
	            uIMapRecords.caseSearch.uIPoliceTab.click();

	        }


	        public void enterAtCaseNoUsingJsonReadFile(String testCaseId)
	        {

	                Playback.pageLoadThreadWait();
	                Playback.threadWait();
	                String caseYear = PoliceData.readJson(testCaseId, "caseYear");
	                String caseNo = PoliceData.readJson(testCaseId, "caseNo");
	                String CaseNo = caseYear+"-"+caseNo;

	       uIMapRecords.caseSearch.uICaseYearEdit.sendKeys(caseYear);
	                uIMapRecords.caseSearch.uICaseNumberEdit.clear();
	                uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(caseNo);
	                uIMapRecords.caseSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
	                Playback.waitForPageLoad();

	        }


	        public void clickShowOnlyCasesWithReportsCheckBox() {
				uIMapRecords.caseSearch.uIShowOnlyCasesWithReportCheckBox.click();
			}
			
			public void clickNotReviewedOnlyCheckBox() {
				uIMapRecords.caseSearch.uINotReviewedOnlyCheckBox.click();
			}


			public void verifyReportStatusIconPresentInGrid() {
				String icon = uIMapRecords.caseSearch.uIReportsStatusIconInGrid.getAttribute("src");
				verify.ExpectedValueIsTrue(icon.contains("attach_yellow.png"));

			}
			
			
			public void verifyReportReviewIconInGrid() {
				String icon = uIMapRecords.caseSearch.uIReportsStatusIconInGrid.getAttribute("src");
				verify.ExpectedValueIsTrue(icon.contains("attach_yellow.png"));

			}

			public void verifyclickShowOnlyCasesWithReportsCheckBoxEnable() {
				uIMapRecords.caseSearch.uIShowOnlyCasesWithReportCheckBox.isEnabled();
				}

			public void verifyReportIconIsDisplayed() {
				int rowCount = objectIdentification.manualIdentify
				.getGridTableRowsCount(uIMapRecords.caseSearch.uICaseSearchTable);
				List<WebElement> allIcons = new ArrayList<>();
				for (int i = 0; i < rowCount; i++) {
				WebElement Icon = Playback.driver
				.findElement(By.xpath("//img[@id='grdCBE_it16_" + i + "_IsReportsImg']"));
				allIcons.add(Icon);
				}
				for (WebElement icon : allIcons) {
				verify.ExpectedValueIsTrue(icon.getAttribute("src").contains(".png"));
				}
				}

			public void clickShowOnlyCasesWithoutReportsCheckBox() {
				uIMapRecords.caseSearch.uIShowOnlyCasesWithoutReportCheckBox.click();
				}

			public void verifyReportIconIsNotDisplayed() {
//
				int columnValues = objectIdentification.manualIdentify
				.getGridTableRowsCount(uIMapRecords.caseSearch.uICaseSearchTable);
				for (int i = 1; i <= columnValues; i++) {
				if (i < 17) {
				WebElement ele = objectIdentification.manualIdentify.getGridRowCheckBoxByIndexandColumnName(uIMapRecords.caseSearch.uICaseSearchTable).get(i);
			try {
				ele.findElement(By.tagName("img"));
				} catch (NoSuchElementException e) {
				verify.ExpectedValueIsTrue(true);
				}
				}
				}
			}
			public void verifyNotReviewedOnlyCheckBoxEnable() {
				uIMapRecords.caseSearch.uINotReviewedOnlyCheckBox.isEnabled();
				}

			public void verifyclickShowOnlyCasesWithOutReportsCheckBoxEnable() {
				uIMapRecords.caseSearch.uIShowOnlyCasesWithoutReportCheckBox.isEnabled();
				}
		
	}

	public class AdvancedTab {

		public void verifyUsedBodyWornCameraCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.advancedTab.uIUsedBodyWornCheckBox.isEnabled());
		}

		public void verifyInCarVideoAvailableCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.advancedTab.uIInCarVideoAvailableCheckbox.isEnabled());
		}

		public void verifyBothVideoTypesAvailableCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseSearch.advancedTab.uIBothVideoTypesAvailable.isEnabled());
		}

		public void clickUsedBodyWornCameraCheckBox() {
			uIMapRecords.caseSearch.advancedTab.uIUsedBodyWornCheckBox.click();
		}

		public void clickInCarVideoAvailableCheckBox() {
			uIMapRecords.caseSearch.advancedTab.uIInCarVideoAvailableCheckbox.click();
		}

		public void clickBothVideoTypesAvailableCheckBox() {
			uIMapRecords.caseSearch.advancedTab.uIBothVideoTypesAvailable.click();
		}

		public void verifyUsedBodyWornCameraCheckBoxIsNotEnabled() {
			verify.ExpectedValueIsNotTrue(uIMapRecords.caseSearch.advancedTab.uIUsedBodyWornCheckBox.isEnabled());
		}

		public void verifyInCarVideoAvailableCheckBoxIsNotEnabled() {
			verify.ExpectedValueIsNotTrue(
					uIMapRecords.caseSearch.advancedTab.uIInCarVideoAvailableCheckbox.isEnabled());
		}

	}

	public class CaseUpdate {
		public CaseUpdate() {
			if ((this.reportingTab == null)) {
				this.reportingTab = new ReportingTab();
			}

			if ((this.caseUpdateNamesTab == null)) {
				this.caseUpdateNamesTab = new CaseUpdateNamesTab();
			}

			if ((this.caseUpdateCaseDataTab == null)) {
				this.caseUpdateCaseDataTab = new CaseUpdateCaseDataTab();
			}

			if ((this.attachmentsTab == null)) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}

			if ((this.mOTab == null)) {
				this.mOTab = new MOTab();
			}

			if ((this.uCRTab == null)) {
				this.uCRTab = new UCRTab();
			}

			if ((this.activityLogTab == null)) {
				this.activityLogTab = new ActivityLogTab();
			}

			if ((this.caseUpdateVehicleTab == null)) {
				this.caseUpdateVehicleTab = new CaseUpdateVehicleTab();
			}

			if ((this.caseUpdateUseOfForceTab == null)) {
				this.caseUpdateUseOfForceTab = new CaseUpdateUseOfForceTab();
			}

			if ((this.caseUpdatePropertyTab == null)) {
				this.caseUpdatePropertyTab = new CaseUpdatePropertyTab();
			}

			if ((this.nIBRSCheckTab == null)) {
				this.nIBRSCheckTab = new NIBRSCheckTab();
			}

			if ((this.caseUpdateRelatedCasesTab == null)) {
				this.caseUpdateRelatedCasesTab = new CaseUpdateRelatedCasesTab();
			}
			if ((this.caseUpdateRequestTab == null)) {
				this.caseUpdateRequestTab = new CaseUpdateRequestTab();
			}
			if ((this.caseUpdateANCATab == null)) {
				this.caseUpdateANCATab = new CaseUpdateANCATab();
			}
			
			if ((this.caseUpdateMapTab == null)) {
				this.caseUpdateMapTab = new CaseUpdateMapTab();
			}
			if ((this.caseUpdateSuspectTab == null)) {
				this.caseUpdateSuspectTab = new CaseUpdateSuspectTab();
			}

			if ((this.caseUpdateCadDataTab == null)) {
				this.caseUpdateCadDataTab = new CaseUpdateCadDataTab();
			}
		}

		public ReportingTab reportingTab = null;
		public CaseUpdateNamesTab caseUpdateNamesTab = null;
		public CaseUpdateCaseDataTab caseUpdateCaseDataTab = null;
		public AttachmentsTab attachmentsTab = null;
		public MOTab mOTab = null;
		public UCRTab uCRTab = null;
		public ActivityLogTab activityLogTab = null;
		public CaseUpdateVehicleTab caseUpdateVehicleTab = null;
		public CaseUpdateUseOfForceTab caseUpdateUseOfForceTab = null;
		public CaseUpdatePropertyTab caseUpdatePropertyTab = null;
		public NIBRSCheckTab nIBRSCheckTab = null;
		public CaseUpdateRelatedCasesTab caseUpdateRelatedCasesTab = null;
		public CaseUpdateRequestTab caseUpdateRequestTab;
		public CaseUpdateANCATab caseUpdateANCATab;
		
		public CaseUpdateMapTab caseUpdateMapTab;
		public CaseUpdateSuspectTab caseUpdateSuspectTab;

		public CaseUpdateCadDataTab caseUpdateCadDataTab;

		public void clickReportingTab() {
			uIMapRecords.caseUpdate.uIReportingTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCBEReports");
			Playback.pageLoadThreadWait();
		}

		
		public void clickResetButton() {
			uIMapRecords.caseUpdate.uIResetButton.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToMOTab() {
			uIMapRecords.caseUpdate.uIMOTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCBEACDMO");
		}
		public void switchToMapTab() {

			uIMapRecords.caseUpdate.uIMapTab.click();
			objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapHERE.aspx?");

		}
		public void switchToActivityLogTab() {
			uIMapRecords.caseUpdate.uIActivityLogTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPersonnelComments");
		}

		public void ClickCADDataTab() {

			uIMapRecords.caseUpdate.uICADDataTab.click();

		}

		public void ClickMapTab() {

			uIMapRecords.caseUpdate.uIMapTab.click();

		}

		public void clickNamesTab() {

			uIMapRecords.caseUpdate.uINamesTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmCBENames");
		}

		public void clickCaseDataTab() {

			uIMapRecords.caseUpdate.uICaseDataTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmCBEACD");
		}

		public void switchToNamesTab() {
			uIMapRecords.caseUpdate.uINamesTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmCBENames");
		}

		public void switchToNIBRSCheckTab() {
			uIMapRecords.caseUpdate.uINIBRSCheckTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmErrorCheck");
		}

		public void switchToSuspectTab() {
			uIMapRecords.caseUpdate.uISuspectsTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmCBESuspect");
		}

		public void VerifyLocation(String Location) {
			verify.ExpectedPropertyValueIsEqual(Location, uIMapRecords.caseUpdate.uILocationEdit.getAttribute("value"));
		}

		public void closeTheScreen() {
			Playback.waitForControlReady();
			uIMapRecords.caseUpdate.driver.close();
			Playback.threadWait(3000);
		}

		public void VerifyNotForPublicNotChecked() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapRecords.caseUpdate.uINotForPublicCheckBox.getAttribute("checked")));

		}

		public void VerifyCaseReportedOnDateAndTime(String caseReportedDate, String caseReportedTime) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate,
					uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime,
					uIMapRecords.caseUpdate.uIReportedTimeEdit.getAttribute("value"));
		}

		public void GetLocation(String location) {
			location = uIMapRecords.caseUpdate.uILocationEdit.getAttribute("value");
			Playback.setTestContextAttribute("location", location);
		}

		public void GetDateTime(String caseReportedDate1, String caseReportedTime1) {
			caseReportedDate1 = uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value");
			Playback.setTestContextAttribute("caseReportedDate1", caseReportedDate1);
			caseReportedTime1 = uIMapRecords.caseUpdate.uIReportedTimeEdit.getAttribute("value");
			Playback.setTestContextAttribute("caseReportedTime1", caseReportedTime1);
		}

		public void ClickCMIcon() {
			uIMapRecords.caseUpdate.uICMIconButton.click();
		}

		public void ClickALCIcon() {
			uIMapRecords.caseUpdate.uIALCIcon.click();
		}

		public void clickAttachmentTab() {

			uIMapRecords.caseUpdate.uIAttachmentsTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
			Playback.waitForPageLoad();
		}

		public void VerifyUCRTabAppearsRedColor() {

			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//div[@id='tabCBE']//span[@mkr ='ti13']"))
					.getAttribute("class").contains("tabRedClr"));
		}

		public void VerifyUCRTabAppearsGreenColor() {

			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//div[@id='tabCBE']//span[@mkr ='ti13']"))
					.getAttribute("class").contains("tabGreenClr"));
		}

		public void VerifyNIBRSCheckTabAppearsRedColor() {

			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//div[@id='tabCBE']//span[@mkr ='ti11']"))
					.getAttribute("class").contains("tabRedClr"));
		}

		public void verifyNIBRSCheckTabAppearsGreenColor() {

			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//div[@id='tabCBE']//span[@mkr ='ti11']"))
					.getAttribute("class").contains("tabGreenClr"));
		}

		public void ClickUCRTab() {
			uIMapRecords.caseUpdate.uIUCRTab.click();
		}

		public void ClickVehicleTab() {
			uIMapRecords.caseUpdate.uIVehicleTab.click();
		}

		public void clickSave() {
			uIMapRecords.caseUpdate.uISaveButton.click();
			
		}

		public void VerifyNotForPublicChecked() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.caseUpdate.uINotForPublicCheckBox.getAttribute("checked")));

		}

		public void ClickSaveAndCloseButton() {
			uIMapRecords.caseUpdate.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void clickCaseManagementIcon() {
			uIMapRecords.caseUpdate.uICaseManagementIcon.click();
		}

		public void VerifyAcknowledgeUpdateMessage() {
			Playback.popupThreadWait();
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the MO Tab. You must save or reset.");
		}

		public void switchToCaseUpdateAttachmentsTab() {

			uIMapRecords.caseUpdate.uIAttachmentsTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void VerifyCaseAtActivityNo() {
			Playback.threadWait(3000);
			Playback.threadWait(3000);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ActivityNo").substring(0, 2),
					uIMapRecords.caseUpdate.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ActivityNo").substring(3),
					uIMapRecords.caseUpdate.uICaseNumberEdit.getAttribute("value"));
		}

		public void switchToAllTabs() {
			uIMapRecords.caseUpdate.uICaseDataTab.click();
			uIMapRecords.caseUpdate.uIReportingTab.click();
			uIMapRecords.caseUpdate.uINamesTab.click();
			uIMapRecords.caseUpdate.uISuspectsTab.click();
			uIMapRecords.caseUpdate.uIAttachmentsTab.click();
			uIMapRecords.caseUpdate.uIVehicleTab.click();
			uIMapRecords.caseUpdate.uICADDataTab.click();
			uIMapRecords.caseUpdate.uIPropertyTab.click();
			uIMapRecords.caseUpdate.uIMapTab.click();

		}

		public void SaveNClose() {
			uIMapRecords.caseUpdate.uISaveNCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void saveScreen() {
			uIMapRecords.caseUpdate.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void switchToVehicleTab() {

			uIMapRecords.caseUpdate.uIVehicleTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmVehicle");
		}

		public void ClickUseOfForceTab() {

			uIMapRecords.caseUpdate.uIUseOfForceTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmUOFDetails");
		}
		
		public void ClickNIBRSTab() {

			uIMapRecords.caseUpdate.uINIBRSCheckTab.click();
			Playback.threadWait(2000);
			
		}


		public void ClickPropertyTab() {

			uIMapRecords.caseUpdate.uIPropertyTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmPropEntrySrch");
		}

		public void VerifyCallInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uICallInfoIcon.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uICallInfoIcon.isEnabled());
		}

		public void VerifyNIBRSTabGreenColor() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uINIBRSCheckSpanColorTab.getAttribute("class").contains("Green"),
					"Verifying NIBRS Tab color");
		}

		public void ClickRelatedCaseTab() {

			uIMapRecords.caseUpdate.uIRelatedCasesTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmCBERelatedCalls");
		}

		public void clickCallInfoIcon() {
			uIMapRecords.caseUpdate.uICallInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void GetCallNo(String callYear, String callNo) {
			callYear = uIMapRecords.caseUpdate.uICallYearEdit.getAttribute("value");
			Playback.setTestContextAttribute("callYear", callYear);
			callNo = uIMapRecords.caseUpdate.uICallNumberEdit.getAttribute("value");
			Playback.setTestContextAttribute("callNo", callNo);
		}

		public void ClickCrashIcon() {
			uIMapRecords.caseUpdate.uICrashIcon.click();
			Playback.pageLoadThreadWait();
		}
		public void clickk9ReportIcon() {
			uIMapRecords.caseUpdate.uIK9ReportIcon.click();
			Playback.pageLoadThreadWait();
		}
		
		public void clickCoronerIcon() {
			uIMapRecords.caseUpdate.uICoronerIcon.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickCitationIcon() {
			uIMapRecords.caseUpdate.uICitationIcon.click();
			Playback.pageLoadThreadWait();
		}

		public void VerifyCrashIconColorChange() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uICrashIcon.getAttribute("src").contains("car_crash1.png"));
		}

		public void VerifyCitationIconColorChange() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uICitationIcon.getAttribute("src").contains("summons1.png"));
		}

		public void VerifyCJRSTabGreenColor() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uICJRSSpanColorTab.getAttribute("class").contains("Green"),
					"Verifying CJRS Tab color");
		}

		public void switchToCJRSTab() {
			uIMapRecords.caseUpdate.uICJRSTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmErrorCheck");
		}

		public void GetCaseNo(String caseYear, String caseNo) {
			caseYear = uIMapRecords.caseUpdate.uICaseYearEdit.getAttribute("value");
			Playback.setTestContextAttribute("caseYear", caseYear);
			caseNo = uIMapRecords.caseUpdate.uICaseNumberEdit.getAttribute("value");
			Playback.setTestContextAttribute("caseNo", caseNo);
		}

		public void VerifyDiscoveryRequestLinkDisplayed() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDiscoveryRequestLink.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDiscoveryRequestLink.isEnabled());
		}

		public void ClickDiscoveryRequestLink() {
			uIMapRecords.caseUpdate.uIDiscoveryRequestLink.click();
			Playback.popupThreadWait();
		}

		public void ClickNotificationIcon() {
			uIMapRecords.caseUpdate.uINotificationIcon.click();
			Playback.pageLoadThreadWait();
		}

		public void VerifyAtCaseStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseStatus"),
					uIMapRecords.caseUpdate.uICaseStatusDescriptionEdit.getAttribute("value"));
		}

		public void VerifyAtJuris() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Juris"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapRecords.caseUpdate.uIJurisCombobox));
		}

		public void VerifyDoNotDistributeReportsChecked() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDoNotDistributeReportsCheckbox.isSelected());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDoNotDistributeReportsTextView.isDisplayed());
		}

		public void VerifyDNDStatusBar() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uIDNDStatusTextView.getText().contains("DO NOT DISTRIBUTE REPORTS"));
		}
		public void VerifyNewVictimScreen() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uIOffenderName.getText().contains("Offender Name"));
		}
		
		public  void VerifyOldVictimScreen() {
			verify.ExpectedValueIsFalse(
					uIMapRecords.caseUpdate.uIOffenderName.getText().contains("Offender Name"));
		}

		public void VeriffDoNotPurgeEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.isDisplayed());
		}

		public void ClickDoNotPurge() {
			uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.click();
		}

		public void VerifyDoNotPurgeChecked() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.getAttribute("checked")));
		}

		public String readCaseNo() {
			String Caseyear = uIMapRecords.caseUpdate.uICaseYearEdit.getAttribute("value");
			String CaseNo = uIMapRecords.caseUpdate.uICaseNumberEdit.getAttribute("value");
			String Case = Caseyear + "-" + CaseNo;
			return Case;

		}

		public void verifyRequestTabBlueColor() {
			// Blue color code
			String Blue = "0, 0, 255";
			String color1 = uIMapRecords.caseUpdate.uIRequestTab.getCssValue("color");
			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}
		public void verifyReportingTabBlueColor() {
			// Blue color code
			String Blue = "0, 0, 255";
			String color1 = uIMapRecords.caseUpdate.uIReportingTab.getCssValue("color");
			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}

		public void verifySuspectsTabBlueColor() {
			// Blue color code
			String Blue = "rgba(0, 0, 255, 1)";
			String tabcolor = uIMapRecords.caseUpdate.uISuspectsTab.getCssValue("color");
			System.out.println(tabcolor);
			verify.ExpectedValueIsTrue(tabcolor.contains(Blue));

		}
		
		public void switchToCaseUpdateRequestTab() {

			uIMapRecords.caseUpdate.uIRequestTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmORDetails");
		}

		public void verifyDNDReportsCheckboxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIDoNotDistributeReportsCheckbox.isEnabled());
		}

		public void verifyDNDReportsCheckboxIsDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.caseUpdate.uIDoNotDistributeReportsCheckbox.isEnabled());
		}

		public void VerifyNotForPublicUnChecked() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapRecords.caseUpdate.uINotForPublicCheckBox.getAttribute("checked")));
		}

		public void verifyRequestTabIsNotDisplayed() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsNotTrue(uIMapRecords.caseUpdate.uIRequestTab.isDisplayed());
		}

		public void verify1051UpdateDataExistsCaseDataTabAckMsg() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Case Data Tab. You must save or reset.");
		}

		public void swithchtoANCATab() {
			uIMapRecords.caseUpdate.uIANCATab.click();
			objectIdentification.windowHandle.switchToFrame("frmAnimalSrch");
			Playback.controlReadyThreadWait();

		}

		public void verifyAtInitialCaseStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("InitialCaseStatus"),
					uIMapRecords.caseUpdate.uICaseStatusDescriptionEdit.getAttribute("value"));

		}

		public String readCaseNo1() {
			String Caseyear = uIMapRecords.caseUpdate.uICaseYearEdit.getAttribute("value");
			String CaseNo = uIMapRecords.caseUpdate.uICaseNumberEdit.getAttribute("value");
			String Case = Caseyear + "." + CaseNo;
			return Case;

		}

		public String readReportedDate() {
			String reportedDate = uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value");
			return reportedDate;
		}
		public String readReportedDate1() {
			String reportedDate = uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value").substring(0, 6);
			String reportedYear = uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value").substring(8);
			return reportedDate+reportedYear;
		}

		public String readReportedTime() {
			String reportedTime = uIMapRecords.caseUpdate.uIReportedTimeEdit.getAttribute("value");
			return reportedTime;
		}

		public void VerifyAtMergedToAddress()
        {
            verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("MergeToAddress"), uIMapRecords.caseUpdate.uILocationEdit.getAttribute("value"));
        }

		public void verifyAtCommonName()
        {
        	String text = uIMapRecords.caseUpdate.uICommonNameLabel.getText();
        	verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("CommonName")));
    }
        
        public void verifyAtCommonName1()
        {
        	String text = uIMapRecords.caseUpdate.uICommonNameLabel.getText();
        	verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("CommonName1")));
    }

        public void verifyPropertyTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIPropertyTab.isDisplayed());
			
		}
        public void verifyAccessDeniedForScreenAcknowledge() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			popup.acknowledge
					.okWithExpectedMessage("(39) Access denied for Screen ID 3010");
		}

    	public void verifyAccessRestrictedAcknowledgeMessage() {
            popup.acknowledge.okWithExpectedMessage("(6071) Access Restricted by Case Folder");
        }

    	public void VerifyDoNotPurgeIsNotChecked() {
            //verify.ExpectedValueIsTrue(!uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.getAttribute("checked"));
            verify.ExpectedValueIsTrue(!uIMapRecords.caseUpdate.uIDoNotPurgeCheckBox.isSelected());
        }


    	public void VerifyUpdateSuccessfulMessage() {

			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.uILeftSideStatusBar.getText().contains("1003 - Update Successful"));
			Playback.threadWait(5000);
		}
    	public void VerifyAdditionSuccessfulMessage() {

		verify.ExpectedValueIsTrue(
				uIMapRecords.caseUpdate.uILeftSideStatusBar.getText().contains("1003 - Addition Successful"));
		Playback.threadWait(5000);
	}


	public String readLocation()
	{
		String location = uIMapRecords.caseUpdate.uILocationEdit.getAttribute("value");
		return location;
	}
		
		public void setCaseYearToJSONFile(String testCaseId) {

			try {
				PoliceData.writeJson(testCaseId, "caseYear",
						uIMapRecords.caseUpdate.uICaseYearEdit.getAttribute("value").substring(0, 2));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	public void setCaseNumberToJSONFile(String testCaseId) {

		try {
		PoliceData.writeJson(testCaseId, "caseNo",
		uIMapRecords.caseUpdate.uICaseNumberEdit.getAttribute("value").substring(0, 6));
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}


	public void verifyAttachmentsTabInBlueColor() 
	{
		String Blue = "rgba(0, 0, 255, 1)";
		String cssValue = uIMapRecords.caseUpdate.uIAttachmentsTab.getCssValue("color");
		System.out.println(cssValue);
		verify.ExpectedPropertyValueIsEqual(uIMapRecords.caseUpdate.uIAttachmentsTab.getCssValue("color"), Blue);		
	}

	public void clickK9ReportIcon()
	{
		uIMapRecords.caseUpdate.uIK9ReportIcon.click();
		
	}

	public void verifyReportingTabInBlueColor()
	{
		String Blue = "rgba(0, 0, 255, 1)";
		verify.ExpectedPropertyValueIsEqual(uIMapRecords.caseUpdate.uIReportingTab.getCssValue("color"), Blue);	
		
	}

	public void verifyK9ReportIconRedColour() {																					// Added by Abi
		verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uIK9ReportIcon.getAttribute("src").contains("Enable.png"));
		}


	public void verifyCoronerIconInBlueColour() {																				// Added by Abi
		String Blue = "rgba(0, 0, 255, 1)";
		verify.ExpectedPropertyValueIsEqual(uIMapRecords.caseUpdate.uICoronerIcon.getCssValue("color"), Blue);		
		}


	public void verify1039DateAndTimeRequiredUCRTabAckMsg() {
		Playback.pageLoadThreadWait();
		Playback.controlReadyThreadWait();
		popup.acknowledge.okWithExpectedMessage("(1039)Date and Time is Required");
	}
		public void switchToCaseUpdateSuspectTab() {
			uIMapRecords.caseUpdate.uISuspectsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBESuspect");
			Playback.controlReadyThreadWait();
		}

		public String readReportedDateAndTime() {
			String reportedDate = uIMapRecords.caseUpdate.uIReportedDateTextView.getAttribute("value");
			String reportedTime = uIMapRecords.caseUpdate.uIReportedTimeEdit.getAttribute("value");
			String ReportedDateTime = reportedDate + " " + reportedTime;
			return ReportedDateTime;
		}

		public void verifyRelatedCaseTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uIRelatedCasesTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifyVehicleTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uIVehicleTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifyCadDataTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uICADDataTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifyUseOfForceTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uIUseOfForceTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifyNamesTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uINamesTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifySuspectTabIsBlueColor() {
			String blueColor = "0, 0, 255";
			String cssValue = uIMapRecords.caseUpdate.uISuspectsTab.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains(blueColor));
		}

		public void verifyCaseDataTabIsBlueColor() {
			String Blue = "0, 0, 255";
			String color1 = uIMapRecords.caseUpdate.uIReportingTab.getCssValue("color");
			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}
	
	}

	public class ReportingTab {

		public WebDriver driver;

		public void VerifyPropertyType() {
			WebElement PropertyType = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Property Report");
			Assert.assertEquals(PropertyType.getText(), "Property Report");
		}

		public void VerifyPropertyStatusAsOnHold() {
			WebElement PropertyStatus = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "OnHold");
			Assert.assertEquals(PropertyStatus.getText(), "OnHold");
		}

		public void VerifyIncidentReportStatusAsOnHold() {
			WebElement ReportStatus = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "OnHold");
			Assert.assertEquals(ReportStatus.getText(), "OnHold");
		}

		public void VerifyPropertyStatusAsLocked() {
			WebElement PropertyStatus = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Locked");
			Assert.assertEquals(PropertyStatus.getText(), "Locked");
		}

		public void clickAddReportButton() {
			uIMapRecords.caseUpdate.reportingTab.uIAddReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveInternalTab() {
			uIMapRecords.caseUpdate.reportingTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void ClickRefreshButton() {
			uIMapRecords.caseUpdate.reportingTab.uIRefreshButton.click();
		}

		public void ClickViewCaseFileButton() {
			uIMapRecords.caseUpdate.reportingTab.uIViewCaseFileButton.click();
		}

		public void selectRowByAtType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.reportingTab.uIReportingTable, PoliceData.getRecordsModuleValue("Type"));
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}
		public void selectRowByAtTypeByIndex(int rowIndex) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.reportingTab.uIReportingTable, PoliceData.getRecordsModuleValue("Type"), rowIndex);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void VerifyTypeAsStatementReport(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Statement Report", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex));
		}

		public void VerifyColumnValueAtOfficer() {
			Playback.controlReadyThreadWait();
			List<String> officerValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Officer");
			if(officerValues.get(0).contains(","))
			{
			verify.ExpectedValueIsTrue(officerValues.contains(PoliceData.getRecordsModuleValue("Officer")));
			}
			else
			{
			verify.ExpectedValueIsTrue(officerValues.contains(PoliceData.getRecordsModuleValue("OfficerPF")));
			}
		}

		public void VerifyIncidentReportRowAtOfficer(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains(PoliceData.getRecordsModuleValue("Officer")));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains("Incident Report"));
		}

		public void VerifyArrestRowAtOfficer(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains(PoliceData.getRecordsModuleValue("Officer")));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains("Arrest Report"));
		}

		public void VerifySupplementReportRowAtOfficer(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains(PoliceData.getRecordsModuleValue("Officer")));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, rowIndex).getText()
					.contains("Supplemental Report"));
		}

		public void VerifyTypeAsIncidentReport(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Incident Report", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex));
		}

		public void VerifyAtType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable,
									PoliceData.getRecordsModuleValue("Type"), "Type")
							.getText());
		}
		public void VerifyAtType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type"),
					objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex));
		}
		public void VerifyReportTypeAsK9Report() {
			verify.ExpectedPropertyValueIsEqual("K9 Incident Detail.PDF",
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable,
									"K9", "Type")
							.getText());
		}
		public void VerifyReportTypeAsK9Report(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("K9 Incident Detail.PDF",
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex));
		}



		public void VerifyTypeAsPropertyReportInGrid() {
			verify.ExpectedPropertyValueIsEqual("Property Report", objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Property Report", "Type")
					.getText());
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.reportingTab.uIReportingTable, PoliceData.getRecordsModuleValue("Status"));
		}

		public void SelectAtStatus1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.reportingTab.uIReportingTable, PoliceData.getRecordsModuleValue("Status1"));
		}

	public void SelectAtStatus2() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.reportingTab.uIReportingTable, PoliceData.getRecordsModuleValue("Status2"));
		}

		public void VerifyStatusAsRejectedInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Rejected", objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status", rowIndex).getText());

		}

		public void VerifyViewCaseSelectAllCheckboxChecked() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.reportingTab.uIViewCaseFilePopUpScreenSelectAllCheckbox.isSelected());
		}

		public void VerifyViewCaseIncludePropertyReportCheckboxChecked() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.reportingTab.uIViewCaseFilePopUpScreenIncludeProeprtyReportCheckbox
							.isSelected());
		}

		public void VerifyViewCasePDFOpened() {
			objectIdentification.windowHandle.switchToWindowUsingURL("IncPropRpt");
			objectIdentification.windowHandle.switchToWindowUsingURL("IncPropRpt").close();
		}

		public void ClickShowPDFButton() {
			uIMapRecords.caseUpdate.reportingTab.uIViewCaseFilePopUpScreenShowPDFButton.click();
		}

		public void VerifyStatusAsApprovedInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status", rowIndex).getText());

		}

		public void VerifyStatusColumnLocked() {
			Playback.controlReadyThreadWait();
			List<String> statusValue = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status");
			verify.ExpectedValueIsTrue(statusValue.contains("Locked"));
		}

		public void ClickIncludeCombinedCheckBox() {

			Playback.controlReadyThreadWait();
			uIMapRecords.caseUpdate.reportingTab.uIIncludeCombinedCheckBox.click();
		}

		public void ClickSelectAllCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseUpdate.reportingTab.uISelectAllCheckBox.click();
		}

		public void verifyPopupIncidentReportsOnHoldViewed() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.reportingTab.uIIncidentReportCheckBox
					.getAttribute("title").contains("Incident Report"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.reportingTab.uIIncidentReportStatusTextView.getText().contains("On Hold"));
		}
		public void verifyPopupReportsAsSupplimentalSubmitted(int no) {
					no=no+1;
		WebElement report =	Playback.driver.findElement(By.xpath("(//label[contains(@for,'chkIncAll')])["+no+"]"));
			verify.ExpectedValueIsTrue(report
					.getAttribute("title").contains("Supplemental Report"));
			verify.ExpectedValueIsTrue(
					report.findElement(By.tagName("span")).getText().contains("Submitted"));
		}
		public void verifyPopupReportsAsK9S(int no) {
			no=no+2;
			WebElement report =	Playback.driver.findElement(By.xpath("(//label[contains(@for,'chkIncAll')])["+no+"]"));
				verify.ExpectedValueIsTrue(report
						.getAttribute("title").contains("K9 Incident"));
	
			}


		public void verifyPopupPropertyReportLockedViewed() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.reportingTab.uIPropertyReportCheckBox
					.getAttribute("title").contains("Property report"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseUpdate.reportingTab.uIPropertyReportStatusTextView.getText().contains("Locked"));
		}

		public void verifyPopupPropertyReportviewed() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.reportingTab.uIPropertyReportCheckBox
					.getAttribute("title").contains("Property report"));
		}

		public void verifyAccessDeniedPopup() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("(36) Access denied until the report has been approved");
		}

		public void VerifyAccesRestrictedForPress61() {
			popup.acknowledge.okWithExpectedMessage("(36) Access denied until the report has been approved");
		}

		public void verifyPropertyReportStatusAsLocked(int rowIndex) {
			WebElement PropertyStatus = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PropertyStatus.getText(), "Locked");
		}

		public void verifyPropertyReportGenetatedTime(String Datetime, int rowIndex) {
			WebElement PropertyStatus = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Date Time", rowIndex);
			System.out.println(PropertyStatus.getText());
			System.out.println(Datetime);
			verify.ExpectedValueIsTrue(PropertyStatus.getText().contains(Datetime));

		}

		public void verifyAtStatusColumn() {
			Playback.pageLoadThreadWait();
			List<String> statusValue = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status");
			verify.ExpectedValueIsTrue(statusValue.contains(PoliceData.getRecordsModuleValue("Status")));
		}

		public void enterSortOrderInReportsGridAs0(int rowIndex) {

			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Sort Order", rowIndex);
			Actions action = new Actions(Playback.driver);
			action.doubleClick(gridCell).build().perform();
			action.sendKeys("0").build().perform();

		}

		public void enterSortOrderInReportsGridAs1(int rowIndex) {

			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Sort Order", rowIndex);
			Actions action = new Actions(Playback.driver);
			action.doubleClick(gridCell).build().perform();
			action.sendKeys("1").build().perform();

		}

		public void enterSortOrderInReportsGridAs2(int rowIndex) {

			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Sort Order", rowIndex);
			Actions action = new Actions(Playback.driver);
			action.doubleClick(gridCell).build().perform();
			action.sendKeys("2").build().perform();

		}

		public void enterSortOrderInReportsGridAs3(int rowIndex) {

			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Sort Order", rowIndex);
			Actions action = new Actions(Playback.driver);
			action.doubleClick(gridCell).build().perform();
			action.sendKeys("3").build().perform();

		}

		public void verifyArrestDocketInGrid() {
            // TODO Auto-generated method stub
            verify.ExpectedPropertyValueIsEqual("Arrest Docker.pdf", objectIdentification.manualIdentify.getGridCell(
           uIMapRecords.caseUpdate.reportingTab.uIReportingTable,"Arrest Docker.pdf", "Type").getText());
}

		public void verifyTypeAsSupplementReport(int rowIndex)
    {
        verify.ExpectedPropertyValueIsEqual("Supplement Report", objectIdentification.manualIdentify.getGridCellInnerText(
            uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex));
    }

		public void verifyReportTypeAsSupplementReport(int rowIndex)
	    {
	        verify.ExpectedValueIsTrue(( objectIdentification.manualIdentify.getGridCellInnerText(
	            uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Type", rowIndex)).contains("Supplemental Report"));
	    }
		public void verifyAsTrafficSummons()
	    {
	        verify.ExpectedPropertyValueIsEqual("TrafficSummons.pdf", objectIdentification.manualIdentify.getGridCell(
	                               uIMapRecords.caseUpdate.reportingTab.uIReportingTable,"TrafficSummons.pdf", "Type").getText());
	    }

		public void verifyIncidentReportStatusAsReportDue()
	    {
	        WebElement ReportStatus = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.reportingTab.
	            uIReportingTable, "Report Due");
	        Assert.assertEquals(ReportStatus.getText(), "Report Due");
	    }

		public String readReportType(int idx) {
		String report =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseUpdate.reportingTab.
		            uIReportingTable, "Type", idx);
			return report;
		}

		
public void verifyRowCountIsZeroInGrid() 
        {
            verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
                    .getGridTableRowsCount(uIMapRecords.caseUpdate.reportingTab.uIReportingTable) == 0);
        }


public void deleteAtTypeInGrid() 
        { 
            objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable,
                    PoliceData.getRecordsModuleValue("Type"));    
					// popup.confirm.yes();        
        }
		public void SelectAtReportTypeInGrid() 
	{ 
    objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable,
            PoliceData.getRecordsModuleValue("Type"));    
			// popup.confirm.yes();        
	}
	public void verifyIncidentReportCannotDeleteAcknowledgeMessage() 
	{
    popup.acknowledge.okWithExpectedMessage("(7234) Incident Report cannot be deleted.");            
	}
	public void verifyAccessDeniedAcknowledgeMessage() 
	{
    popup.acknowledge.okWithExpectedMessage("(39) Access denied for Screen ID 94");
	}

	public void verifyIncidentReportStatusAsApproved() {
        WebElement ReportStatus = objectIdentification.manualIdentify
                .getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Approved");
        Assert.assertEquals(ReportStatus.getText(), "Approved");
    }

    public void verifyIncidentReportStatusAsLocked() {
        WebElement ReportStatus = objectIdentification.manualIdentify
                .getGridCell(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Locked");
        Assert.assertEquals(ReportStatus.getText(), "Locked");
    }

	public void verifyQAFormEntryInViewCaseFilePopup() {
            WebElement allElements = Playback.driver.findElement(By.xpath("//div[@id='divPreview']"));
            List<WebElement> allLabels = allElements.findElements(By.tagName("//label"));
            for (WebElement label : allLabels) {
                if (label.getText().startsWith(" Q")) {
                    verify.ExpectedValueIsTrue(label.getText().contains(" QA Form"));
 
                }
            }
        }

	public void clickCancelInViewCaseFilePopup() {
        Playback.driver.findElement(By.id("cmdIncCancel")).click();

    }


	public void verifyTypeAsK9IncidentDetailPDF() 
	{
	WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "K9 Incident Detail.PDF");
							verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains("K9 Incident Detail.PDF"));
	}
		public void verify39AccessDeniedAckMsg() {
		popup.acknowledge.okWithExpectedMessage("(39) Access denied for Screen ID 2510");
		
	}

		 public void verifyAtStatusColumn1() {
			Playback.pageLoadThreadWait();
			List<String> statusValue = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.reportingTab.uIReportingTable, "Status");
			verify.ExpectedValueIsTrue(statusValue.contains(PoliceData.getRecordsModuleValue("Status1")));
		}
		
		public void verifyRowCountIsOneInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.caseUpdate.reportingTab.uIReportingTable) == 1);
		}
	}

	public class CaseUpdateNamesTab {
		public void VerifyAtLastNameAndFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getRecordsModuleValue("LastName") + ", " + PoliceData.getRecordsModuleValue("FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, "Name", rowIndex));
		}

		public void VerifyActivityAsVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Victim", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, "Activity", rowIndex));
		}

		public void VerifyAtNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable,
									PoliceData.getRecordsModuleValue("Name"))
							.getText());
		}

		public void VerifyNamesTabGridBlank() {
			verify.ExpectedIntergerValueIsEqualToActual(0, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable));
		}

		public void VerifyJurisNameNotShowingInAddressColumn(int rowIndex) {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Address", rowIndex)
					.contains("SO"));
		}

		public void ClickLeokaIcon() {
			uIMapRecords.caseUpdate.caseUpdateNamesTab.uILeokaIcon.click();
			Playback.gridLoadThreadWait();
		}

		public void VerifyAtActivityInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Activity", rowIndex));
		}

		public void VerifyColumnValuesAtActivity() {
			List<String> activityValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Activity");
			verify.ExpectedValueIsTrue(activityValues.contains(PoliceData.getRecordsModuleValue("Activity")));
		}

		public void VerifyAddedNamesRowCountInGrid() {
			verify.ExpectedPropertyValueIsEqual("2", String.valueOf(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable)));
		}

		public void VerifyAtActivity1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Activity", rowIndex));
		}

		public void VerifyAtActivity2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Activity", rowIndex));
		}

		public void VerifyAtName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex));
		}

		public void VerifyAtName2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex));
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex));
		}

		public void ClickDomesticViolanceIconUsingVictim() {

			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, "Victim");
			WebElement uIDVCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, row, "D");
			uIDVCell.click();
		}

		public void clickVictimOffenderIcon(int rowIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, "V/O", rowIndex)
					.click();
		}

		public void VerifyNameLeokaUsingName() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable,
									PoliceData.getRecordsModuleValue("Name"), "Activity")
							.getText().contains("Name Leoka"));
		}

		public void SelectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, PoliceData.getRecordsModuleValue("Name"));
		}

		public void VerifyAtHNamesInGrid(int rowIndex) {
			if(rowIndex==0)
			{
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("HName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex));
			}
			else
			{
				verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("HName"+rowIndex+""),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex));
			}
		}

		public void verifyAtNameWithAtActivity() {
			List<WebElement> rows = uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			for (int i = 0; i < rows.size(); i++) {

				String activity = objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Activity", i).getText();
				String name = objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", i).getText();
				if (name.startsWith("C") && activity.startsWith("V")) {
					verify.ExpectedValueIsTrue(activity.equals(PoliceData.getRecordsModuleValue("Activity"))
							& name.equals(PoliceData.getRecordsModuleValue("Name")));
				}

				else if (name.startsWith("C") && activity.startsWith("A")) {
					verify.ExpectedValueIsTrue(activity.equals(PoliceData.getRecordsModuleValue("Activity1"))
							& name.equals(PoliceData.getRecordsModuleValue("Name")));
				}

				else if (name.startsWith("D") && activity.startsWith("V")) {
					verify.ExpectedValueIsTrue(activity.equals(PoliceData.getRecordsModuleValue("Activity"))
							& name.equals(PoliceData.getRecordsModuleValue("Name1")));
				}

				else {
					verify.ExpectedValueIsTrue(activity.equals(PoliceData.getRecordsModuleValue("Activity1"))
							& name.equals(PoliceData.getRecordsModuleValue("Name1")));
				}
			}
		}

		public void verifyAccessDeniedPopup() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("(36) Access denied until the report has been approved");
		}

		public void selectAtActivityInGrid() {
//	            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, PoliceData.getRecordsModuleValue("Activity"), rowIndex);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable,
					PoliceData.getRecordsModuleValue("Activity"));
		}

		public void VerifyAtName1InGridByLastNameFirstName(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("LastName1")));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTable, "Name", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("FirstName1")));
		}

		public void verifyAtAddressContainsJurisAlias()
		{
			 String actualAddress  =uIMapRecords.caseUpdate.caseUpdateNamesTab.uIAddressEdit.getAttribute("value");
			 verify.ExpectedValueIsTrue( actualAddress.contains(PoliceData.getRecordsModuleValue("JurisAlias")));
		 
		}
		
		 public void VerifyActivityAsProperty(int rowIndex)
	        {
	            verify.ExpectedPropertyValueIsEqual("Property", objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable, "Activity", rowIndex));
	        }

		 public void verifyRowCountAs0()
	        {
	            verify.ExpectedIntergerValueIsEqualToActual(0, objectIdentification.manualIdentify
	                    .getGridTableRowsCount(uIMapRecords.caseUpdate.caseUpdateNamesTab.uINamesTabResultTable));
	        }

		 public void VerifyDVIconAsGreen() {

				uIMapRecords.caseUpdate.caseUpdateNamesTab.uIDVEntryIcon.getAttribute("src").contains("DVName");

			}
			public void verifyDvIconAsYellow() {
				System.out.println(uIMapRecords.caseUpdate.caseUpdateNamesTab.uIDVEntryIcon.getAttribute("src"));
				uIMapRecords.caseUpdate.caseUpdateNamesTab.uIDVEntryIcon.getAttribute("src").contains("ico_16_1022.gif");

			}
	}

	public class CaseUpdateCaseDataTab {
		
		public void enterAtCharge() {
			
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}
		}

		public void clickCFSAddButton() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIADDCFSButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyUsedBodyWornCheckboxChecked() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIUsedBodyWornCheckBox.getAttribute("checked")));
		}

		public void ClickUseBodyWornCameraCheckbox() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIUsedBodyWornCheckBox.click();
		}

		public void SelectRowByAtCharge() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSGridResultTable,
					PoliceData.getRecordsModuleValue("Charge"));

		}

		public void SelectDomesticViolence() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox);
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtDomesticViolence() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox,
					PoliceData.getRecordsModuleValue("DomesticViolence"));
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox.sendKeys(Keys.TAB);
		}

		public void selectDomesticViolenceAsNo() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox, "No");
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox.sendKeys(Keys.TAB);
		}

		public void selectPoliceForceUsedAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPoliceForceUsedComboBox, "None");
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPoliceForceUsedComboBox.sendKeys(Keys.TAB);
		}

		public void saveInternalTab() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void tabOccurredAtDateTime() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtDateEdit.click();
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtTimeEdit.sendKeys(Keys.TAB);
		}

		
		public void EnterAtCFS1() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CFS1"));
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCFS2() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CFS2"));
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDateShowsInOccurredDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtDateEdit.getAttribute("value"));
		}

		public void VerifyAtCFSInGrid() {
			List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSGridResultTable, "CFS");
			verify.ExpectedValueIsTrue(cellValues.contains(PoliceData.getRecordsModuleValue("CFS")));
		}

		public void VerifyAtCFS1InGrid() {
			List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSGridResultTable, "CFS");
			verify.ExpectedValueIsTrue(cellValues.contains(PoliceData.getRecordsModuleValue("CFS1")));
		}

		public void VerifyAtCFS2InGrid() {
			List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSGridResultTable, "CFS");
			verify.ExpectedValueIsTrue(cellValues.contains(PoliceData.getRecordsModuleValue("CFS2")));
		}

		public void ClickPursuitButton() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPursuitButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPursuitButtonBold() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPursuitButton
					.getAttribute("class").contains("CustomBtnBold"), "Verify Pursuit button shows bold");
		}

		public void VerifyAtChargeInGrid() {
			List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSGridResultTable, "Charge");
			verify.ExpectedValueIsTrue(cellValues.contains(PoliceData.getRecordsModuleValue("Charge")));
		}

		public void SelectDomesticViolenceAsYes() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox, "Yes");
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox.sendKeys(Keys.TAB);
		}

		public void clickChargeLookUpIcon() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIChargeLookupIcon.click();

		}

		public void clickUnknownCheckBox() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIUnknownCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void enterOccuredBetweenDateAsCurrentDate() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredBetweenDateEdit.click();
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredBetweenDateEdit
					.sendKeys(Randomized.getCurrentDate());
			Playback.controlReadyThreadWait();
		}

		public void verify1051UpdateDataExistsCaseDataTabAckMsg() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Case Data Tab. You must save or reset.");
		}

		public void verifyInCarVideoAvailableCheckboxIsSelected() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIInCarVideoCheckBox.isSelected());
		}

		public void clickInCarVideoAvailableCheckbox() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIInCarVideoCheckBox.click();
		}

		public void verifyInCarVideoAvailableCheckboxIsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIInCarVideoCheckBox.isEnabled());
		}

		public void verifyIdentityTheftInRedColor() {
//		 redColor code = rgb(153, 0, 0)
			String attribute = uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIIdentityTheft.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("rgb(153, 0, 0)"));
		}

		public void selectAtIdentityTheft() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIIdentityTheftComboBox,
					PoliceData.getRecordsModuleValue("IdentityTheft"));
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIIdentityTheftComboBox.sendKeys(Keys.TAB);
		}

		public void clickSaveInternalTab() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIInternalSaveButton.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyUserDefinedCodeAcwkMsg() {
			popup.acknowledge.okWithExpectedMessage("(7091) User Defined Code is a mandatory field");
		}

		public void verifyDACheckboxEnabled() {
            verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICaseFileSentToDACheckbox.isDisplayed());
            verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICaseFileSentToDACheckbox.isEnabled());
        }
		public void clickDACheckbox() {
            uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICaseFileSentToDACheckbox.click();
        }

		//Added for Testcase278657 Mohan
				public void selectEvidenceAsOther() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIEvidenceComboBox, "Other");
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIEvidenceComboBox.sendKeys(Keys.TAB);
				}
				//Added for Testcase278657 Mohan
				public void enterAtEvidenceText() {
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIEvidenceTextBox
							.sendKeys(PoliceData.getRecordsModuleValue("Other"));
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIEvidenceTextBox.sendKeys(Keys.TAB);
				}

				public void clickEvidenceAddButton() {
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIADDEvidenceButton.click();
					Playback.controlReadyThreadWait();
				}

		public void verifyOccuredAtAcknowledgePopup() {
			popup.acknowledge.okWithExpectedMessage("(7080) Enter Occurred From/Occurred To (or) Occurred At");
		}

		public void clickResetButton() {
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIResetButton.click();
		}

		public void verifyPoliceForceUsedSelectedAsNone() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPoliceForceUsedComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, "None");
		}

		public void verifyDomesticViolenceSelectedAsNo() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIDomesticViolenceComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, "No");
		}

		public void VerifyOccurredAtDateIsSameAsReportedDate(String reportedDate) {
			verify.ExpectedPropertyValueIsEqual(reportedDate,
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtDateEdit.getAttribute("value"));
		}

		public void VerifyOccurredAtTimeIsSameAsReportedTime(String reportedTime) {
			verify.ExpectedPropertyValueIsEqual(reportedTime,
					uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIOccuredAtTimeEdit.getAttribute("value"));
		}

		public void enterAtCharge1() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS1"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}

		}
				
	}

	public class MOTab {
		public void SelectAtType() {
			// uIMapRecords.caseUpdate.mOTab.uITypeComboBox.sendKeys(PoliceData.getRecordsModuleValue("Type"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uITypeComboBox,
					PoliceData.getRecordsModuleValue("Type"));
			uIMapRecords.caseUpdate.mOTab.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtCategory() {
			// uIMapRecords.caseUpdate.mOTab.uICategoryComboBox.sendKeys(PoliceData.getRecordsModuleValue("Category"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uICategoryComboBox,
					PoliceData.getRecordsModuleValue("Category"));
			uIMapRecords.caseUpdate.mOTab.uICategoryComboBox.sendKeys(Keys.TAB);
			Playback.threadWait(5000);
		}

		public void SelectAtDetail() {
			// uIMapRecords.caseUpdate.mOTab.uIDetailComboBox.sendKeys(PoliceData.getRecordsModuleValue("Detail"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uIDetailComboBox,
					PoliceData.getRecordsModuleValue("Detail"));
			uIMapRecords.caseUpdate.mOTab.uIDetailComboBox.sendKeys(Keys.TAB);
		}

		public void EnterComments() {
			uIMapRecords.caseUpdate.mOTab.uICommentsEdit.sendKeys(Randomized.randomString(10));
		}

		public void ClickAddButton() {
			uIMapRecords.caseUpdate.mOTab.uIAddButton.click();
		}

		public void VerifyAtType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getRecordsModuleValue("Type") + "-" + PoliceData.getRecordsModuleValue("Category") + "-"
							+ PoliceData.getRecordsModuleValue("Detail"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseUpdate.mOTab.uIMOTabTable,
							"Type/ Category/ Detail", rowIndex));
		}

		public void ClickSaveButtonMOTab() {
			uIMapRecords.caseUpdate.mOTab.uISaveButton.click();
			popup.confirm.yes();
		}
	}

	public class UCRTab {

		public void EnterAtUCRCode() {
			uIMapRecords.caseUpdate.uCRTab.uIUCRCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("UCRCode"));

		}

		public void EnterUCRDisposition() {
			uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionEdit.sendKeys("Arrested Adult");
		}

		public void EnterAtUCRDisposition() {
			uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionEdit.clear();
			uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionEdit
					.sendKeys(PoliceData.getRecordsModuleValue("UCRDisposition"));
		}

		public void EnterOfficerAssaulted() {
			uIMapRecords.caseUpdate.uCRTab.uIOfficerAssaultedEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumbers(2)));
		}

		public void EnterOfficerKilled() {
			uIMapRecords.caseUpdate.uCRTab.uIOfficersKilledEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumbers(2)));
		}

		public void ClickArsonInvolvedCheckbox() {
			uIMapRecords.caseUpdate.uCRTab.uIArsonInvolvedCheckbox.click();
		}

		public void ClickUninhabitedCheckbox() {
			uIMapRecords.caseUpdate.uCRTab.uIUninhabitedCheckbox.click();
		}

		public void EnterVictimCount() {
			uIMapRecords.caseUpdate.uCRTab.uIVictimCountEdit.sendKeys(String.valueOf(Randomized.getRandomNumbers(2)));
		}

		public void TabOutClearanceDate() {
			uIMapRecords.caseUpdate.uCRTab.uIClearanceDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.caseUpdate.uCRTab.uIClearanceTimeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyClearanceDateTextAppearsRedColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uCRTab.uIClearanceDateTextView.getAttribute("style")
					.contains("rgb(153, 0, 0)"));
		}

		public void SelectPropertyClassification() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.caseUpdate.uCRTab.uIPropertyClassificationComboBox);
		}

		public void SelectPropertyClassificationAsA() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.caseUpdate.uCRTab.uIPropertyClassificationComboBox, "A");
		}

		public void VerifyAtUCRLineNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRLineNo"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRLineNoEdit.getAttribute("value"));
		}

		public void EnterAtPropertyDamagedValue() {
			uIMapRecords.caseUpdate.uCRTab.uIPropertyDamagedEdit
					.sendKeys(PoliceData.getRecordsModuleValue("PropertyDamaged"));

		}

		public void SelectUCRDisposition() {
			uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionLookup.click();
			Playback.popupThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterAtOfficerAssaulted() {
			uIMapRecords.caseUpdate.uCRTab.uIOfficerAssaultedEdit
					.sendKeys(PoliceData.getRecordsModuleValue("OfficerAssaulted"));
		}

		public void EnterAtOfficerKilled() {
			uIMapRecords.caseUpdate.uCRTab.uIOfficersKilledEdit
					.sendKeys(PoliceData.getRecordsModuleValue("OfficerKilled"));
		}

		public void EnterAtVictimCount() {
			uIMapRecords.caseUpdate.uCRTab.uIVictimCountEdit.sendKeys(PoliceData.getRecordsModuleValue("VictimCount"));
		}

		public void SelectAtPropertyClassification() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.uCRTab.uIPropertyClassificationComboBox,
					PoliceData.getRecordsModuleValue("PropertyClassification"));
		}

		public void VerifyAtUCRCode() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRCode"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRCodeEdit.getAttribute("value"));
		}

		public void VerifyAtOfficerAssaulted() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OfficerAssaulted"),
					uIMapRecords.caseUpdate.uCRTab.uIOfficerAssaultedEdit.getAttribute("value"));
		}

		public void VerifyAtOfficerKilled() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OfficerKilled"),
					uIMapRecords.caseUpdate.uCRTab.uIOfficersKilledEdit.getAttribute("value"));
		}

		public void VerifyAtUCRDisposition() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRDisposition"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionEdit.getAttribute("value"));
		}

		public void VerifyAtUCRDispositionDescription() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRDispositionDescription"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRDispositionDescriptionEdit.getAttribute("value"));
		}

		public void VerifyAtUCRMethod() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRMethod"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRMethodEdit.getAttribute("value"));
		}

		public void VerifyClearanceDate() {
			String ClearanceDate = Randomized.getCurrentDate();
			verify.ExpectedPropertyValueIsEqual(ClearanceDate,
					uIMapRecords.caseUpdate.uCRTab.uIClearanceDateEdit.getAttribute("value"));
		}

		public void VerifyAtVictimCount() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("VictimCount"),
					uIMapRecords.caseUpdate.uCRTab.uIVictimCountEdit.getAttribute("value"));
		}

		public void VerifyAtPropertyClassification() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PropertyClassification"),
					objectIdentification.manualIdentify
							.getDropDwonSelectedItem(uIMapRecords.caseUpdate.uCRTab.uIPropertyClassificationComboBox));
		}

		public void VerifyAtPropertyDamaged() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uCRTab.uIPropertyDamagedEdit.getAttribute("value")
					.contains(PoliceData.getRecordsModuleValue("PropertyDamaged")));
		}

		public void VerifyAtMgmtCFS() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("MgmtCFS"),
					uIMapRecords.caseUpdate.uCRTab.uIMgmtCFSEdit.getAttribute("value"));
		}

		public void VerifyAtCADCFS() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CADCFS"),
					uIMapRecords.caseUpdate.uCRTab.uICADCFSEdit.getAttribute("value"));
		}

		public void VerifyAtCADDisposition() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CADDisposition"),
					uIMapRecords.caseUpdate.uCRTab.uICADDispositionEdit.getAttribute("value"));
		}

		public void VerifyAronInvolvedCheckboxIsSelected() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uCRTab.uIArsonInvolvedCheckbox.isSelected());
		}

		public void VerifyUninhabitedCheckboxIsSelected() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.uCRTab.uIArsonInvolvedCheckbox.isSelected());
		}

		public void VerifyAtUCRCodeDescription() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UCRCodeDescription"),
					uIMapRecords.caseUpdate.uCRTab.uIUCRCodeDescriptionEdit.getAttribute("value"));
		}

	}

	public class NIBRSCheckTab {

		public void SelectAtClearenceType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.caseUpdate.nIBRSCheckTab.uIClearenceTypeComboBox,
					PoliceData.getRecordsModuleValue("ClearenceType"));
		}

		public void TabOutDateTime() {
			uIMapRecords.caseUpdate.nIBRSCheckTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.caseUpdate.nIBRSCheckTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickSaveButton() {
			uIMapRecords.caseUpdate.nIBRSCheckTab.uIDateEdit.click();

		}

		public void VerifyAtErrorNo(int rowIndex) {
			String df = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ErrorNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyAtCFS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyAtDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyAtErrorNo1(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ErrorNo1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyAtCFS1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyAtCFS2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyAtDescription1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsAgeOfArresteeIsMandatoryFiled(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Age of Arrestee - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Sex (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Race (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthinicityOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Ethnicity (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Resident of Arrestee - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Sex (of Arrestee) should be proper values(Code Type: 1085) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Sex (of Arrestee) should be proper values(Code Type: 1085)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Race (of Arrestee) should be proper values(Code Type: 1011) -"
								+ " Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Race (of Arrestee) should be proper values(Code Type: 1011) -"
								+ " Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthnicityOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Ethnicity of Arrestee should be proper values(Code Type: 2069)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Ethnicity of Arrestee should be proper values(Code Type: 2069) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Resident (of Arrestee) should be proper values(Code Type: 1087) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Resident (of Arrestee) should be proper values(Code Type: 1087) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));

		}

		public void VerifyDescriptionAsHowArrestShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):How Arrest should be proper code values(Code Type: 1009) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):How Arrest should be proper code values(Code Type: 1009) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsArmed1ShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed1 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed1 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsArmed2ShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed2 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed2 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyAtCFS1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyErrorNoAs74InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("74", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyErrorNoAs390InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("390", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyError74DescriptioninGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "74", "Description").getText()
					.contains("Property record (Level 3) must exist with this offense"));
		}

		public void VerifyError390DescriptioninGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "390", "Description")
					.getText().contains(
							"Invalid combination of Offense and Property. Expecting Motor Vehicle theft(240) Offense for selected Property description"));
		}

		public void VerifyError604DescriptioninGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "604", "Description")
					.getText().contains("How Arrest should be proper code values(Code Type: 1009)"));
		}

		public void VerifyDescriptionAsAgeOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Age of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Sex of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Race of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Resident of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Sex of Victim should be proper values(Code Type:1085) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Race of Victim should be proper values(Code Type:1011) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthnicityOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Ethinicity of Victim should be proper values(Code Type:2069) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Resident of Victim should be proper values(Code Type:1087) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsAttemptedOrCompletedShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"FTC(2530):Attempted/Completed should be proper code values(Code Type:1114) - Invalid Code",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSuspectedOfUsingShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"FTC(2530):Offender(s) Suspected of Using should be proper code values(Code Type:1041) - Invalid data value – Not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyErrorCheckCompletedLabel() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("NIBRS Error check has been Completed",
					uIMapRecords.caseUpdate.nIBRSCheckTab.uINoErrorLabel.getText());
		}

		public void VerifyCFSEntryTypeBError(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("CFS entry required for type B arrest. - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsPropertyRecordMustExist(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(
					"Property Entry(3223): Property Record must exist with this Offense - Property record (Level 3) must exist with this offense",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void verifyAtDescriptionInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description");
			String data = PoliceData.getRecordsModuleValue("DescriptionInGrid");
			for (String rowValue : gridTableColumnValues)
				if (rowValue.contains(data))
					verify.ExpectedValueIsTrue(rowValue.contains(data));
		}

	}

	

	public class ActivityLogTab {

		public void SelectAtCode() {
			uIMapRecords.caseUpdate.activityLogTab.uICodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Code"));
			uIMapRecords.caseUpdate.activityLogTab.uICodeEdit.sendKeys(Keys.TAB);
		}
		public void EnterAtCode() {
			uIMapRecords.caseUpdate.activityLogTab.uICodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Code"));
			uIMapRecords.caseUpdate.activityLogTab.uICodeEdit.sendKeys(Keys.TAB);
		}

		public String ReadCodeDescription() {

			String code = uIMapRecords.caseUpdate.activityLogTab.uICodeDescriptionEdit.getAttribute("title");
			return code;
		}

		public void EnterAtHeading() {
			uIMapRecords.caseUpdate.activityLogTab.uIHeadingEdit.sendKeys(PoliceData.getRecordsModuleValue("Heading"));
			uIMapRecords.caseUpdate.activityLogTab.uIHeadingEdit.sendKeys(Keys.TAB);
		}

		public void ClickEnterCommentsButton() {
			uIMapRecords.caseUpdate.activityLogTab.uIEnterCommentsButton.click();
		}

		public void VerifyAtCode() {
			WebElement time = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable,
					PoliceData.getRecordsModuleValue("Code"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Code"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, time, "Code")
							.getText());
		}

		public void VerifyAtHeading() {
			WebElement coin = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable,
					PoliceData.getRecordsModuleValue("Code"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Heading"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, coin, "Heading")
							.getText());
		}

		public void VerifyAtEmpName() {
			WebElement emp = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable,
					PoliceData.getRecordsModuleValue("Code"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("EmpName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, emp, "Emp Name")
							.getText());
		}

		public void VerifyAtCodeDescription(String CodeDescription) {
			WebElement code = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, CodeDescription);
			verify.ExpectedPropertyValueIsEqual(CodeDescription, objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, code, "Code").getText());
		}

		public void VerifyAtDate() {
			String currentDate = Randomized.getCurrentDate("MM/DD/YY");
			WebElement date = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, currentDate);
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.activityLogTab.uIActivityLogTabTable, date, "Date Time")
					.getText().contains(currentDate));
		}
	}

	public class CaseUpdateVehicleTab {
		public void VerifyAtActivityinGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable, "Activity", rowIndex));
		}

		public void VerifyActivityAsStolen(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Stolen", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable, "Activity", rowIndex));
		}

		public void VerifyActivityAsTow(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Tow", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable, "Activity", rowIndex));
		}

		public void ClickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable,
					PoliceData.getRecordsModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtVehicle() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Vehicle"),
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleEdit.getAttribute("value"));
		}

		public void VerifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("NameID").substring(0, 1),
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("NameID").substring(2),
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uINameIDEdit.getAttribute("value"));
		}

		public void deleteExsistingRowInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable,
					PoliceData.getTestContextData("Activity"));
		}

		public void verifyTowEntryIsRetainedPopup() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge
						.okWithExpectedMessage("(6040) If Tow Entry is retained, the vehicle cannot be deleted.");
			} else {
				popup.switchToAcknowledge();
				Playback.controlReadyThreadWait();
				popup.acknowledge
						.okWithExpectedMessage("(6040) If Tow Entry is retained, the vehicle cannot be deleted.");
			}
		}

		  public void clickAtActivityInGrid()
	        {
	            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIVehicleTabTable, PoliceData.getRecordsModuleValue("Activity"));
	        }
	        
	        public void verifyAtName()
	        {
	       	 String lastName = uIMapRecords.caseUpdate.caseUpdateVehicleTab.uILastNameEdit.getAttribute("value");
	       	 String firstName = uIMapRecords.caseUpdate.caseUpdateVehicleTab.uIFirstNameEdit.getAttribute("value");
	       	 verify.ExpectedValueIsTrue(lastName.contains(PoliceData.getRecordsModuleValue("LastName")));
	       	 verify.ExpectedValueIsTrue(firstName.contains(PoliceData.getRecordsModuleValue("FirstName")));
	        }

	}

	public class CaseUpdateUseOfForceTab {
		public void VerifyAtOfficerInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Officer"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIUseOfForceTabTable, "Officer", rowIndex));
		}

		public void clickAddNew() {
			uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIAddNewLink.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtSubjectNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIUseOfForceTabTable,
					PoliceData.getRecordsModuleValue("SubjectName"));
		}

		public void verifyAtUOF(int RowCount, String readUOFCaseNo ) {
			String UOFNumber = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIUseOfForceTabTable, "UOF#", RowCount).getText();
			System.out.println(UOFNumber);
				verify.ExpectedPropertyValueIsEqual(UOFNumber, readUOFCaseNo);

		}
			public void verifyAtOfficerInGrid(int RowCount,String description ){
				String Officer = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIUseOfForceTabTable, "Officer", RowCount).getText();
				System.out.println(Officer);
				verify.ExpectedPropertyValueIsEqual(Officer, description);
				
			}
			public void verifyUOFNoInGrid(String uofNo) {
			String gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.caseUpdateUseOfForceTab.uIUseOfForceTabTable, "UOF#", 0)
					.getText();
			verify.ExpectedPropertyValueIsEqual(uofNo, gridCell);

		}

	}

	public class CaseUpdatePropertyTab {
		public void ClickAddNewPropertyReport() {
			uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIAddNewPropertyReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPropertyNoInGrid(String propertyYear, String propertyNumber, int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
							"Property#", rowIndex)
					.contains(propertyYear + "-" + propertyNumber));
		}

		public void VerifyAtReasonInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Reason"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable, "Reason",
							rowIndex));
		}

		public void VerifyAtValueUsingReason() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Value"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
									PoliceData.getRecordsModuleValue("Reason"), "Value")
							.getText());
		}

		public void ClickAtProprtyNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
					PoliceData.getRecordsModuleValue("PropertyNo"));
			Playback.controlReadyThreadWait();
		}

		public void ClickAtProprtyNo1InGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
					PoliceData.getRecordsModuleValue("PropertyNo1"));
			Playback.controlReadyThreadWait();
		}

		public void SelectPropertyRowInGrid(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable, rowIndex);
			Playback.controlReadyThreadWait();
		}

		public void ClickReset() {
			uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIResetButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyValueUsingReason(String value) {
			verify.ExpectedPropertyValueIsEqual(value,
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
									PoliceData.getRecordsModuleValue("Reason"), "Value")
							.getText());
		}

		public void VerifyAtStorageUsingReason() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Storage"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
									PoliceData.getRecordsModuleValue("Reason"), "Storage")
							.getText());
		}

		public void VerifyRowViewedGrayColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
							PoliceData.getRecordsModuleValue("Reason"))
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyAtPropertyNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PropertyNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable, "Property#",
							rowIndex));
		}

		public void VerifyPRIconViewInGridUsingPropertyNo() {

			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
					PoliceData.getRecordsModuleValue("PropertyNo"), "PR");
			verify.ExpectedValueIsTrue(uIPRCell.getAttribute("title").contains("Property Room"));
		}

		public void ClickAtReasonInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,
					PoliceData.getRecordsModuleValue("Reason"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtPropertyNo(String PropertyNo, int rowIndex) {
			WebElement element = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable, "Property#", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PropertyNo, element.getText());
			Playback.controlReadyThreadWait();
		}

		public void VerifyPRIconViewInGrid(int rowIndex)
        {
            WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable, "PR", rowIndex);
            verify.ExpectedValueIsTrue(gridCell.getAttribute("title").contains("Property Room"));
        }

		public void selectAtPropertyNoInGridByActiveData(String propertyNo) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEntryTable, propertyNo);
		}

		public void clickPRIconViewInGridUsingPropertyNo(String PropertyNo) {

			objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.caseUpdate.caseUpdatePropertyTab.uIPropertyEditEntryTable,PropertyNo, "PR").click();

}

	}

	public class CaseUpdateRelatedCasesTab {
		public void VerifyAtRelatedCaseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RelatedCaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIRelatedCaseTabTable, "Case#",
							rowIndex));
		}

		public void ClickAddButton() {
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveInternalTab() {
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Location"),
					uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uILocationEdit.getAttribute("value"));
		}

		public void VerifyAtCFS() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uICFSEdit.getAttribute("value"));
		}

		public void EnterNotes() {
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uINotesEdit.sendKeys(Randomized.randomString(150));
		}

		public void EnterAtNotes() {
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uINotesEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Notes"));
		}

		public void VerifyAtNotesUsingCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Notes"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIRelatedCaseTabTable,
									PoliceData.getRecordsModuleValue("CaseNo"), "Notes")
							.getText());
		}

		public void ClickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIRelatedCaseTabTable,
					PoliceData.getRecordsModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
		}

		public void EnterAtRelatedCaseNo() {
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uICaseYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(0, 2));
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uICaseNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(3));
			uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtNotesUsingRelatedCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Notes"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIRelatedCaseTabTable,
									PoliceData.getRecordsModuleValue("RelatedCaseNo"), "Notes")
							.getText());
		}
		public void verifyRelatedCaseNoInfoIconIsDisplayed()
        {
            verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIRelatedCaseInfoIcon.isDisplayed());        
        }

		public void clickResetButton() 
        {
            uIMapRecords.caseUpdate.caseUpdateRelatedCasesTab.uIInternalRefreshButton.click();
        }
	}

	public class CaseUpdateRequestTab {

		public void verifyAtRequestedByInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RequestedBy"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateRequestTab.uIRequestTabResultTable, "Requested By",
							rowIndex));
		}

		public void verifyAtRecievedDateAndTimeInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateRequestTab.uIRequestTabResultTable, "Date/Time",
							rowIndex).contains(Randomized.getCurrentDate("MM/dd/yy")));
		}
		
		public void verifyAtRequestTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RequestType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateRequestTab.uIRequestTabResultTable, "Request Type",
							rowIndex));
		}
		
		public void clickAddNew()
		{
			uIMapRecords.caseUpdate.caseUpdateRequestTab.uIAddNewButton.click();
		}
		public void verifyAtRequestNoInGrid(String reuuestNo,int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(reuuestNo,
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.caseUpdateRequestTab.uIRequestTabResultTable, "Request#", rowIndex));
		}
		
	}

	public class CaseUpdateANCATab {
		public void clickAddnew() {
			uIMapRecords.caseUpdate.caseUpdateANCATab.uIAddnewButton.click();
		}

		public void clickRefresh() {
			uIMapRecords.caseUpdate.caseUpdateANCATab.uIRefreshButton.click();
		}

		public void clickPrintIcon() {
			uIMapRecords.caseUpdate.caseUpdateANCATab.uIPrintIcon.click();
		}

		public void clickExcelIcon() {
			uIMapRecords.caseUpdate.caseUpdateANCATab.uIExcelIcon.click();
		}

		public void verifyDisplayedIcons() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateANCATab.uIAddnewButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateANCATab.uIRefreshButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateANCATab.uIPrintIcon.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateANCATab.uIExcelIcon.isDisplayed());
		}

		public void verifyActiveACENoInGrid(String readACENo)
		{
			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, readACENo).getText();
			verify.ExpectedValueIsTrue(text.contains(readACENo));
			}
		
		public void verifyAtLocationInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, "Location", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("Location")));
			}
		
		public void verifyAtComplaintTypeInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, "Complaint Type", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getRecordsModuleValue("ComplaintType")));
			}

		public void verifyOfficerAsAutomationInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, "Officer", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("Prophoenix, Automation"));
			}
		
		public void verifyReportedDateAsCurrentDateInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, "Reported Date", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(Randomized.getCurrentDate("MM/DD/YY")));
		}
		
		public void verifyCFSAsTheftInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUpdate.caseUpdateANCATab.uIANCATable, "CFS", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("1 - Theft"));
		}
	}
	public class CaseUpdateSuspectTab {

		public void clickRefreshButton() {
			uIMapRecords.caseUpdate.caseUpdateSuspectTab.uIRefreshButton.click();
		}

		public void verifyRecordCountIsNotEqualToZero() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.caseUpdate.caseUpdateSuspectTab.uISuspectTable);
			verify.ExpectedIntergerValueIsNotEqualToActual(0, rowsCount);

		}

		public void selectRowByAtLastNameAndFirstNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.caseUpdate.caseUpdateSuspectTab.uISuspectTable,
					PoliceData.getRecordsModuleValue("LastName") + ", "
							+ PoliceData.getRecordsModuleValue("FirstName"));
		}
	}

	public class CaseUpdateCadDataTab {

		public void verifyAtReportedLocationEditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIReportedLocationEdit
					.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIReportedLocationEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReportedLocation"), value);

		}

		public void verifyAtDispatcherEditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIDispatcherEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIDispatcherEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("DispatcherEdit"), value);
		}

		public void verifyAtCADCFSEditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uICADCFSEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uICADCFSEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CADCFSEdit"), value);

		}

		public void verifyAtCADDispositionEditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uICadDispositionEdit
					.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uICadDispositionEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CadDispositionEdit"), value);

		}

		public void verifyAtPrimeUnitEditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIPrimeUnitEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIPrimeUnitEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PrimeUnitEdit"), value);

		}

		public void verifyAtOfficer1EditFieldAndFieldIsDisabled() {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIOfficer1Edit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIOfficer1Edit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Officer1Edit"), value);

		}

		public void verifyAtStackedDateEditFieldAndFieldIsDisabled(String Date) {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIStackedDate.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIStackedDate.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Date, value);

		}

		public void verifyAtDispatchedDateEditFieldAndFieldIsDisabled(String Date) {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIDispatchedDateEdit
					.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIDispatchedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Date, value);

		}

		public void verifyAtArrivedDateEditFieldAndFieldIsDisabled(String Date) {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIArrivedDateEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIArrivedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Date, value);

		}

		public void verifyAtFinishedDateEditFieldAndFieldIsDisabled(String Date) {
			String attribute = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIFinishedDateEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String value = uIMapRecords.caseUpdate.caseUpdateCadDataTab.uIFinishedDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Date, value);

		}

	}

	public class WalkInEntry {

		public void save() {

			uIMapRecords.walkInEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}
		public void clickSave() {

			uIMapRecords.walkInEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
		}

		public void SelectAtJuris() {
			uIMapRecords.walkInEntry.uIJurisComboBox.sendKeys(PoliceData.getRecordsModuleValue("Juris"));
			uIMapRecords.walkInEntry.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void enterCADCFS() {

			uIMapRecords.walkInEntry.uICADCFSCodeEdit.sendKeys("783");
			uIMapRecords.walkInEntry.uICADCFSCodeEdit.sendKeys(Keys.TAB);
		}

		public void tabTheReportedDate() {

			uIMapRecords.walkInEntry.uIReportedDate.sendKeys(Keys.TAB);

		}

		public void tabTheReportedTime() {

			uIMapRecords.walkInEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectRandomLocation() {
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys("s");
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(Keys.TAB);
			geo.commonNameHelp.SelectCommonNameExceptNonValidAddress();

		}

		public void tabTheReceivedSource() {

			uIMapRecords.walkInEntry.uIRcvSourceCodeEdit.sendKeys(Keys.TAB);
		}

		public void tabTheCADDispositon() {
			uIMapRecords.walkInEntry.uICADDispositionCodeEdit.sendKeys("BI");
			uIMapRecords.walkInEntry.uICADDispositionCodeEdit.sendKeys(Keys.TAB);

		}

		public void GetLocation(String Location) {
			Location = uIMapRecords.walkInEntry.uILocationEdit.getAttribute("value");
			Playback.setTestContextAttribute("Location", Location);
		}

		public void enterAtUnit() {
			Playback.controlReadyThreadWait();
			uIMapRecords.walkInEntry.uIUnitCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Unit"));
			uIMapRecords.walkInEntry.uIUnitCodeEdit.sendKeys(Keys.TAB);
		}

		public void GetWalkInEntryDetails(Hashtable WalkInEntryDetails) {

			WalkInEntryDetails = new Hashtable();
			Select uIJuris = objectIdentification.manualIdentify
					.getSelectElement(uIMapRecords.walkInEntry.uIJurisComboBox);
			WalkInEntryDetails.put("Juris", uIJuris.getFirstSelectedOption());
			WalkInEntryDetails.put("CaseNo", uIMapRecords.walkInEntry.uICaseNoEdit);
			WalkInEntryDetails.put("CaseYear", uIMapRecords.walkInEntry.uICaseYearEdit);
			WalkInEntryDetails.put("CallNo", uIMapRecords.walkInEntry.uICallNoEdit);
			WalkInEntryDetails.put("CallYear", uIMapRecords.walkInEntry.uICallYearEdit);
			WalkInEntryDetails.put("CADCFS", uIMapRecords.walkInEntry.uICADCFSCodeEdit);
			WalkInEntryDetails.put("ReportedDate", uIMapRecords.walkInEntry.uIReportedDate);
			WalkInEntryDetails.put("ReportedTime", uIMapRecords.walkInEntry.uIReportedTimeEdit);
			WalkInEntryDetails.put("RcvSource", uIMapRecords.walkInEntry.uIRcvSourceCodeEdit);
			WalkInEntryDetails.put("CADDisposition", uIMapRecords.walkInEntry.uICADDispositionCodeEdit);
			WalkInEntryDetails.put("Unit", uIMapRecords.walkInEntry.uIUnitCodeEdit);

		}

		public void VerifyLocationCheckBoxUnchecked() {
			verify.ExpectedValueIsFalse(uIMapRecords.walkInEntry.uILocationVerifyCheckBox.isSelected());
		}

		public void enterAtCADCFS() {
				Playback.threadWait();
			uIMapRecords.walkInEntry.uICADCFSCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("CADCFS"));
			uIMapRecords.walkInEntry.uICADCFSCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterLocation() {
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(Randomized.randomString(10));
		}

		public void SelectAtType() {
			// uIMapRecords.caseUpdate.mOTab.uITypeComboBox.sendKeys(PoliceData.getRecordsModuleValue("Type"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uITypeComboBox,
					PoliceData.getRecordsModuleValue("Type"));
			uIMapRecords.caseUpdate.mOTab.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtCategory() {
			// uIMapRecords.caseUpdate.mOTab.uICategoryComboBox.sendKeys(PoliceData.getRecordsModuleValue("Category"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uICategoryComboBox,
					PoliceData.getRecordsModuleValue("Category"));
			uIMapRecords.caseUpdate.mOTab.uICategoryComboBox.sendKeys(Keys.TAB);
			Playback.threadWait(5000);
		}

		public void SelectAtDetail() {
			// uIMapRecords.caseUpdate.mOTab.uIDetailComboBox.sendKeys(PoliceData.getRecordsModuleValue("Detail"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUpdate.mOTab.uIDetailComboBox,
					PoliceData.getRecordsModuleValue("Detail"));
			uIMapRecords.caseUpdate.mOTab.uIDetailComboBox.sendKeys(Keys.TAB);
		}

		public void EnterComments() {
			uIMapRecords.caseUpdate.mOTab.uICommentsEdit.sendKeys(Randomized.randomString(10));
		}

		public void ClickAddButton() {
			uIMapRecords.caseUpdate.mOTab.uIAddButton.click();
		}

		public void VerifyAtType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getRecordsModuleValue("Type") + "-" + PoliceData.getRecordsModuleValue("Category") + "-"
							+ PoliceData.getRecordsModuleValue("Detail"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseUpdate.mOTab.uIMOTabTable,
							"Type/ Category/ Detail", rowIndex));
		}

		public void ClickSaveButtonMOTab() {
			uIMapRecords.caseUpdate.mOTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void enterAtLocation() {
			uIMapRecords.walkInEntry.uILocationEdit.clear();
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location"));
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void enterAtLocation1() {
			uIMapRecords.walkInEntry.uILocationEdit.clear();
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(PoliceData.getRecordsModuleValue("Location1"));
			uIMapRecords.walkInEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void verify6071ConfirmMessage() {

			  Playback.popupThreadWait();
	            Playback.popupThreadWait();
	            verify.ExpectedPropertyValueIsEqual("(6071) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.",
	            		uIMapRecords.walkInEntry.uIConfirmMessageTextView.getText());
	            Playback.controlReadyThreadWait();
	            uIMapRecords.walkInEntry.uIYesButton.click();
		}

		public void clickLocationVerifyCheckbox() {
			if(!uIMapRecords.walkInEntry.uILocationVerifyCheckBox.isSelected())
			uIMapRecords.walkInEntry.uILocationVerifyCheckBox.click();
		}

		public void verifyLocationCheckBoxChecked() {
			verify.ExpectedValueIsTrue(uIMapRecords.walkInEntry.uILocationVerifyCheckBox.isSelected());
		}

		public void enterAtCADDispositon() {
			uIMapRecords.walkInEntry.uICADDispositionCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CADDisposition"));
			uIMapRecords.walkInEntry.uICADDispositionCodeEdit.sendKeys(Keys.TAB);

		}

		public void SelectUnit() {
			uIMapRecords.walkInEntry.uIUnitLookupButton.click();
			Playback.popupThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyAtCFSDescription() {
			String actual = uIMapRecords.walkInEntry.uICADCFSTextEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFSDescription"), actual);
		}

		public void verifyAtDateAsCurrentDate() {
			String actual = uIMapRecords.walkInEntry.uIReportedDate.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), actual);
		}

		public void verifyAddressBubbleIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.walkInEntry.uILocationInfoIcon.isDisplayed());

		}

		public void verifyAtCADDescription() {
			String actual = uIMapRecords.walkInEntry.uICADDispositionDescTextEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CADDescription"), actual);
		}

		public void verifyAtUnitDescription() {
			String actual = uIMapRecords.walkInEntry.uIUnitDescTextEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("UnitDescription"), actual);
		}

		public void clickReset()
        {
            uIMapRecords.walkInEntry.uIResetButton.click();
        }
		public void enterAtNameID() {
			uIMapRecords.walkInEntry.uINameIDTypeEdit.click();
			uIMapRecords.walkInEntry.uINameIDTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.walkInEntry.uINameIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.walkInEntry.uINameIDEdit.sendKeys(Keys.TAB);
		}
		public void selectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.walkInEntry.uIActivityDropdown,
					PoliceData.getRecordsModuleValue("Activity"));
		}
		public void selectActivityAsVictim() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.walkInEntry.uIActivityDropdown,
					"Victim");
		}
		public void clickCreateCallInCADForDispatchCheckBox() {
            if(!uIMapRecords.walkInEntry.uICreateCallInCADForDispatchCheckBox.isSelected())
            uIMapRecords.walkInEntry.uICreateCallInCADForDispatchCheckBox.click();
        }
		public void verifyActivityAsRed() {
			String Red = "rgba(153, 0, 0, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.walkInEntry.uIActivityLabel.getCssValue("color"), Red);

			
		}
		

	}

	public class ReportManager {
		public ReportManagerMainTab reportManagerMainTab;
		public UpdateStatusTab updateStatusTab;
		public ReportManagerHistroyTab reportManagerHistroyTab;
		public ReportManagerNIBRSCheckTab reportManagerNIBRSCheckTab;

		public ReportManager() {
			if ((this.reportManagerMainTab == null)) {
				this.reportManagerMainTab = new ReportManagerMainTab();
			}
			if ((this.updateStatusTab == null)) {
				this.updateStatusTab = new UpdateStatusTab();
			}
			if ((this.reportManagerHistroyTab == null)) {
				this.reportManagerHistroyTab = new ReportManagerHistroyTab();
			}
			if ((this.reportManagerNIBRSCheckTab == null)) {
				this.reportManagerNIBRSCheckTab = new ReportManagerNIBRSCheckTab();
			}

		}

		public void VerifiyStatusAsOnHold() {

			verify.ExpectedPropertyValueIsEqual("On Hold", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.reportManager.uIStatusComboBox), "");

		}

		public void VerifiyStatusAsSubmitted() {

			verify.ExpectedPropertyValueIsEqual("Submitted", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.reportManager.uIStatusComboBox), "");

		}

		public void VerfiyStatusAsRejected() {

			verify.ExpectedPropertyValueIsEqual("Rejected", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.reportManager.uIStatusComboBox), "");

		}

		public void VerfiyStatusAsApproved() {

			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.reportManager.uIStatusComboBox), "");

		}

		public void switchToMainTab() {
			uIMapRecords.reportManager.uIMainTabSpan.click();

		}

		public void switchToUpdateStatusTab() {
			uIMapRecords.reportManager.uIUpdateStatusSpan.click();
			Playback.controlReadyThreadWait();

		}

		public void ClickSaveWithConfirm() {
			objectIdentification.manualIdentify.saveTheScreenWithConfirm();
			Playback.controlReadyThreadWait();
		}
		public void clickPrintIcon() {
	objectIdentification.manualIdentify.printTheScreen();
}
		public void switchToHistoryTab() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapRecords.reportManager.uIHistoryTabSpan.click();
			objectIdentification.windowHandle.switchToFrame("frmRptHistory");

		}

		public void save() {
			objectIdentification.manualIdentify.SaveTheScreen();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void clickReset() {
			objectIdentification.manualIdentify.resetTheScreen();
		}

		public void Saveandclose() {
			objectIdentification.manualIdentify.saveAndCloseTheScreen();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void Close() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportManager.driver.close();

		}

		public void VerifyStatusOfReportDataMenubar() {

			String ActualMenubarStatus = uIMapRecords.reportManager.uIMenubarStatus.getText();
			ActualMenubarStatus.contains(PoliceData.getRecordsModuleValue("ReportDataLabelStatus"));

		}

		public void VerfiyStatusFieldInReportData() {
			String ActualStatus = uIMapRecords.reportManager.uIMenubarStatus.getText();
			ActualStatus.contains(PoliceData.getRecordsModuleValue("ReportDataStatus"));
		}

		public void tabReportedbyPF() {
			uIMapRecords.reportManager.uIReportedbyPFCodeValue.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void tabDateAndTime() {
			uIMapRecords.reportManager.uIReportedDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.reportManager.uIReportedTimeEdit.sendKeys(Keys.TAB);

		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapRecords.reportManager.uIReportedDateEdit.getAttribute("value"));

		}

		public void VerifyUnitOfficer() {
			Playback.wait(3000);
			String OfficerCode = uIMapRecords.reportManager.uIReportedbyPFCodeValue.getAttribute("value");
			verify.ExpectedValueIsTrue(OfficerCode.contains("P001"));

		}

		public void VerifyUnitOfficerInfoIcon() {

			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIReportedByPFInfoIcon.isDisplayed());

		}

		public void ClickUnitOfficerIcon() {

			uIMapRecords.reportManager.uIReportedByPFInfoIcon.click();

		}

		public void VerifyReportedPFSearchButtonDisabled() {

			verify.ExpectedValueIsTrue(!uIMapRecords.reportManager.uIReportedByPFSearchButton.isEnabled());
		}

		public void VerifyCaseInfoIconClickable() {

			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uICaseInfoButton.isDisplayed());
			uIMapRecords.reportManager.uICaseInfoButton.click();

		}

		public void VerifyTypeAsIncidentReportDisabled() {
			Playback.controlReadyThreadWait();
			String TypeField = uIMapRecords.reportManager.uITypeComboBox.getText();
			verify.ExpectedValueIsTrue(TypeField.contains("Incident Report"));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.reportManager.uITypeComboBox.getAttribute("disabled")));

		}

		public void VerifyStatusOfReportDataMenubarAsOnHold() {

			String ActualMenubarStatus = uIMapRecords.reportManager.uIMenubarStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("On Hold"));

		}

		public void VerifyStatusAsOnHold() {

			String StatusField = uIMapRecords.reportManager.uIStatusComboBox.getText();
			verify.ExpectedValueIsTrue(StatusField.contains("On Hold"));
		}

		public void VerifyGridRowStatusAsReportDue() {
			// String uICaseRow =
			// objectIdentification.manualIdentify.getGridCellInnerText(PnxBaseTest.UIMapHome.MyHome.MyReportsTab.uIReportTable,
			// "Status",12);

			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			verify.ExpectedValueIsTrue(cellValues.contains("Report Due"));

		}

		public void SelectAsStatementReport() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox,
					"Statement Report");
		}

		public void selectTypeAsIncidentReport() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox,
					"Incident Report");
		}

		public void VerifyStatusOfReportDataMenubarAsReportDue() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIMenubarStatus.getText().contains("Report Due"));
		}

		public void VerifyAtType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapRecords.reportManager.uITypeComboBox));
		}

		public void VerifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2),
					uIMapRecords.reportManager.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(3),
					uIMapRecords.reportManager.uICaseNumberEdit.getAttribute("value"));
		}

		public String readCaseNo() {
			String Caseyear = uIMapRecords.reportManager.uICaseYearEdit.getAttribute("value");
			String CaseNo = uIMapRecords.reportManager.uICaseNumberEdit.getAttribute("value");
			String Case = Caseyear + "-" + CaseNo;
			System.out.println(Case);
			return Case;
		}
		public void clickCaseInfoIcon() {
			uIMapRecords.reportManager.uICaseInfoButton.click();
		}

		public void VerifiyStatusAsMoreInfoNeeded() {

			verify.ExpectedPropertyValueIsEqual("More Info Needed", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.reportManager.uIStatusComboBox), "");

		}

		public void VerifyStatsAsMoreInfoNeededInMenuBar() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.reportManager.uIMenubarStatus.getText().contains("More Info Needed"));
		}

		public void VerifyStatsAsRejectedInMenuBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIMenubarStatus.getText().contains("Rejected"));
		}

		public void ClickPropertyReportButton() {
			uIMapRecords.reportManager.uIViewReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPFNotRelatedToConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm
						.yesWithExpectedMessage("(7074) PF not related to this call. Do you want to continue?");

			} else
				popup.confirm.yesWithExpectedMessage("(7074) PF not related to this call. Do you want to continue?");
			Playback.controlReadyThreadWait();
		}

		public void VerifyStatsAsLockedInMenuBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIMenubarStatus.getText().contains("Locked"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox,
					PoliceData.getRecordsModuleValue("Type"));
			uIMapRecords.reportManager.uITypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SwitchToNIBRSCheckTab() {
			uIMapRecords.reportManager.uINIBRSCheckTabSpan.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmErrorCheck");
			Playback.controlReadyThreadWait();
		}

		public void VerifyNIBRSTabGreenColor() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.reportManager.uINIBRSCheckTabSpan.getAttribute("style").contains("green"));
		}

		public void enterReportDescription() {
			uIMapRecords.reportManager.uIReportDescriptionEdit.sendKeys(Randomized.randomString(50));
		}

		public void VerifyReportDesctiptionOptional() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIReportDescriptionLabel.getAttribute("style")
					.contains("color: black; font-weight: normal"));
		}

		public void EnterAtCaseNo() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportManager.uICaseYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.reportManager.uICaseNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.reportManager.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox,
					PoliceData.getRecordsModuleValue("Type1"));
			uIMapRecords.reportManager.uITypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyReportDesctiptionMandatoryForAll() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIReportDescriptionLabel.getAttribute("style")
					.contains("color: rgb(153, 0, 0); font-weight: bold;"));
		}

		public void ClickSave() {
			objectIdentification.manualIdentify.SaveTheScreen();
			Playback.controlReadyThreadWait();
		}

		public void VerifyRequiredEntriesAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void VerifyStatsAsSubmittedInMenuBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIMenubarStatus.getText().contains("Submitted"));
		}

		public void VerifyStatsAsApprovedInMenuBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.uIMenubarStatus.getText().contains("Approved"));
		}

		public void SelectAtStatementName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uIStatementNameComboBox,
					PoliceData.getRecordsModuleValue("StatementName"));
			uIMapRecords.reportManager.uIStatementNameComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyPFNotRelatedToConfirmPopupMessage() {
			Playback.popupThreadWait();
			verify.ExpectedPropertyValueIsEqual("(7074) PF not related to this call. Do you want to continue?",
					uIMapRecords.reportManager.uIConfirmMessageTextView.getText());
			Playback.controlReadyThreadWait();
			uIMapRecords.reportManager.uIYesButton.click();
			Playback.popupThreadWait();
		}

		public void VerifyOnlyPrimeOfficerWriteInitialAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7076) Only the Prime officer can write the initial report");
		}

		public void verifySavebuttonsDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.reportManager.uISaveButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.reportManager.uISaveCloseButton.getAttribute("disabled")));
		}

		public void verifyNoAcknowledgePopup() {

			verify.ExpectedValueIsFalse(objectIdentification.windowHandle.windowExist("Acknowledge"));
		}

		public void EnterReportDescriptionAsReportType() {
			uIMapRecords.reportManager.uIReportDescriptionEdit.sendKeys(PoliceData.getRecordsModuleValue("Type"));
		}

		public void selectAtType2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox,
					PoliceData.getRecordsModuleValue("Type2"));
			uIMapRecords.reportManager.uITypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAsSupplementReport()
{
    objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportManager.uITypeComboBox, "Supplement Report");
}

		public void verifyAtReportedByPF() {
            String PF = uIMapRecords.reportManager.uIReportedbyPFCodeValue.getAttribute("value");
            verify.ExpectedPropertyValueIsEqual(PF, PoliceData.getRecordsModuleValue("ReportedByPF"));
        }
		
		public void clearReportedPF() {
            Playback.controlReadyThreadWait();
            uIMapRecords.reportManager.uIReportedbyPFCodeValue.click();
            Playback.controlReadyThreadWait();
            uIMapRecords.reportManager.uIReportedbyPFCodeValue.sendKeys(Keys.CONTROL,"a");
                uIMapRecords.reportManager.uIReportedbyPFCodeValue.sendKeys(Keys.DELETE);
            Playback.controlReadyThreadWait();
            Playback.controlReadyThreadWait();
        }
		public void enterAtReportedByPF1() {
            uIMapRecords.reportManager.uIReportedbyPFCodeValue.click();
            Playback.controlReadyThreadWait();
            uIMapRecords.reportManager.uIReportedbyPFCodeValue
                    .sendKeys(PoliceData.getRecordsModuleValue("ReportedByPF1"));
            Playback.controlReadyThreadWait();
            uIMapRecords.reportManager.uIReportedbyPFCodeValue.sendKeys(Keys.TAB);
            Playback.controlReadyThreadWait();

        }

		public void verifyQAformTabNotEnabled() {
		verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.controlExist( uIMapRecords.reportManager.uIQAFormTabSpan));
			
		}
		public void verifyQAformTabEnabled() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.controlExist( uIMapRecords.reportManager.uIQAFormTabSpan));
				
			}

		public void clickQAFormTab() {
			 Playback.controlReadyThreadWait();
			 uIMapRecords.reportManager.uIQAFormTabSpan.click();
			 Playback.controlReadyThreadWait();
			
		}

		public void verifyQAFormsTabShowBlueColor() {
			 Playback.controlReadyThreadWait();
			 Playback.controlReadyThreadWait();
				// Blue color code
				String Blue = "0, 0, 255";
				String color1 = uIMapRecords.reportManager.uIQAFormTabSpan.getCssValue("color");
				verify.ExpectedValueIsTrue(color1.contains(Blue));
			
		}

		public void VerifyAtType2() {
verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type2"),
objectIdentification.manualIdentify
.getDropDownSelectedItem(uIMapRecords.reportManager.uITypeComboBox));
}
		public void VerifyAtType1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type1"),
			objectIdentification.manualIdentify
			.getDropDownSelectedItem(uIMapRecords.reportManager.uITypeComboBox));
			}

		public void clickViewReportButton() {
			// TODO Auto-generated method stub
			uIMapRecords.reportManager.uIViewReportButton.click();
		}

		public void verifyCaseNoIsEqual(String caseNo1, String caseNo2) {
			verify.ExpectedPropertyValueIsEqual(caseNo1, caseNo2);
		}
		public void verifyInitialReportIsAlreadyPresent() {
			String text = uIMapRecords.reportManager.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual("7057 - Initial report is already present", text);
		}

	}

	public class CaseUnits {
		public void SelectUnit() {
			uIMapRecords.caseUnits.uIUnitLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterAtOfficer1() {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void EnterOfficer1AsAUTO() {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys("AUTO");
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void SelectCCAsDispatched() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUnits.uICCComboBox, "Dispatched");
		}

		public void TabDateTime() {
			uIMapRecords.caseUnits.uIDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.caseUnits.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAdd() {
			uIMapRecords.caseUnits.uIAddButton.click();
		}

		public void SelectCCAsAcknowledged() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUnits.uICCComboBox,
					"Acknowledged");
		}

		public void SelectCCAsFinished() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUnits.uICCComboBox, "Finished");
		}

		public void SaveScreen() {
			uIMapRecords.caseUnits.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveCloseScreen() {
			uIMapRecords.caseUnits.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void ChangeOfficer1() {
			uIMapRecords.caseUnits.uIOfficer1Edit.clear();
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(PoliceData.getRecordsModuleValue("Officer2"));
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void ChangeOfficer2() {

			uIMapRecords.caseUnits.uIOfficer2Edit.clear();
			uIMapRecords.caseUnits.uIOfficer2Edit.sendKeys(PoliceData.getRecordsModuleValue("Officer1"));
			uIMapRecords.caseUnits.uIOfficer2Edit.sendKeys(Keys.TAB);

		}

		public void tabOutUnit() {
			uIMapRecords.caseUnits.uIUnitEdit.click();
			uIMapRecords.caseUnits.uIUnitEdit.sendKeys(Keys.TAB);
		}

		public void tabOutOfficer1() {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseUnits.uIOfficer1Edit.click();
			uIMapRecords.caseUnits.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void verifyFinishedDateAsCurrentDate() 
		{
			String attribute = uIMapRecords.caseUnits.uIFinishedEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}

		public void verifyDispositionAsIncidentReport()
		{
			String attribute = uIMapRecords.caseUnits.uIDispositionEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains("I-Incident Report"));
		}

		public void enterAtUnit()
		{
			 uIMapRecords.caseUnits.uIUnitEdit.sendKeys(PoliceData.getRecordsModuleValue("Unit"));
			 uIMapRecords.caseUnits.uIUnitEdit.sendKeys(Keys.TAB);
		}

		public void selectAtDisposition()
		{
		objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseUnits.uIDispositionComboBox, PoliceData.getRecordsModuleValue("Disposition"));
		}

		public void verifyCCAsDPInGrid(int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUnits.uICaseUnitsGridTable, "CC", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("DP"));
		}
		
		public void verifyDateAndTimeAsCurrentDateInGrid(int rowIndex)
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUnits.uICaseUnitsGridTable, "Date & Time", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains(Randomized.getCurrentDate()));
		}

		public void verifyDispositionAsAACInGrid(int rowIndex) 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUnits.uICaseUnitsGridTable, "Disposition", rowIndex).getText();
			verify.ExpectedValueIsTrue(text.contains("AAC-Arrested Adult (CM)"));
			
		}

		public void clickCommentsRowInGrid(int rowIndex)
		{
			objectIdentification.manualIdentify.getGridCell(uIMapRecords.caseUnits.uICaseUnitsGridTable, "Comments", rowIndex).click();
		}

		public void verifyCommentsFieldIsDisplayed() 
		{
			verify.ExpectedValueIsTrue(uIMapRecords.caseUnits.uICommentsEdit.isDisplayed());
		}

		public void enterAtComments() 
		{
			uIMapRecords.caseUnits.uICommentsEdit.sendKeys(PoliceData.getRecordsModuleValue("Comments"));
			
		}

		public void clickSave() 
		{
			uIMapRecords.caseUnits.uISaveButton.click();
		}

		public void verifyUpdatedDataExistsInTheTabAcknowledgeMessage() 
		{
			popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Tab. You must save or reset.");
		}

		public void verifyCCAsDispatched() 
		{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapRecords.caseUnits.uICCComboBox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains("Dispatched"));
		}

		public void verifyDateAsCurrentDate()
		{
			String attribute = uIMapRecords.caseUnits.uIDateEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtDisposition()
		{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapRecords.caseUnits.uIDispositionComboBox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getRecordsModuleValue("Disposition")));
		}

		public void verifyUpdateSuccessfulMessage()
		{
				String UpdateMessage = uIMapRecords.caseUnits.uILeftSideStatusBar.getText();
				verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
		}

		public void tabOutDate()
		{
			
			uIMapRecords.caseUnits.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void enterActiveTime(String readReportedTime)
		{
			uIMapRecords.caseUnits.uITimeEdit.click();
			Playback.pageLoadThreadWait();
			uIMapRecords.caseUnits.uITimeEdit.clear();
			uIMapRecords.caseUnits.uITimeEdit.sendKeys(readReportedTime);
			Playback.controlReadyThreadWait();
			System.out.println(readReportedTime);
		}

		public void closeScreen() 
		{
			uIMapRecords.caseUnits.driver.close();
		}
				
	}

	public class ReportManagerMainTab {

		public void VerifyApprovedPF() {
			String ApprovedBy = uIMapRecords.reportManager.reportManagerMainTab.uIApprovedBy.getAttribute("value");
			ApprovedBy.contains(PoliceData.getRecordsModuleValue("PFName"));
		}

		public void VerifyApprovedPFEmpty() {
			String ApprovedBy = uIMapRecords.reportManager.reportManagerMainTab.uIApprovedBy.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(ApprovedBy, "");
		}

	}

	public class UpdateStatusTab {
		public PDFUploadPanel pDFUploadPanel;

		public UpdateStatusTab() {
			if ((this.pDFUploadPanel == null)) {

				this.pDFUploadPanel = new PDFUploadPanel();
			}
		}

		public void selectActionAsSendForApproval() {
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.click();
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys("Send For Approval");
			// objectIdentification.manualIdentify.selectDropDownOption
			// (uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "Send For
			// Approval");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
	
		public void SelectActionAsReject() {

			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "Reject");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectActionAsComment() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "Comment");

		}

		public void selectActionAsApprove() {
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys("Approve");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtDivision() {
			uIMapRecords.reportManager.updateStatusTab.uIDivisionComboBox
					.sendKeys(PoliceData.getRecordsModuleValue("Division"));
			uIMapRecords.reportManager.updateStatusTab.uIDivisionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtSection() {
			uIMapRecords.reportManager.updateStatusTab.uISectionComboBox
					.sendKeys(PoliceData.getRecordsModuleValue("Section"));
			uIMapRecords.reportManager.updateStatusTab.uISectionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtSquad() {
			uIMapRecords.reportManager.updateStatusTab.uISquadComboBox
					.sendKeys(PoliceData.getRecordsModuleValue("Squad"));
			uIMapRecords.reportManager.updateStatusTab.uISquadComboBox.sendKeys(Keys.TAB);
		}

		public void SelectActionAtUpdateStatusAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportManager.updateStatusTab.uIActionComboBox,
					PoliceData.getRecordsModuleValue("UpdateStatusAction").toString());
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectRejectionCode(int rowIndex) {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.reportManager.updateStatusTab.uIRejectionCodeComboBox, rowIndex);

		}

		public void SelectRejectionCode() {
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.reportManager.updateStatusTab.uIRejectionCodeComboBox);
		}

		public void EnterAtSupervisor() {

			uIMapRecords.reportManager.updateStatusTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Supervisor"));
			uIMapRecords.reportManager.updateStatusTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickOpenPDFMarkupButton() {
			Actions builder = new Actions(Playback.driver);
			builder.click(uIMapRecords.reportManager.updateStatusTab.uIOpenPDFForMarkupButton).perform();
			builder = null;
		}

		public void SavePDFforMarkup() {

			// WindowsControl.FileSavePopup.ClickSaveOptionDropdown();
			// WindowsControl.FileSavePopup.ClickSaveAsOption();
			// WindowsControl.FileBrowserWindow.ClickSave();
			// WindowsControl.FileSavePopup.close();

		}

		public void UploadPDFClick() {
			Actions builder = new Actions(Playback.driver);
			builder.click(uIMapRecords.reportManager.updateStatusTab.uIUploadPDFButton).perform();
			Playback.controlReadyThreadWait();
			Playback.waitForControlReady();
			builder = null;
		}

		public void VerifyUploadPDFButtonTextAsGreen() {
			String styleTesxt = uIMapRecords.reportManager.updateStatusTab.uIUploadPDFButton.getAttribute("style");
			verify.ExpectedValueIsTrue(styleTesxt.contains("green"));
		}

		public void VerifyRejectionCode() {
			String rejectionCode = uIMapRecords.reportManager.updateStatusTab.uIRejectionCode.getText();
			verify.ExpectedValueIsTrue(rejectionCode.contains("1"));
		}

		public void ClickSignReportCheckBox() {
			uIMapRecords.reportManager.updateStatusTab.uIEnableSignCheckBox.click();
		}

		public void SelectActionAsMoreInfoNeeded() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "More Info Needed");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyShareCaseUpdateCaseFolderCheckboxsEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.reportManager.updateStatusTab.uIShareCaseUpdateCheckBox.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox.isDisplayed());
		}

		public void ClickShareCaseUpdateCheckbox() {
			uIMapRecords.reportManager.updateStatusTab.uIShareCaseUpdateCheckBox.click();
		}

		public void ClickShareCaseFolderCheckbox() {
			uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox.click();
		}
		
		public void verifyShareCaseFolderCheckboxDisabledAndSelected() {
			
			verify.ExpectedValueIsFalse(uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox.isEnabled());	
		verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox.isSelected());	
		
		}

		public void SelectActionAsLock() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "Lock");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportManager.updateStatusTab.uIActionComboBox,
					PoliceData.getRecordsModuleValue("Action").toString());
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void ClickNotarySignCheckBox() {
			uIMapRecords.reportManager.updateStatusTab.uINotarySignCheckBox.click();
		}

		public void VerifyNotarySignEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uINotarySignCheckBox.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uINotarySignCheckBox.isEnabled());
		}

		public void VerifySignReportEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIEnableSignCheckBox.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIEnableSignCheckBox.isEnabled());
		}

		public void VerifyPFSignImageDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIPFSignImage.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIPFSignImage.isEnabled());
		}

		public void VerifyNotarySignImageDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uINotarySignImage.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uINotarySignImage.isEnabled());
		}

		public void selectRejectionCodeAsSpellingErrors() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportManager.updateStatusTab.uIRejectionCodeComboBox, "Spelling Errors");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyRejectionCodeAsMandatory() {
			String clr =uIMapRecords.reportManager.updateStatusTab.uIRejectionCodeLable.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains("rgba(153, 0, 0, 1)"));
			}

		public void verifyActionAvailableOnlyForComment() {
			List<String> values= objectIdentification.manualIdentify.getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
			List<String> valuesExpected = new ArrayList<String> () ;
			valuesExpected.add("-");
			valuesExpected.add("Comment");
			verify.ExpectedValueIsTrue(values.equals(valuesExpected));
		} 
		public void verifyActionsAvailableForReadyToSubmitSendForApproveAndComment() {
			List<String> values= objectIdentification.manualIdentify.getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
			List<String> valuesExpected = new ArrayList<String> () ;
			valuesExpected.add("-");
			valuesExpected.add("Send for Approval");
			valuesExpected.add("Ready To Submit");
			valuesExpected.add("Comment");
			verify.ExpectedValueIsTrue(values.equals(valuesExpected));
		} 
		public void verifyActionsAvailableForSendToTanscriberSendForApproveAndComment() {
			List<String> values= objectIdentification.manualIdentify.getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
			List<String> valuesExpected = new ArrayList<String> () ;
			valuesExpected.add("-");
			valuesExpected.add("Send for Approval");
			valuesExpected.add("Send To Transcriber");
			valuesExpected.add("Comment");
			verify.ExpectedValueIsTrue(values.equals(valuesExpected));
		} 
		public void selectActionAsReadyToSubmit() {
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.click();
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys("Ready To Submit");
			// objectIdentification.manualIdentify.selectDropDownOption
			// (uIMapRecords.reportManager.updateStatusTab.uIActionComboBox, "Send For
			// Approval");
			uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickAction()
        {
            uIMapRecords.reportManager.updateStatusTab.uIActionComboBox.click();
           
        }
		public void verifyActionDisplayedAsMoreInfoNeeded()
        {
         List<String> dropDownValues = objectIdentification.manualIdentify.getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
         verify.ExpectedValueIsTrue(dropDownValues.contains("More Info Needed"));
        }
		public void verifyActionDisplayedAsLock()
        {
         List<String> dropDownValues = objectIdentification.manualIdentify.getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
         verify.ExpectedValueIsTrue(dropDownValues.contains("Lock"));
        }
		public void verifySupervisorIsEnabled() 
        {
            uIMapRecords.reportManager.updateStatusTab.uISupervisorCodeEdit.isEnabled();
            
        }

		public List<String> getAllElementsInActionComboBox() {
            List<String> values = objectIdentification.manualIdentify
                    .getDropDownValues(uIMapRecords.reportManager.updateStatusTab.uIActionComboBox);
            return values;
        }
		public void verifyMentionedElementInActionComboBox(List<String> values, String element) {
            verify.ExpectedValueIsTrue(values.contains(element));
        }

		public void verifyDivisionIsEnabled() {
            verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uIDivisionComboBox.isEnabled());
        }

 

        public void verifySectionIsEnabled() {
            verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uISectionComboBox.isEnabled());
        }

 

        public void verifyTranscriberIsEnabled() {
            verify.ExpectedValueIsTrue(uIMapRecords.reportManager.updateStatusTab.uISupervisorCodeEdit.isEnabled());
        }

		public void verifyShareWithCaseUpdateCheckboxIsSelected() {
            verify.ExpectedValueIsTrue(
                    uIMapRecords.reportManager.updateStatusTab.uIShareCaseUpdateCheckBox.isSelected());
        }
		public void verifyShareWithCaseFolderCheckboxIsSelectedAndDisabled() {
            verify.ExpectedValueIsTrue(
                    uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox.isSelected());
            String attribute = uIMapRecords.reportManager.updateStatusTab.uIShareCaseFolderCheckBox
                    .getAttribute("disabled");
            verify.ExpectedPropertyValueIsEqual(attribute, "true");
        }

		public void VerifyShareCaseUpdateCaseFolderCheckboxsUnchecked() {
            verify.ExpectedValueIsFalse(
                    uIMapRecords.reportManager.updateStatusTab.uIShareCaseUpdateCheckBox.isSelected());
          
        }
			}

	public class PDFUploadPanel {
		public void ClickSelect() {
			Actions builder = new Actions(Playback.driver);
			builder.click(uIMapRecords.reportManager.updateStatusTab.pDFUploadPanel.uISelectButton).perform();
			builder = null;
		}

		public void EnterFilePath() {
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(@"\\chpnxfsvr\qa\PhoenixTest\TestSource\IncidentRpt.pdf");
			// WindowsControl.FileBrowserWindow.ClickOpen();

		}

		public void Save() {
			Actions builder = new Actions(Playback.driver);
			builder.click(uIMapRecords.reportManager.updateStatusTab.pDFUploadPanel.uISaveButton).perform();
			builder = null;

		}

		public void sendFilePath(String File) {
            uIMapRecords.reportManager.updateStatusTab.pDFUploadPanel.uIFilePathEdit.sendKeys("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\"+File+".pdf");
        }
	}

	public class ReportManagerHistroyTab {

		public void VerifyActionOnTheTableAsSubmitted(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Submitted", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Action", rowIndex), "");

		}

		public void VerifyActionOnTheTableAsOnHold(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual("OnHold", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Action", rowIndex), "");

		}

		public void VerifyActionOnTheTableAsRejected(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual("Rejected", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Action", rowIndex), "");

		}

		public void VerifyActionOnTheTableAsApproved(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Action", rowIndex), "");

		}

		public void VerifyActionInHistoryTabInReportData(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable,
							"Action", rowIndex)
					.contains(PoliceData.getRecordsModuleValue("Action").toString()));
		}

		public void VerifyAtPFInHistoryTabInReportData(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PFName").toString(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "PF", rowIndex),
					"");
		}

		public void VerifyPaperIconInHistoryTabInReportData(int rowIndex) {
			WebElement uIAttachmentCell = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Attachment", rowIndex);
			WebElement uIAttachIMG = uIAttachmentCell.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(uIAttachIMG.getAttribute("src").contains("attach"));
		}

		public void verifyActionAsPropertyEntered(int rowIndex) {
			 verify.ExpectedPropertyValueIsEqual("Property Entered", objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.reportManager.reportManagerHistroyTab.uIReportHistroyTable, "Action", rowIndex));
			
		}

	}

	public class ReportManagerNIBRSCheckTab {
		public void VerifyAtCFS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.reportManager.reportManagerNIBRSCheckTab.uINIBRSCheckTabTable, "CFS",
							rowIndex));
		}

		public void VerifyAtNameID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("NameID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.reportManager.reportManagerNIBRSCheckTab.uINIBRSCheckTabTable, "CFS",
							rowIndex));
		}

		public void VerifyDescriptionAsPropertyRecordMustExist(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportManager.reportManagerNIBRSCheckTab.uINIBRSCheckTabTable,
							"Description", rowIndex)
					.contains("Property Record must exist with this Offense"));
		}

		public void VerifyDescriptionAsAllnonVehicularProperty(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportManager.reportManagerNIBRSCheckTab.uINIBRSCheckTabTable,
							"Description", rowIndex)
					.contains("All non-vehicular property descriptions were entered"));
		}
	}

	public class ReportStatus {
		public DistributeReport distributeReport;

		public ReportStatus() {
			if ((this.distributeReport == null)) {

				this.distributeReport = new DistributeReport();
			}
		}

		public void clickReportDetails() {
			uIMapRecords.reportStatus.uIReportDetailsButton.click();
			Playback.controlReadyThreadWait();
		}
		
		public void clickReportHistory() {
			uIMapRecords.reportStatus.uIReportHistroyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickCaseDataButton() {
			uIMapRecords.reportStatus.uICaseDataButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickNamesButton() {
			uIMapRecords.reportStatus.uINamesButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSuspectButton() {
			uIMapRecords.reportStatus.uISuspectButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickPropertyButton() {
			uIMapRecords.reportStatus.uIPropertyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickVehicleButton() {
			uIMapRecords.reportStatus.uIVehicleButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickQaFormButton() {
			uIMapRecords.reportStatus.uIQAFormButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRefreshButton() {
			uIMapRecords.reportStatus.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyLabelStatusOfIncidentReportMenubar() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(
					ActualMenubarStatus.contains(PoliceData.getRecordsModuleValue("IncidentReportLabelStatus")));

		}

		public void verifyLabelStatusOfIncidentReportAsOnHold() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("On Hold"));

		}

		public void verifyLabelStatusOfSupplementalReportAsOnHold() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("On Hold"));

		}

		public void SaveTheIncidentReport() {
			// WindowsControl.ReportStatusPDFWindow.OpenSaveBrowseWindow();
			// WindowsControl.FileBrowserWindow.EnterSaveFileName(Randomized.ManualPlusRandomString("Incidnet
			// Report", 5));
			// WindowsControl.FileBrowserWindow.ClickSave();
		}

		public void SaveIncidentReport() {
			// String testName = RecordsScripts.RecordsTestContext.TestName;
			// String filePath =
			// Playback.GetTestDeployDirectoryPath(RecordsScripts.RecordsTestContext);
			// filePath = filePath + "_IncidentReport";
			// WindowsControl.ReportStatusPDFWindow.OpenSaveBrowseWindow();

			// WindowsControl.FileBrowserWindow.EnterSaveFileName(filePath);
			// WindowsControl.FileBrowserWindow.ClickSave();

		}

		public void VerifyPFInHistoryTabInReportData() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains(PoliceData.getRecordsModuleValue("PFName")));

		}

		public void VerifyPaperIconInInReportStatusMenuBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIPaperIcon.isDisplayed());
		}

		public void close() {
			uIMapRecords.reportStatus.driver.close();
		}

		public void VerifyIcidentReportIsOpening() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("On Hold"));
		}

		public void VerifyIncidentReportAsSubmittedIsOpening() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("Submitted"));
		}

		public void VerifyIncidentReportAsApprovedIsOpening() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("Approved"));
		}

		public void VerifyIncidentReportAsLockedIsOpening() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("Locked"));
		}

		public void VerifyIncidentReportAsRejectedIsOpening() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("Rejected"));
		}

		public void MouseOverSuspectButton() {
			Actions action = new Actions(Playback.driver);
			action.moveToElement(uIMapRecords.reportStatus.uISuspectButton).perform();
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext,
			// "UnidentifiedSuspect");
			objectIdentification.manualIdentify.highlighElement(uIMapRecords.reportStatus.uISuspectButton);
			Playback.threadWait();
			String hoverTitle = uIMapRecords.reportStatus.uISuspectButton.getAttribute("title");
			verify.ExpectedValueIsTrue(hoverTitle.contains("Unidentified or Unconfirmed Suspect"));
		}

		public void ClickArrestButton() {
			uIMapRecords.reportStatus.uIArrestButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickUseOfForceButton() {
			uIMapRecords.reportStatus.uIUseOfForceButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSummaryButton() {
			uIMapRecords.reportStatus.uISummaryButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickNarrativeButton() {
			uIMapRecords.reportStatus.uINarrativeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickConfigrueMailExtenstionButton() {
			uIMapRecords.reportStatus.uIConfigrueMailExtenstionButton.click();
		}

		public void ClickDownloadMailExtensionSdkLink() {
			uIMapRecords.reportStatus.uIdownloadMailExtensionSdkLink.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAttachmentsButton() {
			uIMapRecords.reportStatus.uIAttachmentsButton.click();
		}

		public void ClickAtRedactButton() {
			uIMapRecords.reportStatus.uIRedactButton.click();
		}

		public void VerifyReportStatusAsKeypunch() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportStatus.getText().contains("Keypunch"));
		}
		public void VerifyReportStatusAsReadyToSubmit() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportStatus.getText().contains("Ready To Submit"));
		}

		public void VerifyPropertyReportAsLocked() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("Locked"));
		}

		public void verifyReportStatusAsApproved() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportStatus.getText().contains("Approved"));
		}

		public void VerifyApprovedIncidentReportsButtons() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportDetailsButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIAttachmentsButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIRedactButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIDistributeReportButton.isDisplayed());
		}

		public void ClickAssignRefreshButton() {
			uIMapRecords.reportStatus.uIAssignRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAssignNextButton() {
			uIMapRecords.reportStatus.uIAssignNextButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAssignPreviousButton() {
			uIMapRecords.reportStatus.uIAssignPreviousButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickCaseInfoIcon() {
			uIMapRecords.reportStatus.uIAssignCaseNoInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAssignCaseButton() {
			uIMapRecords.reportStatus.uIAssignCaseButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifySendEmailAvailable() {
			Playback.controlReadyThreadWait();
			boolean result = uIMapRecords.reportStatus.uISendEmailButton.isDisplayed();
			verify.ExpectedValueIsTrue(result);

			if (result) {
				Playback.controlReadyThreadWait();
				Playback.driver.close();
			}

		}

		public void ClickSendEmailButton() {
			uIMapRecords.reportStatus.uISendEmailButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickNibrsCheckButton() {
			uIMapRecords.reportStatus.uINibrsCheckButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyNIBRSCheckButtonGreen() {
			verify.ExpectedValueIsNotTrue(
					uIMapRecords.reportStatus.uINibrsCheckButton.getAttribute("style").contains("color:Green"));
		}

		public void ClickCaseSearchReportRefreshButton() {
			uIMapRecords.reportStatus.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyReviewedCheckBoxIsSelected() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReviewedCheckBox.isSelected());
		}

		public void verifyDNDStatusBar() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIDNDReportInStatusBar.getText()
					.contains("** DO NOT DISTRIBUTE REPORTS**"));
		}

		public void verifyReviewedCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReviewedCheckBox.isEnabled());
		}

		public void verifyLabelStatusOfIncidentReportAsMoreInfoNeeded() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("More Info Needed"));

		}

		public void verifyAtReportStatus() {
			Playback.controlReadyThreadWait();
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Status"), ActualMenubarStatus);

		}

		public List<String> getHeaderButtonsWhichAreAvailable() {

			List<String> alltext = new ArrayList<String>();
			WebElement allButtons = uIMapRecords.reportStatus.uIHeaderButtons;
			List<WebElement> buttons = allButtons.findElements(By.xpath(".//td/table/tbody/tr/td/input"));
			for (WebElement button : buttons) {
				String text = button.getAttribute("value");
				alltext.add(text);
			}

			return alltext;
		}

		public void verifyDifferenceInHeaderButtons(List<String> allbuttons, List<String> limitedButtons) {
			Collection<String> hiddentext = CollectionUtils.subtract(allbuttons, limitedButtons);
			for (String text : hiddentext) {

				if (text.startsWith("U")) {
					verify.ExpectedPropertyValueIsEqual(text, "Use of Force");
				}

				else if (text.startsWith("P")) {
					verify.ExpectedPropertyValueIsEqual(text, "Property");
				}

				else if (text.startsWith("S")) {
					verify.ExpectedPropertyValueIsEqual(text, "Summary");
				}

				else {
					verify.ExpectedPropertyValueIsEqual(text, "Attachments");
				}
			}
		}

		public void verifyReportStatusAsSubmitted() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportStatus.getText().contains("Submitted"));
		}

		public void verifyLabelStatusOfStatementReportAsOnHold() {
			String ActualMenubarStatus = uIMapRecords.reportStatus.uIReportStatus.getText();
			verify.ExpectedValueIsTrue(ActualMenubarStatus.contains("On Hold"));

		}

		public void clickDistributeReport() {
			uIMapRecords.reportStatus.uIDistributeReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyColorOfNIBRSCheckButtonAsRed() {
			String color = uIMapRecords.reportStatus.uINibrsCheckButton.getAttribute("style");

			verify.ExpectedValueIsTrue(color.contains("red"));
		}

		public void verifyColorOfNIBRSCheckButtonAsGreen() {
			String color = uIMapRecords.reportStatus.uINibrsCheckButton.getAttribute("style");

			verify.ExpectedValueIsTrue(color.contains("green"));
		}

		public void selectByActiveCaseNo(String caseNo) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.reportStatusScreenTab.uISearchResultGrid,  caseNo);
		}

		public void verifyReportStatusAsLocked() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIReportStatus.getText().contains("Locked"));
		}

		public void verifyPropertyButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIPropertyButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIPropertyButton.isEnabled());
				
			}

			public void verifySummaryInPDFReport(String summary) {
				verify.ExpectedValueIsTrue(summary.contains(PoliceData.getRecordsModuleValue("Text")));
				
			}

			public void downloadReport() {
				objectIdentification.readPDF.DownloadReports();
			}

			public void sendDownloadedFiletoServer(String reportName) {
				objectIdentification.readPDF.SendLocalDownloadedFileToServerPath(reportName);		
			}

			public String readPDFContent(String reportName) {
				Playback.controlReadyThreadWait();
				Playback.threadWait(5000);
				String PDFContent = objectIdentification.readPDF.ReadPDF(reportName);
				return PDFContent;
			}

			 public void saveTheReportToLocation(String PDFname)
		        {
		        	objectIdentification.readPDF.SaveAsPDFfileToLocation(PDFname);
		        	Playback.controlReadyThreadWait();
		        }

			public void clickSendEmailButton() {
				 Playback.controlReadyThreadWait();
		            uIMapRecords.reportStatus.uISendEmailButton.click();
		            Playback.controlReadyThreadWait();
			}

			public void verifyAccessRestrictedAcknowledgeMessage() {
	            popup.acknowledge.okWithExpectedMessage("(6071) Access Restricted by Case Folder");
	        }

			public void verifyPropertyNoInPDFReportByActiveData(String allContent, String PropertyNo) {
	            verify.ExpectedValueIsTrue(allContent.contains(PropertyNo));
	        }

	        public void verifyReasonInPDFReport(String allContent) {
	            verify.ExpectedValueIsTrue(allContent.contains(PoliceData.getPropertyModuleValue("Reason")));

	        }

	        public void verifyDispostionInPDFReport(String allContent) {
	            verify.ExpectedValueIsTrue(allContent.contains(PoliceData.getPropertyModuleValue("Status")));

	        }

	        public void verifyAtCaliberInPDFReport(String caliber)
	        {
	            verify.ExpectedValueIsTrue(caliber.contains(PoliceData.getRecordsModuleValue("Caliber")));
	        }

			public void clickCrashButton()
        {
        uIMapRecords.reportStatus.uICrashButton.click();
        Playback.controlReadyThreadWait();
        }

			public void verfyRedactButtonIsEnabledAndDisplayed() {
	            verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIRedactButton.isEnabled()
	                    && uIMapRecords.reportStatus.uIRedactButton.isDisplayed());
	        }

			public void clickDeleteIconWithConfirmation() 
	        {
	            uIMapRecords.reportStatus.uIDeleteIcon.click();
	            Playback.controlReadyThreadWait();
	            popup.confirm.yesWithContainsMessage("Do you really want to delete?");
	        }
			public void verifyDeletedSuccessfullyAcknowledgeMessage() 
	        {
	            popup.acknowledge.okWithExpectedContainMessage("Deleted successfully");
	        }

			public void verifyUseOfForceButtonDisplayed() {
            verify.ExpectedValueIsTrue(uIMapRecords.reportStatus.uIUseOfForceButton.isDisplayed());
            Playback.controlReadyThreadWait();
        }
			public void verifyUseOfForceButtonNotDisplayed() {
	            verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.controlExist(uIMapRecords.reportStatus.uIUseOfForceButton));
	            Playback.controlReadyThreadWait();
	        }

			public void verifyRedauctButtonNotDisplayed() {
            verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.controlExist(uIMapRecords.reportStatus.uIRedactButton));
            Playback.controlReadyThreadWait();
        }

			public void switchToReportFrame() {
            objectIdentification.windowHandle.switchToFrame("QA/frmQnDataEnty.aspx");
        }

			public void enterLastNameAtQAFormreport() {
	            uIMapRecords.reportStatus.uILastNameEditQAForm.click();
	            uIMapRecords.reportStatus.uILastNameEditQAForm.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
	        }
	 
	        public void enterFirstNameAtQAFormreport() {
	            uIMapRecords.reportStatus.uIFirstNameEditQAForm.click();
	            uIMapRecords.reportStatus.uIFirstNameEditQAForm.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
	        }
	 
	        public void clickSaveExitButton() {
	            uIMapRecords.reportStatus.uISaveNExitButton.click();
	        }

			public void verifyLastNameAtQAFormreport() {
            String text = uIMapRecords.reportStatus.uILastNameEditQAForm.getText();
            verify.ExpectedPropertyValueIsEqual(text, PoliceData.getRecordsModuleValue("LastName"));
        }
 
        public void verifyFirstNameAtQAFormreport() {
            String text = uIMapRecords.reportStatus.uIFirstNameEditQAForm.getText();
            verify.ExpectedPropertyValueIsEqual(text, PoliceData.getRecordsModuleValue("FirstName"));
        }

		public void verifySuspectNameInPDFReport(String readPDFContent1) {
			verify.ExpectedValueIsTrue(readPDFContent1.contains(PoliceData.getRecordsModuleValue("SuspectName")));
		}

		public void verifyAtQaFormNameInPDFReport(String FormName)
		{
		verify.ExpectedValueIsTrue(FormName.contains(PoliceData.getRecordsModuleValue("QaForm")));

		}
		public void verifyReportCommentsScreenStatusAsOnHold(int idx) {
			objectIdentification.windowHandle.switchToWindow("frmRptComments");
		WebElement table =	Playback.driver.findElement(By.id("grdRptHistory"));
	String actual =	objectIdentification.manualIdentify.getGridCellInnerText(table, "Action", idx);
			verify.ExpectedPropertyValueIsEqual("OnHold", actual);
		}
		
		public void verifyReportCommentsScreenStatusAsReportDue(int idx) {
			objectIdentification.windowHandle.switchToWindow("frmRptComments");
		WebElement table =	Playback.driver.findElement(By.id("grdRptHistory"));
	String actual =	objectIdentification.manualIdentify.getGridCellInnerText(table, "Action", idx);
			verify.ExpectedPropertyValueIsEqual("Report_Due", actual);
		}
	}

	public class ReportSearch {
		public void NavigateToReportSearchScreenAndSearch() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys(PoliceData.getRecordsModuleValue("ReportSearchStatus"));
			uIMapRecords.reportSearch.uIReportTypeCombobox.sendKeys(PoliceData.getRecordsModuleValue("Type"));
			uIMapRecords.reportSearch.uICaseYearFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.reportSearch.uICaseNumberFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.reportSearch.uISearchButton.click();
		}

		public void VerifyIncidentReportData(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Type", rowIndex).toString(),
					PoliceData.getRecordsModuleValue("Type"));
		}

		public void SelectRowByAtCaseNo() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("CaseNo"));
			Playback.pageLoadThreadWait();
		}

		public void SelectReportTypeAsIncidentReport() {
			uIMapRecords.reportSearch.uIReportTypeCombobox.sendKeys("Incident Report");
		}

		public void SelectStatusAsOnHold() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys("OnHold");
		}

		public void SelectStatusAsSubmitted() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys("Submitted");
		}

		public void SelectStatusAsApproved() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys("Approved");
		}

		public void SelectStatusAsRejected() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys("Rejected");
		}

		public void ClickSearchButton() {
			uIMapRecords.reportSearch.uISearchButton.click();
		}

		public void SelectOnHoldReport() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapRecords.reportSearch.uISearchResultGrid);
		}

		public void clickBackButton() {
			uIMapRecords.reportSearch.uIBackButton.click();
		}

		public void ClickResetButton() {
			uIMapRecords.reportSearch.uIResetButton.click();
		}

		public void SelectSubmittedReport() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapRecords.reportSearch.uISearchResultGrid);
		}

		public void SelectApprovedReport() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapRecords.reportSearch.uISearchResultGrid);
		}

		public void SelectRejectedReport() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapRecords.reportSearch.uISearchResultGrid);
		}

		public void clickDateTimeResetButton() {
			uIMapRecords.reportSearch.uIDateResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtStatus() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys(PoliceData.getRecordsModuleValue("Status"));
			Playback.controlReadyThreadWait();
		}

		public void MouseHoverAtCaseNumberAndVerify() {
			Actions mousehover = new Actions(Playback.driver);
			mousehover
					.moveToElement(objectIdentification.manualIdentify.getGridCell(
							uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("CaseNo")))
					.perform();
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			String caseno = uIMapRecords.reportSearch.uIToolTipStatusBar.getText();
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext, "17-000001");

		}

		public void MouseHoverAtCFSAndVerify() {
			Actions mousehoverCFS = new Actions(Playback.driver);
			mousehoverCFS
					.moveToElement(objectIdentification.manualIdentify.getGridCell(
							uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("CFS")))
					.perform();
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			String CFS = uIMapRecords.reportSearch.uIToolTipStatusBar.getText();
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext, "Theft");

		}

		public void EnterAtOfficerPF() {
			uIMapRecords.reportSearch.uIOfficerPFEdit.sendKeys(PoliceData.getRecordsModuleValue("OfficerPF"));
			uIMapRecords.reportSearch.uIOfficerPFEdit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterFromAndEndAtCaseNo() {
			uIMapRecords.reportSearch.uICaseYearFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.reportSearch.uICaseNumberFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.reportSearch.uICaseYearEndEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.reportSearch.uICaseNumberEndEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.reportSearch.uICaseNumberEndEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtOfficer(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Officer", rowIndex));
		}

		public void VerifyFromDate15DayPrevious() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getPreviousDate(15, "MM/dd/yyyy"),
					uIMapRecords.reportSearch.uIFromDateEdit.getAttribute("value"));
		}

		public void VerifyToDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapRecords.reportSearch.uIToDateEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge
						.okWithExpectedMessage("1085 - Enter at least one criteria/keyword to start the search");
			} else
				popup.acknowledge
						.okWithExpectedMessage(" 1085 - Enter at least one criteria/keyword to start the search");
		}

		public void Verify13AccessRestrictedByAUTOAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(13) Access Restricted by Prophoenix, Automation");
		}

		public void VerifyGridColumnStatusAsReportDue() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Report Due");
		}

		public void VerifyGridColumnStatusAsOnHold() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "OnHold");
		}

		public void verifyGridColumnValuesAtType() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid, "Type");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, PoliceData.getRecordsModuleValue("Type"));
		}

		public void SelectReportByAtType() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("Type"));
		}

		public void SelectRowASReportDueUsingAtType() {
			Playback.pageLoadThreadWait();
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Report Due");
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getRecordsModuleValue("Type"));
		}

		public void VerifyAtCaseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Case#", rowIndex));
		}

		public void selectAtReportType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.reportSearch.uIReportTypeCombobox,
					PoliceData.getRecordsModuleValue("ReportType"));
			uIMapRecords.reportSearch.uIReportTypeCombobox.sendKeys(Keys.TAB);
		}

		public void selectAtStatusInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("Status"));
		}

		public void VerifyStatusAsApprovedUsingCaseNo() {
			verify.ExpectedPropertyValueIsEqual("Approved",
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.reportSearch.uISearchResultGrid,
							PoliceData.getRecordsModuleValue("CaseNo"), "Status").getText());
		}

		public void ClickLockedStatusRowInGrid() {
			objectIdentification.manualIdentify
					.selectGridRowCheckBoxByCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Locked");
			Playback.controlReadyThreadWait();
		}

		public void VerifyStatusAsLockedInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Locked", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Status", rowIndex));
		}

		public void ClickAddNewButton() {
			uIMapRecords.reportSearch.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyKeypunchConfirmMessage() {
			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage(
					"(7268) The report is being updated by  KeyPunch, Officer, P003     . Editing is not allowed. Do you want to view the report?");
			Playback.controlReadyThreadWait();
		}

		public void VerifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void VerifyAt13AccessRestrictedByOfficerAckMsg() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage(
					"(13) Access restricted by" + " " + PoliceData.getRecordsModuleValue("Officer"));
		}

		public void mouseHoverCaseNumberAndVerify(String caseNo) {
			Actions mousehover = new Actions(Playback.driver);
			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.reportSearch.uISearchResultGrid, caseNo)).perform();
			Playback.controlReadyThreadWait();
			//
			Playback.gridLoadThreadWait();
			String caseno = uIMapRecords.reportSearch.uIToolTipStatusBarOfficerColumn.getText();
			String[] split = caseno.split("\\r?\\n");
			for (String name : split) {
				if (name.startsWith("O")) {
					verify.ExpectedPropertyValueIsEqual(name, PoliceData.getRecordsModuleValue("OfficerName"));
				}
			}
		}

		public void mouseHoverAtOfficerAndVerify() {
			Actions mousehover = new Actions(Playback.driver);
			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.reportSearch.uISearchResultGrid, "Officer", 0)).perform();
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			String Name = uIMapRecords.reportSearch.uIToolTipStatusBarOfficerColumn.getText();
			verify.ExpectedPropertyValueIsEqual(Name, PoliceData.getRecordsModuleValue("LastName") + ", "
					+ PoliceData.getRecordsModuleValue("FirstName"));
			Playback.pageLoadThreadWait();
			// Playback.TakeScreenshot(RecordsScripts.RecordsTestContext, "17-000001");

		}

		public void enterAtFromCaseNo() {
				
			Playback.pageLoadThreadWait();
			uIMapRecords.reportSearch.uICaseYearFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.reportSearch.uICaseNumberFromEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.reportSearch.uICaseNumberFromEdit.sendKeys(Keys.TAB);
		}

		public void clickDistributeReport() {
			uIMapRecords.reportStatus.uIDistributeReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyGridColumnValuesAtStatus() {
			String data = PoliceData.getRecordsModuleValue("Status");
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid, "Status");
			for (String status : cellValues)
				if (status.contains(data))
					Assert.assertEquals(status, data);
		}

		public void enterAtCaseNoAsActiveData(String CaseNo) {
			uIMapRecords.reportSearch.uICaseYearFromEdit.sendKeys(CaseNo.substring(0, 2));
			uIMapRecords.reportSearch.uICaseNumberFromEdit.sendKeys(CaseNo.substring(3));
			uIMapRecords.reportSearch.uICaseNumberFromEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Type"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, "Type", rowIndex));
		}

		public void verifyRowAccountAs1() {
			verify.ExpectedIntergerValueIsEqualToActual(1, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.reportSearch.uISearchResultGrid));
		}
		public void verifyRecordsListOutInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.reportSearch.uISearchResultGrid)>0);
		}
		public void verifyRowAccountAs2() {
			verify.ExpectedIntergerValueIsEqualToActual(2, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.reportSearch.uISearchResultGrid));
		}

		public void verifyGridColumnStatusAsLocked() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Locked");
		}

		public void clickPrintIcon() {
			uIMapRecords.reportSearch.uIPrintButton.click();
		}

		public void selectAtStatus1() {
			uIMapRecords.reportSearch.uIStatusCombobox.sendKeys(PoliceData.getRecordsModuleValue("Status1"));
			Playback.controlReadyThreadWait();
		}
		public void reloadReportSearchScreen() {
			objectIdentification.manualIdentify.reloadScreen("Report Search");
			
		}

		public void verifyRedactedColumnEnableInGrid() {
			WebElement cell = objectIdentification.manualIdentify.getGridHeaderColumnCell(uIMapRecords.reportSearch.uISearchResultGrid, "Redacted");
			verify.ExpectedPropertyValueIsEqual(cell.getText(), "Redacted");
		}

		public void clickOnRedactIconInGridByCaseNo() {
		
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("CaseNo"));
			
		}

		public void verifyGridColumnStatusAsSubmitted()
        {
            List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapRecords.reportSearch.uISearchResultGrid,
                "Status");
            for (String strStatus : cellValues)
                Assert.assertEquals(strStatus, "Submitted");
        }

		 public void SelectStatusAsLocked()
	        {
	            uIMapRecords.reportSearch.uIStatusCombobox.sendKeys("Locked");
	        }

		 public void enterFromDateAs5YearBeforeFromCurrentDate() {
	            uIMapRecords.reportSearch.uIFromDateEdit.sendKeys(Randomized.getPreviousYearByNoOfYears(5, "MM/DD/YYYY"));
	            uIMapRecords.reportSearch.uIFromTimeEdit.sendKeys(Keys.TAB);
	        }

		 public void enterToDateAsCurrentDate() {
	            uIMapRecords.reportSearch.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
	            uIMapRecords.reportSearch.uIToTimeEdit.sendKeys(Keys.TAB);
	        }
	        public void clickNextButtonInGrid(int NoOfTimes) {
	            for (int i = 0; i < NoOfTimes; i++) {
	                if (uIMapRecords.reportSearch.uINextButton.isDisplayed()) {
	                    uIMapRecords.reportSearch.uINextButton.click();
	                    Playback.gridLoadThreadWait();
	                }
	            }
	        }

	        public void EnterFromAndEndAtCaseNoUsingJSONData(String testCaseId) {
	            
	             String caseYear = PoliceData.readJson(testCaseId, "caseYear");
	                String caseNo = PoliceData.readJson(testCaseId, "caseNo");
	                String CaseNo = caseYear+"-"+caseNo;
	            uIMapRecords.reportSearch.uICaseYearFromEdit.sendKeys(CaseNo.substring(0, 2));
	            uIMapRecords.reportSearch.uICaseNumberFromEdit
	                    .sendKeys(CaseNo.substring(3));
	            uIMapRecords.reportSearch.uICaseYearEndEdit
	                    .sendKeys(CaseNo.substring(0, 2));
	            uIMapRecords.reportSearch.uICaseNumberEndEdit
	                    .sendKeys(CaseNo.substring(3));
	            uIMapRecords.reportSearch.uICaseNumberEndEdit.sendKeys(Keys.TAB);
	        }
	        public void selectAtTypeandReportStatus() {
	            uIMapRecords.reportSearch.uIStatusCombobox.sendKeys(PoliceData.getRecordsModuleValue("ReportSearchStatus"));
	            uIMapRecords.reportSearch.uIReportTypeCombobox.sendKeys(PoliceData.getRecordsModuleValue("Type"));
	            /*
	             * uIMapRecords.reportSearch.uICaseYearFromEdit
	             * .sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
	             * uIMapRecords.reportSearch.uICaseNumberFromEdit
	             * .sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
	             */
	            uIMapRecords.reportSearch.uISearchButton.click();
	        }
	        public void SelectRowByAtCaseNoUsingJSON(String testCaseId) {
	             String caseYear = PoliceData.readJson(testCaseId, "caseYear");
	                String caseNo = PoliceData.readJson(testCaseId, "caseNo");
	                String CaseNo = caseYear+"-"+caseNo;
//	            Playback.pageLoadThreadWait();
//	            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
//	                    uIMapRecords.reportSearch.uISearchResultGrid, PoliceData.getRecordsModuleValue("CaseNo"));
	            objectIdentification.manualIdentify.selectGridRowByCellInnerText(
	                    uIMapRecords.reportSearch.uISearchResultGrid, CaseNo);
	           
	            Playback.pageLoadThreadWait();
	        }
	      
	}

	public class DistributeReport {
		public void enterAtReleasedTo() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatus.distributeReport.uIReleasedToEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ReleasedTo"));
			uIMapRecords.reportStatus.distributeReport.uIReleasedToEdit.sendKeys(Keys.TAB);
		}

		public void selectAtSelectWatermark() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportStatus.distributeReport.uISelectWatermarkComboBox,
					PoliceData.getRecordsModuleValue("SelectWatermark"));
			uIMapRecords.reportStatus.distributeReport.uISelectWatermarkComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtComments() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatus.distributeReport.uICommentsEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Comments"));
			uIMapRecords.reportStatus.distributeReport.uICommentsEdit.sendKeys(Keys.TAB);
		}

		public void enterComments() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatus.distributeReport.uICommentsEdit.sendKeys(Randomized.randomString(20));
			uIMapRecords.reportStatus.distributeReport.uICommentsEdit.sendKeys(Keys.TAB);
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatus.distributeReport.uIPrintButton.click();
		}

		public void clickCancelButton() {
			uIMapRecords.reportStatus.distributeReport.uICancelButton.click();

		}

	}

	public class ACD {
		public void EnterCustomChargeandTab() {
			uIMapRecords.aCD.uIChargeCodeValue.sendKeys("0999");
			uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);

		}

		public void ClickChargeSearchButton() {
			uIMapRecords.aCD.uIChargeSearchButton.click();
		}

		public void SelectCharge() {
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtCharge() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}

		}

		public void enterAtCharge1() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS1"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}

		}

		public void SelectDomesticViolanceAsNo() {
			// uIMapRecords.aCD.uIDomesticViolationComboBox.sendKeys("0 - No");
			uIMapRecords.aCD.uIDomesticViolationComboBox.sendKeys("No");
		}

		public void selectDomesticViolance() {

			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.aCD.uIDomesticViolationComboBox);

		}

		public void clickUsedBodyWornCameraCheckbox() {
			uIMapRecords.aCD.uIUsedBodyWornCameraCheckbox.click();
		}

		public void clickAddButton() {
			uIMapRecords.aCD.uIAddCFS.click();
			Playback.controlReadyThreadWait();
		}

		public void TaboutOccuredAT() {
			uIMapRecords.aCD.uIOccuredAtDateEdit.sendKeys(Keys.TAB);
		}

		public void SaveNClose() {
			uIMapRecords.aCD.uISaveNClose.click();
			popup.confirm.yes();
		}

		public void ClickPopupAtChargeInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.aCD.uIPopupCopyChargeGridTable, PoliceData.getRecordsModuleValue("Charge"));
		}

		public void ClickPopupCopyButton() {
			uIMapRecords.aCD.uIPopupChargeCopyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickPopupGridCheckboxUsingAtCharge() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.aCD.uIPopupCopyChargeGridTable, PoliceData.getRecordsModuleValue("Charge"));
		}

		public void VerifyPopupAtCharge(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.aCD.uIPopupCopyChargeGridTable, rowIndex).getText()
					.contains(PoliceData.getRecordsModuleValue("Charge")), "Verifying Charge No in Grid");
		}

		public void VerifyAtChargeInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.aCD.uIACDChargeGridTable,
							"Charge", rowIndex));
		}

		public void EnterDamageAmount() {
			uIMapRecords.aCD.uIDamageAmountEdit.click();
			uIMapRecords.aCD.uIDamageAmountEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void Save() {
			uIMapRecords.aCD.uISaveButton.click();
			popup.confirm.yes();
		}

		public void Close() {
			uIMapRecords.aCD.driver.close();
		}

		public void VerifyPopupAtDescription(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapRecords.aCD.uIPopupCopyChargeGridTable, rowIndex).getText()
					.contains(PoliceData.getRecordsModuleValue("Description")), "Verifying Description in Grid");
		}

		public void ClickPopupGridCheckboxUsingAtDescription() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.aCD.uIPopupCopyChargeGridTable, PoliceData.getRecordsModuleValue("Description"));
		}

		public void VerifyAtDescriptionInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.aCD.uIACDChargeGridTable,
							"Description", rowIndex));
		}

		public void selectPoliceForceUsed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.aCD.uIPoliceForceUsedComboBox);
			uIMapRecords.aCD.uIPoliceForceUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectDomesticViolation() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.aCD.uIDomesticViolationComboBox);
		}

		public void SelectPoliceForceUsedAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uIPoliceForceUsedComboBox,
					"None");
			uIMapRecords.aCD.uIPoliceForceUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtChargeUsingDescription() {
			popup.switchToCodedSearch();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getRecordsModuleValue("Description"));
		}

		public void SelectAtChargeUsingDescription1() {
			popup.switchToCodedSearch();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getRecordsModuleValue("Description1"));
		}

		public void VerifyAtDescription1InGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapRecords.aCD.uIACDChargeGridTable, "Description", rowIndex)
							.contains(PoliceData.getRecordsModuleValue("Description1")),
					"Verifying discription aded in grid");
		}

		public void VerifyRowCount(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(String.valueOf(rowCount), String.valueOf(
					objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.aCD.uIACDChargeGridTable)));
		}

		public void EnterAtCFS() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("CFS"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);

			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("CFS"));
				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			}

		}

		public void ClickUnknownCheckbox() {
			uIMapRecords.aCD.uIUnknownCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyOccurredAtInActive() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.aCD.uIOccuredAtDateEdit.getAttribute("class").contains("textboxInactive"),
					"Verify Occured At field inactive");
		}

		public void VerifyOccurredBetweenEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.aCD.uIOccuredBetweenDateEdit.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapRecords.aCD.uIOccuredBetweenDateEdit.getAttribute("class").contains("textbox"),
					"Verify Occured Between field active");
		}

		public void EnterOccuredBetweenDateAsPreviousDate() {
			uIMapRecords.aCD.uIOccuredBetweenDateEdit.sendKeys(Randomized.getPreviousDate(5, "MM/dd/yyyy"));
		}

		public void EnterOccuredToDateAsCurrentDate() {
			uIMapRecords.aCD.uIOccuredToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void VerifyUpdateSuccessfulMessage() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.aCD.uILeftSideStatusBar.getText().contains("1003 - Update Successful"));
			Playback.threadWait(5000);
		}

		public void VerifyOccuredDateTime(String caseReportedDate, String caseReportedTime) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate,
					uIMapRecords.aCD.uIOccuredAtDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime,
					uIMapRecords.aCD.uIOccuredAtTimeEdit.getAttribute("value"));
		}

		public void VerifyAtCFSInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.aCD.uIACDChargeGridTable,
							"CFS", rowIndex));
		}

		public void EnterAtCFS1() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("CFS1"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);

			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("CFS1"));
				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
				uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			}

		}

		public void ClickPopupCancelButton() {
			uIMapRecords.aCD.uIPopupChargeCancelButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtInactiveChargeRowColorAsRed() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.aCD.uIACDChargeGridTable,
							PoliceData.getRecordsModuleValue("Charge")).getAttribute("class").contains("Red"),
					"Verifying Color As RED");
		}

		public void ClickPopupAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.aCD.uIPopupCopyChargeGridTable, PoliceData.getRecordsModuleValue("CaseNo"));
		}

		public void SelectallChrageCheckPopup() {
			WebElement element = objectIdentification.manualIdentify
					.getGridHeaderTableCheckBox(uIMapRecords.aCD.uIPopupCopyChargeGridTable);
			element.click();
		}

		public void EnterAtCharge2() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS2"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge2"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}

		}
		public void EnterAtCharge3() {

			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
			// uIMapRecords.aCD.uIChargeCodeValue.sendKeys(Keys.TAB);
			String Lable = uIMapRecords.aCD.uIChargeLable.getText();
			Playback.controlReadyThreadWait();
			if (Lable.contains("CFS")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("CFS2"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			} else if (Lable.contains("Charge")) {

				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Charge3"));
				uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uICFSCodeEdit.sendKeys(Keys.TAB);
			}

		}

		public void SelectDomesticViolanceAsYes() {

			uIMapRecords.aCD.uIDomesticViolationComboBox.sendKeys("Yes");
		}

		public void verifyGamblingAndSafeEnterNotEnabled() {

			try {
				verify.ExpectedValueIsFalse(uIMapRecords.aCD.uIGamblingLabel.isDisplayed());
				verify.ExpectedValueIsFalse(uIMapRecords.aCD.uISafeEnteredLabel.isEnabled());
			} catch (Exception e) {
				objectIdentification.windowHandle.switchToWindow("ACD");
			}
		}

		public void verifyGamblingInvolvedDropdownIsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.aCD.uIGamblingInvolvedCombobox.isEnabled());
		}

		public void verifySafeEnteredDropdownIsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.aCD.uISafeEnteredCombobox.isEnabled());
		}

		public void selectAtGamblingInvolved() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uIGamblingInvolvedCombobox,
					PoliceData.getRecordsModuleValue("GamblingInvolved"));
			uIMapRecords.aCD.uIGamblingInvolvedCombobox.sendKeys(Keys.TAB);
		}

		public void selectAtSafeEntered() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uISafeEnteredCombobox,
					PoliceData.getRecordsModuleValue("SafeEntered"));
			uIMapRecords.aCD.uISafeEnteredCombobox.sendKeys(Keys.TAB);
		}

		public void verifyUsedBodyWornCameraCheckboxIsEnabled() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.aCD.uIUsedBodyWornCameraCheckbox.isEnabled());

		}

		public void selectAtPoliceForceUsed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uIPoliceForceUsedComboBox,
					PoliceData.getRecordsModuleValue("PoliceForceUsed"));
			uIMapRecords.aCD.uIPoliceForceUsedComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtDomesticViolance() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uIDomesticViolationComboBox,
					PoliceData.getRecordsModuleValue("DomesticViolance"));
			uIMapRecords.aCD.uIDomesticViolationComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtIdentityTheft() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.aCD.uIIdentityTheftComboBox,
					PoliceData.getRecordsModuleValue("IdentityTheft"));
			uIMapRecords.aCD.uIIdentityTheftComboBox.sendKeys(Keys.TAB);
		}

		public void clickSave()
	{
		 uIMapRecords.aCD.uISaveButton.click();
		 Playback.controlReadyThreadWait();
	}

	public void verifyOccuredFromTOorOccuredAtAcknowledgeMessage()
	{
		popup.acknowledge.okWithExpectedMessage("(7080) Enter Occurred From/Occurred To (or) Occurred At");
	}

	public void verifyDuplicateDataFoundAcknowledge() {
		
		popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		
	}
		public void clickPursuitReport() {
		uIMapRecords.aCD.uIPursuitReport.click();
		
	}


	}

	public class FTC {
		public void selectSuspectOfUsingAsNotApplicable() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uISuspectedOfUsingComboBox,
					"Not Applicable");
			Playback.controlReadyThreadWait();
		}

		public void selectAttemptedCompletedAsCompleted() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.fTCScreen.uIAttemptedCompletedComboBox, "Completed");
			Playback.controlReadyThreadWait();
		}
		public void selectAttemptedCompletedAsAttempted() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.fTCScreen.uIAttemptedCompletedComboBox, "Attempted");
			Playback.controlReadyThreadWait();
		}

		public void SelectBiasMotivation() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPoliceForceUsedComboBox);
			uIMapRecords.caseUpdate.caseUpdateCaseDataTab.uIPoliceForceUsedComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtAttemptedOrCompleted() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.fTCScreen.uIAttemptedCompletedComboBox,
					PoliceData.getRecordsModuleValue("AttemptedOrCompleted"));
			Playback.controlReadyThreadWait();
		}

		public void ClickSaveNClose() {
			uIMapRecords.fTCScreen.uISaveCloseButton.click();
		}

		public void saveNClose() {
			uIMapRecords.fTCScreen.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void SaveScreen() {
			uIMapRecords.fTCScreen.uISaveButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapRecords.fTCScreen.driver.close();
		}

		public void ClickSaveButton() {
			uIMapRecords.fTCScreen.uISaveButton.click();
		}

		public void ClickGeographyTextView() {
			uIMapRecords.fTCScreen.uIGeographyTextView.click();
		}

		public void ClickStudentHousingFacilityTextView() {
			uIMapRecords.fTCScreen.uIStudentHousingFacilityTextView.click();
		}

		public void ClickGeneralLocationTextView() {
			uIMapRecords.fTCScreen.uIGeneralLocationTextView.click();
		}

		public void ClickDomesticViolenceTextView() {
			uIMapRecords.fTCScreen.uIDomesticViolenceTextView.click();
		}

		public void ClickDatingViolenceTextView() {
			uIMapRecords.fTCScreen.uIDatingViolenceTextView.click();
		}

		public void ClickStalkingTextView() {
			uIMapRecords.fTCScreen.uIStalkingTextView.click();
		}

		public void SelectGeography() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIGeographyComboBox);
		}

		public void SelectGeneralLocation() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIGeneralLocationComboBox);
		}

		public void selectAtSuspectedOfUsing() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uISuspectedOfUsingComboBox,
					PoliceData.getRecordsModuleValue("SuspectedOfUsing"));
		}

		public void SelectDomesticViolence() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIDomesticViolenceComboBox);
		}

		public void SelectDatingViolence() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIDatingViolenceComboBox);
		}

		public void SelectStalking() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIStalkingComboBox);
		}

		public void SelectStudentHousingFacility() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.fTCScreen.uIStudentHousingFacilityComboBox);
		}

		public void VerifyAcknowledgeMessageGeography() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Geography");
		}

		public void VerifyAcknowledgeMessageGeneralLocation() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -General Location");
		}

		public void VerifyAcknowledgeMessageStudentHousingFacility() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Student Housing Facility");
		}

		public void VerifyAcknowledgeMessageDomesticViolence() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Domestic Violence");
		}

		public void VerifyAcknowledgeMessageDatingViolance() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Dating Violence");
		}

		public void VerifyAcknowledgeMessageStalking() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Stalking");
		}

		public void Verify7066BiasFormHateIndicatorIsAMandatoryFieldAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(7066) Bias Form Hate Indicator is a mandatory field");
		}

		public void VerifyAtCharge() {
			verify.ExpectedValueIsTrue(uIMapRecords.fTCScreen.uIChargeEdit.getAttribute("value")
					.contains(PoliceData.getRecordsModuleValue("Charge")), "Verifying Charge value in field");
		}

		public void VerifyHateIndicatorLabelIsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.fTCScreen.uIHateIndicatorTextView.getAttribute("style").contains("rgb(153, 0, 0)"));
		}

		public void SelectHateIndicator() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIHateIndicatorComboBox);
		}

		public void VerifyAtCFS() {
			verify.ExpectedValueIsTrue(uIMapRecords.fTCScreen.uICFSEdit.getAttribute("value")
					.contains(PoliceData.getRecordsModuleValue("CFS")), "Verifying CFS value in field");
		}

		public void SelectNIBRSAs90ZAllOtherOffenses() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					"90Z -All Other Offenses");
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}
public void SelectNIBRSAs23APocketPicking() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					"23A -Pocket Picking");
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}
		
		public void SelectNIBRSAs200Arson() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					"200 -Arson");
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}
		public void selectCrimeAgainstAsPerson() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICrimeAgainstComboBox,
					"Person");
			uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
		}

		public void selectCrimeAgainstAsProperty() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICrimeAgainstComboBox,
					"Property");
			// uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys("Property");
			// Playback.controlReadyThreadWait();
			uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
			// uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			// SelectElement Crime = new
			// SelectElement(uIMapRecords.fTCScreen.uICrimeAgainstComboBox);
			// Crime.SelectByText("Property");
			// uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtPropertyLoss() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIPropertyLossComboBox,
					PoliceData.getRecordsModuleValue("PropertyLoss"));
			uIMapRecords.fTCScreen.uIPropertyLossComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtPropertyLoss1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIPropertyLossComboBox,
					PoliceData.getRecordsModuleValue("PropertyLoss1"));
			uIMapRecords.fTCScreen.uIPropertyLossComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectLocationType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uILocationTypeComboBox);
			Playback.controlReadyThreadWait();
		}

		public void selectLocationTypeAsAmusementPark() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uILocationTypeComboBox,
					"Amusement Park");
			Playback.controlReadyThreadWait();
		}

		public void selectAtNIBRS() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					PoliceData.getRecordsModuleValue("NIBRS"));
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}

		public void SelectPropertyLossAsStolen() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIPropertyLossComboBox,
					"Stolen/Etc");
			uIMapRecords.fTCScreen.uIPropertyLossComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCrimeAgainstAsSociety() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICrimeAgainstComboBox,
					"Society");
			uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCriminalActivity() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICriminalActivityComboBox);
			uIMapRecords.fTCScreen.uICriminalActivityComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtCriminalActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICriminalActivityComboBox,
					PoliceData.getRecordsModuleValue("CriminalActivity"));
			uIMapRecords.fTCScreen.uICriminalActivityComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtWeaponsForceUsed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIWeaponsUsedComboBox,
					PoliceData.getRecordsModuleValue("WeaponsForceUsed"));
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void selectWeaponsUsedAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIWeaponsUsedComboBox,
					"None");
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectWeaponsUsedAsPersonalWeapon() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIWeaponsUsedComboBox,
					"Personal Weapons (i.e., Hands, Feet, Teeth, etc.)");
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCriminalActivityAsUsingConsuming() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICriminalActivityComboBox,
					"Using/Consuming");
			uIMapRecords.fTCScreen.uICriminalActivityComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtCrimeAgainst() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICrimeAgainstComboBox,
					PoliceData.getRecordsModuleValue("CrimeAgainst"));
			uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtLocationType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uILocationTypeComboBox,
					PoliceData.getRecordsModuleValue("LocationType"));
			uIMapRecords.fTCScreen.uILocationTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtPropertyLoss1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIPropertyLossComboBox,
					PoliceData.getRecordsModuleValue("PropertyLoss1"));
			uIMapRecords.fTCScreen.uIPropertyLossComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtNIBRS1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					PoliceData.getRecordsModuleValue("NIBRS1"));
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtCrimeAgainst1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICrimeAgainstComboBox,
					PoliceData.getRecordsModuleValue("CrimeAgainst1"));
			uIMapRecords.fTCScreen.uICrimeAgainstComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtLocationType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uILocationTypeComboBox,
					PoliceData.getRecordsModuleValue("LocationType1"));
			uIMapRecords.fTCScreen.uILocationTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtSuspectedOfUsing1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uISuspectUsingComboBox,
					PoliceData.getRecordsModuleValue("SuspectedOfUsing1"));
			uIMapRecords.fTCScreen.uISuspectUsingComboBox.sendKeys(Keys.TAB);
		}

		public void ClickMethodOfEntryForcedRadioButton() {
			uIMapRecords.fTCScreen.uIMethodofEntryForcedRadioButton.click();
		}

		public void SelectSuspectedDrugType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.fTCScreen.uISuspectedDrugTypeComboBox);
			uIMapRecords.fTCScreen.uISuspectedDrugTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectSuspectOfUsing() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uISuspectedOfUsingComboBox);
			Playback.controlReadyThreadWait();
		}

		public void SelectCriminalActivityAsOtherGang() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICriminalActivityComboBox,
					"Other Gang");
			uIMapRecords.fTCScreen.uICriminalActivityComboBox.sendKeys(Keys.TAB);
		}

		public void SelectDegree() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIDegreeComboBox);
			uIMapRecords.fTCScreen.uIDegreeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtNIBRS2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uINIBRSComboBox,
					PoliceData.getRecordsModuleValue("NIBRS2"));
			uIMapRecords.fTCScreen.uINIBRSComboBox.sendKeys(Keys.TAB);
		}

		public void SelectWeaponsUsedAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIWeaponsUsedComboBox, 12);
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectStudentHousingFF() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIStudentHousingFF,
					"StudentHousing");
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void selectWeaponsUsedAsUnknown() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uIWeaponsUsedComboBox,
					"Unknown");
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCriminalActivityAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uICriminalActivityComboBox,
					"None/Unknown");
			uIMapRecords.fTCScreen.uIWeaponsUsedComboBox.sendKeys(Keys.TAB);
		}

		public void verifyBiasMotivationLabelIsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.fTCScreen.uIBiasMotivationLable.getAttribute("style").contains("rgb(153, 0, 0)"));
		}
		
		 public void SelectLocationTypeAsAmusementPark()
	        {
	            objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.fTCScreen.uILocationTypeComboBox, "Amusement Park");
	            Playback.controlReadyThreadWait();
	        }

		 public void Verify7061WeaponForceUsedIsMandatoryAckMsg() {
	            popup.acknowledge.okWithExpectedMessage("(7061) Weapon/Force Used is a mandatory field");
	        }

		public void verifyAtLocationTypeNotListed() { // Added by Abi
			List<WebElement> dropDownOptionsElements = objectIdentification.manualIdentify
					.getDropDownOptionsElements(uIMapRecords.fTCScreen.uILocationTypeComboBox);
			verify.ExpectedValueIsFalse(
					dropDownOptionsElements.contains(PoliceData.getRecordsModuleValue("LocationType")));
		}

		public void verifyAtLocationType() { 			// Added by Abi
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownOptionsElements(uIMapRecords.fTCScreen.uILocationTypeComboBox)
					.contains(PoliceData.getRecordsModuleValue("LocationType")));
		}
	}

	public class CaseNames {

		public void ClickNameSearchButton() {
			Playback.waitForControlReady();
			objectIdentification.manualIdentify.setFocusElement(uIMapRecords.caseNames.uINamesSearchButton);
			uIMapRecords.caseNames.uINamesSearchButton.click();

		}

		public void EnterAtLastName() {
			uIMapRecords.caseNames.uILastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
			
		}

		public void EnterAtFirstName() {
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterJuvenileLastName() {
			uIMapRecords.caseNames.uILastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("JuvenileLastName"));
			uIMapRecords.caseNames.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerfiyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText());

		}

		public void SelectJuvenileName() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						PoliceData.getRecordsModuleValue("JuvenileLastName").toString() + ", "
								+ PoliceData.getRecordsModuleValue("JuvenileFirstName"));
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.pageLoadThreadWait();
				Playback.waitForPageLoad();

			}
			else
			{
			names.switchToNameSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText (
					uIMapNames.nameSearchHelpWindow.uIResultTable,
					PoliceData.getRecordsModuleValue("JuvenileLastName").toString() + ", "
							+ PoliceData.getRecordsModuleValue("JuvenileFirstName"));
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();

		}
		}

		public void SelectAtVictimName() {

			names.switchToNameSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText("grdRptName",
					PoliceData.getRecordsModuleValue("VictimLastName").toString() + ", "
							+ PoliceData.getRecordsModuleValue("VictimFirstName"));
			uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();

		}

		public void SelectName() {
			objectIdentification.randomIdentify.selectRandomGridRow("grdCBENames");
		}

		public void SelectAtArrestName() {
			names.switchToNameSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
					PoliceData.getRecordsModuleValue("ArrestLastName").toString() + ", "
							+ PoliceData.getRecordsModuleValue("ArrestFirstName"));
			uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
		}

		public void EnterAtOfficerNameAndTabOut() {

			uIMapRecords.caseNames.uILastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("OfficerLastName"));
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("OfficerFirstName"));
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(Keys.TAB);

		}

		public void SelectOfficerName() {
			
			
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						PoliceData.getRecordsModuleValue("OfficerLastName").toString() + ", "
								+ PoliceData.getRecordsModuleValue("OfficerFirstName"));
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.pageLoadThreadWait();
				Playback.waitForPageLoad();

			}
			else
			{
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						PoliceData.getRecordsModuleValue("OfficerLastName").toString() + ", "
								+ PoliceData.getRecordsModuleValue("OfficerFirstName"));
				Playback.pageLoadThreadWait();
				Playback.waitForPageLoad();

		}

		}

		public void selectActivityAsVictim() {

			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Victim");
		}

		public void SelectActivityAsArrested() {
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Arrested");

		}

		public void SelectActivityAsComplainant() {
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Complainant");

		}

		public void SelectActivityAsPoliceOfficer() {
			new Select(uIMapRecords.caseNames.uIActivityComboBox).selectByVisibleText("Police Officer");
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys(Keys.TAB);

		}

		public void ClickLEOKACheckbox() {

			uIMapRecords.caseNames.uILEOKACheckbox.click();
		}

		public void VerifyNameInfoIcon() {

			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uINameInfoIcon.isDisplayed());
		}

		public void ClickNameInfoButton() {

			uIMapRecords.caseNames.uINameInfoIcon.click();
			Playback.pageLoadThreadWait();

		}

		public void ClickSaveButton() {

			uIMapRecords.caseNames.uISaveButton.click();
		}

		public void VerifyNoDataPresentAckMsg() {

			popup.acknowledge.okWithExpectedMessage("(7) No data present");
		}

		public void VerifyVictimOffenderIcon(int rowIndex) {

			WebElement VictimOffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "V/O", rowIndex);
			WebElement VicOff = VictimOffenderIcon.findElement(By.tagName("img"));
			String VOicon = VicOff.getAttribute("src");
			verify.ExpectedValueIsTrue(VOicon.contains("NameVic1"));

		}

		public void VerifyDomesticViolenceIcon(int rowIndex) {

			WebElement DomesticViolenceIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "D", rowIndex);
			WebElement DomVio = DomesticViolenceIcon.findElement(By.tagName("img"));
			String DVicon = DomVio.getAttribute("src");
			verify.ExpectedValueIsTrue(DVicon.contains("ico_16_1022"));

		}

		public void VerifyGreenDomesticViolenceIcon(int rowIndex) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			WebElement DomesticViolenceIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "D", rowIndex);
			WebElement DomVio = DomesticViolenceIcon.findElement(By.tagName("img"));
			String DVGreenColor = DomVio.getAttribute("src");
			verify.ExpectedValueIsTrue(DVGreenColor.contains("DVName"));
		}

		public void ClickVictimOffenderIcon(int rowIndex) {
			WebElement VictimOffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "V/O", rowIndex);
			VictimOffenderIcon.click();
		}

		public void ClickDomesticViolenceIcon(int rowIndex) {
			WebElement DomesticViolenceIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "D", rowIndex);
			WebElement DomVio = DomesticViolenceIcon.findElement(By.tagName("img"));
			DomVio.click();

		}

		public void VerifyLeokaIcon(int rowIndex) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			WebElement LeokaIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "L", rowIndex).findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(LeokaIcon.getAttribute("src").contains("Resource"));

		}

		public void ClickLeokaIcon(int rowIndex) {
			WebElement LeokaIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "L", rowIndex).findElement(By.tagName("img"));
			LeokaIcon.click();

		}

		public void EnterComments() {

			uIMapRecords.caseNames.uICommentsEdit.sendKeys(Randomized.randomString(9));
		}

		public void clickAddButton() {
			uIMapRecords.caseNames.uIAddButton.click();

		}

		public void selectActivityAsOffender() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseNames.uIActivityComboBox,
					"Offender");

		}

		public void verifyUpdateButtonDisplayed() {
			String update = uIMapRecords.caseNames.uIAddButton.getAttribute("src");
			verify.ExpectedValueIsTrue(update.contains("UpdateData_Text1"));
		}

		public void VerifyUpdateSuccessfulMessage() {

			verify.ExpectedValueIsTrue(
					uIMapRecords.caseNames.uILeftSideStatusBar.getText().contains("1003 - Update Successful"));
			Playback.threadWait(5000);
		}

		public void Save() {
			uIMapRecords.caseNames.uISaveButton.click();
			Playback.threadWait();
			popup.confirm.yes();
			Playback.threadWait(10000);

		}

		public void SaveNClose() {

			uIMapRecords.caseNames.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseTheScreen() {
			uIMapRecords.caseNames.driver.close();

		}

		public void enterAtNameID() {
			uIMapRecords.caseNames.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseNames.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity"));
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtActivityInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseNames.uINamesTable,
							"Activity", rowIndex));
		}

		public void ClickPopupCancelButton() {
			
			try {
			Playback.controlReadyThreadWait();
			uIMapRecords.caseNames.uIPopupNamesCancelButton.click();
			Playback.controlReadyThreadWait();
			}
			catch(Exception e)
			{
				System.out.println("No Popup Available");
			}
		}

		public void VerfiyAtNameInCopyNameGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseNames.uIPopupCopyNamesGridTable, "Name", rowIndex).getText());

		}

		public void ClickPopupCopyButton() {
			uIMapRecords.caseNames.uIPopupNamesCopyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyCopyNamePopupButtonNotDisplayed() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.controlExist(uIMapRecords.caseNames.uIPopupNamesCopyButton)); 
			Playback.controlReadyThreadWait();
		}

		public void ClickPopupGridCheckboxUsingAtCharge() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseNames.uIPopupNamesCancelButton, PoliceData.getRecordsModuleValue("Charge"));
		}

		public void VerifyAtActivityRowColorAsRed() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
							PoliceData.getRecordsModuleValue("Activity")).getAttribute("class").contains("Red"),
					"Verifying Color As RED");
		}

		public void VerifySystemActivityCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage(
					"(6071) An Activity cannot be left as '[System]'. Please choose an activity type from the 'Activity' dropdown menu.");
		}

		public void ClickAtActivityInGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
					PoliceData.getRecordsModuleValue("Activity"));
			Playback.controlReadyThreadWait();
		}

		public void SelectActivityAsCaller() {
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Caller");

		}

		public void VerifyAtNameRowColorAsBlack() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
									PoliceData.getRecordsModuleValue("Name"))
							.getCssValue("color").contains("0, 0, 0, 1"),
					"Verifying Color As Black");
		}

		public void EnterAtSortOrder() {
			uIMapRecords.caseNames.uISortNoEdit.sendKeys(PoliceData.getRecordsModuleValue("SortOrder"));
		}

		public void EnterAtSortOrder1() {
			uIMapRecords.caseNames.uISortNoEdit.sendKeys(PoliceData.getRecordsModuleValue("SortOrder1"));
		}

		public void ClickAtActivity1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
					PoliceData.getRecordsModuleValue("Activity1"));
		}

		public void VerifyAtActivity1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity1"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseNames.uINamesTable,
							"Activity", rowIndex));
		}

		public void ClickUseOfForceButton() {
			uIMapRecords.caseNames.uIUseOfForceButton.click();
		}

		public void VerifyPopupAtSubjectName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("SubjectName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseNames.uIPopupCopyNamesGridTable, "Name", rowIndex));
		}
		
		public void ClickPopupCloseIcon() {
			uIMapRecords.caseNames.uIPopupUseOfForceCloseIcon.click();
		}

		public void ClickPopupGridCheckboxUsingAtArrestName() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapRecords.caseNames.uIPopupNamesCancelButton, PoliceData.getRecordsModuleValue("ArrestLastName")
							+ ", " + PoliceData.getRecordsModuleValue("ArrestFirstName"));
		}

		public void ClickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
					PoliceData.getRecordsModuleValue("Name"));
		}

		public void VerifyAtNameRowColorAsRed() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
							PoliceData.getRecordsModuleValue("Name")).getAttribute("class").contains("Red"),
					"Verifying Color As RED");
		}

		public void EnterAtNameID1() {
			uIMapRecords.caseNames.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void VerifyLeokaIconNotShowing() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uILEOKACheckbox.getAttribute("style").contains("hidden"),
					"Verify Leoka Icon not showing");
		}

		public void SelectAtActivity1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseNames.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity1"));
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtActivity2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseNames.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity2"));
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtJNameID() {
			uIMapRecords.caseNames.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("JNameID").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("JNameID").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyParantGaurdianNameTypeDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIParantGaurdianNameTypeEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIParantGaurdianNameTypeIDEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIParantGaurdianNameTypeEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIParantGaurdianNameTypeIDEdit.isDisplayed());
		}

		public void VerifyRelationshipsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.caseNames.uIReletionshipComboBox.getAttribute("class").contains("SELECTInActive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIReciprocalRelationshipComboBox.getAttribute("class")
					.contains("SELECTInActive"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIReletionshipComboBox.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIReciprocalRelationshipComboBox.isDisplayed());
		}

		public void VerifyRelationshipsLabelEditable() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIReletionshipLabel.getAttribute("style")
					.contains("text-decoration: underline"));
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIReciprocalRelationshipLabel.getAttribute("style")
					.contains("text-decoration: underline"));
		}

		public void EnterAtJNameID1() {
			uIMapRecords.caseNames.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("JNameID1").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("JNameID1").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyRelationshipAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Relationship");
		}

		public void SelectRelationship() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.caseNames.uIReletionshipComboBox);
			uIMapRecords.caseNames.uIReletionshipComboBox.sendKeys(Keys.TAB);
		}

		public void SelectReciprocalRelationship() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.caseNames.uIReciprocalRelationshipComboBox);
			uIMapRecords.caseNames.uIReciprocalRelationshipComboBox.sendKeys(Keys.TAB);
		}

		public void EnterParentGaurdianNameID() {
			uIMapRecords.caseNames.uIParantGaurdianNameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ParentsGuardianID").substring(0, 1));
			uIMapRecords.caseNames.uIParantGaurdianNameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ParentsGuardianID").substring(2));
			uIMapRecords.caseNames.uIParantGaurdianNameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void VerfiyAtName1InCopyNameGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseNames.uIPopupCopyNamesGridTable, "Name", rowIndex).getText());

		}

		public void VerifyAddedNamesRowCount(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(String.valueOf(rowCount), String.valueOf(
					objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.caseNames.uINamesTable)));
		}

		public void EnterAtLastName1() {
			uIMapRecords.caseNames.uILastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("LastName1"));
		}

		public void EnterAtFirstName1() {
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("FirstName1"));
			uIMapRecords.caseNames.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerfiyAtName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText());

		}

		public void VerfiyAtName2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name2"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText());

		}

		public void VerfiyActivityAsArrestInCopyNameGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("Arrest", objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uIPopupCopyNamesGridTable, "Activity", rowIndex).getText());

		}

		public void EnterAtHNameID() {
			uIMapRecords.caseNames.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameHID").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameHID").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtHNameID1() {
			uIMapRecords.caseNames.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameHID1").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameHID1").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtHNameID2() {
			uIMapRecords.caseNames.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameHID2").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameHID2").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void SelectActivityAsSuspect() {

			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Suspect");
		}

		public void SelectActivityAsMissingPerson() {
			uIMapRecords.caseNames.uIActivityComboBox.sendKeys("Missing Person");

		}

		public void VerifyPopupAtActivityInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseNames.uIPopupCopyNamesGridTable, "Activity", rowIndex));
		}

		public void clickPrint() {
			uIMapRecords.caseNames.uIPrintButton.click();
		}

		public void clickOnVitimIcon(int rowIndex) {
			WebElement VictimOffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseNames.uINamesTable, "V/O", rowIndex);
			WebElement VicOff = VictimOffenderIcon.findElement(By.tagName("img"));
			VicOff.click();
		}

		public void enterAtNameID2() {
			uIMapRecords.caseNames.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(0, 1));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(2));
			uIMapRecords.caseNames.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void verfiyAtNameInGridByLastNameFirstName(int rowIndex) {
			if (rowIndex == 0) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText()
						.contains(PoliceData.getRecordsModuleValue("LastName")));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText()
						.contains(PoliceData.getRecordsModuleValue("FirstName")));
			} else {

				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText()
						.contains(PoliceData.getRecordsModuleValue("LastName" + rowIndex + "")));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapRecords.caseNames.uINamesTable, "Name", rowIndex).getText()
						.contains(PoliceData.getRecordsModuleValue("FirstName" + rowIndex + "")));

			}

		}

		public void clickAtActivity2InGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable,
					PoliceData.getRecordsModuleValue("Activity2"));
		}

		public void verifyPopupActivity(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PopupActivity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseNames.uIPopupUseOfForceGridTable, "Activity", rowIndex));
		}

		public void verifyAtNameInGrid() 
{
	WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapRecords.caseNames.uINamesTable, PoliceData.getRecordsModuleValue("LastName")+", "+PoliceData.getRecordsModuleValue("FirstName"));
	verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(PoliceData.getRecordsModuleValue("LastName")+", "+PoliceData.getRecordsModuleValue("FirstName")));
}

		public void verifySaveSaveAndCloseButtonsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uISaveButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uISaveAndCloseButton.isEnabled());
				
		}
		public void verifySaveSaveAndCloseButtonsDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.caseNames.uISaveButton.isEnabled());
			verify.ExpectedValueIsFalse(uIMapRecords.caseNames.uISaveAndCloseButton.isEnabled());
				
		}

		public void verifyQaFormButtonAsGrayColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIQaFormIcon.getAttribute("src").contains("Grey.png"));
			
		}
		public void verifyQaFormButtonDisabled() {
			verify.ExpectedValueIsFalse(	uIMapRecords.caseNames.uIQaFormIcon.isEnabled());
			
		}
		public void verifyQaFormButtonAsBlueColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIQaFormIcon.getAttribute("src").contains("Blue.png"));
			
		}
		public void verifyDomesticViolenceButtonAsBlueColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIDomesticViolenceIcon.getAttribute("src").contains("Blue.png"));
			
		}
		public void verifyQaFormButtonAsGreenColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIQaFormIcon.getAttribute("src").contains("Green.png"));
			
		}
		public void verifyQaFormButtonEnabled() {
			verify.ExpectedValueIsTrue(	uIMapRecords.caseNames.uIQaFormIcon.isEnabled());
			
		}
		public void clickQaFormsButton()
		{
			uIMapRecords.caseNames.uIQaFormIcon.click();
		}
		public void verifyVictimOffenderButtonAsGrayColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIVictimOffendrOuterIcon.getAttribute("src").contains("Grey.png"));
			
		}
		public void verifyVictimOffenderButtonAsRedColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIVictimOffendrOuterIcon.getAttribute("src").contains("Red.png"));
			
		}
		public void verifyVictimOffenderButtonEnabled() {
			verify.ExpectedValueIsTrue(	uIMapRecords.caseNames.uIVictimOffendrOuterIcon.isEnabled());
			
		}
		public void verifyVictimOffenderButtonDisabled() {
			verify.ExpectedValueIsFalse(	uIMapRecords.caseNames.uIVictimOffendrOuterIcon.isEnabled());
			
		}
		public void clickVictimOffenderButton()
		{
			uIMapRecords.caseNames.uIVictimOffendrOuterIcon.click();
		}
		
		public void verifyVictimOffenderButtonAsGreenColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIVictimOffendrOuterIcon.getAttribute("src").contains("Green.png"));
			
		}
		public void verifyDomesticViolenceButtonAsGreenColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIDVReportButton.getAttribute("src").contains("Green.png"));
			
		}
		public void verifyDomesticViolenceButtonAsGrayColor() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIDVReportButton.getAttribute("src").contains("Grey.png"));
			
		}

		public void verifyUseOfForceReportButtonIsBlueColor() {
            String colour = uIMapRecords.caseNames.uIUseOfForceReportButton.getAttribute("src");
            verify.ExpectedValueIsTrue(colour.contains("Blue"));
        }

		public void clickUseOfForceReportButton() {
            uIMapRecords.caseNames.uIUseOfForceReportButton.click();
        }

		public void clickRefreshIcon() {
            uIMapRecords.caseNames.uIRefreshIcon.click();
        }

		public void verifyUseOfForceReportButtonIsGreenColor() {
            String colour = uIMapRecords.caseNames.uIUseOfForceReportButton.getAttribute("src");
            verify.ExpectedValueIsTrue(colour.contains("Green"));
        }

		public void verifyQAFormButtonIsBlueColor() {
            String colour = uIMapRecords.caseNames.uIQAFormButton.getAttribute("src");
            verify.ExpectedValueIsTrue(colour.contains("Blue"));
        }
       
        public void verifyDVReportButtonIsBlueColor() {
            String colour = uIMapRecords.caseNames.uIDVReportButton.getAttribute("src");
            verify.ExpectedValueIsTrue(colour.contains("Blue"));
        }

        public void verifyDVReportButtonEnabled() {
            verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uIDVReportButton.isEnabled());
        }

        public void clickDVReportButton() {
            uIMapRecords.caseNames.uIDVReportButton.click();
        }
	}

	public class NameVictim {

		public void selectVictimTypeAsIndividual() {
			uIMapRecords.nameVictim.uIVictimTypeComboBox.sendKeys("I - Individual");
			uIMapRecords.nameVictim.uIVictimTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtVictimType() {
			uIMapRecords.nameVictim.uIVictimTypeComboBox.sendKeys(PoliceData.getRecordsModuleValue("VictimType"));
			uIMapRecords.nameVictim.uIVictimTypeComboBox.sendKeys(Keys.TAB);
		}

		public void VerfiyAtLastName() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("LastName"),
					uIMapRecords.nameVictim.uILastNameEdit.getAttribute("value"));
			uIMapRecords.nameVictim.uINameInfoButton.click();
			names.switchToNameEntry();
			names.nameEntry.closeTheScreen();
		}

		public void SelectCFSAsHomicide() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("1-CRIMINAL HOMICIDE");
		}

		public void SelectAtCFS() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("CFS"));
		}

		public void SelectAtCharge() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIChargeComboBox,
					PoliceData.getRecordsModuleValue("Charge"));
		}

		public void ClickSaveButton() {
			uIMapRecords.nameVictim.uISaveButton.click();

		}

		public void VerifyVictimNotConnectedCFSCodeAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(7106) Victim not connected to any CFSCode");

		}

		public void Save() {
			uIMapRecords.nameVictim.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapRecords.nameVictim.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void clickAddButton() {
			uIMapRecords.nameVictim.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickOffenderIconUsingDescription() {

			objectIdentification.manualIdentify.getGridCell(uIMapRecords.nameVictim.uIResultTable,
				"CRIMINAL HOMICIDE", "Offender").click();
		}

		public void ClickOffenderIcon() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.getGridCell(uIMapRecords.nameVictim.uIResultTable, "Offender", 0)
					.click();
		}

		public void VerifyRedOffenderIcon(int rowIndex) {

			WebElement OffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.nameVictim.uIResultTable, "Offender", rowIndex);
			WebElement OFFIcon = OffenderIcon.findElement(By.tagName("img"));
			String OffRedIcon = OFFIcon.getAttribute("src");
			verify.ExpectedValueIsTrue(OffRedIcon.contains("Offender_Red"));

		}

		public void VerifyGreenOffenderIcon(int rowIndex) {

			WebElement OffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.nameVictim.uIResultTable, "Offender", rowIndex);
			WebElement OFFIcon = OffenderIcon.findElement(By.tagName("img"));
			String OffRedIcon = OFFIcon.getAttribute("src");
			verify.ExpectedValueIsTrue(OffRedIcon.contains("Offender_Green"));

		}

		public void SelectDomesticViolation() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.nameVictim.uIDomesticViolationComboBox);
			uIMapRecords.nameVictim.uIDomesticViolationComboBox.sendKeys(Keys.TAB);
		}

		public void selectDomesticViolenceAsNo() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.nameVictim.uIDomesticViolationComboBox, "No");
			uIMapRecords.nameVictim.uIDomesticViolationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCircumstances1AsArgument() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICircumstances1ComboBox,
					"Argument");
			uIMapRecords.nameVictim.uICircumstances1ComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCFSAsImmigration() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("Immigration");

		}

		public void SelectCFS() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox);
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys(Keys.TAB);
		}

		public void Close() {
			uIMapRecords.nameVictim.driver.close();
		}

		public void VerifyDomesticViolationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7194) Domestic Violence is required");
		}

		public void clickOffenderIconInGrid(int rowIndex) {

			WebElement OffenderIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.nameVictim.uIResultTable, "Offender", rowIndex);
			OffenderIcon.click();
		}

		public void SelectInjuryLevelAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIInjuryLevelComboBox,
					"None");
			uIMapRecords.nameVictim.uIInjuryLevelComboBox.sendKeys(Keys.TAB);
		}

		public void clickInjuryLevelAddButton() {
			uIMapRecords.nameVictim.uIInjuryLevelAddButton.click();
		}

		public void SelectInjuryLevel() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIInjuryLevelComboBox);
			uIMapRecords.nameVictim.uIInjuryLevelComboBox.sendKeys(Keys.TAB);
		}

		public void SelectChargeOffense() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIChargeComboBox);
			uIMapRecords.nameVictim.uIChargeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtCircumstances1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICircumstances1ComboBox,
					PoliceData.getRecordsModuleValue("Circumstances1"));
			uIMapRecords.nameVictim.uIDomesticViolationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectJustifiableHomicide() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.nameVictim.uIJustifiableHomicideComboBox);
			uIMapRecords.nameVictim.uIJustifiableHomicideComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCFSAsSimpleAssault() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("Simple Assault");
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCFSAsHumanTrafficking() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("Human Trafficking - Commercial Sex Acts");
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys(Keys.TAB);
		}

		public void SelectCFSAsIntimidationIncludingStalking() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("Intimidation (Including Stalking)");
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys(Keys.TAB);
		}

		public void ClickOffenderIconUsingCFSCode() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("CFSCode"), "Offender");
			OffenderIcon.click();
		}

		public void ClickOffenderIconUsingCFSCode1() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("CFSCode1"), "Offender");
			OffenderIcon.click();
		}

		public void ClickOffenderIconUsingCFSCode2() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("CFSCode2"), "Offender");
			OffenderIcon.click();
		}

		public void VerifyDuplicationDataFoundAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void SelectAtCFSDescription() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("Description"));
		}

		public void selectAtCFSDescription1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("Description1"));
		}

		public void ClickOffenderIconUsingCharge() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("Charge"), "Offender");
			OffenderIcon.click();
		}

		public void ClickOffenderIconUsingCharge1() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("Charge1"),
					"Offender");
			OffenderIcon.click();
		}

		public void SelectCircumstances1AsOtherNegligentWeaponHandling() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICircumstances1ComboBox,
					"Other Negligent Weapon Handling");
			uIMapRecords.nameVictim.uICircumstances1ComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtChargeOffense() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("ChargeOffense"));
		}

		public void SelectAtChargeOffense1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("ChargeOffense1"));
		}

		public void SelectAtChargeOffense2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox,
					PoliceData.getRecordsModuleValue("ChargeOffense2"));
		}

		public void ClickOffenderIconUsingCFSDescription2() {
			WebElement OffenderIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapRecords.nameVictim.uIResultTable, PoliceData.getRecordsModuleValue("Description2"),
					"Offender");
			OffenderIcon.click();
		}

		public void SelectCFSAsAggravatedAssault() {
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys("Aggravated Assault - Gun");
			uIMapRecords.nameVictim.uICFSComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtInjuryLevel() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIInjuryLevelComboBox,
					PoliceData.getRecordsModuleValue("InjuryLevel"));
			uIMapRecords.nameVictim.uIInjuryLevelComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtCharge1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uIChargeComboBox,
					PoliceData.getRecordsModuleValue("Charge1"));
		}
		
		public void selectCFSByIndex() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.nameVictim.uICFSComboBox, 1);
		}

		public void clickRefresh() {
			uIMapRecords.nameVictim.uIRefresh.click();			
			Playback.pageLoadThreadWait();
		}
		
	}

	public class VictimOffender {

		public void SelectRelationshipAsRelationshipUnknown() {

			uIMapRecords.victimOffender.uIRelationshipComboBox.sendKeys("RelationshipUnknow");

		}

		public void SelectOffender() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox);

		}

		public void selectAtOffender() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					PoliceData.getRecordsModuleValue("Offender"));
		}

		public void SelectAtRelationship() {
			uIMapRecords.victimOffender.uIOffenderComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIRelationshipComboBox,
					PoliceData.getRecordsModuleValue("Relationship"));
		}

		public void ClickSaveButton() {
			uIMapRecords.victimOffender.uISaveButton.click();

		}

		public void VerifyVictimOffenderRelationNotProvidedAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(7126) Victim/Offender relationship is not provided");

		}

		public void clickAddButton() {
			uIMapRecords.victimOffender.uIAddButton.click();

		}

		public void ClickSaveNCloseButton() {
			uIMapRecords.victimOffender.uISaveNCloseButton.click();

		}

		public void saveNClose() {
			uIMapRecords.victimOffender.uISaveNCloseButton.click();
			popup.confirm.yes();

		}

		public void ClickOffenderUnknownCheckBox() {
			uIMapRecords.victimOffender.uIOffenderUnknownCheckBox.click();
		}

		public void selectRelationshipAsVictimWasFriend() {

			uIMapRecords.victimOffender.uIRelationshipComboBox.sendKeys("Victim Was Friend");

		}

		public void Close() {
			uIMapRecords.victimOffender.driver.close();
		}

		public void SelectOffenderAsSuspect1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					"Suspect1");
			uIMapRecords.victimOffender.uIOffenderComboBox.sendKeys(Keys.TAB);

		}

		public void SelectOffenderAsSuspect2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					"Suspect2");
			uIMapRecords.victimOffender.uIOffenderComboBox.sendKeys(Keys.TAB);

		}

		public void SelectOffenderAsSuspect3() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					"Suspect3");
			uIMapRecords.victimOffender.uIOffenderComboBox.sendKeys(Keys.TAB);

		}

		public void SelectOffenderAsSuspect4() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					"Suspect4");
			uIMapRecords.victimOffender.uIOffenderComboBox.sendKeys(Keys.TAB);

		}

		public void selectAtOffender1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					PoliceData.getRecordsModuleValue("Offender1"));
		}

		public void SelectAtOffender2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					PoliceData.getRecordsModuleValue("Offender2"));
		}

		public void SelectAtOffender3() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIOffenderComboBox,
					PoliceData.getRecordsModuleValue("Offender3"));
		}

		public void SelectAtRelationship1() {
			uIMapRecords.victimOffender.uIOffenderComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.victimOffender.uIRelationshipComboBox,
					PoliceData.getRecordsModuleValue("Relationship1"));
		}
	}

	public class DomesticViolence {

		public void VerifyLastNameInNameEntryScreen() {
			String lastName = uIMapRecords.domesticViolence.uILastNameEdit.getAttribute("value");
			uIMapRecords.domesticViolence.uINameInfoButton.click();
			names.switchToNameEntry();
			names.nameEntry.closeTheScreen();

		}

		public void SelectOffender() {

			uIMapRecords.domesticViolence.uIOffenderComboBox
					.sendKeys(PoliceData.getRecordsModuleValue("ArrestLastName").toString() + ", "
							+ PoliceData.getRecordsModuleValue("ArrestFirstName"));

		}

		public void Save() {
			uIMapRecords.domesticViolence.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapRecords.domesticViolence.uISaveNCloseButton.click();
			popup.confirm.yes();

		}

		public void VerifyUpdateSuccessfulMessage() {
			String UpdateMessage = uIMapRecords.domesticViolence.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
			Playback.wait(2000);
		}

	}

	public class Leoka {

		public void ClickOfficerKilledCheckbox() {

			uIMapRecords.leokaScreen.uIOfficerKilledCheckbox.click();

		}

		public void VerifyGrayOutLeokaFields() {

			verify.ExpectedValueIsTrue(!uIMapRecords.leokaScreen.uICircumstanceComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapRecords.leokaScreen.uITypeOfAssignmentComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapRecords.leokaScreen.uIWeaponUsedComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapRecords.leokaScreen.uIPersonalInqCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapRecords.leokaScreen.uIPoliceAssualtClearedCheckBox.isEnabled());
		}

		public void ClickFeloniousActRadioButton() {

			uIMapRecords.leokaScreen.uIFeloniousActRadioButton.click();
		}

		public void SaveNClose() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapRecords.leokaScreen.uISaveNCloseButton.click();
			popup.confirm.yes();

		}

		public void ClickPersonalInjuryCheckBox() {
			uIMapRecords.leokaScreen.uIPersonalInqCheckBox.click();
		}

		public void SelectCircumstance() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.leokaScreen.uICircumstanceComboBox);
			uIMapRecords.leokaScreen.uICircumstanceComboBox.sendKeys(Keys.TAB);
		}

		public void SelectWeaponUsed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.leokaScreen.uIWeaponUsedComboBox);
			uIMapRecords.leokaScreen.uIWeaponUsedComboBox.sendKeys(Keys.TAB);
		}

		public void SelectypeOfAssignment() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.leokaScreen.uITypeOfAssignmentComboBox);
			uIMapRecords.leokaScreen.uITypeOfAssignmentComboBox.sendKeys(Keys.TAB);
		}
	}

	public class CaseVehicle {

		public void EnterVehicleAtPlateCheckVehicle() {

			uIMapRecords.caseVehicle.uIVehicleNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("PlateCheckVehicle"));
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(PoliceData.getRecordsModuleValue("State"));
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(Keys.TAB);

		}

		public void SelectActivityAsPlateCheck() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIActivityComboBox,
					"Plate Check");
			uIMapRecords.caseVehicle.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void SelectActivityAsFieldInterview() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIActivityComboBox,
					"Field Interview");
			uIMapRecords.caseVehicle.uIActivityComboBox.sendKeys(Keys.TAB);

		}

		public void SelectInsuranceCompany() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.caseVehicle.uIInsuranceCompanyComboBox);
			uIMapRecords.caseVehicle.uIInsuranceCompanyComboBox.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {

			uIMapRecords.nameVictim.uIAddButton.click();
		}

		public void Save() {
			uIMapRecords.domesticViolence.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapRecords.leokaScreen.uISaveNCloseButton.click();
			popup.confirm.yes();

		}

		public void EnterVehicleAtFIVehicle() {
			uIMapRecords.caseVehicle.uIVehicleNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("FIVehicle"));
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(PoliceData.getRecordsModuleValue("State"));
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(Keys.TAB);
		}

		public void CloseTheScreen() {

			uIMapRecords.caseVehicle.driver.close();

		}

		public void ClickVehicleSearchMagnifyIcon() {
			uIMapRecords.caseVehicle.uIVehicleLookupButton.click();
		}

		public void VerifyVehicleBoatSearchWindowDisappears() {

			verify.ExpectedValueIsFalse(objectIdentification.windowHandle.windowExist("Vehicle/Boat Search - 3231"),
					"Vehicle/Boat Search -  3231 help window disappeared");
		}

		public void EnterAtVehicle() {
			uIMapRecords.caseVehicle.uIVehicleNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("Vehicle"));
            uIMapRecords.caseVehicle.uIVehicleNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectStateAsNJ() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIVehicleStateComboBox,
					"NJ");
		}

		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIActivityComboBox,
					PoliceData.getRecordsModuleValue("Activity"));
		}

		public void ClickAtActivityInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable,
					PoliceData.getRecordsModuleValue("Activity"));
		}

		public void SelectActivityAsTow() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIActivityComboBox,
					"Tow");
		}

		public void VerifyActivityAsTowInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Tow", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable, "Activity", rowIndex));
		}
		public void VerifyActivityAsPlateCheckinGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Plate Check", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable, "Activity", rowIndex));
		}
		public void VerifyActivityAsFieldInterviewinGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Field Interview", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable, "Activity", rowIndex));
		}

		public void EnterAtNameID() {
			uIMapRecords.caseVehicle.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.caseVehicle.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.caseVehicle.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void ClickNameInfoIcon() {
			uIMapRecords.caseVehicle.uINameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectStateAsWI() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIVehicleStateComboBox,
					"WI");
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void VerifyAtActivity(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable,
							"Activity", rowIndex));
		}

		public void VerifyAtPlate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Plate"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable,
							"Plate", rowIndex));
		}

		public void VerifyAtSerial(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Serial"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable,
							"Serial", rowIndex));
		}

		public void selectAtVehicleState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.caseVehicle.uIVehicleStateComboBox,
					PoliceData.getRecordsModuleValue("VehicleState"));
			uIMapRecords.caseVehicle.uIVehicleStateComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtName()
	    	{
	    		uIMapRecords.caseVehicle.uILastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
	    		uIMapRecords.caseVehicle.uILastNameEdit.sendKeys(Keys.TAB);
	    		uIMapRecords.caseVehicle.uIFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
	    		uIMapRecords.caseVehicle.uIFirstNameEdit.sendKeys(Keys.TAB);
	    	}
	    	
	    	public void verifyAtNameInGrid(int rowIndex)
	    	{
	    		verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("LastName") + ", "+PoliceData.getRecordsModuleValue("FirstName"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.caseVehicle.uIVehicleTable, "Name", rowIndex));
	    	}

	    	public void verifySaveSaveAndCloseButtonsEnabled() {
				verify.ExpectedValueIsTrue(uIMapRecords.caseVehicle.uISaveButton.isEnabled());
				verify.ExpectedValueIsTrue(uIMapRecords.caseNames.uISaveAndCloseButton.isEnabled());				
			
		}
			public void verifySaveSaveAndCloseButtonsDisabled() {
				verify.ExpectedValueIsFalse(uIMapRecords.caseVehicle.uISaveButton.isEnabled());
				verify.ExpectedValueIsFalse(uIMapRecords.caseNames.uISaveAndCloseButton.isEnabled());	
		}

	}

	public class Questionnarie {

		public void SelectFormAsTest() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
					"Test (Multiple)");
			Playback.waitForControlReady();
		}

		public void ClickFillFormButton() {

			uIMapQA.questionnarie.uIFillFormButton.click();

		}

		public void ClickRefreshButton() {

			uIMapQA.questionnarie.uIRefreshButton.click();
			Playback.pageLoadThreadWait();
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

		public void SelectFormAsTestMultiple() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
					"Test (Multiple)");
			Playback.waitForControlReady();
}

		public void selectAtSelectForm() {



objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
PoliceData.getRecordsModuleValue("SelectForm"));
Playback.waitForControlReady();
}
public void verifyAtPFNoInGrid()
{
WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapQA.questionnarie.uIResultTable, PoliceData.getRecordsModuleValue("PFNo"));
verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(PoliceData.getRecordsModuleValue("PFNo")));
}

	}

	public class QuestionDataEntry {

		public void TabOutPF() {

			uIMapQA.questionDataEntry.uIPFCodeEdit.click();
			uIMapQA.questionDataEntry.uIPFCodeEdit.sendKeys(Keys.TAB);

		}

		public void FillTheQAForm() {

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


		public void ClickSaveButton() {
			uIMapQA.questionDataEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterAtPFCode() {
			uIMapQA.questionDataEntry.uIPFCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("PFCode"));
		}

		public void ClickLockButton() {
			uIMapQA.questionDataEntry.uILockButton.click();
		}

		public void VerifyLockConfirmMessage() {
			popup.confirm.yesWithExpectedMessage(
					"(3506) This will lock theform and no further updates will be allowed. Are you sure you want to continue?");
		}

		public void VerifyLockButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapQA.questionDataEntry.uILockButton.getAttribute("disabled").contains("true"));
		}

		public void clickYesRadioButton()
		{
		uIMapQA.questionDataEntry.uIYesButton.click();

		}
	}

	public class IBRSearch {
		public void ClickSearchbutton() {
			uIMapRecords.iBRSearch.uISearchButton.click();
		}

		public void EnterNumberControlCaseNo() {
			uIMapRecords.iBRSearch.uICaseNumberFromEdit.sendKeys(String.valueOf(Randomized.getRandomNumber()));
			uIMapRecords.iBRSearch.uICaseNumberFromEdit.sendKeys(Keys.ENTER);
		}

		public void verifyToDateAsCurrentDateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("MM/dd/yy"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.iBRSearch.uIIBRSearchTable,
							"To Date", rowIndex));
		}

		public void verifyMonthInGrid(int rowIndex) {
			String month =Randomized.getCurrentMonthName().toUpperCase();
			String year = Randomized.getCurrentYear().substring(2, 4);
			
			verify.ExpectedPropertyValueIsEqual(
					month+" "+year,
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.iBRSearch.uIIBRSearchTable,
							"Month", rowIndex));
		}

		public void ClickbatchNoinGrid(String batchNo) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.iBRSearch.uIIBRSearchTable,
					batchNo);
		}
	}

	public class DVEntry {
		public void VerifyAtCaseNo() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2),
					uIMapRecords.dVEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(3),
					uIMapRecords.dVEntry.uICaseNumberEdit.getAttribute("value"));
		}

		public void ClickAlcoholInvolvedCheckBox() {
			uIMapRecords.dVEntry.uIAlcoholInolvedCheckBox.click();
		}

		public void ClickOtherDrugsInvolvedCheckBox() {
			uIMapRecords.dVEntry.uIotherDrugsInvolvedCheckBox.click();
		}

		public void EnterTotalTimeSpent() {
			uIMapRecords.dVEntry.uITotalTimeSpentHourEdit.sendKeys("23");
		}

		public void EnterTotalMinpent() {
			uIMapRecords.dVEntry.uITotalTimeSpentMinEdit.sendKeys("55");
		}

		public void SelectViolationofDomesticViolationYes() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox, "Yes");
			uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectViolationofDomesticViolationNo() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox, "No");
			uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyVictimInformationfieldsDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIPergenantCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIDisabledPsycologicalCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIDisabledPhysicalCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIDisabledor60YearsOldCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIChildPresentCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIChildrenInolvedCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIDatingRelationshipCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIVORelationshipComboBox.getAttribute("disabled")));
		}

		public void SelectAllVictimInformationFieldsCheckboxs() {
			uIMapRecords.dVEntry.uIPergenantCheckBox.click();
			uIMapRecords.dVEntry.uIDisabledPsycologicalCheckBox.click();
			uIMapRecords.dVEntry.uIDisabledPhysicalCheckBox.click();
			uIMapRecords.dVEntry.uIDisabledor60YearsOldCheckBox.click();
			uIMapRecords.dVEntry.uIChildPresentCheckBox.click();
			uIMapRecords.dVEntry.uIDatingRelationshipCheckBox.click();
		}

		public void SelectVORelationship() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIVORelationshipComboBox);
		}

		public void SelectAtOffenderName() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIOffenderNameComboBox,
					PoliceData.getRecordsModuleValue("OffenderName"));
			uIMapRecords.dVEntry.uIOffenderNameComboBox.sendKeys(Keys.TAB);
			
		}

		public void SelectAtOffenderName1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIOffenderNameComboBox,
					PoliceData.getRecordsModuleValue("OffenderName1"));
		}

		public void SelectAtOffenderName2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIOffenderNameComboBox,
					PoliceData.getRecordsModuleValue("OffenderName2"));
			uIMapRecords.dVEntry.uIOffenderNameComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtOffenderSex() {
			verify.ExpectedValueIsTrue(uIMapRecords.dVEntry.uIOffenderLabelSexTextView.getText()
					.contains(PoliceData.getRecordsModuleValue("Sex")));
		}

		public void VerifyAtOffenderRace() {
			verify.ExpectedValueIsTrue(uIMapRecords.dVEntry.uIOffenderLableRaceTextView.getText()
					.contains(PoliceData.getRecordsModuleValue("Race")));
		}

		public void SelectAllOffenderInformationFieldCheckBox() {
			uIMapRecords.dVEntry.uIHasADVOrderCheckBox.click();
			uIMapRecords.dVEntry.uIDoesThisIncidentInolvedCheckBox.click();
			uIMapRecords.dVEntry.uIAsAResultOfThisIncidentCheckBox.click();
		}

		public void SelectArrestedFor() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIArrestedForComboBox);
		}

		public void ClickOffenderCommitSucideCheckbox() {
			uIMapRecords.dVEntry.uIOffenderCommitSucideCheckBox.click();
		}

		public void SelectOffenseCompliant() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIOffenseComplaintComboBox);
		}

		public void SelectDegreeofInjury() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIDegreeInjuryComboBox);
		}

		public void ClickGunCheckBox() {
			uIMapRecords.dVEntry.uIGunCheckBox.click();
		}

		public void EnterRemarks() {
			Playback.controlReadyThreadWait();
			uIMapRecords.dVEntry.uIRemarksEdit.sendKeys("Automation");
		}

		public void EnterAdultFemale() {
			uIMapRecords.dVEntry.uIAdultFemaleEdit.sendKeys("3");
		}

		public void EnterJuvinalMale() {
			uIMapRecords.dVEntry.uIJuvinalMaleEdit.sendKeys("1");
		}

		public void VerifySexRequirdAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6539) Names Edit/Entry(2210) :Sex is Required. for Offender");
		}

		public void VerifyRaceRequirdAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6538) Names Edit/Entry(2210) :Race is Required. for Offender");
		}

		public void SaveScreen() {
			uIMapRecords.dVEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			uIMapRecords.dVEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();
		}

		public void CloseScreen() {
			uIMapRecords.dVEntry.driver.close();
		}

		public void ClickSave() {
			uIMapRecords.dVEntry.uISaveButton.click();
		}

		public void VerifyOffenderAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7244) Offender is mandatory");
		}

		public void VerifyAtVictimLastName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("VictimLastName"),
					uIMapRecords.dVEntry.uIVictimLastNameEdit.getAttribute("value"));

		}

		public void ClickNameInfoIcon() {
			uIMapRecords.domesticViolence.uINameInfoButton.click();
		}

		public void SelectAtOffender() {

			uIMapRecords.dVEntry.uIOffenderNameComboBox.sendKeys(PoliceData.getRecordsModuleValue("ArrestLastName")
					+ ", " + PoliceData.getRecordsModuleValue("ArrestFirstName"));

		}

		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapRecords.dVEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void SaveAndClose() {
			uIMapRecords.dVEntry.uISaveAndCloseButton.click();
			Playback.controlReadyThreadWait();
			// popup.confirm.yes();
			uIMapRecords.dVEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyOffenseInformationfieldsDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIOffenseComplaintComboBox.getAttribute("class").contains("SELECTInActive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIDegreeInjuryComboBox.getAttribute("class").contains("SELECTInActive"));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIGunCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.dVEntry.uIKnifeCheckBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIAdultMaleEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIJuvinalMaleEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIAdultFemaleEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void SelectOffenderName() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIOffenderNameComboBox);
			uIMapRecords.dVEntry.uIOffenderNameComboBox.sendKeys(Keys.TAB);

		}

		public void ClickPopupYes() {
			uIMapRecords.dVEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtAgeRange() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIOffenderLabelAgeTextView.getText().contains(PoliceData.getRecordsModuleValue("Age")));
		}

		public void verifyAtVictimFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("VictimFirstName"),
					uIMapRecords.dVEntry.uIVictimFirstNameEdit.getAttribute("value"));

		}

		public void enterTotalTimeSpentHoursAndMin() {
			uIMapRecords.dVEntry.uITotalTimeSpentHourEdit.sendKeys("12");
			uIMapRecords.dVEntry.uITotalTimeSpentMinEdit.sendKeys("30");

		}

		public void enterAdultMale() {
			uIMapRecords.dVEntry.uIAdultMaleEdit.sendKeys("2");
		}

		public void verifyAtDegreeOfInjury() {
			Select select = new Select(uIMapRecords.dVEntry.uIDegreeInjuryComboBox);
			String value = select.getFirstSelectedOption().getText();
			verify.ExpectedPropertyValueIsEqual(value, PoliceData.getRecordsModuleValue("DegreeOfInjury"));

		}

		public void verifyReportedDateTimeAutoPopulated(String date, String time) {
			verify.ExpectedPropertyValueIsEqual(date, uIMapRecords.dVEntry.uIReportedDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(time, uIMapRecords.dVEntry.uIReportedTimeEdit.getAttribute("title"));

		}

		public void verifyReportedDateTimeDisabled() {
			String attribute = uIMapRecords.dVEntry.uIReportedDateEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.dVEntry.uIReportedTimeEdit.getAttribute("style").contains("disabled"));

		}

		public void verifyCaseNoDisabled() {
			String attribute = uIMapRecords.dVEntry.uICaseNumberEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public void selectHouseHoldStatusAsPresentHouseholdMember() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIHouseHoldStatusComboBox, 1);
		}

		public void clickPrintIcon() {
			uIMapRecords.dVEntry.uIPrintButton.click();
		}
		public void verifyNoOfOffendersAvailableAs2() {
			
			int nos =	objectIdentification.manualIdentify.getDropDownOptionsCount(uIMapRecords.dVEntry.uIOffenderNameComboBox);
			verify.ExpectedValueIsTrue(nos==3);
			}

		public void selectDomesticViolenceRestrainingOrderOnlyAsYes() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox, "Yes");
			
		}
		public void clickRefreshButton() {
			uIMapRecords.dVEntry.uIRefreshButton.click();
		}

		public void verifyAtSelectedOffenderName() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapRecords.dVEntry.uIOffenderNameComboBox)
					.contains(PoliceData.getRecordsModuleValue("SelectedOffenderName")));

		}

		public void verifyCaseInfoiconIsDisplayed() {
			uIMapRecords.dVEntry.uICaseInfoIcon.isDisplayed();

		}
		public void selectDomesticViolenceRestrainingOrderOnlyAsNo() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.dVEntry.uIDomesticViolenceRestrainingComboBox, "No");

		}
	}

	public class DVSearch {
		public void ClickSearch() {
			uIMapRecords.dVSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReset() {
			uIMapRecords.dVSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBack() {
			uIMapRecords.dVSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtCaseNo() {
			uIMapRecords.dVSearch.uICaseYearEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.dVSearch.uICaseNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(3));
			uIMapRecords.dVSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtVictimLastName() {
			uIMapRecords.dVSearch.uIVictimLastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("VictimLastName"));
		}

		public void EnterAtVictimFirstName() {
			uIMapRecords.dVSearch.uIVictimFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("VictimFirstName"));
		}

		public void EnterAtOffenderLastName() {
			uIMapRecords.dVSearch.uIOffenderLastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("OffenderLastName"));
		}

		public void EnterAtOffenderFirstName() {
			uIMapRecords.dVSearch.uIOffenderFirstNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("OffenderFirstName"));
		}

		public void VerifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.dVSearch.uIDVSearchTable,
							"Case#", rowIndex));
		}

		public void VerifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable,
							PoliceData.getRecordsModuleValue("CaseNo"), "Case#").getText());
		}

		public void SelectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.dVSearch.uIDVSearchTable,
					PoliceData.getRecordsModuleValue("CaseNo"));
		}

		public void VerifyAtVictimName() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.dVSearch.uIDVSearchTable, PoliceData.getRecordsModuleValue("CaseNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("VictimName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable, row, "Victim Name").getText());
		}

		public void VerifyAtOffenderName() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapRecords.dVSearch.uIDVSearchTable, PoliceData.getRecordsModuleValue("CaseNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OffenderName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable, row, "OffenderName").getText());
		}

		public void EnterAtReportedDateFrom() {
			uIMapRecords.dVSearch.uIReportedDateFromEdit.sendKeys(PoliceData.getRecordsModuleValue("ReportedDateFrom"));
		}

		public void EnterReportedDateToAsCurrentDate() {
			uIMapRecords.dVSearch.uIReportedDateToEdit.sendKeys(Randomized.getFutureDate(1));
		}

		public void EnterAtOfficer() {
			uIMapRecords.dVSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
		}

		public void SelectAtVORelationship() {
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapRecords.dVSearch.uIVORelationshipCombobox, PoliceData.getRecordsModuleValue("VORelationship"));
		}

		public void SelectAtOffenseComplaint() {
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapRecords.dVSearch.uIVORelationshipCombobox,
					PoliceData.getRecordsModuleValue("OffenseComplaint"));
		}

		public void VerifyAtVictimNameAppearInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("VictimName"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable,
							PoliceData.getRecordsModuleValue("VictimName")).getText());
		}

		public void SelectRowByAtVictimName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.dVSearch.uIDVSearchTable,
					PoliceData.getRecordsModuleValue("VictimName"));
		}

		public void VerifyAtOffenderNameAppearInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OffenderName"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable,
							PoliceData.getRecordsModuleValue("OffenderName")).getText());
		}

		public void SelectRowByAtOffenderName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.dVSearch.uIDVSearchTable,
					PoliceData.getRecordsModuleValue("OffenderName"));
		}

		public void VerifyAtOffenseAppearInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Offense"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable,
							PoliceData.getRecordsModuleValue("Offense")).getText());
		}

		public void SelectRowByAtOffense() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.dVSearch.uIDVSearchTable,
					PoliceData.getRecordsModuleValue("Offense"));
		}

		public void ClickAlcoholInvolvedCheckbox() {
			uIMapRecords.dVSearch.uIAlcoholInvolvedCheckbox.click();
		}

		public void ClickOtherDrugsInvolvedCheckbox() {
			uIMapRecords.dVSearch.uIOtherDrigsInvolvedCheckbox.click();
		}

		public void ClickChildrenInvolvedCheckbox() {
			uIMapRecords.dVSearch.uIOtherDrigsInvolvedCheckbox.click();
		}

		public void ClickReportedDateResetButton() {
			uIMapRecords.dVSearch.uIReportedDateClearButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtRelationShipInGrid() {
			String RelationShip = objectIdentification.manualIdentify.getGridCell(uIMapRecords.dVSearch.uIDVSearchTable,
					PoliceData.getRecordsModuleValue("VORelationship")).getText();
			System.out.println(RelationShip);
			verify.ExpectedPropertyValueIsEqual(RelationShip, PoliceData.getRecordsModuleValue("VORelationship"));

		}


	}

	public class UOFSearchHelpWindow {
		public void VerifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2),
					uIMapRecords.uOFSearchHelpWindow.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(3),
					uIMapRecords.uOFSearchHelpWindow.uICaseNumberEdit.getAttribute("value"));
		}
		public void VerifyAtCaseNoUsingJsonReadFile(String testCaseId) {
            String caseYear = PoliceData.readJson(testCaseId, "caseYear");
               String caseNo = PoliceData.readJson(testCaseId, "caseNo");
               String CaseNo = caseYear+"-"+caseNo;
               String CaseYear = uIMapRecords.uOFSearchHelpWindow.uICaseYearEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseYear.contains(caseYear));

               String CaseNumber = uIMapRecords.uOFSearchHelpWindow.uICaseNumberEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseNumber.contains(caseNo));
       }
		public void VerifyAtSubjectName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("SubjectName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.uOFSearchHelpWindow.uIUseOfForceTabGridTable, "Subject Name", rowIndex));
		}

		public void CloseScreen() {
			uIMapRecords.uOFSearchHelpWindow.driver.close();
		}

		public void ClickAddNew() {
			uIMapRecords.uOFSearchHelpWindow.uIAddNewButton.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickAtSubjectNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFSearchHelpWindow.uIUseOfForceTabGridTable,
					PoliceData.getRecordsModuleValue("SubjectName"));
			Playback.popupThreadWait();
		}

		public void ClickReset() {
			uIMapRecords.uOFSearchHelpWindow.uIResetButton.click();
			Playback.pageLoadThreadWait();
		}

		public void clickAtOfficerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFSearchHelpWindow.uIUseOfForceTabGridTable,
					PoliceData.getRecordsModuleValue("Officer"));
			Playback.popupThreadWait();
		}

	}

	public class UOFEntry {
		public void VerifyRelatedCaseAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2),
					uIMapRecords.uOFEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(3),
					uIMapRecords.uOFEntry.uICaseNumberEdit.getAttribute("value"));
		}
		public void VerifyRelatedCaseNoUsingJsonReadFile(String testCaseId) {
            String caseYear = PoliceData.readJson(testCaseId, "caseYear");
               String caseNo = PoliceData.readJson(testCaseId, "caseNo");
               String CaseNo = caseYear+"-"+caseNo;
               String CaseYear = uIMapRecords.uOFEntry.uICaseYearEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseYear.contains(caseYear));

               String CaseNumber = uIMapRecords.uOFEntry.uICaseNumberEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseNumber.contains(caseNo));
       }
		public void VerifyAtOfficerPFNo() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OfficerPFNo"),
					uIMapRecords.uOFEntry.uIOfficerPFCodeEdit.getAttribute("value"));
		}

		public void EnterAtLastName() {
			uIMapRecords.uOFEntry.uISubjectLastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapRecords.uOFEntry.uISubjectFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
			uIMapRecords.uOFEntry.uISubjectFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void TabUOFDateAndTime() {
			uIMapRecords.uOFEntry.uIUOFDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.uOFEntry.uIUOFTimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickSave() {
			uIMapRecords.uOFEntry.uISaveButton.click();
		}
	public void ClickSavebutton() {
			uIMapRecords.uOFEntry.uISaveButton.click();
		}

		public void Save() {
			uIMapRecords.uOFEntry.uISaveButton.click();
			Playback.popupThreadWait();
			Playback.controlReadyThreadWait();
			uIMapRecords.uOFEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();

		}

		public void Close() {
			uIMapRecords.uOFEntry.driver.close();
		}

		public void VerifyRequiredEntriesTypeOfForceAcknowledgemessage() {
			popup.acknowledge
					.okWithExpectedMessage("(1018) Required Entries are Missing - Type of Force Used by the Officer");
		}
		public void verifyAt1018RequiredEntriesMissingAcknowledgeMessage()
        {
            popup.acknowledge
                    .okWithExpectedMessage("(1018)Required Entries are Missing - "+PoliceData.getRecordsModuleValue("CustomName"));
        }
		public void ClickTypeOfForceTab() {
			uIMapRecords.uOFEntry.uITypeofForceTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAllTabs() {
			uIMapRecords.uOFEntry.uIIncidentSubjectInformationTab.click();
			uIMapRecords.uOFEntry.uIOfficerInformationTab.click();
			uIMapRecords.uOFEntry.uITypeofForceTab.click();
			uIMapRecords.uOFEntry.uIAttachmentsTab.click();
			uIMapRecords.uOFEntry.uIDispositionTab.click();
			uIMapRecords.uOFEntry.uIInjuryReportTab.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveAndClose() {
			uIMapRecords.uOFEntry.uISaveAndCloseButton.click();
			Playback.controlReadyThreadWait();
			uIMapRecords.uOFEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtRelatedCaseNo() {
			uIMapRecords.uOFEntry.uICaseYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(0, 2));
			uIMapRecords.uOFEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(3));
			uIMapRecords.uOFEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSubjectLastName() {
			uIMapRecords.uOFEntry.uISubjectLastNameEdit.sendKeys(PoliceData.getRecordsModuleValue("SubjectLastName"));
		}

		public void EnterAtSubjectFirstName() {
			uIMapRecords.uOFEntry.uISubjectFirstNameEdit.sendKeys(PoliceData.getRecordsModuleValue("SubjectFirstName"));
			uIMapRecords.uOFEntry.uISubjectFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDateAutoPopulates() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapRecords.uOFEntry.uIUOFDateEdit.getAttribute("value"));
		}

		public void TabOfficerPF() {
			uIMapRecords.uOFEntry.uIOfficerPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtNameID() {
			uIMapRecords.uOFEntry.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void ClickIncidentSubjectInformationTab() {
			uIMapRecords.uOFEntry.uIIncidentSubjectInformationTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickOfficerInformationTab() {
			uIMapRecords.uOFEntry.uIOfficerInformationTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickDispositionTab() {
			uIMapRecords.uOFEntry.uIDispositionTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRelatedCaseInfoIcon() {
			uIMapRecords.uOFEntry.uIRelatedCaseNumberInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickApprovalTab() {
			uIMapRecords.uOFEntry.uIApprovalTab.click();
		}

		public void ClickInjuryReportTab() {
			uIMapRecords.uOFEntry.uIInjuryReportTab.click();
			Playback.controlReadyThreadWait();
		}

		public void SwitchToInjuryReportTab() {
			uIMapRecords.uOFEntry.uIInjuryReportTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmBodyParts");
			Playback.pageLoadThreadWait();
		}

		public void VerifyMenuButtonsDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.uOFEntry.uISaveButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.uOFEntry.uISaveAndCloseButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.uOFEntry.uIDeleteIcon.getAttribute("disabled")));
		}

		public void VerifyMenuButtonsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.uOFEntry.uISaveButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.uOFEntry.uISaveAndCloseButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.uOFEntry.uIDeleteIcon.isEnabled());
		}

		public void VerifyUOFNoFieldInactive() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.uIUOFNumberEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.uIUOFYearEdit.getAttribute("class").contains("textboxInactive"));
		}
		public void VerifyUOFNoGenerated() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.uIUOFYearEdit.getAttribute("value").contains("2"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.uIUOFNumberEdit.getAttribute("value").contains("00"));
		}

		public void clickPrint() {
			uIMapRecords.uOFEntry.uIPrintButton.click();
			Playback.gridLoadThreadWait();
		}

		public void EnterAtHNameID() {
			uIMapRecords.uOFEntry.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("HNameID").substring(0, 1));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("HNameID").substring(2));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void VerifyInvalidNameAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(6020) Invalid Name ID");
		}

		public void EnterAtNameID1() {
			uIMapRecords.uOFEntry.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(0, 1));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(2));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void VerifyRelatedCaseCaseNo(String caseYear, String caseNo) {
			verify.ExpectedPropertyValueIsEqual(caseYear, uIMapRecords.uOFEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseNo, uIMapRecords.uOFEntry.uICaseNumberEdit.getAttribute("value"));
		}

		public void clickSubjectNameInfoIcon() {
			uIMapRecords.uOFEntry.uISubjectNameInfoIcon.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtOfficer() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Officer"),
					uIMapRecords.uOFEntry.uIOfficerdescriptionEdit.getAttribute("value"));
		}

		public void ClickReset() {
			uIMapRecords.uOFEntry.uIResetButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifySubjectNameIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.uOFEntry.uISubjectLastNameEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.uOFEntry.uISubjectFirstNameEdit.isEnabled());
		}

		public void verifyAttachmentsTabIsDisplayed() {
			uIMapRecords.uOFEntry.uIAttachmentsTab.isDisplayed();
			Playback.controlReadyThreadWait();
		}

		public void verifyDispositionTabIsDisplayed() {
			uIMapRecords.uOFEntry.uIDispositionTab.isDisplayed();
			Playback.controlReadyThreadWait();
		}

		public void verifyInjuryReportTabIsDisplayed() {
			uIMapRecords.uOFEntry.uIInjuryReportTab.isDisplayed();
			Playback.controlReadyThreadWait();
		}

		public void verifyApprovalTabIsDisplayed() {
			uIMapRecords.uOFEntry.uIApprovalTab.isDisplayed();
			Playback.controlReadyThreadWait();
		}

		public void VerifySuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
		}

		public void clickPrintIcon() {
			uIMapRecords.uOFEntry.uIPrintButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtSubjectsNameID() {
			uIMapRecords.uOFEntry.uINameTypeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("SubjectsNameID").substring(0, 1));
			uIMapRecords.uOFEntry.uINameTypeIDEdit
					.sendKeys(PoliceData.getRecordsModuleValue("SubjectsNameID").substring(2));
			uIMapRecords.uOFEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtName() {
			Playback.controlReadyThreadWait();
			String lastname = uIMapRecords.uOFEntry.uISubjectLastNameEdit.getAttribute("value");
			String firstname = uIMapRecords.uOFEntry.uISubjectFirstNameEdit.getAttribute("value");
			String Name = lastname + ", " + firstname;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Name"), Name);
		}

		public void switchToApprovalTab() {
			uIMapRecords.uOFEntry.uIApprovalTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

		public void verifyStatusOfReportAsSubmitted() {
			String label = uIMapRecords.uOFEntry.uIStatusLabel.getText();
			verify.ExpectedPropertyValueIsEqual(label, "Submitted");

		}

		public void verifyStatusOfReportAsApproved() {
			String label = uIMapRecords.uOFEntry.uIStatusLabel.getText();
			verify.ExpectedPropertyValueIsEqual(label, "Approved");
		}
		public void VerifyRelatedCaseCaseNo(String readCaseNo) {
			verify.ExpectedValueIsTrue(readCaseNo.contains(uIMapRecords.uOFEntry.uICaseYearEdit.getAttribute("value")));
			verify.ExpectedValueIsTrue(readCaseNo.contains(uIMapRecords.uOFEntry.uICaseNumberEdit.getAttribute("value")));
		}
		public UOFEntry() {
			if ((this.incidentSubjectInformationTab == null)) {
				this.incidentSubjectInformationTab = new IncidentSubjectInformationTab();
			}

			if ((this.typeOfForceTab == null)) {
				this.typeOfForceTab = new TypeOfForceTab();
			}

			if ((this.injuryReportTab == null)) {
				this.injuryReportTab = new InjuryReportTab();
			}

			if ((this.officerInformationTab == null)) {
				this.officerInformationTab = new OfficerInformationTab();
			}

			if ((this.uOFDispositionTab == null)) {
				this.uOFDispositionTab = new UOFDispositionTab();
			}

			if ((this.approvalTab == null)) {
				this.approvalTab = new ApprovalTab();
			}

		}

		public IncidentSubjectInformationTab incidentSubjectInformationTab = null;
		public TypeOfForceTab typeOfForceTab = null;
		public OfficerInformationTab officerInformationTab = null;
		public UOFDispositionTab uOFDispositionTab = null;
		public InjuryReportTab injuryReportTab = null;
		public ApprovalTab approvalTab = null;
		
		
		public void verifyAtCaseNo() {
            Playback.controlReadyThreadWait();
            String CaseYear = uIMapRecords.uOFEntry.uICaseYearEdit.getAttribute("value");
            String CaseNo = uIMapRecords.uOFEntry.uICaseNumberEdit.getAttribute("value");
            String Case = CaseYear+"-"+CaseNo;
            verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"), Case);
        }

		public void verifyAcknowldgeMessage1051() {
           
            popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Approval Tab. You must save or reset.");
		}

		public void verifyUpdateSuccessfulStatusMsg() {
            verify.ExpectedValueIsTrue(
                    uIMapRecords.uOFEntry.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
        }
		public void verifyAdditionSuccessfulStatusMsg() {
            verify.ExpectedValueIsTrue(
                    uIMapRecords.uOFEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
        }
		public String readUOFCaseNo() {
			
			String CaseYear = uIMapRecords.uOFEntry.uIUOFYearEdit.getAttribute("value");
			String CaseNumber = uIMapRecords.uOFEntry.uIUOFNumberEdit.getAttribute("value");
			String UofcaseNumber =  CaseYear +"-"+ CaseNumber;
			System.out.println(UofcaseNumber);
			return UofcaseNumber;
			
		
		
	}
	public String ReadOfficerPf() {
		String Description = uIMapRecords.uOFEntry.uIOfficerdescriptionEdit.getAttribute("value");
		System.out.println(Description);
		return Description;
		
	}
	public void verifyAtStatusUOFEntry(int SNo) {
	
			if(SNo==0) {
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.approvalTab.uIApprovalStatusLabel.getText(), PoliceData.getRecordsModuleValue("Status"));
			}
			else {
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.approvalTab.uIApprovalStatusLabel.getText(), PoliceData.getRecordsModuleValue("Status"+SNo));
				
			}	
	}
        
	}

	public class TypeOfForceTab {
		public void EnterForceSeqNo() {
			uIMapRecords.uOFEntry.typeOfForceTab.uIForceSeqNoEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void SelectListTheTypesOfForceUsedByOfficer() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox);
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void EnterNotes() {
			uIMapRecords.uOFEntry.typeOfForceTab.uINotesEdit.sendKeys(Randomized.randomString(100));
		}

		public void ClickDisplayOnlyCheckBox() {
			uIMapRecords.uOFEntry.typeOfForceTab.uIDisplayOnlyCheckBox.click();
		}

		public void SelectEffectiveness() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox);
			uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapRecords.uOFEntry.typeOfForceTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtTypesOfForceUsedByOfficer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox,
					PoliceData.getRecordsModuleValue("TypeofForce"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void DeleteAtTypeOfForce() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable,
					PoliceData.getRecordsModuleValue("TypeofForce"));
			popup.confirm.yes();
		}

		public void VerifyAtTypeOfForce(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("TypeofForce"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable, "Type of Force", rowCount));
		}

		public void selectAtListTheTypesOfForceUsedByOfficer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox,
					PoliceData.getRecordsModuleValue("TypesOfForceUsedByOfficer"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtEffectiveness() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox,
					PoliceData.getRecordsModuleValue("Effectiveness"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtTypesOfForce1UsedByOfficer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox,
					PoliceData.getRecordsModuleValue("TypeofForce1"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void clickAtGridrowByTypeOfForce() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable,
					PoliceData.getRecordsModuleValue("TypeofForce"));

		}

		public void EnterAtNotes() {
			uIMapRecords.uOFEntry.typeOfForceTab.uINotesEdit.sendKeys(PoliceData.getRecordsModuleValue("Notes"));
		}

		public void EnterAtForceSeqNo() {
			uIMapRecords.uOFEntry.typeOfForceTab.uIForceSeqNoEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ForceSeqNo"));
		}

		public void SelectAtTypesOfForce2UsedByOfficer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox,
					PoliceData.getRecordsModuleValue("TypeofForce2"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtTypesOfForce3UsedByOfficer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox,
					PoliceData.getRecordsModuleValue("TypeofForce3"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIListtheTypeofForceUsedOfficerComboBox.sendKeys(Keys.TAB);
		}

		public void ClickUpdateButton() {
			uIMapRecords.uOFEntry.typeOfForceTab.uIUpdateButton.click();

		}

		public void verifyAtEffectiveness(int Row) {

			String Effectiveness = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable, "Effectiveness", Row)
					.getText();
			verify.ExpectedPropertyValueIsEqual(Effectiveness, PoliceData.getRecordsModuleValue("Effectiveness"));

		}

		public void verifyAtEffectiveness1(int Row) {

			String Effectiveness = objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable, "Effectiveness", Row)
					.getText();
			verify.ExpectedPropertyValueIsEqual(Effectiveness, PoliceData.getRecordsModuleValue("Effectiveness1"));

		}

		public void selectAtEffectiveness1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox,
					PoliceData.getRecordsModuleValue("Effectiveness1"));
			uIMapRecords.uOFEntry.typeOfForceTab.uIEffectivenessComboBox.sendKeys(Keys.TAB);
		}
		public void VerifyAtTypeOfForce1(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("TypeofForce1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.uOFEntry.typeOfForceTab.uITypeOfForceTabGridTable, "Type of Force", rowCount));
		}

	}

	public class IncidentSubjectInformationTab {
		public void SelectCharge() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIChargeCodeLookupIcon.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectWasASupervisorPresentAsYes() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSupervisorPresentComboBox, "Yes");
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSupervisorPresentComboBox.sendKeys(Keys.TAB);
		}

		public void SelectSupervisorPF() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uISupervisorPFLookupIcon.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterTotalNoOfOfficersUsedForce() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceEdit
					.sendKeys(Randomized.randomNumberString(2));
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceEdit.sendKeys(Keys.TAB);
		}

		public void EnterTotalNoOfOfficersUsedForceFromYourAgency() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyEdit
					.sendKeys(Randomized.randomNumberString(2));
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyEdit
					.sendKeys(Keys.TAB);
		}

		public void ClearTotalNoOfOfficersUsedForce() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceEdit.click();
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceEdit.clear();
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceEdit.sendKeys(Keys.TAB);
		}

		public void ClearTotalNoOfOfficersUsedForceFromYourAgency() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyEdit.click();
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyEdit.clear();
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyEdit
					.sendKeys(Keys.TAB);
		}

		public void VerifyTotalNoOfOfficersUsedForceComboBoxEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceComboBox
							.getAttribute("class").contains("textbox"));
		}

		public void VerifyTotalNoOfOfficersUsedForceFromYourAgencyComboBoxEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyComboBox
							.getAttribute("class").contains("textbox"),
					"Verify Total No Of Officers Used Force From Your Agency");
		}

		public void VerifyTotalNoOfOfficersUsedForceComboBoxDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceComboBox
							.getAttribute("class").contains("InActive"),
					"verify Total No Of Officers Used Force ComboBox Disabled");
		}

		public void VerifyTotalNoOfOfficersUsedForceFromYourAgencyComboBoxDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uITotalNoOfOfficersUsedForceFromYourAgencyComboBox
							.getAttribute("class").contains("InActive"),
					"verify Total No Of Officers Used Force From Your Agency ComboBox Disabled");
		}

		public void SelectListKnownMentalPhysicalConditionsAsYes() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIListKnownMentalPhysicalConditionComboBox,
					"Yes");
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIListKnownMentalPhysicalConditionComboBox
					.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectWasSubjectArmedWithWeaponAsYes() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSubjectArmedWithWeaponComboBox, "Yes");
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSubjectArmedWithWeaponComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterSubjectActionsText() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uISubjectActionsEdit
					.sendKeys(Randomized.randomString(50));
		}

		public void SelectConditions() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIConditionsInputComboBox.click();
			objectIdentification.randomIdentify.selectRadControlDropDownCheckBoxes(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIConditionsComboBox);
		}

		public void SelectWeapons() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWeaponsInputComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWeaponsComboBox, "None");
		}

		public void SelectListTheSubjectActionsAsOthers() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIListSubjectActionInputComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIListSubjectActionComboBox, "Other(Specify)");
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIListSubjectActionInputComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifySubjectActionsEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uISubjectActionsEdit.isEnabled());
		}

		public void selectLocationType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.incidentSubjectInformationTab.uILocationTypeComboBox);
		}

		public void selectReasonInitialContact() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIReasonInitialContactComboBox);
		}

		public void enterAtCharge() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIChargeCodeEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Charge"));

		}

		public void selectPatrolArea() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIPatrolAreaComboBox);
			Playback.controlReadyThreadWait();

		}

		public void selectAtWasSubjectUnderTheInfluence() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSubjectUnderInfluenceComboBox,
					PoliceData.getRecordsModuleValue("WasSubjectUnderInfluence"));
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIWasSubjectUnderInfluenceComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyMedicalAssistanceRequiredAsCustomField() {
			String attribute = uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredLabel
					.getAttribute("style");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("underline"));
		}

		public void clickMedicalAssistanceRequiredLabel() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredLabel.click();
		}
		public void selectMedicalAssistanceRequired() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredDropDown);
		}
		public void selectMedicalAssistanceRequiredAsNo() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredDropDown,"No");
		}
		public void verifyMedicalAssistanceRequiredLabelAsMandatory() {
			String attribute = uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredLabel
					.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("rgb(153, 0, 0)"));

		}

		public void verifyMedicalAssistanceRequiredIsDisabled() {
			String attribute = uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredDropDown
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public void SelectAtConditions() {
            uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIConditionsInputComboBox.click();
            objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
                    uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIConditionsComboBox,
                    PoliceData.getRecordsModuleValue("Conditions"));

        }

		public void selectAtLocationType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uILocationTypeComboBox,
					PoliceData.getRecordsModuleValue("LocationType"));

		}

		public void selectAtReasonInitialContact() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIReasonInitialContactComboBox,
					PoliceData.getRecordsModuleValue("reasonInitialContact"));

		}

		public void verifyAtSelectedreasonforInitialContact() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getDropDwonSelectedItem(
							uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIReasonInitialContactComboBox),
					PoliceData.getRecordsModuleValue("reasonInitialContact"));
			                                          
		}

		public void SelectAtMedicalAssitanceRequired() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredDropDown,
					PoliceData.getRecordsModuleValue("MedicalAssitanceRequired"));

		}

		public void verifyAtSelectedmedicalAssitancerequired() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getDropDwonSelectedItem(
							uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIMedicalAssistanceRequiredDropDown),
					PoliceData.getRecordsModuleValue("MedicalAssitanceRequired"));

		}

		public void verifyAtSelectedPatrolArea() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getDropDwonSelectedItem(
							uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIPatrolAreaComboBox),
					PoliceData.getRecordsModuleValue("PatrolArea"));

		}

		public void SelectAtCharge() {
			uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIChargeCodeLookupIcon.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.clickAtChargeInGrid();
		}

		public void verifyAtCharge() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIChargeCodeEdit.getAttribute("value"),
					PoliceData.getRecordsModuleValue("Charge"));

		}

		public void SelectAtPatrolArea() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.uOFEntry.incidentSubjectInformationTab.uIPatrolAreaComboBox,PoliceData.getRecordsModuleValue("PatrolArea"));
			Playback.controlReadyThreadWait();
			
		}

		public void verifyAtSelectedLocationType() {

			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getDropDwonSelectedItem(
							uIMapRecords.uOFEntry.incidentSubjectInformationTab.uILocationTypeComboBox),
					PoliceData.getRecordsModuleValue("LocationType"));

		}

	}

	public class OfficerInformationTab {
		public void SelectOfficerFullTimeEmployee() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.officerInformationTab.uIOfficerFullTimeEmployeeComboBox);
		}

		public void SelectWasOfficerOnDuty() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.officerInformationTab.uIWasOfficerOnDutyComboBox);
		}

		public void SelectWasOfficerInjured() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.officerInformationTab.uIWasOfficerInjuredComboBox);
		}

		public void SelectListOfficersInjuries() {
			uIMapRecords.uOFEntry.officerInformationTab.uIOfficersInjuriesInputComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapRecords.uOFEntry.officerInformationTab.uIOfficersInjuriesComboBox, "None");
		}

		
	}

	public class UOFDispositionTab {
		public void EnterAtDispositionPFNo() {
			uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionPFNoEdit
					.sendKeys(PoliceData.getRecordsModuleValue("DispositionbyPFNo"));
			uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionPFNoEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtDisposition() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionComboBox,
					PoliceData.getRecordsModuleValue("Disposition"));
		}

		public void EnterNotesRichText() {
			// uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit.click();
			// uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit.sendKeys(Keys.Space);
			// uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit.sendKeys(Randomized.RandomString(250));
			Actions Rich = new Actions(Playback.driver);
			Rich.moveToElement(uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit).click();
			Rich.sendKeys(Randomized.randomString(1000)).build().perform();

		}

		public void switchToRicTextEdit() {
			objectIdentification.windowHandle.switchToFrameUsingID("tabUOF_tmpl4_ctrlusrDisposition_rteKPITxt_contentIframe");
			
		}

		public void verifyAtRichTextEdit() {
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit1.getText(), "AUTOMATIONTEST");
			
			
		}

		public void taboutDateAndTime() {
			uIMapRecords.uOFEntry.uOFDispositionTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.uOFEntry.uOFDispositionTab.uITimeEdit.sendKeys(Keys.TAB);
			
		}

		public void verifyAtDispositionPf() {
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionPFNoEdit.getAttribute("value"), 
					PoliceData.getRecordsModuleValue("DispositionbyPFNo"));
		
		}
		public void VerifyAtPFDescription() {
			verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionPFDescription.getAttribute("value"), 
					PoliceData.getRecordsModuleValue("DispositionbyPFDescription"));
			
		}

		public void verifyAtSelectedSisposition() {
			
			String Disposition = objectIdentification.manualIdentify.getDropDwonSelectedItem(uIMapRecords.uOFEntry.uOFDispositionTab.uIDispositionComboBox);
			verify.ExpectedPropertyValueIsEqual(Disposition, PoliceData.getRecordsModuleValue("Disposition"));
			
		}

		public void enterRichTextEdit1() {
			uIMapRecords.uOFEntry.uOFDispositionTab.uINotesRichTextEdit1.sendKeys("AUTOMATIONTEST");
		}

	}

	public class InjuryReportTab {
		public void clickFrontUpperLeftChestPart() {
			uIMapRecords.uOFEntry.injuryReportTab.uIInjuredFrontUpperLeftChest.click();
			Playback.controlReadyThreadWait();
		}

		public void SwitchToInjuredPartsPanel() {
			uIMapRecords.uOFEntry.injuryReportTab.uIInjuredPartPanel.click();
		}

		public void EnterInjuredPartDescription() {
			uIMapRecords.uOFEntry.injuryReportTab.uIInjuredPartPanel.click();
			uIMapRecords.uOFEntry.injuryReportTab.uIInjuredPartPanel.sendKeys(Randomized.randomString(10));
		}

		public void clickSave() {
			uIMapRecords.uOFEntry.injuryReportTab.uISave.click();

			Playback.controlReadyThreadWait();
		}

		public void clickSubjectRadioButton() {
			uIMapRecords.uOFEntry.injuryReportTab.uISubjectRadioButton.click();

		}

		public void clickRearRightShoulder() {
			uIMapRecords.uOFEntry.injuryReportTab.uIInjuredRearRightShoulder.click();
			Playback.controlReadyThreadWait();
		}

		public void clickOfficerRadioButton() {
			uIMapRecords.uOFEntry.injuryReportTab.uIOfficerRadioButton.click();

		}

		public void verifyAtFrontUpperLeftChestPartChangedAsRed() {
			
			 String Class = uIMapRecords.uOFEntry.injuryReportTab.uIInjuredFrontUpperLeftChest.getAttribute("class");
			 System.out.println(Class);
			verify.ExpectedPropertyValueIsEqual(Class, "active");
				
			}
			
			public void verifyAtFRearRightShoulderPartChangedAsRed() {
				
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.injuryReportTab.uIInjuredRearRightShoulder.getAttribute("class"), "active");
						
			}

			public void verifySubjectLabelAsgreen() {
				System.out.println(uIMapRecords.uOFEntry.injuryReportTab.uISubjectLabel.getCssValue("color"));
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.injuryReportTab.uISubjectLabel.getCssValue("color"), "rgba(0, 100, 0, 1)");
							
			}
			public void verifyofficertLabelAsgreen() {
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.injuryReportTab.uIOfficerLabel.getCssValue("color"), "rgba(0, 100, 0, 1)");
		
			}
	}

	public class ApprovalTab {

		public void selectNewActionAsSendForApproval() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.approvalTab.uINewActionDropdown, "Send for Approval");
		}

		public void tabDateAndTime() {
			uIMapRecords.uOFEntry.approvalTab.uIDateEdit.sendKeys(Keys.TAB);

		}

		public void saveInApprovalTab() {
			uIMapRecords.uOFEntry.approvalTab.uISaveApprovalTab.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			} else {
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.yes();

			}
		}

		public void selectNewActionAsApprove() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.uOFEntry.approvalTab.uINewActionDropdown, "Approve");
		}

		public void verifyStatusInGrid(int Sno) {
			
			if(Sno==0) {
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.approvalTab.uIStatusInGrid.getText(),  PoliceData.getRecordsModuleValue("Status"));
			}
			else{
				verify.ExpectedPropertyValueIsEqual(uIMapRecords.uOFEntry.approvalTab.uIStatusInGrid.getText(),  PoliceData.getRecordsModuleValue("Status"+Sno));
			}
			
		}
		public void verifAtRejectionCountAs1() {
		String Count =  uIMapRecords.uOFEntry.approvalTab.uIRejectionCount.getText();
		int rejctcount = Integer.parseInt(Count);
			verify.ExpectedIntergerValueIsEqualToActual(rejctcount,1);
			
		}

		public void selectActionAsReject() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.uOFEntry.approvalTab.uINewActionDropdown, "Reject");
			
		}
		public void selectAtRejectionCode() {
			//uIMapRecords.uOFEntry.approvalTab.uIRejectionCodeDropDown.click();
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.uOFEntry.approvalTab.uIRejectionCodeDropDown,PoliceData.getRecordsModuleValue("RejectionCode"));
			
		}

	}

	public class UOFSearch {
		public void ClickAddNew() {
			uIMapRecords.uOFSearch.uIAddNewButton.click();
		}

		public void ClickSearch() {
			uIMapRecords.uOFSearch.uISearchButton.click();
		}

		public void EnterAtCaseNo() {
			uIMapRecords.uOFSearch.uICaseYearEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2));
			uIMapRecords.uOFSearch.uICaseNumberEdit.sendKeys(PoliceData.getRecordsModuleValue("CaseNo").substring(2));

		}

		public void SelectRowByAtUOFNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFSearch.uIUseOfForceSearchGridTable, PoliceData.getRecordsModuleValue("UOFNo"));
		}

		public void EnterAtNameID() {
			uIMapRecords.uOFSearch.uINameTypeEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
			uIMapRecords.uOFSearch.uINameIDEdit.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
			uIMapRecords.uOFSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void ClickReset() {
			uIMapRecords.uOFSearch.uIResetButton.click();
		}

		public void ClickDateReset() {
			uIMapRecords.uOFSearch.uIDateResetIcon.click();
		}

		public void ClickAtSubjectNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFSearch.uIUseOfForceSearchGridTable,
					PoliceData.getRecordsModuleValue("SubjectName"));
			Playback.controlReadyThreadWait();
		}

		public void ClickAtOfficerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.uOFSearch.uIUseOfForceSearchGridTable, PoliceData.getRecordsModuleValue("Officer"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtTypeOfForceUsed() {
			uIMapRecords.uOFSearch.uITypeOfForceRadInput.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValue(uIMapRecords.uOFSearch.uITypeOfForceRadDropDown, 
					PoliceData.getRecordsModuleValue("TypeOfForce"));
			
			
		}
		public void selectAtEffectiveness() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.uOFSearch.uIEffectivenessComboBox, 
					PoliceData.getRecordsModuleValue("Effectiveness"));
			
		}
		public void selectAtRowByCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.uOFSearch.uIUseOfForceSearchGridTable, 
					PoliceData.getRecordsModuleValue("CaseNO"));
		}


	}

	public class UCR {

		public void VerifySubmissionPeriodDateAsLastMonthFirstDay() {
			// verify.ExpectedPropertyValueIsEqual(Randomized.getPreviousDateByMonth(1).Remove(3,
			// 1).Insert(3, "0").Remove(4, 1).Insert(4, "1"),
			// uIMapRecords.uCR.uISubmissionPeriodEdit.getAttribute("value"));
		}

		public void VerifyAtPreparedBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("PreparedBy"),
					uIMapRecords.uCR.uIPreparedByEdit.getAttribute("value"));
		}

		public void EnterTitleAsUCRReport() {
			uIMapRecords.uCR.uITitleEdit.sendKeys("UCR Report");
		}

		public void VerifyAtHeadOfTheDepartment() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("HeadOfTheDepartment"),
					uIMapRecords.uCR.uIHeadoFTheDepartmentEdit.getAttribute("value"));
		}

		public void ClickAdultArrestReportCheckbox() {
			uIMapRecords.uCR.uIAdultArrestReportCheckbox.click();
		}

		public void ClickPropertyStolenReportCheckbox() {
			uIMapRecords.uCR.uIPropertyStolenReportCheckbox.click();
		}

		public void ClickArsonReportCheckbox() {
			uIMapRecords.uCR.uIArsonReportCheckbox.click();
		}

		public void ClickGenerateReportButton() {
			uIMapRecords.uCR.uIGenerateReportButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.waitForPageLoad();
			Playback.waitForPageLoad();
		}

		public void Verify14DoYouWantToPrintTheReportAckMsg() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(14) Do you want to print the report?");
			} else
				popup.confirm.yesWithExpectedMessage("(14) Do you want to print the report?");
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickViewLogFileButton() {
			uIMapRecords.uCR.uIViewLogFileButton.click();
		}

		public void SwitchToViewLogReport() {
			objectIdentification.windowHandle.switchToWindowUsingURL("UCRLog");
		}

		public void ClickAllReportCheckbox() {
			uIMapRecords.uCR.uIAllReportCheckbox.click();
		}

		public void verifyAllReportCheckboxChecked() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapRecords.uCR.uIAllReportCheckbox.getAttribute("checked")));
		}

		public void ClickLeokaReportCheckbox() {
			uIMapRecords.uCR.uILeokaReportCheckbox.click();
		}

		public void ClickReturnAOffenseReportCheckbox() {
			uIMapRecords.uCR.uIReturnAOffenseReportCheckbox.click();
		}

		public void CloseScreen() {
			uIMapRecords.uCR.driver.close();
		}

		public void ClickResetButton() {
			uIMapRecords.uCR.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterSubmissionPeriod() {
			uIMapRecords.uCR.uISubmissionPeriodEdit.clear();
			uIMapRecords.uCR.uISubmissionPeriodEdit.sendKeys("04/01/2019");
			Playback.controlReadyThreadWait();
		}

		public void EnterSubmissionPeriodToAsCurrentDate() {
			uIMapRecords.uCR.uIToEdit.clear();
			uIMapRecords.uCR.uIToEdit.sendKeys(Randomized.getCurrentDate());
			Playback.controlReadyThreadWait();
		}

		public void enterSubmissionPeriodAsCurrentDate() {
			uIMapRecords.uCR.uISubmissionPeriodEdit.click();
			uIMapRecords.uCR.uISubmissionPeriodEdit.clear();
			uIMapRecords.uCR.uISubmissionPeriodEdit.sendKeys(Randomized.getCurrentDate());
			Playback.controlReadyThreadWait();
		}

		public void EnterSubmissionPeriodToAsFutureDate() {
			uIMapRecords.uCR.uIToEdit.click();
			uIMapRecords.uCR.uIToEdit.clear();
			uIMapRecords.uCR.uIToEdit.sendKeys(Randomized.getFutureDate(10));
			Playback.controlReadyThreadWait();
		}

		public void ClickJuviniletArrestReportCheckbox() {
			uIMapRecords.uCR.uIJuvenileArrestReportCheckbox.click();
		}

		public void ClickSupplementalToReturnAReportCheckbox() {
			uIMapRecords.uCR.uISupplementalToReturnAReportCheckbox.click();
		}

		public void VerifycurrenDateInLog() {
			uIMapRecords.uCR.uILogWindowBody.getText().contains(Randomized.getCurrentDate());
		}
	}

	public class CaseSuspect {
		public void ClickAddSuspectButton() {
			uIMapRecords.caseSuspect.uIAddSuspectButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRefreshButton() {
			uIMapRecords.caseSuspect.uIRefreshButton.click();
		}

		public void VerifyNameExistInGrid(int rowCount) {
			verify.ExpectedIntergerValueIsEqualToActual(rowCount,
					objectIdentification.manualIdentify.getGridTableRowsCount(uIMapRecords.caseSuspect.uISuspectTable));
		}

		public void CloseScreen() {
			uIMapRecords.caseSuspect.driver.close();
		}

		public void DeleteSuspect3InGrid() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapRecords.caseSuspect.uISuspectTable, PoliceData.getRecordsModuleValue("Suspect3"));
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void DeleteSuspect2InGrid() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapRecords.caseSuspect.uISuspectTable, PoliceData.getRecordsModuleValue("Suspect2"));
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}
		public void verifyAddSuspectButtonDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.caseSuspect.uIAddSuspectButton.isEnabled());
			Playback.controlReadyThreadWait();
		}
		public void verifyAddSuspectButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseSuspect.uIAddSuspectButton.isEnabled());
			Playback.controlReadyThreadWait();
		}
	}

	public class ALCScreen {

		public void ClickPFTab() {
			uIMapRecords.aLCScreen.uIPFTab.click();
		}

		public void Save() {
			uIMapRecords.aLCScreen.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapRecords.aLCScreen.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public ALCScreen() {
			if ((this.aLCScreenPFTab == null)) {
				this.aLCScreenPFTab = new ALCScreenPFTab();
			}
		}

		public ALCScreenPFTab aLCScreenPFTab = null;

		public void close() {
			Playback.driver.close();
			
		}

	}

	public class ALCScreenPFTab {

		public void SelectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.aLCScreen.aLCScreenPFTab.uIActionComboBox, PoliceData.getRecordsModuleValue("Action"));
		}

		public void EnterAtPFCode() {
			uIMapRecords.aLCScreen.aLCScreenPFTab.uIPFCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("PFCode"));
			uIMapRecords.aLCScreen.aLCScreenPFTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapRecords.aLCScreen.aLCScreenPFTab.uIAddButton.click();
		}

	}

	public class OpenRecordsRequest {

		public void clickAddNewButton() {
			uIMapRecords.openRecordsRequest.uIAddNewButton.click();
		}

		public void clickSearchButton() {
			uIMapRecords.openRecordsRequest.uISearchButton.click();
		}

		public void enterAtRelatedCaseNo() {
			uIMapRecords.openRecordsRequest.uIRelatedCaseNoYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(0, 2));
			uIMapRecords.openRecordsRequest.uIRelatedCaseNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(3));
		}

		public void selectRowByAtRequestedBy() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable,
					PoliceData.getRecordsModuleValue("RequestedBy"));
		}

		public void enterAtPhoneNo() {
			uIMapRecords.openRecordsRequest.uIPhoneNoEdit.sendKeys(PoliceData.getRecordsModuleValue("PhoneNo"));
		}

		public void verifyCallNoIsDisplayed() {

			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequest.uICallYearEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequest.uICallNoEdit.isDisplayed());

		}

		public void verifyAssignedToIsDisplayed() {

			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequest.uIAssignedToEdit.isDisplayed());
		}

		public void verifyClosedDateIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequest.uIClosedDateEdit.isDisplayed());
		}

		public void enterAtCallNo() {
			uIMapRecords.openRecordsRequest.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.openRecordsRequest.uICallNoEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
			uIMapRecords.openRecordsRequest.uICallNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtAssignedTo() {
			uIMapRecords.openRecordRequestEntry.uIAssignedToEdit
					.sendKeys(PoliceData.getRecordsModuleValue("AssignedTo"));
		}

		public void clickAssignedToLookUPIcon() {
			uIMapRecords.openRecordsRequest.uIAssignedToLookupIcon.click();
		}

		public void verifyAtCallNoInRecordsRequestTable() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable, "Call/Case#");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(PoliceData.getRecordsModuleValue("CallNo")));
		}

		public void clickBackButton() {
			uIMapRecords.reportSearch.uIBackButton.click();
		}

		public void clearCallNo() {
			uIMapRecords.openRecordsRequest.uICallYearEdit.click();
			uIMapRecords.openRecordsRequest.uICallYearEdit.clear();
			uIMapRecords.openRecordsRequest.uICallNoEdit.click();
			uIMapRecords.openRecordsRequest.uICallNoEdit.clear();
			Playback.controlReadyThreadWait();
		}

		public void clearAssignedTo() {
			uIMapRecords.openRecordRequestEntry.uIAssignedToEdit.click();
			uIMapRecords.openRecordRequestEntry.uIAssignedToEdit.clear();
			uIMapRecords.openRecordRequestEntry.uIAssignedToEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void verifyAtAssignedToInRecordsRequestTable() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable, "Assigned To");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(PoliceData.getRecordsModuleValue("AssignedTo")));
		}

		public void clearCaseNo() {
			uIMapRecords.openRecordsRequest.uICaseYearEdit.click();
			uIMapRecords.openRecordsRequest.uICaseYearEdit.clear();
			uIMapRecords.openRecordsRequest.uICaseNoEdit.click();
			uIMapRecords.openRecordsRequest.uICaseNoEdit.clear();
			Playback.controlReadyThreadWait();

		}

		public void enterAtClosedDate() {
			uIMapRecords.openRecordsRequest.uIClosedDateEdit.click();
			uIMapRecords.openRecordsRequest.uIClosedDateEdit.sendKeys(PoliceData.getRecordsModuleValue("ClosedDate"));

		}


		public void enterAtRequestNo() 
        {
            uIMapRecords.openRecordsRequest.uIRequestNoYearEdit.sendKeys(PoliceData.getRecordsModuleValue("RequestNo").substring(0, 2));
            uIMapRecords.openRecordsRequest.uIRequestNoEdit.sendKeys(PoliceData.getRecordsModuleValue("RequestNo").substring(3));
            uIMapRecords.openRecordsRequest.uIRequestNoEdit.sendKeys(Keys.TAB);
        }
		public void selectRowByAtRequestNo() 
        {
            objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                    uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable,
                    PoliceData.getRecordsModuleValue("RequestNo"));
        }

		public void selectAtRequestNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable,
					PoliceData.getRecordsModuleValue("RequestNo"));

		}

		public void enterRequestByActiveData(String request) {
			uIMapRecords.openRecordsRequest.uIRequestNoYearEdit.sendKeys(request.substring(0, 2));
			uIMapRecords.openRecordsRequest.uIRequestNoEdit.sendKeys(request.substring(3));
			Playback.controlReadyThreadWait();
		}

		public void enterAtLastName() {
			uIMapRecords.openRecordsRequest.uILastName.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
			uIMapRecords.openRecordsRequest.uILastName.sendKeys(Keys.TAB);

		}

		public void enterAtFirstName() {
			uIMapRecords.openRecordsRequest.uIFirstName.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
			uIMapRecords.openRecordsRequest.uIFirstName.sendKeys(Keys.TAB);
		}

		public void selectAtRequestByInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.openRecordsRequest.uIOpenRecordsRequestTable,
					PoliceData.getRecordsModuleValue("RequestedBy"));

		}

	}

	public class OpenRecordsRequestHelpWindow {
		public void VerifyMenuLinksAreDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequestHelpWindow.uIAddNewButton
					.getAttribute("unselectable").contains("on"));
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequestHelpWindow.uIRefreshButton
					.getAttribute("unselectable").contains("on"));
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordsRequestHelpWindow.uIResetButton
					.getAttribute("unselectable").contains("on"));
			verify.ExpectedValueIsTrue(
					uIMapRecords.openRecordsRequestHelpWindow.uIBackButton.getAttribute("unselectable").contains("on"));
		}

		public void VerifyRowCountInOpenRequestGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapRecords.openRecordsRequestHelpWindow.uIOpenRecordsRequestTable) == 2);
		}

		public void VerifyAtRequestTypeColumn() {
			List<String> cellValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapRecords.openRecordsRequestHelpWindow.uIOpenRecordsRequestTable, "Request Type");
			verify.ExpectedValueIsTrue(cellValues.contains(PoliceData.getRecordsModuleValue("RequestType")));

		}

	}

	public class OpenRecordsRequestEntry {
		public void tabOutReceivedDate() {
			uIMapRecords.openRecordRequestEntry.uIReceivedDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterDueByDateAs3DaysFutureDate() {
			uIMapRecords.openRecordRequestEntry.uIDueByDateEdit.sendKeys(Randomized.getFutureDate(3));
		}

		public void selectAtRequestType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.openRecordRequestEntry.uIRequestTypeComboBox,
					PoliceData.getRecordsModuleValue("RequestType"));
		}

		public void EnterAtRelatedCaseNo() {
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(0, 2));
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RelatedCaseNo").substring(3));
		}

		public void clickRequestDetailsTab() {
			uIMapRecords.openRecordRequestEntry.uIRequestDetailsTab.click();
		}

		public void SwitchToActivityHistoryTab() {
			uIMapRecords.openRecordRequestEntry.uIActivityHistoryTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmActivityHistory");
		}

		public void SwitchToFeesTab() {
			uIMapRecords.openRecordRequestEntry.uIFeesTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmFees");
		}

		public void VerifyStatusAsOpen() {
			verify.ExpectedPropertyValueIsEqual("OPEN", uIMapRecords.openRecordRequestEntry.uIStatusTextView.getText());
		}

		public void VerifyStatusAs3Days() {
			verify.ExpectedPropertyValueIsEqual("(3 DAYS)",
					uIMapRecords.openRecordRequestEntry.uIStatusDueDateTextView.getText());
		}

		public void Close() {
			uIMapRecords.openRecordRequestEntry.driver.close();
		}

		public void Save() {
			uIMapRecords.openRecordRequestEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void enterRelatedCaseNo(String caseNo) {
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit.sendKeys(caseNo.substring(0, 2));
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit.sendKeys(caseNo.substring(3));
		}

		public void ClickAllTabs() {
			uIMapRecords.openRecordRequestEntry.uIActivityHistoryTab.click();
			uIMapRecords.openRecordRequestEntry.uIAttachmentsTab.click();
			uIMapRecords.openRecordRequestEntry.uIFeesTab.click();
		}

		public void enterAtAssignedTo() {
			uIMapRecords.openRecordRequestEntry.uIAssignedToEdit
					.sendKeys(PoliceData.getRecordsModuleValue("AssignedTo"));
		}

		public void enterAtCallNo() {
			uIMapRecords.openRecordRequestEntry.uICallyearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.openRecordRequestEntry.uICallNoEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
			uIMapRecords.openRecordRequestEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2),
					uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo").substring(3),
					uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit.getAttribute("value"));

		}

		public void clickAssignedToLookUpButton() {
			uIMapRecords.openRecordRequestEntry.uIAssignedToLookUpButton.click();
		}

		public void verifyStatusOpenRadioButtonIsSelected() {
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordRequestEntry.uIStatusOpenRadioButton.isSelected());
		}

		public void enterCaseNoByActiveData(String Case) {
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit.sendKeys(Case.substring(0, 2));
			uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit.sendKeys(Case.substring(3));
			Playback.controlReadyThreadWait();
		}
		public void verifyReceivedDate() {
			String currentDate = Randomized.getCurrentDate();
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.uIReceivedDateEdit.getAttribute("value"), currentDate);
		}

		public void verifyAtRequestedType() {
			Select requestType = new Select(uIMapRecords.openRecordRequestEntry.uIRequestTypeComboBox);
			verify.ExpectedPropertyValueIsEqual(requestType.getFirstSelectedOption().getText(),
					PoliceData.getRecordsModuleValue("RequestType"));

		}

		public void saveNCloseScreen() {
			uIMapRecords.openRecordRequestEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}
		
		public void verifyAtCaseNo(String caseNo) {
			verify.ExpectedPropertyValueIsEqual(caseNo.substring(0, 2),
					uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseNo.substring(3),
					uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit.getAttribute("value"));

		}

		public void verifyAtRequestNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RequestNo").substring(0, 2),
					uIMapRecords.openRecordRequestEntry.uIRequestYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RequestNo").substring(3),
					uIMapRecords.openRecordRequestEntry.uIRequestNoEdit.getAttribute("value"));

		}

		public void verifyRequestNo(String requestNo) {
			verify.ExpectedPropertyValueIsEqual(requestNo.substring(0, 2),
					uIMapRecords.openRecordRequestEntry.uIRequestYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(requestNo.substring(3),
					uIMapRecords.openRecordRequestEntry.uIRequestNoEdit.getAttribute("value"));

		}
		public String readRequestNo() {
			String Requestyear = uIMapRecords.openRecordRequestEntry.uIRequestYearEdit.getAttribute("value");
			String RequestNo = uIMapRecords.openRecordRequestEntry.uIRequestNoEdit.getAttribute("value");
			String Request = Requestyear + "-" + RequestNo;
			return Request;

		}
		public void verifyActiveCaseNo(String readCaseNo) {
			String attribute = uIMapRecords.openRecordRequestEntry.uIRelatedCaseYearEdit.getAttribute("value");
			String attribute1 = uIMapRecords.openRecordRequestEntry.uIRelatedCaseNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(readCaseNo.contains(attribute));
			verify.ExpectedValueIsTrue(readCaseNo.contains(attribute1));
		}

		public void verifyActiveCallNo(String readCallNo) {
			String attribute = uIMapRecords.openRecordRequestEntry.uICallyearEdit.getAttribute("value");
			String attribute1 = uIMapRecords.openRecordRequestEntry.uICallNoEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(readCallNo.contains(attribute));
			verify.ExpectedValueIsTrue(readCallNo.contains(attribute1));
		}
		
		public void verifyAdditionSuccessfulMessage() 
		{
			String UpdateMessage = uIMapRecords.openRecordRequestEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
		}
		
		public String readReceivedDate() {
			String recvDate = uIMapRecords.openRecordRequestEntry.uIReceivedDateEdit.getAttribute("value");
			return recvDate;
		}
		
		public OpenRecordsRequestEntry() {
			if ((this.requestDetailsTab == null)) {
				this.requestDetailsTab = new RequestDetailsTab();
			}

			if ((this.activityHistoryTab == null)) {
				this.activityHistoryTab = new ActivityHistoryTab();
			}

			if ((this.openRecordRequestFeesTab == null)) {
				this.openRecordRequestFeesTab = new OpenRecordRequestFeesTab();
			}
		}

		public RequestDetailsTab requestDetailsTab = null;
		public ActivityHistoryTab activityHistoryTab = null;
		public OpenRecordRequestFeesTab openRecordRequestFeesTab = null;
		
		

	}

	public class RequestDetailsTab {

		public void enterAtLastName() {
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uILastNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIFirstNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void tabOutFirstName() {
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterRequestInformationDetails() {
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIRequestInformationDetailsEdit.click();
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIRequestInformationDetailsEdit
					.sendKeys(Randomized.randomString(20));
		}

		public void verifyAtFirstName() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIFirstNameEdit.getAttribute("value"),
					PoliceData.getRecordsModuleValue("FirstName"));
		}
		public void verifyAtLastName() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.requestDetailsTab.uILastNameEdit.getAttribute("value"),
					PoliceData.getRecordsModuleValue("LastName"));
		}

		public void verifyAtRequestedByAddress() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIAddressEdit.getAttribute("value"),
					PoliceData.getRecordsModuleValue("RequestedByAddress"));

		}

		public void verifyAtRequestedByCSZ() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.requestDetailsTab.uICSZ.getAttribute("value"),
					PoliceData.getRecordsModuleValue("CSZ"));

		}

		public void verifyAtRequestedByPincode() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIPincode.getAttribute("value"),
					PoliceData.getRecordsModuleValue("Pincode"));

		}

		public void enterAtRequestInformationDetails() {
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIRequestInformationDetailsEdit.click();
			uIMapRecords.openRecordRequestEntry.requestDetailsTab.uIRequestInformationDetailsEdit
					.sendKeys(PoliceData.getRecordsModuleValue("RequestDetails"));
		}
	}

	public class ActivityHistoryTab {

		public void TabOutUpdateDate() {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIUpdatedDateEdit.sendKeys(Keys.TAB);
		}

		public void TabOutUpdatedByCode() {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIUpdatedByCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtDuration() {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIDurationHourEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Duration"));
		}

		public void ClickShowSystemCommentsCheckbox() {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIShowSystemCommentsCheckbox.click();
		}

		public void ClickAddButton() {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIAddButton.click();
		}

		public void EnterComments(String comments) {
			uIMapRecords.openRecordRequestEntry.activityHistoryTab.uICommentsEdit
					.sendKeys("Automation Entering the PoliceData");
			comments = uIMapRecords.openRecordRequestEntry.activityHistoryTab.uICommentsEdit.getAttribute("value");
			Playback.setTestContextAttribute("comments", comments);
		}

		public void VerifyAddedCommentsInGrid(String comments) {
			String text = uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistorytable.getText();
			verify.ExpectedPropertyValueIsEqual(comments, text);
		}

		public void VerifyPencilIconDisappears() {
			verify.ExpectedValueIsFalse(
					uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIPencilEditImageButton.isDisplayed());
		}

		public void VerifyStatusAsOpenDisplaysInGrid() {
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistorytable
					.getText().contains("Open"));
		}

		public void EnterAtHourDuration() {
            uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIDurationHourEdit
                    .sendKeys(PoliceData.getRecordsModuleValue("HourDuration"));
        }
		public void EnterAtMinDuration() {
            uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIDurationMinEdit
                    .sendKeys(PoliceData.getRecordsModuleValue("MinDuration"));
        }
		public void EnterComments() {
            uIMapRecords.openRecordRequestEntry.activityHistoryTab.uICommentsEdit
                    .sendKeys("Automation EnterinAutomationg the PoliceData");
            }
		public void VerifyAddedCommentsInGrid() {
            String text = uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistorytable.getText();
            verify.ExpectedValueIsTrue(text.contains("Automation EnterinAutomationg the PoliceData"));
        }

		public void verifyUpdatedDate() {
			String currentDate = Randomized.getCurrentDate("MM/DD/YY");
			System.out.println(uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistoryDateVerify.getText());
			verify.ExpectedValueIsTrue(
					uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistoryDateVerify.getText()
							.contains(currentDate));
		}

		public void verifyTopSystemComment() {
			verify.ExpectedValueIsTrue(
					uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistoryTopSystemCommentVerify
							.getText().contains("System"));

		}

		public void verifyUpdatedBy() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistoryUpdatedByVerify.getText(),
					PoliceData.getRecordsModuleValue("UpdatedBy"));
		}

		public void VerifyAddedCommentsInGrid1() {
			String text = uIMapRecords.openRecordRequestEntry.activityHistoryTab.uIActivityHistorytable.getText();
			verify.ExpectedValueIsTrue(text.contains("Open"));
		}
	}

	public class OpenRecordRequestFeesTab {

		public void selectAtItemCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIItemCodeComboBox,
					PoliceData.getRecordsModuleValue("ItemCode"));
		}
		public void selectAtItemCode1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIItemCodeComboBox,
					PoliceData.getRecordsModuleValue("ItemCode1"));
		}

		public void ClearQty() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIQtyEdit.clear();
		}

		public void EnterAtQty() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIQtyEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Qty"));
		}

		public void EnterAtRate() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIRateEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Rate"));
		}

		public void ClearRate() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIRateEdit.clear();
		}

		public void ClickAddButton() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIAddButton.click();
		}

		public void Save() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtTotalInvoiceAmount() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("TotalInvoiceAmt"),
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uITotalInvoiceAmountEdit
							.getAttribute("value"));
		}

		public void VerifyAtBalanceInvoiceAmount() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("BalanceInvoiceAmt"),
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIBalanceInvoiceAmountEdit
							.getAttribute("value"));
		}

		public void ClickReceivePaymentButton() {
			uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIReceivePaymentButton.click();
		}

		public void verifyAtItemCodeInGrid() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIFeesTable,
									PoliceData.getRecordsModuleValue("ItemCode"), "Item Code")
							.getText(),
					PoliceData.getRecordsModuleValue("ItemCode"));
		}

		public void verifyInvoiceNoGenerated() {
			verify.ExpectedValueIsTrue(uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIInvoiceNoEdit
					.getAttribute("value").contains("I" + "-" + Randomized.getCurrentYear().substring(0, 2)));
		}

		public void selectAtItemCodeUsingDescription() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIItemCodeComboBox,
					PoliceData.getRecordsModuleValue("Description"));
		}

		public void verifyAtItemCodeInGridUsingDescription() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIFeesTable,
									PoliceData.getRecordsModuleValue("Description"), "Item Code")
							.getText(),
					PoliceData.getRecordsModuleValue("Description"));
		}
		public void verifyItemCodeDetailAlreadyExistsAcknowledgeMessage() 
        {
            popup.acknowledge.okWithExpectedContainMessage("Item Code Detail already exists");
        }
		 public void EnterAtAmount() {
				uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIAmountEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Amount"));
			}

			public void EnterAtCondition() {
				uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIConditionEdit
						.sendKeys(PoliceData.getRecordsModuleValue("Conditions"));
			}
			public void selectGridRowByIndex(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(
					uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIFeesTable, rowIndex);
		}
			public void ClickPrintConditions() {
				uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIPrintConditions.click();
			}
			public void verifyAtItemCodeInGrid1() {
				verify.ExpectedPropertyValueIsEqual(
						objectIdentification.manualIdentify
								.getGridCell(uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIFeesTable,
										PoliceData.getRecordsModuleValue("ItemCode"), "Item Code")
								.getText(),
						PoliceData.getRecordsModuleValue("ItemCode1"));
			}

			public void verifyAtConditionsInGrid() {
				verify.ExpectedPropertyValueIsEqual(
						objectIdentification.manualIdentify
								.getGridCell(uIMapRecords.openRecordRequestEntry.openRecordRequestFeesTab.uIFeesTable,
										PoliceData.getRecordsModuleValue("Conditions"), "Conditions")
								.getText(),
						PoliceData.getRecordsModuleValue("Conditions"));
			}
			
	}

	public class ReportStatusScreenTab {
		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.reportStatusScreenTab.uIStatusComboBox, PoliceData.getRecordsModuleValue("Status"));
			uIMapRecords.reportStatusScreenTab.uISearchResultGrid.sendKeys(Keys.TAB);
		}

		public void ClickShowMyItemOnlyCheckBox() {
			uIMapRecords.reportStatusScreenTab.uIShowMyItemOnlyCheckBox.click();
		}

		public void ClickSearchButton() {
			uIMapRecords.reportStatusScreenTab.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyColumnValueAtOfficer() {
			Playback.controlReadyThreadWait();
			List<String> officerValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapRecords.reportStatusScreenTab.uISearchResultGrid, "Officer");
			verify.ExpectedValueIsTrue(officerValues.contains(PoliceData.getRecordsModuleValue("Officer")));
		}

		public void ClickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.reportStatusScreenTab.uISearchResultGrid, PoliceData.getRecordsModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
		}
	}

	public class BoloScreenTab {
		public void ClickEditBoloTextButton() {
			uIMapRecords.boloScreenTab.uIEditBoloTextButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRefreshButton() {
			uIMapRecords.boloScreenTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyBoloReportAcknowledgeMessage() {

			popup.acknowledge.ok();
			Playback.controlReadyThreadWait();
		}
	}

	public class ComplaintEntry {
		public void SaveScreen() {
			uIMapRecords.complaintEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveCloseScreen() {
			uIMapRecords.complaintEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void ClickSave() {
			uIMapRecords.complaintEntry.uISaveButton.click();
		}

		public void VerifyRequiredEntriesAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void TabReportedDateTime() {
			uIMapRecords.complaintEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.complaintEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtComplaintType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.complaintEntry.uIComplaintTypeComboBox,
					PoliceData.getRecordsModuleValue("ComplaintType"));
			uIMapRecords.complaintEntry.uIComplaintTypeComboBox.sendKeys(Keys.TAB);
		}
		public void ClickAnonymousCheckbox() {
			uIMapRecords.complaintEntry.uIAnonymousCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyComplianAgainstFieldDisplayed() {
			verify.ExpectedValueIsTrue(uIMapRecords.complaintEntry.uIComplaintAgainstEdit.isDisplayed());
			verify.ExpectedPropertyValueIsEqual("Anonymous",
					uIMapRecords.complaintEntry.uIComplaintAgainstEdit.getAttribute("value"));
		}

		public void EnterComplaintAgainstAtLastName() {
			uIMapRecords.complaintEntry.uIComplaintAgainstLastNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
		}

		public void EnterComplaintAgainstAtFirstName() {
			uIMapRecords.complaintEntry.uIComplaintAgainstFirstNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
		}

		public void EnterAtIncidentLocation() {
			uIMapRecords.complaintEntry.uIIncidentLocationEdit
					.sendKeys(PoliceData.getRecordsModuleValue("IncidentLocation"));
			uIMapRecords.complaintEntry.uIIncidentLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void SelectAgencyEmployedBy() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.complaintEntry.uIAgencyEmployedByComboBox);
			uIMapRecords.complaintEntry.uIAgencyEmployedByComboBox.sendKeys(Keys.TAB);
		}

		public void ClickComplaintDetailsTab() {
			uIMapRecords.complaintEntry.uIComplaintDetailsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyNoFurtureUpdateConfirmMessage() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage(
						"(6071)   No further updates are allowed. Are you sure you want to save?  ");
			else
				popup.confirm.yesWithExpectedMessage(
						"(6071) No further updates are allowed. Are you sure you want to save?");
		}

		public void VerifySaveConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			} else {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			}
		}

		public void VerifyComplaintNoGenerationAcknowledgeMessage() {
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
			if (Playback.browserType.equals("Chrome")) {
				verify.ExpectedValueIsTrue(warningMessage.contains("(22539) New Complaint No"));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(warningMessage.contains("(22539) New Complaint#"));
				popup.acknowledge.ok();
			}
		}

		public void SelectAtIncidentCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.complaintEntry.uIIncidentCategoryComboBox,
					PoliceData.getRecordsModuleValue("IncidentCategory"));
			uIMapRecords.complaintEntry.uIIncidentCategoryComboBox.sendKeys(Keys.TAB);
		}

		public ComplaintEntry() {
			if ((this.complaintsDetailsTab == null)) {
				this.complaintsDetailsTab = new ComplaintsDetailsTab();
			}
		}
		public ComplaintsDetailsTab complaintsDetailsTab = null;

	}

	public class ComplaintsDetailsTab {
		public void ClickAnonymousCheckbox() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIAnonymousCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyComplaintByFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintByComboBox
					.getAttribute("class").contains("SELECTInActive"), "Verify ComplaintBy Field Disabled");
		}

		public void VerifyNameAndAddressFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.complaintEntry.complaintsDetailsTab.uILastNameEdit
					.getAttribute("class").contains("textboxInactive"), "Verify LastName Field Disabled");
			verify.ExpectedValueIsTrue(uIMapRecords.complaintEntry.complaintsDetailsTab.uIFirstNameEdit
					.getAttribute("class").contains("textboxInactive"), "Verify LastName Field Disabled");
			verify.ExpectedValueIsTrue(uIMapRecords.complaintEntry.complaintsDetailsTab.uIAddressEdit
					.getAttribute("class").contains("textboxInactive"), "Verify LastName Field Disabled");
		}

		public void SelectAtComplaintBy() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintByComboBox,
					PoliceData.getRecordsModuleValue("ComplaintBy"));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintByComboBox.sendKeys(Keys.TAB);
		}

		public void SelectReceivedSource() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.complaintEntry.complaintsDetailsTab.uIReceiveSourceComboBox);
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIReceiveSourceComboBox.sendKeys(Keys.TAB);
		}
		public void EnterAtLastName() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uILastNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
		}

		public void EntertAtFirstName() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIFirstNameEdit
					.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
		}

		public void EnterAtAddress() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIAddressEdit
					.sendKeys(PoliceData.getRecordsModuleValue("Address"));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIAddressVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterAtCallNo() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uILocalAgencyCallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uILocalAgencyCallNumberEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uILocalAgencyCallNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtComplaintLocation() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintLocationEdit
					.sendKeys(PoliceData.getRecordsModuleValue("ComplaintLocation"));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintLocationVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterComplaintdetails() {
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIComplaintDetailsEdit
					.sendKeys(Randomized.randomString(100));
		}

		public void SelectAtReportedBy() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.complaintEntry.complaintsDetailsTab.uIReportedByComboBox,
					PoliceData.getRecordsModuleValue("ReportedBy"));
			uIMapRecords.complaintEntry.complaintsDetailsTab.uIReportedByComboBox.sendKeys(Keys.TAB);
		}
	}

	public class PursuitCaseEntry {
		public void TabOfficer() {
			uIMapRecords.pursuitCaseEntry.uIOfficerEdit.click();
			uIMapRecords.pursuitCaseEntry.uIOfficerEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void TabSupervisor() {
			uIMapRecords.pursuitCaseEntry.uISupervisorEdit.click();
			uIMapRecords.pursuitCaseEntry.uISupervisorEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyATOfficerName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("OfficerName"),
					uIMapRecords.pursuitCaseEntry.uIOfficerDescriptionEdit.getAttribute("value"));
		}

		public void SelectWeather() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.pursuitCaseEntry.uIWeatherComboBox);
			uIMapRecords.pursuitCaseEntry.uIWeatherComboBox.sendKeys(Keys.TAB);
		}

		public void ClickTrafficViolationCheckbox() {
			uIMapRecords.pursuitCaseEntry.uITrafficViolationCheckbox.click();
		}

		public void ClickWarrantCheckbox() {
			uIMapRecords.pursuitCaseEntry.uIWarrantCheckbox.click();
		}

		public void SelectReasonPursuitTerminated() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.pursuitCaseEntry.uIReasonPursuitTerminatedComboBox);
			uIMapRecords.pursuitCaseEntry.uIReasonPursuitTerminatedComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapRecords.pursuitCaseEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSaveButton() {
			uIMapRecords.pursuitCaseEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveScreen() {
			uIMapRecords.pursuitCaseEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtCaseNoUsingCharge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapRecords.pursuitCaseEntry.uIPursuitChargeTable,
							PoliceData.getRecordsModuleValue("Charge"), "Case#").getText());
		}

		public void VerifyAtCharge(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.pursuitCaseEntry.uIPursuitChargeTable, "Charge", rowCount));
		}

		public void VerifyOfficerAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7239) Officer is required");
		}

		public void VerifyChargeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6514) Minimum One Charge is Required");
		}

		public void ClickPrintIcon() {
			uIMapRecords.pursuitCaseEntry.uIPrintButton.click();
			Playback.controlReadyThreadWait();
		}

		public void Close() {
			uIMapRecords.pursuitCaseEntry.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtOfficer() {
			uIMapRecords.pursuitCaseEntry.uIOfficerEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
		}

		public void EnterAtCharge1() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge1"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge2() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge2"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge3() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge3"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge4() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge4"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge5() {
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("Charge5"));
			uIMapRecords.pursuitCaseEntry.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void clickChargelookupicon() {
			objectIdentification.manualIdentify.scrollIntoView(uIMapRecords.pursuitCaseEntry.uIChargeLookupIcon);
			uIMapRecords.pursuitCaseEntry.uIChargeLookupIcon.click();
			Playback.popupThreadWait();
		}

		public void EnterNoPeopleArrested() {
			uIMapRecords.pursuitCaseEntry.uINoPeopleArrestedEdit.sendKeys(Randomized.randomNumberString(2));
			uIMapRecords.pursuitCaseEntry.uINoPeopleArrestedEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtRoadSurface() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.pursuitCaseEntry.uIRoadSurfaceComboBox,
					PoliceData.getRecordsModuleValue("RoadSurface"));
			
		}
	}

	public class IBRSubmissionScreenTab {
		public void clickSubmissionLink() {
			uIMapRecords.iBRSubmissionScreenTab.uISubmissionLink.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBatchNoInGrid(String batchNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapRecords.iBRSubmissionScreenTab.uIIBRSubmissionTable, batchNo);
			Playback.controlReadyThreadWait();
		}

		public void ClickViewTextFileLink() {
			uIMapRecords.iBRSubmissionScreenTab.uIViewTextFileLink.click();
			Playback.controlReadyThreadWait();
		}

		public void clickSearch() {
			uIMapRecords.iBRSubmissionScreenTab.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SwitchToViewTextFileScreen() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmViewTxtFile");
			Playback.controlReadyThreadWait();
		}

		public void clickBatchNoInGrid(String batchNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapRecords.iBRSubmissionScreenTab.uIIBRSubmissionTable, batchNo);
			Playback.controlReadyThreadWait();
		}
	}

	public class IBRSubmissionEntry {
		public void EnterToDate() {
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.click();
			Playback.controlReadyThreadWait();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.sendKeys("03/29/2019");
		}

		public void EnterRemarks() {
			uIMapRecords.iBRSubmissionEntry.uIRemarksEdit.sendKeys(Randomized.randomString(25));
		}

		public void clickGenerateFileButton() {
			uIMapRecords.iBRSubmissionEntry.uIGenerateFileButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterToDateAsCurrentDate() {
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.click();
			Playback.controlReadyThreadWait();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.clear();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void VerifySaveConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			} else {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			}
		}

		public void VerifyConfirmGenerateNIBRSSubmissionFile() {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				Playback.pageLoadThreadWait();
				verify.ExpectedValueIsTrue(uIMapRecords.iBRSubmissionEntry.uIWarningMessageTextView.getText()
						.contains("Do you want to generate a NIBRS submission file?"));
				uIMapRecords.iBRSubmissionEntry.uIYesButton.click();
			} else {
				Playback.pageLoadThreadWait();
				verify.ExpectedValueIsTrue(uIMapRecords.iBRSubmissionEntry.uIWarningMessageTextView.getText()
						.contains("Do you want to generate a NIBRS submission file?"));
				uIMapRecords.iBRSubmissionEntry.uIYesButton.click();
			}
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void verifyFileCreationStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapRecords.iBRSubmissionEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1065 - File creation successful"));
		}

		public void Close() {
			uIMapRecords.iBRSubmissionEntry.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void GetBatchNo(String batchNo) {
			Playback.pageLoadThreadWait();
			String batchYear = uIMapRecords.iBRSubmissionEntry.uIBatchYearEdit.getAttribute("value");
			String batchNumber = uIMapRecords.iBRSubmissionEntry.uIBatchNoEdit.getAttribute("value");
			batchNo = batchYear + "-" + batchNumber;
			Playback.setTestContextAttribute("batchNo", batchNo);
		}

		public void clickViewTextFileButton() {
			uIMapRecords.iBRSubmissionEntry.uIViewTextFileButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyGenerateNIBRSfileAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("((7143) Do you want to generate a NIBRS submission file?");
		}

		public void closeScreen() {
			uIMapRecords.iBRSubmissionEntry.driver.close();
		}

		public String getBatchNo() {
			Playback.pageLoadThreadWait();
			String batchYear = uIMapRecords.iBRSubmissionEntry.uIBatchYearEdit.getAttribute("value");
			String batchNumber = uIMapRecords.iBRSubmissionEntry.uIBatchNoEdit.getAttribute("value");
			String batchNo = batchYear + "-" + batchNumber;
			Playback.setTestContextAttribute("batchNo", batchNo);
			return batchNo;
		}

		public void clickBatchNoInGrid(String batchNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapRecords.iBRSubmissionScreenTab.uIIBRSubmissionTable, batchNo);
			Playback.controlReadyThreadWait();
		}

		public void enterAtToDate() {
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.click();
			Playback.controlReadyThreadWait();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.sendKeys(PoliceData.getRecordsModuleValue("ToDate"));
		}

		public void tabAtToDate() {
			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.click();

			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.clear();

			uIMapRecords.iBRSubmissionEntry.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyMsgInsideTextFile() {
			objectIdentification.windowHandle.switchToWindow("frmViewTxtFile");
			Playback.driver.findElement(By.xpath("//html/body/pre")).getText()
					.contains(Randomized.getCurrentMonth() + "-" + Randomized.getCurrentYear());

		}

	}

	public class ReportRelatedToPF {
		public void Close() {
			uIMapRecords.reportRelatedToPF.driver.close();
		}
	}

	public class ProfileSearch {
		public void ClickSearch() {
			uIMapRecords.profileSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickAddNew() {
			uIMapRecords.profileSearch.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBack() {
			uIMapRecords.profileSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtTow() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.profileSearch.uITowComboBox,
					PoliceData.getRecordsModuleValue("Tow"));
			uIMapRecords.profileSearch.uITowComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtTotalNoOfOccupants() {
			uIMapRecords.profileSearch.uITotalNoOfOccupantsInCarEdit
					.sendKeys(PoliceData.getRecordsModuleValue("TotalNoOccupants"));
		}

		public void ClickIncludeCompletedCheckbox() {
			uIMapRecords.profileSearch.uIInclideCompletedCheckbox.click();
		}

		public void VerifyProfileNo(String ProfileNo, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(ProfileNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.profileSearch.uIProfileTable, "Profile#", rowIndex));
		}

		public void VerifyAtCallNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.profileSearch.uIProfileTable,
							"Call#", rowIndex));
		}

		public void SelectAtCallNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.profileSearch.uIProfileTable,
					PoliceData.getRecordsModuleValue("CallNo"));
			Playback.controlReadyThreadWait();
		}

		public void selectEthicityOfDriver() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.profileSearch.uIEthicityofDriverComboBox,
					PoliceData.getRecordsModuleValue("EthicityOfDriver"));
			uIMapRecords.profileSearch.uIEthicityofDriverComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtProfileNo(String profileNo) {
			Playback.controlReadyThreadWait();
			uIMapRecords.profileSearch.uIProfileYearEdit.sendKeys(profileNo.substring(0, 2));
			uIMapRecords.profileSearch.uIProfileNoEdit.sendKeys(profileNo.substring(3));
			uIMapRecords.profileSearch.uIProfileNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickPrintIcon() {
			uIMapRecords.profileSearch.uIPrintIcon.click();
			Playback.controlReadyThreadWait();
		}
	}

	public class VehicleProfile {
		public void Save() {
			uIMapRecords.vehicleProfile.uISaveButton.click();
			popup.confirm.yes();
		}

		public void Close() {
			uIMapRecords.vehicleProfile.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtCallNo() {
			uIMapRecords.vehicleProfile.uICallYearEdit
					.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(0, 2));
			uIMapRecords.vehicleProfile.uICallNoEdit.sendKeys(PoliceData.getRecordsModuleValue("CallNo").substring(3));
		}

		public void clickCallInfoIcon() {
			uIMapRecords.vehicleProfile.uICallNoInfoButton.click();
		}

		public void TabDateTime() {
			uIMapRecords.vehicleProfile.uIDateEdit.sendKeys(Keys.TAB);
			uIMapRecords.vehicleProfile.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtlocationCode() {
			uIMapRecords.vehicleProfile.uILocationCodeEdit.sendKeys(PoliceData.getRecordsModuleValue("LocationCode"));
		}
		public void EnterAtOfficer() {
			uIMapRecords.vehicleProfile.uIOfficerEdit.sendKeys(PoliceData.getRecordsModuleValue("Officer"));
		}

		public void SelectOfficerAsAUTO() {
			uIMapRecords.vehicleProfile.uIOfficerEdit.sendKeys("AUTO");
			uIMapRecords.vehicleProfile.uIOfficerEdit.sendKeys(Keys.TAB);
			popup.switchToCodedSearch();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getRecordsModuleValue("Officer"));
		}
		public void EnterAtPlateNo() {
			uIMapRecords.vehicleProfile.uIPlateNoEdit.sendKeys(PoliceData.getRecordsModuleValue("PlateNo"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.vehicleProfile.uIStateComboBox,
					PoliceData.getRecordsModuleValue("State"));
			uIMapRecords.vehicleProfile.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void SelectRaceOfDriver() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIRaceOfDriverComboBox);
			uIMapRecords.vehicleProfile.uIRaceOfDriverComboBox.sendKeys(Keys.TAB);
		}

		public void SelectDriverGender() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIDriverGenderComboBox);
			uIMapRecords.vehicleProfile.uIDriverGenderComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtTotalNoOfOccupants() {
			uIMapRecords.vehicleProfile.uITotalNoOfOccupantsInCarEdit
					.sendKeys(PoliceData.getRecordsModuleValue("TotalNoOccupants"));
		}

		public void SelectAssignmentStatus() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIAssignmentStatusComboBox);
			uIMapRecords.vehicleProfile.uIAssignmentStatusComboBox.sendKeys(Keys.TAB);
		}

		public void SelectResultOfStop() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIResultOfStopComboBox);
			uIMapRecords.vehicleProfile.uIResultOfStopComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtReasonForStop() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.vehicleProfile.uIReasonForStopComboBox,
					PoliceData.getRecordsModuleValue("ReasonForStop"));
			uIMapRecords.vehicleProfile.uIReasonForStopComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtTow() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.vehicleProfile.uITowComboBox,
					PoliceData.getRecordsModuleValue("Tow"));
			uIMapRecords.vehicleProfile.uITowComboBox.sendKeys(Keys.TAB);
		}

		public void SelectDurationOfStop() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIDurationOfStopComboBox);
			uIMapRecords.vehicleProfile.uIDurationOfStopComboBox.sendKeys(Keys.TAB);
		}

		public void SelectRoadClassification() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uIRoadClassificationComboBox);
			uIMapRecords.vehicleProfile.uIRoadClassificationComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCitationNo() {
			uIMapRecords.vehicleProfile.uICitationNo.sendKeys(PoliceData.getRecordsModuleValue("CitationNo"));

		}

		public void enterAtCustom3() {
			uIMapRecords.vehicleProfile.uICustomField.sendKeys(PoliceData.getRecordsModuleValue("Custom3"));

		}
		public void SelectSearchAsResultStop() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uISearchAsResultStopComboBox);
			uIMapRecords.vehicleProfile.uISearchAsResultStopComboBox.sendKeys(Keys.TAB);
		}

		public void SelectSearchAsResultStopAsYes() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapRecords.vehicleProfile.uISearchAsResultStopComboBox,"Yes");
			uIMapRecords.vehicleProfile.uISearchAsResultStopComboBox.sendKeys(Keys.TAB);
		}
		public void VerifyReasonForSearchCheckboxEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIReasonableSuspicionCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIInventoryCheckbox.isEnabled());
		}
	public void VerifyReasonForSearchCheckboxDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIReasonableSuspicionCheckbox.isEnabled());
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIInventoryCheckbox.isEnabled());
		}

		public void VerifyScopeOfSearchCheckboxEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIDriverCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIVehicleCheckbox.isEnabled());
		}

		public void VerifyScopeOfSearchCheckboxDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIDriverCheckbox.isEnabled());
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIVehicleCheckbox.isEnabled());
		}

		public void VerifyResultOfSearchCheckboxEnabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIDrugsDrugParaphernaliaCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIWeaponsCheckbox.isEnabled());
		}

		public void VerifyResultOfSearchCheckboxDisabled() {
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIDrugsDrugParaphernaliaCheckbox.isEnabled());
			verify.ExpectedValueIsFalse(uIMapRecords.vehicleProfile.uIWeaponsCheckbox.isEnabled());
		}

		public void VerifyAtTow() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Tow"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapRecords.vehicleProfile.uITowComboBox));
		}

		public void VerifyAtSelectReasonForStop() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReasonForStop"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapRecords.vehicleProfile.uIReasonForStopComboBox));
		}
		public void ClickReasonableSuspicionCheckbox() {
			uIMapRecords.vehicleProfile.uIReasonableSuspicionCheckbox.click();
		}

		public void ClickInventoryCheckbox() {
			uIMapRecords.vehicleProfile.uIInventoryCheckbox.click();
		}

		public void ClickVehicleCheckbox() {
			uIMapRecords.vehicleProfile.uIVehicleCheckbox.click();
		}

		public void ClickDrugsDrugParaphernaliaCheckbox() {
			uIMapRecords.vehicleProfile.uIDrugsDrugParaphernaliaCheckbox.click();
		}

		public void ClickWeaponsCheckbox() {
			uIMapRecords.vehicleProfile.uIWeaponsCheckbox.click();
		}

		public void GetProfileNo(String profileYear, String profileNo) {
			profileYear = uIMapRecords.vehicleProfile.uIProfileYearEdit.getAttribute("value");
			Playback.setTestContextAttribute("profileYear", profileYear);
			profileNo = uIMapRecords.vehicleProfile.uIProfileNoEdit.getAttribute("value");
			Playback.setTestContextAttribute("profileNo", profileNo);
			
			
		}
		public String readProfileNo() {
			String profileYear = uIMapRecords.vehicleProfile.uIProfileYearEdit.getAttribute("value");	
			String profileNo = uIMapRecords.vehicleProfile.uIProfileNoEdit.getAttribute("value");
			return profileYear+"-"+profileNo;
		}

		public void ClickCallInfoIcon() {
			uIMapRecords.vehicleProfile.uICallNoInfoButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyEthicityofDriverIsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapRecords.vehicleProfile.uIEthicityofDriverComboBox.isEnabled());
		}

		public void verifyPlateTypeIsDisabled() {
			Playback.controlReadyThreadWait();
			String readonlyattribute = uIMapRecords.vehicleProfile.uIPlateTypeComboBox.getAttribute("readonly");
			System.out.println(readonlyattribute);
			verify.ExpectedPropertyValueIsEqual(readonlyattribute,
					uIMapRecords.vehicleProfile.uIPlateTypeComboBox.getAttribute("readonly"));
		}

		public void selectEthicityOfDriver() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapRecords.vehicleProfile.uIEthicityofDriverComboBox,
					PoliceData.getRecordsModuleValue("EthicityOfDriver"));
			uIMapRecords.vehicleProfile.uIEthicityofDriverComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtOptionalRaceInfo() {
			uIMapRecords.vehicleProfile.uIOptionalRaceInfo.sendKeys(PoliceData.getRecordsModuleValue("RaceInfo"));
			
		}

		public void selectDriverGenderAsMale() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.vehicleProfile.uIDriverGenderComboBox,"Male");
	uIMapRecords.vehicleProfile.uIDriverGenderComboBox.sendKeys(Keys.TAB);
		}

		public void selectResidencyAsCityTownResident() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.vehicleProfile.uIResidencyComboBox,"11 - City/Town Resident");
	uIMapRecords.vehicleProfile.uIResidencyComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtDriverYearOfBirth() {
			uIMapRecords.vehicleProfile.uIDriverYearOfBirth.sendKeys(PoliceData.getRecordsModuleValue("BirthYear"));
			
		}

		public void selectSpeedDeterminedByAsRader() {
			objectIdentification.manualIdentify
			.selectDropDownOption(uIMapRecords.vehicleProfile.uISpeedDeterminedByDropdown,"01 - Radar/Lidar");
	
		}

		 public void selectResidency() 
	        {
	            objectIdentification.randomIdentify
	            .selectDropDownOption(uIMapRecords.vehicleProfile.uIResidencyDropDown);
	    uIMapRecords.vehicleProfile.uIResidencyDropDown.sendKeys(Keys.TAB);
	        }
		   public void selectSpeedDeterminedBy()
	        {
	            objectIdentification.randomIdentify.selectDropDownOption(uIMapRecords.vehicleProfile.uISpeedDeterminedByDropDown);
	        }

			public void clickTowLabel() {
				uIMapRecords.vehicleProfile.uITowLabel.click();

			}

			public void verifyTowLabelAsRedColor() {
				String attribute = uIMapRecords.vehicleProfile.uITowLabel.getAttribute("style");
				verify.ExpectedValueIsTrue(attribute.contains("rgb(153, 0, 0)"));
			}

			public void clickSaveButton() {
				uIMapRecords.vehicleProfile.uISaveButton.click();
			}

			public void verifyRequiredEntriesMissingTowAcknowledgeMessage() {
				popup.acknowledge.okWithExpectedContainMessage("Required Entries are Missing Tow");

			}
			
		public void verifyAdditionSuccessfulMessageInFooterStatus() {
			String text = uIMapRecords.vehicleProfile.uIFooterStatusLabel.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
		}
	}

	public class ViewTextFileEntry {
		public void VerifyAtCaseNo() {
			verify.ExpectedValueIsTrue(uIMapRecords.viewTextFileEntry.uIViewText.getText()
					.contains(PoliceData.getRecordsModuleValue("CaseNo").substring(0, 2)));
			verify.ExpectedValueIsTrue(uIMapRecords.viewTextFileEntry.uIViewText.getText()
					.contains(PoliceData.getRecordsModuleValue("CaseNo").substring(3)));
		}

	public void VerifyVictimRowText() {
			verify.ExpectedValueIsTrue(uIMapRecords.viewTextFileEntry.uIViewText.getText().contains("4IWI"));
		}

		public void VerifyOffenderRowText() {
			verify.ExpectedValueIsTrue(uIMapRecords.viewTextFileEntry.uIViewText.getText().contains("5IWI"));
		}

		public void closeScreen() {
			uIMapRecords.viewTextFileEntry.driver.close();
		}
	}

	public class RedactStatus {
		public void ClickOpenPDFforRedactionButton() {
			uIMapRecords.redactStatus.uIOpenPDFforRedactionButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickUploadPDFBUtton() {
			uIMapRecords.redactStatus.uIUploadPDFButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterReasonforRedaction() {
			uIMapRecords.redactStatus.uIReasonforRedactionEdit.sendKeys("ReasonforRedaction");
			Playback.controlReadyThreadWait();
		}

		public void clickSave() {
			uIMapRecords.redactStatus.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickCancel() {
			uIMapRecords.redactStatus.uICancelButton.click();
			Playback.controlReadyThreadWait();
		}

		public void Close() {
			uIMapRecords.redactStatus.driver.close();
		}
	}

	public class SendEmail {

		public void enterAtToEmailaddress() {
			uIMapRecords.reportStatus.uISendEmailTo.clear();
			String[] Email = { "mahesha@prophoenix.com", "Mithun@Prophoenix.com", "Rajas@ProPhoenix.com" };
			for (String mailId : Email) {
				Playback.threadWait(500);
				uIMapRecords.reportStatus.uISendEmailTo.sendKeys(mailId + ";");
			}

		}

		public void enterAtMassage() {
			Playback.waitForControlReady();
			uIMapRecords.reportStatus.uISendEmaiMassage
					.sendKeys("Hi all," + "Supplimental Report attached please Find" + "Thanks");

		}

		public void clickOnSendMail() {
			Playback.threadWait();
			uIMapRecords.reportStatus.uISendEmaiSendButton.click();
		}

		public void clickOnCancleMail() {
			Playback.threadWait();
        	uIMapRecords.reportStatus.uISendEmailCancleButton.click();
		}

	}

	public class NIBRSCheck {
		public void VerifyNIBRSErrorCheckCompletedLabel() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("NIBRS Error check has been Completed",
					uIMapRecords.nIBRSCheck.uINoErrorLabel.getText());
		}

		public void closeScreen() {
			uIMapRecords.nIBRSCheck.driver.close();
		}

		public void verifyAtDescriptionUsingCFS() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable,
									PoliceData.getRecordsModuleValue("CFS"), "Description")
							.getText());
		}

		public void verifyAtDescriptionUsingCFS1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable,
									PoliceData.getRecordsModuleValue("CFS1"), "Description")
							.getText());
		}

		public void verifyAtDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void verifyAtDescription1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void verifyAtDescription2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void verifyAtCFS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}
		public void verifyAtChargeOffense(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Charge / Offense", rowIndex));
		}
		public void verifyAtChargeOffense1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Charge / Offense", rowIndex));
		}


		public void VerifyAtDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyAtErrorNo1(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ErrorNo1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyAtCFS1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyAtCFS2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyAtDescription1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Description1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsAgeOfArresteeIsMandatoryFiled(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Age of Arrestee - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Sex (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Race (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthinicityOfArresteeIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Ethnicity (of Arrestee) - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfArrestIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Resident of Arrestee - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfVictimIsMandatoryFiled(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Names Edit/Entry(2210):Resident of Victim - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Sex (of Arrestee) should be proper values(Code Type: 1085) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Sex (of Arrestee) should be proper values(Code Type: 1085)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Race (of Arrestee) should be proper values(Code Type: 1011) -"
								+ " Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Race (of Arrestee) should be proper values(Code Type: 1011) -"
								+ " Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthnicityOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Ethnicity of Arrestee should be proper values(Code Type: 2069)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Ethnicity of Arrestee should be proper values(Code Type: 2069) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfArresteeShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Resident (of Arrestee) should be proper values(Code Type: 1087) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Names Edit/Entry(2210):Resident (of Arrestee) should be proper values(Code Type: 1087) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));

		}

		public void VerifyDescriptionAsHowArrestShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):How Arrest should be proper code values(Code Type: 1009) "
								+ "- Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):How Arrest should be proper code values(Code Type: 1009) "
								+ "- Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsArmed1ShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed1 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed1 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsArmed2ShouldBeProperValues(int rowIndex) {
			if ("604" == PoliceData.getRecordsModuleValue("ErrorNo"))
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed2 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – not in FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
			else
				verify.ExpectedPropertyValueIsEqual(
						"Arrest Entry(2610):Armed2 should be proper code values(Code Type: 2045)"
								+ " - Invalid data value – Not on FBI validation table",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyAtCFS1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("CFS1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "CFS", rowIndex));
		}

		public void VerifyErrorNoAs74InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("74", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyErrorNoAs390InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("390", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Error#", rowIndex));
		}

		public void VerifyError74DescriptioninGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "74", "Description").getText()
					.contains("Property record (Level 3) must exist with this offense"));
		}

		public void VerifyError390DescriptioninGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "390", "Description")
					.getText().contains(
							"Invalid combination of Offense and Property. Expecting Motor Vehicle theft(240) Offense for selected Property description"));
		}

		public void VerifyError604DescriptioninGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "604", "Description")
					.getText().contains("How Arrest should be proper code values(Code Type: 1009)"));
		}

		public void VerifyDescriptionAsAgeOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Age of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Sex of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Race of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfVictim(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Resident of Victim - Must be present with Victim Type = I",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSexOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Sex of Victim should be proper values(Code Type:1085) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsRaceOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Race of Victim should be proper values(Code Type:1011) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsEthnicityOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Ethinicity of Victim should be proper values(Code Type:2069) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsResidentOfVictimShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"Names Edit/Entry(2210):Resident of Victim should be proper values(Code Type:1087) - Invalid data value – not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsAttemptedOrCompletedShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"FTC(2530):Attempted/Completed should be proper code values(Code Type:1114) - Invalid Code",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsSuspectedOfUsingShouldProperCoded(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					"FTC(2530):Offender(s) Suspected of Using should be proper code values(Code Type:1041) - Invalid data value – Not on FBI validation table",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}


		public void VerifyErrorCheckCompletedLabel() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("NIBRS Error check has been Completed",
					uIMapRecords.caseUpdate.nIBRSCheckTab.uINoErrorLabel.getText());
		}

		public void VerifyCFSEntryTypeBError(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("CFS entry required for type B arrest. - Mandatory field",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

		public void VerifyDescriptionAsPropertyRecordMustExist(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(
					"Property Entry(3223): Property Record must exist with this Offense - Property record (Level 3) must exist with this offense",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapRecords.caseUpdate.nIBRSCheckTab.uINIBRSCheckTable, "Description", rowIndex));
		}

	}

	public class UOFDetail {
		public void Close() {
			uIMapRecords.uOFDetail.driver.close();
		}

	}

	public class ReportStatusNarrative {

		public void switchToFrame()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame(uIMapRecords.reportStatusNarrative.uITextFrame);
		}
		
		public void enterAtTextField() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatusNarrative.uITextBody.sendKeys(PoliceData.getRecordsModuleValue("Text"));
			Playback.pageLoadThreadWait();
		}

		public void enterTextField() {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatusNarrative.uITextBody.click();
			uIMapRecords.reportStatusNarrative.uITextBody.sendKeys(Randomized.randomString(20));
			Playback.pageLoadThreadWait();
		}

		public void clickOfficialAccesOnly() {
			Playback.pageLoadThreadWait();
			uIMapRecords.reportStatusNarrative.uIOfficialUseOnlyButton.click();
		}

		public void save() {
			uIMapRecords.reportStatusNarrative.uISaveButton.click();
			popup.confirm.yes();
			
		}

		public void selectTestFontAndSize(String FontName,String size) {
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatusNarrative.uIFontNameDropdown.click();
			Playback.driver.findElement(By.xpath("//span[contains(text(),'"+FontName+"')]")).click();
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatusNarrative.uIFontSizeDropDownvalue.click();
			Playback.driver.findElement(By.xpath("//td[contains(text(),'"+size+"')]")).click();
		}

		public void clcikAtTextEntered() {
			uIMapRecords.reportStatusNarrative.uITextEnteredtoBody.click();
		}
		public void selectAllText()
		{
			Playback.controlReadyThreadWait();
			uIMapRecords.reportStatusNarrative.uITextBody.sendKeys(Keys.CONTROL, "a");
		}

	
		public void verifyNarrativeFontsSelectedAsArialSize14() {
			Playback.controlReadyThreadWait();
		verify.ExpectedValueIsTrue(	uIMapRecords.reportStatusNarrative.uIFontNameDropdownvalue.getText().contains("Arial"));
		verify.ExpectedValueIsTrue(	uIMapRecords.reportStatusNarrative.uIFontSizeDropDownvalue.getText().contains("14pt"));
			
		}

		public void verifyNarrativeFontsCourierNewSize16() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(	uIMapRecords.reportStatusNarrative.uIFontNameDropdownvalue.getText().contains("Courier New"));
			verify.ExpectedValueIsTrue(	uIMapRecords.reportStatusNarrative.uIFontSizeDropDownvalue.getText().contains("16pt"));
				
		}

		public void clickBold() {
            Playback.pageLoadThreadWait();
            uIMapRecords.reportStatusNarrative.uIBoldButton.click();
        }

		public void VerifyEnteredTextAsBold() {
            Playback.controlReadyThreadWait();
//            verify.ExpectedValueIsTrue(uIMapRecords.reportStatusNarrative.uITextArea.getTagName().contains("strong"));
            System.out.println(uIMapRecords.reportStatusNarrative.uITextBody.getCssValue("font-weight"));
//            System.out.println(uIMapRecords.reportStatusNarrative.uITextArea.getText());
            String text=PoliceData.getRecordsModuleValue("Text");
            String Bold =uIMapRecords.reportStatusNarrative.uITextBody.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).getTagName();
            verify.ExpectedPropertyValueIsEqual(Bold, "b");
        }
	}
	    
  public class ReportStatusForRedact{
			
			public void clickFieldsButton()
			{
				Playback.controlReadyThreadWait();
				uIMapRecords.reportStatusForRedact.uIFieldsButton.click();
				Playback.pageLoadThreadWait();
			}
			public void clickSaveAndCloseButton()
			{
				Playback.controlReadyThreadWait();
				uIMapRecords.reportStatusForRedact.uISaveAndCloseButton.click();
				Playback.pageLoadThreadWait();
			}
			public void clickRefresh()
			{
				Playback.pageLoadThreadWait();
				uIMapRecords.reportStatusForRedact.uIReportStatusRefreshButton.click();
			}
			public void enterAtReasonForRedaction()
			{
				uIMapRecords.reportStatusForRedact.uIReasonForRedact.sendKeys(PoliceData.getRecordsModuleValue("RedactReason"));
			}
			public void clickSaveAndCloseButtonRedactPopup()
			{
				Playback.controlReadyThreadWait();
				uIMapRecords.reportStatusForRedact.uIReasonSaveNClose.click();
				Playback.pageLoadThreadWait();
			}
			public void clickCancelButtonRedactPopup()
			{
				Playback.controlReadyThreadWait();
				uIMapRecords.reportStatusForRedact.uIReasonCancel.click();
				Playback.pageLoadThreadWait();
			}
			public void verifyAdditionSuccessfulAck() {
				Playback.pageLoadThreadWait();
				popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
			}
			 public void verifyAdditionSuccessfulAcknowledgeMessage() {
                 Playback.pageLoadThreadWait();
                 popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
        }
        
        public void close()
        {
        	uIMapRecords.reportStatusForRedact.driver.close();
        }			
			
		}

  public class RedactExpungement
  {
	  public void selectAtRedactCheckBoxByField()
	  {
		  Playback.pageLoadThreadWait();
		  objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.redactExpungement.uIFieldsTable, PoliceData.getRecordsModuleValue("Field"));
	  }
	  public void clickSaveAndClose()
	  {
		  uIMapRecords.redactExpungement.uISaveAndCloseButton.click();
		  Playback.pageLoadThreadWait();
	  }
	  public void clickSave()
	  {
		  uIMapRecords.redactExpungement.uISaveButton.click(); 
		  Playback.pageLoadThreadWait();
	  }

  }
  
  public class ReportStatusViewRedactReport{
		
		public void verifyAtReportTypeByIndex(int rowIndex) {
			Playback.pageLoadThreadWait();
			String type = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable, "Type", rowIndex);
			if (rowIndex == 0) {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReportType"), type);
			} else {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("ReportType"+ rowIndex +""), type);
			}
		}
		
		public void clickAtOriginalReport()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable, PoliceData.getRecordsModuleValue("Type"));
		}
		public void clickAtRedactReport()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable, PoliceData.getRecordsModuleValue("Type1"));
		}
		public void clickAtOriginalReportALCIcon()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable, PoliceData.getRecordsModuleValue("ReportType"));
		}
		public void clickAtRedactReportALCIcon()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable, PoliceData.getRecordsModuleValue("ReportType1"));
		}
		public void verifyScreenLableShowingAsMoreThanOneReport()
		{
			String lbl =uIMapRecords.reportStatusViewRedactReport.uIScreenLableMoreThanOneReport.getText();
			verify.ExpectedValueIsTrue(lbl.contains("More than one version"));
		}

		public void veifyAtRedactComments(int rowIndex) {
		String comment =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapRecords.reportStatusViewRedactReport.uIRedactTable,  "Comments", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("RedactReason"), comment);
		}

		public void close()
			{
				uIMapRecords.reportStatusViewRedactReport.driver.close();
			}
		
  }
  
  public class UseOfForceReportEntry {

	 
      public void clickAddNewButton() {
          uIMapRecords.useOfForceReportEntry.uIAddNewButton.click();
      }

      public void clickResetButton() {
          uIMapRecords.useOfForceReportEntry.uIResetButton.click();
      }

      public void closeScreen() {
          Playback.driver.close();
      }
  }
  
	public class PoliceForceTab {
	
		public void clickPhysicalForceCheckBox() {

			uIMapRecords.caseSearch.policeForceTab.uIPhysicalForceCheckBox.click();
		}

		public void clickDeadlyForceCheckBox() {

			uIMapRecords.caseSearch.policeForceTab.uIDeadlyForceCheckBox.click();
		}

		public void clickVechicleForceCheckBox() {

			uIMapRecords.caseSearch.policeForceTab.uIVechicleForceCheckBox.click();
		}
  }
  public class RepositoryEntry {

		public void verifyRepositoryID() {
			verify.ExpectedPropertyValueIsEqual("2560001",
					uIMapRecords.repositoryEntry.uIRepositoryIDEdit.getAttribute("value"));

		}

		public void verifyDefaultNameAsCustomName1() {
			verify.ExpectedPropertyValueIsEqual("Custom1", uIMapRecords.repositoryEntry.uIDefaultNameEdit.getText());

		}

		public void verifyRepositoryIdIsDisAbled() {

			String Readonly1 = uIMapRecords.repositoryEntry.uIRepositoryIDEdit.getAttribute("readonly");
			System.out.println(Readonly1);

			verify.ExpectedPropertyValueIsEqual(Readonly1,
					uIMapRecords.repositoryEntry.uIRepositoryIDEdit.getAttribute("readonly"));

		}

		public void verifyDefaultNameIsDisAbled() {
			String ReadOnly2 = uIMapRecords.repositoryEntry.uIDefaultNameEdit.getAttribute("readonly");
System.out.println(ReadOnly2+"j");
			
			verify.ExpectedPropertyValueIsEqual(ReadOnly2,
					uIMapRecords.repositoryEntry.uIDefaultNameEdit.getAttribute("readonly"));

		}

		public void enterAtCustomName() {
			uIMapRecords.repositoryEntry.uICustomNameEdit.click();
			uIMapRecords.repositoryEntry.uICustomNameEdit.clear();
			uIMapRecords.repositoryEntry.uICustomNameEdit.sendKeys(PoliceData.getRecordsModuleValue("CustomName"));
			                                                                                          
		}

		public void selectAtFieldusage() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.repositoryEntry.uIFieldUsageComboBox,
					PoliceData.getRecordsModuleValue("FieldUsage"));
		}

		public void selectAtFieldusage(int slno) {

			if (slno == 0) {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapRecords.repositoryEntry.uIFieldUsageComboBox,
						PoliceData.getRecordsModuleValue("FieldUsage"));
			} else {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapRecords.repositoryEntry.uIFieldUsageComboBox,
						PoliceData.getRecordsModuleValue("FieldUsage" + slno + ""));

			}
		}

		public void closeScreen() {
			uIMapRecords.repositoryEntry.driver.close();
		}

		public void verifyOptionsInFieldUsage() {
		uIMapRecords.repositoryEntry.uIFieldUsageComboBox.getText().contains("Hide");

		}

		public void clicksaveNClose() {
			uIMapRecords.repositoryEntry.uISaveAndClose.click();
			popup.confirm.yes();
		}

		public void clicksave() {
			uIMapRecords.repositoryEntry.uISave.click();
			popup.confirm.yes();
		}

	}
	public void switchToPursuitReportEntry() {
		objectIdentification.windowHandle.switchToWindow("Pursuit");
		
	}
	public class PursuitReportEntry {

		public void tabOfficer() {

			uIMapRecords.pursuitReportEntry.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void enterAtsupervisor() {
			uIMapRecords.pursuitReportEntry.uISupervisorEdit.sendKeys(PoliceData.getRecordsModuleValue("Supervisor"));

		}

		public void selectAtWeather() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.pursuitReportEntry.uIWeatherComboBox,
					PoliceData.getRecordsModuleValue("Weather"));

		}

		public void selectAtRoadSurface() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapRecords.pursuitReportEntry.uIRoadSurfaceCombo,
					PoliceData.getRecordsModuleValue("RoadSurface"));

		}

		public void enterAtNoOfPeopleInjured() {
			uIMapRecords.pursuitReportEntry.uINoOFPeopleInjuredEdit
					.sendKeys(PoliceData.getRecordsModuleValue("PeopleInjured"));

		}

		public void enterAtNoOfPeopleKilled() {
			uIMapRecords.pursuitReportEntry.uINoOFPeoplekilledEdit
					.sendKeys(PoliceData.getRecordsModuleValue("PeopleKilled"));
		}

		public void enterAtNoOfPeopleInPursuedVechicle() {
			uIMapRecords.pursuitReportEntry.uINoOfPeopleInPursuedVechicleEdit
					.sendKeys(PoliceData.getRecordsModuleValue("PurusuedVechicle"));
		}

		public void clickSaveScreen() {
			uIMapRecords.pursuitReportEntry.uISave.click();
			popup.confirm.yes();

		}

		public void enterAtCharge() {
			uIMapRecords.pursuitReportEntry.uIChargeEdit.sendKeys(PoliceData.getRecordsModuleValue("charge"));
		}

		public void clickAdd() {
			uIMapRecords.pursuitReportEntry.uIAddButton.click();

		}

	}

	public class DirectReportEntry {
		public void clickSaveAndCloseButton() {
			Playback.controlReadyThreadWait();
			uIMapRecords.directReportEntry.uISaveNClose.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void clickSave() {
			Playback.controlReadyThreadWait();
			uIMapRecords.directReportEntry.uISave.click();
			Playback.pageLoadThreadWait();

		}

		public void Save() {
			Playback.controlReadyThreadWait();
			uIMapRecords.directReportEntry.uISave.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void enterAtLocation() {
			uIMapRecords.directReportEntry.uILocation.click();
			uIMapRecords.directReportEntry.uILocation.sendKeys(PoliceData.getRecordsModuleValue("Location"));
			uIMapRecords.directReportEntry.uILocation.sendKeys(Keys.TAB);
		}

		public void tabOutReportedDatetime() {
			uIMapRecords.directReportEntry.uIReportedDate.click();
			uIMapRecords.directReportEntry.uIReportedDate.sendKeys(Keys.TAB);
			uIMapRecords.directReportEntry.uIReportedTime.click();
			uIMapRecords.directReportEntry.uIReportedTime.sendKeys(Keys.TAB);
		}

		public void VerifyRequiredEntriesAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyAdditionSuccessfulAcknowledgeMessage() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
		}

		public void VerifyCaseNo(String CaseNo) {
			verify.ExpectedPropertyValueIsEqual(CaseNo, uIMapRecords.directReportEntry.uIYearEdit.getAttribute("value"),
					uIMapRecords.directReportEntry.uICaseNumberEdit.getAttribute("value"));
		}

		public String readCaseNo() {
			String Caseyear = uIMapRecords.directReportEntry.uIYearEdit.getAttribute("value");
			String CaseNo = uIMapRecords.directReportEntry.uICaseNumberEdit.getAttribute("value");
			String Case = Caseyear + "-" + CaseNo;
			System.out.println(Case);
			return Case;

		}
		public void verifyLocationFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.directReportEntry.uILocation.getAttribute("class").contains("textboxInactive"));
			
		}
		public void VerifyCaseNoFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.directReportEntry.uIYearEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(	uIMapRecords.directReportEntry.uICaseNumberEdit.getAttribute("class").contains("textboxInactive"));
		}
		public void verifyReportedDatetimeDisabled() {
			verify.ExpectedValueIsTrue(uIMapRecords.directReportEntry.uIReportedDate.getAttribute("class").contains("textboxInactive"));
			
		}

	}

	public class SuspectSearch {
		public void ClickSearchButton() {
			uIMapRecords.suspectSearch.uISearchButton.click();
		}

		public void clickBackButton() {
			uIMapRecords.suspectSearch.uIBackButton.click();
		}

		public void ClickResetButton() {
			uIMapRecords.suspectSearch.uIResetButton.click();
		}

		public void SelectRowByAtName() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapRecords.suspectSearch.uISuspectSearchResultgrid, PoliceData.getRecordsModuleValue("Name1"));
			Playback.pageLoadThreadWait();
		}
	}
	public class UnitHistorySearch {

		public void enterAtOfficerNo() {
			uIMapRecords.unitHistorySearch.uIOfficerNoEdit.sendKeys(PoliceData.getRecordsModuleValue("OfficerNo"));
			uIMapRecords.unitHistorySearch.uIOfficerNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtUnitName() {
			uIMapRecords.unitHistorySearch.uIUnitnameEdit.sendKeys(PoliceData.getRecordsModuleValue("UnitName"));
			uIMapRecords.unitHistorySearch.uIUnitnameEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapRecords.unitHistorySearch.uISearchButton.click();
			;

		}

		public void clickExpandButton() {
			uIMapRecords.unitHistorySearch.uIExpandButton.click();
		}

		public String getActionDateAndTimeFromGrid() {
			String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "Action Data and Time", 0);
			return gridCellInnerText;
		}

		public String getDispositionFromGrid() {
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "Disposition", 0);
			return gridCellInnerText;
		}

		public String getUserCCFromGrid() {
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "UserCC", 0);
			return gridCellInnerText;
		}

		public void verifyActionDateAndTimeFromGrid(List<String> actual) {

			String expected = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "Action Data and Time", 0);
			if (actual.contains(expected)) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}

		}
		
		public void verifyUserCCFromGrid(List<String> actual) {

			String expected = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "UserCC", 0);
			if (actual.contains(expected)) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}

		}
		
		public void verifyDispositionFromGrid(List<String> actual) {

			String expected = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapRecords.unitHistorySearch.uIUnitHistorySearchTable, "Disposition", 0);
			if (actual.contains(expected)) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}

		}

		public void clearActionFromDateAndTime() {
			uIMapRecords.unitHistorySearch.uIActionFromDateEdit.clear();
			uIMapRecords.unitHistorySearch.uIActionFromTimeEdit.clear();
		}

	}
	public class CaseUpdateMapTab {
		public void VerifyLatLongValue() {
			verify.ExpectedValueIsTrue(uIMapRecords.caseUpdate.caseUpdateMapTab.uILatLongValueTextView.getText().contains(PoliceData.getRecordsModuleValue("LatLongValue")));
		}

		public void ClickReset() {
			uIMapRecords.caseUpdate.caseUpdateMapTab.uIResetButton.click();
			Playback.gridLoadThreadWait();
		}

		public void clickUpdateLatLongButton() {
			uIMapRecords.caseUpdate.caseUpdateMapTab.uIUpdateLatLongButton.click();
		}

		public void VerifyYesMasterGeoOverWriteConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm
						.yesWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm
						.yesWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");

			}
		}

		public void VerifyNoMasterGeoOverWriteConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm
						.noWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm
						.noWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
				Playback.gridLoadThreadWait();

			}
		}

		public void verifyYesUpdateLatLongConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude");
				Playback.gridLoadThreadWait();
			}

			else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.yesWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude");

			}
		}

		public void verifyNoUpdateLatLongConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.noWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude");
			} else {
				Playback.gridLoadThreadWait();
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.noWithExpectedMessage(
						"(5102) Are you sure you want to update the Latitude and Longitude");

			}

		}

		public void dragAndDropPointerInMap() {

			Playback.actionDriver.moveByOffset(572, 224);
			Playback.actionDriver.clickAndHold();
			Playback.actionDriver.moveByOffset(340, 224);
		}
		
		public void VerifyLatLongValueNotSet() {
			verify.ExpectedPropertyValueIsEqual("Not Set. Move bubble and update",
					uIMapRecords.caseUpdate.caseUpdateMapTab.uILatLongValueTextView.getText());
		}

	}
	
}

