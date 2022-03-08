package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import dataAccess.BaseData;
import dataAccess.PoliceData;
import uIMaps.UIMapAnimalControl;

import uIMaps.UIMapNames;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class AnimalControl {

	
    public ObjectIdentification objectIdentification = new ObjectIdentification();
    public UIMapAnimalControl uIMapAnimalControl= new UIMapAnimalControl();
    public UIMapNames uIMapNames = new UIMapNames();
    public Popup popup = new Popup();
    public UIMapPopup uIMapPopup = new UIMapPopup();
    public Names names = new Names();
    
    public AnimalNameEntry animalNameEntry;
    public AnimalRegistrationSearch animalRegistrationSearch;
    public AnimalRegistrationEntry animalRegistrationEntry;
    public AnimalCaseEntry animalCaseEntry;
    public AnimalCaseSearch animalCaseSearch;
    public AnimalLostOrFoundEntry animalLostOrFoundEntry;
    public AnimalNameSearch animalNameSearch;
    public AnimalCageRental animalCageRental;
    
    
    public AnimalNameMerge animalNameMerge;
    public AnimalNameMergeHelpWindow animalNameMergeHelpWindow;
    public  AnimalNameEntryMedicalProcedure animalNameEntryMedicalProcedure;
    
    public AnimalControl()
    {
           if (animalNameEntry == null)
                  animalNameEntry = new AnimalNameEntry();
           
           if (animalNameEntryMedicalProcedure == null)
        	   animalNameEntryMedicalProcedure = new AnimalNameEntryMedicalProcedure();
        
           if(animalRegistrationSearch == null)
        	   animalRegistrationSearch = new AnimalRegistrationSearch();
           
           if(animalRegistrationEntry == null)
        	   animalRegistrationEntry = new AnimalRegistrationEntry();
           
           if(animalCaseEntry == null)
        	  animalCaseEntry = new AnimalCaseEntry();
           
           if(animalLostOrFoundEntry == null)
        	   animalLostOrFoundEntry = new AnimalLostOrFoundEntry();
           
           if(animalCaseSearch == null)
        	   animalCaseSearch = new AnimalCaseSearch();
           
           if(animalNameSearch == null)
        	   animalNameSearch = new AnimalNameSearch();
           
           if(animalCageRental == null)
        	   animalCageRental = new AnimalCageRental();
           
           if(animalNameMerge == null)
        	   animalNameMerge = new AnimalNameMerge();
           
           if(animalNameMergeHelpWindow == null)
        	   animalNameMergeHelpWindow = new AnimalNameMergeHelpWindow();
           
           
           
    }
    
    
    public void Reset() {
           uIMapAnimalControl = null;
           uIMapPopup = null;
           uIMapNames = null;
    }
    
    
    public void switchToAnimalNameEntry()
    {
           objectIdentification.windowHandle.switchToWindow("Animal Name Entry");
           Playback.controlReadyThreadWait();
    }
    public void switchToAnimalNameEntryOfMedical()
    {
           objectIdentification.windowHandle.switchToWindowUsingURL("frmMedicalProcedure");
           Playback.controlReadyThreadWait();
    }
    
    public void switchToAnimalNameScreen()
    {
           objectIdentification.windowHandle.switchToWindowUsingFormName("frmVerifyAnimalName.aspx");
           Playback.controlReadyThreadWait();
    }
    public void switchToAnimalRegistrationSearchScreen()
    {
      	objectIdentification.windowHandle.switchToMainWindowScreenTab("frmLicenseSrch.aspx");
    	Playback.controlReadyThreadWait();
    }
    public void switchToAnimalRegistrationEntry()
    {
    	objectIdentification.windowHandle.switchToWindow("Animal Registration");
    	Playback.controlReadyThreadWait();
    }
    
    public void switchToAnimalNameMergeScreen() {
  		objectIdentification.windowHandle.switchToMainWindowScreenTab("Animal Name Merge");
  	}

    public void switchToAnimalNameMergeHelpWindow() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("Animal Name Merge");

	}

    public void switchToAnimalCaseSearch() {
    	objectIdentification.windowHandle.switchToMainWindowScreenTab("frmAnimalSrch.aspx");
	}
    public void switchToAnimalNameSearchScreen() {
    	objectIdentification.windowHandle.switchToMainWindowScreenTab("frmAnimalNameSrch.aspx");
  	}


	public void switchToAnimalCaseEntry() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("Animal Case Entry");

	}
	public void switchToAnimalLostOrFound() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("Animal Lost/Found");
		
		
	}
	public void switchToAnimalCageRental() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Animal Cage Rental");
		Playback.controlReadyThreadWait();
		
	}
	
	public void switchToMedicalProcedure() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmMedicalProcedure.aspx");
		Playback.pageLoadThreadWait();
	}
	
	public void switchToAnimalLostOrFoundEntry()
	{
		objectIdentification.windowHandle.switchToWindow("Animal Lost/Found");
		Playback.controlReadyThreadWait();
	}

	public class AnimalNameSearch
	{
		   public void enterAtName() {
               uIMapAnimalControl.animalNameSearch.uIAnimalLastNameEdit
                            .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
               uIMapAnimalControl.animalNameSearch.uIAnimalLastNameEdit.sendKeys(Keys.TAB);
               uIMapAnimalControl.animalNameSearch.uIAnimalFirstNameEdit
               .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
  uIMapAnimalControl.animalNameSearch.uIAnimalFirstNameEdit.sendKeys(Keys.TAB);

        }
		   public void clickSearch()
		   {
			   uIMapAnimalControl.animalNameSearch.uISearchButton.click();
			   Playback.waitForControlReady();
			   Playback.gridLoadThreadWait();
		   }
		   public void clickAddNew()
		   {
			   uIMapAnimalControl.animalNameSearch.uIAddNewButton.click();
			   Playback.waitForControlReady();
		   }
		public void enterAtAnimalNameID()
		{
			
			uIMapAnimalControl.animalNameSearch.uIAnimalNameIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(3));
			uIMapAnimalControl.animalNameSearch.uIAnimalNameIDEdit.sendKeys(Keys.TAB);
		}
		public void selectAtSpecies()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalNameSearch.uISpeciesDropdown,PoliceData.getAnimalControlModuleValue("Species"));
		}
		public void selectAtTypeOfProcedure()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalNameSearch.uITypeofProcedureDropDown,PoliceData.getAnimalControlModuleValue("TypeOfProcedure"));
		}
		public void clickGridRowByAnimalNameID()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalNameSearch.uIAnimalNameSearchResultGrid, PoliceData.getAnimalControlModuleValue("AnimalNameID"));
			}
		public void clickGridRowByAnimalName()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalNameSearch.uIAnimalNameSearchResultGrid, PoliceData.getAnimalControlModuleValue("AnimalName"));
			}
		

		public void enterAtAID()
		{
			uIMapAnimalControl.animalNameSearch.uIAIDCodeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AID"));
			uIMapAnimalControl.animalNameSearch.uIAIDCodeEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtPID()
		{
			uIMapAnimalControl.animalNameSearch.uIPIDCodeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("PID"));
			uIMapAnimalControl.animalNameSearch.uIPIDCodeEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtSBCase()
		{
			uIMapAnimalControl.animalNameSearch.uISBCodeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("SBCase"));
			uIMapAnimalControl.animalNameSearch.uISBCodeEdit.sendKeys(Keys.TAB);
		}
		public void verifyAtNameIDInGrid()
		{
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapAnimalControl.animalNameSearch.uIAnimalNameSearchResultGrid, "ID");
			for(String values : gridTableColumnValues)
			{
			verify.ExpectedValueIsTrue(values.contains(PoliceData.getAnimalControlModuleValue("NameID")));
			}
		}
		public void clickBackButton()
		{
			uIMapAnimalControl.animalNameSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}
		
		public void clickResetButton()
		{
			uIMapAnimalControl.animalNameSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}
		
	}
	
    public class AnimalNameEntry {

        public AnimalNameEntryMainTab animalNameEntryMainTab;
        public AnimalNameEntryMedicalTab animalNameEntryMedicalTab ;
        public AnimalNameEntryAddressesTab animalNameEntryAddressesTab ;
        public AnimalNameEntryOwnerDetailsTab animalNameEntryOwnerDetailsTab ;
        public AnimalNameEntryCommentsTab animalNameEntryCommentsTab;
		public AnimalNameEntryActivityTab animalNameEntryActivityTab;
        public AnimalNameEntry() {
               if (animalNameEntryMainTab == null)
                     animalNameEntryMainTab = new AnimalNameEntryMainTab();

               if (animalNameEntryMedicalTab == null)
                     animalNameEntryMedicalTab = new AnimalNameEntryMedicalTab();
               
               if (animalNameEntryAddressesTab == null)
            	   animalNameEntryAddressesTab = new AnimalNameEntryAddressesTab();

               if (animalNameEntryOwnerDetailsTab == null)
            	   animalNameEntryOwnerDetailsTab = new AnimalNameEntryOwnerDetailsTab();
               
               if (animalNameEntryCommentsTab == null)
            	   animalNameEntryCommentsTab = new AnimalNameEntryCommentsTab();
               
			   if (animalNameEntryActivityTab == null)
            	   animalNameEntryActivityTab = new AnimalNameEntryActivityTab();
               
        }

        public void enterAtAnimalName() {
               uIMapAnimalControl.animalNameEntry.uILastNameEdit
                            .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
               uIMapAnimalControl.animalNameEntry.uILastNameEdit.sendKeys(Keys.TAB);
               uIMapAnimalControl.animalNameEntry.uIFirstNameEdit
                            .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
               uIMapAnimalControl.animalNameEntry.uIFirstNameEdit.sendKeys(Keys.TAB);

        }

        public void saveScreen() {
               uIMapAnimalControl.animalNameEntry.uISaveButton.click();
               popup.confirm.yes();
        }

        public void saveNClose() {
               uIMapAnimalControl.animalNameEntry.uISaveNCloseButton.click();
               popup.confirm.yes();
        }

        public void enterAtAddress() {
               uIMapAnimalControl.animalNameEntry.uIAddressEdit
                            .sendKeys(PoliceData.getAnimalControlModuleValue("Address"));
               uIMapAnimalControl.animalNameEntry.uIAddressEdit.sendKeys(Keys.TAB);
        }

        public void clickMainTab() {
               uIMapAnimalControl.animalNameEntry.uIMainTab.click();
               Playback.controlReadyThreadWait();

        }
		 public void clickActivityTab() {
            uIMapAnimalControl.animalNameEntry.uIActivityTab.click();
            Playback.controlReadyThreadWait();

     }
        public void clickAddressesTab() {
            uIMapAnimalControl.animalNameEntry.uIAddressesTab.click();
            Playback.controlReadyThreadWait();

     }
        public void switchToCommentsTab()
        {
        	  Playback.controlReadyThreadWait();
        	  uIMapAnimalControl.animalNameEntry.uICommentsTab.click();
              objectIdentification.windowHandle.switchToFrame("frmNameComments");
              Playback.controlReadyThreadWait();
        }
        public void clickOwnerDetailsTab() {
            uIMapAnimalControl.animalNameEntry.uIOwnersDetailsTab.click();
            Playback.controlReadyThreadWait();

     }

        public void clickMedicalTab() {
               uIMapAnimalControl.animalNameEntry.uIMedicalTab.click();
               Playback.controlReadyThreadWait();
        }
        public void switchToAnimalNameEntryAddressesTab() {
     	   uIMapAnimalControl.animalNameEntry.uIAddressesTab.click();
        }
        public void verifyAddressBubbleIconDisplayed() {
			
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapAnimalControl.animalNameEntry.uIAddressInfoIcon.isDisplayed());
			
		}
    	public String readAnimalNameID() {
		
    	String ID =	 uIMapAnimalControl.animalNameEntry.uINameIDEdit.getAttribute("value");
    			return ID;
		}

    	public void closeScreen() {
    		 uIMapAnimalControl.animalNameEntry.driver.close();
			
		}
    	
    	public void clickPrintIcon()
		 {
			 uIMapAnimalControl.animalNameEntry.uIPrintButton.click();
			 Playback.pageLoadThreadWait();
		 }
	
        public class AnimalNameEntryMainTab {

               public void selectAtSpecies() {
                     objectIdentification.manualIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISpeciesDropDown,
                                   PoliceData.getAnimalControlModuleValue("Species"));
                 uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISpeciesDropDown.sendKeys(Keys.TAB);
               }

               public void enterMicroChipID() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMicroChipIDEdit
                                   .sendKeys(String.valueOf(Randomized.getRandomNumber(6)));
                 uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMicroChipIDEdit.sendKeys(Keys.TAB);
               }

               public void enterAtPedigreeName() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPedigreeNameEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("PedigreeName"));
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPedigreeNameEdit.sendKeys(Keys.TAB);

               }

               public void enterAtHeight() {
                     uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIHeightEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("Height"));
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIHeightEdit.sendKeys(Keys.TAB);

               }

               public void selectColor1() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIColor1DropDown);
                  uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIColor1DropDown.sendKeys(Keys.TAB);
               }

               public void enterAtLicenseOrTagNo() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uILicenseOrTagNoEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("LicenseOrTag"));
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uILicenseOrTagNoEdit.sendKeys(Keys.TAB);

               }

               public void enterAtRabiesTagNo() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIRabiesTagNoEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("RabiesTag"));
                 uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIRabiesTagNoEdit.sendKeys(Keys.TAB);

               }

               public void selectBreed1() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIBreed1DropDown);
                  uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIBreed1DropDown.sendKeys(Keys.TAB);
               }

               public void selectAtSex() {
                     objectIdentification.manualIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISexDropDown,
                                   PoliceData.getAnimalControlModuleValue("Sex"));
                     uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISexDropDown.sendKeys(Keys.TAB);
               }

               public void enterAtWeight() {
                     uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIWeightEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("Weight"));
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIWeightEdit.sendKeys(Keys.TAB);
               }

               public void selectColor2() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIColor2DropDown);
                  uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIColor2DropDown.sendKeys(Keys.TAB);
               }

               public void selectExpirationDate() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIExpirationEdit
                                   .sendKeys(Randomized.getFutureDate(8));
                  uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIExpirationEdit.sendKeys(Keys.TAB);

               }

               public void selectRabiesShotExpirationDate() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIRabiesShotExpirationEdit
                                   .sendKeys(Randomized.getFutureDate(10));
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIRabiesShotExpirationEdit.sendKeys(Keys.TAB);

               }

               public void selectBreed2() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIBreed2DropDown);
                  uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIBreed2DropDown.sendKeys(Keys.TAB);

               }

               public void enterAtDOB() {
                     uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIDOBEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("DOB"));
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);

               }

               public void enterAtLength() {
                     uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uILengthEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("Length"));
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uILengthEdit.sendKeys(Keys.TAB);

               }

               public void selectMarkings() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMarkingsDropDown);
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMarkingsDropDown.sendKeys(Keys.TAB);
               }

               public void selectIssuingAgency() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIIssuingAgencyDropDown);
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIIssuingAgencyDropDown.sendKeys(Keys.TAB);
               }

               public void enterAtVeterinarianNameID() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIVeterinarianNameTypeEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("VeterinarianNameID").substring(0, 1));
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIVeterinarianNameTypeEdit.sendKeys(Keys.TAB);
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIVeterinarianNameIDEdit
                                   .sendKeys(PoliceData.getAnimalControlModuleValue("VeterinarianNameID").substring(2));
               uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIVeterinarianNameIDEdit.sendKeys(Keys.TAB);

               }
               
               public void enterAID()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIAnimalIDCodeEdit.sendKeys((Randomized.randomNumberString(25)));
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIAnimalIDCodeEdit.sendKeys(Keys.TAB);
   			}
   			
   			public void enterPID()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPIDCodeEdit.sendKeys(Randomized.randomNumberString(25));
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPIDCodeEdit.sendKeys(Keys.TAB);
   			}
   			
   			public void enterSBCase()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISBCaseEdit.sendKeys(Randomized.randomNumberString(25));
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISBCaseEdit.sendKeys(Keys.TAB);
   			}
   			
   			
   			public void clickAIDCustomField()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIAIDCustomField.click();
   			}

   			public void clickPIDCustomField()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPIDCustomField.click();
   			}
   			
   			public void clickSBCaseCustomField()
   			{
   				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISBCaseDCustomField.click();
   			}
   			public void verifyAtAIDCustomField()
			{
				String text = uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIAIDCustomField.getText();
				verify.ExpectedPropertyValueIsEqual(text, PoliceData.getAnimalControlModuleValue("AIDCustomField"));
			}
			
			public void verifyAtPIDCustomField()
			{
				String text = uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIPIDCustomField.getText();
				verify.ExpectedPropertyValueIsEqual(text, PoliceData.getAnimalControlModuleValue("PIDCustomField"));
			}
			
			public void verifyAtSBCaseDCustomField()
			{
				String text = uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uISBCaseDCustomField.getText();
				verify.ExpectedPropertyValueIsEqual(text, PoliceData.getAnimalControlModuleValue("SBCaseDCustomField"));
			}
			
			public void selectMfg()
			{
				objectIdentification.randomIdentify.selectDropDownOption(uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMfgDropDown);
				uIMapAnimalControl.animalNameEntry.animalNameEntryMainTab.uIMfgDropDown.sendKeys(Keys.TAB);
			}
        }
        public class AnimalNameEntryOwnerDetailsTab
        {
        	public void enterAtOwnerNameID()
        	{
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersNameTypeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerNameID").substring(0, 1));
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersNameTypeEdit.sendKeys(Keys.TAB);
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersNameIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerNameID").substring(3));
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersNameIDEdit.sendKeys(Keys.TAB);
        	}
        	public void enterAtACENo()
        	{
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIAceYear.sendKeys(PoliceData.getAnimalControlModuleValue("ACENo").substring(0, 2));
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIAceYear.sendKeys(PoliceData.getAnimalControlModuleValue("ACENo").substring(3));
        		uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIAceYear.sendKeys(Keys.TAB);
        	}
        	
        	public void clickAdd() {
                uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIAddButton.click();
                Playback.controlReadyThreadWait();
         }
		 public void clickClearButton() {
				uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIClearButton.click();
			}
        	
        	public void verifyAtNameInGrid(int rowIndex)
        	{
        		String name =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersDetailsTable,"Name",rowIndex);
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("OwnerName"), name);
        	}
				public void verifyAtNameInGrid()
        	{
        		int TableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersDetailsTable);
        		String name =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersDetailsTable,"Name",TableRowsCount-1);
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("OwnerName"), name);
        	}
        	public void verifyAtACENoInGrid(int rowIndex)
        	{
        		String name =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersDetailsTable,"ACE#",rowIndex);
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("ACENo"), name);
        	}

			public void verifyAtDateAsCurrentDateInGrid(int rowIndex) {
				String date =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIOwnersDetailsTable,"Date",rowIndex);
        		verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), date);
			}
			public void verifyRequiredEntriesMissingAcknowledge()
			{
			//popup.acknowledge.ok();
				popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
				
			}
			public void verifyUpdateSuccessfulMessage() {
				System.out.println(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIBottomStatusLable.getText());
				verify.ExpectedPropertyValueIsEqual(uIMapAnimalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.uIBottomStatusLable.getText()," 1003 - Update Successful");
						
				             
						}
            public void verifyDuplicationOfDataFoundAcknowledge() {
				
				// popup.acknowledge.ok();
	          	   popup.acknowledge.okWithExpectedMessage("(1019)Duplication Of Data Found");
	          	   Playback.controlReadyThreadWait();
	             
			}
			public void verifyAtOwnerNameID()
			{
				
			}
			public void verifyAtOwnerName()
			{
				
			}
        	
        
       
        }

        public class AnimalNameEntryMedicalTab {

               public void enterCurrentDateInDateOFProcedure() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIDateOfProcedureEdit
                                   .sendKeys(Randomized.getCurrentDate());
               uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIDateOfProcedureEdit.sendKeys(Keys.TAB);
               }
               public void tabDateOFProcedure() {
             
            uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIDateOfProcedureEdit.sendKeys(Keys.TAB);
            }

               public void selectTypeOfProcedure() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uITypeOfProcedure);
               uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uITypeOfProcedure.sendKeys(Keys.TAB);

               }

               public void selectReasonOfProcedure() {
                     objectIdentification.randomIdentify.selectDropDownOption(
                                   uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIReasonOfProcedure);
               uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIReasonOfProcedure.sendKeys(Keys.TAB);

               }
               public void selectAtTypeOfProcedure() {
                   objectIdentification.manualIdentify.selectDropDownOption(
                                 uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uITypeOfProcedure,PoliceData.getAnimalControlModuleValue("TypeOfProcedure"));
             uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uITypeOfProcedure.sendKeys(Keys.TAB);

             }

             public void selectAtReasonOfProcedure() {
                   objectIdentification.manualIdentify.selectDropDownOption(
                                 uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIReasonOfProcedure,PoliceData.getAnimalControlModuleValue("ReasonOfProcedure"));
             uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIReasonOfProcedure.sendKeys(Keys.TAB);

             }

               public void clickAdd() {
                      uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIAddButton.click();
               }

			public void verifyEnterDateOfProcedureAcknowlege() {
			
				//popup.acknowledge.ok();
					popup.acknowledge.okWithExpectedMessage("(30033) Enter Date of Procedure.");
			
			}
			public void verifyAtTypeOfProcedureInGrid(int rowIndex) {
				
	        		String value =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIMedicalResultTable,"Procedure Type",rowIndex);
	        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("TypeOfProcedure"), value);
	        	
			}
			public void verifyAtReasonOfProcedureInGrid(int rowIndex) {
				
        		String value =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIMedicalResultTable,"Procedure Reason",rowIndex);
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("ReasonOfProcedure"), value);
        	
		}
	public void verifyAtNameInGrid(int rowIndex) {
				
        		String value =objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryMedicalTab.uIMedicalResultTable,"Name",rowIndex);
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("VeterinarianName"), value);
        	
		}

        }
        public class AnimalNameEntryAddressesTab {
        
        	public void enterAtAddress()
        	{
        		Playback.controlReadyThreadWait();
        		uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddressEdit.sendKeys(PoliceData.getAnimalControlModuleValue("Address"));
       
        	}
        	public void selectAtAddressType()
        	{
        		objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddressTypeDropDown, PoliceData.getAnimalControlModuleValue("AddressType"));
        	}
        	public void clickAdd()
        	{
        		uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddButton.click();
        		Playback.controlReadyThreadWait();
        	}
			public void verifyAtAddres(int rowIndex) {
			String address =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddressResultTable, "Address", rowIndex);
				verify.ExpectedValueIsTrue( address.contains(PoliceData.getAnimalControlModuleValue("Address")));
			}
			public void selectAtRowByAddress() {
				
				Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddressResultTable, PoliceData.getAnimalControlModuleValue("Address"));
				
			}
			public void verifyAddressBubbleIconDisplayed() {
				
				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsTrue(uIMapAnimalControl.animalNameEntry.animalNameEntryAddressesTab.uIAddressInfoBblIcon.isDisplayed());
				
			}
			
        	

        }
        public void VerifyAdditionSuccessfulMessage() {
    		String UpdateMessage = uIMapAnimalControl.animalNameEntry.uILeftSideStatusBar.getText();
    		verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
    		Playback.wait(2000);
    	}
        public void VerifyUpdateSuccessfulMessage() {
    		String UpdateMessage = uIMapAnimalControl.animalNameEntry.uILeftSideStatusBar.getText();
    		verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
    		Playback.wait(2000);
    	}

	public class AnimalNameEntryActivityTab{
        	
        	public void selectGridRowByActivityType() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalNameEntry.animalNameEntryActivityTab.uIActivityTable, PoliceData.getAnimalControlModuleValue("Activity Type"));

			}
        	
        	
        }
	public void verifyAtNameID(String NameID) {
		 String ID = uIMapAnimalControl.animalNameEntry.uINameTypeEdit.getAttribute("value");
		String  AnimalNameID = ID +"-"+ NameID;
		 System.out.println(AnimalNameID);
		verify.ExpectedPropertyValueIsEqual( PoliceData.getAnimalControlModuleValue("AnimalNameId"), AnimalNameID);
		
		 
	}
	public void clickRefreshButton() {
		uIMapAnimalControl.animalNameEntry.uIRefreshButton.click();
		
	}
	public void clickAtImage() {
		uIMapAnimalControl.animalNameEntry.uIImageArea.click();
	}
	
    }

    
    public class AnimalRegistrationSearch
    {
    	public void enterAtRegEntry()
    	{
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryYearEdit.sendKeys(PoliceData.getAnimalControlModuleValue("RegNo").substring(0, 2));
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryYearEdit.sendKeys(Keys.TAB);
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryNumberEdit.sendKeys(PoliceData.getAnimalControlModuleValue("RegNo").substring(3));
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryNumberEdit.sendKeys(Keys.TAB);
    		 Playback.controlReadyThreadWait();
    	}
    	public void enterAtRegEntry(String regNo)
    	{
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryYearEdit.sendKeys(regNo.substring(0, 2));
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryYearEdit.sendKeys(Keys.TAB);
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryNumberEdit.sendKeys(regNo.substring(3));
    		 uIMapAnimalControl.animalRegistrationSearch.uIRegEntryNumberEdit.sendKeys(Keys.TAB);
    		 Playback.controlReadyThreadWait();
    	}
    	public void enterAtAnimalLastName()
    	{
    		
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalLastNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalLastNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtAnimalFirstName()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalFirstNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalFirstNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtAnimalMiddleName()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalmiddleNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalMiddleName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIAnimalmiddleNameEdit.sendKeys(Keys.TAB);
    		
    	}
    	public void enterAtOwnerlLastName()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerLastNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerLastName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerLastNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtOwnerFirstName()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerFirstNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerFirstName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerFirstNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtOwnerMiddleName()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerMiddleNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerMiddleName"));
    		uIMapAnimalControl.animalRegistrationSearch.uIOwnerMiddleNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtIssueFromDate()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIIssueFromDateEdit.sendKeys(PoliceData.getAnimalControlModuleValue("IssueFromDate"));
    	}
    	public void enterAtIssueToDate()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIIssueToDateEdit.sendKeys(PoliceData.getAnimalControlModuleValue("IssueToDate"));
    	}
    	public void enterAtExpirationFromDate()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIExpirationFromDateEdit.sendKeys(PoliceData.getAnimalControlModuleValue("ExpireFromDate"));
    	}
    	public void enterAExpirationToDate()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIExpirationToDateEdit.sendKeys(PoliceData.getAnimalControlModuleValue("ExpireToDate"));
    	}
    	public void selectAtLicType()
    	{
    		objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalRegistrationSearch.uILicTagTypeDropdown, PoliceData.getAnimalControlModuleValue("LicTagType")); 
    				
    	}
    	public void clickAddNew()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uIAddNewButton.click();
    	}
    	public void clickSearch()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uISearchButton.click();
    		
    	}
    	public void selectGridrowByRegNo()
    	{
    		Playback.controlReadyThreadWait();
    		Playback.controlReadyThreadWait();
    		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalRegistrationSearch.uIgridResultsTable, PoliceData.getAnimalControlModuleValue("RegNo"));
    	}

