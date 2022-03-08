package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dataAccess.BaseData;
import uIMaps.UIMapPopup;
import uIMaps.UIMapTow;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Tow {
	
	  public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public UIMapTow uIMapTow = new UIMapTow();   
	  public UIMapPopup uIMapPopup = new UIMapPopup();
	  public Popup popup = new Popup();
	 // public Randomized randomized =new Randomized(); 
	  public TowScreen towScreen;
	  public TowEntry towEntry;
	  public TowRotation towRotation;
	  public TowVendor towVendor;
	  public TowVendorEntry towVendorEntry;
	  public TowRefuse towRefuse;
	  public TowRefusePopUpScreen towRefusePopUpScreen;
	
	public Tow() {
		
		if (this.towScreen == null)
            this.towScreen = new TowScreen();
           
           if (this.towEntry == null)
               this.towEntry = new TowEntry();

           if (this.towRotation == null)
               this.towRotation = new TowRotation();
  
           if (this.towVendor == null)
             this.towVendor = new TowVendor();

           if (this.towVendorEntry == null)
               this.towVendorEntry = new TowVendorEntry();

           if (this.towRefuse == null)
               this.towRefuse = new TowRefuse();
           
           if (this.towRefusePopUpScreen == null)
               this.towRefusePopUpScreen = new TowRefusePopUpScreen();
           
	         
	}

	public void Reset()
	   {		   
 	uIMapTow=null;
	   }

    public  void switchToTowVendorEntry()
    {
        objectIdentification.windowHandle.switchToWindow("Tow Vendor Entry");

    }
    public  void switchToTowVendor()
    {
        objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmVendorSrch");

    }
    public  void switchToTowRotation()
    {
        objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmTowRotation");

    }
    public  void switchToTowScreen()
    {
        objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmTowSrch");

    }
    public  void switchToTowRefuseScreen()
    {
        objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmTowRefusalSrch");
    }
    public  void switchToTowEntryPopupScreen()
    {
        objectIdentification.windowHandle.switchToWindowUsingFormName("frmTowRefuse.aspx?");
    }
    public  void switchToTowEntry()
   {
       objectIdentification.windowHandle.switchToWindow("Tow Entry");

   }
    public  void switchToTowRefusePopupScreen()
    {
        objectIdentification.windowHandle.switchToWindowUsingFormName("frmTowRefuse.aspx?");
    }


// Tow Rotation Action Scripts
public class TowRotation
{

    public void verifyAtVendorNotFoundInVendorDropdown()
    {
        String vendor = uIMapTow.towRotation.uIVendorComboBox.getText();
        verify.ExpectedValueIsFalse(vendor.contains(BaseData.getTowModuleValue("Vendor")));
    }

    public void clickRefreshButton()
    {
       uIMapTow.towRotation.uIRefreshButton.click();
    }
	 public void selectAtTowZone() {
    	objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towRotation.uITowZoneComboBox, BaseData.getTowModuleValue("RotationTowZone"));
    	uIMapTow.towRotation.uITowZoneComboBox.sendKeys(Keys.TAB);
    }
     

    public void selectAtVendor()
    {
        uIMapTow.towRotation.uIVendorComboBox.sendKeys(BaseData.getTowModuleValue("Vendor"));
    }

    public void selectAtPosition()
    {
        uIMapTow.towRotation.uIPositionComboBox.sendKeys(BaseData.getTowModuleValue("Position"));
    }

    public void clickAddButton()
    {
        uIMapTow.towRotation.uIAddButton.click();
    }

    public void verifyAtPositionInGrid()
    {
        WebElement cell = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towRotation.uITowRotationTable, BaseData.getTowModuleValue("PositionNo"));

        WebElement position = objectIdentification.manualIdentify.getGridCell(uIMapTow.towRotation.uITowRotationTable, cell, "Position#");
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("PositionNo"), position.getText());
    }
	 public void verifyAtVendorNameInGrid() {
    	String TowVendorName = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towRotation.uITowRotationTable, BaseData.getTowModuleValue("VendorName")).toString();
    	verify.ExpectedPropertyValueIsEqual(TowVendorName, BaseData.getTowModuleValue("VendorName"));
    }
    public void verifyAtRotationTypeLAbel(int RotationLabel) {
    	if(RotationLabel==0) {
    	uIMapTow.towRotation.uIRotationTypeLabel.getText().
    	contains(BaseData.getTowModuleValue("RotationTypeLabel"));
    	}
    	else{
    		uIMapTow.towRotation.uIRotationTypeLabel.getText().
        	contains(BaseData.getTowModuleValue("RotationTypeLabel"+RotationLabel +""));
    		
    	}
    }

    public void save()
    {
        uIMapTow.towRotation.uISaveButton.click();
        popup.confirm.yes();
    }

    public void verify1003UpdateSuccessfulAckMessage()
    {
        popup.acknowledge.okWithExpectedMessage("1003 - Update Successful");
    }


}

// Tow Vendor Action Scripts
public class TowVendor
{

    public void kdjshakjd()
    {
        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorLastName"));
    }

    public void clickAddNewButton()
    {
        uIMapTow.towVendor.uIAddNewButton.click();
    }

    public void enterAtVendorCode()
    {
      uIMapTow.towVendor.uIVenderCodeEdit.sendKeys(BaseData.getTowModuleValue("VendorCode"));

    }

    public void clickSearchButton()
    {
        uIMapTow.towVendor.uISearchButton.click();

    }

     public void verify1011NoRecordFoundAckMsg()
    {      
        if (Playback.browserType.contains("Chrome"))
        {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
        }
        else
        popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
    
    }

    public void clickIncludeInactiveCheckbox()
    {
      uIMapTow.towVendor.uIIncludeInactiveCheckbox.click();

    }

    public void verifyAtVendorCodeInGrid()
    {
    WebElement Code = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorCode"));

    WebElement vendorCode = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable,Code, "Vendor Code");
    verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("VendorCode"), vendorCode.getText());

    }

    public void verifyAtVendorNameInGrid()
    {
        WebElement Name = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorName"));
        WebElement vendorName = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable, Name, "Vendor Name");
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("VendorName"), vendorName.getText());

    }

    public void verifyAtAddressInGrid()
    {
        WebElement add = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorName"));
        WebElement address = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable, add, "Address");
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Address"), address.getText());

    }

    public void enterContractDateAsCurrentDate()
    {
        uIMapTow.towVendor.uIContractDateEdit.sendKeys(Randomized.getCurrentDate());
   }


    public void verifyContractDateAsCurrentDate()
    {
      WebElement vendorCode = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorCode"));

     WebElement date =   objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable, vendorCode, "Contract Date");
        
     verify.ExpectedPropertyValueIsEqual(Randomized.removeStringByIndexCount(Randomized.getCurrentDate(),6,2), date.getText());

    }

    public void getContractDateByVendorCodeInGrid()
    {
        WebElement vendorCode = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorCode"));
        WebElement date = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable, vendorCode, "Contract Date");
        String expireDate = date.getText();
        Playback.setTestContextAttribute("ExpireDate", expireDate);
    }

    public void verifyExpireDateAs30DayfromContractDateInGrid(String expireDate)
    {
        WebElement vendorCode = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorCode"));

        WebElement date = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendor.uITowVendorTable, vendorCode, "Exp Date");
        String exDate =Randomized.removeStringByIndexCount(Randomized.getFutureDate(expireDate, 30),6, 2);
        verify.ExpectedPropertyValueIsEqual(exDate, date.getText());


    }

    public void clickRowByAtVendorCode()
    {
        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTow.towVendor.uITowVendorTable, BaseData.getTowModuleValue("VendorCode"));

    }


}


// Tow Vendor Entry Action Scripts
public class TowVendorEntry
{
	 public WebDriver driver;
     public Equipment equipment;
     public PhoneNumber phoneNumber;
     public AreaAssignment areaAssignment;
     public AuthDrivers authDrivers;

	public TowVendorEntry() {
		
		 if (this.equipment == null)
             this.equipment = new Equipment();
       
         if (this.phoneNumber == null)
             this.phoneNumber = new PhoneNumber();
    
         if (this.areaAssignment == null)
             this.areaAssignment = new AreaAssignment();

         if (this.authDrivers == null)
            this.authDrivers = new AuthDrivers();

		
	}
    public void clickSaveButton()
    {
        uIMapTow.towVendorEntry.uISaveButton.click();
    }

    public void save()
    {
        uIMapTow.towVendorEntry.uISaveButton.click();
        popup.confirm.yes();
    }

    public void verify7096EnterVendorCodeAckMsg()
    {
        popup.acknowledge.okWithExpectedMessage("(7096) Enter vendor code");

    }

    public void enterVendorCodeAs100()
    {
        uIMapTow.towVendorEntry.uIVendorCodeEdit.sendKeys("100");

    }

    public void verify7097EnterVendorNameAckMsg()
    {
        popup.acknowledge.okWithExpectedMessage("(7097) Enter vendor name");

    }

    public void enterAtVendorLastName()
    {
        uIMapTow.towVendorEntry.uILastNameEdit.sendKeys(BaseData.getTowModuleValue("VendorLastName"));
        uIMapTow.towVendorEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
    }

    public void selectBusinessName()
    {
        //Names.NameSearchHelpWindow.SelectName();

    }

    public void verifyLastNameInNameEntryScreen()
    {
        String lastName = uIMapTow.towVendorEntry.uILastNameEdit.getAttribute("value");
        uIMapTow.towVendorEntry.uINameInfoButton.click();
			/*
			 * Names.switchToNameEntry();
			 *  Names.NameEntry.VerifyLastName(lastName);
			 * Names.NameEntry.CloseTheScreen();
			 */
    }

    public void enterOfficeContactAs3DigitNUmber()
    {
        uIMapTow.towVendorEntry.uIOfficeContactEdit.click();
        uIMapTow.towVendorEntry.uIOfficeContactEdit.sendKeys("365");
   }

    public void verify5037InvalidPhoneNumber()
    {
        popup.acknowledge.okWithExpectedMessage("(5037) Invalid phone number");

    }

