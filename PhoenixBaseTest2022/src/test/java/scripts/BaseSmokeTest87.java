package scripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Loader;
import application.Login;
import application.Popup;
import dataAccess.BaseData;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class BaseSmokeTest87 {

	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;

	@BeforeSuite(groups={"Base87","CMS87"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startConsolidatedReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	
	@BeforeMethod(groups={"Base87","CMS87"})
	public void beforeMethodRecords(ITestContext testContext) {
		testContext.setAttribute("moduleName", "BaseSmokeTest87");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		popup = new Popup();
		objectIdentification = new ObjectIdentification();

	}

	//Mahesha
	
	@Test(groups={"Base87"})
    public void AccountingModuleSmokeTest(ITestContext testContext) throws Exception
    {
		 
		testContext.setAttribute("testID", "Accounting");
		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);
		for (int i = 1; i <= cou; i++) {
			objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen" + i + "");
			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
			objectIdentification.smokeTest.clickTheSearchButton();

			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (AssertionError e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					popup.acknowledge.ok();
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					popup.acknowledge.okIfWindowExistAsWarning();
					objectIdentification.windowHandle.switchToMainWindow();
				}
			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));

					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Expense Entry")
							|| BaseData.getTestContextData("EntryScreen" + i + "")
									.equalsIgnoreCase("Receive Payment")) {
						try {
							Playback.driver.findElement(By.id("cmdSaveNClose")).click();
							objectIdentification.windowHandle.switchToMainWindow();
						} catch (NoSuchElementException e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
						}
					} else
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}

			}
		}

	}
	
	 @Test(groups={"CMS87"})
	   public void ActivityModuleSmokeTestScript(ITestContext testContext) throws Exception
	    {	
		 testContext.setAttribute("testID", "Activity");
			ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			Browser.NavigateToLoginScreenSmoke();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
			String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
			int cou = Integer.parseInt(count);
			for (int i = 1; i <= cou; i++) {

				boolean res = true;
				while (res) {
					objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen" + i + "");
					ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
	                            if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Individual Scheduling")||(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Work Release"))) {
						objectIdentification.windowHandle
						.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
						Playback.driver.findElement(By.id("cmdRefresh")).click();
						Playback.driver.close();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));

					if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Schedule Search")) {
						Playback.driver
								.findElement(By.id("tabSuspSrch_tmpl0_UsrPaymntSrchBasic1_dcStartDate_Date_KPIDttmCtrl"))
								.sendKeys(BaseData.getBaseSmokeModuleValue("StartDate"));
						Playback.driver
								.findElement(By.id("tabSuspSrch_tmpl0_UsrPaymntSrchBasic1_dcToDate_Date_KPIDttmCtrl"))
								.sendKeys(BaseData.getBaseSmokeModuleValue("ToDate"));
						objectIdentification.smokeTest.clickTheSearchButton();
					} else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Group Movement")
							|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Inside Sign Out/In")) {
						Playback.driver.findElement(By.id("cmdRefresh")).click();
						res = false;
						break;
					} else
						objectIdentification.smokeTest.clickTheSearchButton();

					if (objectIdentification.windowHandle.windowExist("Acknowledge"))
						try {
							popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						} catch (Exception e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							popup.acknowledge.ok();
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						}

					else {
						try {
							objectIdentification.windowHandle
									.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.smokeTest.selectRandomGridRow();
							if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Schedule Search")) {
								try {
									objectIdentification.windowHandle
											.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
									if (BaseData.getBaseSmokeModuleValue("EntryScreen" + i + "")
											.equalsIgnoreCase("Inmate Movement")) {
										Playback.driver.findElement(By.id("cmdReset")).click();
										Playback.driver.close();
										objectIdentification.windowHandle.switchToMainWindow();
									}
									res = false;
									break;
								} catch (Exception e) {
									objectIdentification.windowHandle.switchToWindow("Work Release");
									objectIdentification.smokeTest.saveAndCloseTheScreenGlobal(
											BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
									objectIdentification.windowHandle.switchToMainWindow();
									res = false;
									break;
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						}
					}
				}
			}
		}

	
	
	@Test(groups={"CMS87"})
	 public void CitizenServicesModuleSmokeTestScript(ITestContext testContext) throws Exception
	    {
		 
		testContext.setAttribute("testID", "Citizen Services");
		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);

		for (int i = 1; i <= cou; i++) {

			objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen" + i + "");
			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.smokeTest.clickTheSearchButton();
			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();

				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen" + i + "");
					objectIdentification.windowHandle.switchToMainWindow();

				}
			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					if (BaseData.getBaseSmokeModuleValue("EntryScreen" + i + "")
							.equalsIgnoreCase("Alarm Process Entry")) {
						try {
							Playback.driver.findElement(By.id("cmdCancel")).click();
							objectIdentification.windowHandle.switchToMainWindow();
						} catch (NoSuchElementException e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
						}
					} else
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}
		}
	}
	      
	 
	
	
	 
	 @Test(groups={"Base87"})
	   public void AdmissionBookingSmokeTestScript(ITestContext testContext) throws Exception
	    {	
		 testContext.setAttribute("testID", "AdmissionBooking");
			ExtentReport.CreateConsolidatedTest("AdmissionBooking");
			ExtentReport.startReportSmokeTest("AdmissionBooking");
			Browser.NavigateToLoginScreenSmoke();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.CreateSmokeTest("AdmissionBooking");
			System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
			String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
			int cou = Integer.parseInt(count);
			for (int i = 4; i <= cou; i++) {
				boolean res = true;
				while (res) {
					objectIdentification.smokeTest
							.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));

					if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Inmate Search")
							|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Name Search")) {
						Playback.driver.findElement(By.xpath("(//input[contains(@id,'txtAge')])[1]"))
								.sendKeys(BaseData.getBaseSmokeModuleValue("Age"));
						Playback.driver.findElement(By.xpath("(//input[contains(@id,'txtAge')])[2]"))
								.sendKeys(BaseData.getBaseSmokeModuleValue("Diff"));
						objectIdentification.smokeTest.clickTheSearchButton();
					}else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Billing Search")) {
						Playback.driver.findElement(By.xpath("//input[@id='DttmFrom_Date_KPIDttmCtrl']")).sendKeys("12/17/2019");
						Playback.driver.findElement(By.xpath("//input[@id='DttmEnd_Date_KPIDttmCtrl']")).sendKeys("03/04/2022");
						objectIdentification.smokeTest.clickTheSearchButton();
						verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount("grdResSrch") != 0);
						res = true;
						break;
					}else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Bond Search")||
							BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Pay-To-Stay Search")||
							BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Risk Assessment Search")||
							BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Scheduled Booking Search")||
							BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Special Needs Search")) {
						Playback.driver.findElement(By.xpath("//input[@id='tabSuspSrch_tmpl0_UsrBondReceiptSrch1_dttmFrom_Date_KPIDttmCtrl']")).sendKeys("12/17/2019");
						Playback.driver.findElement(By.xpath("//input[@id='tabSuspSrch_tmpl0_UsrBondReceiptSrch1_dttmTo_Date_KPIDttmCtrl']")).sendKeys("03/04/2022");
						objectIdentification.smokeTest.clickTheSearchButton();
						
					}
					else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Classification Ratings")) {
						objectIdentification.smokeTest.clickRefreshButton();
						
				
					}
					
					else {
						objectIdentification.smokeTest.clickTheSearchButton();
					}
					if (objectIdentification.windowHandle.windowExist("Acknowledge"))
						try {
							popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						} catch (Exception e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							popup.acknowledge.ok();
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						}

					else {
						try {
							objectIdentification.windowHandle
									.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.smokeTest.selectRandomGridRow();
							objectIdentification.windowHandle
									.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
							objectIdentification.smokeTest
									.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						} catch (Exception e) {
							e.printStackTrace();
							ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
							res = false;
							break;
						}
					}
				}
			}

		}
	      
	 
	 
	@Test(groups={"Base87"})
	public void BISmokeTest(ITestContext testContext) throws Exception
    {
       

		testContext.setAttribute("testID", "BI");
		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);

		for (int i = 1; i <= cou; i++) {

			boolean res = true;

			while (res) {
				objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen" + i + "");
				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").contains("Pivot Browser")) {
					try {
						Playback.driver.findElement(By.id("cmdRefresh")).click();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				}
				objectIdentification.smokeTest.clickTheSearchButton();

				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("DashBoard Config")) {
					Playback.pageLoadThreadWait();
					verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.controlExist(
							Playback.driver.findElement(By.xpath("(//div[@id='grdDashBoardSrch']//table)[4]"))));
					;
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				}

				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						popup.acknowledge.okIfWindowExistAsWarning();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Cube Config Entry")) {
							try {
								Playback.driver.findElement(By.id("cmdRefresh")).click();
								Playback.pageLoadThreadWait();
								Playback.driver.close();
								objectIdentification.windowHandle.switchToMainWindow();
								res = false;
								break;
							} catch (Exception e) {
								e.printStackTrace();
								ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
								objectIdentification.windowHandle.switchToMainWindow();
								res = false;
								break;
							}
						}
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				}

			}
		}

	}
    
	
	@Test(groups={"Base87"})
    public void CADModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
		testContext.setAttribute("testID", "CAD");
		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);

		for (int i = 1; i <= cou; i++) {
			boolean res = true;
			while (res) {
				objectIdentification.smokeTest
						.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("E911 Call Search")) {
					Playback.driver.findElement(By.id("dtFromCallDate_Date_KPIDttmCtrl"))
							.sendKeys(BaseData.getBaseSmokeModuleValue("FromDate"));
					Playback.driver.findElement(By.id("dtToCallDate_Date_KPIDttmCtrl"))
							.sendKeys(BaseData.getBaseSmokeModuleValue("ToDate"));
					objectIdentification.smokeTest.clickTheSearchButton();
					verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
							.controlExist(Playback.driver.findElement(By.xpath("//div//table"))));
					res = false;
					break;
				}
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Police Dispatch")) {
					objectIdentification.smokeTest.clickSearchButton();
					res = false;
					break;
				}
				objectIdentification.smokeTest.clickTheSearchButton();

				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("CAD Tone Log Search")) {
					verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
							.controlExist(Playback.driver.findElement(By.xpath("//div//table"))));
					res = false;
					break;
				}

				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedIngnoreCase("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						popup.acknowledge.ok();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));

						if (BaseData.getBaseSmokeModuleValue("EntryScreen" + i + "").equalsIgnoreCase("LOR")) {
							try {
								Playback.driver.findElement(By.id("cmdSaveNClose")).click();
								objectIdentification.windowHandle.switchToMainWindow();
								res = false;
								break;

							} catch (NoSuchElementException e) {
								e.printStackTrace();
								ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
								objectIdentification.windowHandle.switchToMainWindow();
								res = false;
								break;
							}
						}

						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				}

			}
		}

	}
    
    
	
	
	@Test(groups={"Base87"})
    public void CourtModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
		testContext.setAttribute("testID", "Court");
		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
		int cou = Integer.parseInt(count);

		for (int i = 1; i <= cou; i++) {
			boolean res = true;
			while (res) {

				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("In-Court")) {
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.smokeTest
							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				}
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Cash Register")
						|| BaseData.getBaseSmokeModuleValue("Screen" + i + "")
								.equalsIgnoreCase("Attorney Recommendation")
						|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Create Case")) {
                                        Playback.driver.findElement(By.id("cmdRefresh")).click();
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				}
				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Register Codes")) {
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.smokeTest
							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				}

				objectIdentification.smokeTest.clickTheSearchButton();
				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (AssertionError e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						popup.acknowledge.ok();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						popup.acknowledge.okIfWindowExistAsWarning();
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
						res = false;
						break;
					}
				}
			}

		}

	}
    
    
	
	
	 @Test(groups={"CMS87"})
     public void DetailWorkModuleSmokeTestScript(ITestContext testContext) throws Exception
     {
     	
		 testContext.setAttribute("testID", "Detail Work");
			ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			Browser.NavigateToLoginScreenSmoke();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
			String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
			int cou = Integer.parseInt(count);

			for (int i = 1; i <= cou; i++) {

				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.smokeTest.clickTheSearchButton();
				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						popup.acknowledge.okIfWindowExistAsWarning();
						objectIdentification.windowHandle.switchToMainWindow();
					}
				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
					}
				}

			}

		}
  
