package Home_MK2;
import resources.Common_Variables;
import resources.Home_MK2.Pre_Payment_ConfirmationHelper;
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
public class Pre_Payment_Confirmation extends Pre_Payment_ConfirmationHelper
{
	/**
	 * Script Name   : <b>Pre_Payment_Confirmation</b>
	 * Generated     : <b>18 Jun 2015 09:19:44</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/18
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
//		// Test Data
//		String sCustomer_Name = "MR ANDREW TIAQMEBZHKD";
//		String sPricevalue = "£49.99";
//		
//		// Test Data
//		
//		//------------------------------------------------------------
		// Total Price Permeation Through Process
		String sPricevalue = Common_Variables.priceToPay;
		String sCustomer_Name = Common_Variables.full_Name;
		String sMembershipNumber = "";
		//------------------------------------------------------------
//		// Test Data  Scenario 17
//		sPricevalue = "£225.00";
//		sCustomer_Name = "Miss NIcolA TIavrpjgTmw"; // MISS NICOLA TIAVRPJGTMW
		
		// Test Data
		
		
		
		
		//------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		// Primary Contact Dispayed in UC - Even When Entered In Lower
//		sCustomer_Name = sCustomer_Name.toUpperCase();
	
 		String sTitle = "HM_Confirmation_Page";
 		String sExpected = "Confirmation and payment";	
 		String sActual = "";
 		String sReport = " Page Return Success";
		String sQuoteReference;
		int i; 
//		String[] stringData = new String[4];
//		
//		stringData[0] = "sAdditional_Members";
//		stringData[1] = "";
//		stringData[2] = "Additional members ";
//		stringData[3] = "Cover ";
//		
//		//  !!!!!!! MAKE THIS MORE COMPACT !!!!!!!  TODO
//		callScript("Verification.Mid_String", stringData);
//		
//		stop();
		
		//----------------------------------------------------------------------	
		BrowserSync();
		//----------------------------------------------------------------------	
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)form_paymentDetails().getProperty(".text");
		//------------------------------------------------------------		
		if (sContainer_Text.contains("Confirmation and payment")){
			sActual = "Confirmation and payment";
		}		
		//------------------------------------------------------------
		// Confirmation Page		
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//------------------------------------------------------------
		// Grab Text From This Sting
		String[] sFromThanks = sContainer_Text.split("Thanks for buying AA Breakdown Cover");
		//------------------------------------------------------------
 		// Quote reference:                          TODO No Current Reference From Process Start
		//------------------------------------------------------------	
		sleep(2);	
		
 		sFromThanks = sContainer_Text.split("Quote reference:");
		// Assign Above Sub String To String sCustomer
 		sQuoteReference = sFromThanks[1];
 		i = 12;
 		//------------------------------------------------------------
 		sQuoteReference = sQuoteReference.substring(0, i);
 		//------------------------------------------------------------
		VerifyandReport("Confirm_Quote_Reference", sQuoteReference, sQuoteReference, " Quote Reference ");
		//------------------------------------------------------------
		// Console Reporting
		System.out.println("Quote Reference = "+sQuoteReference); 
		//------------------------------------------------------------
		// Store Quote Reference Away
		Common_Variables.quoteReference = sQuoteReference;
 		
		//------------------------------------------------------------
		// Cover Types
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)form_paymentDetails().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split("Cover Type:");
		//------------------------------------------------------------
		String sCoverType = sFromThanks[1];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total"
 		i = (sCoverType.indexOf("Excess"));
 		// Need To Strip NL Chars Out
		//------------------------------------------------------------
 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
 		//------------------------------------------------------------
 		sCoverType = sCoverType.substring(0, i); 		
 		//------------------------------------------------------------
		System.out.println("Cover Types = "+sCoverType+"."); 
		//------------------------------------------------------------
		// Store Cover Type Away
		Common_Variables.coverType = sCoverType;
		
		//------------------------------------------------------------
		// Policy Holder
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)form_paymentDetails().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split("Policyholder:");
		//------------------------------------------------------------
		String sPolicyHolder = sFromThanks[1];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total"
 		i = (sPolicyHolder.indexOf("Quote reference:"));
 		// Need To Strip NL Chars Out
		//------------------------------------------------------------
 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
 		//------------------------------------------------------------
 		sPolicyHolder = sPolicyHolder.substring(0, i); 		
 		//------------------------------------------------------------
		System.out.println("Policy Holder = "+sPolicyHolder+"."); 
		//------------------------------------------------------------
		// Store Cover Type Away
		Common_Variables.policyHolder = sPolicyHolder;
		int iCurrentRow = Common_Variables.currentRow;
		//----------------------------------------------------------------------	
		System.out.println("---------------------------------------------------");
		System.out.println("Full Home Membership Test Journey Completed - Scenario "+iCurrentRow);
		System.out.println("---------------------------------------------------");
		//----------------------------------------------------------------------	
		 
//		//------------------------------------------------------------------------------------------
//		// Submit Payment
//		button_buyNowsubmit().waitForExistence(25.0,  0.25);
//		button_buyNowsubmit(ANY, READY).click();
//		//------------------------------------------------------------------------------------------
//		BrowserSync();
//		//------------------------------------------------------------------------------------------
//		boolean Secure = button_buyNowsubmit().exists();
//		if (Secure == true) {
//			button_buyNowsubmit(ANY, READY).click();}
//					
 		//------------------------------------------------------------------------------------------			
		// CheckBox T&C
		checkBox_termsAndConditionsCon().waitForExistence(10,  0.25);
		checkBox_termsAndConditionsCon(ANY, READY).click();
 		//------------------------------------------------------------------------------------------			
		// Commit
		button_nextsubmit().waitForExistence(10,  0.25);		
		button_nextsubmit(ANY, READY).click();
		//----------------------------------------------------------------------	
		BrowserSync();
		//----------------------------------------------------------------------	

		
	}
}