    public void clearOfficeContact()
    {
        uIMapTow.towVendorEntry.uIOfficeContactEdit.click();
        uIMapTow.towVendorEntry.uIOfficeContactEdit.clear();

    }
    public void enterOfficeContact()
    {
    	
    	uIMapTow.towVendorEntry.uIOfficeContactEdit.click();
       uIMapTow.towVendorEntry.uIOfficeContactEdit.sendKeys(Randomized.getRandomPhoneNumbers());
    }

    public void enterContractDateAsCurrentDate()
    {
        uIMapTow.towVendorEntry.uIContractDateEdit.sendKeys(Randomized.getCurrentDate());

    }

    public void enterContractExpiresAs30DayFutureFromContractDate()
    {
        uIMapTow.towVendorEntry.uIContractExpiresDateEdit.sendKeys((Randomized.getFutureDate(30)));

    }


    public void enterContractDateAs30DayPreviousFromCurrentdate()
    {
     uIMapTow.towVendorEntry.uIContractDateEdit.sendKeys(Randomized.getPreviousDate(30, "MM/dd/yyyy"));
    }

     public String getContractDate()
    {
      String contractDate =  uIMapTow.towVendorEntry.uIContractDateEdit.getAttribute("value");
      System.out.println(contractDate);
//      Playback.setTestContextAttribute("ContractDate",contractDate);
      return contractDate;
    }

    public void enterExpiresDteAsNextDayofContractDate()
    {
        uIMapTow.towVendorEntry.uIContractExpiresDateEdit.sendKeys(Randomized.getPreviousDate(29, "MM/dd/yyyy"));

    }


    public void clearContractDateAndTime()
    {
        uIMapTow.towVendorEntry.uIContractDateEdit.clear();
        uIMapTow.towVendorEntry.uIContractTimeEdit.clear();
    }
     public void clearContractExpiresDateAndTime()
    {
         uIMapTow.towVendorEntry.uIContractExpiresDateEdit.click();
        uIMapTow.towVendorEntry.uIContractExpiresDateEdit.clear();
        uIMapTow.towVendorEntry.uIContractExpiresTimeEdit.click();
        uIMapTow.towVendorEntry.uIContractExpiresTimeEdit.clear();
    }

    public void clickInactiveDateTimeCheckbox()
    {
        uIMapTow.towVendorEntry.uIInactiveCheckbox.click();
    }

    public void verifyCurrentDateAutoPopulatesInInactiveCheckbox()
    {
     String date = uIMapTow.towVendorEntry.uIInactiveDateTimeEdit.getAttribute("value");
//     String inactiveDate =Randomized.removeCharAt(date,10);
//     verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), inactiveDate);
     verify.ExpectedValueIsTrue(date.contains(Randomized.getCurrentDate()));

    }

    public void verify1002AdditionSuccessfulFooterMessage()
    {
      String AdditionMessage = uIMapTow.towVendorEntry.uIBottomLeftSideStatusBar.getText();
      verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
    }

    public void verify1003UpdateSuccessfulFooterMessage()
    {
        String AdditionMessage = uIMapTow.towVendorEntry.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
  }
    public void verify1051AreaAsignmentAckMessage()
    {
        popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Area Assignment Tab. You must save or reset.");
    }

    public void verify1051PhoneNumberAckMessage()
    {
        popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Phone Number Tab. You must save or reset.");
    }

    public void verify1051AuthDriversAckMessage()
    {
        popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Auth Drivers Tab. You must save or reset.");
    }

     public void verifyAtPositionInRotationPositionFieldGreyOut()
    {
      
        String position = uIMapTow.towVendorEntry.uIRotationPOsitionComboBox.getAttribute("value");
        String rotaPosition =Randomized.insertStringByIndex(position,3," - 1");
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("PositionNo"), rotaPosition);
        verify.ExpectedValueIsTrue(!uIMapTow.towVendorEntry.uIRotationPOsitionComboBox.isEnabled());
    }

    public void unCheckInactiveCheckbox()
    {
      if( uIMapTow.towVendorEntry.uIInactiveCheckbox.isSelected());
      uIMapTow.towVendorEntry.uIInactiveCheckbox.click();
   }

    public void clickEquipmentTab()
    {
        uIMapTow.towVendorEntry.uIEquipmentTab.click();
    }

    public void clickPhoneNumberTab()
    {
        uIMapTow.towVendorEntry.uIPhoneNumberTab.click();
    }

    public void clickAreaAssignmentTab()
    {
        uIMapTow.towVendorEntry.uIAreaAssignmentTab.click();
    }
	  public void clickAreaZoneAssignmentTab()
    {
        uIMapTow.towVendorEntry.uIAreaZoneAssignmentTab.click();
    }

    public void clickAuthDriversTab()
    {
        uIMapTow.towVendorEntry.uIAuthDriversTab.click();
    }
		public void enterAtOfficeContact() 
	{
		uIMapTow.towVendorEntry.uIOfficeContactEdit.sendKeys(BaseData.getTowModuleValue("OfficeContact"));
	}

public void verifyAtLastName()
{
	String attribute = uIMapTow.towVendorEntry.uILastNameEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("LastName")));
}
public void saveNClose() 
{
	  uIMapTow.towVendorEntry.uISaveNCloseButton.click();
      popup.confirm.yes();
}
	public void enterAtVendorCode()
{
    uIMapTow.towVendorEntry.uIVendorCodeEdit.sendKeys(BaseData.getTowModuleValue("VendorCode"));
    uIMapTow.towVendorEntry.uIVendorCodeEdit.sendKeys(Keys.TAB);
}
public void enterAtTowVendorNameID() 
{
    uIMapTow.towVendorEntry.uITowVendorNameTypeEdit.sendKeys(BaseData.getTowModuleValue("NameID").substring(0, 1));
    uIMapTow.towVendorEntry.uITowVendorNameIDEdit.sendKeys(BaseData.getTowModuleValue("NameID").substring(2));
    uIMapTow.towVendorEntry.uITowVendorNameIDEdit.sendKeys(Keys.TAB);

 

}
public void clickPrintIcon() 
{
    uIMapTow.towVendorEntry.uIPrintIcon.click();    
}
public void enterAtOfficeContactNo() {
	Playback.controlReadyThreadWait();
	uIMapTow.towVendorEntry.uIOfficeContactEdit.click();
	uIMapTow.towVendorEntry.uIOfficeContactEdit.sendKeys(BaseData.getTowModuleValue("OfficeContactNo"));
	
}
 

  

    

}

public class Equipment
{

    public void enterTowEquipmentQuantityAs1()
    {
       uIMapTow.towVendorEntry.equipment.uIEquipmentQuantityEdit.sendKeys("1");
    }

    public void enterTowEquipmentQuantityAs2()
    {
        uIMapTow.towVendorEntry.equipment.uIEquipmentQuantityEdit.sendKeys("2");
    }

    public void enterCodeAs01()
    {
        uIMapTow.towVendorEntry.equipment.uIEquipmentCodeEdit.sendKeys("01");
    }

    public void enterCodeAs02()
    {
        uIMapTow.towVendorEntry.equipment.uIEquipmentCodeEdit.sendKeys("02");
    }

    public void clickAddButton()
    {
        uIMapTow.towVendorEntry.equipment.uIAddButton.click();

    }
    public void clickClearButton()
    {
        uIMapTow.towVendorEntry.equipment.uIClearButton.click();
    }

    public void verify1019DuplicationDataFoundAckMsg()
    {
        popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
    }

    public void clickInactiveCheckbox()
    {
        uIMapTow.towVendorEntry.equipment.uIInactiveCheckbox.click();

    }

    public void verifyInactiveDateAsCurrentDateInGridByEquipmentCode()
    {
        WebElement code = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendorEntry.equipment.uIEquipmentTable, "02");

        WebElement inactiveDate = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendorEntry.equipment.uIEquipmentTable, code, "Inactive");
        verify.ExpectedValueIsTrue(inactiveDate.getText().contains(Randomized.getCurrentDate()));
    }



}

public class AreaAssignment
{

    public void selectAreaAsPatrolArea1()
    {
     
       objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towVendorEntry.areaAssignment.uIPatrolAreaComboBox, 
    		   BaseData.getTowModuleValue("TowZone"));
    }
    public void selectAtTowZone()
    {
    	objectIdentification.manualIdentify.selectDropDownOption( uIMapTow.towVendorEntry.areaAssignment.uIPatrolAreaComboBox,
    			BaseData.getTowModuleValue("TowZone"));
    	
      
    }

    public void selectAreaAsPatrolArea2()
    {
    	objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towVendorEntry.areaAssignment.uIPatrolAreaComboBox, 
    			BaseData.getTowModuleValue("TowZone"));
       
    }

    public void clickAddButton()
    {
        uIMapTow.towVendorEntry.areaAssignment.uIAddButton.click();

    }

    public void verify1019DuplicationDataFoundAckMsg()
    {
        popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
    }

public void verify1019DuplicationDataFoundAckMsgFor45()
    {
        popup.acknowledge.okWithExpectedMessage("(1019)Duplication Of Data Found");
    }


  public void clickClearButton()
  {
        uIMapTow.towVendorEntry.areaAssignment.uIClearButton.click();
    }
	public void veifyTowZoneInGrid() {
 String Towzone = objectIdentification.manualIdentify.getGridRowByCellInnerText
			( uIMapTow.towVendorEntry.areaAssignment.uITowZoneGrid,BaseData.getTowModuleValue("AssignedZone")).getText();
	System.out.println(Towzone);
verify.ExpectedPropertyValueIsEqual(Towzone, BaseData.getTowModuleValue("AssignedZone"));
		
}


}

public class AuthDrivers
{

    public void enterAtDriverLastName()
    {
       uIMapTow.towVendorEntry.authDrivers.uIDriverLastNameEdit.sendKeys(BaseData.getTowModuleValue("DriverLastName"));

    }

    public void enterAtDriverFirstName()
    {
        uIMapTow.towVendorEntry.authDrivers.uIDriverFirstNameEdit.sendKeys(BaseData.getTowModuleValue("DriverFirstName"));
        uIMapTow.towVendorEntry.authDrivers.uIDriverFirstNameEdit.sendKeys(Keys.TAB);

    }