//Vijay
	 

	 @Test(groups={"CMS87"}) // Vijay
     public void DocumentMgmtModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		 testContext.setAttribute("testID", "Document Mgmt");
			ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
			Browser.NavigateToLoginScreenSmoke();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
			ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
			System.out.println(BaseData.getTestContextData("ModuleName"));
			String count = BaseData.getTestContextData("ScreenCount");
			int cou = Integer.parseInt(count);

			for (int i = 1; i <= cou; i++) {

				ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
				System.out.println(BaseData.getTestContextData("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
				objectIdentification.smokeTest.clickTheSearchButton();
				if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
						popup.acknowledge.okIfWindowExistAsWarning();
					}
				}

				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
						if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Document Management")) {
							try {
								Playback.driver.findElement(By.xpath("(//td[@class='EditRule'])[5]")).click();
								objectIdentification.windowHandle
										.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
								objectIdentification.smokeTest
										.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
								objectIdentification.windowHandle.switchToMainWindow();
							} catch (Exception e) {
								e.printStackTrace();
								ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
								objectIdentification.windowHandle.switchToMainWindow();
							}

						} else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("My Documents")) {
							Playback.driver.findElement(By.xpath(
									"//div[@id='grdDoc_ctl00']//td[@title='New Module Document']/..//td[@class='link']"))
									.click();
							objectIdentification.smokeTest
									.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
						} else {
							objectIdentification.smokeTest.selectRandomGridRow();
							objectIdentification.windowHandle
									.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
							objectIdentification.smokeTest
									.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
						}

					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
					}
				}

			}

		}

	 
	 @Test(groups={"CMS87"}) // Vijay
     public void FacilityManagementModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		 testContext.setAttribute("testID", "Facility Management");
			ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
			Browser.NavigateToLoginScreenSmoke();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
			ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
			System.out.println(BaseData.getTestContextData("ModuleName"));
			String count = BaseData.getTestContextData("ScreensCount");
			int cou = Integer.parseInt(count);
			for (int i = 1; i <= cou; i++) {

				ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
				loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
				System.out.println(BaseData.getTestContextData("Screen" + i + ""));
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
				if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Mail Log Search")
						|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Activity Search")
						|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Grievance Search")
						|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Incident Search")
						|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Out Of Service Cell Search")) {
					Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
					Playback.driver.findElement(By.xpath("//input[contains(@id,'m_Date_KPIDttmCtrl')]"))
							.sendKeys(BaseData.getTestContextData("StartDate"));
					Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]"))
							.sendKeys(BaseData.getTestContextData("ToDate"));
					Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]")).sendKeys(Keys.TAB);
				}

				else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Library Search")) {
					WebElement DateType = Playback.driver
							.findElement(By.id("tabSuspSrch_tmpl0_UsrLibraryInqSrch1_cddDateType_DropDown"));
					Select s = new Select(DateType);
					s.selectByValue("Both");
				}

				else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Release Search")) {
					Playback.driver.findElement(By.id("tabRlsSrch_tmpl0_UsrReleaseSrchBasic1_txtLastName")).sendKeys("a");

				} else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Visitor Search")) {
					Playback.driver.findElement(By.id("tabVisitSrch_tmpl0_UsrVisitSrchBasic1_txtSPNName")).sendKeys("a");
				}
				objectIdentification.smokeTest.clickTheSearchButton();
				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
					try {
						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
						objectIdentification.windowHandle.switchToMainWindow();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
						popup.acknowledge.okIfWindowExistAsWarning();
						objectIdentification.windowHandle.switchToMainWindow();
					}

				else {
					try {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
						objectIdentification.smokeTest
								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
						objectIdentification.windowHandle.switchToMainWindow();
					}
				}

			}

		}

	 
	
	 @Test(groups={"Base87"}) // Vijay
       public void FireStaticModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		 testContext.setAttribute("testID", "Fire Static");
		 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		 ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
		 Browser.NavigateToLoginScreenSmoke();
		 login.loginScreen.logonUsingTestContextOtherDB();
		 loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
		 ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
		 System.out.println(BaseData.getTestContextData("ModuleName"));
		 String count = BaseData.getTestContextData("ScreensCount");
		 int cou = Integer.parseInt(count);
		 for (int i = 1; i <= cou; i++) {
		 boolean res = true;



		 while (res) {
		 ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
		 loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
		 System.out.println(BaseData.getTestContextData("Screen" + i + ""));
		 objectIdentification.windowHandle
		 .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
		 if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Cross Staffing")) {
		 objectIdentification.windowHandle
		 .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
		 Playback.driver.findElement(By.id("cmdRefresh")).click();
		 objectIdentification.windowHandle.switchToMainWindow();
		 res =false;
		 break;
		 }
		 if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Incident Search")) {
		 Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
		 Playback.driver.findElement(By.xpath("//input[contains(@id,'m_Date_KPIDttmCtrl')]"))
		 .sendKeys(BaseData.getTestContextData("StartDate"));
		 Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]"))
		 .sendKeys(BaseData.getTestContextData("ToDate"));
		 Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]")).sendKeys(Keys.TAB);
		 }
		 objectIdentification.smokeTest.clickTheSearchButton();
		 if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
		 try {



		 popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		 objectIdentification.windowHandle.switchToMainWindow();
		 res =false;
		 break;
		 } catch (Exception e) {
		 e.printStackTrace();
		 ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
		 popup.acknowledge.okIfWindowExistAsWarning();
		 objectIdentification.windowHandle.switchToMainWindow();
		 res =false;
		 break;
		 }



		 }
		 else {
		 try {
		 objectIdentification.windowHandle
		 .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
		 objectIdentification.smokeTest.selectRandomGridRow();
		 objectIdentification.windowHandle
		 .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
		 objectIdentification.smokeTest
		 .saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
		 objectIdentification.windowHandle.switchToMainWindow();
		 res =false;
		 break;
		 } catch (Exception e) {
		 e.printStackTrace();
		 ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
		 objectIdentification.windowHandle.switchToMainWindow();
		 res =false;
		 break;
		 }
		 }



		 }
		 }



		 }


     
	 @Test(groups={"Base87"}) // Vijay
	    public void GeoModuleSmokeTestScripts(ITestContext testContext) throws Exception {
	           testContext.setAttribute("testID", "Geo");
	           testContext.setAttribute("testID", "Geo");
	   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
	   		Browser.NavigateToLoginScreenSmoke();
	   		login.loginScreen.logonUsingTestContextOtherDB();
	   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
	   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
	   		System.out.println(BaseData.getTestContextData("ModuleName"));
	   		String count = BaseData.getTestContextData("ScreensCount");
	   		int cou = Integer.parseInt(count);
	   		for (int i = 1; i <= cou; i++) {

	   			boolean res = true;

	   			while (res) {

	   				objectIdentification.smokeTest
	   						.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
	   				ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
	   				loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
	   				System.out.println(BaseData.getTestContextData("Screen" + i + ""));
	   				objectIdentification.windowHandle
	   						.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
	                               /*
	   				 * if (BaseData.getTestContextData("Screen" + i +
	   				 * "").equalsIgnoreCase("Map Feature Entry")||(BaseData.getTestContextData(
	   				 * "Screen" + i + "").equalsIgnoreCase("ESN Map Entry"))) {
	   				 * objectIdentification.windowHandle
	   				 * .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
	   				 * Playback.driver.findElement(By.id("cmdRefresh")).click();
	   				 * objectIdentification.windowHandle.switchToMainWindow(); res = false; break;
	   				 */

	   				if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Address Search")) {
	   					Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
	   					res = false;
	   					break;
	   				} else {
	   					objectIdentification.smokeTest.clickTheSearchButton();
	   				}
	   				if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
	   					try {
	   						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
	   						objectIdentification.windowHandle.switchToMainWindow();
	   						res = false;
	   						break;

	   					} catch (Exception e) {
	   						e.printStackTrace();
	   						ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
	   						objectIdentification.windowHandle.switchToMainWindow();
	   						res = false;
	   						break;
	   					}
	   				}

	   				else {
	   					try {
	   						objectIdentification.windowHandle
	   								.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
	   						objectIdentification.smokeTest.selectRandomGridRow();
	   						objectIdentification.windowHandle
	   								.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
	   						if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Contact Entry")) {
	   							Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
	   							res = false;
	   							break;
	   						}
	   						if (BaseData.getTestContextData("EntryScreen" + i + "")
	   								.equalsIgnoreCase("Address Flag Entry(p)")) {
	   							objectIdentification.smokeTest
	   									.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("EntryScreen" + i + ""));
	   							res = false;
	   							break;
	   						} else {
	   							objectIdentification.smokeTest
	   									.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
	   							objectIdentification.windowHandle.switchToMainWindow();
	   							res = false;
	   							break;
	   						}

	   					} catch (Exception e) {
	   						e.printStackTrace();
	   						ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
	   						objectIdentification.windowHandle.switchToMainWindow();
	   						res = false;
	   						break;
	   					}
	   				}

	   			}

	   		}

	   	}

       
       
       @Test(groups={"Base87"}) // Vijay
       public void HomeModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Home");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("PhoneBook Search")) {
   				Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();
   			} else
   				objectIdentification.smokeTest.clickTheSearchButton();

   			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

   					objectIdentification.windowHandle.switchToMainWindow();

   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();

   				}
   			}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
   					if (BaseData.getTestContextData("EntryScreen" + i + "").contains("frmNotificationEvent.aspx")) {
   						Playback.driver.findElement(By.id("cmdSearch")).click();
   						Playback.driver.close();
   					} else {
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}

   	}

       
       @Test(groups={"Base87"}) // Vijay
       public void EmploymentApplicantsModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Employment Applicants");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Job Listings")
   					|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Orientation")) {
   				Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();
   			} else {
   				objectIdentification.smokeTest.clickTheSearchButton();
   			}
   			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();

   					objectIdentification.windowHandle.switchToMainWindow();
   				}

   			} else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
