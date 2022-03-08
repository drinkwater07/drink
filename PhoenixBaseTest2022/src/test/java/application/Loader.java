package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dataAccess.BaseData;
import uIMaps.UIMapLoader;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.verify;

public class Loader {

	WebDriver driver = Playback.driver;
	ObjectIdentification objectIdentification = new ObjectIdentification();
	ObjectIdentification.WindowHandle windowHandle = objectIdentification.new WindowHandle();

	public UIMapLoader uIMapLoader;
	public UIMapLoader.HeaderControls uILoaderHeader;
	public Popup popup = new Popup();
	public Popup.Confirm confirm;
	public static String ModuleName;

	public Loader() {
		uIMapLoader = new UIMapLoader();
		uILoaderHeader = uIMapLoader.new HeaderControls();
		popup = new Popup();
		confirm = popup.new Confirm();
	}

	public void Reset() {
		uIMapLoader = null;

	}
	/*
	 * public void navigateToModule(String moduleTitle) { try{Thread.sleep(3000);}
	 * catch(InterruptedException e){}
	 * 
	 * WebElement uILeftNavigationDiv=
	 * Playback.driver.findElement(By.id("LeftNav"));
	 * 
	 * WebElement moduleElem=
	 * uILeftNavigationDiv.findElement(By.xpath("ul/li/div/span[contains(text(),'" +
	 * moduleTitle + "')]"));
	 * 
	 * // WebElement rtDivElem = moduleElem.findElement(By.xpath(".."));
	 * 
	 * // String rtDivClass = rtDivElem.getAttribute("class");
	 * 
	 * boolean result = true; while(result) { if(moduleElem.isDisplayed()) {
	 * moduleElem.click(); break; } else if(result) {
	 * Playback.controlReadyThreadWait();
	 * objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv);
	 * ((JavascriptExecutor)Playback.driver).executeScript(
	 * "window.scrollBy(0,document.body.scrollHeight)"); moduleElem.click(); break;
	 * }
	 * 
	 * else if(result) { Playback.controlReadyThreadWait();
	 * objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv);
	 * ((JavascriptExecutor)Playback.driver).executeScript(
	 * "window.scrollBy(0,-document.body.scrollHeight)"); break; }
	 * try{Thread.sleep(3000);} catch(InterruptedException e){} }
	 * 
	 * }
	 * 
	 * 
	 * public void navigateToScreen(String screenTitle) { try{Thread.sleep(3000);}
	 * catch(InterruptedException e){} WebElement
	 * uILeftNavigationDiv=Playback.driver.findElement(By.id("LeftNav")); WebElement
	 * screenElem =
	 * uILeftNavigationDiv.findElement(By.xpath("ul/li/ul/li/div/span[text()='" +
	 * screenTitle + "']"));
	 * ((JavascriptExecutor)Playback.driver).executeScript("arguments[0].click();",
	 * screenElem); try{Thread.sleep(3000);} catch(InterruptedException e){} }
	 */


     public void navigateToModule(String moduleTitle)
     {
    	 
            try{Thread.sleep(3000);} catch(InterruptedException e){}
            objectIdentification.windowHandle.switchToMainWindow();
            
            WebElement uILeftNavigation= Playback.driver.findElement(By.id("RAD_SLIDING_PANE_CONTENT_Pane1"));
            int headrVerticalSize=200;
            Actions actions = new Actions(driver);
            actions.moveToElement(uILeftNavigation, 0, -1 * headrVerticalSize).perform();
            WebElement uILeftNavigationDiv= Playback.driver.findElement(By.id("LeftNav"));
            objectIdentification.actionBuilder.MoveToElement(uILeftNavigation); 
      
            Playback.pageLoadThreadWait();         
     WebElement moduleElem=  uILeftNavigationDiv.findElement(By.xpath("ul/li/div/span[contains(text(),'" + moduleTitle + "')]"));

     boolean result = true;
            while(result)
            {
            	  Playback.controlReadyThreadWait();
                   if(moduleElem.isDisplayed())
                   {             
                         moduleElem.click();
                         break;
                   }
                   else if(result)
                   {
                   Playback.controlReadyThreadWait();
                   objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv); 
                   ((JavascriptExecutor)Playback.driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
                   moduleElem.click();
                   break;
                   }
                   
                   else if(result)
                   {
                   Playback.controlReadyThreadWait();
                   objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv);
                   ((JavascriptExecutor)Playback.driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
                   break;
                   }
     try{Thread.sleep(3000);} catch(InterruptedException e){}
            }

           
     } 

