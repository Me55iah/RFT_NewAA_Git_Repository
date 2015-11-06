package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Retrieve_Home_ContentsHelper;
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
public class Retrieve_Home_Contents extends Retrieve_Home_ContentsHelper
{
	/**
	 * Script Name   : <b>Retrieve_Home_Contents</b>
	 * Generated     : <b>6 May 2015 14:29:00</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/06
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------------------------------------------
		// Navigate Change Quote Type Link (Combined - Default, Contents or Building) - CONTENTS
		link__Change().waitForExistence(10, 0.25);
		link__Change(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Select CONTENTS
		callScript("Aggregators.Home.Type_Selector");
//		//-----------------;-------------------------------------------------------------------------				
//		// Select CONTENTS
//		radioButton_insurancetypeConte().waitForExistence(10, 0.25);
//		radioButton_insurancetypeConte(ANY, READY).click();
//		//------------------------------------------------------------------------------------------		
		// Get Quote
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

		// IS CTM
		// CTM? - Re-sample To Show Updated HMI for CONTENTS ONLY
		//
 		if (Common_Variables.xmlAffinity.contains("comparethemarket")){ //!
 			 
 			//------------------------------------------------------------------------------------------	
 			// Set Daytime Phone - Click Field
 			html_daytime().waitForExistence(100, 0.25);
 			html_daytime(ANY, READY).click(atPoint(94,6));
 			//------------------------------------------------------------------------------------------		
 			// Set Daytime Phone  
 			html_daytime().waitForExistence(10, 0.25);
 			browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).inputChars("0123456789");
 			//------------------------------------------------------------------------------------------		
 			// Set Mobile Phone - Click Field
 			html_mobile().waitForExistence(10, 0.25);
 			html_mobile(ANY, READY).click(atPoint(89,3));
 			//------------------------------------------------------------------------------------------		
 			// Set Mobile Phone 
 			html_mobile().waitForExistence(10, 0.25);
 			browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).inputChars("07788123456");
 			//------------------------------------------------------------------------------------------		
 			// Set EMAIL - Click Field
 			text_email().waitForExistence(10, 0.25);
 			text_email(ANY, READY).click(atPoint(88,9));
 			//------------------------------------------------------------------------------------------		
 			// Set EMAIL  
 			text_email().waitForExistence(10, 0.25);
 			browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).inputChars("tiatest@theaa.com");		
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
 			// Confirm
 			button_getAQuotesubmit2().waitForExistence(10, 0.25);
 			button_getAQuotesubmit2(ANY, READY).click();
 			BrowserSync();
 			//------------------------------------------------------------------------------------------
 		}
		
		//------------------------------------------------------------------------------------------
		// Submit
		button_getQuotesubmit().waitForExistence(10, 0.25);
		button_getQuotesubmit(ANY, READY).click();
		//------------------------------------------------------
		callScript("Aggregators.Home.Important_Info_Dialog");
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// callScript("Utilities.IE11_Page_Loaded");
		
	}
}