//                                   if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Applicant Search")) {

   					// }
   					// else {
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));

   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					// }
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}

   	}

       
        @Test(groups={"Base87"}) // Vijay 
        public void HelpDeskModuleSmokeTestScripts(ITestContext testContext) throws Exception { 
        	
        	
        	testContext.setAttribute("testID", "Help Desk");
    		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
    		Browser.NavigateToLoginScreenSmoke();
    		login.loginScreen.logonUsingTestContextOtherDB();
    		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
    		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
    		System.out.println(BaseData.getTestContextData("ModuleName"));
    		String count = BaseData.getTestContextData("ScreensCount");
    		int cou = Integer.parseInt(count);

    		for (int i = 1; i <= cou; i++) {

    			objectIdentification.smokeTest
    					.handlingAcknowledgeMessagesPopups(BaseData.getTestContextData("Screen" + i + ""));
    			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
    			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
    			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
    			
    			if(BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Email Settings")) {
    				objectIdentification.windowHandle.switchToWindowUsingFormName("frmEmailSettings_Id");
    				Playback.driver.findElement(By.id("cmdRefresh")).click();
    				Playback.driver.close();
    			}else {
    			objectIdentification.windowHandle
    					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
    			objectIdentification.smokeTest.clickTheSearchButton();
    			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
    				try {
    					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
    					objectIdentification.windowHandle.switchToMainWindow();
    				} catch (Exception e) {
    					e.printStackTrace();
    					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
    					popup.acknowledge.okIfWindowExistAsWarning();
    					objectIdentification.windowHandle.switchToMainWindow();
    				}

    			else {
    				try {
    					objectIdentification.windowHandle
    							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
    					objectIdentification.smokeTest.selectRandomGridRow();
    					objectIdentification.windowHandle
    							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
    					Playback.driver.findElement(By.id("cmdRefresh")).click();
        				Playback.driver.close();
    					objectIdentification.windowHandle.switchToMainWindow();
    				} catch (Exception e) {
    					e.printStackTrace();
    					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
    					objectIdentification.windowHandle.switchToMainWindow();
    				}
    				finally {
    					Playback.takeScreenShot(BaseData.getTestContextData("ModuleName"), BaseData.getTestContextData("Screen" + i + ""));
    				}
    			}

    		}
    	}
        }
       
    
       
       @Test(groups={"Base87"}) // Vijay
       public void InventoryFleetModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Inventory & Fleet");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.smokeTest.clickTheSearchButton();
   			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();
   				}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
   					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Check Out/In Entry")) {
   						Playback.driver.close();

   					} else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Mileage Log Entry")||(BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Batch Assign/Return"))) {
   						objectIdentification.windowHandle
   								.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   						Playback.driver.findElement(By.id("cmdRefresh")).click();
   					} else {
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}

   	}

     
       @Test(groups={"Base87"}) // Vijay
       public void K9ModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "K9");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			objectIdentification.smokeTest
   					.handlingAcknowledgeMessagesPopups(BaseData.getTestContextData("Screen" + i + ""));
   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("K9 Reports")
   					|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("K9 Team")) {
   				Playback.driver.findElement(By.id("btnSearch")).click();
   			} else {
   				objectIdentification.smokeTest.clickTheSearchButton();
   			}
   			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();
   				}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
   					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Expense Entry")) {
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("EntryScreen" + i + ""));
   					} else {
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}

   	}

     
       @Test (groups={"CMS87"})// Vijay
       public void MedicalModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Medical");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {
                        boolean res = true;

   			while (res) {

   			objectIdentification.smokeTest
   					.handlingAcknowledgeMessagesPopups(BaseData.getTestContextData("Screen" + i + ""));
   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
             if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Inmate Receipt")
   					|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("MAR")
   					|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Medical Dentist")) {
   				objectIdentification.windowHandle
   				.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   				Playback.driver.findElement(By.id("cmdRefresh")).click();
   				objectIdentification.windowHandle.switchToMainWindow();
   				res = false;
   				break;
   			}
   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Medical Search")
   					|| BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("MAR History Search")) {
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmFromDate_Date_KPIDttmCtrl')]"))
   						.sendKeys(BaseData.getTestContextData("StartDate"));
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
   						.sendKeys(BaseData.getTestContextData("ToDate"));
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
   						.sendKeys(Keys.TAB);

   			}

   			objectIdentification.smokeTest.clickTheSearchButton();
   			Playback.waitForSearch();

   			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   	   				break;
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   	   				break;
   				}
   			}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   	   				break;
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   	   				break;
   				}
   			}

   		}

   	}
          }

     
       
       @Test(groups={"Base87"}) // Vijay
       public void NamesModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Names");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
   		System.out.println(BaseData.getTestContextData("ModuleName"));
   		String count = BaseData.getTestContextData("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			objectIdentification.smokeTest
   					.handlingAcknowledgeMessagesPopups(BaseData.getTestContextData("Screen" + i + ""));
   			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
   			System.out.println(BaseData.getTestContextData("Screen" + i + ""));

   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Expungement Search")) {
   				objectIdentification.windowHandle.switchToMainWindowScreenTab("frmExpungementsSrch.aspx");
   			}

   			else {
   				objectIdentification.windowHandle
   						.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   			}

   			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Dictionary Search")) {
   				Playback.driver.findElement(By.id("txtName")).click();
   				Playback.driver.findElement(By.id("txtName")).sendKeys("a");
   				Playback.driver.findElement(By.id("cmdSearch")).click();
   			}

   			else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("DNA Search")) {
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmFromDate_Date_KPIDttmCtrl')]"))
   						.sendKeys(BaseData.getTestContextData("StartDate"));
   				Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
   						.sendKeys(BaseData.getTestContextData("ToDate"));
                                             Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();
   			}

   			else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Name Search")) {
   				Playback.driver.findElement(By.id("tabNameSrch_tmpl0_UsrNameSrchBasic1_txtLastName")).sendKeys("a");
   				Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();

   			} else {
   				objectIdentification.smokeTest.clickTheSearchButton();
   			}
   			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (AssertionError e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					popup.acknowledge.ok();
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
   					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Photo Book")) {
   						Playback.driver.findElement(By.xpath("//div[@id='grdPhotoBook']//td[text()='20-000044']"))
   								.click();

   					} else {
   						objectIdentification.smokeTest.selectRandomGridRow();
   					}
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));

   					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Offender Entry")) {
   						Playback.driver.findElement(By.id("cmdSaveNClose")).click();
   						objectIdentification.windowHandle.switchToMainWindow();
   					}

   					// else if (BaseData.getTestContextData("EntryScreen" + i +
   					// "").equalsIgnoreCase("Photo Book")) {

   					// }
                                      else if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("DNA Collection")) {
   						Playback.driver.findElement(By.id("cmdRefresh")).click();
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   					else {
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getTestContextData("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}

   	}




       @Test(groups={"Base87"}) // Vijay
       public void PersonnelModuleSmokeTestScripts(ITestContext testContext) throws Exception {
    	   testContext.setAttribute("testID", "Personnel");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			objectIdentification.smokeTest.clickTheSearchButton();
   			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
   				try {
   					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   					popup.acknowledge.okIfWindowExistAsWarning();
   					objectIdentification.windowHandle.switchToMainWindow();
   				}

   			else {
   				try {
   					objectIdentification.windowHandle
   							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				} catch (Exception e) {
   					e.printStackTrace();
   					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   				}
   			}

   		}
   	}

	 
	 //Stalin

       @Test  (groups={"CMS87"})
	public void SmokeTestScripts_Scheduling_(ITestContext testContext) throws Exception {
		
    	   testContext.setAttribute("testID", "Scheduling");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {
   			boolean res = true;

   			while (res) {

   				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Holidays")
   						|| BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Roster")) {
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					Playback.controlReadyThreadWait();
   					Playback.controlReadyThreadWait();
   					objectIdentification.smokeTest.clickRefreshButton();
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   					break;
   				}
   				objectIdentification.windowHandle
   						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Job Grade")) {
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   					break;

   				}

   				else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Schedule Settings")) {
   					Playback.driver.findElement(By.id("tabSchedule_tmpl0_usrTourCode_cmdSearch")).click();
   					objectIdentification.smokeTest.selectRandomGridRow();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   					break;
   				}

   				else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Time Category")) {
   					Playback.driver
   							.findElement(
   									By.xpath("(//table/tbody/tr/td/img[contains(@class ,'HGridExpandButton')])[1]"))
   							.click();
   					Playback.controlReadyThreadWait();
   					Playback.driver.findElement(By.xpath(
   							"(//table/tbody[contains(@class,'Item')]//tr[contains(@class,'grdrowalign')][2])[1]"))
   							.click();
   					objectIdentification.windowHandle
   							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
//   					objectIdentification.smokeTest.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.smokeTest
   							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   					objectIdentification.windowHandle.switchToMainWindow();
   					res = false;
   					break;
   				}

   				objectIdentification.smokeTest.clickTheSearchButton();

   				if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
   					try {
   						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   						objectIdentification.windowHandle.switchToMainWindow();
   						res = false;
   						break;
   					} catch (AssertionError e) {
   						e.printStackTrace();
   						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						popup.acknowledge.ok();
   						objectIdentification.windowHandle.switchToMainWindow();
   						res = false;
   						break;
   					} catch (Exception e) {
   						e.printStackTrace();
   						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						popup.acknowledge.okIfWindowExistAsWarning();
   						objectIdentification.windowHandle.switchToMainWindow();
   						res = false;
   						break;
   					}

   				}

   				else {
   					try {
   						objectIdentification.windowHandle
   								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						objectIdentification.smokeTest.selectRandomGridRow();
   						objectIdentification.windowHandle
   								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   						res = false;
   						break;
   					} catch (Exception e) {
   						e.printStackTrace();
   						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   						res = false;
   						break;
   					}
   				}
   			}
   		}

   	}


   
       @Test  (groups={"CMS87"})