     public void navigateToScreenBasedOnScreenName(String screenTitle)
     {
    	 	String[] parts = screenTitle.split("-");
    	 	Playback.implictwait();
    		objectIdentification.windowHandle.switchToMainWindow();
    		WebElement uILeftNavigationDiv=Playback.driver.findElement(By.id("LeftNav"));
           List<WebElement> screenElem = uILeftNavigationDiv.findElements(By.xpath("ul/li/ul/li/div/span[text()='" + parts[0] + "']"));
           WebElement module = uILeftNavigationDiv.findElement(By.xpath("ul/li/ul/li/div/span[text()='" + parts[0] + "']//preceding::span[@class='rtIn LeftNavModule'][1][contains(text(),'"+parts[1]+"')]"));
           boolean result = true;
           while(result)
           {
        	   if(module.isDisplayed())
               {             
        		   module.click();	
                     break;
               }
               else if(result)
               {
               Playback.controlReadyThreadWait();
               objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv); 
               ((JavascriptExecutor)Playback.driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
               module.click();
               break;
               }   
               else if(result)
               {
               Playback.controlReadyThreadWait();
               objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv);
               ((JavascriptExecutor)Playback.driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
               break;
               }
 try{Thread.sleep(3000);} catch(InterruptedException e){}
        }
              
        	   Playback.implictwait();
            	  for(WebElement ele:screenElem)
            	  {
            		 if(ele.isDisplayed())
                  	{
                  		((JavascriptExecutor)Playback.driver).executeScript("arguments[0].click();", ele);
                  		try{Thread.sleep(3000);} catch(InterruptedException e){}
            			 	
                  	} 
            	  }	   
           
     }


	public void navigateToModuleBasedOnScreenName(String ScreenTitle) {
		String[] parts = ScreenTitle.split("-");
		Playback.implictwait();
		objectIdentification.windowHandle.switchToMainWindow();
		WebElement uILeftNavigationDiv = Playback.driver.findElement(By.id("LeftNav"));
		WebElement module = uILeftNavigationDiv.findElement(By.xpath("ul/li/ul/li/div/span[text()='" + parts[0]
				+ "']//preceding::span[@class='rtIn LeftNavModule'][1][contains(text(),'" + parts[1] + "')]"));
		module.click();
	}

	public void navigateToScreen(String screenTitle) {
		Playback.threadWait(3000);
		objectIdentification.windowHandle.switchToMainWindow();
		WebElement uILeftNavigationDiv = Playback.driver.findElement(By.id("LeftNav"));
		List<WebElement> screenElem = uILeftNavigationDiv
				.findElements(By.xpath("ul/li/ul/li/div/span[text()='" + screenTitle + "']"));
		for (WebElement element : screenElem) {
			if (element.isDisplayed()) {
				((JavascriptExecutor) Playback.driver).executeScript("arguments[0].click();", element);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
			}
			/*
			 * else { Playback.controlReadyThreadWait();
			 * objectIdentification.actionBuilder.MoveToElement(uILeftNavigationDiv);
			 * ((JavascriptExecutor)Playback.driver).executeScript(
			 * "window.scrollBy(0,-document.body.scrollHeight)");
			 * Playback.controlReadyThreadWait();
			 * ((JavascriptExecutor)Playback.driver).executeScript("arguments[0].click();",
			 * element); }
			 */
		}
	}

