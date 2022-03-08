package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import dataAccess.BaseData;
import reports.ExtentReport;
import uIMaps.UIMapNames;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class BaseSmokeTest {

	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Names names;
	public UIMapNames uIMapNames;

	@BeforeMethod
	public void beforeMethodRecords(ITestContext testContext) {
		testContext.setAttribute("moduleName", "BaseSmokeTest");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		names = new Names();
		uIMapNames = new UIMapNames();

	}

	@Test // Vijay
	public void DocumentMgmtModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Document Mgmt");
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
									.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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
								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
					} else {
						objectIdentification.smokeTest.selectRandomGridRow();
						objectIdentification.windowHandle
								.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
						objectIdentification.smokeTest
								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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

	@Test // Vijay
	public void FacilityManagementModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Facility Management");
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
							.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

	}

	@Test // Vijay
	public void FireStaticModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Fire Static");
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
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
					objectIdentification.smokeTest
							.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

	}

	@Test // Vijay
	public void GeoModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Geo");
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
			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Address Search")) {
				Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
			}

			else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("ZIP Code")) {
				Playback.driver.findElement(By.xpath("//*[@id='cmdSearch']")).click();
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
					objectIdentification.windowHandle.switchToMainWindow();

				}
			}

			else {
				try {
					objectIdentification.windowHandle
							.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
					if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Address Search")) {
						Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();

					} else {
						objectIdentification.smokeTest.selectRandomGridRow();
					}
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
					if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Contact Entry")) {
						Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
						Playback.driver.close();
					} else {
						if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Address Search")) {
							objectIdentification.windowHandle.switchToMainWindow();
						}

						else if (BaseData.getTestContextData("EntryScreen" + i + "")
								.equalsIgnoreCase("Address Flag(P)")) {
							objectIdentification.smokeTest
									.saveAndCloseTheScreen(BaseData.getTestContextData("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
						} else {
							objectIdentification.smokeTest
									.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
							objectIdentification.windowHandle.switchToMainWindow();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

	}

	@Test // Vijay
	public void HomeModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Home");
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
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

	}

	@Test // Vijay
	public void EmploymentApplicantsModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Employment Applicants");
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
//					if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Applicant Search")) {

					// }
					// else {
					objectIdentification.smokeTest.selectRandomGridRow();
					objectIdentification.windowHandle
							.switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));

					objectIdentification.smokeTest
							.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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

	/*
	 * @Test // Vijay public void HelpDeskModuleSmokeTestScripts(ITestContext
	 * testContext) throws Exception { testContext.setAttribute("testID",
	 * "HelpDesk");
	 * ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
	 * Browser.NavigateToLoginScreenSmoke();
	 * login.loginScreen.logonUsingTestContextOtherDB();
	 * loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
	 * ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
	 * System.out.println(BaseData.getTestContextData("ModuleName")); String count =
	 * BaseData.getTestContextData("ScreensCount"); int cou =
	 * Integer.parseInt(count); for (int i = 1; i <= cou; i++) {
	 * 
	 * ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
	 * loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
	 * System.out.println(BaseData.getTestContextData("Screen" + i + ""));
	 * objectIdentification.windowHandle
	 * .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
	 * objectIdentification.smokeTest.clickTheSearchButton(); if
	 * (objectIdentification.windowHandle.windowExist("Acknowledge")) try {
	 * popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
	 * objectIdentification.windowHandle.switchToMainWindow(); } catch (Exception e)
	 * { e.printStackTrace();
	 * ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
	 * popup.acknowledge.okIfWindowExistAsWarning();
	 * objectIdentification.windowHandle.switchToMainWindow(); }
	 * 
	 * else { try { objectIdentification.windowHandle
	 * .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
	 * objectIdentification.smokeTest.selectRandomGridRow();
	 * objectIdentification.windowHandle
	 * .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
	 * objectIdentification.smokeTest
	 * .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i +
	 * "")); objectIdentification.windowHandle.switchToMainWindow(); } catch
	 * (Exception e) { e.printStackTrace();
	 * ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
	 * objectIdentification.windowHandle.switchToMainWindow(); } }
	 * 
	 * } }
	 */
	@Test // Vijay
	public void InventoryFleetModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Inventory & Fleet");
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

					} else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Mileage Log Entry")) {
						objectIdentification.windowHandle
								.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
						Playback.driver.findElement(By.id("cmdRefresh")).click();
					} else {
						objectIdentification.smokeTest
								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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

	@Test // Vijay
	public void K9ModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "K9");
		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
		System.out.println(BaseData.getTestContextData("ModuleName"));
		String count = BaseData.getTestContextData("ScreensCount");
		int cou = Integer.parseInt(count);
		for (int i = 3; i <= cou; i++) {

			ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
			loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
			System.out.println(BaseData.getTestContextData("Screen" + i + ""));
			objectIdentification.windowHandle
					.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
			if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("K9 Reports")) {
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
						objectIdentification.manualIdentify.saveAndCloseTheScreen();
					} else {
						objectIdentification.smokeTest
								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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

	@Test // Vijay
	public void MedicalModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Medical");
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
					objectIdentification.smokeTest
							.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

	}

	@Test // Vijay
	public void NamesModuleSmokeTestScripts(ITestContext testContext) throws Exception {
		testContext.setAttribute("testID", "Names");
		ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
		Browser.NavigateToLoginScreenSmoke();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
		ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
		System.out.println(BaseData.getTestContextData("ModuleName"));
		String count = BaseData.getTestContextData("ScreensCount");
		int cou = Integer.parseInt(count);
		for (int i = 6; i <= cou; i++) {

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
					else {
						objectIdentification.smokeTest
								.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
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

	/*
	 * @AfterMethod public void afterMethodRecords(ITestResult testResult) {
	 * 
	 * objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
	 * 
	 * try { Playback.takeScreenShotOnFailure(testResult); } catch (
	 * 
	 * IOException e) { e.printStackTrace(); }
	 * 
	 * try { ExtentReport.getResult(testResult); } catch (Exception e) {
	 * e.printStackTrace(); } Playback.stop();
	 * 
	 * login.Reset(); loader.Reset(); ExtentReport.GenerateHTML(); }
	 */

}