public void SmokeTestScripts_Training_(ITestContext testContext) throws Exception {

    	   testContext.setAttribute("testID", "Training");
   		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		Browser.NavigateToLoginScreenSmoke();
   		login.loginScreen.logonUsingTestContextOtherDB();
   		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
   		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
   		int cou = Integer.parseInt(count);
   		for (int i = 1; i <= cou; i++) {

   			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			objectIdentification.windowHandle
   					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   			objectIdentification.smokeTest.clickTheSearchButton();

   			if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Certification Search")) {
   				objectIdentification.smokeTest.selectRandomGridRow();
   				objectIdentification.windowHandle
   						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   				boolean controlExist = objectIdentification.manualIdentify
   						.controlExist(Playback.driver.findElement(By.id("grdCertification")));
   				verify.ExpectedValueIsTrue(controlExist);
   				Playback.driver.close();
   				objectIdentification.windowHandle.switchToMainWindow();
   			}

   			else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Course Search")) {
   				Playback.driver
   						.findElement(By.xpath("(//table/tbody/tr/td/img[contains(@class ,'HGridExpandButton')])[1]"))
   						.click();
   				Playback.controlReadyThreadWait();
   				Playback.driver
   						.findElement(
   								By.xpath("(//div[contains(@id,'grdCourse_ctl00_7736_0')]//table//tbody//tr[3]//td)[6]"))
   						.click();
   				objectIdentification.windowHandle
   						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   				objectIdentification.smokeTest
   						.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   				objectIdentification.windowHandle.switchToMainWindow();
   			} else {

   				if (objectIdentification.windowHandle.windowExist("Acknowledge"))
   					try {
   						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
   						objectIdentification.windowHandle.switchToMainWindow();
   					} catch (Exception e) {
   						e.printStackTrace();
   						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						popup.acknowledge.okIfWindowExistAsWarning();
   						objectIdentification.windowHandle.switchToMainWindow();
   					}

   				else {
   					try {
   						objectIdentification.windowHandle
   								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						objectIdentification.smokeTest.selectRandomGridRow();
   						objectIdentification.windowHandle
   								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   						objectIdentification.smokeTest
   								.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					} catch (Exception e) {
   						e.printStackTrace();
   						ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
   						objectIdentification.windowHandle.switchToMainWindow();
   					}
   				}
   			}
   		}
   	}