	public void navigateToScreenByScreenID(String screenId) {
		Playback.waitForPageLoad();
		WebElement screenElem = uIMapLoader.leftNavigationControl.uILeftNavigationDiv
				.findElement(By.xpath("ul/li/ul/li/div/span[@title ='" + screenId + "']"));
		Actions builder = new Actions(Playback.driver);
		((JavascriptExecutor) Playback.driver).executeScript("arguments[0].click();", screenElem);
		Playback.waitForPageLoad();

	}

	public void ScreenTabSelection(String screenTabName) {
		Playback.threadWait(3000);
		uIMapLoader.headerControls.uIScreenDivElem
				.findElement(By.xpath("//span[contains(text(),'" + screenTabName + "')]")).click();
	}

	public void ReLoadScreen(String screenTabName) {
		Playback.threadWait(3000);
		WebElement uIScreenTab = uIMapLoader.headerControls.uIScreenDivElem
				.findElement(By.xpath(".//span[contains(text(),'" + screenTabName + "')]"));
		new Actions(Playback.driver).contextClick(uIScreenTab).perform();
		Playback.threadWait(3000);
		Playback.driver
				.findElement(By
						.xpath("//div[@id='ContextMenu_ToRadTabstrip_detached']//span[contains(text(),'Reload Tab')]"))
				.click();
	}

	public void CloseScreen(String screenTabName) {

		Playback.threadWait(3000);
		WebElement uIscreenTab = uIMapLoader.headerControls.uIScreenDivElem
				.findElement(By.xpath(".//span[contains(text(),'" + screenTabName + "')]"));
		new Actions(Playback.driver).contextClick(uIscreenTab).perform();
		Playback.threadWait(3000);
		Playback.driver
				.findElement(
						By.xpath("//div[@id='ContextMenu_ToRadTabstrip_detached']//span[contains(text(),'Close Tab')]"))
				.click();

	}

	public void ClickMessageSearchImageButton() {
		uIMapLoader.headerControls.uIMessageSearchImageButton.click();
	}

	public void ClickTextMsgSrchImageIcon() {
		uIMapLoader.headerControls.uITextMessageSrchImageButton.click();
	}

	public void EnterAutomationinTextMsgSrchTextBox() {
		uIMapLoader.headerControls.uITextMessageTextbox.sendKeys("automation");
	}

	public void ClickUserName() {
		uIMapLoader.headerControls.uILoginUserNameText.click();
	}

	public void ClickLogOut() {
		uIMapLoader.headerControls.uIPnxLogoImageButton.click();
		Playback.controlReadyThreadWait();
		uIMapLoader.headerControls.uILogoutTextView.click();
	}

	public void logout() {
		Playback.controlReadyThreadWait();
		windowHandle.phoenixMainWindow();
		uILoaderHeader.uIPnxLogoImageButton.click();
		uILoaderHeader.uIMouseOverLogTextView.click();
		Playback.controlReadyThreadWait();
		uILoaderHeader.uILogoutTextView.click();
		confirm.yes();
		Playback.controlReadyThreadWait();
	}

	public void ClickLogginUserLink() {
		Actions mousehover = new Actions(Playback.driver);
		mousehover.moveToElement(uIMapLoader.headerControls.uILoginUserNameText).perform();
		mousehover = null;
		Playback.controlReadyThreadWait();
		uIMapLoader.headerControls.uILoginUserNameText.click();
		Playback.controlReadyThreadWait();
		// Settings.SwitchToPhoenixAuthenticatorWindow();
		// Settings.PhoenixAuthenticatorWindow.EnterAtPassword();
		// Settings.PhoenixAuthenticatorWindow.ClickAcceptButton();
		// PlayBack.ControlReadyThreadWait();
	}

