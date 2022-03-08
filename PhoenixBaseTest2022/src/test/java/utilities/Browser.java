package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import resources.PropertiesFile;

public class Browser {

	public static String url = PropertiesFile.readPropertiesFile("url");
	public static String Newurl = PropertiesFile.readPropertiesFile("Newurl");
	ObjectIdentification objectIdentification = new ObjectIdentification();
	ObjectIdentification.WindowHandle windowHandle = objectIdentification.new WindowHandle();

	public static void NavigateToLoginScreen() {
		// if (Playback.BrowserType.equals("Chrome"))

		Playback.driver.manage().window().maximize();
		Playback.driver.navigate().to(url);

	}

	public static void NavigateToLoginScreenSmoke() {
		// if (Playback.BrowserType.equals("Chrome"))

		Playback.driver.manage().window().maximize();
		Playback.driver.navigate().to(url);

	}

	public static void NavigateToUrl(String url) {
		// if (Playback.BrowserType.equals("Chrome"))

		Playback.driver.manage().window().maximize();
		Playback.implictwait();
		Playback.driver.get(url);

	}

	public static void navigateToNewTabAndEnterUrl() {
		Playback.threadWait(5000);
		Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		// To switch to the new tab
		ArrayList<String> tabs = new ArrayList<String>(Playback.driver.getWindowHandles());
		System.out.println(tabs.size());
		Playback.driver.switchTo().window(tabs.get(tabs.size() - 1));
		Playback.driver.get(Newurl);
		// To navigate to new link/URL in 2nd new tab

		// Playback.driver.get("WWW.google.com");
	}

	/// <summary>
	/// Swithch to Login screen using URL
	/// </summary>
	public void SwitchToLoginScreen(String windowURL) {
		windowHandle.switchToWindowUsingURL(windowURL);
	}

	/// <summary>
	/// This method is used to kill the webdriver process in the test script cleenup
	/// method if webdriver process exist after the test completed
	/// </summary>
	/*
	 * public static void KillIWebDriverProcess() {
	 * Playback.ControlReadyThreadWait();
	 * 
	 * Process[] chromeDriverProcesses = Process.GetProcessesByName("chromedriver");
	 * Process[] geckoDriverProcesses = Process.GetProcessesByName("geckodriver");
	 * Process[] IEDriverServerProcesses =
	 * Process.GetProcessesByName("IEDriverServer");
	 * 
	 * //Closing all IEDriverServerProcess from TaskBar, if any left during Test run
	 * foreach (var IEDriverServerProcess in IEDriverServerProcesses) {
	 * IEDriverServerProcess.Kill(); }
	 * 
	 * //Closing all geckoDriverProcess from TaskBar, if any left during Test run
	 * foreach (var geckoDriverProcess in geckoDriverProcesses) {
	 * geckoDriverProcess.Kill(); }
	 * 
	 * //Closing all chromeDriverProcesses from TaskBar, if any left during Test run
	 * foreach (var chromeDriverProcess in chromeDriverProcesses) {
	 * chromeDriverProcess.Kill(); }
	 * 
	 * }
	 */
	public static void NavigateToLoginScreenForFire() {
		Playback.driver.manage().window().maximize();
		Playback.driver.navigate().to(url);
	}

}