public void selectGridrowByLicTagType()
    	{
    		Playback.controlReadyThreadWait();
    		Playback.controlReadyThreadWait();
    		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalRegistrationSearch.uIgridResultsTable, PoliceData.getAnimalControlModuleValue("LicTagType"));
    	}
    	public void selectGridrowByAnimalName()
    	{
    		Playback.controlReadyThreadWait();
    		Playback.controlReadyThreadWait();
    		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalRegistrationSearch.uIgridResultsTable, PoliceData.getAnimalControlModuleValue("AnimalName"));
    	}
    	public void reloadAnimalRegistrationSearch()
        {
            objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Animal Registration Search", "Reload Tab");
        }
    	
    	public void enterAtLicTagNo()
    	{
    		uIMapAnimalControl.animalRegistrationSearch.uILicTagFieldEdit.sendKeys(PoliceData.getAnimalControlModuleValue("LicTagNo"));
    		uIMapAnimalControl.animalRegistrationSearch.uILicTagFieldEdit.sendKeys(Keys.TAB);
    		
    	}
    	
    	public void selectAtLicenseIssuingAgency()
    	{
    		objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalRegistrationSearch.uILicenseIssuingAgencyDropdown, PoliceData.getAnimalControlModuleValue("LicenseIssuingAgency"));
    		uIMapAnimalControl.animalRegistrationSearch.uILicenseIssuingAgencyDropdown.sendKeys(Keys.TAB);
    	}
    	
    	public void verifyLicTagDisplayedInGrid() {
            String innerText = objectIdentification.manualIdentify.getGridCellInnerText(
                         uIMapAnimalControl.animalRegistrationSearch.uIgridResultsTable, "Lic/Tag#", 0);
            verify.ExpectedPropertyValueIsEqual(innerText, PoliceData.getAnimalControlModuleValue("LicenseOrTag"));
     }
		public void clickReset() {
			uIMapAnimalControl.animalRegistrationSearch.uIResetButton.click();
			
		}
		public void clickBack() {
			uIMapAnimalControl.animalRegistrationSearch.uIBackButton.click();
			
		}
		public void selectAtSpecies()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalRegistrationSearch.uISpeciesDropdown, PoliceData.getAnimalControlModuleValue("Species"));
            
        }
    }
    public class AnimalCageRental
    {
    	public void enterAtIssuingPF()
    	{
    		uIMapAnimalControl.animalCageRental.uIIssuingPFCodeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("IssuingPF"));
    	}
    	public void enterAtIssuedPF()
    	{
    		uIMapAnimalControl.animalCageRental.uIIssuedPFCodeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("IssuedPF"));
    	}
    	public void enterAtNameID()
    	{
    		uIMapAnimalControl.animalCageRental.uIIssuedNameType.sendKeys(PoliceData.getAnimalControlModuleValue("NameID").substring(0, 2));
    		uIMapAnimalControl.animalCageRental.uIIssuedNameType.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalCageRental.uIIssuedNameID.sendKeys(PoliceData.getAnimalControlModuleValue("NameID").substring(3));
    		uIMapAnimalControl.animalCageRental.uIIssuedNameID.sendKeys(Keys.TAB);
    	}
    	public void enterAtInventoryNo()
    	{
    		uIMapAnimalControl.animalCageRental.uIInvYearEdit.sendKeys(PoliceData.getAnimalControlModuleValue("InventoryNo").substring(0, 3));
    		uIMapAnimalControl.animalCageRental.uIInvYearEdit.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalCageRental.uIInvNoEdit.sendKeys(PoliceData.getAnimalControlModuleValue("InventoryNo").substring(4));
    		uIMapAnimalControl.animalCageRental.uIInvNoEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtInventoryNo(String invNo)
    	{
    		uIMapAnimalControl.animalCageRental.uIInvYearEdit.sendKeys(invNo.substring(0, 3));
    		uIMapAnimalControl.animalCageRental.uIInvYearEdit.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalCageRental.uIInvNoEdit.sendKeys(invNo.substring(4));
    		uIMapAnimalControl.animalCageRental.uIInvNoEdit.sendKeys(Keys.TAB);
    	}
    }
    
    public class AnimalRegistrationEntry
    {
    	public AnimalRegistrationEntryApplicantTab animalRegistrationEntryApplicantTab;
    	public AnimalRegistrationEntryFeesTab animalRegistrationEntryFeesTab;
    	public AnimalRegistrationEntryNotesOrConditionsTab animalRegistrationEntryNotesOrConditionsTab;
    	
    	  public AnimalRegistrationEntry() {
              if (animalRegistrationEntryFeesTab == null)
            	  animalRegistrationEntryFeesTab = new AnimalRegistrationEntryFeesTab();

              if (animalRegistrationEntryApplicantTab == null)
            	  animalRegistrationEntryApplicantTab = new AnimalRegistrationEntryApplicantTab();
              
              if (animalRegistrationEntryNotesOrConditionsTab == null)
            	  animalRegistrationEntryNotesOrConditionsTab = new AnimalRegistrationEntryNotesOrConditionsTab();
       }
    	  
    	  public void clickAtFeesTab()
    	  {
    		  uIMapAnimalControl.animalRegistrationEntry.uIFeesTab.click();
    	  }
    	  public void clickApplicantsTab()
      	{
      		uIMapAnimalControl.animalRegistrationEntry.uIApplicantTab.click();
      		Playback.pageLoadThreadWait();
      	}
    	public void selectAtLicType()
    	{
    		Playback.controlReadyThreadWait();
    		objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalRegistrationEntry.uILicTagTypeDropdown, PoliceData.getAnimalControlModuleValue("LicTagType")); 
    				
    	}
    	public void tabAtIssueDateandTime()
    	{
    		Playback.controlReadyThreadWait();
    		uIMapAnimalControl.animalRegistrationEntry.uIIssuedDateEdit.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalRegistrationEntry.uIIssuedTimeEdit.sendKeys(Keys.TAB);
    	}
    	public void clickAnimalNameInfoBubbleIcon()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameInfoIcon.click();
    		Playback.controlReadyThreadWait();
    	}
    	public void enterAtLicTagNo(int slno)
    	{
    		if(slno==0)
    		{
    		uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.clear();
    		uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.sendKeys( PoliceData.getAnimalControlModuleValue("LicenseOrTag"));
    		}
    		else
    		{
    			uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.clear();
        		uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.sendKeys( PoliceData.getAnimalControlModuleValue("LicenseOrTag"+slno+""));
    		}
    	}
    	public void enterExpireDateAsFutureDate()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIExpirationDateEdit.clear();
    		uIMapAnimalControl.animalRegistrationEntry.uIExpirationDateEdit.sendKeys(Randomized.getFutureDate(5));
    	}
    	public void enterAtAnimalLastName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalLastNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalLastNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtAnimalFirstName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalFirstNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
    		
    	}
    	public void enterAtAnimalMiddleName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalmiddleNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalMiddleName"));
  			
    	}
    	public void enterAtAnimalNameID(int slno)
    	{
    		if(slno==0)
    		{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(3));
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);
    		}
    		else
    		{
    			uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID"+slno+"").substring(3));
    			uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);
    		}
    	}
    	public void enterAtAnimalNameIDActiveData(String AnimalNameID)
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(AnimalNameID);
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);
    		Playback.controlReadyThreadWait();
    	}
    	public void verifyAtAnimalName()
    	{
    		String lastname =uIMapAnimalControl.animalRegistrationEntry.uIAnimalLastNameEdit.getAttribute("value");
    		String firstName =uIMapAnimalControl.animalRegistrationEntry.uIAnimalFirstNameEdit.getAttribute("value");
    		String animalname =lastname+", "+firstName;
    		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("AnimalName"), animalname);
    	}
    	public void verifyAtOwnerNameRequiredAck()
    	{
    		Playback.controlReadyThreadWait();
    		popup.acknowledge.okWithExpectedMessage("(7145) Owner’s Name is required.");
    	}
    	
    	public void clickSave()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uISaveButton.click();
    	}
    	public void save()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uISaveButton.click();
    		popup.confirm.yes();
    	}
    	public void saveNClose()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uISaveNCloseButton.click();
    		popup.confirm.yes();
    		Playback.controlReadyThreadWait();
    		Playback.controlReadyThreadWait();
    	}

		public void tabAtAnimalNameIDField() {
			uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.click();
			uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyLicTagAlreadyExistsAck() {
			popup.acknowledge.okWithExpectedMessage("(6040) Lic/Tag No Already exists");
			
		}

		public String readRegEntryNo() {
		String year= 	uIMapAnimalControl.animalRegistrationEntry.uIRegEntryYearEdit.getAttribute("value");
				String regNo= 	uIMapAnimalControl.animalRegistrationEntry.uIRegEntrynumberEdit.getAttribute("value");
		String regEntryNo = year+"-"+regNo;
		return regEntryNo;
		}

		public void enterAtLicTagNo()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.sendKeys(PoliceData.getAnimalControlModuleValue("LicenseOrTag"));
    		uIMapAnimalControl.animalRegistrationEntry.uILicTagEdit.sendKeys(Keys.TAB);
    	}
    	public void verifyExpirationDateAsFuturetDate()
    	{
    		String attribute = uIMapAnimalControl.animalRegistrationEntry.uIExpirationDateEdit.getAttribute("value");
    		System.out.println(attribute);
    		String currentDate = Randomized.getFutureDate(2);
    		verify.ExpectedValueIsTrue(attribute.contains(currentDate));
    	}
    	
    	public void enterAtAnimalNameID()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(3));
    		uIMapAnimalControl.animalRegistrationEntry.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);
    	}
    	
		public void verifyAtCostAndFeeTabInvoiceAmountAsSame() {
			
		String cost =	uIMapAnimalControl.animalRegistrationEntry.uICost.getAttribute("value");
		Playback.controlReadyThreadWait();
		clickAtFeesTab();
		Playback.controlReadyThreadWait();
		String InvoiceAmount =uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryFeesTab.uIInvoiceAmount.getAttribute("value");
		verify.ExpectedPropertyValueIsEqual(cost, InvoiceAmount);
		}
		public void switchToNotesOrConditionsTab()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.uINotesOrConditionTab.click();
    		Playback.pageLoadThreadWait();
