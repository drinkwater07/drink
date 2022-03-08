package uIMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapLogin
{
	
	public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public ObjectIdentification.WindowHandle windowHandle=objectIdentification.new WindowHandle();
	  
	  public  LoginScreen loginScreen;
	  public ForgotPasswordScreen forgotPasswordScreen;
	  
	  public UIMapLogin()
	  {
		  if(this.loginScreen == null)
			  this.loginScreen = new LoginScreen();
		  
		  if(this.forgotPasswordScreen == null)
			  this.forgotPasswordScreen = new ForgotPasswordScreen();
		  
	  }
	    public class LoginScreen
	    {	          

	        public LoginScreen()
	        {
	        	PageFactory.initElements(Playback.driver, this); 
	        }
	        
	        @FindBy(how=How.ID, using = "usrLogin_upForgotPwd")
	        public WebElement uIForgotPasswordinvisibleElement;
	        
	        @FindBy(how=How.ID, using = "usrLogin_lnkForgotPwd")
	        public WebElement uIForgotPassword;

	        @FindBy(how=How.ID, using= "usrLogin_txtUserName") //usrLogin_txtUserName
	        public WebElement uIUserNameEdit;

	        @FindBy(how=How.ID, using = "usrLogin_txtPassword") //usrLogin_txtPassword
	        public WebElement uIPasswordEdit;

	        @FindBy(how=How.ID, using = "usrLogin_lstProductDB") //usrLogin_lstProductDB
	        public WebElement uIDatabaseComboBox;

	        @FindBy(how=How.ID, using = "usrLogin_cmdLogin") //usrLogin_cmdLogin
	        public WebElement uILoginButton;

	        @FindBy(how=How.ID, using = "usrLogin_btnReset")
	        public WebElement uIResetButton;

	        @FindBy(how=How.ID, using = "CapsDiv")
	        public WebElement uICapsLockDiv;

	         @FindBy(how=How.XPATH, using = "//div[@id='CapsDiv']//span")
	        public WebElement uICapsStatusMessageText;

	        @FindBy(how=How.ID, using = "lblErrorMessage")
	        public WebElement uILoginErrorMessageText;

	        @FindBy(how=How.ID, using = "usrLogin_chkCJISPolicy")
	        public WebElement uICJISPolicyCheckbox;

	        @FindBy(how=How.ID, using = "usrLogin_btnCIJSPolicy")
	        public WebElement uICJISOKButton;

	        @FindBy(how=How.LINK_TEXT, using = "Click here...")
	        public WebElement uIForgotPasswordClickHereLink;

	        @FindBy(how=How.ID, using = "usrLogin_cmdPopupMsg")
	        public WebElement uICJISPopupOKButton;
	        
	    }
	 	
	    public class ForgotPasswordScreen
	    {

	        public ForgotPasswordScreen()
	        {
	        	PageFactory.initElements(Playback.driver, this); 
	        }

	        @FindBy(how=How.ID, using = "txtUserName")
	        public WebElement uIUserNameEdit;

	        @FindBy(how=How.ID, using = "txtEmail")
	        public WebElement uIEmailEdit;

	        @FindBy(how=How.ID, using = "cmdSendPWD")
	        public WebElement uISendPasswordButton;

	        @FindBy(how=How.ID, using = "cmdCancel")
	        public WebElement uICancelButton;

	        @FindBy(how=How.ID, using = "lblMessage")
	        public WebElement uIMessageText;

	        @FindBy(how=How.ID, using = "lblErrorMsg")
	        public WebElement uIErrorMessageText;

	        @FindBy(how=How.ID, using = "lblValidateEmail")
	        public WebElement uIValidateMessageText;

	        @FindBy(how=How.ID, using = "btnClose")
	        public WebElement uICloseButton;
	    }
}