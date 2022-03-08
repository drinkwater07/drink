package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import application.Popup;
import dataAccess.BaseData;
import reports.ExtentReport;
import resources.PropertiesFile;
import uIMaps.UIMapHome;
import uIMaps.UIMapPopup;

public class ObjectIdentification {
	public WindowHandle windowHandle;
	public ManualIdentify manualIdentify;
	public RandomIdentify randomIdentify;
	public ActionBuilder actionBuilder;
	public static Popup popup = new Popup();
	public FilesHandle filesHandle;
	public ReadPDF readPDF;
	public AttachmentsTab attachmentsTab;
	public SmokeTest smokeTest;

	UIMapHome uIMapHome = new UIMapHome();
	UIMapPopup uIMapPopup = new UIMapPopup();

	public ObjectIdentification() {
		if (windowHandle == null)
			windowHandle = new WindowHandle();
		if (manualIdentify == null)
			manualIdentify = new ManualIdentify();
		if (randomIdentify == null)
			randomIdentify = new RandomIdentify();
		if (actionBuilder == null)
			actionBuilder = new ActionBuilder();
		if (filesHandle == null)
			filesHandle = new FilesHandle();
		if (readPDF == null)
			readPDF = new ReadPDF();
		if (attachmentsTab == null)
			attachmentsTab = new AttachmentsTab();
		if (smokeTest == null)
			smokeTest = new SmokeTest();
	}

	public void reset() {
		windowHandle = null;
		manualIdentify = null;
		randomIdentify = null;
		actionBuilder = null;
		filesHandle = null;
	}

	public class WindowHandle {

		WebDriver driver = Playback.driver;