//    		objectIdentification.windowHandle.switchToFrame("contentIframe");
//    		objectIdentification.windowHandle.switchToFrame("usrAnimalEntryNotes");
    		objectIdentification.windowHandle.switchToFrame(uIMapAnimalControl.animalRegistrationEntry.uINotesOrConditionsIFrame);
    	}
    	
    	public void closeScreen()
    	{
    		Playback.controlReadyThreadWait();
    		uIMapAnimalControl.animalLostOrFoundEntry.driver.close();
    	}

    	public void selectIssuingAgency() {
            objectIdentification.randomIdentify.selectDropDownOption(
                          uIMapAnimalControl.animalRegistrationEntry.uIIssuingAgencyDropdown);
            uIMapAnimalControl.animalRegistrationEntry.uIIssuingAgencyDropdown.sendKeys(Keys.TAB);
      }

    	public void verifyEnterLicTagAck() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Lic/Tag No.");
			
		}


public void verifyAtRegEntryNo()
    	{
    		String RegEntryNo=uIMapAnimalControl.animalRegistrationEntry.uIRegEntrynumberEdit.getAttribute("value");
    		String RegEntryYear=uIMapAnimalControl.animalRegistrationEntry.uIRegEntryYearEdit.getAttribute("value");
    		String regEntryNo = RegEntryYear+"-"+RegEntryNo;
    		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("RegNo"),  regEntryNo);
    	}
    }
    public class AnimalRegistrationEntryApplicantTab
    {
    	
    	public void enterAtOwnerlLastName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerLastNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerLastName"));
    		
    	}
    	public void enterAtOwnerFirstName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerFirstNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerFirstName"));
    		uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerFirstNameEdit.sendKeys(Keys.TAB);
    	}
    	public void enterAtOwnerMiddleName()
    	{
    		uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerMiddleNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("OwnerMiddleName"));
    		uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerMiddleNameEdit.sendKeys(Keys.TAB);
    	}
    	public void verifyAtOwnerNameID()
    	{
    	String type =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerNameTypeEdit.getAttribute("value");
    	String nameID =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerNameTypeIDEdit.getAttribute("value");
    	String ownerID = type+"-"+nameID;
    	verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("OwnerNameID"), ownerID);
    	}
    	public void verifyOwnerNameIDAsEmpty()
    	{
    	String type =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerNameTypeEdit.getAttribute("value");
    	String nameID =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerNameTypeIDEdit.getAttribute("value");
    	String ownerID = type+"-"+nameID;
    	verify.ExpectedPropertyValueIsEqual("-", ownerID);
    	}
    	public void verifyAtVetnerianNameID()
    	{
    	String type =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIVeterinarianNameTypeEdit.getAttribute("value");
    	String nameID =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIVeterinarianNameTypeIDEdit.getAttribute("value");
    	String VetnerianID = type+"-"+nameID;
    	verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("VetnerianNameID"), VetnerianID);
    	}

    	public void verifyAtOwnerName(int slno)
    	{
    		Playback.controlReadyThreadWait();
    		String last =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerLastNameEdit.getAttribute("value");
        	String first =	uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.uIOwnerFirstNameEdit.getAttribute("value");
        	String ownerName = last+", "+first;
        	
        	if(slno ==0)
        	{
        	verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("OwnerName"), ownerName);
        	}
        	else
        	{
        		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("OwnerName"+slno+""), ownerName);
        	}
    	}
    	
    }
    public class AnimalRegistrationEntryFeesTab
    {
    	public void verifyAtDescription()
    	{
    		
    	}
    	
    }
    
    public class AnimalRegistrationEntryNotesOrConditionsTab
    {
    	
    	public void enterAtNotes()
    	{
    		WebElement findElement = uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.uINotesEdit;
    		findElement.sendKeys(PoliceData.getAnimalControlModuleValue("Notes"));
    	}
    	
    	public void verifyAtNotes()
    	{
    		WebElement findElement = uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.uINotesEdit;
    		String text = findElement.getText();
    		verify.ExpectedValueIsTrue(text.contains(PoliceData.getAnimalControlModuleValue("Notes")));
    		
    	}

    	public void enterNotes()
    	{
    		WebElement findElement = uIMapAnimalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.uINotesEdit;
    		findElement.sendKeys(Randomized.randomAlphanumeric(10));
    	}
    }
    public class AnimalLostOrFoundEntry
    {
    	public void sendTabToAnimalNameFields()
    	{
    		Playback.controlReadyThreadWait();
    		uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameTypeID.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLastName.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalFirstName.sendKeys(Keys.TAB);
    		uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalMiddleName.sendKeys(Keys.TAB);
    	}
    	public void closeScreen()
    	{
    		Playback.controlReadyThreadWait();
    		uIMapAnimalControl.animalLostOrFoundEntry.driver.close();
    	}
        public void saveScreen() {
            uIMapAnimalControl.animalLostOrFoundEntry.uISaveButton.click();
            popup.confirm.yes();
     }

     public void saveNClose() {
            uIMapAnimalControl.animalLostOrFoundEntry.uISaveNCloseButton.click();
            popup.confirm.yes();
     }

     public void tabReportedDateAndTime()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportedDate.sendKeys(Keys.TAB);
		   Playback.controlReadyThreadWait();
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportedTime.sendKeys(Keys.TAB);
		   
	   }
	     
	   public void tabOutLostOrFoundDateAndTime()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uILostOrFoundDate.sendKeys(Keys.TAB);
		   Playback.controlReadyThreadWait();
		   uIMapAnimalControl.animalLostOrFoundEntry.uILostOrFoundTime.sendKeys(Keys.TAB);
	   }
	     
	   public void enterAtAnimalLostOrFoundLocation()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLostOrFoundLocation.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLostOrFoundLocation"));
		   uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLostOrFoundLocation.sendKeys(Keys.TAB);
	   }
	   
	   public void clickFoundCheckBox()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIFoundCheckBox.click();
	   }
	   
	   public void clickLostCheckBox()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uILostCheckBox.click();
	   }
	   
	   public void clickAnimalShelterRadioButtonAsYes()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalShelterYesRadioButton.click();
	   }
	   
	   public void enterAtReportingPersonsNameID()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonNameType.sendKeys(PoliceData.getAnimalControlModuleValue("ReportingPersonsNameID").substring(0, 1));
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonNameType.sendKeys(Keys.TAB);
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonNameTypeID.sendKeys(PoliceData.getAnimalControlModuleValue("ReportingPersonsNameID").substring(2));
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonNameTypeID.sendKeys(Keys.TAB);
		   
	   }
	   
	   public void clickAnimalCollarOrHalterCheckBox()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalCollarOrHalterCheckkBox.click();
	   }
	   
	   public void clickReportingPersonsInfoRadioButtonAsYes()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonsInfoYesRadioButton.click();
	   }
	   
	   public void enterAnimalNameIDByActiveData(String AnimalNameID) 
     {
			uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameType.sendKeys(AnimalNameID.substring(0, 2));
			uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameTypeID.sendKeys(AnimalNameID.substring(3));
			uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameTypeID.sendKeys(Keys.TAB);
			   Playback.controlReadyThreadWait();
		} 
	   
	   public void clickPrintIcon()
	   {
		   uIMapAnimalControl.animalLostOrFoundEntry.uIPrintButton.click();
		   Playback.pageLoadThreadWait();
	   }
	   
	   public void verifyAnimalNameBubbleIconDisplayed() {
           verify.ExpectedValueIsTrue(uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameBubbleIcon.isDisplayed());

           }
       public void verifyFoundCheckBoxIsDisabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uIFoundCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsEqual(status, "true");
    }

    public void verifyFoundCheckBoxIsEnabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uIFoundCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsNotEqual(status, "true");
    }

    public void verifyAnimalLocatedCheckBoxIsDisabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLocationCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsEqual(status, "true");
    }

    public void verifyAnimalLocatedCheckBoxIsEnabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLocationCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsNotEqual(status, "true");
    }

    public void verifyLostCheckBoxIsDisabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uILostCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsEqual(status, "true");
    }

    public void verifyLostCheckBoxIsEnabled() {
           String status = uIMapAnimalControl.animalLostOrFoundEntry.uILostCheckBox.getAttribute("disabled");
           verify.ExpectedPropertyValueIsNotEqual(status, "true");
    }

    public void verifyAddressLostFoundBubbleIcon() {
        verify.ExpectedValueIsTrue(uIMapAnimalControl.animalLostOrFoundEntry.uIAddressBubbleIcon.isDisplayed());
        }

        public void enterAtAnimalNameID() {
               uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameType
                            .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(0, 2));
               uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameTypeID
                            .sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(3));
               uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalNameTypeID.sendKeys(Keys.TAB);
               Playback.controlReadyThreadWait();
        }

        public void clickMayWeShareReportingPersonInformationAsYes() {
               uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonsInfoYesRadioButton.click();
        }

        public void verifyReportingPersonBubbleIconDisplayed() {
               verify.ExpectedValueIsTrue(
                            uIMapAnimalControl.animalLostOrFoundEntry.uIReportingPersonBubbleIcon.isDisplayed());

        }

        public void verifyPrintIconEnabled() {
        verify.ExpectedValueIsTrue(uIMapAnimalControl.animalLostOrFoundEntry.uIPrintButton.isEnabled());
        }

        public void verifySaveIconDisabled() {
               String status = uIMapAnimalControl.animalLostOrFoundEntry.uISaveButton.getAttribute("disabled");
               verify.ExpectedPropertyValueIsEqual(status, "true");
        }

        public void verifySaveNCloseIconDisabled() {
               String status = uIMapAnimalControl.animalLostOrFoundEntry.uISaveNCloseButton.getAttribute("disabled");
               verify.ExpectedPropertyValueIsEqual(status, "true");
        }

        public void verifyRefreshIconDisabled() {
               String status = uIMapAnimalControl.animalLostOrFoundEntry.uIResetButton.getAttribute("disabled");
               verify.ExpectedPropertyValueIsEqual(status, "true");
        }

        public void verifyLostCheckBoxCheckedAndDisabled() {
        verify.ExpectedValueIsTrue(uIMapAnimalControl.animalLostOrFoundEntry.uILostCheckBox.isSelected());

               String status = uIMapAnimalControl.animalLostOrFoundEntry.uILostCheckBox.getAttribute("disabled");
               verify.ExpectedPropertyValueIsEqual(status, "true");

        }

        public void verifyAnimalLocatedCheckBoxCheckedAndDisabled() {
        verify.ExpectedValueIsTrue(uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLocationCheckBox.isSelected());

               String status = uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLocationCheckBox.getAttribute("disabled");
               verify.ExpectedPropertyValueIsEqual(status, "true");

        }

        public void clickAnimalLocatedCheckBox() {
               uIMapAnimalControl.animalLostOrFoundEntry.uIAnimalLocationCheckBox.click();
        }

	   
    }
    public class AnimalLostFoundSearch
    {
    	
    }
    public class AnimalCaseSearch {

		public AnimalCaseSearch() {

		}

		public void selectAtNameType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uINameType,
					PoliceData.getAnimalControlModuleValue("NameType"));
		}

		public void enterAtNameID() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uINameIDEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("NameID"));
		}

		public void enterAtLastName() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uILastNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("LastName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIFirstNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("FirstName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectAtAnimalNameType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalNameType,
					PoliceData.getAnimalControlModuleValue("AnimalNameType"));
		}

		public void enterAtAnimalNameID() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalNameIDEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID"));
		}

		public void enterAtAnimalLastName() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalLastNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalLastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAnimalFirstName() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalFirstNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIAnimalFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapAnimalControl.animalCaseSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapAnimalControl.animalCaseSearch.uIAddNewButton.click();
		}

		public void clickResetButton() {
			uIMapAnimalControl.animalCaseSearch.uIResetButton.click();
		}

		public void enterAtCaseNo() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICaseYearEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CaseNo").substring(0, 2));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICaseNumberEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CaseNo").substring(3));
		}

		public void enterAtCallNo() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICallYearEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CallNo").substring(0, 2));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICallNumberEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CallNo").substring(3));
		}

		public void enterAtLocation() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uILocationEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("Location"));
		}

		public void enterAtOfficer() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIOfficerEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("Officer"));
		}

		public void enterAtCFS() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICFSEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CFS"));
		}

		public void selectAtCage()
		{
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICageNoinput.click();
		objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(	uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uICageNoDropdown,
				PoliceData.getAnimalControlModuleValue("CageNo"));
		}
		public void enterAtACENo() {
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIACEYearEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("ACENo").substring(0, 2));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseSearch.animalCaseSearchBasicTab.uIACENumberEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("ACENo").substring(3));
		}

		
		public void selectRowByAtAceNo() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResultGrid,
					PoliceData.getAnimalControlModuleValue("ACENo"));
		}

		 public void selectAtCaseNoInGrid()
	        {
	        	objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResulTable, PoliceData.getAnimalControlModuleValue("CaseNo"));
	        	
	        }
		 
		 public void selectRowByAtAceNo1() {
             Playback.gridLoadThreadWait();
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                          uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResultGrid,
                          PoliceData.getAnimalControlModuleValue("ACENo1"));
      }

      public void clickIntakeCheckBoxAndVerifyOtherCheckboxesUnChecked() {
             uIMapAnimalControl.animalCaseSearch.uIIntakeCheckbox.click();
      verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIDischargedCheckBox.isSelected());
             Playback.controlReadyThreadWait();
          verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIBothCheckBox.isSelected());
      }

      public void clickDischargedCheckBoxAndVerifyOtherCheckboxesUnChecked() {
             uIMapAnimalControl.animalCaseSearch.uIDischargedCheckBox.click();
        verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIIntakeCheckbox.isSelected());
             Playback.controlReadyThreadWait();
          verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIBothCheckBox.isSelected());
      }

      public void clickBothCheckBoxAndVerifyOtherCheckboxesUnChecked() {
             uIMapAnimalControl.animalCaseSearch.uIBothCheckBox.click();
      verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIDischargedCheckBox.isSelected());
             Playback.controlReadyThreadWait();
        verify.ExpectedValueIsFalse(uIMapAnimalControl.animalCaseSearch.uIIntakeCheckbox.isSelected());
      }

      public void selectFirstRowFromGrid() {
             Playback.gridLoadThreadWait();
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                          uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResultGrid,
                          PoliceData.getAnimalControlModuleValue("CaseNo"), 0);
      }

      public void clickBackButton() {
             uIMapAnimalControl.animalCaseSearch.uIBackButton.click();
      }

      public void verifyBothIntakeAndDischargedEntryIsPresent() {
             String row1 = objectIdentification.manualIdentify
                          .getGridCellInnerText(uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResultGrid, "ACE#", 0);
             verify.ExpectedPropertyValueIsEqual(row1, PoliceData.getAnimalControlModuleValue("ACENo1"));

             String row2 = objectIdentification.manualIdentify
                          .getGridCellInnerText(uIMapAnimalControl.animalCaseSearch.uIAnimalCaseSearchResultGrid, "ACE#", 1);
             verify.ExpectedPropertyValueIsEqual(row2, PoliceData.getAnimalControlModuleValue("ACENo"));

      }

	public void selectAtResolutions() {
		uIMapAnimalControl.animalCaseSearch.uIResolutionsInput.click();
		objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(uIMapAnimalControl.animalCaseSearch.uIResolutionsDropdown,PoliceData.getAnimalControlModuleValue("Resolutions"));
		uIMapAnimalControl.animalCaseSearch.uIResolutionsInput.sendKeys(Keys.TAB);
	}

	}

	public class AnimalCaseEntry {

		public AnimalCaseEntryMainTab animalCaseEntryMainTab;
		public AnimalCaseEntryAnimalInfoTab animalCaseEntryAnimalInfoTab;
		public AnimalCaseEntryObservationsTab animalCaseEntryObservationsTab;
		public AnimalCaseEntryResolutionsTab animalCaseEntryResolutionsTab;
		public AnimalCaseEntryBiteReportTab animalCaseEntryBiteReportTab;
		public NarrativeTab narrativeTab;
		public ReportingTab reportingTab;
		
		public AnimalCaseEntry() {

			if (this.animalCaseEntryMainTab == null)
				this.animalCaseEntryMainTab = new AnimalCaseEntryMainTab();

			if (this.animalCaseEntryAnimalInfoTab == null)
				this.animalCaseEntryAnimalInfoTab = new AnimalCaseEntryAnimalInfoTab();

			if (this.animalCaseEntryObservationsTab == null)
				this.animalCaseEntryObservationsTab = new AnimalCaseEntryObservationsTab();

			if (this.animalCaseEntryResolutionsTab == null)
				this.animalCaseEntryResolutionsTab = new AnimalCaseEntryResolutionsTab();

			if (this.animalCaseEntryBiteReportTab == null)
				this.animalCaseEntryBiteReportTab = new AnimalCaseEntryBiteReportTab();
			
			if (this.narrativeTab == null)
				this.narrativeTab = new NarrativeTab();
			
			if (this.reportingTab == null)
				this.reportingTab = new ReportingTab();

		}
		
		public void enterAtCallNo() {
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.uICallYearEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CallNo").substring(0, 2));
	uIMapAnimalControl.animalCaseEntry.uICallnumberEdit
			.sendKeys(PoliceData.getAnimalControlModuleValue("CallNo").substring(3));
	uIMapAnimalControl.animalCaseEntry.uICallnumberEdit
	.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo() {
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.uICaseYearEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("CaseNo").substring(0, 2));
	uIMapAnimalControl.animalCaseEntry.uICaseNumberEdit
			.sendKeys(PoliceData.getAnimalControlModuleValue("CaseNo").substring(3));
	uIMapAnimalControl.animalCaseEntry.uICaseNumberEdit
	.sendKeys(Keys.TAB);
		}

		public void clickMainTab() {
			uIMapAnimalControl.animalCaseEntry.uIMainTab.click();

		}

		public void clickAnimalInfoTab() {
			uIMapAnimalControl.animalCaseEntry.uIAnimalInfoTab.click();
			objectIdentification.windowHandle.switchToFrame("frmACIAnimalInfo");

		}

		public void clickObservationsTab() {
			uIMapAnimalControl.animalCaseEntry.uIObservationsTab.click();

		}

		public void clickResolutionsTab() {
			uIMapAnimalControl.animalCaseEntry.uIResolutionsTab.click();

		}

		public void clickBiteReportTab() {
			uIMapAnimalControl.animalCaseEntry.uIBiteReportTab.click();
objectIdentification.windowHandle.switchToFrame("ACIBiteReport");
		}

		public void clickNarrativeTab() {
			uIMapAnimalControl.animalCaseEntry.uINarrativeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
			Playback.controlReadyThreadWait();
		}
		public void clickReportingTab() {
			uIMapAnimalControl.animalCaseEntry.uIReportingTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBEReports");
		}

		public void clickAttachmentsTab() {
			uIMapAnimalControl.animalCaseEntry.uIAttachmentsTab.click();

		}

		public void enterAtLocation() {
			uIMapAnimalControl.animalCaseEntry.uILocationEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("Location"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void tabOutReportingDateAndTime() {
			uIMapAnimalControl.animalCaseEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtOfficer() {
			uIMapAnimalControl.animalCaseEntry.uIOfficerEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("Officer"));

		}

		public void selectAtComplaintType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAnimalControl.animalCaseEntry.uIComplaintTypeDropdown,
					PoliceData.getAnimalControlModuleValue("ComplaintType"));

		}

		public void selectComplaintTypeAsCrueltyToAnimals() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAnimalControl.animalCaseEntry.uIComplaintTypeDropdown, "Cruelty to Animals");

		}

		public void saveScreen() {
			uIMapAnimalControl.animalCaseEntry.uISaveButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yes();
			} else {

				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();
			}

		}

		public void clickSaveButton() {
			uIMapAnimalControl.animalCaseEntry.uISaveButton.click();
		}
		public void cancelSave()
		{
			Playback.controlReadyThreadWait();
			popup.confirm.no();
		}
		public void closeScreen()
		{
			uIMapAnimalControl.animalCaseEntry.driver.close();
		}

		public void saveNCloseScreen() {
			uIMapAnimalControl.animalCaseEntry.uISaveNCloseButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yes();
			} else {

				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();
			}
		}

		public void clickRefreshButton() {
			uIMapAnimalControl.animalCaseEntry.uIRefreshButton.click();
		}
		
		  public String readACENo()
	        {
	                  String Year =uIMapAnimalControl.animalCaseEntry.uIACEYearEdit.getAttribute("value");
	                  String Num = uIMapAnimalControl.animalCaseEntry.uIACENumberEdit.getAttribute("value");
	                  String ACENo = Year + "-" + Num;
	                  System.out.println(ACENo);
	                  return ACENo;
	        }
		  public void VerifyACENoGenerated()
	        {
	                  String Year =uIMapAnimalControl.animalCaseEntry.uIACEYearEdit.getAttribute("value");
	                  String Num = uIMapAnimalControl.animalCaseEntry.uIACENumberEdit.getAttribute("value");
	                verify.ExpectedValueIsTrue(Year.contains("2"));
	                verify.ExpectedValueIsTrue(Num.contains("000"));
	        }
		  public void VerifyAtACENo()
	        {
	                  String Year =uIMapAnimalControl.animalCaseEntry.uIACEYearEdit.getAttribute("value");
	                  String Num = uIMapAnimalControl.animalCaseEntry.uIACENumberEdit.getAttribute("value");
	                  String ACENo = Year + "-" + Num;
	                
	                  verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("ACENo"), ACENo);
	        }

		  public void verifyOfficerInfoIconIsDisplayed()
	        {
	        	uIMapAnimalControl.animalCaseEntry.uIOfficerInfoIcon.isDisplayed();
	        }

	 public void verifyLocationInfoIconIsDisplayed()
	        {
	        	uIMapAnimalControl.animalCaseEntry.uILocationInfoIcon.isDisplayed();
	        }
	 
	 public void tabReportedDateAndTime()
     {
     	uIMapAnimalControl.animalCaseEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
     	uIMapAnimalControl.animalCaseEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
     }
	 public void verifyAtLocation()
     {
          	String attribute = uIMapAnimalControl.animalCaseEntry.uILocationEdit.getAttribute("value");
          	verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getAnimalControlModuleValue("Location")));
     }
	 public void clickCaseInfoIcon()
	 {
		 uIMapAnimalControl.animalCaseEntry.uICaseNoLookup.click();
		 
	 }
		public void VerifyCaseReportedOnDateAndTime(String caseReportedDate, String caseReportedTime) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate,
					uIMapAnimalControl.animalCaseEntry.uIReportedDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime,
					uIMapAnimalControl.animalCaseEntry.uIReportedTimeEdit.getAttribute("value"));
		}
	 public void clickReset()
     {
     	uIMapAnimalControl.animalCaseEntry.uIRefreshButton.click();
     }
	 
			public void verifyCallNoShownAsNotMandatory() {
				
				String Black = "rgba(0, 0, 0, 1)";
				verify.ExpectedPropertyValueIsEqual(uIMapAnimalControl.animalCaseEntry.uICallNoLable.getCssValue("color"), Black);
			}
			public void verifyCallNoShownAsMandatory() {
			
				String red = "rgba(128, 0, 0, 1)";
				verify.ExpectedPropertyValueIsEqual(uIMapAnimalControl.animalCaseEntry.uICallNoLable.getCssValue("color"), red);
			}
			public void verifyEnterCallNumberAcknowledge()
			{
				popup.acknowledge.okWithExpectedMessage("(30033) Enter Call Number");
				
			}
			public void VerifyUpdatedDataExistsinTheAnimalInfoTabAcknowledge()
			{
				popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Animal Info Tab. You must save or reset.");
				
			}
			public void VerifyUpdatedDataExistsinTheNarrativeTabAcknowledge()
			{
				popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
				
			}
			public void VerifyUpdatedDataExistsinTheBiteReportTabAcknowledge()
			{
				popup.acknowledge.okWithExpectedMessage("(1051) Updated data exists in the Bite Report Tab. You must save or reset.");
				
			}
			
			public void checkInvestigationAuthorizedCheckBox() {
				uIMapAnimalControl.animalCaseEntry.uIInvestigationAuthorizedCheckBox.click();
			}
		
		public class AnimalCaseEntryMainTab {

			public void selectAtMunicipality() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uImunicipalityDropdown,
						PoliceData.getAnimalControlModuleValue("Municipality"));

			}

			public void enterAtCFSReportedViolation() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uICFSReportedViolationEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("CFSReportedViolation"));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uICFSReportedViolationEdit.sendKeys(Keys.TAB);

			}

			public void enterAtNameID() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uINameTypeEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("NameID").substring(0, 1));
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uINameTypeIDEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("NameID").substring(2));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uINameTypeIDEdit.sendKeys(Keys.TAB);

			}

			public void enterAtLastName() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uILastNameEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("LastName"));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uILastNameEdit.sendKeys(Keys.TAB);
			}

			public void enterAtFirstName() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIFirstNameEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("FirstName"));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			}

			public void selectAtActivity() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIActivityDropdown,
						PoliceData.getAnimalControlModuleValue("Activity"));

			}

			public void clickAddButton() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIAddButton.click();
			}

			public void enterAtInitialNatureOfComplaint() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIInitialNatureOfComplaintEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("InitialNatureOfComplaint"));
			}
			

			 public void verifyEnterActivityAcknowledgeMessage()
             {
          	   popup.acknowledge.okWithExpectedMessage("(30033) Enter Activity");
          	   Playback.controlReadyThreadWait();
             }
			 public void verifyEnterNameAcknowledgeMessage()
             {
				// popup.acknowledge.ok();
          	   popup.acknowledge.okWithExpectedMessage("(30033) Enter Name");
          	   Playback.controlReadyThreadWait();
             }