    public void selectName()
    {
        //Names.NameSearchHelpWindow.SelectName();
    }

    public void enterEmployedAsCurrrentDate()
    {
       uIMapTow.towVendorEntry.authDrivers.uIEmployedDateEdit.sendKeys(Randomized.getCurrentDate());
    }

    public void enterEmployeedDateAs40DaysPreviousFromCurrentDate()
    {
        uIMapTow.towVendorEntry.authDrivers.uIEmployedDateEdit.sendKeys(Randomized.getPreviousDate(40, "MM/dd/yyyy"));
    }

    public void enterEmployeedDateAs2DaysPreviousFromCurrentDate()
    {
        uIMapTow.towVendorEntry.authDrivers.uITerminatedDateEdit.sendKeys(Randomized.getPreviousDate(2, "MM/dd/yyyy"));
    }

    public void clickAddButton()
    {
        uIMapTow.towVendorEntry.authDrivers.uIAddButton.click();
    }
    
    public void verify1019DuplicationDataFoundAckMsg()
    {
        popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
    }

    public void clickClearButton()
    {
    uIMapTow.towVendorEntry.authDrivers.uIClearButton.click();
    }

    public void clickShowAllCheckbox()
    {
        uIMapTow.towVendorEntry.authDrivers.uIShowAllCheckBox.click();
    }

    public void verifyAtTerminatedEmployeeInGrid()
    {
        Playback.gridLoadThreadWait();
       WebElement terminated = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendorEntry.authDrivers.uIAuthDriverTable, BaseData.getTowModuleValue("TerminatedEmployee"));
       WebElement terEmployee = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendorEntry.authDrivers.uIAuthDriverTable, terminated, "Name");
       verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("TerminatedEmployee"), terEmployee.getText());
    }

    public void clickDeleteIconInGrid()
    {
        WebElement name = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towVendorEntry.authDrivers.uIAuthDriverTable, BaseData.getTowModuleValue("TerminatedEmployee"));
      WebElement deleteName = objectIdentification.manualIdentify.getGridCell(uIMapTow.towVendorEntry.authDrivers.uIDeleteIconGridButton,name,"X");
       deleteName.click();
    }

      public void verifyConfirmDeleteMessage()
    {
        if(Playback.browserType.contains("Chrome"))
            popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
        else
       popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
        
    }

    public void verifyAtDeletedEmployeeNotFoundInGrid()
    {
        List<WebElement> name = objectIdentification.manualIdentify.getGridTableColumnCells(uIMapTow.towVendorEntry.authDrivers.uIAuthDriverTable,"Name");
        verify.ExpectedValueIsFalse(name.toString().contains(BaseData.getTowModuleValue("TerminatedEmployee")));
   }

}

public class PhoneNumber
{

    public void selectPhoneAsHome()
    {
        objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towVendorEntry.phoneNumber.uIPhoneComboBox, "H - Home");
        uIMapTow.towVendorEntry.phoneNumber.uIPhoneComboBox.sendKeys(Keys.TAB);
    }

    public void enterThreeDigit()
    {
      uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit.click();
      uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
    }

    public void clickAdddButton()
    {
        uIMapTow.towVendorEntry.phoneNumber.uIAddButton.click();
    }

    public void verify5037InvalidPhoneNumberAckMessage()
    {
        popup.acknowledge.okWithExpectedMessage("(5037) Invalid phone number");
    }

    public void clearPhoneNumber()
    {
         uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit.click();
        uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit.clear();
    }

    public void enterAtPhoneNumber()
    {
      
        Playback.controlReadyThreadWait();
        objectIdentification.manualIdentify.setFocusElement(uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit);
        objectIdentification.actionBuilder.SendKeys(uIMapTow.towVendorEntry.phoneNumber.uIPhoneEdit, BaseData.getTowModuleValue("PhoneNo"));
 
    }

     public void verify5015ContactInfoAlreadyExistAckMsg()
    {
    	        
        popup.acknowledge.okWithExpectedMessage("(5015) Contact Info already exists H "+ BaseData.getTowModuleValue("PhoneNo"));
               
    }


    public void clickClearButton()
    {
        uIMapTow.towVendorEntry.phoneNumber.uIClearButton.click();
    }


}


//Tow Screen Action Scripts
public class TowScreen
{
  
    public void clickAddNewButton()
    {
        uIMapTow.towScreen.uIAddNewButton.click();
    }

    public void enterAtPlateNo()
   {
       uIMapTow.towScreen.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNo").substring(0, 6));
       uIMapTow.towScreen.uIPlateStateComboBox.sendKeys(BaseData.getTowModuleValue("PlateNo").substring(7));
   }
    public void enterAtPlateNumber()
    {
        uIMapTow.towScreen.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNumber"));
    }
 
    public void enterTowRequestedFromAsCurrentDate()
    {
        uIMapTow.towScreen.uITowRequestDateFromEdit.sendKeys(Randomized.getCurrentDate());
    }

    public void enterTowRequestedToAsCurrentDate()
    {
        uIMapTow.towScreen.uITowRequestDateToEdit.sendKeys(Randomized.getCurrentDate());
    }

    public void clickSearchButton()
    {
        uIMapTow.towScreen.uISearchButton.click();
    }

    public void clickBackButton()
    {
        uIMapTow.towScreen.uIBackButton.click();
    }

    public void selectRow()
    {
        objectIdentification.randomIdentify.selectRandomGridRow();
    }


    public void clickRowByAtCallNo()
    {
        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("CallNo"));
    }
    
    public void verifyAtCallNoTowRequestedDateAsCurrentDate()
    {
        WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("CallNo"));

        WebElement date = objectIdentification.manualIdentify.getGridCell(uIMapTow.towScreen.uITowTable, row, "Tow Request Date");
 
//        verify.ExpectedPropertyValueIsEqual(Randomized.removeStringByIndexCount(Randomized.getCurrentDate(),6, 2), Randomized.removeCharAt(date.getText().toString(),8));
        verify.ExpectedValueIsTrue(date.getText().contains(Randomized.getCurrentDate("MM/dd/yy")));
    }


    public void selectAtContractor()
    {
        uIMapTow.towScreen.uIContractorComboBox.sendKeys(BaseData.getTowModuleValue("Contractor"));

    }

    public void selectAtMake()
    {
        uIMapTow.towScreen.uIMakeCodeEdit.sendKeys(BaseData.getTowModuleValue("Make"));
    }

    public void enterAtOfficer()
    {
        uIMapTow.towScreen.uIOfficerCodeEdit.sendKeys(BaseData.getTowModuleValue("Officer"));
    }

    public void enterAtCallNo()
    {
        uIMapTow.towScreen.uICallYearEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(0, 2));
        uIMapTow.towScreen.uICallNumberEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(3));
        uIMapTow.towScreen.uICallNumberEdit.sendKeys(Keys.TAB);
    }

    public void selectAtTowedFrom()
    {
        new Select(uIMapTow.towScreen.uITowedFromComboBox).selectByVisibleText(BaseData.getTowModuleValue("TowedFrom"));
   
    }

    public void enterAtPremises()
    {
        uIMapTow.towScreen.uITowedFromPremiseEdit.sendKeys(BaseData.getTowModuleValue("Premise"));
    }

    public void enterAtStreet()
    {
        uIMapTow.towScreen.uITowedFromStreetEdit.sendKeys(BaseData.getTowModuleValue("Street"));
    }

    public void clickNotReleasedOnlyCheckbox()
    {
        uIMapTow.towScreen.uINotReleasedOnlyCheckbox.click();
    }

    public void clickReleasedCheckbox()
    {
        uIMapTow.towScreen.uIReleasedCheckbox.click();
    }

    public void clickNoPlateCheckbox()
    {
        uIMapTow.towScreen.uINoPlateCheckbox.click();
    }

    public void verifyAtCallNoInGrid(int rowIndex)
    {
    	verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("CallNo"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapTow.towScreen.uITowTable, "Call#", rowIndex));
    } 

    public void enterAtVinNo()
    {
    	uIMapTow.towScreen.uIVinNoEdit.click();
    	uIMapTow.towScreen.uIVinNoEdit.sendKeys(BaseData.getTowModuleValue("VinNo"));;
    } 
    
    public void clickHoldReasonCheckbox()
    {
        uIMapTow.towScreen.uIHoldReasonCheckbox.click();
    }



public void verifyHoldReaonCheckBoxIsSelected() {
                   verify.ExpectedValueIsTrue
                   (uIMapTow.towScreen.uIHoldReasonCheckbox.isSelected());
                   
          }

public void selectAtHoldReasonDropDown() {
    
    Playback.controlReadyThreadWait();
    uIMapTow.towScreen.uIHoldReasonDropDownInput.click();
objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(uIMapTow.towScreen.uIHoldReasonDropDown,BaseData.getTowModuleValue("HoldReason"));
    Playback.threadWait(1500);
}
public void selectRowByAtTowNo()
{
    objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("TowNo"));
}


public void verifyHoldCheckBoxSelected()
{
verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIHoldCheckbox.isSelected());
}

public void verifyAtHoldReasonInGrid(int rowIndex) {
    
objectIdentification.manualIdentify.getGridCellInnerText(uIMapTow.towScreen.uITowTable, "Reason", rowIndex);
}

public void selectTowReasonAsCancel() 
{
    objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towScreen.uITowReasonComboBox, "Cancel");
    
}
public void verifyAtRowViewedAsGrayColor()
{
    //verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("TowNo")).getAttribute("class").contains("gridrowclrGray"));    
WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("TowNo"));
String cssValue = gridRowByCellInnerText.getCssValue("color");
System.out.println(cssValue);
verify.ExpectedValueIsTrue(cssValue.contains("rgba(128, 128, 128, 1)"));
    
}
public void verifyAtTowNoInGrid()
{
    String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("TowNo")).getText();
    verify.ExpectedValueIsTrue(text.contains(BaseData.getTowModuleValue("TowNo")));
}