		/// <summary>
		/// This property method which is used to get the Phoenix loader screen driver
		/// string to switch
		/// </summary>
		public String phoenixMainWindow() {
			driver = Playback.driver;

			String window = null;

			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getTitle().contains("Public Safety Solution")) {

					driver.switchTo().window(appWindow);
					break;
				}

			}
			window = driver.getWindowHandle();
			return window;
		}

		public WebDriver switchToMainWindow() {
			driver = Playback.driver;
			phoenixMainWindow();
			return driver;
		}

		public void selectRadControlDropDownCheckAllSelect(WebElement uIRadControlDropDownList, String listItem) {
			driver = Playback.driver;
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div//label[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();

		}

		/// <summary>
		/// Close the current screen
		/// </summary>
		public void closeTheScreen() {

			Playback.driver.close();
		}

		/// <summary>
		/// Check if the window exist or not
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <returns></returns>
		public boolean windowExist(String windowTitle) {

			Playback.pageLoadThreadWait();
			driver = Playback.driver;
			boolean widnowExist = true;
			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getTitle().contains(windowTitle))
					widnowExist = true;

				else
					widnowExist = false;
			}
			Playback.driver = driver;
			Playback.windowCount = driver.getWindowHandles().size();
			return widnowExist;
		}

		/// <summary>
		/// Close all the Popup screen except main window
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <returns></returns>
		public void closeAllThePopupScreens() {
			Playback.pageLoadThreadWait();
			driver = Playback.driver;

			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getPageSource().contains("frmErrorHandler_Id")) {
					driver.switchTo().window(appWindow);
					driver.switchTo().window(appWindow).close();
				}
			}

			switchToMainWindow();
			for (String appWindow : driver.getWindowHandles()) {
				if (!driver.switchTo().window(appWindow).getTitle().contains("Public Safety Solution"))
					driver.switchTo().window(appWindow).close();
			}
		}

		public boolean alertsPresentConditions() {
			driver = Playback.driver;

			boolean presentFlag;

			try {
				driver.switchTo().alert();
				presentFlag = true;

			} catch (Exception ex) {
				presentFlag = false;
			}
			return presentFlag;
		}

		public void focusOnActiveElementAndSwitch() {
			Playback.pageLoadThreadWait();
			driver = Playback.driver;
			String currentWindow = driver.getWindowHandle();

			if (alertsPresentConditions() == false) {
				for (String appWindow : driver.getWindowHandles()) {
					if (driver.switchTo().window(appWindow).getPageSource().contains("frmErrorHandler_Id")) {
						driver.switchTo().window(appWindow);
					} else {
						driver.switchTo().window(currentWindow);
					}
				}
			} else if (alertsPresentConditions() == true) {
				driver.switchTo().alert().accept();
				driver.switchTo().window(currentWindow);
			} else {
				driver.switchTo().window(currentWindow);
			}
		}

		/// <summary>
		/// Close all the windows
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <returns></returns>
		public void closeAllTheWindows() {
			Playback.pageLoadThreadWait();
			driver = Playback.driver;

			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getPageSource().contains("frmErrorHandler_Id")) {
					driver.switchTo().window(appWindow);

				}
			}

			switchToMainWindow();
			for (String appWindow : driver.getWindowHandles()) {
				if (!Playback.driver.switchTo().window(appWindow).getTitle().contains("Public Safety Solution"))
					Playback.driver.switchTo().window(appWindow).close();
			}
			switchToMainWindow().close();
		}

		/// <summary>
		/// Check the Non-Title window Exist or not
		/// </summary>
		/// <param name="formName"></param>
		/// <returns></returns>
		public boolean nonTitleWidnowExist(String formName) {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			driver = Playback.driver;
			boolean widnowExist = true;
			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getPageSource().contains(formName))
					widnowExist = true;

				else
					widnowExist = false;
			}
			Playback.driver = driver;
			Playback.windowCount = driver.getWindowHandles().size();
			return widnowExist;

		}

		/// <summary>
		/// This method which is used to switch the web driver to expected Window using
		/// window title and form name
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <param name="formName"></param>
		/// <returns></returns>
		public WebDriver switchToWindowUsingFormName(String windowTitle, String formName) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			driver = Playback.driver;
			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getTitle().contains(windowTitle))
					if (driver.switchTo().window(appWindow).getPageSource().contains(formName)) {
						driver.switchTo().window(appWindow);
						break;
					}

			}

			return driver;
		}

		/// <summary>
		/// This method which is used to switch the web driver to Expected window using
		/// form name
		/// </summary>
		/// <param name="formName"></param>
		/// <returns></returns>
		public WebDriver switchToWindowUsingFormName(String formName) {

			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			driver = Playback.driver;
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			for (String appWindow : driver.getWindowHandles()) {
				driver.switchTo().window(appWindow);
				if (driver.switchTo().window(appWindow).getPageSource().contains(formName)) {
					driver.switchTo().window(appWindow);
					break;
				}

			}

			return driver;
		}

		/// <summary>
		/// This method which is used to switch the web driver to expected window using
		/// window title
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <returns></returns>
		public WebDriver switchToWindow(String windowTitle) {
			driver = Playback.driver;
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getTitle().contains(windowTitle)) {
					driver.switchTo().window(appWindow);
					break;
				}
			}

			return driver;
		}

		/// <summary>
		/// This method which is used to switch the web driver to expected window using
		/// window URL
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <returns></returns>
		public WebDriver switchToWindowUsingURL(String windowURL) {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			driver = Playback.driver;

			for (String appWindow : driver.getWindowHandles()) {
				if (driver.switchTo().window(appWindow).getCurrentUrl().contains(windowURL)) {
					driver.switchTo().window(appWindow);
					Playback.driver = driver;
					break;
				}
			}
			return driver;
		}

		/// <summary>
		/// Method which is used to switch the driver to Frame
		/// </summary>
		/// <param name="windowTitle"></param>
		/// <param name="frameSrcName"></param>
		/// <returns></returns>
		public WebDriver switchToFrame(String windowTitle, String frameSrcName) {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			driver = Playback.driver;
			driver = switchToWindow(windowTitle);
			WebElement pageiFrame = driver.findElement(By.xpath("//iframe[contains(@src,'" + frameSrcName + "')]"));
			driver.switchTo().frame(pageiFrame);
			return driver;
		}

		/// <summary>
		/// Method which is used to switch the driver to Frame
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="frameSrcName"></param>
		/// <returns></returns>
		public WebDriver switchToFrame(String frameSrcName) {
			driver = Playback.driver;
			// Playback.waitForPageLoad();
			Playback.pageLoadThreadWait();
			WebElement pageiFrame = Playback.driver
					.findElement(By.xpath("//iframe[contains(@src,'" + frameSrcName + "')]"));
			driver.switchTo().frame(pageiFrame);
			return driver;
		}

		public WebDriver switchToFrameUsingID(String frameID) {
			driver = Playback.driver;
			// Playback.waitForPageLoad();
			Playback.pageLoadThreadWait();
			WebElement pageiFrame = Playback.driver.findElement(By.xpath("//iframe[contains(@id,'" + frameID + "')]"));
			driver.switchTo().frame(pageiFrame);
			return driver;
		}

		public boolean checkFrameExist(String frameSrcName) {
			driver = Playback.driver;
			Playback.waitForPageLoad();
			boolean FrameExist = true;
			try {
				WebElement pageiFrame = Playback.driver
						.findElement(By.xpath("//iframe[contains(@src,'" + frameSrcName + "')]"));
				driver.switchTo().frame(pageiFrame);
				FrameExist = true;
			} catch (Exception e) {
				FrameExist = false;
			}

			return FrameExist;
		}

		/// <summary>
		/// Method which is used to switch the driver to Frame
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="frameSrcName"></param>
		/// <returns></returns>
		public WebDriver switchToFrame(WebElement pageiFrame) {
			driver = Playback.driver;
			Playback.pageLoadThreadWait();
			driver.switchTo().frame(pageiFrame);
			return driver;

		}

		/// <summary>
		/// This method which is used to switch the web driver to MainWindow Screen Tab
		/// </summary>
		/// <param name="strSrcName"></param>
		/// <returns></returns>
		public WebDriver switchToMainWindowScreenTab(String strSrcName) {
			driver = Playback.driver;
			Playback.pageLoadThreadWait();
			phoenixMainWindow();
			WebElement pageiFrame = Playback.driver
					.findElement(By.xpath("//iframe[contains(@src,'" + strSrcName + "')]"));
			driver.switchTo().frame(pageiFrame);
			return driver;

		}

		public void minimizeTheScreen() {
			Point p = Playback.driver.manage().window().getPosition();
			Dimension d = Playback.driver.manage().window().getSize();
			Playback.driver.manage().window().setSize(new Dimension(0, 0));
			Playback.driver.manage().window()
					.setPosition(new Point((d.getHeight() - p.getX()), (d.getWidth() - p.getY())));
		}

		public void closeTheScreenByRobot() {
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			robot.delay(3000);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.delay(3000);

		}

		public String getMainWindowHandle() {
			windowHandle.phoenixMainWindow();
			String mainhandle = Playback.driver.getWindowHandle();
			return mainhandle;

		}

		public Set<String> collectWindowHandles() {
			// TODO Auto-generated method stub
			Set<String> oldwindows = Playback.driver.getWindowHandles();
			return oldwindows;
		}

		public void switchToNewlyOpenedWindow(Set<String> oldHandles) {
			// Set newHandles = Playback.driver.getWindowHandles();
			for (String winHandle : driver.getWindowHandles()) {
				if (!oldHandles.contains(winHandle)) {
					Playback.driver.switchTo().window(winHandle);
					break;
				}
			}
		}
	}

	public class ManualIdentify {

		public WebDriver driver;

		public ManualIdentify() {
			driver = Playback.driver;

		}
		
		public void waitToDisappear(long timeOutInSeconds, String element) {
			
			By Ele =By.xpath(element);
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			//wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(Ele));
			}
		

		public boolean controlExist(WebElement uIWebElement) {

			boolean controlExist;

			try {
				controlExist = uIWebElement.isDisplayed();
				return controlExist;
			}

			catch (Exception ex) {
				return controlExist = false;

			}

		}

		public boolean checkElementAvailableOrNot(WebElement uIRadControlDropDownList) {
			try {
				String tag = uIRadControlDropDownList.getTagName();
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		/// <summary>
		/// Returns the checkbox checked status as true or false
		/// </summary>
		/// <param name="uIChekBox"></param>
		/// <returns></returns>
		public boolean getChekboxCheckedStatus(WebElement uIChekBox) {

			if (uIChekBox.getAttribute("checked").compareTo("checked") == 0)
				return true;
			else
				return false;

		}

		/// <summary>
		/// Used to get the iframe IWebElement on a page
		/// </summary>
		/// <param name="strSrcName"></param>
		/// <returns></returns>
		public WebElement getFrame(String strSrcName) {
			driver = Playback.driver;
			// WebElement streetSearchFrame =
			// driver.findElement(By.xpath("//iframe[contains(@src,'Geo&ScreenName=Street
			// Search')]"));
			WebElement pageiFrame = driver.findElement(By.xpath("//iframe[contains(@src,'" + strSrcName + "')]"));
			return pageiFrame;

		}

		/// <summary>
		/// Get the DropDown IWebElement
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public Select getSelectElement(String ddlID) {
			Select dropDown = new Select(driver.findElement(By.id(ddlID)));
			return dropDown;

		}

		/// <summary>
		/// Used to get the Dropdown IWebElement
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="ddList"></param>
		/// <returns></returns>
		public Select getSelectElement(WebElement ddList) {
			Select dropDown = new Select(ddList);
			return dropDown;

		}

		/// <summary>
		///
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public String getDropDwonSelectedItem(String ddlID) {

			Select dropDown = new Select(driver.findElement(By.id(ddlID)));
			return dropDown.getFirstSelectedOption().getText();
		}

		/// <summary>
		///
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public String getDropDownSelectedItem(WebElement ddList) {

			Select dropDown = new Select(ddList);
			return dropDown.getFirstSelectedOption().getText();
		}

		public int getDropDownSelectedItemIdex(WebElement ddList) {

			Select dropDown = new Select(ddList);
			List<WebElement> options = dropDown.getOptions();
			String selected = dropDown.getFirstSelectedOption().getText();
			int idx = 0;
			for (int i = 0; i < options.size(); i++) {
				idx++;
				if (options.get(i).getText().equalsIgnoreCase(selected)) {
					break;
				}
			}
			System.out.println(idx);
			return idx;
		}

		///
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public String getDropDwonSelectedItem(WebElement WebElement) {

			Select dropDown = new Select(WebElement);
			return dropDown.getFirstSelectedOption().getText();
		}

		/// <summary>
		/// Method which is used to count the dropdown count
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public int getDropDownOptionsCount(String ddlID) {

			Select dropDown = new Select(driver.findElement(By.id(ddlID)));
			return dropDown.getOptions().size();
		}

		/// <summary>
		/// Method which is used to count the dropdown count
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public int getDropDownOptionsCount(WebElement ddList) {

			Select dropDown = new Select(ddList);
			return dropDown.getOptions().size();
		}

		/// <summary>
		/// Method which is used to get the dropdown elements
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		public List<WebElement> getDropDownOptionsElements(WebElement ddlID) {
			Select dropDown = new Select(ddlID);
			List<WebElement> options = dropDown.getOptions();
			return options;
		}

		/// <summary>
		/// Method which is used to get the dropdown values
		/// </summary>
		/// <param name="ddlID"></param>
		/// <returns></returns>
		///
		public List<String> getDropDownValues(WebElement ddList) {
			List<WebElement> dropdownValues = manualIdentify.getDropDownOptionsElements(ddList);
			List<String> dropdownList = new ArrayList<String>();
			for (WebElement element : dropdownValues) {
				dropdownList.add(element.getText());

			}
			return dropdownList;
		}

		/// <summary>
		/// Get IWebElement by IWebElement contains text
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="srchText"></param>
		/// <returns></returns>
		public WebElement getIWebElementContainsText(String srchText) {

			driver = Playback.driver;
			WebElement iWebElem = driver.findElement(By.xpath("//span[contains(text(), '" + srchText + "')]"));
			return iWebElem;

		}

		/// <summary>
		/// Get IWebElement by element id
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="labelid"></param>
		/// <param name="text"></param>
		/// <returns></returns>
		public WebElement getIWebElementById(String labelid) {
			driver = Playback.driver;
			WebElement iWebElem = driver.findElement(By.id(labelid));
			return iWebElem;
		}

		/// <summary>
		/// Get IWebElement by element name
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="labelid"></param>
		/// <param name="text"></param>
		/// <returns></returns>
		public WebElement getIWebElementByName(String labelid) {
			driver = Playback.driver;
			WebElement iWebElem = driver.findElement(By.name(labelid));
			return iWebElem;
		}

		/// <summary>
		/// Get IWebElement by xpath
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="xpath"></param>
		/// <returns></returns>
		public WebElement getIWebElementByXPath(String xpath) {
			driver = Playback.driver;
			WebElement iWebElem = driver.findElement(By.xpath(xpath));
			return iWebElem;

		}

		public WebElement getParentIWebElement(WebElement uICurrentElement, int currentElementOfParentHierarchyValue) {
			WebElement uIParentElement = uICurrentElement;
			while (currentElementOfParentHierarchyValue > 0) {
				uIParentElement = uICurrentElement.findElement(By.xpath(".."));
				uICurrentElement = uIParentElement;
				currentElementOfParentHierarchyValue--;
			}

			return uIParentElement;

		}

		public void scrollIntoView(WebElement uIElement) {
			driver = Playback.driver;
			if (!uIElement.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uIElement);

			}
		}

		public void scrollHorizontally() {
			driver = Playback.driver;
			Actions builder = new Actions(driver);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(1000,0)");

		}

		public void highlighElement(WebElement uIElement) {
			JavascriptExecutor js = (JavascriptExecutor) Playback.driver;
			js.executeScript("arguments[0].style.border='3px solid red'", uIElement);
		}

		public void setFocusElement(WebElement uIElement) {

			JavascriptExecutor js = (JavascriptExecutor) Playback.driver;
			js.executeScript("arguments[0].focus()", uIElement);

		}

		public void saveTheScreen() {
			Playback.driver.findElement(By.id("cmdSave")).click();
		}

		public void SaveTheScreen() {
			Playback.driver.findElement(By.id("cmdsave")).click();
		}

		public void saveAndCloseTheScreen() {
			Playback.driver.findElement(By.id("cmdSaveNClose")).click();

		}

		public void saveTheScreenWithConfirm() {
			Playback.driver.findElement(By.id("cmdSave")).click();
			popup.confirm.yes();
		}

		public void saveAndCloseTheScreenWithConfirm() {

			Playback.driver.findElement(By.id("cmdSaveNClose")).click();
			try {
				popup.confirm.yes();
			} catch (NoAlertPresentException e) {
				popup.acknowledge.okIfWindowExist();
				windowHandle.switchToMainWindow();
			} catch (Exception e) {
				Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			}
		}

		public void saveAndOpenNewScreen() {

			Playback.driver.findElement(By.id("cmdSaveNAddNew")).click();

		}

		public void clickTheSearchButton() {

			try {
				Playback.implictwait();
				Playback.driver.findElement(By.id("cmdSearch")).click();
				Playback.gridLoadThreadWait();
			} catch (Exception e) {
				Playback.implictwait();
				Playback.driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
				Playback.gridLoadThreadWait();
			}
		}

		/// <summary>
		/// Click the link using link string
		/// </summary>
		/// <param name="linkString"></param>
		public void clickTheLink(String linkString) {

			Playback.driver.findElement(By.xpath("//span[contains(text(),'" + linkString + "')]")).click();
			Playback.gridLoadThreadWait();

		}

		//
		public void clickTheLinkByText(String linkText) {
			Playback.driver.findElement(By.linkText(""));

		}

		public void clickTheLinkByPartialLinkText(String partialLinkText) {
			Playback.driver.findElement(By.partialLinkText(""));

		}

		// need to check
		public void clickTheButtonwithID(String ID) {

			Playback.driver.findElement(By.id(ID)).click();
			Playback.pageLoadThreadWait();

		}

		/// <summary>
		/// Click the search line and open the entry screen
		/// </summary>
		public void clickTheSearchLinkButton() {
			Playback.driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
			Playback.gridLoadThreadWait();
		}

		/// <summary>
		/// Click Add New button and open the entry screen
		/// </summary>
		public void openTheNewEntryScreen() {
			Playback.driver.findElement(By.xpath("//span[contains(text(),'Add New')]")).click();
		}

		/// <summary>
		/// Click the link find by link text
		/// </summary>
		/// <param name="linkText"></param>
		public void clickTheLinkByLinkText(String linkText) {
			Playback.driver.findElement(By.linkText(linkText)).click();
		}

		/// <summary>
		/// Method which is used to print the screen
		/// </summary>
		/// <param name="windowTitle"></param>
		public void printTheScreen() {
			Playback.driver.findElement(By.id("cmdPrint")).click();
		}

		/// <summary>
		/// Method which is used to Reset the screen
		/// </summary>
		/// <param name="windowTitle"></param>
		public void resetTheScreen() {
			Playback.driver.findElement(By.id("cmdRefresh")).click();
		}

		public void executeJavaScript(WebElement uIWebElement, String JSscript) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript(JSscript, uIWebElement);

		}

		public void selectPropertyAction(WebElement uIWebElement, String actionStatus) {
			Playback.waitForPageLoad();
			Playback.waitForPageLoad();
			WebElement actionElem = uIWebElement
					.findElement(By.xpath("//ul/li/ul/li/div/span[text()='" + actionStatus + "']"));
			Actions builder = new Actions(Playback.driver);
			((JavascriptExecutor) Playback.driver).executeScript("arguments[0].click();", actionElem);
			Playback.waitForPageLoad();

		}

		public void selectGridTableRow(String tableId, int rowIndex) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			tableRows.get(rowIndex).click();

		}

		public void selectGridTableRow(WebElement uITable, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			tableRows.get(rowIndex).click();
		}

		public void selectGridRowByCellInnerText(String tableId, String cellInnerText) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement targetCell = table
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			targetCell.click();

		}

		public void selectGridRowByCellInnerText(WebElement uITable, String cellInnerText) {

			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			targetCell.click();
		}

		public void selectGridRowByCellInnerText(WebElement uITable, String cellInnerText, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			manualIdentify.scrollIntoView(tableRows.get(rowIndex));
			WebElement targetCell = tableRows.get(rowIndex)
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			targetCell.click();
		}

		public void deleteGridRowByCellInnerText(String tableId, String cellInnerText) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement targetCell = table
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(),'" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteCell = targetRow.findElement(By.xpath("//td[@class ='Delete_Icon_Style']"));
			deleteCell.click();

		}

		public void deleteGridRowByCellInnerText(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteCell = targetRow.findElement(By.xpath("//td[@class ='Delete_Icon_Style']"));
			deleteCell.click();
		}

		public void deleteGridRowByCellInnerText(WebElement uITable, String cellInnerText, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			manualIdentify.scrollIntoView(tableRows.get(rowIndex));
			WebElement targetCell = tableRows.get(rowIndex)
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteCell = targetRow.findElement(By.xpath("//td[@class ='Delete_Icon_Style']"));
			deleteCell.click();
		}

		public void deleteGridRowByCellInnerTextUsingContainsClass(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath(".//td[contains(@class,'Delete_Icon_Style')]"));
			deleteIcon.click();
		}

		public void deleteSelectedGridRowByCellInnerText(String tableId, String cellInnerText) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement targetCell = uITable.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath("//td[contains(@class,'Delete_Icon_Style')]"));
			deleteIcon.click();
		}

		public void deleteSelectedGridRowByCellInnerText(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath("//td[contains(@class,'Delete_Icon_Style')]"));
			deleteIcon.click();
		}

		public void deleteSelectedGridRowByCellInnerTextFire(WebElement uITable, String cellInnerText) {
			WebElement element = ((SearchContext) uITable)
					.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(element);
			element.click();
			((SearchContext) ((SearchContext) element).findElement(By.xpath("..")))
					.findElement(
							By.xpath("//tr[contains(@class,'ActiveRow')]//td[contains(@class,'Delete_Icon_Style')]"))
					.click();
		}

		public void deleteHGridRowByCellInnerTextExpungement(String tableId, String cellInnerText) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement targetCell = uITable.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath("//td[@class='CSheaderX']"));
			deleteIcon.click();
		}

		public void deleteHGridRowByCellInnerTextExpungement(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath(".//td[@class='CSheaderX']"));
			deleteIcon.click();
		}

		public void doubleClickGridRowByCellInnerText(WebElement uITable, String cellInnerText) {

			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			Actions action = new Actions(Playback.driver);
			Playback.implictwait();
			action.doubleClick(targetCell).build().perform();

		}

		public void selectGridRowCheckBoxByCellInnerText(String tableId, String cellInnerText) {

			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement targetCell = table
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement targetCheckbox = targetRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(targetCheckbox);
			targetCheckbox.click();

		}

		public void selectGridRowCheckBoxByCellInnerText(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement targetCheckbox = targetRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(targetCheckbox);
			targetCheckbox.click();
		}

		public void selectContextMenuItemInTheGridRow(String tableId, String cellInnerText, String selectValue) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement cellText = table
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(cellText);
			Actions action = new Actions(Playback.driver);
			action.contextClick(cellText).build().perform();
			WebElement uIUltraWeb = cellText
					.findElement(By.xpath("//div[contains(@id,'Menu')]//*[contains(text(),'" + selectValue + "')]"));
			uIUltraWeb.click();
		}

		public void selectContextMenuItemInTheGridRow(WebElement uITable, String cellInnerText, String selectValue,
				String string) {

			WebElement cellText = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(cellText);
			Actions action = new Actions(Playback.driver);
			action.contextClick(cellText).build().perform();
			WebElement uIUltraWeb = cellText
					.findElement(By.xpath("//div[contains(@id,'Menu')]//*[contains(text(),'" + selectValue + "')]"));
			uIUltraWeb.click();
		}

		public void SelectContextMenuItemInTheGridRowByUniqueRowValueOnlyForFire(String tableId, String uniqueRowValue,
				String columnName, String selectValue) {

			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement uIRow = getGridRowByCellInnerText(uITable, uniqueRowValue);
			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);
			WebElement uICell = rowCells.get(idxValue);
			manualIdentify.scrollIntoView(uICell);
			new Actions(driver).contextClick(uICell).perform();
			WebElement uIUltraWeb = uICell.findElement(
					By.xpath("//div[@id='tabInspection_tmpl1_ctrlusrinsviolation_UltraMenu']//*[contains(text(),'"
							+ selectValue + "')]"));
			uIUltraWeb.click();

		}

		public void SelectContextMenuItemInTheGridRowByUniqueRowValueOnlyForFire(WebElement uITable,
				String uniqueRowValue, String columnName, String selectValue) {

			driver = Playback.driver;
			WebElement uIRow = getGridRowByCellInnerText(uITable, uniqueRowValue);
			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);
			WebElement uICell = rowCells.get(idxValue);
			manualIdentify.scrollIntoView(uICell);
			new Actions(driver).contextClick(uICell).perform();
			WebElement uIUltraWeb = uICell.findElement(
					By.xpath("//div[@id='tabInspection_tmpl1_ctrlusrinsviolation_UltraMenu']//*[contains(text(),'"
							+ selectValue + "')]"));
			uIUltraWeb.click();

		}

		public void selectRightClickTabMenuByTabText(String TabName, String selectValue) {

			windowHandle.switchToMainWindow();
			WebElement targetCell = driver.findElement(By.xpath(".//span[contains(text(), '" + TabName + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb1 = targetCell
					.findElement(By.xpath("//div[@id='ContextMenu_ToRadTabstrip_detached']"));
			// driver.SwitchTo().Frame("about");
			WebElement uIUltraWeb2 = uIUltraWeb1.findElement(
					By.xpath("//ul[@class='rmActive rmVertical rmGroup rmLevel1']/li/a/span[contains(text(),'"
							+ selectValue + "')]"));
			uIUltraWeb2.click();

		}

		public void reloadScreen(String ScreenName) {
			Actions ac = new Actions(Playback.driver);
			windowHandle.switchToMainWindow();
			Playback.controlReadyThreadWait();
			WebElement ScreenElement = Playback.driver
					.findElement(By.xpath("//span[@class='rtsTxt'][contains(text(),'" + ScreenName + "')]"));
			ac.contextClick(ScreenElement).build().perform();
			Playback.gridLoadThreadWait();
			WebElement Reload = Playback.driver.findElement(By.xpath("//span[contains(text(),'Reload Tab')]"));
			Boolean result = Reload.isDisplayed();
			if (result == true) {
				Reload.click();
				Playback.controlReadyThreadWait();
			}
			Playback.controlReadyThreadWait();

		}

		public void selectRightClickTabMenuByTabText(WebElement TabName, String selectValue) {

			// WindowHandle windowHandle = new WindowHandle();
			windowHandle.switchToMainWindow();
			WebElement targetCell = driver.findElement(By.xpath(".//span[contains(text(), '" + TabName + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb1 = targetCell
					.findElement(By.xpath("//div[@id='ContextMenu_ToRadTabstrip_detached']"));
			// driver.SwitchTo().Frame("about");
			WebElement uIUltraWeb2 = uIUltraWeb1.findElement(
					By.xpath("//ul[@class='rmActive rmVertical rmGroup rmLevel1']/li/a/span[contains(text(),'"
							+ selectValue + "')]"));
			uIUltraWeb2.click();

		}

		public void selectGridHeaderColumnName(String tableId, String columnName) {
			driver = Playback.driver;
			WebElement uIHeaderTableRow = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement uIThemeHeader = uIHeaderTableRow
					.findElement(By.xpath("//table/tbody/tr[contains(@class,'ThemeHeader')]"));
			WebElement targetRow = uIThemeHeader.findElement(By.xpath(".."));
			WebElement uIHeaderCells = targetRow.findElement(By.xpath("//th[contains(text(),'" + columnName + "')]"));
			uIHeaderCells.click();

		}

		/// <summary>
		/// Method which is used to get the Gird Header column Cell IWebElement
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uItable"></param>
		/// <param name="columnName"></param>
		/// <returns></returns>
		public void selectGridHeaderColumnName(WebElement uITable, String columnName) {

			WebElement uIThemeHeader = uITable.findElement(By.xpath("//table/tbody/tr[contains(@class,'Header')]"));
			WebElement targetRow = uIThemeHeader.findElement(By.xpath(".."));
			WebElement uIHeaderCells = targetRow.findElement(By.xpath("//th[contains(text(),'" + columnName + "')]"));
			uIHeaderCells.click();

		}
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uItable"></param>
		/// <param name="columnName"></param>
		/// <returns>columnName</returns>

		public WebElement getGridHeaderColumnName(WebElement uITable, String columnName) {

			WebElement uIThemeHeader = uITable.findElement(By.xpath("//table/tbody/tr[contains(@class,'Header')]"));
			WebElement targetRow = uIThemeHeader.findElement(By.xpath(".."));
			WebElement uIHeaderCells = targetRow.findElement(By.xpath("//th[contains(text(),'" + columnName + "')]"));
			return uIHeaderCells;

		}

		public WebElement getGridHeaderTableRow(String tableId) {
			driver = Playback.driver;
			WebElement uIHeaderTableRow = driver.findElement(
					By.xpath("//div[@id='" + tableId + "']//table/tbody/tr[contains(@class,'ThemeHeader')]"));
			return uIHeaderTableRow;
		}

		public WebElement getGridHeaderTableRow(WebElement uITable) {
			WebElement uIHeaderTableRow = uITable
					.findElement(By.xpath("//table/tbody/tr[contains(@class,'ThemeHeader')]"));
			return uIHeaderTableRow;
		}

		public WebElement getGridHeaderTableCheckBox(WebElement uITable) {
			WebElement uIHeaderTableRow = uITable.findElement(By.xpath("//table//tbody//th//img"));
			return uIHeaderTableRow;
		}

		public WebElement getGridTableRow(String tableId, int rowIndex) {

			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement row = tableRows.get(rowIndex);
			return row;
		}

		public WebElement getGridTableRow(WebElement uITable, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement row = tableRows.get(rowIndex);
			return row;
		}

		public WebElement getGridRowByCellInnerText(String tableId, String cellInnerText) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement tableRow = table.findElement(By.xpath(".//table/tbody[contains(@class,'Item')]"));
			WebElement row = tableRow.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			return row;
		}

		public WebElement getGridRowByCellInnerText(WebElement uITable, String cellInnerText) {
			WebElement uITableBody = uITable.findElement(By.xpath(".//table/tbody[contains(@class,'Item')]"));
			WebElement uIcell = uITableBody
					.findElement(By.xpath(".//tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement uIRow = uIcell.findElement(By.xpath(".."));
			manualIdentify.scrollIntoView(uIRow);
			return uIRow;
		}
		public WebElement getGridRowByCellInnerTextUsingText(WebElement uITable, String cellInnerText) {
			WebElement uITableBody = uITable.findElement(By.xpath(".//table/tbody[contains(@class,'Item')]"));
			WebElement uIcell = uITableBody
					.findElement(By.xpath(".//tr/td[text()= '" + cellInnerText + "']"));
			WebElement uIRow = uIcell.findElement(By.xpath(".."));
			manualIdentify.scrollIntoView(uIRow);
			return uIRow;
		}
		public int getGridTableRowsCount(String tableId) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			return tableRows.size();

		}

		public int getGridTableRowsCount(WebElement uITable) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			return tableRows.size();
		}

		public List<WebElement> getGridTableRowsCollection(String tableId) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			return tableRows;
		}

		public List<WebElement> getGridTableRowsCollection(WebElement uITable) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			return tableRows;
		}

		public List<String> getGridRowCellsValues(String tableId, int rowIndex) {
			List<String> cellValues = new ArrayList<String>();

			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));

			for (WebElement cell : rowCells) {
				cellValues.add(cell.getText());
			}
			return cellValues;
		}
		
		
		

		public List<String> getGridRowCellsValues(WebElement uITable, int rowIndex) {

			List<String> cellValues = new ArrayList<String>();

			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));

			for (WebElement cell : rowCells) {
				cellValues.add(cell.getText());
			}
			return cellValues;
		}

		public List<String> getGridRowCellsValues(WebElement uIRow) {

			List<String> cellValues = new ArrayList<String>();

			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));

			for (WebElement cell : rowCells) {
				cellValues.add(cell.getText());
			}
			return cellValues;

		}

		public List<WebElement> getGridRowCells(String tableId, int rowIndex) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			return rowCells;

		}

		public List<WebElement> getGridRowCells(WebElement uITable, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			return rowCells;
		}

		public int getGridRowCellsCount(String tableId, int rowIndex) {
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			return rowCells.size();
		}

		public int getGridRowCellsCount(WebElement uITable, int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> rowCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			return rowCells.size();
		}

		public WebElement getGridCell(String tableId, String cellInnerText) {
			driver = Playback.driver;
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			WebElement cell = table.findElement(By.xpath(".//td[contains(text() = '" + cellInnerText + "')]"));
			return cell;

		}

		public WebElement getGridCell(WebElement uITable, String cellInnerText) {
			driver = Playback.driver;
			WebElement cell = null;
			List<WebElement> tableCells = uITable
					.findElements(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			for (WebElement uICell : tableCells) {
				if (uICell.isDisplayed()) {
					cell = uICell;
					break;
				}
			}
			return cell;
		}

		public WebElement getGridCell(String tableId, int rowIndex, String cellText) {
			driver = Playback.driver;
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement tableRow = tableRows.get(rowIndex);
			WebElement cell = tableRow.findElement(By.xpath(".//td[contains(text(), '" + cellText + "')]"));
			return cell;
		}

		public WebElement getGridCell(WebElement uITable, int rowIndex, String cellText) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement cell = tableRows.get(rowIndex)
					.findElement(By.xpath(".//td[contains(text(), '" + cellText + "')]"));
			return cell;
		}

		public WebElement getGridCell(String tableId, String colName, int rowIndex) {
			driver = Playback.driver;
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));

			int idxValue = 0;
			idxValue = getGridColumnIndex(tableId, colName);

			List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableCells.get(idxValue);
			return element;
		}

		public WebElement getGridCell(WebElement uITable, String colName, int rowIndex) {
			driver = Playback.driver;

			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));

			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, colName);

			List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableCells.get(idxValue);
			manualIdentify.scrollIntoView(element);
			return element;
		}

		public WebElement getGridCell(String tableId, int rowIndex, int columnIndex) {
			driver = Playback.driver;
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> tableColumns = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableColumns.get(columnIndex);
			return element;
		}

		public WebElement getGridCell(WebElement uITable, int rowIndex, int columnIndex) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			List<WebElement> tableColumns = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableColumns.get(columnIndex);
			return element;
		}

		public WebElement getGridCell(String tableId, String uniqueRowValue, String columnName) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement uIRow = getGridRowByCellInnerText(uITable, uniqueRowValue);
			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);
			WebElement uICell = rowCells.get(idxValue);
			manualIdentify.scrollIntoView(uICell);
			return uICell;
		}

		public WebElement getGridCell(WebElement uITable, String uniqueRowValue, String columnName) {
			
			WebElement uIRow = getGridRowByCellInnerText(uITable, uniqueRowValue);
			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);
			WebElement uICell = rowCells.get(idxValue);
			manualIdentify.scrollIntoView(uICell);
			return uICell;
			
		}

		public WebElement getGridCell(WebElement uITable, WebElement uIRow, String columnName) {
			driver = Playback.driver;
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			List<WebElement> rowCells = uIRow.findElements(By.tagName("td"));
			WebElement uICell = rowCells.get(idxValue);
			manualIdentify.scrollIntoView(uICell);
			return uICell;

		}

		public String getGridCellInnerText(String tableId, String columnName, int rowIndex) {
			driver = Playback.driver;
			WebElement table = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));

			int idxValue = 0;
			idxValue = getGridColumnIndex(tableId, columnName);

			List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableCells.get(idxValue);
			manualIdentify.scrollIntoView(element);
			return element.getText();

		}

		public String getGridCellInnerText(WebElement uITable, String columnName, int rowIndex) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));

			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableCells.get(idxValue);
			manualIdentify.scrollIntoView(element);
			return element.getText();
		}

		public WebElement getGridHeaderColumnCell(String tableId, String columnName) {
			driver = Playback.driver;
			WebElement uIHeaderTableRow = driver.findElement(
					By.xpath("//div[@id='" + tableId + "']//table/tbody/tr[contains(@class,'ThemeHeader')]"));
			List<WebElement> uIHeaderCells = uIHeaderTableRow
					.findElements(By.xpath("//th[text()='" + columnName + "']"));

			WebElement uIHeaderCell = null;
			for (WebElement elem : uIHeaderCells) {

				if (elem.isDisplayed()) {
					uIHeaderCell = elem;
					break;
				}

			}

			return uIHeaderCell;

		}

		/// <summary>
		/// Method which is used to get the Gird Header column Cell IWebElement
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uItable"></param>
		/// <param name="columnName"></param>
		/// <returns></returns>
		public WebElement getGridHeaderColumnCell(WebElement uITable, String columnName) {

			// driver = Playback.driver;
			WebElement uIHeaderCell = null;
			WebElement uIHeaderTableRow = uITable.findElement(By.xpath("//table/tbody/tr[contains(@class,'Header')]"));

			List<WebElement> uIHeaderCells = uIHeaderTableRow
					.findElements(By.xpath("//th[text()='" + columnName + "']"));
			if (uIHeaderCells.size() == 0) {
				uIHeaderCells = uIHeaderTableRow.findElements(By.xpath("//th//span[text()='" + columnName + "']"));
				for (WebElement elem : uIHeaderCells) {
					if (elem.isDisplayed()) {
						uIHeaderCell = elem.findElement(By.xpath(".."));
						break;
					}

				}
			} else {
				for (WebElement elem : uIHeaderCells) {
					if (elem.isDisplayed()) {
						uIHeaderCell = elem;
						break;
					}

				}
			}

			return uIHeaderCell;
		}
		
		public int getGridColumnIndex(String tableId, String columnName) {
			WebElement uIColumnCell = getGridHeaderColumnCell(tableId, columnName);
			int idxValue = Integer.parseInt(uIColumnCell.getAttribute("idx"));
			return idxValue;
		}

		/// <summary>
		/// Method which is used to get the Grid column Index that is td idx attribute
		/// value
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uItable"></param>
		/// <param name="columnName"></param>
		/// <returns></returns>
		public int getGridColumnIndex(WebElement uITable, String columnName) {
			WebElement uIColumnCell = getGridHeaderColumnCell(uITable, columnName);
			int idxValue = Integer.parseInt(uIColumnCell.getAttribute("idx"));
			return idxValue;
		}

		public int GetGridRowIndex(WebElement uITable, String columnName) {
			WebElement uIColumnCell = getGridHeaderColumnCell(uITable, columnName);
			int idxValue = Integer.parseInt(uIColumnCell.getAttribute("adr"));
			return idxValue;
		}

		public List<String> getGridTableColumnValues(String tableId, String columnName) {

			List<String> columnValues = new ArrayList<String>();

			WebElement uITable = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			for (WebElement item : tableRows) {
				manualIdentify.scrollIntoView(item);
				List<WebElement> rowCells = item.findElements(By.tagName("td"));
				WebElement uICell = rowCells.get(idxValue);
				columnValues.add(uICell.getText());
			}

			return columnValues;

		}

		public List<String> getGridTableColumnValues(WebElement uITable, String columnName) {
			List<String> columnValues = new ArrayList<String>();

			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			for (WebElement item : tableRows) {
				manualIdentify.scrollIntoView(item);

				List<WebElement> rowCells = item.findElements(By.tagName("td"));
				WebElement uICell = rowCells.get(idxValue);
				columnValues.add(uICell.getText());
			}

			return columnValues;
		}

		public List<WebElement> getGridTableColumnCells(String tableId, String columnName) {
			List<WebElement> uICellsList = new ArrayList<WebElement>();
			WebElement uITable = driver.findElement(By.xpath("//div[@id ='" + tableId + "']"));
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			for (WebElement item : tableRows) {
				manualIdentify.scrollIntoView(item);
				List<WebElement> rowCells = item.findElements(By.tagName("td"));
				WebElement uICell = rowCells.get(idxValue);
				uICellsList.add(uICell);
			}

			return uICellsList;
		}

		public List<WebElement> getGridTableColumnCells(WebElement uITable, String columnName) {
			List<WebElement> uICellsList = new ArrayList<WebElement>();

			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			int idxValue = 0;
			idxValue = getGridColumnIndex(uITable, columnName);

			for (WebElement item : tableRows) {
				manualIdentify.scrollIntoView(item);

				List<WebElement> rowCells = item.findElements(By.tagName("td"));
				WebElement uICell = rowCells.get(idxValue);
				uICellsList.add(uICell);
			}

			return uICellsList;
		}

		public void selectDropDownOption(String ddlID, String ddlOptionValue) {
			driver = Playback.driver;
			Select dropDown = new Select(driver.findElement(By.id(ddlID)));
			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				dropDown.getOptions().size();
				dropDown.selectByValue(ddlOptionValue);
			}

			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				dropDown.getOptions().size();
				dropDown.selectByValue(ddlOptionValue);
			}

		}

		/// <summary>
		/// Drop down value to select
		/// </summary>
		/// <param name="uIddList"></param>
		/// <param name="ddlOptionValue"></param>
		public void selectDropDownOption(WebElement uIddList, String ddlOptionValue) {
			driver = Playback.driver;
			Select dropDown = new Select(uIddList);
			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				dropDown.getOptions().size();
				dropDown.selectByVisibleText(ddlOptionValue);
			}

		}

		/// <summary>
		/// Select the Dropdown value
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIddList"></param>
		/// <param name="ddlOptionIndex"></param>
		public void selectDropDownOption(WebElement uIddList, int ddlOptionIndex) {
			driver = Playback.driver;
			Select dropDown = new Select(uIddList);
			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				dropDown.getOptions().size();
				dropDown.selectByIndex(ddlOptionIndex);
			}

		}

		/// <summary>
		/// This method which is used to select the Rad dropdown option
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="ddlID"></param>
		public void selectRadControlDropDownValueSelect(String uIRadControlDropDownID, String listItem) {
			driver = Playback.driver;
			WebElement uIRadControlDropDownList = driver.findElement(By.id(uIRadControlDropDownID));
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div/ul//li//label[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();
		}

		/// <summary>
		/// This method which is used to select the Rad dropdown option
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="ddlID"></param>
		public void selectRadControlDropDownValueSelect(WebElement uIRadControlDropDownList, String listItem) {
			driver = Playback.driver;
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div/ul//li//label[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();

		}

		/// <summary>
		/// This method which is used to select the Rad dropdown option check box
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIRadControlDropDownID"></param>
		/// <param name="noOfItemsToSelect"></param>
		public void selectRadControlDropDownCheckBoxes(String uIRadControlDropDownID, List<String> optionsList) {
			driver = Playback.driver;
			WebElement uIRadControlDropDownList = driver.findElement(By.id(uIRadControlDropDownID));
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));

			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					box.click();
					break;
				}
			}

		}

		/// <summary>
		/// This method which is used to select the Rad dropdown option check box
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIRadControlDropDownID"></param>
		/// <param name="noOfItemsToSelect"></param>
		public void selectRadControlDropDownCheckBoxes(WebElement uIRadControlDropDownList, String listItem) {
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));

			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					box.isDisplayed();
					box.click();
					break;
				}
			}

		}

		public WebElement getContextMenuItemInTheGridRow(WebElement uITable, String cellInnerText, String selectValue) {
			WebElement targetCell = uITable.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb = targetCell
					.findElement(By.xpath("//div[@id='UltraWebMenu1']//*[contains(text(),'" + selectValue + "')]"));
			return uIUltraWeb;

		}

		/// <summary>
		///
		/// </summary>
		/// <param name="uITable"></param>
		/// <param name="cellInnerText"></param>
		/// <param name="selectValue"></param>
		/// <returns></returns>
		public WebElement getSettingsRolesContextMenuItemInTheGridRow(WebElement uITable, String cellInnerText,
				String selectValue) {
			WebElement targetCell = uITable.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb = targetCell
					.findElement(By.xpath("//div[@id='tlbContextMenu']//*[contains(text(),'" + selectValue + "')]"));
			return uIUltraWeb;
		}

		public WebElement getGridRowCheckBoxByIndex(WebElement uITable, int rowIndex) {
			List<WebElement> cellText = uITable.findElements(By.xpath(".//table/tbody/tr"));
			WebElement targetRow = cellText.get(rowIndex);
			WebElement targetCheckbox = targetRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(targetCheckbox);
			return targetCheckbox;
		}

		public void selectGridRowCheckBoxByIndex(WebElement uITable, int rowIndex) {

			WebElement cellText = uITable.findElement(By.xpath(".//table//tbody/tr[" + rowIndex + "]/td/img[1]"));
//  	WebElement targetRow = cellText.get(rowIndex);
			// WebElement targetCheckbox = targetRow.findElement(By.tagName("img"));
//  	manualIdentify.scrollIntoView(targetCheckbox);
			cellText.click();
		}