@Test (groups={"Base87"})
public void SmokeTestScripts_Vehicle_(ITestContext testContext) throws Exception {
	
	testContext.setAttribute("testID", "Vehicle");
	ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	Browser.NavigateToLoginScreenSmoke();
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
	int cou = Integer.parseInt(count);
	for (int i = 1; i <= cou; i++) {

		ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		objectIdentification.windowHandle
				.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		objectIdentification.smokeTest.clickTheSearchButton();
		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			try {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
				objectIdentification.windowHandle.switchToMainWindow();
			} catch (Exception e) {
				e.printStackTrace();
				ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				popup.acknowledge.okIfWindowExistAsWarning();
				objectIdentification.windowHandle.switchToMainWindow();
			}
		else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Tow Rotation")) {
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.smokeTest.selectRandomGridRow();
			objectIdentification.smokeTest
					.saveTheScreenWithYesButton(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			popup.acknowledge.ok();
			objectIdentification.windowHandle.switchToMainWindow();
		}

		else {
			try {
				objectIdentification.windowHandle
						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.smokeTest
						.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.windowHandle.switchToMainWindow();
			} catch (Exception e) {
				e.printStackTrace();
				ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle.switchToMainWindow();
			}
		}
	}
}



@Test  (groups={"CMS87"})
public void SmokeTestScripts_Video_(ITestContext testContext) throws Exception {

	testContext.setAttribute("testID", "Video");
	ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	Browser.NavigateToLoginScreenSmoke();
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
	int cou = Integer.parseInt(count);
	for (int i = 1; i <= cou; i++) {

		ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		objectIdentification.windowHandle
				.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		objectIdentification.smokeTest.clickTheSearchButton();

		if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Camera View Config Search")) {
			Playback.driver.findElement(By.xpath(
					"(//div[contains(@id,'grdContainer')]//table//tbody//tr//td//td//td[contains(@class,'ighg_HGridExpansionColumn')]//following-sibling::td[2])[2]"))
					.click();
			objectIdentification.windowHandle
					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
//		  objectIdentification.manualIdentify.saveAndCloseTheScreenGlobal();
			objectIdentification.smokeTest
					.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
			objectIdentification.windowHandle.switchToMainWindow();
		} else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("View Camera")) {
			objectIdentification.windowHandle
					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			objectIdentification.smokeTest.clickRefreshButton();
			objectIdentification.windowHandle.switchToMainWindow();

		} else {

			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					popup.acknowledge.okIfWindowExistAsWarning();
					objectIdentification.windowHandle.switchToMainWindow();
				}

			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.smokeTest
							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}
		}
	}
}