public void selectMunicipality()
             {
          	   objectIdentification.randomIdentify.selectDropDownOption(uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uImunicipalityDropdown);
             }


public String readPhone1()
             {
          	   String phone1 = uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIPhoneNumber1Edit.getAttribute("value");
          	   return phone1;
             }
             
             public String readPhone2()
             {
          	   String phone2 = uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIPhoneNumber2Edit.getAttribute("value");
          	   return phone2;
             }
             
             public void clickRowByAtActivityInGrid()
             {
          	   objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIMainTabResultTable, PoliceData.getAnimalControlModuleValue("Activity"));
          	   
             }
             public void verifyAtActivityInGrid(int rowIndex)
             {
          	 String value =  objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIMainTabResultTable, "Activity",rowIndex);
          	   verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("Activity"), value);
             }
             
             public void clickNameInfoButton()
             {
          	   uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uINameInfoButton.click();
             }
             
             public void verifyActivePhoneNumber1(String phone1)
   		  {
   			  String attribute = uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIPhoneNumber1Edit.getAttribute("value");
   			  verify.ExpectedValueIsTrue(attribute.contains(phone1));
   		  }
   		  
   		  public void verifyActivePhoneNumber2(String phone2)
   		  {
   			  String attribute = uIMapAnimalControl.animalCaseEntry.animalCaseEntryMainTab.uIPhoneNumber2Edit.getAttribute("value");
   			  verify.ExpectedValueIsTrue(attribute.contains(phone2));
   		  }

		}

		public class AnimalCaseEntryObservationsTab {

			public void selectAtAnimalName() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIAnimalNameDropdown,
						PoliceData.getAnimalControlModuleValue("AnimalNameID")+"-"+PoliceData.getAnimalControlModuleValue("AnimalName"));
			}

			public void taboutDateAndTime() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIDateEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uITimeEdit.sendKeys(Keys.TAB);
			}

			public void clickAddButton() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIAddButton.click();

			}

			public void clickIntakeCheckBox() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIIntakeCheckBox.click();
			}

			public void selectCageDropdownAsAS001() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uICageDropdown, "AS001");
			}
			public void VerifycageDropdownAsMandatory() {
				
				verify.ExpectedValueIsTrue(	uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uICageDropdownLable.getAttribute("style").contains("rgb(153, 0, 0)"));
			}
			public void verifyCageDropdownIsDisabled() {
				String attribute = uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uICageDropdown
						.getAttribute("class");
				verify.ExpectedValueIsTrue(attribute.contains("disabled"));
			}
			
			public void selectFirstAnimalNameInDropdown() {
                objectIdentification.manualIdentify.selectDropDownOption(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIAnimalNameDropdown, 1);
          }

          public void selectAtRowInGrid() {
                objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIObservationsGridTable,
                              PoliceData.getAnimalControlModuleValue("AnimalsName"));
          }

          public void selectAtRow1InGrid() {
                objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIObservationsGridTable,
                              PoliceData.getAnimalControlModuleValue("AnimalsName1"));
          }

          public void verifyIntakeCheckBoxChecked() {
                verify.ExpectedValueIsTrue(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIIntakeCheckBox
                                            .isSelected());
          }

          public void verifyAnimalNameInfoIconDisplayed() {
                verify.ExpectedValueIsTrue(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIAnimalNameInfoIcon
                                            .isDisplayed());
          }

		public void verifyRequiredEntriesMissingAcknowledge()
			{
				popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
				
			}

		public void selectAnimalHeldAt() {
			 objectIdentification.manualIdentify.selectDropDownOption(
                     uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIAnimalheldAt, 1);
		}

		public void selectMethodOfCapture() {
			 objectIdentification.manualIdentify.selectDropDownOption(
                     uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIMethodOfCapture, 1);
		}

		public void selectMethodOfIntake() {
			 objectIdentification.manualIdentify.selectDropDownOption(
                     uIMapAnimalControl.animalCaseEntry.animalCaseEntryObservationsTab.uIMethodOfIntake, 1);
			
		}

		}

		public class AnimalCaseEntryAnimalInfoTab {

			public void enterAtAnimalNameID() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalNameTypeEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(0, 1));
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalNameTypeIDEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalNameID").substring(2));
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalNameTypeIDEdit.sendKeys(Keys.TAB);

			}

			public void enterAtLastName() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalLastNameEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalLastNameEdit.sendKeys(Keys.TAB);
			}

			public void enterAtFirstName() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalFirstNameEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalFirstNameEdit
						.sendKeys(Keys.TAB);
			}

			public void clickAddButton() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAddButton.click();
			}
			public void clickClearButton() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIClearButton.click();
			}

			public void saveAnimalInfoTab() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoSaveButton.click();
				if (Playback.browserType.contains("Chrome")) {
					popup.confirm.yes();
				} else {

					popup.switchToConfirm();
					Playback.controlReadyThreadWait();
					popup.confirm.yes();
				}
			}

			public void verifyEnterAnimalNameAcknowledge() {
			
				// popup.acknowledge.ok();
	          	   popup.acknowledge.okWithExpectedMessage("(30033) Enter Animal Name");
	          	   Playback.controlReadyThreadWait();
	             
			}
			public void verifyDuplicationOfDataFoundAcknowledge() {
				
				// popup.acknowledge.ok();
	          	   popup.acknowledge.okWithExpectedMessage("(1019)Duplication Of Data Found");
	          	   Playback.controlReadyThreadWait();
	             
			}
