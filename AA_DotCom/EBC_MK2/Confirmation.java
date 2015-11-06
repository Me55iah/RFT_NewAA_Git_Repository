package EBC_MK2;
import java.io.Console;

import resources.EBC_MK2.ConfirmationHelper;
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

////////////////////////////////////////////////////////////////////////////////////////
//
//Uplift of EBC - Dave Horne - December 2014 - FINAL PAYMENT CONFIRM SCREEN (Step 7)
//
////////////////////////////////////////////////////////////////////////////////////////


public class Confirmation extends ConfirmationHelper
{
	/**
	 * Script Name   : <b>Confirmation</b>
	 * Generated     : <b>24 Dec 2014 12:22:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2014/12/24
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------------
		// Verify SUCCESS of Journey
		// Grab policy Number and Report
		try {
			//----------------------------------------------------------------------				
			Payment_Confirmation().waitForExistence(20.0,  0.25);
			Payment_Confirmation().performTest(Journey_CompletionVP(), 0.25, 20.0);
			//----------------------------------------------------------------------				
			String sContentText = (String)Payment_Confirmation().getProperty(".contentText");		
			String string = sContentText;
			String[] parts = string.split("–");
			String part1 = parts[1]; 
			System.out.println(part1.substring(0, 34) );
			logTestResult(part1.substring(0, 34), true);
		} catch (Exception e) {
			logTestResult(" There Is A Problem WIth The CONFIRMATION Page - Quote Text Is NULL, Payment Gateway Issue or The Page Structure Changed?", false);
		
		}
		//----------------------------------------------------------------------	
		System.out.println("Test Journey Completed");
		System.out.println("---------------------------------------------------");
		
		//stop();
	}
}

