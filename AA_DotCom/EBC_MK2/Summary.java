package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.SummaryHelper;
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
//Uplift of EBC - Dave Horne - December 2014 - SUMMARY DETAILS SCREEN (Step 5)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Summary extends SummaryHelper
{
	/**
	 * Script Name   : <b>Summary</b>
	 * Generated     : <b>23 Dec 2014 09:44:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2014/12/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Debug Test Data Start   **** COMMENT I AND OUT AS REQUIRED ****
		
//		(Common_Variables.totalQuotePrice) = "389.31";
		
//		(Common_Variables.coverType) = "Annual";
//		(Common_Variables.paymentType) = "Annual";
		// ********************      Debug Test Data End     ***************************	
		
		BrowserSync();
		
		//------------------------------------------------------------------------------------------
		// Synchronise
		html_totalPrice(ANY, LOADED).waitForExistence(50, 0.25);
		sleep(2);
		//------------------------------------------------------------------------------------------
		// Verification to be completed
		// if (Common_Variables.priceToPay.equals(sTotalQuotePrice)){
		
		String sTotalQuotePrice = (String) html_totalPrice().getProperty(".text");		
		sTotalQuotePrice = sTotalQuotePrice.substring(1);                          // Scrape the Squid £
		
		if (Common_Variables.paymentType.contains("Annual")){              // 8 Squid Charge
			if (Common_Variables.priceToPay.equals(sTotalQuotePrice)){     // Was Price To Pay
				logTestResult("The Total Quote as Reported on The Summary Page (Including Annual Charges), is "+sTotalQuotePrice+" " +
						"As Expected", true);
			
			}
			else {
				logTestResult("The Total Quote as Reported on The Summary Page (Including Annual Charges) Should Be" +
						" "+Common_Variables.priceToPay+" But "+sTotalQuotePrice+" Was Reported", false);
						//stop();
			
			}
		}
	                           // SEEMS TO BE AN ISSUE WITH ANNUAL PAYMNT CHARGE NOW - BOTH BRANCHES ARE THE SAME
		
		if (Common_Variables.paymentType.contains("One")){					// No Extra Charge
			if (Common_Variables.totalQuotePrice.equals(sTotalQuotePrice)){
			logTestResult("The Total Quote as Reported on The Summary Page, is "+sTotalQuotePrice+" " +
					"As Expected", true);
			}
			else {
				logTestResult("The Total Quote as Reported on The Summary Page Should Be" +
						" "+Common_Variables.totalQuotePrice+" But "+sTotalQuotePrice+" Was Reported", false);
			}
		}


		//------------------------------------------------------------------------------------------
		// Terms and Conditions		
		checkBox_termson(ANY, READY).click();		
		//------------------------------------------------------------------------------------------
		// Synchronise
		button_payNowsubmit(ANY, LOADED).waitForExistence(20, 0.25);
		//------------------------------------------------------------------------------------------
		// Pay Now
		button_payNowsubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		// Checking For Defect Where Previous Vehicle lookups Stops Navigation To Payment Page - Hit Submit has No Effect
		
		String sStepNumber = null;
		
		if (link_menu().exists()){
			sStepNumber = (String)link_menu().getProperty(".text");
			if (sStepNumber == "Step 5 of 7"){
				// The Page Navigation Failed - Should Have Moved To Step 6 Of 7
				logTestResult(" Page Navigation Failed From Summary To Make Payment Page", false);
				System.out.println(" Page Navigation Failed From Summary To Make Payment Page");
				stop();
				
			}

		}
		

	}
}

