package Utilities;
import resources.Utilities.Card_Security_CheckHelper;
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
public class Card_Security_Check extends Card_Security_CheckHelper
{
	/**
	 * Script Name   : <b>Card_Security_Check</b>
	 * Generated     : <b>19 Jun 2015 08:55:56</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/19
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
 		try {
			String sTitle = "Security_Check_Page";
			String sExpected = "Card security check";	
			String sActual = "";
			String sReport = " Card Security Check";
			String sQuoteReference;
			int i; 

			
			//------------------------------------------------------------------------------------------
			BrowserSync();
			//------------------------------------------------------------------------------------------
			// DATUM For Following Verification
			// Grab ALL Text (String From html - Container
			String sContainer_Text = (String)html_mainPage().getProperty(".text");
			//------------------------------------------------------------		
			if (sContainer_Text.contains("Card security check")){
				sActual = "Card security check";
			}		
			//------------------------------------------------------------
			// Confirmation Page		
			VerifyandReport(sTitle, sExpected, sActual, sReport);
			//------------------------------------------------------------
			// Grab Text From This Sting
			// String[] sFromThanks = sContainer_Text.split("Thanks for buying AA Breakdown Cover");
			//------------------------------------------------------------------------------------------			
			// Commit
			button_submit().waitForExistence(10,  0.25);		
			button_submit(ANY, READY).click();
			//----------------------------------------------------------------------	
			BrowserSync();
			//------------------------------------------------------------------------------------------
		} catch (Exception e) {
			// If Not Card Payment, Then Just Ignore This Stage
		}
		
	}
}

