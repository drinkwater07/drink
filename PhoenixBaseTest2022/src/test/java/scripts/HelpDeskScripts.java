package scripts;



import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.Helpdesk;

import application.Home;
import application.Loader;
import application.Login;
import application.Popup;
import application.Settings;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;


public class HelpDeskScripts {
	
	
	public Login login;
	public Loader loader;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Helpdesk helpdesk;
	public Home home;
	
	
	//@BeforeTest
	
		//ITestContext testContext;
		@BeforeMethod
		public void BeforeTestMethod( ITestContext testContext) 
		{
			testContext.setAttribute("moduleName", "HelpDesk");		
			Playback.testContext=testContext;
			
			Playback.start();
				
			login=new Login();
			loader=new Loader();
			helpdesk = new Helpdesk();
		    settings = new Settings();
		    objectIdentification = new ObjectIdentification();
		    home = new Home();
		
	   }	
	
		
		@Test
		public void TicketEntry_267553(ITestContext testContext)
	     {
			testContext.setAttribute("testID", "267553");		
	         Browser.NavigateToLoginScreen();
	         login.loginScreen.Logon();
	         loader.navigateToModule("Help Desk");
	         loader.navigateToScreen("Ticket Search");
	         helpdesk.switchToTicketSearchScreen();
	         helpdesk.ticketSearch.AddNewButton();
	         helpdesk.switchToTicketEntry();
	         helpdesk.ticketEntry.selectAtHelpDeskClass();
	         helpdesk.ticketEntry.enterSubject();
	         helpdesk.ticketEntry.selectAtStatus();
	         helpdesk.ticketEntry.selectAtPriority();
	         helpdesk.ticketEntry.enterAtCreatorPF();
	         helpdesk.ticketEntry.enterAtOwnerPF();
	         helpdesk.ticketEntry.selectAtCategory();
	         helpdesk.ticketEntry.selectAtStatus();
	         helpdesk.ticketEntry.save();

}
		
		//Not completed
		@Test
		public void EmailSettings_267555(ITestContext testContext) {
			
			testContext.setAttribute("testID", "267555");		
	         Browser.NavigateToLoginScreen();
	         login.loginScreen.Logon();
	         loader.navigateToModule("Help Desk");
			
		}
		
		//Not completed
		@Test
		public void TicketSearch_267564(ITestContext testContext) {
			
			testContext.setAttribute("testID", "267564");		
	         Browser.NavigateToLoginScreen();
	         login.loginScreen.Logon();
	         loader.navigateToModule("Help Desk");
			
			
		}
		
		
		
}
