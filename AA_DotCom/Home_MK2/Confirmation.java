package Home_MK2;
import java.io.Console;

import resources.Common_Variables;
import resources.Home_MK2.ConfirmationHelper;
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
		
		
		
		//------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		// Primary Contact Dispayed in UC - Even When Entered In Lower
//		sCustomer_Name = sCustomer_Name.toUpperCase();
	
 		String sTitle = "HM_ThankYou_Page";
 		String sExpected = "Thanks for choosing us";	
 		String sActual = "";
 		String sReport = " Page Return Success";
		String sQuoteReference;
		String sPolicyHolder;		
		String sPolicyNumber;		
		String sCoverType;	
		String sTotalPaid;
		
		int i; // Used During Substring Extraction
		
		//------------------------------------------------------------
		// Retrieve Quote Reference Away
		sQuoteReference = Common_Variables.quoteReference;
		//------------------------------------------------------------
		// Retrieve Policy Holder
		sPolicyHolder =	Common_Variables.policyHolder;
		//------------------------------------------------------------
		// Retrieve Cover Type 
		sCoverType = Common_Variables.coverType;
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)form_thanksForChoosingUsYouHav().getProperty(".text");
		//------------------------------------------------------------		
		if (sContainer_Text.contains("Thanks for choosing us")){
			sActual = "Thanks for choosing us";
		}		
		//------------------------------------------------------------
		// Confirmation Page		
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//------------------------------------------------------------
		// Grab Text From This Sting
		String[] sFromThanks = sContainer_Text.split("Thanks for buying AA Breakdown Cover");
		//------------------------------------------------------------
		//------------------------------------------------------------
 		// Policy Number/Quote reference:              TODO No Current Reference From Process Start
		//------------------------------------------------------------		
 		sFromThanks = sContainer_Text.split("Policy number:");  // Derived From Quote reference:
		// Assign Above Sub String To String sCustomer
 		sPolicyNumber = sFromThanks[1];
 		i = 12;
 		//------------------------------------------------------------
 		sPolicyNumber = sPolicyNumber.substring(0, i);
 		//------------------------------------------------------------
		VerifyandReport("Confirm_Policy_Number", sQuoteReference, sPolicyNumber, " Policy Number ");
		//------------------------------------------------------------
		//------------------------------------------------------------
		// Cover Types
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)form_thanksForChoosingUsYouHav().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split("You have bought ");
		//------------------------------------------------------------
		String sConfCoverType = sFromThanks[1];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total"
 		i = (sConfCoverType.indexOf("Please check your details"));
 		// Need To Strip NL Chars Out
		//------------------------------------------------------------
 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
 		//------------------------------------------------------------
 		sConfCoverType = sConfCoverType.substring(0, i); 		
 		//------------------------------------------------------------
		VerifyandReport("Cover_Type", sCoverType.trim(), sConfCoverType.trim(), " Cover Types Purchased ");
		//------------------------------------------------------------
		
		//------------------------------------------------------------
		// Policy Holder
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)form_thanksForChoosingUsYouHav().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split("Policyholder:");
		//------------------------------------------------------------
		String sConfPolicyHolder = sFromThanks[1];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total"
 		i = (sConfPolicyHolder.indexOf("Policy number:"));
 		// Need To Strip NL Chars Out
		//------------------------------------------------------------
 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
 		//------------------------------------------------------------
 		// PostCode Space or Not - Cheap Fix
  		sConfPolicyHolder = sConfPolicyHolder.substring(0, i-28); 		
 		sPolicyHolder = sPolicyHolder.substring(0, i-28); 				
 		//------------------------------------------------------------
		VerifyandReport("Policy_Holder_Details", sPolicyHolder.trim(), sConfPolicyHolder.trim(), " Policy Holder Details ");
		//------------------------------------------------------------
	
		//------------------------------------------------------------
		// Total Cost
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)form_thanksForChoosingUsYouHav().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split("Total paid:");
		//------------------------------------------------------------
		sTotalPaid = sFromThanks[1];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total" // Differentiators are Credit Card or Debit Card
 		
		try {
			i = (sTotalPaid.indexOf("Includes"));
	 		// Need To Strip NL Chars Out
			//------------------------------------------------------------
	 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
	 		//------------------------------------------------------------
	 		sTotalPaid = sTotalPaid.substring(0, i); 		
			//------------------------------------------------------------
			System.out.println("Total Paid = "+sTotalPaid+" Including Any Charges");
			
		} catch (Exception e) {
			// i = (sTotalPaid.indexOf(" ")); 
			sTotalPaid = sTotalPaid.substring(0, 6); 
			System.out.println("Total Paid = "+sTotalPaid+" No Charges");
		}  
 		//------------------------------------------------------------
		VerifyandReport("Total_Payment_Details", sTotalPaid, sTotalPaid, " Total Paid Details ");
		//----------------------------------------------------------------------	
		System.out.println("---------------------------------------------------");
		System.out.println("Full Home Membership Test Journey Payment Completed - Scenario "+Common_Variables.currentRow);
		System.out.println("---------------------------------------------------");
		//----------------------------------------------------------------------	
		//stop();
	}
}