@Test (groups={"CMS87"})
public void SmokeTestScripts_ZSettings_(ITestContext testContext) throws Exception {
	
	testContext.setAttribute("testID", "Settings");
	Browser.NavigateToLoginScreenSmoke();
	ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
	int cou = Integer.parseInt(count);
	for (int i = 1; i <= cou; i++) {
		boolean res = true;

		while (res) {

			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));

                        if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Juris")) {
				objectIdentification.windowHandle
				.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
		objectIdentification.smokeTest
				.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
		objectIdentification.windowHandle.switchToMainWindow();
		res = false;
		break;
			}	
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                        if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("KGIS Near Agency")) {
				Playback.driver.findElement(By.id("cmdRefresh")).click();
			}
			if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Jail Cell")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.smokeTest
						.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.windowHandle.switchToMainWindow();
				res = false;
				break;
			} else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Access Log")) {
				Playback.driver.findElement(By.id("dtcStartDttm_Date_KPIDttmCtrl")).sendKeys("02/18/2020");
				Playback.driver.findElement(By.id("dtcToDttm_Date_KPIDttmCtrl"))
						.sendKeys(Randomized.getCurrentDate());
				Playback.driver.findElement(By.id("dtcToDttm_Date_KPIDttmCtrl")).sendKeys(Keys.TAB);
				Playback.driver.findElement(By.id("cmdSearch")).click();
				objectIdentification.windowHandle.switchToMainWindow();
				res = false;
				break;
			}

			else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Batch Search")) {
				Playback.driver.findElement(By.id("lupOpenScreenID_CodeValue")).sendKeys("1011");
				Playback.driver.findElement(By.id("lupOpenScreenID_CodeValue")).sendKeys(Keys.TAB);

			}

			else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Tasks")) {
				Playback.driver.findElement(By.id("cddTaskType_DropDown")).sendKeys("BCA Incident");
				objectIdentification.smokeTest.clickTheSearchButton();
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				Playback.driver.close();
				res = false;
				break;
			}

			objectIdentification.smokeTest.clickTheSearchButton();

			if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Dispatch Zone")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.smokeTest
						.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				objectIdentification.windowHandle.switchToMainWindow();
				res = false;
				break;

			} else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Coded")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				Playback.driver.close();
				res = false;
				break;
			}

			else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Coded Map")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				Playback.driver.close();
				res = false;
				break;
			}

			else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Roles")) {
				objectIdentification.smokeTest.selectRandomGridRow();
				objectIdentification.windowHandle
						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
				Playback.driver.close();
				res = false;
				break;
			}

			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				try {
					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					popup.acknowledge.okIfWindowExistAsWarning();
					objectIdentification.windowHandle.switchToMainWindow();
				}

			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					Playback.controlReadyThreadWait();
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.smokeTest
							.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
					res = false;
					break;
				}
			}
		}
	}
}



