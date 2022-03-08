package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import uIMaps.UIMapVehicle.FleetEntryMainTab;
import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapHelpdesk
{
	
	public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public ObjectIdentification.WindowHandle windowHandle=objectIdentification.new WindowHandle();
	  
	  public  EmailSettings emailSettings;
	  public TicketEntry ticketEntry;
	  public TicketSearch ticketSearch;
	  
	  
	  public UIMapHelpdesk()
	  {
		  if(this.emailSettings == null)
			  this.emailSettings = new EmailSettings();
		  
		  if(this.ticketEntry == null)
			  this.ticketEntry = new TicketEntry();
		  
		  if(this.ticketSearch == null)
			  this.ticketSearch = new TicketSearch();
		  
	  }
	    public class EmailSettings
	    {	          

	    	
	    	public WebDriver driver;
	    	
	    	
	    	
	        public EmailSettings()
	        {
	        	
	        	driver = Playback.driver;
	        	PageFactory.initElements(Playback.driver, this); 
	        }
	        
	        @FindBy(how=How.ID, using = "cddHelpDeskClass_DropDown")
	        public WebElement uIHelpdeskClassComboBox;
	        
	        @FindBy(how=How.ID, using = "txtEmailAddresstoWatch")
	        public WebElement uIEmailAddressToWatchEdit;

	        @FindBy(how=How.ID, using= "txtSMTPServer") 
	        public WebElement uISmtpServerEdit;
	        
	        @FindBy(how=How.ID, using= "txtPassword") 
	        public WebElement uIPasswordEdit;

	        @FindBy(how=How.ID, using = "txtNotificationMail")
	        public WebElement uINotificationEmailEdit;

	        @FindBy(how=How.ID, using = "cddCategory_DropDown") 
	        public WebElement uICategoryComboBox;

	        @FindBy(how=How.ID, using = "cddStatus_DropDown") 
	        public WebElement uIStatusComboBox;

	        @FindBy(how=How.ID, using = "cddPriority_DropDown")
	        public WebElement uIPriorityComboBox;

	        @FindBy(how=How.ID, using = "cddType_DropDown")
	        public WebElement uITypeComboBox;

	         @FindBy(how=How.ID, using = "lupOwnerPF_CodeValue")
	        public WebElement uIOwnerPFCodeEdit;

	        @FindBy(how=How.ID, using = "ddlDitributionList")
	        public WebElement uIManagersDistributionListComboBox;

	        @FindBy(how=How.ID, using = "lupOwnerPF_imgBtn")
	        public WebElement uIOwnerPFLookUpIcon;
	        
	       
	        
	        @FindBy(how = How.ID, using = "cmdSaveNClose")
			public WebElement uISaveNCloseButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;
			
			@FindBy(how = How.ID, using = "cmdSaveNAddNew")
			public WebElement uISaveAndAddNewButton;
			
			@FindBy(how = How.ID, using = "cmdPrint")
			public WebElement uIPrintButton;
			
			@FindBy(how = How.ID, using = "cmdRefresh")
			public WebElement uIRefreshIcon;

	        

	       

	        
	        
	    }
	 	
	    public class TicketEntry
	    {
	    	
	    	public WebDriver driver;
	    	
	    	public TicketEntryDetailTab ticketEntryDetailTab;
	    	
	    	public TicketEntryActivitiesTab ticketEntryActivitiesTab;

	        public TicketEntry()
	        {
	        	driver = Playback.driver;
	        	PageFactory.initElements(Playback.driver, this); 
	        	
	        	if ((this.ticketEntryDetailTab == null))
                {
                    this.ticketEntryDetailTab = new TicketEntryDetailTab();
                }
	        	
	        	if ((this.ticketEntryActivitiesTab == null))
                {
                    this.ticketEntryActivitiesTab = new TicketEntryActivitiesTab();
                }
	        	
	        	
	        }
	        
	        
	        
	        
	        @FindBy(how=How.ID, using = "lstJuris")
	        public WebElement uIJurisComboBox;
	        
	        @FindBy(how=How.ID, using = "cddHelpDeskClass_DropDown")
	        public WebElement uIHelpdeskClassComboBox;
	        
	        @FindBy(how=How.ID, using= "txtSubject") 
	        public WebElement uISubjectEdit;
	        
	        @FindBy(how=How.ID, using= "lupCreator_CodeValue") 
	        public WebElement uICreatorPFEdit;
	        
	        @FindBy(how=How.ID, using= "lupOwner_CodeValue") 
	        public WebElement uIOwnerPFEdit;
	        
	        @FindBy(how=How.ID, using= "lupCreator_imgBtn") 
	        public WebElement uICreatorPFLookupButton;
	        
	        @FindBy(how=How.ID, using= "lupOwner_imgBtn") 
	        public WebElement uIOwnerPFLookupButton;
	        
	        @FindBy(how = How.ID, using = "lupCreator_cmdIncOnAddr")
			public WebElement uICreatorInfoIcon;
	        
	        @FindBy(how = How.ID, using = "lupOwner_cmdIncOnAddr")
			public WebElement uIOwnerInfoIcon;
	        
	        
	        @FindBy(how = How.ID, using = "lblCurrentStatus")
			public WebElement uITicketStatus;
	        
	        
	        @FindBy(how = How.ID, using = "ChkClosed")
			public WebElement uIClosedCheckBox;
	        

	        @FindBy(how=How.ID, using = "cddStatus_DropDown") 
	        public WebElement uIStatusComboBox;

	        @FindBy(how=How.ID, using = "cddPriority_DropDown")
	        public WebElement uIPriorityComboBox;
	        

	        @FindBy(how = How.ID, using = "cmdSaveNClose")
			public WebElement uISaveNCloseButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;
			
			@FindBy(how = How.ID, using = "cmdSaveNAddNew")
			public WebElement uISaveAndAddNewButton;
			
			@FindBy(how = How.ID, using = "cmdPrint")
			public WebElement uIPrintButton;
			
			@FindBy(how = How.ID, using = "cmdRefresh")
			public WebElement uIRefreshButton;
	         
			
			@FindBy(how = How.ID, using = "lblTicket")
			public WebElement uITicketNumber;
			
			
			@FindBy(how = How.ID, using = "lblUpdated")
			public WebElement uIUpdatedDateTime;
			
			@FindBy(how = How.ID, using = "lblUpdatedByPFNbrValue")
			public WebElement uIUpdatedPF;
			
			
			@FindBy(how = How.ID, using = "lblCreated")
			public WebElement uICreatedDateTime;
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Detail')]")
			public WebElement uIDetailTab;
			
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
			public WebElement uIAttachmentTab;
			
			
			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Activities')]")
			public WebElement uIActivitiesTab;
	        
	    }
	    
	    
	    
	    public class TicketEntryDetailTab
	    {
	        public WebDriver driver;
	        
	        public TicketEntryDetailTab()
	        {
	            driver = Playback.driver;
	            PageFactory.initElements(driver, this);
	        }

	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtPbmDescription")
	        public WebElement uIProblemDescriptionEdit;

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddCategory_DropDown")
	        public WebElement uICategoryComboBox;
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddProject_DropDown")
	        public WebElement uIProjectComboBox;

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddType_DropDown")
	        public WebElement uITypeComboBox;
	        

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddModule_DropDown")
	        public WebElement uIModuleComboBox;
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtPbmDescription")
	        public WebElement uIVersionEdit;
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtRelatedCRM")
	        public WebElement uIRelatedCrmEdit;
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddVendorName")
	        public WebElement uIVendorNameComboBox;
	        

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_lstContact")
	        public WebElement uIVendorContactComboBox;
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_lstCreatorJuris")
	        public WebElement uICreatorJurisComboBox;
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtVendorNotes")
	        public WebElement uIVendotNotesEdit;
	        

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddHowClosed_DropDown")
	        public WebElement uIhowWasitClosedComboBox;
	        
	        

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddActionPlan_DropDown")
	        public WebElement uIActionPlanComboBox;
	        
	        

	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddCustom1_DropDown")
	        public WebElement uICustom1ComboBox;
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_cddCustom2_DropDown")
	        public WebElement uICustom2ComboBox;
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtCustom3")
	        public WebElement uICustom3Edit;
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_txtCustom4")
	        public WebElement uICustom4Edit;
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_nbrRelatedTicket1_Year")
			public WebElement uIRelatedTicketYearEdit;
	             
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_nbrRelatedTicket1_Number")
			public WebElement uIRelatedTicketNumberEdit;
	             
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_nbrRelatedticket2_Year")
			public WebElement uIRelatedTicketYear2Edit;
	             
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_nbrRelatedticket2_Number")
			public WebElement uIRelatedTicketNumber2Edit;
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_lblCreatorEmail")
			public WebElement uICreatorEmailID;
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_lblCreatorPhone")
			public WebElement uICreatorPhoneNumber;
	        
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_dttmDueBy_Date_KPIDttmCtrl")
			public WebElement uIDueByDateEdit;
	        
	        @FindBy(how = How.ID, using = "tabHelpdeskEntry_tmpl1_UsrHelpDeskDetail1_dttmDueBy_Time")
			public WebElement uIDueByTimeEdit;

	    }
	    
	    
	    
	    public class TicketEntryActivitiesTab
	    {
	        public WebDriver driver;
	        
	        public TicketEntryAddActivity ticketEntryAddActivity;
	        
	        public TicketEntryActivitiesTab()
	        {
	        	
	        	if ((this.ticketEntryAddActivity == null))
                {
                    this.ticketEntryAddActivity = new TicketEntryAddActivity();
                }
	            driver = Playback.driver;
	            PageFactory.initElements(driver, this);
	        }
	        
	        
	        
	        @FindBy(how=How.ID, using = "tabHelpdeskEntry_tmpl0_usrActivities1_btnAddActivity")
	        public WebElement uIAddActivityButton;

	        
	    
	    }
	    
	    public class TicketEntryAddActivity
	    {

	    	public WebDriver driver;
	        public TicketEntryAddActivity()
	        {
	        	driver = Playback.driver;
	        	PageFactory.initElements(Playback.driver, this); 
	        }
	        
	        
	        
	              
	        
	        @FindBy(how = How.ID, using = "dttmStarted_Date_KPIDttmCtrl")
			public WebElement uIDateTimeStarted;
	        
	        @FindBy(how = How.ID, using = "dttmStarted_Date_KPIDttmCmd")
			public WebElement uIStartedMinutes;
	        
	        @FindBy(how = How.ID, using = "DttmFinished_Date_KPIDttmCtrl")
			public WebElement uIDateTimeFinished;
	        
	        @FindBy(how = How.ID, using = "DttmFinished_Date_KPIDttmCmd")
			public WebElement uIFinishedMinutes;
	        
	        @FindBy(how = How.ID, using = "cddStatus_DropDown")
			public WebElement uIStatusDropdown;
	        
	        @FindBy(how = How.ID, using = "txtTotalTime")
			public WebElement uITotalTime;
	        
	        @FindBy(how = How.ID, using = "ChkInternal")
			public WebElement uIInternalCheckBox;
	        
	        
	        @FindBy(how = How.ID, using = "cddTemplate")
			public WebElement uITextTemplateDropdown;

	        @FindBy(how = How.ID, using = "btnLoad")
			public WebElement uILoadButton;
	        
	        
	        @FindBy(how = How.ID, using = "cmdAddnew")
			public WebElement uIAddnewTemplateButton;
	        
	               

	        @FindBy(how = How.ID, using = "cmdSaveNClose")
			public WebElement uISaveNCloseButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;
			
			@FindBy(how = How.ID, using = "cmdSaveNAddNew")
			public WebElement uISaveAndAddNewButton;
			
			@FindBy(how = How.ID, using = "cmdPrint")
			public WebElement uIPrintButton;
			
			@FindBy(how = How.ID, using = "cmdRefresh")
			public WebElement uIRefreshButton;
	         
	        
	    
	    }
	    
	    public class TicketSearch
	    {

	    	public WebDriver driver;
	        public TicketSearch()
	        {
	        	driver = Playback.driver;
	        	PageFactory.initElements(Playback.driver, this); 
	        }
	        
	        
	        @FindBy(how=How.ID, using= "tabTicketSrch_tmpl0_usrBasic_txtSubject") 
	        public WebElement uISubjectEdit;
	        
	        @FindBy(how=How.ID, using= "tabTicketSrch_tmpl0_usrBasic_lupCreator_CodeValue") 
	        public WebElement uICreatorPFEdit;
	        
	        @FindBy(how=How.ID, using= "tabTicketSrch_tmpl0_usrBasic_lupOwner_CodeValue") 
	        public WebElement uIOwnerPFEdit;
	        
	        @FindBy(how=How.ID, using= "tabTicketSrch_tmpl0_usrBasic_lupCreator_imgBtn") 
	        public WebElement uICreatorPFLookupButton;
	        
	        @FindBy(how=How.ID, using= "tabTicketSrch_tmpl0_usrBasic_lupOwner_imgBtn") 
	        public WebElement uIOwnerPFLookupButton;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_lupCreator_cmdIncOnAddr")
			public WebElement uICreatorInfoIcon;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_lupOwner_cmdIncOnAddr")
			public WebElement uIOwnerInfoIcon;
	        
	        
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_lstJuris")
			public WebElement uIJurisDropdown;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_dtImgClear")
			public WebElement uIDateResetButton;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_dateFrom_KPIDttmCtrl")
			public WebElement uIFromDateEdit;

	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddDateType")
			public WebElement uIDateTypeComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddHelpDeskClass_DropDown")
			public WebElement uIHelpDeskClassComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_lstCreatorJuris")
			public WebElement uICreatorJurisComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddStatus_DropDown")
			public WebElement uIStatusComboBox;
	        
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddPriority_DropDown")
			public WebElement uIPriorityComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddCategory_DropDown")
			public WebElement uICategoryComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddType_DropDown")
			public WebElement uITypeComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddProject_DropDown")
			public WebElement uIProjectComboBox;

	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddModule_DropDown")
			public WebElement uIModuleComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddHowClosed_DropDown")
			public WebElement uIHowItWasClosedComboBox;


	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddVendorName")
			public WebElement uIVendorNameComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddActionPlan_DropDown")
			public WebElement uIActionPlanComboBox;
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddCustom1_DropDown")
			public WebElement uICustom1ComboBox;

	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_cddCustom2_DropDown")
			public WebElement uICustom2ComboBox;


	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_dateTo_KPIDttmCtrl")
			public WebElement uIToDateEdit;
	        
	        
	        @FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_nbrTicketNbr_Year")
			public WebElement uITicketYearEdit;

			@FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_nbrTicketNbr_Number")
			public WebElement uITicketNumberEdit;
			
			@FindBy(how=How.ID, using = "tabTicketSrch_tmpl0_usrBasic_chkIncludeClosed")
	        public WebElement uIIncludeClosedCheckBox;
			
			@FindBy(how=How.ID, using = "tabTicketSrch_tmpl0_usrBasic_chkIncludeActivities")
	        public WebElement uIIncludeActivitiesCheckBox;
			
			
			

	        
	        
	        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
			public WebElement uISearchButton;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
			public WebElement uIResetButton;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
			public WebElement uIAddNewButton;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
			public WebElement uIRefreshButton;

			@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
			public WebElement uIBackButton;

			
			@FindBy(how = How.ID, using = "tabTicketSrch_tmpl0_usrBasic_grdSearchResults")
			public WebElement uISearchResultGrid;
	        
			//tabTicketSrch_tmpl0_usrBasic_grdSearchResults_eppool
	        

	        @FindBy(how=How.ID, using = "cmdCancel")
	        public WebElement uICancelButton;

	        @FindBy(how=How.ID, using = "lblMessage")
	        public WebElement uIMessageText;

	        @FindBy(how=How.ID, using = "lblErrorMsg")
	        public WebElement uIErrorMessageText;

	        @FindBy(how = How.XPATH, using = "//img[contains(@src,'print.gif')]")
			public WebElement uIPrintButton;
	        
	    }
}