package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapCAD {

    
     public CCSearch ccSearch;
                
     public UIMapCAD()
     {
                 if ((this.ccSearch == null))
     {
         this.ccSearch = new CCSearch();
     }
                  
     }           

                
  public class CCSearch
  {
                  public WebDriver driver;
                  
                  public CCSearch()
                  {
                                  driver = Playback.driver;
                        PageFactory.initElements(driver, this);
                                  
                  }
                
                  
                  @FindBy(how = How.ID, using = "txtSysCommand")
                  public WebElement uISystemCommandCodeEdit;
                  
                  @FindBy(how = How.ID, using = "radSysCC")
                  public WebElement uISysCCRadioButton;
                  
                  @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
                  public WebElement uISearchButton;
                  
                  @FindBy(how = How.ID, using = "grdCommandCode")
                  public WebElement uICCSearchResultTable;
                  
                  
  }
                
}