public void verifyUpdateSuccessfulMessage() {
	System.out.println(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIBottomStatusLable.getText());
	verify.ExpectedPropertyValueIsEqual(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIBottomStatusLable.getText()," 1003 - Update Successful");
			
	             
			}
			

			public void verifyAtSex() {
			String value =objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfosexDropdown);
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("Sex"));
			}
			
			public void verifyAtBreed1() {
				String value =objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoBreed1Dropdown);
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("Breed1"));
			}

			public void verifyAtBreed2() {
				String value =objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoBreed2Dropdown);
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("Breed2"));
			}

			public void verifyAtDOB() {
				String value =uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoDOB.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("DOB"));
			}

			public void verifyAtMicroChipID() {
				String value =uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoMicroChipId.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("MicroChipID"));
			}

	
			public void verifyAtAnimalNameInGrid(int rowIndex) {
				String value =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoGridTable, "Animal Name", rowIndex);
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("AnimalName"));
			}

			public void verifyAtAnimalNameIDInGrid(int rowIndex) {
				String value =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.uIAnimalInfoGridTable, "Animal#", rowIndex);
				verify.ExpectedPropertyValueIsEqual(value, PoliceData.getAnimalControlModuleValue("AnimalNameID"));
			}

		}

		public class AnimalCaseEntryResolutionsTab {
			public void selectAtAnimalName() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIAnimalNameDropdown,
						PoliceData.getAnimalControlModuleValue("AnimalNameID")+"-"+PoliceData.getAnimalControlModuleValue("AnimalName"));
			}

			public void taboutDateAndTime() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIDateEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void clickAddButton() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIAddButton.click();

			}

			public void enterAtWarningSummons() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIWarningSummonsEdit.clear();
				Playback.controlReadyThreadWait();
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIWarningSummonsEdit
						.sendKeys(PoliceData.getAnimalControlModuleValue("WarningSummons"));
			}

			public void verifyAtEntryPresentInGrid() {
				List<WebElement> columnCells = objectIdentification.manualIdentify.getGridTableColumnCells(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsGridTable,
						"Citation#");
				for (WebElement column : columnCells) {
					verify.ExpectedPropertyValueIsEqual(column.getText(),
							PoliceData.getAnimalControlModuleValue("WarningSummons"));
				}
			}
			public void verifyAtAnimalNameInGrid(int rowIndex)
			{
				
			WebElement value=	objectIdentification.manualIdentify.getGridCell(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsGridTable,
						 rowIndex,6);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("AnimalName"),value.getText() );
			}
			

			public void enterWarningSummonsAsRandomText() {
				uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIWarningSummonsEdit
						.sendKeys(Randomized.randomAlphanumeric(5));
			}

			public void verifyInvalidCitationNoPopup() {
				if (Playback.browserType.contains("Chrome")) {
					popup.acknowledge.okWithExpectedMessage("(11519) Invalid Citation No");
				}

				else {
					popup.switchToAcknowledge();
					Playback.controlReadyThreadWait();
					popup.acknowledge.okWithExpectedMessage("(11519) Invalid Citation #");

				}

			}
			
            public void selectFirstAnimalNameInDropdown() {
                objectIdentification.manualIdentify.selectDropDownOption(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIAnimalNameDropdown, 1);
          }

          public void selectAtRowInGrid() {
                objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsGridTable,
                              PoliceData.getAnimalControlModuleValue("AnimalsName"), 0);
          }

          public void selectAtRow1InGrid() {
                objectIdentification.manualIdentify.selectGridRowByCellInnerText(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsGridTable,
                              PoliceData.getAnimalControlModuleValue("AnimalsName1"));
          }

          public void verifyDischargedCheckBoxChecked() {
                verify.ExpectedValueIsTrue(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIDischargedCheckBox
                                            .isSelected());
          }
          public void clickComplianceCheckBox() {
            
                            uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uICopmlianceCheckBox.click();
        }

          public void clickFollowupCallRequiredCheckBox() {
              
              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpCheckBox.click();
}

          public void verifyAnimalNameInfoIconDisplayed() {
                verify.ExpectedValueIsTrue(
                              uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIAnimalNameInfoIcon
                                            .isDisplayed());
          }

		public void verifyRequiredEntriesMissingAcknowledge()
			{
			popup.acknowledge.ok();
			//	popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
				
			}
		public void verifyFollowUpDatesDisabled()
		{
			String res =uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate1.getAttribute("readonly");
			System.out.println(res);
			   verify.ExpectedPropertyValueIsEqual("true", res);
			   String res1 =uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate2.getAttribute("readonly");
				   verify.ExpectedPropertyValueIsEqual("true", res1);
			 
		}
		public void verifyFollowUpDatesEnabled()
		{
			   verify.ExpectedValueIsTrue(	uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate1.isEnabled());
			   verify.ExpectedValueIsTrue(uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate2.isEnabled());
		}
		public void enterFollowUpDate1AsPrevious()
		{
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate1.sendKeys(Randomized.getPreviousDateByMonth(1));
		}
		public void  enterFollowUpDate2AsFuture()
		{
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIFollowUpDate2.sendKeys(Randomized.getFutureDate(5));
		}
		public void  enterResolutionDayACurrentDate()
		{
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionDate.sendKeys(Randomized.getCurrentDate());
			
		}
		public void selectHealthStatusOut()
		{
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIHealthSatusOutInput.click();
			objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(	uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIHealthSatusOutDropdown);
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIHealthSatusOutInput.sendKeys(Keys.TAB);
		}
		public void selectResolutions()
		{
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsInput.click();
			objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(	uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsDropdown);
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryResolutionsTab.uIResolutionsInput.sendKeys(Keys.TAB);
		}

		public void verifyAnimalDischargedConfirmationAsYes() {
			Playback.gridLoadThreadWait();
			popup.confirm.yes();
		}
		

		}

		

		
	}

	public class AnimalCaseEntryBiteReportTab {

		public void enterAtVictimNameID() {
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimNameTypeEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("VictimNameID").substring(0, 1));
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimNameTypeIDEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("VictimNameID").substring(2));
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimNameTypeIDEdit
			.sendKeys(Keys.TAB);
		}

		public void enterAtLastName() {
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimLastNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalLastName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimLastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimFirstNameEdit
					.sendKeys(PoliceData.getAnimalControlModuleValue("AnimalFirstName"));
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIAddButton.click();
		}
		
		public void clickVictimsNameInfoIcon()
        {
     	   uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIVictimsNameInfoIcon.click();
        }
        
        public void clickAtVictimsNameInGrid()
        {
     	   WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIBiteReportGridTable, PoliceData.getAnimalControlModuleValue("VictimsName"));
     	   gridRowByCellInnerText.click();
        }

		public void verifyEnterVictimsNameAcknowledge()
			{
			popup.acknowledge.ok();
			//	popup.acknowledge.okWithExpectedMessage("(30033) Enter Victims Name");
				
			}

		public void saveInternal() {
			 uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uISaveButton.click();
			 popup.confirm.yes();
			
		}

		public void selectAtAnimalsName() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption( uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIAnimalNameDropdown,
					 PoliceData.getAnimalControlModuleValue("AnimalNameID")+"-"+PoliceData.getAnimalControlModuleValue("AnimalName"));
		}

		public void selectAnimalHeldAt() {
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify.selectDropDownOption( uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIAnimalHeldAtDropDown);
		}
		public void selectAttack() {
			objectIdentification.randomIdentify.selectDropDownOption( uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIAttackDropdown);
		}

		public void selectAtLocationOfWounds() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption( uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uILocationOfWoundDropdown,
					 PoliceData.getAnimalControlModuleValue("LocationOfWounds"));
		}

		public void verifyAtVictimsName(int rowIndex) {

			WebElement value=	objectIdentification.manualIdentify.getGridCell(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIBiteReportGridTable,
						 rowIndex,6);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("VictimName"),value.getText() );
			}
		public void verifyAtAnimalNameIDinGrid(int rowIndex) {

			String value=	objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapAnimalControl.animalCaseEntry.animalCaseEntryBiteReportTab.uIBiteReportGridTable,"Animal#"
						 ,rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("AnimalNameID"),value);
			}
		

	}
	public class NarrativeTab
	{
		public void internalSave() {
			uIMapAnimalControl.animalCaseEntry.narrativeTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}
		public void clickLoadButton()
		{
			uIMapAnimalControl.animalCaseEntry.narrativeTab.uILoadButton.click();
		}
		public void selectAtTempelate()
		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAnimalControl.animalCaseEntry.narrativeTab.uITemplateComboBox, PoliceData.getK9ModuleValue("Template")); 
		}
		public void verifyAtText()
		{
			objectIdentification.windowHandle.switchToFrame(uIMapAnimalControl.animalCaseEntry.narrativeTab.uINarrativeRichTextEdit);
			verify.ExpectedValueIsTrue(uIMapAnimalControl.animalCaseEntry.narrativeTab.uITextBody.getText().contains(PoliceData.getK9ModuleValue("Text")));
		}
		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapAnimalControl.animalCaseEntry.narrativeTab.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}
	}
