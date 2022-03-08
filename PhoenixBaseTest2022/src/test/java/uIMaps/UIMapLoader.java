package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapLoader {

	public UIMapLoader() {
		if (this.leftNavigationControl == null)
			this.leftNavigationControl = new LeftNavigationControl();
		if (this.headerControls == null)
			this.headerControls = new HeaderControls();
	}

	public HeaderControls headerControls = null;
	public LeftNavigationControl leftNavigationControl = null;

	ObjectIdentification objectIdentification = new ObjectIdentification();
	ObjectIdentification.WindowHandle windowHandle = objectIdentification.new WindowHandle();

	public class LeftNavigationControl {

		public LeftNavigationControl() {

			windowHandle.switchToMainWindow();
			PageFactory.initElements(Playback.driver, this);

		}

		@FindBy(how = How.ID, using = "LeftNav")
		public WebElement uILeftNavigationDiv;

	}

	public class HeaderControls {
		public WebDriver driver;

		public HeaderControls() {
			driver = windowHandle.switchToMainWindow();
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "pnxWindowStrip")
		public WebElement uIScreenDivElem;

		@FindBy(how = How.ID, using = "btnSysParam")
		public WebElement uISysParameterImageButton;

		@FindBy(how = How.ID, using = "imgTxtSrch")
		public WebElement uITextMessageSrchImageButton;

		@FindBy(how = How.ID, using = "txtSearch")
		public WebElement uITextMessageTextbox;

		@FindBy(how = How.ID, using = "btnJobStatus")
		public WebElement uIJobStatusImageButton;

		@FindBy(how = How.ID, using = "lblMsgCnt")
		public WebElement uIMessageSearchImageButton;

		@FindBy(how = How.ID, using = "lblUserName")
		public WebElement uILoginUserNameText;

		@FindBy(how = How.XPATH, using = "//*[@id='PnxLogo' and @title='Police RMS']")
		public WebElement uIPnxLogoImageButton;

		@FindBy(how = How.XPATH, using = "//div[@class='rmSlide']//ul/li/a/span[contains(text(), 'Logout')]")
		public WebElement uILogoutTextView;

		@FindBy(how = How.XPATH, using = "//div[@id='mnuPhoenix']//li[@class='rmItem rmFirst rmLast']")
		public WebElement uIMouseOverLogTextView;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Logout')]")
		public WebElement logoutbotton;
		
	}

}