public void enterAtTowNo() 
{
	uIMapTow.towScreen.uITowTypeEdit.sendKeys(BaseData.getTowModuleValue("TowNo").substring(0,2));
	uIMapTow.towScreen.uITowNoEdit.sendKeys(BaseData.getTowModuleValue("TowNo").substring(3));
	uIMapTow.towScreen.uITowNoEdit.sendKeys(Keys.TAB);
}

public void clickResetButton() 
{
	uIMapTow.towScreen.uIResetButton.click();
	
}
public void verifyAtRowViewedAsGrayColorUsingCaseNo()
{
	//verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("TowNo")).getAttribute("class").contains("gridrowclrGray"));	
WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, BaseData.getTowModuleValue("CaseNo"));
String cssValue = gridRowByCellInnerText.getCssValue("color");
System.out.println(cssValue);
verify.ExpectedValueIsTrue(cssValue.contains("rgba(128, 128, 128, 1)"));
	
}

public void verifyAtActiveTowNoRowViewedAsGrayColor(String TowNo)
{
	WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towScreen.uITowTable, TowNo);
	String cssValue = gridRowByCellInnerText.getCssValue("color");
	System.out.println(cssValue);
	verify.ExpectedValueIsTrue(cssValue.contains("rgba(128, 128, 128, 1)"));
}

}

// Tow Entry Action Scripts

public class TowEntry
 {
	
	public WebDriver driver;
    public TowTab towTab;
    public Owner owner;
    public Driver mDriver;
    public DamageMissing damageMissing;
    public PropertyInventory propertyInventory;
    public Forfeiture forfeiture;
    public Release release;
    public TowDispositionTab towDispositionTab;
    public TowNotesTab towNotesTab;
    public AttachmentsTab attachmentsTab = null;
    
	public TowEntry()
	{
 	   if (this.towTab == null)
           this.towTab = new TowTab();
             
       if (this.owner == null)
           this.owner = new Owner();
                 
       if (this.mDriver == null)
           this.mDriver = new Driver();
              
       if (this.damageMissing == null)
           this.damageMissing = new DamageMissing();

       if (this.propertyInventory == null)
           this.propertyInventory = new PropertyInventory();
                 
       if (this.forfeiture == null)
           this.forfeiture = new Forfeiture();
              
       if (this.release == null)
          this.release = new Release();
           
       if (this.towDispositionTab == null)
           this.towDispositionTab = new TowDispositionTab();
              
       if (this.towNotesTab == null)
           this.towNotesTab = new TowNotesTab();
       
       if (this.attachmentsTab == null)
           this.attachmentsTab = objectIdentification.new AttachmentsTab();
	}
	

    public void clickSaveButton()
    {
        uIMapTow.towEntry.uISaveButton.click();
    }
    public void clickRefreshButton()
    {
        uIMapTow.towEntry.uIRefreshButton.click();
    }
    

    public void clickNoPlateCheckbox()
    {
        uIMapTow.towEntry.uINoPlateCheckbox.click();
    }

    public void verify7039EnterCallAckMsg()
    {
       // popup.acknowledge.okWithExpectedMessage("(7093) Enter Call #");
    	popup.acknowledge.okWithExpectedMessage("(7093) Enter Call No");
    }

    public void enterAtCallNo()
    {
        uIMapTow.towEntry.uICallYearEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(0, 2));
        uIMapTow.towEntry.uICallNumberEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(3));
        uIMapTow.towEntry.uICallNumberEdit.sendKeys(Keys.TAB);
    }

    public void enterAtPlateNumber()
    {
        uIMapTow.towEntry.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNumber"));
    }

    public void selectAtPlateState()
    {
        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(BaseData.getTowModuleValue("PlateState"));
        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(Keys.TAB);
    }
  
    public void verifyAtYear()
    {
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Year"), uIMapTow.towEntry.uIYearEdit.getAttribute("value"));
    }

    public void verifyAtMake()
    {
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Make"), uIMapTow.towEntry.uIMakeEdit.getAttribute("value"));
    }

    public void verifyAtModel()
    {
    	System.out.println(uIMapTow.towEntry.uIModelEdit.getAttribute("value"));
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Model"), uIMapTow.towEntry.uIModelEdit.getAttribute("value"));
    }

    public void verifyAtColor()
    {
    	System.out.println(uIMapTow.towEntry.uIColorEdit.getAttribute("value"));
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Color"), uIMapTow.towEntry.uIColorEdit.getAttribute("value"));
    }
    public void clickTowTab()
    {
        uIMapTow.towEntry.uITowTab.click();
    }
  

    public void clickOwnerTab()
    {
        uIMapTow.towEntry.uIOwnerTab.click();
    }

    public void clickDriverTab()
    {
        uIMapTow.towEntry.uIDriverTab.click();
    }

    public void switchToDamageMissingTab()
    {
        uIMapTow.towEntry.uIDamageMissingTab.click();
        Playback.pageLoadThreadWait();
        objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
    }

    public void switchToPropertyInventoryTab()
    {
        uIMapTow.towEntry.uIPropertyInventoryTab.click();
        Playback.pageLoadThreadWait();
        objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
    }

    public void switchToTowNotesTab()
    {
        uIMapTow.towEntry.uINotesTab.click();
        Playback.pageLoadThreadWait();
        objectIdentification.windowHandle.switchToFrame("frmNotes");
    }

    public void clickPropertyInventoryTab()
    {
        uIMapTow.towEntry.uIPropertyInventoryTab.click();
    }

    public void clickForfeitureTab()
    {
        uIMapTow.towEntry.uIForfeitureTab.click();
    }

    public void clickReleaseTab()
    {
        uIMapTow.towEntry.uIReleaseTab.click();
    }

    public void clickDispositionTab()
    {
        uIMapTow.towEntry.uIDispositionTab.click();
    }

    public void clickNotesTab()
    {
        uIMapTow.towEntry.uINotesTab.click();
    }

    public void enterReason()
    {
        uIMapTow.towEntry.uIReasonEdit.sendKeys(Randomized.randomAlphanumeric(10));
    }

    public void save()
    {
        Playback.waitForControlReady();
        uIMapTow.towEntry.uISaveButton.click();
        popup.confirm.yes();
    }

    public void saveNClose()
    {
       Playback.waitForControlReady();
       uIMapTow.towEntry.uISaveNCloseButton.click();
       popup.confirm.yes();
       Playback.pageLoadThreadWait();
    }

    public void verify1003UpdateSuccessfulFooterMessage()
    {
        String AdditionMessage = uIMapTow.towEntry.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
    }

    public void verify1051AckMsgInDamageMissingTab()
    {
        popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Damage/Missing Tab. You must save or reset.");
    }

    public void verify1051AckMsgInPropertyInventoryTab()
    {
        popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Property Inventory Tab. You must save or reset.");
    }

     public void verify7252ConfirmMessage()
    {
        popup.confirm.yesWithExpectedMessage("(7252) Do you want to enter the vehicle as towed without a Plate #? Select YES to continue; select NO to enter a Plate #.");
    }


    public void verifyRedColorHoldLabel()
    {
        // using color code to get the value and verify
        verify.ExpectedValueIsTrue(uIMapTow.towScreen.uIHoldStatusBar.getCssValue("color").contains("255, 0, 0"));
    }

    public void verifyHoldLabelDisappears()
    {
        verify.ExpectedValueIsFalse(uIMapTow.towScreen.uIHoldStatusBar.getText().contains("Hold"));

    }
      
    public void verifyPlateVinGreyOut()
    {
        verify.ExpectedPropertyValueIsEqual(uIMapTow.towEntry.uIPlateNumberEdit.getAttribute("class"), "textboxInactive");
    }

    public void closeTheScreen()
    {
        objectIdentification.windowHandle.closeTheScreen();
    }
    
    public void verifyCallIBubbleIsDisplayed()
    {
    	Playback.pageLoadThreadWait();
    	verify.ExpectedValueIsTrue(uIMapTow.towEntry.uICallInfoIcon.isDisplayed());
    }
    public void verifyAtCaseNo()
    {
    	String attribute = uIMapTow.towEntry.uICaseNoYear.getAttribute("value");
    	String attribute2 = uIMapTow.towEntry.uICaseNo.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("CaseNo").substring(0, 1)));
    	verify.ExpectedValueIsTrue(attribute2.contains(BaseData.getTowModuleValue("CaseNo").substring(3)));
    }

    public void verifyAtCallDateTime() {

        String date = uIMapTow.towEntry.uICallDateEdit.getAttribute("value");
        verify.ExpectedPropertyValueIsEqual(date, BaseData.getTestContextData("CallDate"));
        String time = uIMapTow.towEntry.uICallTimeEdit.getAttribute("value");
        verify.ExpectedPropertyValueIsEqual(time, BaseData.getTestContextData("CallTime"));

			}
			public void selectEquipmentUsed() {
			       objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.uIEquipmentUsedDropdown,
			                                        "Tow Truck - Light");
			
			}
			public void selectWrecker() {
			        Playback.pageLoadThreadWait();
			        uIMapTow.towEntry.uIWreckerDropdown.click();
			        Playback.pageLoadThreadWait();
			        objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.uIWreckerDropdown,
			                                        "2 - PhoenixTowAgency");
			}
			public void tabTowRequestDateTime() {
			        uIMapTow.towEntry.uITowRequestDate.sendKeys(Keys.TAB);
			        Playback.controlReadyThreadWait();
			
			}
			
			public void verifyAtCallNo() {
			        String callYr = uIMapTow.towEntry.uICallYearEdit.getAttribute("value");
			        String callNo = uIMapTow.towEntry.uICallNumberEdit.getAttribute("value");
			        verify.ExpectedPropertyValueIsEqual(callYr + "-" + callNo, BaseData.getTestContextData("CallNo"));
			        uIMapTow.towEntry.uICallNumberEdit.sendKeys(Keys.TAB);
			}

    public void verify1002AdditionSuccessfulFooterMessage()
    {
        String AdditionMessage = uIMapTow.towEntry.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
    }


	   public void switchToAttachmentTab()
		        {
		   			uIMapTow.towEntry.uIAttachmentsTab.click();
		            Playback.threadWait(3000);
		            objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		            Playback.waitForPageLoad();
		        }


	public void clickCallInfoIcon() {
		Playback.threadWait(3000);
		uIMapTow.towEntry.uICallInfoIcon.click();
		
	}