//we can use Column name if we know exact column name
		public String getGridCellInnerTextByText(WebElement uITable, String columnName, int rowIndex) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));

			int idxValue = 0;
			idxValue = getGridColumnIndexByText(uITable, columnName);

			List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
			WebElement element = tableCells.get(idxValue);
			manualIdentify.scrollIntoView(element);
			return element.getText();
		}

		public int getGridColumnIndexByText(WebElement uITable, String columnName) {
			WebElement uIColumnCell = getGridHeaderColumnCellByText(uITable, columnName);
			int idxValue = Integer.parseInt(uIColumnCell.getAttribute("idx"));
			return idxValue;
		}

		public WebElement getGridHeaderColumnCellByText(WebElement uITable, String columnName) {
			driver = Playback.driver;
			WebElement uIHeaderTableRow = uITable.findElement(
					By.xpath("//table/tbody/tr[contains(@class,'Header')]//th[text()='" + columnName + "']"));
			return uIHeaderTableRow;

		}

		public void selectRadControlDropDownValueSelectCalender(WebElement uIRadControlDropDownList, String listItem) {
			driver = Playback.driver;
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div/ul//li[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();

		}

		public void selectGridRowReportIconByCellInnerText(String cellInnerText) {

			WebElement targetCell = Playback.driver
					.findElement(By.xpath("//td//div//table//tbody//tr//td[contains(text(), '" + cellInnerText
							+ "')]/following-sibling::td//img[contains(@id,'IsReportsImg')]"));
			manualIdentify.scrollIntoView(targetCell);
			targetCell.click();

		}

		public void deleteGridRowByCellInnerTextExactRow(WebElement uITable, String cellInnerText) {

			WebElement targetCell = uITable.findElement(By.xpath(".//table/tbody//tr/td[contains(text(), '"
					+ cellInnerText + "')]/preceding-sibling::td[contains(@class,'Delete_Icon')]"));
			targetCell.click();
		}

		public void selectRadControlDropDownValueSelectWithoutLabel(WebElement uIRadControlDropDownList,
				String listItem) {
			driver = Playback.driver;
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div/ul//li[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();
			Playback.controlReadyThreadWait();

		}

		public void selectRadControlDropDownValue(WebElement uIRadControlDropDownList, String listItem) {
			driver = Playback.driver;
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			// List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().contains(listItem)) {
					box.click();
					break;
				}

			}
		}

		public void selectGridRowCheckBoxByIndexAttachmentTable(WebElement uITable, int rowIndex) {
			// tr[contains(@class,'grdrowalign')]//img
			List<WebElement> cellText = uITable
					.findElements(By.xpath(".//table/tbody/tr[contains(@class,'grdrowalign')]"));
			WebElement targetRow = cellText.get(rowIndex);
			WebElement targetCheckbox = targetRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(targetCheckbox);
			targetCheckbox.click();

		}

		public void selectGridRowByIndexAttachmentTable(WebElement uITable, int rowIndex) {
			// tr[contains(@class,'grdrowalign')]//img
			List<WebElement> cellText = uITable
					.findElements(By.xpath(".//table/tbody/tr[contains(@class,'grdrowalign')]"));
			WebElement targetRow = cellText.get(rowIndex);

			manualIdentify.scrollIntoView(targetRow);
			targetRow.click();

		}

		public void deleteGridRowByIndexAttachmentTab(WebElement uITable, int rowIndex) {
			// tr[contains(@class,'grdrowalign')]//img
			List<WebElement> cellText = uITable
					.findElements(By.xpath(".//table/tbody/tr[contains(@class,'grdrowalign')]"));
			WebElement targetRow = cellText.get(rowIndex);
			WebElement deleteIcon = targetRow.findElement(By.xpath(".//td[1]"));
			deleteIcon.click();
		}

		public void selectRadControlDropDownCheckAllSelect(WebElement uIRadControlDropDownList, String listItem) {
			driver = Playback.driver;
			WebElement checkbox_list = uIRadControlDropDownList
					.findElement(By.xpath("//div//label[contains(text(),'" + listItem + "')]"));
			Playback.threadWait(600);
			checkbox_list.click();

		}

		public List<WebElement> getRadControlDropDownValuesCalender(WebElement uIRadControlDropDownList) {
			driver = Playback.driver;
			List<WebElement> checkbox_list = uIRadControlDropDownList.findElements(By.xpath("//div/ul//li"));
			Playback.threadWait(600);
			return checkbox_list;
		}

		public void selectGridRowByCellInnerTextWithoutContains(WebElement uITable, String cellInnerText,
				int rowIndex) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			manualIdentify.scrollIntoView(tableRows.get(rowIndex));
			WebElement targetCell = tableRows.get(rowIndex)
					.findElement(By.xpath(".//table/tbody/tr/td[(text()= '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			targetCell.click();
		}

		public void deleteHGridRowByCellInnerTextArrestTable(String tableId, String cellInnerText) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			WebElement targetCell = uITable.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath("//td[contains(@class,'CSheaderX')]"));
			deleteIcon.click();
		}

		public void deleteHGridRowByCellInnerTextArrestTable(WebElement tableId, String cellInnerText) {
			driver = Playback.driver;

			WebElement targetCell = tableId.findElement(By.xpath(".//td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteIcon = targetRow.findElement(By.xpath("//td[contains(@class,'CSheaderX')]"));
			deleteIcon.click();
		}

		public void selectGridRowCheckBoxesByIndex(WebElement uITable, int rowIndex) {
			for (int i = 1; i <= rowIndex; i++) {
				WebElement cellText = uITable.findElement(By.xpath(".//table//tbody/tr[" + i + "]/td/img[1]"));
				cellText.click();
			}
		}

		public void selectGridRowCheckBoxByCellInnerTextUsingInputTag(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement targetCheckbox = targetRow.findElement(By.tagName("input"));
			manualIdentify.scrollIntoView(targetCheckbox);
			targetCheckbox.click();
		}

		public void selectGridRowByIndex(WebElement uITable, int rowIndex) {
			WebElement row = uITable.findElement(By.xpath(".//table//tbody/tr//tr//tr[@adr='" + rowIndex + "']"));
			row.click();
		}

		public void deleteGridRowByCellInnerTextByStyle(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath("//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			WebElement targetRow = targetCell.findElement(By.xpath(".."));
			WebElement deleteCell = targetRow.findElement(By.xpath("./td[@style='width:5%;']"));
			deleteCell.click();

		}

		public void selectGridRowByCellInnerTextWithoutContains(WebElement uITable, String cellInnerText) {
			WebElement targetCell = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[(text()= '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(targetCell);
			targetCell.click();
		}

		public void selectDropDownOptionAsdata(WebElement uIddList, String ddlOptionValue) {
			driver = Playback.driver;
			Select dropDown = new Select(uIddList);
			dropDown.selectByVisibleText(ddlOptionValue);

		}

		public void selectContextMenuItemInTheGridRow(WebElement uITable, String cellInnerText, String selectValue) {

			WebElement cellText = uITable
					.findElement(By.xpath(".//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')]"));
			manualIdentify.scrollIntoView(cellText);
			Actions action = new Actions(Playback.driver);
			action.contextClick(cellText).build().perform();
			WebElement uIUltraWeb = cellText
					.findElement(By.xpath("//div[contains(@id,'Menu')]//*[contains(text(),'" + selectValue + "')]"));
			uIUltraWeb.click();
		}

		public List<WebElement> getGridRowCheckBoxByIndexandColumnName(WebElement uITable) {

			driver = Playback.driver;
			List<WebElement> tableRows = uITable
					.findElements(By.xpath("//table//tbody[contains(@class,'Item')]//tr//td[17]"));

			// String indx = manualIdentify.getGridHeaderColumnCellForSpan(uITable,
			// columnName).getAttribute("idx");
			// System.out.println(indx);
			// int index = Integer.parseInt(indx);
			// List<WebElement> tableCells = tableRows.findElements(By.xpath("//td"));
			// WebElement element = tableCells.get(17);
			// manualIdentify.scrollIntoView(element);
			return tableRows;

		}

	}

	public class RandomIdentify {
		ManualIdentify manualIdentify = new ManualIdentify();

		public WebDriver driver;

		public RandomIdentify() {
			driver = Playback.driver;
		}

		public WebElement getRandomGridRowCheckbox(WebElement uITable) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			WebElement cellCheckBox = uIRandomRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(cellCheckBox);
			return cellCheckBox;
		}

		public void selectRandomGridRow() {
			driver = Playback.driver;
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			List<WebElement> tableRows = driver.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridRow(String tableId) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		/// <summary>
		/// This method which is used to select random Grid Row
		/// </summary>
		/// <param name="uITable"></param>
		public void selectRandomGridRow(WebElement uITable) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		/// <summary>
		/// This method used for right click the innertext value in grid
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="tableId"></param>
		/// <param name="RightclickcellInnerText"></param>
		public void selectContextMenuItemInTheGridRow(String selectValue) {

			driver = Playback.driver;
			List<WebElement> tableRows = driver.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement targetCell = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb = targetCell
					.findElement(By.xpath("//div[@id='ContextMenu']//*[contains(text(),'" + selectValue + "')]"));
			uIUltraWeb.click();

		}

		public void selectContextMenuItemInRepositoryGridRow(String selectValue) {

			driver = Playback.driver;
			List<WebElement> tableRows = driver.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement targetCell = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(targetCell);
			new Actions(driver).contextClick(targetCell).perform();
			WebElement uIUltraWeb = targetCell
					.findElement(By.xpath("//div[@id='tlbContextMenu']//*[contains(text(),'" + selectValue + "')]"));
			uIUltraWeb.click();

		}

		public void selectRandomGridCollapsedRow() {
			driver = Playback.driver;
			List<WebElement> tableRows = driver
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr[@type='row']"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridExpandedRow() {
			driver = Playback.driver;
			List<WebElement> tableRows = driver.findElements(
					By.xpath(".//table/tbody[contains(@class,'Item')]/tr[contains(@class,'gridrowblkclr')]"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridCollapsedRow(String tableId) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = uITable
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr[@type='row']"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridCollapsedRow(WebElement uITable) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr[@type='row']"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridRowCheckbox(String tableId) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			WebElement cellCheckBox = uIRandomRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(cellCheckBox);
			cellCheckBox.click();
		}

		public void selectRandomGridRowCheckbox(WebElement uITable) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			WebElement cellCheckBox = uIRandomRow.findElement(By.tagName("img"));
			manualIdentify.scrollIntoView(cellCheckBox);
			cellCheckBox.click();

		}

		public void selectRandomGridRowsCheckboxes(String tableId, int coun) {
			int result = 0;
			int inte = 0;

			driver = Playback.driver;
			WebElement streetTable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = streetTable
					.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr"));

			for (int i = 0; i < coun; i++) {

				inte = Randomized.getRandomNumber(tableRows.size());

				WebElement uIRandomRow = tableRows.get(inte);
				result = inte;
				uIRandomRow.findElement(By.xpath("//td/img")).click();
			}

		}

		public void selectRandomGridRowsCheckboxes(WebElement uItable, int noOfItemsToSelect) {

			List<WebElement> tableRows = uItable.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr"));

			for (int i = 0; i < noOfItemsToSelect; i++) {
				WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
				uIRandomRow.findElement(By.xpath("//td/img")).click();
			}
		}

		public void selectRandomGridRowsCheckboxes(String tableId) {

			driver = Playback.driver;
			WebElement streetTable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = streetTable
					.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr"));

			int itemsSelectCount = Randomized.getRandomNumber(tableRows.size());
			for (int i = 0; i < itemsSelectCount; i++) {
				WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
				uIRandomRow.findElement(By.xpath("//td/img")).click();
			}

		}

		public void selectRandomGridRowsCheckboxes(WebElement uItable) {

			List<WebElement> tableRows = uItable.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr"));

			int itemsSelectCount = Randomized.getRandomNumber(tableRows.size());
			for (int i = 0; i < itemsSelectCount; i++) {
				WebElement uIRandomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
				uIRandomRow.findElement(By.xpath("//td/img")).click();
			}

		}

		public void selectRandomGridExpanRow(String tableId) {
			driver = Playback.driver;
			WebElement uITable = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = uITable
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr[@type='row']"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public void selectRandomGridExpandedRowEditImage(String tableId) {
			driver = Playback.driver;
			List<WebElement> tableRows = driver.findElements(By.xpath(
					".//table/tbody[contains(@class,'Item')]/tr[@class='CssClrBlackactive']/td[@class='EditRule']"));
			// ReadOnlyCollection<IWebElement> tableRows =
			// driver.FindElements(By.XPath(".//table/tbody[contains(@class,'Item')]//td[contains(@class,'EditRule')]"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();
		}

		public void selectRandomGridExpanRow(WebElement uITable) {
			driver = Playback.driver;
			List<WebElement> tableRows = uITable
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr[@type='row']"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			randomRow.click();

		}

		public WebElement getRandomGirdRow(String tableId) {
			WebElement table = driver.findElement(By.xpath("//div[@id='" + tableId + "']"));
			List<WebElement> tableRows = table.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			return randomRow;
		}

		/// <summary>
		/// This method which is used to get the random Grid table row IWebElement
		/// </summary>
		/// <param name="tableId"></param>
		/// <returns>IWebElement Table row</returns>
		public WebElement getRandomGridRow(WebElement uITable) {
			List<WebElement> tableRows = uITable.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			manualIdentify.scrollIntoView(randomRow);
			return randomRow;

		}

		/// <summary>
		/// /// <summary>
		/// This method which is used to select random DropDown option Value
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIRadControlDropDownID"></param>
		/// <param name="noOfItemsToSelect"></param>
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="ddlID"></param>
		public void selectDropDownOption(String ddlID) {
			driver = Playback.driver;
			WebElement uIddList = driver.findElement(By.id(ddlID));

			Select dropDown = new Select(uIddList);
			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				int ddlLength = dropDown.getOptions().size();
				int randomIndex = Randomized.getRandomDropDownValue(ddlLength);
				dropDown.selectByIndex(randomIndex);
			}

		}

		/// <summary>
		/// This method which is used to select the random drop down option value
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIddList"></param>
		public void selectDropDownOption(WebElement uIddList) {
			Select dropDown = new Select(uIddList);
			if (dropDown.getFirstSelectedOption().isEnabled() == true) {
				int ddlLength = dropDown.getOptions().size();
				int randomIndex = Randomized.getRandomDropDownValue(ddlLength);
				dropDown.selectByIndex(randomIndex);
			}

		}

		public void selectRadControlDropDownValueSelect(String uIRadControlDropDownID) {
			driver = Playback.driver;
			WebElement uIRadControlDropDownList = driver.findElement(By.id(uIRadControlDropDownID));
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					count = count + 1;
				}
			}
			int getrandom_number = Randomized.getRandomNumber(count);

			checkbox_list.get(getrandom_number).click();
			Playback.controlReadyThreadWait();

		}

		/// <summary>
		/// This method which is used to select the random Rad control Dropdown option
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIddList"></param>
		public void selectRadControlDropDownValueSelect(WebElement uIddList) {
			Playback.implictwait();
			List<WebElement> checkbox_list = uIddList.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			// List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (!box.getText().isEmpty()) {
					count = count + 1;
				}
			}

			int getrandom_number = Randomized.getRandomNumber(count);

			checkbox_list.get(getrandom_number).click();
			Playback.controlReadyThreadWait();

		}

		public void selectRadControlDropDownCheckBoxes(String uIRadControlDropDownID) {
			driver = Playback.driver;
			WebElement uIRadControlDropDownList = driver.findElement(By.id(uIRadControlDropDownID));
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					count = count++;
				}
			}

			int getrandom_number = Randomized.getRandomNumber(count);

			while (true) {
				int get_number = Randomized.getRandomNumber(getrandom_number);

				if (get_numbers_check.contains(get_number)) {
					get_numbers_check.add(get_number);
				}

				if (get_numbers_check.size() == getrandom_number) {
					break;
				}
			}

			for (int number : get_numbers_check) {
				checkbox_list.get(number).click();
				Playback.controlReadyThreadWait();
			}

		}

		/// <summary>
		/// This method which is used to select random Rad Control DropDown Checkboxez
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIRadControlDropDownList"></param>
		public void selectRadControlDropDownCheckBoxes(WebElement uIRadControlDropDownList) {

			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					count = count + 1;
				}
			}
			int getrandom_number = Randomized.getRandomNumber(count);

			while (true) {
				int get_number = Randomized.getRandomNumber(getrandom_number);

				if (get_numbers_check.contains(get_number)) {
					get_numbers_check.add(get_number);
				}

				if (get_numbers_check.size() == getrandom_number) {
					break;
				}
			}

			for (int number : get_numbers_check) {
				checkbox_list.get(number).click();
				Playback.controlReadyThreadWait();
			}

		}

		public void selectRadControlDropDownCheckBoxes(String uIRadControlDropDownID, int noOfItemsToSelect) {
			driver = Playback.driver;
			WebElement uIRadControlDropDownList = driver.findElement(By.id(uIRadControlDropDownID));
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			List<Integer> get_numbers_check = new ArrayList<Integer>();

			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					count = count + 1;
				}
			}
			int getrandom_number = Randomized.getRandomNumber(count);

			while (true) {
				int get_number = Randomized.getRandomNumber(getrandom_number);

				if (get_numbers_check.contains(get_number)) {
					get_numbers_check.add(get_number);
				}

				if (get_numbers_check.size() == getrandom_number) {
					break;
				}
			}

			for (int number : get_numbers_check) {
				checkbox_list.get(number).click();
				Playback.controlReadyThreadWait();
			}

		}

		/// <summary>
		/// This method which is used to select random Rad Control DropDown Checkboxes
		/// </summary>
		/// <param name="driver"></param>
		/// <param name="uIRadControlDropDownID"></param>
		/// <param name="noOfItemsToSelect"></param>
		public void selectRadControlDropDownCheckBoxes(WebElement uIRadControlDropDownList, int noOfItemsToSelect) {
			List<WebElement> checkbox_list = uIRadControlDropDownList
					.findElements(By.xpath("//div/ul[@class='rcbList']/li"));
			int count = 0;
			List<Integer> get_numbers_check = new ArrayList<Integer>();
			for (WebElement box : checkbox_list) {
				if (box.getText().isEmpty()) {
					count = count + 1;
				}
			}
			int getrandom_number = Randomized.getRandomNumber(count);

			while (true) {
				int get_number = Randomized.getRandomNumber(getrandom_number);

				if (get_numbers_check.contains(get_number)) {
					get_numbers_check.add(get_number);
				}

				if (get_numbers_check.size() == getrandom_number) {
					break;
				}
			}

			for (int number : get_numbers_check) {
				checkbox_list.get(number).click();
				Playback.controlReadyThreadWait();
			}

		}

	}

	public class ActionBuilder {

		public Actions action;
		// WebDriver driver = Playback.driver;

		public ActionBuilder() {
			action = new Actions(Playback.driver);
		}

		public void ContextClick(WebElement uIElement) {
			action.contextClick(uIElement).perform();
		}

		public void DoubleClick(WebElement uIElement) {
			action.doubleClick(uIElement).perform();
		}

		public void MoveToElement(WebElement uIElement) {
			action.moveToElement(uIElement).build().perform();

		}

		public void Click(WebElement uIElement) {

			action.click(uIElement).build().perform();
			action = null;

		}

		public void SendKeys(String strValue) {
			Actions action = new Actions(Playback.driver);
			action.sendKeys(strValue).perform();
			action = null;

		}

		public void SendKeys(WebElement element, String strValue) {
			Actions action = new Actions(Playback.driver);
			action.sendKeys(strValue).perform();
			action = null;

		}

		public void DragAndDropBy(WebElement element, int Xaxis, int Yaxis) {
			Actions action = new Actions(Playback.driver);
			action.dragAndDropBy(element, Xaxis, Yaxis);
			action = null;

		}

	}

	public class FilesHandle {
		public String testResourceFolderPath = PropertiesFile.readPropertiesFile("TestResourceFolderPath");
		public FileAttach fileAttach;

		public FilesHandle() {
			if (fileAttach == null)
				fileAttach = new FileAttach();

		}

		public class FileAttach {
			public String testResourceFolderPath = PropertiesFile.readPropertiesFile("TestResourceFolderPath");
			Robot robot = null;

			public void fileUpload(String fileName) {
				Playback.controlReadyThreadWait();

				File file = new File("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\");
				File[] files = file.listFiles();
				for (File getfile : files) {
					String filePath = getfile.getPath();

					if (filePath.contains(fileName)) {
						StringSelection stringSelection = new StringSelection(filePath);
						Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
						clipboard.setContents(stringSelection, null);

						try {
							robot = new Robot();
						} catch (AWTException e) {
							e.printStackTrace();
						}

						robot.delay(250);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.delay(150);
						robot.keyRelease(KeyEvent.VK_ENTER);

					}

				}

			}

			public void folderUpload(String folderName) {
				Playback.controlReadyThreadWait();

				File file = new File("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\");
				File[] files = file.listFiles();
				for (File getfile : files) {
					String filePath = getfile.getPath();

					if (filePath.contains(folderName)) {
						StringSelection stringSelection = new StringSelection(filePath);
						Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
						clipboard.setContents(stringSelection, null);

						try {
							robot = new Robot();
						} catch (AWTException e) {
							e.printStackTrace();
						}

						robot.delay(250);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.delay(300);
						robot.keyPress(KeyEvent.VK_TAB);
						robot.keyRelease(KeyEvent.VK_TAB);
						robot.delay(150);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						robot.delay(150);
						Playback.controlReadyThreadWait();
						Playback.controlReadyThreadWait();
						robot.keyPress(KeyEvent.VK_TAB);
						robot.keyRelease(KeyEvent.VK_TAB);
						robot.delay(150);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						robot.delay(300);
						// Playback.driver.switchTo().alert().accept();

					}

				}

			}

			public void BulkFileAttachment(String fileNames)

			{

				System.out.println(testResourceFolderPath);
				StringSelection stringSelection = new StringSelection(testResourceFolderPath + fileNames);
				// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
				// null);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);

				try {
					robot = new Robot();
				} catch (AWTException e) {
					e.printStackTrace();
				}

				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(150);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.delay(150);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.delay(300);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				Playback.popupThreadWait();
				Playback.popupThreadWait();

				Playback.controlReadyThreadWait();

			}

			public void fileUploadAutoIt(String file) {
				String fileName;
				String autoITExecutable;
				if (Playback.browserType.contains("Chrome")) {
					fileName = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\" + file; // passed as a command
																									// line Passed
																									// Filename will
																									// attach need to
																									// pass file name
																									// with Extention
					autoITExecutable = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\AutoItFiles\\FileUpload.exe "
							+ fileName;
				} else {
					fileName = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\" + file;
					autoITExecutable = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\AutoItFiles\\FileUploadIE.exe "
							+ fileName;
				}
				Playback.threadWait(3000);
				try {
					Runtime.getRuntime().exec(autoITExecutable);
				} catch (IOException e) {

					e.printStackTrace();
				}
				Playback.threadWait(5000);
			}

		}

		public void handleWindowsPopupClickOk() {
			Playback.threadWait(2000);
			try {
				Runtime.getRuntime()
						.exec("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\AutoItFiles\\ClickOkWindowPopup.exe ");
			} catch (IOException e) {

				e.printStackTrace();
			}
			Playback.threadWait(3000);

		}

	}

	public class ReadPDF {

		WebDriver driver = Playback.driver;

		Robot robot = null;

		public void ReadFile() throws IOException {
			windowHandle.switchToWindowUsingURL("Police/KPITemp");
			String Currenturl = driver.getCurrentUrl();
			driver.get(Currenturl);
			URL url = new URL(Currenturl);
			BufferedInputStream bis = new BufferedInputStream(url.openStream());
			PDDocument doc = PDDocument.load(bis);
			String text = new PDFTextStripper().getText(doc);
			System.out.println(text);

		}

		public String ReadPDF(String reportName) {
			String pageContent = null;
			try {
				// Create PdfReader instance.
				PdfReader pdfReader = new PdfReader(
						"\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\" + reportName + ".pdf");

				// Get the number of pages in pdf.
				int pages = pdfReader.getNumberOfPages();

				// Iterate the pdf through pages.
				for (int i = 1; i <= pages; i++) { // Extract thepage content using PdfTextExtractor.
					pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);

					// Print the page content on console.
					System.out.println("Content on Page " + i + ": " + pageContent);
				}

				// Close the
				pdfReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("***********************************************");

			return pageContent;
		}

		public void savePDFfileFromUnTitleDocumentWindow() {

			// Playback.driver.findElement(By.xpath("//cr-button[contains(text(),'Save')]")).click();
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();

			}
			Playback.threadWait();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Playback.threadWait();

		}

		public void SaveAsPDFfileToLocation(String reportName) {

			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();

			}
			Playback.threadWait();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			Playback.threadWait();

			StringSelection stringSelection = new StringSelection(
					"\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\" + reportName + ".pdf");
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

			Playback.threadWait();
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Playback.threadWait();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(500);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}

		public void DownloadReports() {
			Robot robot = null;
			Playback.threadWait();
			if (Playback.browserType.contains("Chrome")) {
				if (Playback.driver.switchTo().window(Playback.driver.getWindowHandle()).getTitle()
						.contains("Report Status")) {
					Playback.threadWait();
					// incase Using PDF extention
					// windowHandle.switchToFrame(Playback.driver.findElement(By.id("frmRptWrt")));
					// Playback.driver.findElement(By.id("download")).click();
					Playback.actionDriver
							.moveToElement(Playback.driver.findElement(By.id("frmIncidentRpt_Id")), 100, 100).build()
							.perform();
					Playback.controlReadyThreadWait();
					Playback.actionDriver.contextClick().build().perform();

					try {
						robot = new Robot();
					} catch (AWTException e) {
						e.printStackTrace();
					}
					robot.delay(2000);
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					Playback.threadWait();
				} else {
					try {
						robot = new Robot();
					} catch (AWTException e) {
						e.printStackTrace();
					}
					robot.delay(2000);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_S);
				}

			} else {
				Playback.threadWait(2000);
				try {
					Runtime.getRuntime()
							.exec("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\AutoItFiles\\IEOpenSavePopup.exe ");
				} catch (IOException e) {

					e.printStackTrace();
				}
				Playback.threadWait(3000);
			}

		}

		public void SendLocalDownloadedFileToServerPath(String reportName) {

			Playback.threadWait();
			Playback.threadWait();
			File uploadDirectory = new File("C:\\Users\\Mahesha\\Downloads\\");
			File[] downloadedFiles = uploadDirectory.listFiles();
			File lastModifiedFile = downloadedFiles[0];
			for (int i = 1; i < downloadedFiles.length; i++) {
				if (lastModifiedFile.lastModified() < downloadedFiles[i].lastModified()) {
					lastModifiedFile = downloadedFiles[i];

				}
			}
			Path src = Paths.get(lastModifiedFile.getPath());
			Path dest = Paths.get("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\Attachments\\" + reportName + ".pdf");
			try {
				Files.copy(src.toFile(), dest.toFile());
			} catch (IOException e) {
				e.printStackTrace();
			}

			Playback.threadWait();

		}

		public boolean isFileDownloaded(String downloadPath, String fileName) {
			boolean flag = false;
			File dir = new File(downloadPath);
			File[] dir_contents = dir.listFiles();
			for (int i = 0; i < dir_contents.length; i++) {
				if (dir_contents[i].getName().equals(fileName))
					return flag = true;
			}
			return flag;
		}

		public void verifyDownloadedFileWithExtensionExists(String serverPath, String fileName) {
			Assert.assertTrue(isFileDownloaded(serverPath, fileName), "Failed to download Expected document");
		}

		public void verifyContentInsidePDF(String serverPath, String fileName) {
			System.out.println(serverPath);
			Assert.assertTrue(serverPath.contains(fileName));
		}

		public void pressEnter() {
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();

			}
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000);
		}

	}

	public class AttachmentsTab {
		public AttachmentsCategoryPopup attachmentsCategoryPopup = null;
		public MultiFilesAttachments multiFilesAttachments = null;

		public AttachmentsTab() {
			if ((this.attachmentsCategoryPopup == null)) {
				this.attachmentsCategoryPopup = new AttachmentsCategoryPopup();

				if (this.multiFilesAttachments == null) {
					this.multiFilesAttachments = new MultiFilesAttachments();
				}
			}
		}

		public void switchToMultiFilesAttachment() {
			windowHandle.switchToWindowUsingFormName("frmMultiFilesAttach");
		}

		public void clickAddFiles() {
			uIMapHome.attachmentsTab.uIAddFilesButton.click();
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
		}

		public void deleteAttachmentFileInGrid() {
			int rowIndexBeforeDelete = manualIdentify
					.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable);
			WebElement uIDelCell = manualIdentify.getGridCell(uIMapHome.attachmentsTab.uIAttachmentsTable,
					rowIndexBeforeDelete - 1, 0);
			uIDelCell.click();
		}

		public void verifyAttachmentCannotBeDeletedAcknowledgeMessage() {
			popup.switchToAcknowledge();
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

			if (Playback.browserType.equals("Chrome")) {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1206) This attachment cannot be deleted from this screen"));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1206) This attachment cannot be deleted from this screen"));
				popup.acknowledge.ok();
			}
		}

		public void verifyAttachmentCannotBeUpdatedAcknowledgeMessage() {
			popup.switchToAcknowledge();
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

			if (Playback.browserType.equals("Chrome")) {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1206) This attachment cannot be updated from this screen"));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(1206) This attachment cannot be updated from this screen"));
				popup.acknowledge.ok();
			}
		}

		public void verifyAccessdeniedAcknowledgemessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(39) Access denied for Screen ID 2475");
		}

		public void VerifyAtFileName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Link"), manualIdentify
					.getGridCell(uIMapHome.attachmentsTab.uIAttachmentsTable, BaseData.getNamesModuleValue("Link"))
					.getText());
		}

		public void VerifyAtFileName1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Link1"), manualIdentify
					.getGridCell(uIMapHome.attachmentsTab.uIAttachmentsTable, BaseData.getNamesModuleValue("Link1"))
					.getText());
		}

		public void VerifyAddedAttachementInTheFolderGrid(int rowCount) {
			verify.ExpectedIntergerValueIsNotEqualToActual(rowCount,
					manualIdentify.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsFolderTable));
		}

		public void verifyDoYouToDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");

		}

		public void verifyDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(4) Do you want to delete?");

		}

		public void deleteAttachmentFileInGridByIndex(int rowIndex) {
			manualIdentify.deleteGridRowByIndexAttachmentTab(uIMapHome.attachmentsTab.uIAttachmentsFolderTable,
					rowIndex);

		}

		public void clickRefresh() {
			uIMapHome.attachmentsTab.uIRefreshButton.click();
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
		}

		public void verifyAddedAttachementExistInTheGrid() {

			verify.ExpectedIntergerValueIsNotEqualToActual(0,
					manualIdentify.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable));
		}

		public void selectAttachmentCheckBoxByIndex(int rowIndex) {
			Playback.controlReadyThreadWait();
			manualIdentify.selectGridRowCheckBoxByIndexAttachmentTable(
					uIMapHome.attachmentsTab.uIAttachmentsFolderTable, rowIndex);
			Playback.controlReadyThreadWait();
		}

		public void ClickDownloadSelectedFilesButton() {
			Actions action = new Actions(Playback.driver);
			action.click(uIMapHome.attachmentsTab.uIDownloadSelectedFilesButton).build().perform();
		}

		public void verifyDownloadSelectedFilesButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.attachmentsTab.uIDownloadSelectedFilesButton.isEnabled());
		}

		public void deleteLastRowAndVerifyRowIsRemoved() {
			int rowIndexBeforeDelete = manualIdentify
					.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable);
			WebElement uIDelCell = manualIdentify.getGridCell(uIMapHome.attachmentsTab.uIAttachmentsTable,
					rowIndexBeforeDelete - 1, 0);
			uIDelCell.click();
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			int rowIndexAfterDelete = manualIdentify.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable);
			verify.ExpectedValueIsTrue(rowIndexBeforeDelete > rowIndexAfterDelete,
					"Row count not reduced, Please check the record is deleted or not");
		}

		public void clickALCIcon() {
			uIMapHome.attachmentsTab.uIKPIALCPermisstionButton.click();
		}

		public void SelectRowCheckboxUsingFileName() {

			manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapHome.attachmentsTab.uIAttachmentsTable,
					BaseData.getNamesModuleValue("FileName"));

		}

		public void clickAtFileNameInGrid(int slno) {
			if (slno == 0)
				manualIdentify.selectGridRowByCellInnerText(uIMapHome.attachmentsTab.uIAttachmentsTable,
						BaseData.getHomeModuleValue("FileName"));

			else
				manualIdentify.selectGridRowByCellInnerText(uIMapHome.attachmentsTab.uIAttachmentsTable,
						BaseData.getHomeModuleValue("FileName" + slno + ""));
		}

		public void verifyAddFilesButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.attachmentsTab.uIAddFilesButton.isEnabled());

		}

		public void verifyAddFilesButtonDisabled() {
			verify.ExpectedValueIsFalse(uIMapHome.attachmentsTab.uIAddFilesButton.isEnabled());

		}

		public void ClickFolderRadioButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.attachmentsTab.uIFolderRadioButton.click();

		}

		public void clickCreateAsPDFButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.attachmentsTab.uICreateAsPDFButton.click();

		}

		public void verifyCreateAsPDFnotEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(uIMapHome.attachmentsTab.uICreateAsPDFButton.isEnabled());

		}

		public void clickAllAttachmentsCheckbox() {
			uIMapHome.attachmentsTab.uISelectAllCheckBox.click();

		}

		public void verifyCreateAsPDFEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapHome.attachmentsTab.uICreateAsPDFButton.isEnabled());
		}

		public void verifyParameter30BulkExtentionNotConfiguredAcknowledge() {

			popup.switchToAcknowledge();
			String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

			if (Playback.browserType.equals("Chrome")) {
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"(1180) Parameter 30 (Bulk File Extensions) is not configured. Contact your system administrator."));
				popup.acknowledge.ok();
			} else {
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"(1180) Parameter 30 (Bulk File Extensions) is not configured. Contact your system administrator."));
				popup.acknowledge.ok();
			}

		}

		public void selectFileByIndex(int rowIndex) {
			manualIdentify.selectGridRowByIndexAttachmentTable(uIMapHome.attachmentsTab.uIAttachmentsTable, rowIndex);

		}

		public void verifyAddedAttachementExistInTheGrid(int rowCount) {

			List<WebElement> checkboxes = Playback.driver.findElements(By.xpath(
					"//div[@id='ctrlUsrKPITxtAttachment_grdKPITxtAttach']//td[text()='Scan - Document']/..//img"));
			verify.ExpectedIntergerValueIsEqualToActual(checkboxes.size(), rowCount);

		}

		public void deleteAttachmentedFile() {
			int rowIndexBeforeDelete = manualIdentify
					.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable);
			WebElement uIDelCell = manualIdentify.getGridCell(uIMapHome.attachmentsTab.uIAttachmentsTable,
					rowIndexBeforeDelete - 1, 0);
			uIDelCell.click();
		}

		public void switchToPDFwindow() {
			windowHandle.switchToWindowUsingURL(".pdf");
			Playback.pageLoadThreadWait();

		}

		public void verifyTotalFilesAvailableInPDF() {
			Playback.threadWait();
			Playback.threadWait();
			// objectIdentification.windowHandle.switchToFrame(Playback.driver.findElement(By.id("frmRptWrt")));

			String Pages = Playback.driver.findElement(By.xpath("//div//input[@id='pageNumber']")).getAttribute("max");

			verify.ExpectedPropertyValueIsEqual(Pages, BaseData.getHomeModuleValue("FilesCount"));

		}

		public void selectAttachementFolderWiseCheckboxInTheGrid() {
			manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapHome.attachmentsTab.uIRecordsFolderTable,
					BaseData.getHomeModuleValue("PF"));
		}

		public void verifyAtFolderNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("FolderName"),
					manualIdentify.getGridRowByCellInnerText(uIMapHome.attachmentsTab.uIAttachmentsTable,
							BaseData.getHomeModuleValue("FolderName")).getText());
		}

		public void verifyFolderNameAsAutomationInGrid() {
			verify.ExpectedPropertyValueIsEqual("AUTOMATION", manualIdentify
					.getGridRowByCellInnerText(uIMapHome.attachmentsTab.uIAttachmentsTable, "AUTOMATION").getText());
		}

		public void verifyAddedAttachementNotExistInTheGrid() {
			int tableRowsCount = manualIdentify.getGridTableRowsCount(uIMapHome.attachmentsTab.uIAttachmentsTable);
			verify.ExpectedIntergerValueIsEqualToActual(0, tableRowsCount);

		}

		public class AttachmentsCategoryPopup {
			public void selectCategoryAsDocumentFile() {
				manualIdentify.selectDropDownOption(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox, "Document - File");
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox.sendKeys(Keys.TAB);
			}

			public void selectCategoryAsPhotoEvidence() {
				manualIdentify.selectDropDownOption(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox, "Photo - Evidence");
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox.sendKeys(Keys.TAB);
			}

			public void verifyAddSingleFileRadioButtonIsSelected() {
				verify.ExpectedValueIsTrue(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISingleFileRadioButton.isSelected());
			}

			public void verifyAddBulkFileRadioButtonIsSelected() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIBulkAttachmentRadioButton.click();
			}

			public void selectPDFFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				filesHandle.fileAttach.fileUpload("Crash.pdf");
				Playback.pageLoadThreadWait();
			}

			public void selectAtFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				filesHandle.fileAttach.fileUpload(BaseData.getHomeModuleValue("FileName"));
				Playback.pageLoadThreadWait();
			}

			public void clickAdd() {
				Playback.threadWait(5000);
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIAddButton.click();
				Playback.threadWait(5000);
			}

			public void clickShowInCallDetailsCheckBox() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIShowInCallDetailsCheckBox.click();
			}

			public void verifyShowInCallDetailsCheckBoxIsNotSelected() {
				verify.ExpectedValueIsTrue(!uIMapHome.attachment.uIShowInCallDetailsCheckBox.isSelected());
			}

			public void enterFolderNameAsAuto() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderNameEdit.sendKeys("Auto");
			}

			public void enterFolderNameAsAUTO() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderNameEdit.sendKeys("AUTO");
			}

			public void enterFolderNameAsAutomation() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderNameEdit.clear();
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderNameEdit.sendKeys("Automation");
			}

			public void enterRemarks() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIRemarksEdit.sendKeys(Randomized.randomString(20));
			}

			public void EnterAtFolderName() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderNameEdit
						.sendKeys(BaseData.getHomeModuleValue("FolderName"));
			}

			public void selectImageFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				filesHandle.fileAttach.fileUpload("img2.png");
				Playback.pageLoadThreadWait();
			}

			public void selectTextFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				filesHandle.fileAttach.fileUpload("TextDoc1.txt");
				Playback.pageLoadThreadWait();
			}

			public void clickFolderRadioButton() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderRadioButton.click();
				Playback.controlReadyThreadWait();
			}

			public void ClickSingleFileRadioButton() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISingleFileRadioButton.click();
				Playback.controlReadyThreadWait();
			}

			public void clickBulkAttachmentRadioButton() {

				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIBulkAttachmentRadioButton.click();

			}

			public void EnterAtLink1() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinkEdit.clear();
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinkEdit
						.sendKeys(BaseData.getNamesModuleValue("Link1"));
			}

			public void EnterAtLink() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinkEdit.clear();
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinkEdit
						.sendKeys(BaseData.getNamesModuleValue("Link"));
			}

			public void ClickUpdate() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIAddButton.click();
				Playback.threadWait(5000);
			}

			public void verifyCategoryAsMandatory() {
				String red = "rgba(153, 0, 0, 1)";
				verify.ExpectedPropertyValueIsEqual(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategorylbl.getCssValue("color"), red);
			}

			public void verifyLinkEnabledAsMandatory() {
				String red = "rgba(153, 0, 0, 1)";
				verify.ExpectedValueIsTrue(uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinklbl.isDisplayed());
				verify.ExpectedPropertyValueIsEqual(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinklbl.getCssValue("color"), red);
			}

			public void verify1204UnableToLocateNetworkPathAcknowledge() {
				popup.switchToAcknowledge();
				String msg = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(msg
						.contains("1204 - Unable to access network path. Please verify system parameters 29 and 39."));
				popup.acknowledge.ok();
			}

			public void ClickLinkRadioButton() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uILinkRadioButton.click();
				Playback.controlReadyThreadWait();
			}

			public void clickCancel() {

				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICancelButton.click();

			}

			public void selectAtCategory() {
				manualIdentify.selectDropDownOption(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox,
						BaseData.getHomeModuleValue("Category"));
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox.sendKeys(Keys.TAB);
			}

			public void selectCategory() {
				randomIdentify
						.selectDropDownOption(uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox);
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox.sendKeys(Keys.TAB);
			}

			public void selectFolder() {
				filesHandle.fileAttach.folderUpload("folderAttachment");
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
			}

			public void selectFolderCategory() {
				randomIdentify.selectDropDownOption(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderCategoryCombobox);
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderCategoryCombobox.sendKeys(Keys.TAB);
			}

			public void clickFolderAddButton() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uIFolderAddButton.click();
				Playback.controlReadyThreadWait();
				Playback.pageLoadThreadWait();
				Playback.pageLoadThreadWait();
				Playback.pageLoadThreadWait();
				Playback.controlReadyThreadWait();
			}

			public void verifyFileExceedAcknolwdgeMessage() {
				popup.acknowledge.okWithExpectedMessage(
						"(1170) File exceeds the maximum allowed size. Contact your system administrator.");

			}

			public void selectArrestDocketPDFFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
				// + "TextDoc1");
				// WindowsControl.FileBrowserWindow.clickOpen();
				filesHandle.fileAttach.fileUpload("Arrest Entry - 2610.pdf");
			}

			public void selectTrafficsummonPDFFile() {
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uISelectButton.click();
				Playback.pageLoadThreadWait();
				// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
				// + "TextDoc1");
				// WindowsControl.FileBrowserWindow.clickOpen();
				filesHandle.fileAttach.fileUpload("Trafficsummon.pdf");
			}

			public void selectCategoryAsScanDocument() {
				manualIdentify.selectDropDownOption(
						uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox, "Scan - Document");
				uIMapHome.attachmentsTab.attachmentsCategoryPopup.uICategoryComboBox.sendKeys(Keys.TAB);
			}

			public void selectAtFileUsingAutoIT() {
				// TODO Auto-generated method stub

			}

		}

		public class MultiFilesAttachments {

			public void clickBrowseButton() {
				uIMapHome.multiFilesAttachments.uIBrowseButton.click();
				Playback.controlReadyThreadWait();

			}

			public void clickUploadButton() {
				uIMapHome.multiFilesAttachments.uIUploadButton.click();
				Playback.controlReadyThreadWait();
				Playback.pageLoadThreadWait();
				Playback.pageLoadThreadWait();
			}

			public void clickCloseButton() {
				uIMapHome.multiFilesAttachments.uICloseButton.click();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();

			}

			public void selectBulkAttachment() {
				Playback.controlReadyThreadWait();
				// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
				// + "IncidentRpt.pdf");
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				// WindowsControl.FileBrowserWindow.ClickOpen();
				filesHandle.fileAttach.BulkFileAttachment(
						"\\\"TextDoc1\" \"2400\" \"frmPnxSQLRpt\" \"img1\" \"Signature\" \"TestData\"");
			}

			public void verifyAtCloseCurrentPagePopup() {
				Playback.controlReadyThreadWait();
				if (Playback.browserType.contains("Chrome")) {
					popup.confirm.verifyContainsMessageInPopup("you sure, you want to Close the Page?");
					popup.confirm.yesWithExpectedMessage("Press OK to continue, or Cancel to stay on the current page");
				} else {
					Playback.controlReadyThreadWait();
					Playback.gridLoadThreadWait();
					filesHandle.handleWindowsPopupClickOk();
				}

			}

			public void verifyUnableToAccessNetworkPathMessage() {
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				String msg = uIMapHome.multiFilesAttachments.uIUnableLocateMsg.getText();
				verify.ExpectedPropertyValueIsEqual(
						"Unable to access network path. Please verify system parameters 29 and 39.", msg);
			}
		}

		public void verifyRowCountIsZero() {
			List<WebElement> checkboxes = Playback.driver.findElements(By.xpath(
					"//div[@id='ctrlUsrKPITxtAttachment_grdKPITxtAttach']//td[text()='Scan - Document']/..//img"));
			verify.ExpectedIntergerValueIsEqualToActual(checkboxes.size(), 0);
		}

	}

	public class SmokeTest {

		public WebDriver driver;

		public void selectRandomGridRow() {
			driver = Playback.driver;
			Playback.pageLoadThreadWait();

			try {
				Playback.pageLoadThreadWait();
				List<WebElement> tablecells = driver
						.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr/td//td//td//td"));
				// wait.until(ExpectedConditions.visibilityOfAllElements(tablecells));
				List<WebElement> list = new ArrayList<WebElement>();

				for (WebElement ele : tablecells) {
					if (ele.isDisplayed()) {
						list.add(ele);
					}
				}

				WebElement randomCell = list.get(Randomized.getRandomBetweenTwoNum(list.size() / 4, list.size() / 2));
				manualIdentify.scrollIntoView(randomCell);
				randomCell.click();
				Playback.controlReadyThreadWait();
			} catch (Exception e) {
				Playback.pageLoadThreadWait();
				List<WebElement> tableRows = driver
						.findElements(By.xpath("//table/tbody[contains(@class,'Item')]//tr"));
				// wait.until(ExpectedConditions.visibilityOfAllElements(tableRows));
				List<WebElement> list = new ArrayList<WebElement>();
				for (WebElement ele : tableRows) {
					if (ele.isDisplayed()) {
						list.add(ele);
					}
				}
				WebElement randomRow = list.get(Randomized.getRandomNumber(list.size()));
				manualIdentify.scrollIntoView(randomRow);
				randomRow.click();
				Playback.controlReadyThreadWait();
			}

		}

		public void clickSearchButton() {
//          boolean res =manualIdentify.controlExist(Playback.driver.findElement(By.xpath("//*[@title='Search']")));
//      

			try {
				Playback.waitForSearch();

				Playback.driver.findElement(By.xpath("//*[text()='Search']")).click();
				// Playback.implictwait();
				// Playback.driver.findElement(By.xpath("//input[contains(@id,'Search')]")).click();
			} catch (Exception e) {
				e.printStackTrace();
				Playback.waitForSearch();
				try {
					Playback.driver.findElement(By.xpath("//*[contains(@id,'Search')]")).click();

				} catch (NoSuchElementException e1) {
					try {
						Playback.driver.findElement(By.xpath("//*[@title='Search']")).click();

					} catch (NoSuchElementException e2) {
						e2.printStackTrace();
					}

				}

			}

		}

		public void clickTheSearchButton() {
//          boolean res =manualIdentify.controlExist(Playback.driver.findElement(By.xpath("//*[@title='Search']")));
//      
			try {
				Playback.waitForSearch();

				Playback.driver.findElement(By.xpath("//*[text()='Search']")).click();
				// Playback.implictwait();
				// Playback.driver.findElement(By.xpath("//input[contains(@id,'Search')]")).click();
			} catch (Exception e) {
				e.printStackTrace();
				Playback.waitForSearch();
				try {		
					Playback.driver.findElement(By.xpath("//*[contains(@id,'cmdSearch')]")).click();
				} catch (NoSuchElementException e1) {
					try {
						Playback.driver.findElement(By.xpath("//*[@value='Search']")).click();

					} catch (NoSuchElementException|ElementNotInteractableException e2) {
						try {
							Playback.driver.findElement(By.xpath("//*[contains(@id,'Search')]")).click();
						} catch (NoSuchElementException e3) {
							e3.printStackTrace();
						}
						try {
							Playback.driver.findElement(By.xpath("//*[contains(@id,'btnSreach')]")).click();
						} catch (NoSuchElementException e4) {
							e4.printStackTrace();
						}
					}

				}

			}

		}

		public void saveAndCloseTheScreenWithConfirm(String name) throws Exception {

			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()) {
				try {
					Playback.driver.findElement(By.id("cmdSaveNClose")).click();
					popup.confirm.yes();
				} catch (NoSuchWindowException e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					windowHandle.switchToMainWindow();
				} catch (NoAlertPresentException e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					smokeTest.handlingAcknowledgeMessagesPopups(name);
					windowHandle.switchToWindow(name);
					Playback.driver.close();
				}

			} else {
				windowHandle.switchToWindow(name);
				Playback.driver.close();
			}
		}

		public void saveAndCloseTheScreenWithYesButton(String name) throws Exception {

			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()) {
				try {
					Playback.driver.findElement(By.id("cmdSaveNClose")).click();
					Playback.controlReadyThreadWait();
					Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					smokeTest.handlingAcknowledgeMessagesPopups(name);
					windowHandle.switchToMainWindow();
				}
			} else {
				windowHandle.switchToWindow(name);
				Playback.driver.close();
			}
		}

		public void saveAndCloseTheScreen(String name) throws Exception {

			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()
					&& manualIdentify.controlExist(Playback.driver.findElement(By.id("cmdSaveNClose")))) {
				try {

					Playback.driver.findElement(By.id("cmdSaveNClose")).click();
					Playback.controlReadyThreadWait();

				} catch (NoSuchElementException e1) {
					try {
						Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
					} catch (Exception e) {
						e.printStackTrace();
						ExtentReport.LogInfo(name);
						popup.acknowledge.okIfWindowExist();
						windowHandle.switchToMainWindow();
					}
				} catch (NoSuchWindowException e1) {
					e1.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				}

			} else {
				Playback.driver.close();
			}

		}

		public void saveAndCloseTheScreenGlobalEntrySmoke(String name) throws Exception {
			
			clickOnEntryScreensTabs(name);
			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()
					&& manualIdentify.controlExist(Playback.driver.findElement(By.id("cmdSaveNClose")))) {
				try {
					Playback.driver.findElement(By.id("cmdSaveNClose")).click();
					Playback.controlReadyThreadWait();
					// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
					try {
						if (windowHandle.alertsPresentConditions()) {
							popup.confirm.yes();
							// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
						} else if (manualIdentify.controlExist(
								Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")))) {
							Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
							// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
						}
					} catch (NoSuchWindowException e) {
						e.printStackTrace();
						// ExtentReport.LogInfo(name);
						// popup.acknowledge.okIfWindowExist();
						windowHandle.switchToMainWindow();
					}
				}
				catch (NoAlertPresentException e1) {
					if (manualIdentify
							.controlExist(Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]"))))
						Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
					windowHandle.switchToMainWindow();
				} catch (NoSuchElementException e1) {

					e1.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				} catch (NoSuchWindowException e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				}
			} else {
				Playback.driver.close();
				windowHandle.switchToMainWindow();
			}

		}
		public void saveAndCloseTheScreenGlobal(String name) throws Exception {

			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()
					&& manualIdentify.controlExist(Playback.driver.findElement(By.id("cmdSaveNClose")))) {
				try {
					Playback.driver.findElement(By.id("cmdSaveNClose")).click();
					Playback.controlReadyThreadWait();
					// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
					try {
						if (windowHandle.alertsPresentConditions()) {
							popup.confirm.yes();
							// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
						} else if (manualIdentify.controlExist(
								Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")))) {
							Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
							// smokeTest.handlingAcknowledgeMessagesPopupsGlobal(name);
						}
					} catch (NoSuchWindowException e) {
						e.printStackTrace();
						// ExtentReport.LogInfo(name);
						// popup.acknowledge.okIfWindowExist();
						windowHandle.switchToMainWindow();
					}
				} catch (NoAlertPresentException e1) {
					if (manualIdentify
							.controlExist(Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]"))))
						Playback.driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
					windowHandle.switchToMainWindow();
				} catch (NoSuchElementException e1) {

					e1.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				} catch (NoSuchWindowException e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					popup.acknowledge.okIfWindowExist();
					windowHandle.switchToMainWindow();
				}
			} else {
				Playback.driver.close();
				windowHandle.switchToMainWindow();
			}

		}

		public void checkAckExist() {
			Set<String> handles = Playback.driver.getWindowHandles();
			for (String hand : handles) {
				if (windowHandle.switchToWindow(hand).getTitle().contains("Acknowledge")) {
					popup.acknowledge.ok();
					windowHandle.switchToMainWindow();
					break;
				} else {
					windowHandle.switchToMainWindow();
				}
			}

		}

		public void handlingAcknowledgeMessagesPopups(String screenName) throws Exception {
			for (String window : Playback.driver.getWindowHandles()) {
				if (Playback.driver.switchTo().window(window).getTitle().contains("Acknowledge")) {
					Playback.driver.switchTo().window(window);

					if (uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("No Record")
							|| uIMapPopup.acknowledgeWindow.uILogo.getAttribute("src").contains("imgs/err_48_2.gif")
							|| uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("Enter")) {
						uIMapPopup.acknowledgeWindow.uIOkButton.click();
						windowHandle.switchToMainWindow();
					} else {
						ExtentReport.LogInfo("Error+" + screenName + "Error");
						uIMapPopup.acknowledgeWindow.uIOkButton.click();
						windowHandle.switchToMainWindow();
					}
				}

			}
		}

		public void handlingAcknowledgeMessagesPopupsGlobal(String screenName) throws Exception {
			for (String window : Playback.driver.getWindowHandles()) {
				if (Playback.driver.switchTo().window(window).getTitle().contains("Acknowledge")) {
					Playback.driver.switchTo().window(window);

					if (uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("Validation")
							|| uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("Failed")
							|| uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("error")
							|| uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("Invalid")
							|| uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("Error")) {
						ExtentReport.LogInfo("Error+" + screenName + "Error");
						uIMapPopup.acknowledgeWindow.uIOkButton.click();
						windowHandle.switchToMainWindow();
					} else {

						uIMapPopup.acknowledgeWindow.uIOkButton.click();
						windowHandle.switchToMainWindow();
					}
				} else {
					windowHandle.switchToMainWindow();
				}

			}
		}

		public void clickRefreshButton() {
			Playback.driver.findElement(By.id("cmdRefresh")).click();
		}

		public void selectRandomGridRowForFire() {
			driver = Playback.driver;
			Playback.controlReadyThreadWait();
			try {
				List<WebElement> tablecells = driver
						.findElements(By.xpath("//table/tbody[contains(@class,'Item')]/tr/td//td//td//td"));
				WebElement randomCell = tablecells
						.get(Randomized.getRandomBetweenTwoNum(tablecells.size() / 4, tablecells.size() / 2));
				manualIdentify.scrollIntoView(randomCell);
				randomCell.click();
				Playback.controlReadyThreadWait();
			} catch (Exception e) {
				List<WebElement> tableRows = driver
						.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
				WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
				manualIdentify.scrollIntoView(randomRow);
				randomRow.click();
				Playback.controlReadyThreadWait();
			}

		}
			public void saveTheScreenWithYesButton(String name) throws Exception {

			if (Playback.driver.findElement(By.id("cmdSaveNClose")).isEnabled()) {
				try {
					Playback.driver.findElement(By.id("cmdSave")).click();
					Playback.controlReadyThreadWait();
					popup.confirm.yes();
					Playback.controlReadyThreadWait();	
					
				} catch (Exception e) {
					e.printStackTrace();
					ExtentReport.LogInfo(name);
					smokeTest.handlingAcknowledgeMessagesPopups(name);
					windowHandle.switchToMainWindow();
				}
			}
			 else {
				windowHandle.switchToWindow(name);
				Playback.driver.close();
			}
		
	}

		public void clickOnEntryScreensTabs(String Name) {
			List<WebElement> tabs = Playback.driver
					.findElements(By.xpath("//span[contains(@class,'igtab_BlueThemeTHTab')]"));
			List<WebElement> tabsContent = Playback.driver
					.findElements(By.xpath("//div[contains(@class,'igtab_BlueThemeTHContent')]"));
			// for(WebElement tab : tabs)
			for (WebElement tab : tabs) {
				if (tab.isDisplayed()) {
					tab.click();
					Playback.controlReadyThreadWait();

					for(WebElement tabcnt :tabsContent)
					{
								if(tabcnt.getAttribute("style").contains("visibility: visible"))
								{
									String TabName;
									try {
									 TabName =	Playback.driver.findElement(By.xpath("//span[contains(@class,'igtab_BlueThemeTHText igtab_BlueThemeTHTextSel')]")).getText();
									System.out.println(TabName);
								}catch (NoSuchElementException e) {
									// TODO Auto-generated catch block
									TabName = Randomized.randomNameGenerate();
								}
									Playback.controlReadyThreadWait();
										try {
											Playback.takeScreenShotOnFailure(Name,TabName);
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								}
							
						}

					}

				}
			}

		}

}
