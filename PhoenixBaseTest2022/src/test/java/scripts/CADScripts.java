package scripts;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.CAD;
import application.Loader;
import application.Login;
import application.Popup;
import application.Settings;
import utilities.Browser;
import utilities.Playback;

public class CADScripts {

	public Login login;
	public Loader loader;
	public Popup popup;
	public CAD cad;
	public Settings settings;
	
	@BeforeMethod
	public void BeforeTestMethod( ITestContext testContext) 
	{
		testContext.setAttribute("moduleName", "Names");		
		Playback.testContext=testContext;

		Playback.start();
			
		login=new Login();
		loader=new Loader();
		cad = new CAD();
				settings = new Settings();
	}

	@Test //Automated by Stalin
	public void ToVerifyInCommandCodes(ITestContext testContext) {

		testContext.setAttribute("testID", "257060");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CAD");
		loader.navigateToScreen("CC Search");
		cad.switchToCCSearchScreenTab();
		cad.ccSearch.clickSysCCRadioButton();
		cad.ccSearch.enterAtSystemCommand();
		cad.ccSearch.clickSearch();
		cad.ccSearch.verifyAtSystemCommandCodeInGrid();
		cad.ccSearch.clickAtSystemCommandCodeInGrid();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.deleteAtCCInGridWithConfirmMsg();
		settings.switchToSharedCodes();
		settings.sharedCodes.saveScreen();
		settings.sharedCodes.verifyNoRecordFoundAckwMsg();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtUserCommandCode();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.enterAtDispOrder();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();

	}
		
	@AfterMethod
	public void AfterTestMethod() 
	{
	  		Playback.stop();
	}	
}