@Test (groups={"Base87"})   
public void SettingsSysParameterJurisSmokeTestScripts(ITestContext testContext) throws Exception
{
 
	testContext.setAttribute("testID", "SysParameterJuris");
	ExtentReport.CreateConsolidatedTest("SettingSystemParameter");
	ExtentReport.startReportSmokeTest("SettingSystemParameter");
	Browser.NavigateToLoginScreenSmoke();
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.CreateSmokeTest("SettingSystemParameter");
	System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	String count = BaseData.getBaseSmokeModuleValue("ScreenCount");
	int cou = Integer.parseInt(count);

	for (int i = 1; i <= cou; i++) {

		ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
		if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("System Parameter")) {
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.smokeTest.clickTheSearchButton();
			popup.acknowledge
					.okWithExpectedMessage("(6015) Enter at least one criteria/keyword to start the search");
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
			objectIdentification.randomIdentify
					.selectDropDownOption(Playback.driver.findElement(By.id("lstModule")));
			objectIdentification.smokeTest.clickTheSearchButton();
			objectIdentification.manualIdentify.saveTheScreenWithConfirm();
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
				popup.acknowledge.ok();
			} else {
				Playback.pageLoadThreadWait();
			}
		} else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Juris")) {
			objectIdentification.windowHandle
					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
			objectIdentification.smokeTest
					.saveAndCloseTheScreenGlobal(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
			objectIdentification.windowHandle.switchToMainWindow();
		} else
			objectIdentification.smokeTest.clickTheSearchButton();
		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			try {
				popup.acknowledge.okWithExpectedMessage("1011 - No record found");
				objectIdentification.windowHandle.switchToMainWindow();
			} catch (Exception e) {
				e.printStackTrace();
				ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				popup.acknowledge.okIfWindowExistAsWarning();
				objectIdentification.windowHandle.switchToMainWindow();
			}

		else {
			try {
				objectIdentification.windowHandle.switchToMainWindow();
			} catch (Exception e) {
				e.printStackTrace();
				ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
				objectIdentification.windowHandle.switchToMainWindow();
			}
		}
	}
}



	
	
    @AfterMethod(groups={"Base87","CMS87"})
	public void afterMethodRecords(ITestResult testResult) {

//  	  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
		/*
		 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		try {
			ExtentReport.getResultSmoke(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ExtentReport.getConsolidatedResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Playback.stop();

		login.Reset();
		loader.Reset();
		ExtentReport.GenerateHTML();
	}
    
    @AfterSuite(groups={"Base87","CMS87"})
    public void afterRunSuite()
    {
  	  ExtentReport.GenerateConsolidateHTML();
    	 System.gc();
    	}


}
