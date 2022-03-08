package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.Login;
import utilities.Browser;
import utilities.Playback;



public class LoginScripts {
	
    public Login login;
	
	@BeforeMethod
	public void BeforeTestMethod() 
	{
		
	Playback.start();
    login=new Login();
		     
   }
	
	@Test	
	public void Login()
	{
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();;
	}
	
	@AfterMethod
	public void AfterTestMethod() 
	{
	  		Playback.stop();
	}	
}
  