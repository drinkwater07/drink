package application;

import org.openqa.selenium.Keys;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapLogin;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Login {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapLogin uIMapLogin = new UIMapLogin();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	PropertiesFile propertiesFile = new PropertiesFile();

	public String UserName = PropertiesFile.readPropertiesFile("UserName");
	public String Password = PropertiesFile.readPropertiesFile("Password");
	public String Database = PropertiesFile.readPropertiesFile("Database");
	public String UserNameFire = PropertiesFile.readPropertiesFile("UserNameFire");
	public String DatabaseFire = PropertiesFile.readPropertiesFile("DatabaseFire");

	public LoginScreen loginScreen;
	public ForgotPasswordScreen forgotPasswordScreen;

	public Login() {
		if (loginScreen == null)
			loginScreen = new LoginScreen();

		if (forgotPasswordScreen == null)
			forgotPasswordScreen = new ForgotPasswordScreen();

	}

	public void Reset() {
		uIMapLogin = null;
	}

	public class LoginScreen {

		public void Logon() {

			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(UserName);
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(Password);
			Playback.pageLoadThreadWait();
			// uILogin.uIDatabaseComboBox.sendKeys(Database);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapLogin.loginScreen.uIDatabaseComboBox,
					Database);
			Playback.pageLoadThreadWait();
			uIMapLogin.loginScreen.uILoginButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.phoenixMainWindow();
			Playback.pageLoadThreadWait();
		}

		public void logonUsingTestContext() {

			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getTestContextData("UserName"));
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getTestContextData("Password"));
			Playback.pageLoadThreadWait();
			// uILogin.uIDatabaseComboBox.sendKeys(Database);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapLogin.loginScreen.uIDatabaseComboBox,
					Database);
			Playback.pageLoadThreadWait();
			uIMapLogin.loginScreen.uILoginButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.phoenixMainWindow();
			Playback.pageLoadThreadWait();
		}

public void logonUsingTestContextOtherDB() {

			
			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getTestContextData("UserName"));
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getTestContextData("Password"));
			Playback.pageLoadThreadWait();
			// uILogin.uIDatabaseComboBox.sendKeys(Database);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapLogin.loginScreen.uIDatabaseComboBox,
					BaseData.getTestContextData("Database"));
			Playback.pageLoadThreadWait();
			uIMapLogin.loginScreen.uILoginButton.click();
			//if(!PropertiesFile.readPropertiesFile("url").contains("82")||!PropertiesFile.readPropertiesFile("url").contains("100"))
