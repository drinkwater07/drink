package scripts;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.Loader;
import application.Login;
import application.Popup;
import dataAccess.PoliceData;
import reports.ExtentReport;
import uIMaps.UIMapPopup;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class PoliceSmokeTest45 {
	

	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public UIMapPopup uIMapPopup;
	public ITestResult testResult;

	
@BeforeMethod
public void beforeMethodRecords(ITestContext testContext)
{
	testContext.setAttribute("moduleName", "PoliceSmokeTest45");
	Playback.testContext = testContext;
	Playback.start();
	login = new Login();
	loader = new Loader();
	objectIdentification = new ObjectIdentification();
	 popup=new Popup();
	 uIMapPopup = new UIMapPopup();
}
	
    
//Mahesha
   
   
   
    @Test
    public void AlarmModuleSmokeTestScriptAlarm(ITestContext testContext) throws Exception
    {
    	
    	testContext.setAttribute("testID", "Alarm");
    	ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        Browser.NavigateToLoginScreenSmoke();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        String count=     PoliceData.getPoliceSmokeModuleValue("ScreensCount");
        int cou = Integer.parseInt(count);
      for(int i=1;i<=cou;i++)
      {
    	 
    	  ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
       System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        if(PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Alarm Type"))
        	{
        	  objectIdentification.smokeTest.selectRandomGridRow();
              objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
              objectIdentification.manualIdentify.saveAndCloseTheScreenWithConfirm();
              objectIdentification.windowHandle.switchToMainWindow();
        	}
        else
        objectIdentification.smokeTest.clickTheSearchButton();
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
        	}
        catch(Exception e)
        {
        	 e.printStackTrace();
        	 ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        	popup.acknowledge.ok();
        	 objectIdentification.windowHandle.switchToMainWindow();
        }

        else
        {
           try {
        	   objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.manualIdentify.saveAndCloseTheScreenWithConfirm();
            objectIdentification.windowHandle.switchToMainWindow();
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
           }
        }

    }
    
    }

    
    @Test
    public void AnimalControlModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
    	 testContext.setAttribute("testID", "Animal Control");
    	 	ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
	        Browser.NavigateToLoginScreenSmoke();
	        login.loginScreen.logonUsingTestContextOtherDB();
	        loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
	        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
	        System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
	        String count=     PoliceData.getPoliceSmokeModuleValue("ScreensCount");
	        int cou = Integer.parseInt(count);
	       
      for(int i=1;i<=cou;i++)
      {
    	
    	  ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
       System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        objectIdentification.smokeTest.clickTheSearchButton();
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
        	}
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        	 popup.acknowledge.okIfWindowExistAsWarning();
        	 objectIdentification.windowHandle.switchToMainWindow();
        }
        else
        {
           try {
        	 objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));   
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow();
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
           }
        }
        
    }
      
     
    }
    
    
      @Test
      public void CIVILModuleSmokeTestScript(ITestContext testContext) throws Exception
      {
      	
      	 testContext.setAttribute("testID", "CIVIL");
      	 	ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        Browser.NavigateToLoginScreenSmoke();
  	        login.loginScreen.logonUsingTestContextOtherDB();
  	        loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        String count=     PoliceData.getPoliceSmokeModuleValue("ScreensCount");
  	        int cou = Integer.parseInt(count);
  	      
        for(int i=1;i<=cou;i++)
        {
      	
      	  ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
         System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          if(PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Civil Statement")||PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Service Area"))
          {
        	  Playback.driver.findElement(By.id("cmdRefresh")).click();
        	  objectIdentification.windowHandle.switchToMainWindow();
          }
          else
          {
          objectIdentification.smokeTest.clickTheSearchButton();
          if (objectIdentification.windowHandle.windowExist("Acknowledge"))
          	try {
              popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
              objectIdentification.windowHandle.switchToMainWindow();
          	}
          catch(Exception e)
          {
          	e.printStackTrace();
          	ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	 popup.acknowledge.okIfWindowExistAsWarning();
          	 objectIdentification.windowHandle.switchToMainWindow();
          }
          else
          {
             try {
          	 objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
              objectIdentification.smokeTest.selectRandomGridRow();
              objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));   
              objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
              objectIdentification.windowHandle.switchToMainWindow();
             }
             catch(Exception e)
             {
          	   e.printStackTrace();
          	   ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	   objectIdentification.windowHandle.switchToMainWindow();
             }
          }
          
          }
       }
     
    }
    
      
      @Test
      public void CMModuleSmokeTestScript(ITestContext testContext) throws Exception
      {
      	
      	 testContext.setAttribute("testID", "CM");
      	 	ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        Browser.NavigateToLoginScreenSmoke();
  	        login.loginScreen.logonUsingTestContextOtherDB();
  	        loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        String count=     PoliceData.getPoliceSmokeModuleValue("ScreensCount");
  	        int cou = Integer.parseInt(count);
  	      
        for(int i=1;i<=cou;i++)
        {
      	boolean res = true;
        	while(res)
        	{
      	  ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
         System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          if(PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Case Folder"))
          {
        	  Playback.driver.findElement(By.id("cmdRefresh")).click();
        	  objectIdentification.windowHandle.switchToMainWindow();
        	  res=false;
        	  break;
          }
          else if(PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Report Search")||PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Report Status"))
          {
        	  Playback.driver.findElement(By.xpath("//select[contains(@id,'lstReportStatus')]"))
              .sendKeys(PoliceData.getPoliceSmokeModuleValue("Status"));
          }
          else if(PoliceData.getPoliceSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("MO Search"))
          {
        	  Playback.driver.findElement(By.xpath("//select[contains(@id,'cddMOType_DropDown')]"))
              .sendKeys(PoliceData.getPoliceSmokeModuleValue("Type"));
          }
          objectIdentification.smokeTest.clickTheSearchButton();
          if (objectIdentification.windowHandle.windowExist("Acknowledge"))
          	try {
              popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
              objectIdentification.windowHandle.switchToMainWindow();
              res=false;
        	  break;
          	}
          catch(Exception e)
          {
          	e.printStackTrace();
          	ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	 popup.acknowledge.okIfWindowExistAsWarning();
          	 objectIdentification.windowHandle.switchToMainWindow();
          	  res=false;
        	  break;
          }
          else
          {
             try {
          	 objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
              objectIdentification.smokeTest.selectRandomGridRow();
              objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));   
              objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
              objectIdentification.windowHandle.switchToMainWindow();
              res=false;
        	  break;
             }
             catch(Exception e)
             {
          	   e.printStackTrace();
          	   ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	   objectIdentification.windowHandle.switchToMainWindow();
          	  res=false;
        	  break;
             }
          }
          
      }
        }
     
    }
      
      
      @Test
      public void CoronerModuleSmokeTestScript(ITestContext testContext) throws Exception
      {
      	
      	 testContext.setAttribute("testID", "Coroner");
      	 	ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        Browser.NavigateToLoginScreenSmoke();
  	        login.loginScreen.logonUsingTestContextOtherDB();
  	        loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
  	        String count=     PoliceData.getPoliceSmokeModuleValue("ScreensCount");
  	        int cou = Integer.parseInt(count);
  	       
        for(int i=1;i<=cou;i++)
        {
      	
      	  ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
         System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          objectIdentification.smokeTest.clickTheSearchButton();
          if (objectIdentification.windowHandle.windowExist("Acknowledge"))
          	try {
              popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
              objectIdentification.windowHandle.switchToMainWindow();
          	}
          catch(AssertionError e)
          {
        		e.printStackTrace();
              	ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
              	popup.acknowledge.ok();
              	objectIdentification.windowHandle.switchToMainWindow();
          }
          catch(Exception e)
          {
          	e.printStackTrace();
          	ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	 popup.acknowledge.okIfWindowExistAsWarning();
          	 objectIdentification.windowHandle.switchToMainWindow();
          }
          else
          {
             try {
          	 objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
              objectIdentification.smokeTest.selectRandomGridRow();
              objectIdentification.windowHandle.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));   
              objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
              objectIdentification.windowHandle.switchToMainWindow();
             }
             catch(Exception e)
             {
          	   e.printStackTrace();
          	   ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
          	   objectIdentification.windowHandle.switchToMainWindow();
             }
          }
          
      }
        
       
      }  
    
      //Vijay
    
       @Test // Vijay
       public void PropertyModuleSmokeTestScripts(ITestContext testContext) throws Exception {
              testContext.setAttribute("testID", "Property");
              ExtentReport.startReportSmokeTest(PoliceData.getRecordsModuleValue("ModuleName"));
              Browser.NavigateToLoginScreenSmoke();
              login.loginScreen.logonUsingTestContextOtherDB();
              loader.navigateToModule(PoliceData.getRecordsModuleValue("ModuleName"));
              ExtentReport.CreateSmokeTest(PoliceData.getRecordsModuleValue("ModuleName"));
              System.out.println(PoliceData.getRecordsModuleValue("ModuleName"));
              String count = PoliceData.getRecordsModuleValue("ScreensCount");
              int cou = Integer.parseInt(count);
              for (int i = 1; i <= cou; i++) {

                     ExtentReport.CreateNode(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                     loader.navigateToScreen(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                     System.out.println(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                     objectIdentification.windowHandle
                                  .switchToMainWindowScreenTab(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                     if (PoliceData.getRecordsModuleValue("Screen" + i + "").equalsIgnoreCase("Property Update")) {
                           Playback.driver.findElement(By.id("cmdLoad")).click();
                     } else {
                           objectIdentification.smokeTest.clickTheSearchButton();
                     }
                     if (objectIdentification.windowHandle.windowExist("Acknowledge"))
                           try {
                                  popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                                  objectIdentification.windowHandle.switchToMainWindow();
                           } catch (Exception e) {
                                  e.printStackTrace();
                                  ExtentReport.LogInfo(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                                  popup.acknowledge.okIfWindowExistAsWarning();
                                  objectIdentification.windowHandle.switchToMainWindow();
                           }

                     else {
                           try {
                                  objectIdentification.windowHandle
                                                .switchToMainWindowScreenTab(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                                  if (PoliceData.getRecordsModuleValue("Screen" + i + "").equalsIgnoreCase("Property Update")) {
                                         Playback.driver.findElement(By.xpath("//div[@id='grdPRBatchUpdt']//td[text()='21-000035-1']"))
                                                       .click();
                                  } else {
                                         objectIdentification.smokeTest.selectRandomGridRow();
                                  }
                                  objectIdentification.windowHandle
                                                .switchToWindow(PoliceData.getRecordsModuleValue("EntryScreen" + i + ""));
                                  objectIdentification.smokeTest
                                                .saveAndCloseTheScreenWithConfirm(PoliceData.getRecordsModuleValue("EntryScreen" + i + ""));
                                  objectIdentification.windowHandle.switchToMainWindow();
                           } catch (Exception e) {
                                  e.printStackTrace();
                                  ExtentReport.LogInfo(PoliceData.getRecordsModuleValue("Screen" + i + ""));
                                  objectIdentification.windowHandle.switchToMainWindow();
                           }
                     }

              }
       }

      
   
     //Stalin  
    @Test 
  public void SmokeTestScripts_Records_(ITestContext testContext) throws Exception {
		
		testContext.setAttribute("testID", "Records");
        ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		String count = PoliceData.getPoliceSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);
		for (int i = 1; i <= cou; i++) {
			boolean res = true;
			
			while(res) {
            ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
			loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
			System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
			if (PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Report Search")
					|| PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Reports Status"))
			{

				objectIdentification.manualIdentify.selectDropDownOption(Playback.driver.findElement(By.xpath("//select[contains(@id,'lstReportStatus')]")), PoliceData.getPoliceSmokeModuleValue("Status"));
				objectIdentification.smokeTest.clickTheSearchButton();
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
				.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
				Playback.driver.findElement(By.id("cmdRefresh")).click();
				Playback.driver.close();
				res = false;
				break;
			}
			else if ((PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("NCIC Search"))) {
				Playback.driver.findElement(By.id("dtFrom_Date_KPIDttmCtrl")).sendKeys("02/17/2020");
				Playback.driver.findElement(By.id("dtTo_Date_KPIDttmCtrl"))
						.sendKeys(Randomized.getCurrentDate("mm/dd/yyyy"));
			}

			objectIdentification.smokeTest.clickTheSearchButton();

			if (objectIdentification.windowHandle.windowExist("Acknowledge")) 
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} catch(Exception e)
	        {
			          e.printStackTrace();
			          ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
			           popup.acknowledge.okIfWindowExistAsWarning();
			           objectIdentification.windowHandle.switchToMainWindow();
			        }


			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));

					if ((PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Unit History Search"))) {

						Playback.driver
								.findElement(By.xpath("(//table/tbody/tr/td/img[contains(@class ,'HGridExpandButton')])[1]")).click();
						Playback.controlReadyThreadWait();
						Playback.driver.findElement(By.xpath("(//table/tbody[contains(@class,'Item')]//tr[contains(@class,'gridrowAlign')][2])[1]")).click();
					} else
						objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} catch (Exception e) {
					e.printStackTrace();
		             ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
		             objectIdentification.windowHandle.switchToMainWindow();
		             res = false;
						break;
				}
			}
			}
			}
	}


    
 @Test  //TRAFFIC SMOKE SCRIPT

	public void SmokeTestScripts_Traffic_(ITestContext testContext) throws Exception {
		
		testContext.setAttribute("testID", "Traffic");
		ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
        ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		String count = PoliceData.getPoliceSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);

		for (int i = 1; i <= cou; i++) {
			boolean res = true;

			while (res) {
	            ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
				loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
				System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
				if (PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Citation Search")) {
					Playback.driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
				} 
				
				else if (PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Traffic Interface Log")) 
				{
					objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
					objectIdentification.windowHandle.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
				}
				
				
				else {
					objectIdentification.smokeTest.clickTheSearchButton();

				}

				 if (PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Court")) {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
					Playback.driver.findElement(By.id("cmdSaveNClose")).isDisplayed();
					Playback.driver.close();
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} 
				
				else {
					objectIdentification.windowHandle.switchToMainWindow();

				}

				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} 
				catch(Exception e)
		        {
		          e.printStackTrace();
		          ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
		           popup.acknowledge.okIfWindowExistAsWarning();
		           objectIdentification.windowHandle.switchToMainWindow();
		        }


				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
			            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} 
			           catch(Exception e)
			           {
			             e.printStackTrace();
			             ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
			             objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				}
			}

		}
	}
  
 
 @Test   //WARRANT SMOKE SCRIPT

	public void SmokeTestScripts_Warrant_(ITestContext testContext) throws Exception {
		
		testContext.setAttribute("testID", "Warrant");
     ExtentReport.startReportSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		System.out.println(PoliceData.getPoliceSmokeModuleValue("ModuleName"));
		String count = PoliceData.getPoliceSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);
		for (int i = 1; i <= cou; i++) {
			boolean res = true;
			while(res) 
			{
         ExtentReport.CreateNode(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
			loader.navigateToScreen(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
			System.out.println(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));

			if (PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Warrant Type")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
	            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
				objectIdentification.windowHandle.switchToMainWindow();
				res = false;
				break;
			}
			
			else if(PoliceData.getPoliceSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Warrant Names Search"))
			{
				objectIdentification.smokeTest.clickTheSearchButton();
				objectIdentification.windowHandle
				.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
		objectIdentification.smokeTest.selectRandomGridRow();
		objectIdentification.windowHandle
				.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
		boolean controlExist = objectIdentification.manualIdentify.controlExist(Playback.driver.findElement(By.id("grdWarDtls")));
		verify.ExpectedValueIsTrue(controlExist);
		Playback.driver.close();
		objectIdentification.windowHandle.switchToMainWindow();
		res = false;
		break;
			}
			else
			{
				objectIdentification.smokeTest.clickTheSearchButton();
			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} 
			catch(Exception e)
	        {
	          e.printStackTrace();
	          ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
	           popup.acknowledge.okIfWindowExistAsWarning();
	           objectIdentification.windowHandle.switchToMainWindow();
	        }

			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(PoliceData.getPoliceSmokeModuleValue("Screen" + i + ""));
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(PoliceData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
		            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(PoliceData.getPoliceSmokeModuleValue("EntryScreen"+i+""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} 
				catch(Exception e)
		           {
		             e.printStackTrace();
		             ExtentReport.LogInfo(PoliceData.getPoliceSmokeModuleValue("Screen"+i+""));
		             objectIdentification.windowHandle.switchToMainWindow();
		             res = false;
						break;
		           }
			}
		}
			}
			}
	}

      
      
    @AfterMethod
    public void afterMethodRecords(ITestResult testResult) throws Exception 
    {
  	  
//  	  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
  	 /* try
  			Playback.takeScreenShotOnFailure(testResult);
  		} catch (IOException e) {
  			e.printStackTrace();
  		}*/
//
  		ExtentReport.getResultSmoke(testResult);
// 
    	  
  		ExtentReport.GenerateHTML();
		Playback.stop();
 
  		
  		login.Reset();
  		loader.Reset();
  		 //ExtentReport.GenerateHTML();
  	}
       
}
