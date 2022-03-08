package application;


import dataAccess.BaseData;
import uIMaps.UIMapAccounting;
import uIMaps.UIMapBI;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.verify;

public class BI {
	
	  public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public UIMapAccounting uIMapAccounting = new UIMapAccounting();   
	  public Popup popup = new Popup();
	  public UIMapPopup uIMapPopup = new UIMapPopup();
	  public UIMapBI uIMapBI = new UIMapBI();
	  
	 public MasterSearch masterSearch;
	 public MasterSearchEntry masterSearchEntry;
	 public DashBoardConfig dashBoardConfig;
		
		public DashBoardEntry dashBoardEntry;
	 
	    public BI() {
	    	
            if (masterSearch == null) 
            	masterSearch = new MasterSearch();
            
            if (masterSearchEntry == null) 
            	masterSearchEntry = new MasterSearchEntry();
				   if (dashBoardConfig == null)
    			dashBoardConfig = new DashBoardConfig();
    		
    		if (dashBoardEntry == null)
    			dashBoardEntry = new DashBoardEntry();
            
	    }
	    
	    public void switchToMasterSearch()
    	{
    		Playback.controlReadyThreadWait();
    		objectIdentification.windowHandle.switchToMainWindowScreenTab("Master Search");
    	}
	     public void switchToDashBoardConfig() {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("DashBoard Config");
		}
	    public void switchToDashBoardEntry() {
			objectIdentification.windowHandle.switchToWindow("DashBoard Entry");
		}
	    public void switchToMasterSearchEntry()
    	{
    		Playback.controlReadyThreadWait();
    		objectIdentification.windowHandle.switchToWindow("Master Search Entry");
    	}
	    
	    
	    public class MasterSearch
	    {
	    	public void enterAtReportName()
	    	{
	    		uIMapBI.masterSearchEntry.uIReportNameEdit.clear();
	    		uIMapBI.masterSearchEntry.uIReportNameEdit.sendKeys(BaseData.getBIModuleValue("ReportName"));
	    	}
	    	public void mouseHoverOnQueryBuilder()
	    	{
	    		Playback.controlReadyThreadWait();
	    		Playback.actionDriver.moveToElement(uIMapBI.masterSearch.uIQueryBuilderButton).build().perform();
	    	}
	    	public void selectCaseFromQueryBuilder()
	    	{
	    		Playback.controlReadyThreadWait();
	    		uIMapBI.masterSearch.uIQueryBuilderCaseButton.click();
	    	}
	    	public void verifyAtReportName(int rowIndex)
	    	{
	    		Playback.controlReadyThreadWait();
	    		String reportName =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapBI.masterSearch.uIMasterSearchTable, "Report Name", rowIndex);	 
	    		verify.ExpectedPropertyValueIsEqual(BaseData.getBIModuleValue("ReportName"), reportName);
	    	}
	    	public void clickAtRowByReportName()
	    	{
	    		Playback.controlReadyThreadWait();
	    		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapBI.masterSearch.uIMasterSearchTable, BaseData.getBIModuleValue("ReportName"));	 
	    	}
			public void clickSearchButton() {
				uIMapBI.masterSearch.uISearchButton.click();
				
			}
			public void verifyNoRecordFoundAcknowlege()
	    	{
	    		popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
	    	}
	    }
	    public class MasterSearchEntry
	    {
	    	
	    	public MasterSearchEntryPeriodTab masterSearchEntryPeriodTab;
	    
	    	public MasterSearchEntry()
	    	{
	    	
	    	   if (masterSearchEntryPeriodTab == null) 
	    		   masterSearchEntryPeriodTab = new MasterSearchEntryPeriodTab();
	    	   
	    	}
	    	public void enterAtReportName()
	    	{
	    		uIMapBI.masterSearchEntry.uIReportNameEdit.sendKeys(BaseData.getBIModuleValue("ReportName"));
	    	}
	    	public void enterAtDescription()
	    	{
	    		uIMapBI.masterSearchEntry.uIDescriptionEdit.sendKeys(BaseData.getBIModuleValue("Description"));
	    	}
	    	public void clickOnPeriodTab()
	    	{
	    		uIMapBI.masterSearchEntry.uIPeriodTab.click();
	    	}
	    	public void clickDeleteIcon()
	    	{
	    		uIMapBI.masterSearchEntry.uIDeleteButton.click();
	    		popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
	    	}
	    	public void clickPrintIcon()
	    	{
	    		uIMapBI.masterSearchEntry.uIPrintButton.click();
	    	}
	    	public void save()
	    	{
	    		uIMapBI.masterSearchEntry.uISaveButton.click();
	    		popup.confirm.yes();
	    	}
	    	public void saveAndClose()
	    	{
	    		uIMapBI.masterSearchEntry.uISaveAndCloseButton.click();
	    		popup.confirm.yes();
	    	}
	    	public void verifyNoRecordFoundAcknowlege()
	    	{
	    		popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
	    	}
	    	
	    }
	    public class MasterSearchEntryPeriodTab
	    {
	    	public void selectAtDateRange() 
	    	{
	    		objectIdentification.manualIdentify.selectDropDownOption(uIMapBI.masterSearchEntry.masterSearchEntryPeriodTab.uIDateRangeDropDown, BaseData.getBIModuleValue("DateRange"));
	    	}
	    	public void enterAtFromDate()
	    	{
	    		uIMapBI.masterSearchEntry.masterSearchEntryPeriodTab.uIDateFromEdit.sendKeys(BaseData.getBIModuleValue("FromDate"));
	    	}
	    	public void enterAtToDate()
	    	{
	    		uIMapBI.masterSearchEntry.masterSearchEntryPeriodTab.uIDateToEdit.sendKeys(BaseData.getBIModuleValue("ToDate"));
	    	}
	    }
		 public class DashBoardConfig {
			
			public void SelectRandomValueInGrid() {
				
				objectIdentification.randomIdentify.selectRandomGridRow(uIMapBI.dashBoardConfig.uIDashBoardGid);
			}

		}
		
		public class DashBoardEntry{
			
			public void verifyQaFormTabIsNotAvialable() {
				objectIdentification.manualIdentify.controlExist(uIMapBI.dashBoardEntry.uIQaFormTab);
				
			}
			
		}
	    

}