//			if(PropertiesFile.readPropertiesFile("url").contains("82")||
//					PropertiesFile.readPropertiesFile("url").contains("87")||
//					PropertiesFile.readPropertiesFile("url").contains("143")||
//					PropertiesFile.readPropertiesFile("url").contains("45"))
//			{
				try {
					uIMapLogin.loginScreen.uICJISPolicyCheckbox.click();
				uIMapLogin.loginScreen.uICJISPopupOKButton.click();
				Playback.pageLoadThreadWait();
				objectIdentification.windowHandle.phoenixMainWindow();
				Playback.pageLoadThreadWait();
				}
				catch(Exception e)
				{
					if(objectIdentification.manualIdentify.controlExist(uIMapLogin.loginScreen.uICJISPopupOKButton))
					{
					Playback.pageLoadThreadWait();
					uIMapLogin.loginScreen.uICJISPopupOKButton.click();
					Playback.pageLoadThreadWait();
					objectIdentification.windowHandle.phoenixMainWindow();
					Playback.pageLoadThreadWait();
					}
					else
					{
						Playback.pageLoadThreadWait();
						objectIdentification.windowHandle.phoenixMainWindow();
						Playback.pageLoadThreadWait();
					}
				
			}
			
			

		}

		public void clickResetButton() {
			uIMapLogin.loginScreen.uIResetButton.click();
		}

		public void clearUserName() {
			uIMapLogin.loginScreen.uIUserNameEdit.clear();
		}

		public void verifyAuthendicationFailedMessage() {
			verify.ExpectedPropertyValueIsEqual("Authentication failed - wrong username or password.",
					uIMapLogin.loginScreen.uILoginErrorMessageText.getText());
		}

		public void EnterAtUserName() {
			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getLoginModuleValue("UserName"));
		}

		public void EnterAtPassword() {
			uIMapLogin.loginScreen.uIPasswordEdit.click();
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getLoginModuleValue("Password"));
		}

		public void VerifyCapsLockMessage() {
			// PlayBack.PageLoadThreadWait();
			// Actions action = new Actions(PnxBaseTest.driver);
			// action.MoveToElement(uIMapLogin.loginScreen.uICapsStatusMessageText).Perform();
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("Caps Lock is on",
					uIMapLogin.loginScreen.uICapsStatusMessageText.getText());

		}

		public void ClearUserName() {
			uIMapLogin.loginScreen.uIUserNameEdit.clear();
		}

		public void ClickResetButton() {
			uIMapLogin.loginScreen.uIResetButton.click();
		}

		public void ClickCJISpolicyCheckBox() {
			uIMapLogin.loginScreen.uICJISPolicyCheckbox.click();
		}

		public void ClickCJISpolicyOK() {
			uIMapLogin.loginScreen.uICJISOKButton.click();
			Playback.waitForPageLoad();
			objectIdentification.windowHandle.switchToMainWindow();
		}

		public void ClearPassword() {
			uIMapLogin.loginScreen.uIPasswordEdit.clear();
		}

		public void VerifyUserNamePasswordMessage() {
			verify.ExpectedPropertyValueIsEqual("Please enter your User Name and Password",
					uIMapLogin.loginScreen.uILoginErrorMessageText.getText());
		}

		public void VerifyPasswordMessage() {
			verify.ExpectedPropertyValueIsEqual("Please enter your Password",
					uIMapLogin.loginScreen.uILoginErrorMessageText.getText());
		}

		public void VerifyUserNameMessage() {
			verify.ExpectedPropertyValueIsEqual("Please enter your User Name",
					uIMapLogin.loginScreen.uILoginErrorMessageText.getText());
		}

		public void VerifyUerNameFieldEmpty() {
			verify.ExpectedPropertyValueIsNotEqual("", uIMapLogin.loginScreen.uIUserNameEdit.getAttribute("value"));

		}

		public void VerifyPasswordFieldEmpty() {
			verify.ExpectedPropertyValueIsNotEqual("", uIMapLogin.loginScreen.uIPasswordEdit.getAttribute("value"));
		}

		public void ClickForgotPasswordClickHere() {
			uIMapLogin.loginScreen.uIForgotPasswordClickHereLink.click();
		}

		public void SwitchToForgotPasswordScreen() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmForgetPassWord");
			Playback.controlReadyThreadWait();
		}

		public void SelectAtDatabase() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapLogin.loginScreen.uIDatabaseComboBox,
					BaseData.getLoginModuleValue("Database"));
		}

		public void EnterAtEmailID() {
			Playback.controlReadyThreadWait();
			uIMapLogin.loginScreen.uIUserNameEdit.click();
			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getLoginModuleValue("EmailID"));
		}

		public void ClickLoginButton() {
			uIMapLogin.loginScreen.uILoginButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickCJISpolicyPopupOK() {
			uIMapLogin.loginScreen.uICJISPopupOKButton.click();
			Playback.waitForPageLoad();
			objectIdentification.windowHandle.switchToMainWindow();
		}

		public void EnterAtUserName1() {
			uIMapLogin.loginScreen.uIUserNameEdit.click();
			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getLoginModuleValue("UserName1"));
		}

		public void EnterAtPassword1() {
			uIMapLogin.loginScreen.uIPasswordEdit.click();
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getLoginModuleValue("Password1"));
		}

		public void EnterAtPassword2() {
			uIMapLogin.loginScreen.uIPasswordEdit.click();
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getLoginModuleValue("Password2"));
		}

		public void verifyForgotPasswordDisabled() {
			Playback.controlReadyThreadWait();
			Playback.waitForPageLoad();
			String valse = uIMapLogin.loginScreen.uIForgotPasswordinvisibleElement.getCssValue("display");
			verify.ExpectedPropertyValueIsEqual(valse, "block");
		}

		public void verifyForgotPasswordEnabled() {
			Playback.controlReadyThreadWait();
			Playback.waitForPageLoad();
			verify.ExpectedValueIsTrue(uIMapLogin.loginScreen.uIForgotPassword.isEnabled());
			verify.ExpectedValueIsTrue(uIMapLogin.loginScreen.uIForgotPassword.isDisplayed());
			String actual = uIMapLogin.loginScreen.uIForgotPassword.getText();
			verify.ExpectedPropertyValueIsEqual("Forgot Password?", actual);
		}

		public void LogonForFire() {

			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(UserNameFire);
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(Password);
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapLogin.loginScreen.uIDatabaseComboBox,
					DatabaseFire);
			Playback.pageLoadThreadWait();
			uIMapLogin.loginScreen.uILoginButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.phoenixMainWindow();
			Playback.pageLoadThreadWait();
		}

	}

	public class ForgotPasswordScreen {
		public void EnterUserName() {
			uIMapLogin.forgotPasswordScreen.uIUserNameEdit.sendKeys(Randomized.randomString(5));
		}

		public void ClickSendPasswordButton() {
			uIMapLogin.forgotPasswordScreen.uISendPasswordButton.click();
		}

		public void EnterInvalidEmail() {
			uIMapLogin.forgotPasswordScreen.uIEmailEdit.sendKeys(Randomized.randomString(10));
			uIMapLogin.forgotPasswordScreen.uIEmailEdit.sendKeys(Keys.TAB);
		}

		public void ClickCancelButton() {
			uIMapLogin.forgotPasswordScreen.uICancelButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyInvalidUserNameEmailMessage() {
			verify.ExpectedPropertyValueIsEqual("Invalid User Name or Email",
					uIMapLogin.forgotPasswordScreen.uIErrorMessageText.getText());
		}

		public void VerifyValidEmailMessage() {
			verify.ExpectedPropertyValueIsEqual("Please Enter a Valid Email",
					uIMapLogin.forgotPasswordScreen.uIValidateMessageText.getText());
		}

		public void VerifyUserNameEmailMessage() {
			verify.ExpectedPropertyValueIsEqual("Please Enter UserName or Email",
					uIMapLogin.forgotPasswordScreen.uIMessageText.getText());
		}

		public void EnterAtUserName() {
			uIMapLogin.forgotPasswordScreen.uIUserNameEdit.clear();
			uIMapLogin.forgotPasswordScreen.uIUserNameEdit.sendKeys(BaseData.getLoginModuleValue("UserName"));
		}

		public void EnterAtEmail() {
			uIMapLogin.forgotPasswordScreen.uIEmailEdit.sendKeys(BaseData.getLoginModuleValue("Email"));
		}

		public void VerifyAtUserName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getLoginModuleValue("UserName"),
					uIMapLogin.forgotPasswordScreen.uIUserNameEdit.getAttribute("value"));
		}

		public void ClickCloseButton() {
			uIMapLogin.forgotPasswordScreen.uICloseButton.click();
			Playback.controlReadyThreadWait();
		}

	}

}