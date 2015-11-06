package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Policy_ResampleHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Policy_Resample extends Policy_ResampleHelper
{
	/**
	 * Script Name   : <b>Policy_Resample</b>
	 * Generated     : <b>18 May 2015 08:55:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/18
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-------------------------------------------------------------------------------------------
		// Initial Returned Quote View Is Of The Old Form - Resampling Updates The Browser View With
		// The Newer Technology
		//------------------------------------------------------------------------------------------
		// Navigate Change Quote Type Link (Combined - Default, Contents or Building) BUILDING
		link__Change().waitForExistence(10, 0.25);
		link__Change(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Select BUILDING
		radioButton_insurancetypeBuild().waitForExistence(10, 0.25);
		radioButton_insurancetypeBuild(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Select CONTENTS
		radioButton_insurancetypeConte().waitForExistence(10, 0.25);
		radioButton_insurancetypeConte(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Select COMBINED
		radioButton_insuranceCombined().waitForExistence(10, 0.25);
		radioButton_insuranceCombined(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Submit
		button_getAQuotesubmit().waitForExistence(10, 0.25);
		button_getAQuotesubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------	
		BrowserSync();		
		//------------------------------------------------------------------------------------------	
		// Exit If Conditions Allow
		//------------------------------------------------------------------------------------------	
//		// Set Daytime Phone - Click Field
//		if (!html_daytime().exists()){
//			return;
//		}
		//------------------------------------------------------------------------------------------	
		// Set Daytime Phone - Click Field
		html_daytime().waitForExistence(10, 0.25);
		html_daytime(ANY, READY).click(atPoint(94,6));
		//------------------------------------------------------------------------------------------		
		// Set Daytime Phone  
		html_daytime().waitForExistence(10, 0.25);
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("0123456789");
		//------------------------------------------------------------------------------------------		
		// Set Mobile Phone - Click Field
		html_mobile().waitForExistence(10, 0.25);
		html_mobile(ANY, READY).click(atPoint(89,3));
		//------------------------------------------------------------------------------------------		
		// Set Mobile Phone 
		html_mobile().waitForExistence(10, 0.25);
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("07788123456");
		//------------------------------------------------------------------------------------------		
		// Set EMAIL - Click Field
		text_email().waitForExistence(10, 0.25);
		text_email(ANY, READY).click(atPoint(88,9));
		//------------------------------------------------------------------------------------------		
		// Set EMAIL  
		text_email().waitForExistence(10, 0.25);
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("tiatest@theaa.com");		
		//------------------------------------------------------------------------------------------
		// Re-Select Number Of Bedroom For Contents Only Quote
		switch (Common_Variables.xmlNumberofBedrooms){
			
			case "One":
				
				radioButton_noofbedroomS1(ANY, READY).click();
				logInfo(" 1 Bedroom Selected ");
				break;
				
			case "Two":
				radioButton_noofbedroomS2(ANY, READY).click();
				logInfo(" 2 Bedrooms Selected ");
				break;
				
			case "Three":
				radioButton_noofbedroomS3(ANY, READY).click();
				logInfo(" 3 Bedrooms Selected ");
				break;
				
			case "Four":
				radioButton_noofbedroomS4(ANY, READY).click();
				logInfo(" 4 Bedrooms Selected ");
				break;
			
			case "Five":
				radioButton_noofbedroomS5(ANY, READY).click();
				logInfo(" 5 Bedrooms Selected");
				break;
		}
		
		//------------------------------------------------------------------------------------------
		// Toggle Include Building
		radioButton_includeBuildingADY().waitForExistence(10, 0.25);
		radioButton_includeBuildingADY(ANY, READY).click();
		radioButton_includeBuildingADN(ANY, READY).click();		
		//------------------------------------------------------------------------------------------
		// Toggle Claim Should Exist
		radioButton_claimsShouldExistY().waitForExistence(10, 0.25);
		radioButton_claimsShouldExistY(ANY, READY).click();
		radioButton_claimsShouldExistN(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Confirm
		button_getAQuotesubmit2().waitForExistence(10, 0.25);
		button_getAQuotesubmit2(ANY, READY).click();
		BrowserSync();
		//------------------------------------------------------------------------------------------
		// Submit
		button_getQuotesubmit().waitForExistence(10, 0.25);
		button_getQuotesubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		BrowserSync();		
		//------------------------------------------------------------------------------------------
		// Trigger POPUP Window
//		callScript("Utilities.Home_Annual_Selector");
//		callScript("Utilities.Home_Monthly_Selector");
		callScript("Utilities.Home_Premium_Selection");
		callScript("Utilities.Home_Standard_Selection");
		//------------------------------------------------------------------------------------------
		sleep(2);
		if (html_endorsementsOverlay().exists()){
			image_close().waitForExistence(20, 0.25);
			try {
				image_close(ANY, READY).click();
			} catch (Exception e) {
				// ignore
			}
		}
		//------------------------------------------------------------------------------------------
		BrowserSync();
		// callScript("Utilities.IE11_Page_Loaded");

	}
}