public class ReportingTab
{
	public void verifyReportTypeInGrid(String report, int idx)
	{
		Playback.gridLoadThreadWait();
	 String name =objectIdentification.manualIdentify.getGridCellInnerText(	uIMapAnimalControl.animalCaseEntry.reportingTab.uIReportingTable ,"Type",idx);
	 verify.ExpectedPropertyValueIsEqual(report, name);
	}
}
	
	
	
	public class AnimalNameMerge
	{
		public void enterAtPrimaryNameID()
		{
			uIMapAnimalControl.animalNameMerge.uINameIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("PrimaryNameID").substring(3));
			uIMapAnimalControl.animalNameMerge.uINameIDEdit.sendKeys(Keys.TAB);
		}
		public void enterAtMergeNameID()
		{
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalNameMerge.uINameMergeUNTypeEdit.click();
			uIMapAnimalControl.animalNameMerge.uINameMergeUNTypeEdit.sendKeys(PoliceData.getAnimalControlModuleValue("MergeNameID").substring(0,1));
			uIMapAnimalControl.animalNameMerge.uINameMergeUNTypeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			uIMapAnimalControl.animalNameMerge.uINameMergeUNIDEdit.sendKeys(PoliceData.getAnimalControlModuleValue("MergeNameID").substring(3));
			uIMapAnimalControl.animalNameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
		}
		
		public void verifyNameMergedSuccessful()
        {
            String AdditionMessage = uIMapAnimalControl.animalNameMerge.uIBottomLeftSideStatusBar.getText();
            verify.ExpectedValueIsTrue(AdditionMessage.contains("6053 - Names merged successfully"));
            Playback.wait(2000);
        }
		public void enterAtMergeLastName()
		{
			uIMapAnimalControl.animalNameMerge.uINameMergeLastNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("MergeLastName"));
		}
		public void enterAtMergeFirstName()
		{
			uIMapAnimalControl.animalNameMerge.uINameMergeFirstNameEdit.sendKeys(PoliceData.getAnimalControlModuleValue("MergeFirstName"));
		}
		public void clickSearchButton()
		{
			uIMapAnimalControl.animalNameMerge.uISearchButton.click();
			
		}
		public void clickMergeButton()
		{
			uIMapAnimalControl.animalNameMerge.uIMergeButton.click();
		}
		public void selectRowCheckBoxByAnimalName()
		{
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapAnimalControl.animalNameMerge.uINameMergeLstResultTable, PoliceData.getAnimalControlModuleValue("MergeAnimalName"));
		}
		public void verifyAtPrimaryNameValidated()
		{
			String src =uIMapAnimalControl.animalNameMerge.uINameBblIcon.getAttribute("src");
			verify.ExpectedValueIsTrue(src.contains("debug.gif"));
		}
		public void verifyAtMergingNameValidated()
		{
			verify.ExpectedValueIsTrue(uIMapAnimalControl.animalNameMerge.uIMergeNameBblIcon.isDisplayed());
		}
		public void verifyAtAnimalNameInMergeTable(int rowIndex)
		{
		String name =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameMerge.uINameMergeLstResultTable,"Name",rowIndex);
		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("MergeAnimalName"), name);
		
		}
		public void verifyAtAnimalIDInMergeTable(int rowIndex)
		{
		String ID =	objectIdentification.manualIdentify.getGridCellInnerText(uIMapAnimalControl.animalNameMerge.uINameMergeLstResultTable,"ID",rowIndex);
		verify.ExpectedPropertyValueIsEqual(PoliceData.getAnimalControlModuleValue("MergeAnimalID"), ID);
		
		}
		public void verifySameNameCannotBeMergedAcknowledge()
		{
			popup.acknowledge.okWithExpectedMessage("(6056) Same names cannot be merged");
		}
		public void verifyNameMergedSuccessfullyAcknowledge()
        {
            popup.acknowledge.okWithExpectedMessage("6053 - Names merged successfully");
        }
		public void verifyMergeButtonEnabled()
        {
            verify.ExpectedValueIsTrue(uIMapAnimalControl.animalNameMerge.uIMergeButton.isEnabled());
        }
		public void verify6071MergedNameIDsAcknowledge()
		{
		
			
			String ackMsg = "(6071) "+PoliceData.getAnimalControlModuleValue("MergeNameID")+" Merged With "+PoliceData.getAnimalControlModuleValue("PrimaryNameID")+"";
			popup.acknowledge.okWithExpectedMessage(ackMsg);
		}
		public void clickResetButton() {
			uIMapAnimalControl.animalNameMerge.uIResetButton.click();
			
		}
		public void selectcheckbox()
        {
            Playback.driver.findElement(By.xpath("//table/tbody/tr/td/img[contains(@src, 'checkbox_off.gif')]")).click();
        }
		
	}
	public class AnimalNameMergeHelpWindow
	{
		public void clickMergeButton()
		{
			uIMapAnimalControl.animalNameMergeHelpWindow.uIMergeButton.click();
		}
		public void verify6130AddressUpdateAsOtherAddressConfirmation() 
		{
			popup.confirm.yesWithExpectedMessage("(6130) Update the address as an Other Address in the merged Animal Name entry?");
		}
		public void veify6065MergeFieldReplaceWithPrimaryFieldConfirmation()
		{
			popup.confirm.yesWithExpectedMessage("(6065) Selected Merge fields will replace Primary fields. Do you want to proceed? ");
		}
		public void verifyAtNameMergedSuccessfullyAcknowledge() {
		
			popup.acknowledge.okWithExpectedMessage("6053 - Names merged successfully");
			
		}
		
		
	}
	
	public class AnimalNameEntryCommentsTab {
		public void EnterComments() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uISubjectEdit.sendKeys("Automation");
		}

		public void ClickEnterCommentsButton() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uIEnterCommentsButton.click();
		}

		public void VerifyCurrentDate() {
			String commentsDate = uIMapNames.nameEntry.nameEntryCommentsTab.uIDateTextView.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(commentsDate, Randomized.getCurrentDate());
		}

		public void VerifyMColumn(int rowIndex) {
			WebElement uICommentCell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryCommentsTab.uICommentsResultTable, "M", rowIndex);
			verify.ExpectedValueIsTrue(uICommentCell.getText().contains("*"));
		}
		public void VerifyAtSubjectInGrid(int rowIndex) {
			String uICommentCell = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.nameEntryCommentsTab.uICommentsResultTable, "Subject", rowIndex);
			verify.ExpectedPropertyValueIsEqual(uICommentCell,BaseData.getNamesModuleValue("Subject"));
		}

		public void DeleteComments() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uIDeleteIconGridButton.click();

		}

		public void VerifyDeletedCommentsNotFound() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount("grdComments") == 0);
		}

	}
	
	
	public class AnimalNameEntryMedicalProcedure
	{
	

		public void enterTotalCost()
		{
			uIMapAnimalControl.animalNameEntryMedicalProcedure.uITotalCostEdit.sendKeys(Randomized.enterRandomNumbers(4));
		}
		public void enterAtVeterinarianID()
		{
			uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVeterinarianNameTypeEdit.clear();
			uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVeterinarianNameTypeEdit
            .sendKeys(PoliceData.getAnimalControlModuleValue("VeterinarianNameID").substring(0, 1));
uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVeterinarianNameTypeEdit.sendKeys(Keys.TAB);
uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVeterinarianNameIDEdit
            .sendKeys(PoliceData.getAnimalControlModuleValue("VeterinarianNameID").substring(2));
uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVeterinarianNameIDEdit.sendKeys(Keys.TAB);
		}
		public void selctVacType()
		{
		objectIdentification.randomIdentify.selectDropDownOption(uIMapAnimalControl.animalNameEntryMedicalProcedure.uIVacTypeDropdown);
		}
		public void selectBrand()
		{
		objectIdentification.randomIdentify.selectDropDownOption(uIMapAnimalControl.animalNameEntryMedicalProcedure.uIBrandDropdown);
		}
		public void enterProcedurePerformed()
		{
			uIMapAnimalControl.animalNameEntryMedicalProcedure.uIProcedurePerformed.sendKeys(Randomized.randomString(80));
		}
		
		public void saveAndClose()
		{
			uIMapAnimalControl.animalNameEntryMedicalProcedure.uISaveNCloseButton.click();
			popup.confirm.yes();
		}
	}

    

}
