package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapPopup {

	public ConfirmWindow confirmWindow;
	public AcknowledgeWindow acknowledgeWindow;
	public KPIHelpWindow kPIHelpWindow;
	public MultiFilesAttachWindow multiFilesAttachWindow;
	public TreeViewHelp treeViewHelp;

	public UIMapPopup() {
		if (this.confirmWindow == null)
			this.confirmWindow = new ConfirmWindow();

		if (this.acknowledgeWindow == null)
			this.acknowledgeWindow = new AcknowledgeWindow();

		if (this.kPIHelpWindow == null)
			this.kPIHelpWindow = new KPIHelpWindow();

		if (this.multiFilesAttachWindow == null)
			this.multiFilesAttachWindow = new MultiFilesAttachWindow();

		if (this.treeViewHelp == null)
			this.treeViewHelp = new TreeViewHelp();
	}

	public class ConfirmWindow {
		public WebDriver driver;

		public ConfirmWindow() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "htmlErrorInfo")
		public WebElement uIErrorInfoTextEdit;

		@FindBy(how = How.ID, using = "cmdAccept")
		public WebElement uIYesButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uINoButton;

	}

	public class AcknowledgeWindow {
		public WebDriver driver;

		public AcknowledgeWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "htmlErrorInfo")
		public WebElement uIErrorInfoTextEdit;

		@FindBy(how = How.ID, using = "cmdOk")
		public WebElement uIOkButton;

		@FindBy(how = How.ID, using = "imgMsgType")
		public WebElement uILogo;
	}

	public class KPIHelpWindow {

		public WebDriver driver;

		public KPIHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdSrch")
		public WebElement uIKPIHelpWindowTable;

		@FindBy(how = How.ID, using = "txtCodeValue")
		public WebElement uICodeValueEdit;

		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "imgSrchButton")
		public WebElement uISearchIconButton;

		@FindBy(how = How.ID, using = "imgClearCoded")
		public WebElement uIClearIconButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddNewButton;

	}

	public class MultiFilesAttachWindow {
		public WebDriver driver;

		public MultiFilesAttachWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "AjaxFileUpload1_SelectFileContainer")
		public WebElement uIBrowseButton;

		@FindBy(how = How.ID, using = "AjaxFileUpload1_UploadOrCancelButton")
		public WebElement uIUploadButton;

		@FindBy(how = How.ID, using = "btn_Close")
		public WebElement uICloseButton;

		@FindBy(how = How.ID, using = "btn_refresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "form1")
		public WebElement uIForm;

	}

	public class TreeViewHelp {
		public WebDriver driver;

		public TreeViewHelp() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISelectButton;

		@FindBy(how = How.XPATH, using = "//div[@id='RadTreeView2']")
		public WebElement uITreeViewHelpTreeTable;

		@FindBy(how = How.ID, using = "txtActType")
		public WebElement uISearchForEdit;
		

	}

}
