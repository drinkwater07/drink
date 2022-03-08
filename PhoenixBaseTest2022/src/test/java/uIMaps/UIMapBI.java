package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Popup;
import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapBI {
	
	  public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public UIMapAccounting uIMapAccounting = new UIMapAccounting();   
	  public Popup popup = new Popup();
	  public UIMapPopup uIMapPopup = new UIMapPopup();
	
	public MasterSearch masterSearch;
	public MasterSearchEntry masterSearchEntry;
		public DashBoardConfig dashBoardConfig;

	public DashBoardEntry dashBoardEntry;
	
	  public UIMapBI() {

	        if (this.masterSearch == null) 
	            this.masterSearch = new MasterSearch();
	        
	        if (this.masterSearchEntry == null) 
	            this.masterSearchEntry = new MasterSearchEntry();
					if (this.dashBoardConfig == null)
			this.dashBoardConfig = new DashBoardConfig();

		if (this.dashBoardEntry == null)
			this.dashBoardEntry = new DashBoardEntry();
	              
	        
	    }
	  
	
	public class MasterSearch
	{
		WebDriver driver;
		   public MasterSearch()
	        {
	            driver = Playback.driver;
	            PageFactory.initElements(driver, this);
	        }
		   @FindBy(how = How.ID, using = "txtRptName")
	        public WebElement uIReportNameEdit;
		   
		   @FindBy(how = How.ID, using = "grdReportMasterSrch")
	        public WebElement uIMasterSearchTable;
		   
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Query Builder')]")
	        public WebElement uIQueryBuilderButton;
		 
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Case')]")
	        public WebElement uIQueryBuilderCaseButton;		
		 
		 @FindBy(how = How.ID, using = "cmdSearch")
	        public WebElement uISearchButton;	
		
	}
	
	public class MasterSearchEntry
	{
		public MasterSearchEntryPeriodTab masterSearchEntryPeriodTab;
		WebDriver driver;
		   public MasterSearchEntry()
	        {
	            driver = Playback.driver;
	            PageFactory.initElements(driver, this);
	            
	            if (this.masterSearchEntryPeriodTab == null) 
		            this.masterSearchEntryPeriodTab = new MasterSearchEntryPeriodTab();
	        }
		
		 @FindBy(how = How.ID, using = "txtRptName")
	        public WebElement uIReportNameEdit;
		 
		 @FindBy(how = How.ID, using = "txtdescription")
	        public WebElement uIDescriptionEdit;
		 
		 @FindBy(how = How.ID, using = "cmdSeacrh")
	        public WebElement uISearchButton;
		 	 
		  @FindBy(how = How.ID, using = "cmdsave")
          public WebElement uISaveButton;

          @FindBy(how = How.ID, using = "cmdSaveNClose")
          public WebElement uISaveAndCloseButton;

          @FindBy(how = How.ID, using = "cmdDelete")
          public WebElement uIDeleteButton;

          @FindBy(how = How.ID, using = "cmdPrint")
          public WebElement uIPrintButton;

          @FindBy(how = How.ID, using = "cmdRefresh")
          public WebElement uIResetButton;
          
          
          @FindBy(how = How.XPATH, using = "//span[contains(text(),'Period')]")
	        public WebElement uIPeriodTab;		
		 
	}

	public class MasterSearchEntryPeriodTab
	{
		WebDriver driver;
		   public MasterSearchEntryPeriodTab()
	        {
	            driver = Playback.driver;
	            PageFactory.initElements(driver, this);
	        }
		   
		   @FindBy(how = How.ID, using = "tabCubeConfig_usrCtrlPeriod_cddDateRange_DropDown")
	          public WebElement uIDateRangeDropDown;
		   
		   @FindBy(how = How.ID, using = "tabCubeConfig_usrCtrlPeriod_dttmFrmRange_KPIDttmCtrl")
	          public WebElement uIDateFromEdit;
		   
		   @FindBy(how = How.ID, using = "tabCubeConfig_usrCtrlPeriod_dttmToRange_KPIDttmCtrl")
	          public WebElement uIDateToEdit;
		   
		   
	}
	
	public class DashBoardConfig {
		WebDriver driver;

		public DashBoardConfig() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "grdDashBoardSrch")
		public WebElement uIDashBoardGid;

	}

	public class DashBoardEntry {
		WebDriver driver;

		public DashBoardEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Qa Form')]")
		public WebElement uIQaFormTab;
	}

	
	
}