public void verifyYearIsEnabled() 
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIYearEdit.isEnabled());
	} 
	
	public void verifyMakeIsEnabled()
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIMakeEdit.isEnabled());
	}

 

   	public void verifyModelIsEnabled()
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIModelEdit.isEnabled());
	}
    public void verifyColorsIsEnabled()
    {
        verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIColorDropDown.isEnabled());
    }
    
    public void verifyVINIsEnabled()
    {
        verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIVINEdit.isEnabled());
    }
    
    public void verifyStyleIsEnabled()
    {
        verify.ExpectedValueIsTrue(uIMapTow.towEntry.uIStyleEdit.isEnabled());
    }
    public void enterAtYear()
    {
        uIMapTow.towEntry.uIYearEdit2.sendKeys(BaseData.getTowModuleValue("Year"));
        uIMapTow.towEntry.uIYearEdit2.sendKeys(Keys.TAB);
    }
    public void enterAtVINNo()
    {
        uIMapTow.towEntry.uIVINEdit.sendKeys(BaseData.getTowModuleValue("VINNo"));
        uIMapTow.towEntry.uIVINEdit.sendKeys(Keys.TAB);
    }

    public void verify7251ConfirmMessage()
    {
        popup.confirm.yesWithExpectedMessage("(7251) Do you want to reposition the vendor?");
    }
	public void verifyLocationOfVehicleKeyIsDisplayed()
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.uILocationOfVehicleKeyDropDown.isDisplayed());
	}


	public void selectLocationOfVehicleKeyAsAdd2390()
	{
		objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.uILocationOfVehicleKeyDropDown, "--Add 2390 --");
		
	}
	
	public void selectAtLocationOfVehicleKey()
	{
		objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.uILocationOfVehicleKeyDropDown, BaseData.getTowModuleValue("LocationOfVehicleKey"));
		
	}


	public void selectAtLocationOfVehicleKey1()
	{
		objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.uILocationOfVehicleKeyDropDown, BaseData.getTowModuleValue("LocationOfVehicleKey1"));		
	}


	public void verifyCreateCallCheckBoxIsDisplayed()
	{
	verify.ExpectedValueIsTrue(uIMapTow.towEntry.uICreateCallCheckBox.isDisplayed());

	}

	public void clickCreateCallCheckBox()
	{
	uIMapTow.towEntry.uICreateCallCheckBox.click();

	}

    public void selectAtPlateState1()
    {
        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(BaseData.getTowModuleValue("PlateState1"));
        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(Keys.TAB);
    }


	public void enterAtPlateNumber2()
    {
        uIMapTow.towEntry.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNumber2"));
    }


	 public void selectAtPlateState2()
	    {
	        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(BaseData.getTowModuleValue("PlateState2"));
	        uIMapTow.towEntry.uIPlateStateComboBox.sendKeys(Keys.TAB);
	    }
	public String readTowNo()
	{
		String TowYear = uIMapTow.towEntry.uITowNoYearEdit.getAttribute("value");
		String TowNumber = uIMapTow.towEntry.uITowNoEdit.getAttribute("value");
		String TowNo = TowYear +"-"+ TowNumber;
		return TowNo;
	}


	public void enterAtPlateNumber3()
	{
		uIMapTow.towEntry.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNumber3"));
		
	}


	public void verifyCreateCallCheckBoxIsNotDisplayed()
	{
		verify.ExpectedValueIsTrue(!uIMapTow.towEntry.uICreateCallCheckBox.isDisplayed());
		
	}
public void clickPrintIcon() 
	{
		uIMapTow.towEntry.uIPrintIcon.click();
		
	    }

	 public void enterAtPlateNumber1()
	    {
	        uIMapTow.towEntry.uIPlateNumberEdit.sendKeys(BaseData.getTowModuleValue("PlateNumber1"));
	    }


	public void clickPlateInfoIcon() {
		uIMapTow.towEntry.uIPlateVinInfoIcon.click();
		
	}


	public void verifyAtPlateVInNo() {
		
		String attribute = uIMapTow.towEntry.uIPlateNumberEdit.getAttribute("value");
		System.out.println(attribute+"value");
	
		verify.ExpectedValueIsTrue(attribute.
				contains(BaseData.getTowModuleValue("PlateNumber")));
		
	}


	public void VerifyAtState() {
		String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.uIPlateStateComboBox);
	verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(BaseData.getTowModuleValue("PlateState")));
		
	}

 }
 

public class TowTab
{

    public void selectAtEquipmentUsed()
    {
        uIMapTow.towEntry.towTab.uIEquipmentUsedComboBox.sendKeys(BaseData.getTowModuleValue("EquipmentUsed"));
        uIMapTow.towEntry.towTab.uIEquipmentUsedComboBox.sendKeys(Keys.TAB);
    }

    public void selectEquipment()
    {
        objectIdentification.randomIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uIEquipmentUsedComboBox);
        uIMapTow.towEntry.towTab.uIEquipmentUsedComboBox.sendKeys(Keys.TAB);
    }

    public void tabTowRequestDate()
    {
    	Playback.controlReadyThreadWait();
    	  uIMapTow.towEntry.towTab.uITowRequestDateEdit.click();
        uIMapTow.towEntry.towTab.uITowRequestDateEdit.sendKeys(Keys.TAB);
    }

    public void tabTowCompletedDate()
    {
        uIMapTow.towEntry.towTab.uITowedCompletedDateEdit.sendKeys(Keys.TAB);
    }

    public void verifyCurrentDateAutoPopulatesInTowRequestedDate()
    {

        verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapTow.towEntry.towTab.uITowRequestDateEdit.getAttribute("value"));

    }

    public void selectAtWrecker()
    {
        objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uIWreckerComboBox, BaseData.getTowModuleValue("Wrecker"));
        Playback.threadWait();
        uIMapTow.towEntry.towTab.uIWreckerComboBox.sendKeys(Keys.TAB);
      
    }

    public void selectWrecker()
    {
        objectIdentification.randomIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uIWreckerComboBox);
        uIMapTow.towEntry.towTab.uIWreckerComboBox.sendKeys(Keys.TAB);
    }

    public void selectTowType()
    {
        objectIdentification.randomIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uITowTypeComboBox);
    }

    public void selectTowReasonAsAbandoned()
    {
        uIMapTow.towEntry.towTab.uITowReasonComboBox.sendKeys("Abandoned");
    }

    public void verifyAtNextWrecker()
    {

        String uISelectedItem=  objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.towTab.uIWreckerComboBox);
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("NextWrecker"), uISelectedItem);
    }

    public void verifyAtAddress()
    {
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Address"), uIMapTow.towEntry.towTab.uIAddressEdit.getAttribute("value"));
    }

    

    public void enterAtTowedFrom()
    {
        uIMapTow.towEntry.towTab.uITowedFromEdit.sendKeys(BaseData.getTowModuleValue("TowedFrom"));
        uIMapTow.towEntry.towTab.uITowedFromEdit.sendKeys(Keys.TAB);
    }

     public void clickTowedToCheckbox()
    {
    	uIMapTow.towEntry.towTab.uITowedToCheckBox.click();
       verify.ExpectedValueIsTrue(uIMapTow.towEntry.towTab.uITowedToCheckBox.getAttribute("checked").contains("true"));
       Playback.controlReadyThreadWait();
    }
    public void verifyAtAuthDriverInTowDriverDropdown()
    {
        String item = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.towTab.uITowDriverComboBox);
        objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uITowDriverComboBox, BaseData.getTowModuleValue("AuthDriver"));
    }

    public void verifyCurrentDateAutoPopulatesInTowCompletedDate()
    {
        verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapTow.towEntry.towTab.uITowedCompletedDateEdit.getAttribute("value"));
    }

    public void enterAtOfficer()
    {
        uIMapTow.towEntry.towTab.uIOfficerCodeEdit.sendKeys(BaseData.getTowModuleValue("Officer"));
        uIMapTow.towEntry.towTab.uIOfficerCodeEdit.sendKeys(Keys.TAB);
    }

    public void tabNotifiedDateTime()
    {
        uIMapTow.towEntry.towTab.uINotifiedDateEdit.sendKeys(Keys.TAB);
        uIMapTow.towEntry.towTab.uINotifiedTimeEdit.sendKeys(Keys.TAB);
    }

    public void verifyCurrentDateAutoPopulatesInNotifiedDate()
    {
        verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapTow.towEntry.towTab.uINotifiedDateEdit.getAttribute("value"));
    }

    public void selectAtMethod()
    {
        uIMapTow.towEntry.towTab.uIMethodComboBox.sendKeys(BaseData.getTowModuleValue("Method"));
    }

    public void clickRefuseButton()
    {
        uIMapTow.towEntry.towTab.uIRefuseButton.click();
    }

    public void enterReason()
    {
        objectIdentification.windowHandle.switchToWindowUsingFormName("frmTraHoldReason_Id");
        uIMapTow.towEntry.towTab.uIReasonEdit.sendKeys(Randomized.randomString(10));
    }


    public void verifyAtWrecker()
    {
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Wrecker"), objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.towTab.uIWreckerComboBox));
    }
     public void verifyWreckerChanged()
    {
        verify.ExpectedPropertyValueIsEqual("101 - Arm Company", objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.towTab.uIWreckerComboBox));
    }

    public void verifyTerminatedDriverNotShowing()
     {
         verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownOptionsCount(uIMapTow.towEntry.towTab.uITowDriverComboBox) == 2);
     }
    public void verifyTerminatedDriverShowing()
    {
        verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownOptionsCount(uIMapTow.towEntry.towTab.uITowDriverComboBox) == 3);
    }
    
    public void selectAtTowReason()
    {
    	Playback.pageLoadThreadWait();
    	objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uITowReasonComboBox, BaseData.getTowModuleValue("TowReason"));
   uIMapTow.towEntry.towTab.uITowReasonComboBox.sendKeys(Keys.TAB);
    }
    
    public void verifyAndCancel5100PopupMsg()
    {
    	popup.confirm.noWithExpectedMessage("(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
    }


  public void enterAtTowedFromCSZ()
    {
    	uIMapTow.towEntry.towTab.uITowedFromCSZEdit.sendKeys(BaseData.getTowModuleValue("TowedFromCSZ"));
    	uIMapTow.towEntry.towTab.uITowedFromCSZEdit.sendKeys(Keys.TAB);
    }
  public void enterAtTowedToCSZ()
  {
  	uIMapTow.towEntry.towTab.uITowedToCSZEdit.sendKeys(BaseData.getTowModuleValue("TowedToCSZ"));
  	uIMapTow.towEntry.towTab.uITowedToCSZEdit.sendKeys(Keys.TAB);
  }
  
public void tabTowRequestDateTime()
{
	 uIMapTow.towEntry.towTab.uITowRequestDateTimeEdit.sendKeys(Keys.TAB);
}
public void enterAtTowedTo()
{
	uIMapTow.towEntry.towTab.uITowedToEdit.sendKeys(BaseData.getTowModuleValue("TowedTo"));
	uIMapTow.towEntry.towTab.uITowedToEdit.sendKeys(Keys.TAB);
}

public void verifyHoldReasonIIconIsDisplayed()
{
	uIMapTow.towEntry.towTab.uIHoldReasonIIcon.isDisplayed();
}

public void clickHoldReasonIIcon()
{
	uIMapTow.towEntry.towTab.uIHoldReasonIIcon.click();
}

public void verifyRefuseInfoIconIsDisplayed()
{
    uIMapTow.towEntry.towTab.uIHoldReasonIIcon.isDisplayed();
}


public void verifyTowResonTextFieldIsDisplayed()
{
	verify.ExpectedValueIsTrue(uIMapTow.towEntry.towTab.uITowReasonEdit.isDisplayed());
}

public void enterTowReason() 
{
	 uIMapTow.towEntry.towTab.uITowReasonEdit.sendKeys(Randomized.randomString(10));
	
}


public void enterAtTowReason() 
{
	
	uIMapTow.towEntry.towTab.uITowReasonEdit.sendKeys(BaseData.getTowModuleValue("TowReason"));
	uIMapTow.towEntry.towTab.uITowReasonEdit.sendKeys(Keys.TAB);
}

public void clearTowReason()
{
	uIMapTow.towEntry.towTab.uITowReasonEdit.clear();
}

public String getWreckerDropDownValue() 
{
	
	String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.towTab.uIWreckerComboBox);
	return dropDownSelectedItem;
	
}