	public void ClickSystemParameterIcon() {
		uIMapLoader.headerControls.uISysParameterImageButton.click();
		Playback.controlReadyThreadWait();
	}

	public void ClickJobStatusIcon() {
		uIMapLoader.headerControls.uIJobStatusImageButton.click();
		Playback.controlReadyThreadWait();
	}

	public void clickOnPNXLogo() {
		Playback.controlReadyThreadWait();
		windowHandle.phoenixMainWindow();
		uILoaderHeader.uIPnxLogoImageButton.click();
		uILoaderHeader.uIMouseOverLogTextView.click();
	}

	public void mouseHoverOnTools() {
		Playback.controlReadyThreadWait();

	}

	public void mouseHoverOnPnxLogoAction(String action) {
		Playback.controlReadyThreadWait();
		WebElement target = Playback.driver
				.findElement(By.xpath("//div[@class='rmSlide']//ul/li/a/span[contains(text(), '" + action + "')]"));
		objectIdentification.actionBuilder.MoveToElement(target);
	}

	public void mouseHoverAndClickOnPnxLogoAction(String action) {
		Playback.controlReadyThreadWait();
		WebElement target = Playback.driver
				.findElement(By.xpath("//div[@id='mnuPhoenix']//ul/li/a/span[contains(text(), '" + action + "')]"));
		Playback.controlReadyThreadWait();
		Playback.actionDriver.moveToElement(target).click().build().perform();

	}

	public void pressEnterInTextMsgSrchTextBox() {
		uIMapLoader.headerControls.uITextMessageTextbox.sendKeys(Keys.ENTER);
	}

	public void mouseHoverOnScreenName(String screenName) {
		
		List<WebElement> screen =Playback.driver.findElements(By.xpath("//ul/li/ul/li/div/span[text()='" + screenName + "']"));
		for (WebElement element : screen) {
			if (element.isDisplayed()) {
				
				objectIdentification.actionBuilder.MoveToElement(element);
			}
		}
		
	}
	
	
	
	public void clickFavoriteIconUsingScreenName(String screenName) {
		List<WebElement> screen =Playback.driver.findElements(By.xpath("//ul/li/ul/li/div/span[text()='" + screenName + "']"));
		for (WebElement element : screen) {
			if (element.isDisplayed()) {
				
				element.findElement(By.tagName("input")).click();
			}
		}
		
	}
	public void verifyFavoriteIConStatus(String screenName,String status) {
		List<WebElement> screen =Playback.driver.findElements(By.xpath("//ul/li/ul/li/div/span[text()='" + screenName + "']"));
		String ttl =null;
		for (WebElement element : screen) {
			if (element.isDisplayed()) {
				
				ttl =element.findElement(By.tagName("input")).getAttribute("title");
				break;
			}
		}
		verify.ExpectedPropertyValueIsEqual(status, ttl);
	}


	public void verifyAtScreenInFavorite(String screenTitle) {
		 WebElement uILeftNavigationDiv=Playback.driver.findElement(By.id("LeftNav"));
       List<WebElement> screenElem = uILeftNavigationDiv.findElements(By.xpath("ul/li/ul/li/div/span[text()='" + screenTitle + "']"));
      int count = screenElem.size();
       for(WebElement element:screenElem)
       {
       	if(element.isDisplayed())
       	{
       		verify.ExpectedValueIsTrue(true);
       		verify.ExpectedIntergerValueIsEqualToActual(count, 2);
       	}
		
	}

}
	public void verifyAtScreenNotInFavorite(String screenTitle) {
		 WebElement uILeftNavigationDiv=Playback.driver.findElement(By.id("LeftNav"));
     List<WebElement> screenElem = uILeftNavigationDiv.findElements(By.xpath("ul/li/ul/li/div/span[text()='" + screenTitle + "']"));
     int count = screenElem.size();
     verify.ExpectedIntergerValueIsEqualToActual(count, 1);
   
}
}
