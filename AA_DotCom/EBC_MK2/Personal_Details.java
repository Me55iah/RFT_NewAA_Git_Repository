package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.Personal_DetailsHelper;
import com.rational.test.ft.*;

import Utilities.Portal_Synchronisation;
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
//Uplift of EBC - Dave Horne - December 2014 - PERSONAL DETAILS SCREEN (Step 4)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Personal_Details extends Personal_DetailsHelper
{
	/**
	 * Script Name   : <b>Your_Details</b>
	 * Generated     : <b>5 Dec 2014 09:52:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
		
	public void testMain(Object[] args) 
	{
		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********
		
		//(Common_Variables.proposerTitle) = "Miss";
		//(Common_Variables.proposerForename) = "Donald";
		//(Common_Variables.proposerLastname) = "Tiatest";
		//(Common_Variables.proposerDOB) ="26111956";
		// (Common_Variables.addressLine1) = "";      // Address DP not Utilised
		//(Common_Variables.lightQuotePrice) = "";
		//(Common_Variables.fullQuotePrice) = "";
		//(Common_Variables.partsLabourQuotePrice) = "";
		
		// ********************      Debug Test Data End     ***************************	

		
		//--------------------------------------------------------------------
		// Synchronisation
		form_customerDetails(ANY, LOADED).waitForExistence(50.0, 0.25);

		//--------------------------------------------------------------------
		// Proposer Title
		switch (Common_Variables.proposerTitle){
		
			case "Mr":
				title_mr(ANY, READY).click();
				break;
				
			case "Mrs":
				title_mrs(ANY, READY).click();
				break;
				
			case "Miss":
				title_miss(ANY, READY).click();
				break;
				
			case "Ms":
				title_ms(ANY, READY).click();
				break;
		}
		//--------------------------------------------------------------------
		// Proposer First Name
		firstname().waitForExistence(10.0,  0.25);
		firstname(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(Common_Variables.proposerForename);
		
		//--------------------------------------------------------------------
		// Proposer Last Name
		surname().waitForExistence(10.0,  0.25);
		surname(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(Common_Variables.proposerLastname);
	
		//--------------------------------------------------------------------
		// Proposer Date of Birth
		// DAY
		String dobDay = Common_Variables.proposerDOB.substring(0, 2);
		html_dateOfBirthDay().waitForExistence(10.0,  0.25);
		html_dateOfBirthDay(ANY, READY).click();
		iE(ebc(),DEFAULT_FLAGS).inputChars(dobDay);
		//--------------------------------------------------------------------
		// Proposer Date of Birth
		// MONTH
		String dobMonth = Common_Variables.proposerDOB.substring(2, 4);
		html_dateOfBirthMonth().waitForExistence(10.0,  0.25);
		html_dateOfBirthMonth(ANY, READY).click();
		iE(ebc(),DEFAULT_FLAGS).inputChars(dobMonth);
		//--------------------------------------------------------------------
		// Proposer Date of Birth
		// YEAR
		String dobYear = Common_Variables.proposerDOB.substring(4);
		html_dateOfBirthYear().waitForExistence(10.0,  0.25);
		html_dateOfBirthYear(ANY, READY).click();
		iE(ebc(),DEFAULT_FLAGS).inputChars(dobYear);
		
		//--------------------------------------------------------------------
		// Under Age Checks
		if (Common_Variables.proposerDOB.equals("30121999")){
			String sUnderAge = (String)unableToOffer().getProperty(".contentText");
			if (sUnderAge.equalsIgnoreCase("Sorry, we are unable to offer this product to anyone under the age of 17")){
				logTestResult("Under 17 Customer Entry Was Detected Successfully", true);
				// Correct the date
				iE(ebc(),DEFAULT_FLAGS).inputKeys("{BKSP 4}");
				iE(ebc(),DEFAULT_FLAGS).inputKeys("1960");		
				vpManual("Under_Age_Driver_Detection", "17","17").performTest();	
			}
		}
		
		//--------------------------------------------------------------------
		// Address Number
		address_lineOne().waitForExistence(10.0,  0.25);
		address_lineOne(ANY, READY).click(atPoint(79,21));
		iE(ebc(),DEFAULT_FLAGS).inputChars("28");
		//--------------------------------------------------------------------
		// Address Postcode
		address_postcode().waitForExistence(10.0,  0.25);
		address_postcode(ANY, READY).click(atPoint(41,28));
		iE(ebc(),DEFAULT_FLAGS).inputChars("RG248GB");
		//--------------------------------------------------------------------
		// Search Address
		find_Address_submit().waitForExistence(25.0,  0.25);
		find_Address_submit(ANY, READY).click();
		//--------------------------------------------------------------------
		// Synch
		address_county().waitForExistence(25.0,  0.25);
		sleep(2.0);

/*		// Pre-Populated by Lookup                     Left Here For Reference
		//--------------------------------------------------------------------
		// Address Road/Street
		address_lineTwo(ANY, READY).click(atPoint(77,22));
		iE(ebc(),DEFAULT_FLAGS).inputChars("Belvedere Gardens");
		//--------------------------------------------------------------------
		// Address Town/City
		address_townOrCity(ANY, READY).click(atPoint(49,13));
		iE(ebc(),DEFAULT_FLAGS).inputChars("Basingstoke");
		//--------------------------------------------------------------------
		// Address County
		address_county(ANY, READY).click(atPoint(44,19));
		iE(ebc(),DEFAULT_FLAGS).inputChars("Hampshire");
		// Pre-Populated                         Left Here For Reference
		//--------------------------------------------------------------------
*/		
		//--------------------------------------------------------------------	
		// Email
		email().waitForExistence(10.0,  0.25);
		email(ANY, READY).click(atPoint(139,17));
		iE(ebc(),DEFAULT_FLAGS).inputChars("test@tiatest.com");
		//--------------------------------------------------------------------
		// Telephone		
		html_telephone().waitForExistence(10.0,  0.25);
		html_telephone(ANY, READY).click(atPoint(100,19));
		iE(ebc(),DEFAULT_FLAGS).inputChars("01234567890");
		
		//--------------------------------------------------------------------
		// Payment Options For ANNUAL are Different To SINGLE (Single - Card Only)
		//--------------------------------------------------------------------
		// Payment Type
		switch (Common_Variables.paymentType){
		
			case "Annual Direct Debit":				
				annualDirectDebit(ANY, READY).click();
				break;
				//--------------------------------------
			case "Annual Card Payment":
				annualCardPayment(ANY, READY).click();
				break;
				//--------------------------------------
			case "One Off Card Payment":  // DEFAULT VALUE
				oneOffCardPayment(ANY, READY).click();
				break;
		}
		//--------------------------------------------------------------------		
		
		// Commit		
		continue_submit(ANY, LOADED).waitForExistence(25.0, 0.25);
		continue_submit(ANY, LOADED).click();
		
		//--------------------------------------------------------------------
		 
		
		
	}
}