public void selectAtWrecker1()
    {
        objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uIWreckerComboBox, BaseData.getTowModuleValue("Wrecker1"));
        Playback.threadWait();
        uIMapTow.towEntry.towTab.uIWreckerComboBox.sendKeys(Keys.TAB);
      
    }

public void selectAtTowReason1()
    {
    	Playback.pageLoadThreadWait();
    	objectIdentification.manualIdentify.selectDropDownOption(uIMapTow.towEntry.towTab.uITowReasonComboBox, BaseData.getTowModuleValue("TowReason1"));
    	uIMapTow.towEntry.towTab.uITowReasonComboBox.sendKeys(Keys.TAB);
    }

public void verifyAtTowFrom()
{
	String attribute = uIMapTow.towEntry.towTab.uITowedFromEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("TowFrom")));
}

public void verifyAtTowedFromCSZ()
{
	String attribute = uIMapTow.towEntry.towTab.uITowedFromCSZEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("TowedFromCSZ")));
	
}

public void verifyAtTowedTo()
{
	String attribute = uIMapTow.towEntry.towTab.uITowedToEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("TowedTo")));
}

public void verifyAtTowedToCSZ() 
{
	String attribute = uIMapTow.towEntry.towTab.uITowedToCSZEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("TowedToCSZ")));
}

public void tabOutCancelDateNTime() 
{
	uIMapTow.towEntry.towTab.uICancelDateEdit.click();
	uIMapTow.towEntry.towTab.uICancelDateEdit.sendKeys(Keys.TAB);
	uIMapTow.towEntry.towTab.uICancelDateTimeEdit.sendKeys(Keys.TAB);
}

public void verifyCancelDateNTimeisEmpty() 
{
	String Date = uIMapTow.towEntry.towTab.uICancelDateEdit.getAttribute("value");
	String Time = uIMapTow.towEntry.towTab.uICancelDateTimeEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(Date.isEmpty());
	verify.ExpectedValueIsTrue(Time.isEmpty());
}

public void verifyTowReasonisEnabled() {
	uIMapTow.towEntry.towTab.uITowReasonComboBox.isEnabled();
	
}
public void clearTowedFrom() 
{
	uIMapTow.towEntry.towTab.uITowedFromEdit.click();
	uIMapTow.towEntry.towTab.uITowedFromEdit.clear();
	
}


}

public class Owner
{

    public void verifyNotified1GreyOut()
    {
        verify.ExpectedPropertyValueIsEqual(uIMapTow.towEntry.owner.uINotified1DateEdit.getAttribute("class"), "textboxInactive");
      
    }

    public void verifyNotified1AutoPopulatesCurrentDate()
    {
        verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapTow.towEntry.owner.uINotified1DateEdit.getAttribute("value"));
    }

    public void verifyAtMethod()
    {
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Method"), objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTow.towEntry.owner.uIMethod1ComboBox));
    }

    public void clickClearIcon()
    {
        uIMapTow.towEntry.owner.uIClearIcon.click();
    }

    public void enterAtOwnerLastName()
    {
        uIMapTow.towEntry.owner.uIOwnerLastNameEdit.sendKeys(BaseData.getTowModuleValue("OwnerLastName"));

    }

    public void enterAtOwnerFirstName()
    {
        uIMapTow.towEntry.owner.uIOwnerFirstNameEdit.sendKeys(BaseData.getTowModuleValue("OwnerFirstName"));
        uIMapTow.towEntry.owner.uIOwnerFirstNameEdit.sendKeys(Keys.TAB);
    }

    public void selectName()
    {
        //Names.NameSearchHelpWindow.SelectName();
    }

   
    public void getOwnerLastName()
    {
        String ownerLastName = uIMapTow.towEntry.owner.uIOwnerLastNameEdit.getAttribute("value"); 
        Playback.setTestContextAttribute("OwnerLastName", ownerLastName);
    }

  public String readOwnerLastName()
    {
    	  String ownerLastName = uIMapTow.towEntry.owner.uIOwnerLastNameEdit.getAttribute("value");
    	  return ownerLastName;
    }
    
    public void getOwnerFirstName()
    {
      String ownerFirstName = uIMapTow.towEntry.owner.uIOwnerFirstNameEdit.getAttribute("value"); 
      Playback.setTestContextAttribute("ownerFirstName", ownerFirstName);
    }
	  public String readOwnerFirstName()
    {
    	String ownerFirstName = uIMapTow.towEntry.owner.uIOwnerFirstNameEdit.getAttribute("value"); 
    	return ownerFirstName;
    }
    

    public void getDOB()
    {
    String dOB =   uIMapTow.towEntry.owner.uIDOBEdit.getAttribute("value");
    Playback.setTestContextAttribute("DOB", dOB);

    }
	  public String readDOB()
    {
    	String dOB =   uIMapTow.towEntry.owner.uIDOBEdit.getAttribute("value");
    	return dOB;
    }


    public void getAddress()
    {
        String address = uIMapTow.towEntry.owner.uIAddressEdit.getAttribute("value");
        Playback.setTestContextAttribute("Address", address);
    }
	  public String readAddress()
    {
    	String address = uIMapTow.towEntry.owner.uIAddressEdit.getAttribute("value");
    	return address;
    }

public void clickNameSearchIcon() {
		uIMapTow.towEntry.owner.uIOwnerNamesearchButton.click();	
		
	}

}


public class Driver
{

    public void clickOwnerCheckbox()
    {
        Playback.waitForControlReady();
        uIMapTow.towEntry.mDriver.uIOwnerCheckbox.click();
    }

    public void verifyOwnerLastName(String ownerLastName)
    {
        verify.ExpectedPropertyValueIsEqual(ownerLastName, uIMapTow.towEntry.mDriver.uILastNameEdit.getAttribute("value"));
    }

  public void verifyActiveOwnerLastName(String LastName)
    {
    	String attribute = uIMapTow.towEntry.mDriver.uILastNameEdit.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(LastName));
    }
    

    public void verifyOwnerFirstName(String ownerFirstName)
    {
        verify.ExpectedPropertyValueIsEqual(ownerFirstName, uIMapTow.towEntry.mDriver.uIFirstNameEdit.getAttribute("value"));
    }

  public void verifyActiveOwnerFirstName(String FirstName)
    {
    	String attribute = uIMapTow.towEntry.mDriver.uIFirstNameEdit.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(FirstName));
    }

    public void verifyDOB(String dOB)
    {
        verify.ExpectedPropertyValueIsEqual(dOB, uIMapTow.towEntry.mDriver.uIDOBEdit.getAttribute("value"));
    }
	  public void verifyActiveDOB(String DOB)
    {
    	String attribute = uIMapTow.towEntry.mDriver.uIDOBEdit.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(DOB));
    }


    public void verifyAddress(String address)
    {
        verify.ExpectedPropertyValueIsEqual(address, uIMapTow.towEntry.mDriver.uIAddressEdit.getAttribute("value"));
    }
	 public void verifyActiveAddress(String Address)
    {
    	String attribute = uIMapTow.towEntry.mDriver.uIAddressEdit.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(Address));
    }
    

    public void enterComments()
    {
        uIMapTow.towEntry.mDriver.uICommentsEdit.sendKeys(Randomized.randomAlphanumericSpecialCharsString(15));

    }

    public void uncheckOwnerCheckbox()
    {
    	if(uIMapTow.towEntry.mDriver.uIOwnerCheckbox.isSelected())
    		uIMapTow.towEntry.mDriver.uIOwnerCheckbox.click();
        
    }

    public void verifyDriverLastNameEmpty()
    {
        verify.ExpectedPropertyValueIsEqual("", uIMapTow.towEntry.mDriver.uILastNameEdit.getText());
    }

     public void verifyDriverFirstNameEmpty()
    {
        verify.ExpectedPropertyValueIsEqual("", uIMapTow.towEntry.mDriver.uIFirstNameEdit.getText());
    }

    public void verifyDOBEmpty()
    {
        verify.ExpectedPropertyValueIsEqual("", uIMapTow.towEntry.mDriver.uIDOBEdit.getText());
     }

    public void verifyAddressEmpty()
    {
        verify.ExpectedPropertyValueIsEqual("", uIMapTow.towEntry.mDriver.uIAddressEdit.getText());
    }



}

