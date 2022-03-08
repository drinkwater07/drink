package application;

import java.util.List;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import dataAccess.BaseData;
import uIMaps.UIMapCAD;
import uIMaps.UIMapHome;
import uIMaps.UIMapNames;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.verify;


public class CAD {
                
                public ObjectIdentification objectIdentification = new ObjectIdentification();
                public UIMapCAD uIMapCad = new UIMapCAD();
                public UIMapHome uIMapHome = new UIMapHome();
                public Popup popup = new Popup();
                public UIMapPopup uIMapPopup = new UIMapPopup();
                public UIMapNames uIMapNames = new UIMapNames();
                public CCSearch ccSearch;

                
                public CAD()
                {
                                if (ccSearch == null)
                                                ccSearch = new CCSearch();
                                
                                
                                
                }
                
                public void Reset() {
                                uIMapCad = null;
                                uIMapHome = null;
                                uIMapPopup = null;
                }
                
                public void switchToCCSearchScreenTab()
                {
                                Playback.pageLoadThreadWait();
                                objectIdentification.windowHandle.switchToFrame("frmCCsrch.aspx?");
                }
                
                public class CCSearch{
                                
                public void clickSysCCRadioButton()
                {
                                uIMapCad.ccSearch.uISysCCRadioButton.click();
                }
                                                
                public void enterAtSystemCommand()
                {
                            uIMapCad.ccSearch.uISystemCommandCodeEdit.sendKeys(BaseData.getCADModuleValue("SystemCommand"));
                                uIMapCad.ccSearch.uISystemCommandCodeEdit.sendKeys(Keys.TAB);
                }
                                
                public void clickSearch()
                {
                                uIMapCad.ccSearch.uISearchButton.click();
                }
                
                public void clickAtSystemCommandCodeInGrid()
                {
                              objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCad.ccSearch.uICCSearchResultTable, BaseData.getCADModuleValue("SystemCommandCode"));
                }
                
                public void verifyAtSystemCommandCodeInGrid()
                {
                                List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapCad.ccSearch.uICCSearchResultTable, "System Command Code");
                                System.out.println(gridTableColumnValues);
                                Playback.controlReadyThreadWait();
                                if(gridTableColumnValues.contains(BaseData.getCADModuleValue("SystemCommandCode")))
                                {
                                for(String values:gridTableColumnValues)
                                verify.ExpectedValueIsTrue(values.contains(BaseData.getCADModuleValue("SystemCommandCode")));
                }
                
                }
                
                
                }
}