public class DamageMissing
{

    public void enterText()
    {
     
        Playback.waitForControlReady();
        Actions actions = new Actions(Playback.driver);
        actions.moveToElement(uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit).click();;
        actions.sendKeys(Randomized.randomString(20)).build().perform();
        Playback.waitForControlReady();

    }

    public void enterAndGetLessText()
    {
        String character = Randomized.randomString(10);     
        Playback.waitForControlReady();
        Actions actions = new Actions(Playback.driver);
        actions.moveToElement(uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit).click();
        actions.sendKeys(character).build().perform();
        Playback.waitForControlReady();
        Playback.setTestContextAttribute("Character",character);

    }


    public void getText()
    {
    	
    	
        uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
        String text = Playback.driver.findElement(By.xpath("//body")).getText();
         Playback.setTestContextAttribute("Text", text);
       
    }

    public void getText1()
    {
       String text1 = uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit.getAttribute("value");
       Playback.setTestContextAttribute("Text1", text1);
    }

    public void saveInternalScreen()
    {
        uIMapTow.towEntry.damageMissing.uIInternalSaveButton.click();
        popup.confirm.yes();
        
    }

    public void resetInternalScreen()
    {
    
        uIMapTow.towEntry.damageMissing.uIInternalResetButton.click();
    }

    public void verifyFirstEnteredStringAppear(String text)
    {
        uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
        String firstEnteredString = Playback.driver.findElement(By.xpath("//body")).getText();
        verify.ExpectedPropertyValueIsEqual(text, firstEnteredString);
    }

    public void verifyLastEnteredStringDisappear(String character)
    {
        uIMapTow.towEntry.damageMissing.uIDamageMissingRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
        String lastEnteredString = Playback.driver.findElement(By.xpath("//body")).getText();
       
        verify.ExpectedValueIsFalse(lastEnteredString.contains(character));
    }

    public void verify1003UpdateSuccessfulFooterMessage()
    {
         String AdditionMessage = uIMapTow.towEntry.damageMissing.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
    }

    public void verify1002AdditionSuccessfulFooterMessage()
    {
        String AdditionMessage = uIMapTow.towEntry.damageMissing.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
    }

}

public class PropertyInventory
{

    public void enterText()
    {
        Playback.waitForControlReady();
        Actions actions = new Actions(Playback.driver);
        actions.moveToElement(uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit).click();
        actions.sendKeys(Randomized.randomString(20)).build().perform();
        Playback.waitForControlReady();
    }

    public void enterAndGetLessText()
    {
        String character = Randomized.randomString(10);
    
        Playback.waitForControlReady();
        Actions actions = new Actions(Playback.driver);
        actions.moveToElement(uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit).click();
        actions.sendKeys(character).build().perform();
        Playback.waitForControlReady();
        Playback.setTestContextAttribute("Character",character);

    }

    public void getText()
    {
        uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
       String text = Playback.driver.findElement(By.xpath("//body")).getText();
       Playback.setTestContextAttribute("Text", text);

    }

    public void getText1()
    {
        String text1 = uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit.getAttribute("value");
        Playback.setTestContextAttribute("Text1", text1);
    }

    public void saveInternalScreen()
    {
        uIMapTow.towEntry.propertyInventory.uIInternalSaveButton.click();
        popup.confirm.yes();
     
    }

    public void resetInternalScreen()
    {
        uIMapTow.towEntry.propertyInventory.uIInternalResetButton.click();
    }

    public void verifyFirstEnteredStringAppear(String text)
    {

        uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
       String firstEnteredString = Playback.driver.findElement(By.xpath("//body")).getText();
        verify.ExpectedPropertyValueIsEqual(text, firstEnteredString);

    }

    public void verifyLastEnteredStringDisappear(String character)
    {
        uIMapTow.towEntry.propertyInventory.uIPropertyInventoryRichTextEdit.click();
        objectIdentification.windowHandle.switchToFrame("javascript");
        String lastEnteredString = Playback.driver.findElement(By.xpath("//body")).getText();

        verify.ExpectedValueIsFalse(lastEnteredString.contains(character));

    }

    public void verify1003UpdateSuccessfulFooterMessage()
    {
      
        String AdditionMessage = uIMapTow.towEntry.propertyInventory.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
    }

    public void verify1002AdditionSuccessfulFooterMessage()
    {

        String AdditionMessage = uIMapTow.towEntry.propertyInventory.uIBottomLeftSideStatusBar.getText();
        verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
    }

}

public class Forfeiture
{
   
    public void enterCrime()
    {
        uIMapTow.towEntry.forfeiture.uICrimeEdit.sendKeys(Randomized.randomString(10));
    }

    public void enterEstimatedValue()
    {
        uIMapTow.towEntry.forfeiture.uIEstimatedValueEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
    }

    public void enterLienOfAmount()
    {
        uIMapTow.towEntry.forfeiture.uILienOfAmountEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
    }

    public void clickClearIcon()
    {
        uIMapTow.towEntry.forfeiture.uIClearIcon.click();
    }

    public void selectLienHolder()
    {
        uIMapTow.towEntry.forfeiture.uILastNameEdit.sendKeys("mar");
        uIMapTow.towEntry.forfeiture.uILastNameEdit.sendKeys(Keys.TAB);
        uIMapTow.towEntry.forfeiture.uIFirstNameEdit.sendKeys(Keys.TAB);
        //Names.NameSearchHelpWindow.SelectName(); - for Java conversion commented by Mohan
    }

    public void selectEquipments()
    {
        uIMapTow.towEntry.forfeiture.uIAirConditionerRadioButton.click();
        uIMapTow.towEntry.forfeiture.uIKeysRadioButton.click();
        uIMapTow.towEntry.forfeiture.uISpeakersRadioButton.click();
        uIMapTow.towEntry.forfeiture.uITapeDeckRadioButton.click();
    }



}

public class Release
{

    public void clickHoldCheckbox()
    {
        uIMapTow.towEntry.release.uIHoldCheckbox.click();
    }

    public void selectReason()
    {
        objectIdentification.randomIdentify.selectDropDownOption(uIMapTow.towEntry.release.uIReasonComboBox);
    }

    public void uncheckHoldCheckbox()
    {
        if(uIMapTow.towEntry.release.uIHoldCheckbox.isSelected())
        	uIMapTow.towEntry.release.uIHoldCheckbox.click();
    }

    public void enterProofOf()
    {
        uIMapTow.towEntry.release.uIProofOfEdit.sendKeys(Randomized.randomString(10));
    }

    public void selectReleaseTo()
    {
        uIMapTow.towEntry.release.uILastNameEdit.sendKeys("A");
        uIMapTow.towEntry.release.uIFirstNameEdit.sendKeys(Keys.TAB);
        //Names.NameSearchHelpWindow.SelectName(); commented for Java Conversion - Mohan
    }

    public void tabReleaseDateTime()
    {
		uIMapTow.towEntry.release.uIReleaseDateEdit.click();
        uIMapTow.towEntry.release.uIReleaseDateEdit.sendKeys(Keys.TAB);
        uIMapTow.towEntry.release.uIReleaseTimeEdit.sendKeys(Keys.TAB);
    }

    public void verifyCurrentDateAutoPopulatesInRequestedDate()
    {
        verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapTow.towEntry.release.uIReleaseDateEdit.getAttribute("value"));
    }

    public void selectReleasedBy()
    {
        uIMapTow.towEntry.release.uIReleasedBySearchButton.click();
        popup.kPICodedLookup.randomKPIHelpSelect();
    }

    public void enterComments()
    {
        uIMapTow.towEntry.release.uICommentsEdit.sendKeys(Randomized.randomString(15));
    }

    public void verifyAtReleaseToLastName()
    {
    	String attribute = uIMapTow.towEntry.release.uILastNameEdit.getAttribute("value");
    	verify.ExpectedValueIsTrue(attribute.contains(BaseData.getTowModuleValue("ReleaseToLastName")));
    }
    
    public void verifyHoldCheckBoxSelected()
    {
    verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIHoldCheckbox.isSelected());
    }

    public void verifyAtHoldReason() {
          String actual =     new Select(uIMapTow.towEntry.release.uIReasonComboBox).getFirstSelectedOption().getText();          
          String expected = BaseData.getTowModuleValue("HoldReason");
          verify.ExpectedPropertyValueIsEqual(expected, actual);
          }

          public void verifyHoldReasonDropdownDisabled() {
                   
    verify.ExpectedValueIsFalse(uIMapTow.towEntry.release.uIReasonComboBox.isEnabled());
          }
          
          public void verifyHoldReasonDropdownEnabled() {
              
        	    verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReasonComboBox.isEnabled());
        	          }

  public void tabFirstName()
          {
        	  uIMapTow.towEntry.release.uIFirstNameEdit.sendKeys(Keys.TAB);
          }
       	public void enterAtReleaseToNameID()
		{
			uIMapTow.towEntry.release.uIReleaseToNameTypeEdit.sendKeys(BaseData.getTowModuleValue("ReleaseToNameID").substring(0, 1));
			uIMapTow.towEntry.release.uIReleaseToNameIDEdit.sendKeys(BaseData.getTowModuleValue("ReleaseToNameID").substring(2));
			uIMapTow.towEntry.release.uIReleaseToNameIDEdit.sendKeys(Keys.TAB);
		}

          public void enterAtReleasedBy() 
          {
              uIMapTow.towEntry.release.uIReleasedByEdit.sendKeys(BaseData.getTowModuleValue("ReleasedBy"));
              uIMapTow.towEntry.release.uIReleasedByEdit.sendKeys(Keys.TAB);
              
          }

          public void clickReleasedBySignatureButton()
          {
              uIMapTow.towEntry.release.uIReleasedBySignatureButton.click();
              
          }
          public void clickReleaseToSignatureButton()
  		{
  			uIMapTow.towEntry.release.uIReleaseToSignatureButton.click();
  		}
          
          public void verifySignatureCheckBoxIsDisplayed() 
  		{
  			verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReleasedBySignatureCheckBox.isDisplayed());
  			
  		}

  		public void clickReleasedBySignatureCheckBox()
  		{
  			uIMapTow.towEntry.release.uIReleasedBySignatureCheckBox.click();
  			
  		}

  		public void verifyReleasedBySignatureCheckBoxIsSelected() 
  		{
  			verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReleasedBySignatureCheckBox.isSelected());
  			
  		}

  		public void verifyAtReleasedBy() 
  		{
  			String attribute = uIMapTow.towEntry.release.uIReleasedByEdit.getAttribute("value");
  			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getVehicleModuleValue("ReleasedBy")));
  		}

  		public void verifyReleasedByClearButtonIsDisplayed() 
  		{
  			verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReleasedByClearButton.isDisplayed());
  		}

  		public void verifyReleaseToClearButtonIsDisplayed()
  		{
  			verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReleaseToClearButton.isDisplayed());
  			
  		}

  		public void clickReleaseToClearButton()
  		{
  			uIMapTow.towEntry.release.uIReleaseToClearButton.click();
  			
  		}

  		public void verifyAtReleaseToLastNameWithActiveWrecker(String Value)
  		{
  			String attribute = uIMapTow.towEntry.release.uILastNameEdit.getAttribute("value");
  			verify.ExpectedValueIsTrue(Value.contains(attribute));
  		}

  		public void verifyReleaseToLastNameIsDisabled() 
  		{
  			String attribute = uIMapTow.towEntry.release.uILastNameEdit.getAttribute("class");
  			verify.ExpectedValueIsTrue(attribute.contains("textboxInactive"));
  		}

  	public void verifyReleaseToLastNameIsEmpty()
  		{
  			String text = uIMapTow.towEntry.release.uILastNameEdit.getText();
  			System.out.println(text);
  			verify.ExpectedValueIsTrue(text.isEmpty());
  		}
  		public void clearReleasedBy() 
		{
			uIMapTow.towEntry.release.uIReleasedByEdit.click();
			uIMapTow.towEntry.release.uIReleasedByEdit.clear();
			uIMapTow.towEntry.release.uIReleasedByEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtReleasedBy1() 
		{
			uIMapTow.towEntry.release.uIReleasedByEdit.sendKeys(BaseData.getTowModuleValue("ReleasedBy1"));
			uIMapTow.towEntry.release.uIReleasedByEdit.sendKeys(Keys.TAB);
			
		}

		public void clickClearButton()
	    {
	        uIMapTow.towEntry.release.uIClearButton.click();
	    }


  }

  
public class TowDispositionTab
{

    public void selectAuthorizedBy()
    {
        uIMapTow.towEntry.towDispositionTab.uIAuthorizedBySearchButton.click();
        popup.kPICodedLookup.randomKPIHelpSelect();
    }

    public void tabOutDate()
    {
        uIMapTow.towEntry.towDispositionTab.uIDateEdit.sendKeys(Keys.TAB);
    
    }

    public void selectMethod()
    {
        objectIdentification.randomIdentify.selectDropDownOption(uIMapTow.towEntry.towDispositionTab.uIMethodComboBox);
    }

    public void enterCustom1()
    {
        uIMapTow.towEntry.towDispositionTab.uICustom1Edit.sendKeys(Randomized.randomAlphanumericSpecialCharsString(15));
    }

	public void enterAtAuthorizedBy()
	{
		uIMapTow.towEntry.towDispositionTab.uIAuthorizedByEdit.sendKeys(BaseData.getVehicleModuleValue("AuthorizedBy"));
		uIMapTow.towEntry.towDispositionTab.uIAuthorizedByEdit.sendKeys(Keys.TAB);
	}

	public void clickSignatureButton()
	{
		uIMapTow.towEntry.towDispositionTab.uIClickHereToSignButton.click();
	}

	public void verifyClearButtonIsDisplayed() 
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.towDispositionTab.uIClearButton.isDisplayed());
	}

	public void clickClearButton() 
	{
		uIMapTow.towEntry.towDispositionTab.uIClearButton.click();
		
	}

	public void verifySignatureCheckBoxIsDisplayed()
	{
		
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.towDispositionTab.uISignatureCheckBox.isDisplayed());
		
	}

	public void clickSignatureCheckBox()
	{
		uIMapTow.towEntry.towDispositionTab.uISignatureCheckBox.click();
	}
	
	public void verifyReleaseToClearButtonIsDisplayed() 
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.towDispositionTab.uIClearButton.isDisplayed());
	}
	
	public void verifySignatureCheckBoxIsSelected()
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.towDispositionTab.uISignatureCheckBox.isSelected());
	}

	public void verifyReleasedByClearButtonIsDisplayed() 
	{
		verify.ExpectedValueIsTrue(uIMapTow.towEntry.release.uIReleasedByClearButton.isDisplayed());
	}
	public void clickAuthorizedBysignatureCheckBox() 
	{
		uIMapTow.towEntry.towDispositionTab.uIAuthorizedBySignatureCheckBox.click();
		
	}

}

public class TowNotesTab
{

    public void enterNotes()
    {

        uIMapTow.towEntry.towNotesTab.uINotesEdit.sendKeys(Randomized.randomAlphanumericSpecialCharsString(15));
    }

    public void getNotes()
    {
        String notes = uIMapTow.towEntry.towNotesTab.uINotesEdit.getAttribute("value");
        Playback.setTestContextAttribute("Notes", notes);
    }

    public void clickResetButton()
    {
        uIMapTow.towEntry.towNotesTab.uIResetButton.click();
    }

    public void clickSaveButton()
    {
        uIMapTow.towEntry.towNotesTab.uISaveButton.click();
    }

    public void verifyEnteredNotesDisappears()
    {
        verify.ExpectedPropertyValueIsEqual("", uIMapTow.towEntry.towNotesTab.uINotesEdit.getAttribute("value"));
    }

    public void verifyEntereNotesInGrid(String notes)
    {
        Playback.waitForPageLoad();
        verify.ExpectedValueIsTrue(uIMapTow.towEntry.towNotesTab.uINotesTable.getText().contains(notes));
    }


}
 
//Tow Refuse Action Scripts

public class TowRefuse
{

    public void enterAtCallNo()
    {
        uIMapTow.towRefuse.uICallYearEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(0, 2));
        uIMapTow.towRefuse.uICallNumberEdit.sendKeys(BaseData.getTowModuleValue("CallNo").substring(3));
        uIMapTow.towRefuse.uICallNumberEdit.sendKeys(Keys.TAB);
    }

    public void selectAtVendor()
    {
        uIMapTow.towRefuse.uIVendorComboBox.sendKeys(BaseData.getTowModuleValue("Vendor"));
    }

    public void clickSearchButton()
    {
        uIMapTow.towRefuse.uISearchButton.click();
}

    public void verifyAtCallNo()
    {
        Playback.pageLoadThreadWait();
        WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towRefuse.uITowRefuseTable, BaseData.getTowModuleValue("CallNo"));

        WebElement Call = objectIdentification.manualIdentify.getGridCell(uIMapTow.towRefuse.uITowRefuseTable, row, "Call#");
   
        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("CallNo"), Call.getText());

    }

    public void verifyRefuseAsCurrentDate()
    {
        WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towRefuse.uITowRefuseTable, BaseData.getTowModuleValue("CallNo"));
        
        verify.ExpectedPropertyValueIsEqual(Randomized.removeStringByIndexCount(Randomized.getCurrentDate(),6,2), objectIdentification.manualIdentify.getGridCell(uIMapTow.towRefuse.uITowRefuseTable, row, "Refuse Date").getText());
        String dateStr=Randomized.removeStringByIndexCount(Randomized.getCurrentDate(),6,2);
        String newStr=dateStr.substring(0,5)+dateStr.substring(8,dateStr.length());
    }

    public void verifyContractorAtVendor()
    {
    	
        WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTow.towRefuse.uITowRefuseTable, BaseData.getTowModuleValue("CallNo"));

        verify.ExpectedPropertyValueIsEqual(BaseData.getTowModuleValue("Vendor"),  objectIdentification.manualIdentify.getGridCell(uIMapTow.towRefuse.uITowRefuseTable, row, "Contractor").getText());

    }

    public void clickRowByAtCallNo()
    {
        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTow.towRefuse.uITowRefuseTable,BaseData.getTowModuleValue("CallNo"));
    }

	public void verifyAtRefuseDate()
	{
		List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapTow.towRefuse.uITowRefuseTable, "Refuse Date");
		verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getTowModuleValue("RefuseDate")));
	}

	public void verifyAtVendor()
    {
        List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapTow.towRefuse.uITowRefuseTable, "Vendor");
        verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getTowModuleValue("Vendor")));
    }

}

public class TowRefusePopUpScreen
{
	public void clickSaveButton()
	{
	uIMapTow.towRefusePopUpScreen.uISaveButton.click();
	
	}
	
	public void clickSaveNCloseButton()
	{
	uIMapTow.towRefusePopUpScreen.uISaveNCloseButton.click();
	
	}
	public void saveNCloseScreen()
	{
	uIMapTow.towRefusePopUpScreen.uISaveNCloseButton.click();
	popup.confirm.yes();
	
	}
	
	public void clickDeleteButton()
	{
	uIMapTow.towRefusePopUpScreen.uIDeleteButton.click();
	popup.confirm.yes();
	
	}
	
	public void enterAtReason()
	{
		uIMapTow.towRefusePopUpScreen.uIReasonEdit.sendKeys(BaseData.getTowModuleValue("Reason"));
	
	}
	
}


}


