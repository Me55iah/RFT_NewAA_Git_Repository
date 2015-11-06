package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Verify_Home_Combination_QuoteHelper;
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
public class Verify_Home_Combination_Quote extends Verify_Home_Combination_QuoteHelper
{
	/**
	 * Script Name   : <b>Verify_Home_Quote</b>
	 * Generated     : <b>30 Mar 2015 14:02:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//------------------------------------------------------
		logInfo(" START OF Common Value Tests For Buildings & Contents Quote");
		// Check Common Values Remain The Same For Monthly And Annual Quotes
		Common_Variables.xmlInsuranceType = "1"; // Combi
		Common_Variables.xmlPaymentOption = "Annual";
		// Verify Common Content
		// Check For Annual Setting
		label_annualPayment().waitForExistence(10,  0.25);
		label_annualPayment(ANY, READY).click();
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// 1st Iteration For Annual
		callScript("Aggregators.Home.Verify_Home_Common_Content");

		//------------------------------------------------------
		// Check Annual Prices
		// TODO
		callScript("Aggregators.Home.Verify_Home_Annual_Prices");

		//------------------------------------------------------
		
		//------------------------------------------------------
		// Check For Monthly Setting
		Common_Variables.xmlPaymentOption = "Monthly";
		label_payMonthly().waitForExistence(10,  0.25);
		label_payMonthly(ANY, READY).click();
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// 2nd Iteration For Monthly
		callScript("Aggregators.Home.Verify_Home_Common_Content");
		//------------------------------------------------------
		logInfo(" END OF Common Value Tests For Buildings & Contents Quote");
		//------------------------------------------------------
		
		//------------------------------------------------------
		// Check Monthly Prices
		// TODO
		callScript("Aggregators.Home.Verify_Home_Monthly_Prices");

		//------------------------------------------------------
		//Object done;
		BrowserSync();
//		
//		// Excess Amounts Carried From Previous Screen (pre-view tweek)
//		// fps = From Previous Screen
//		//String sExcessTotal_fps = Common_Variables.policyTotalExcess;
//		//String sExcessVoluntary_fps = Common_Variables.policyVoluntaryExcess;
//		//String sExcessCompulsory_fps = Common_Variables.policyCompulsoryExcess;
//		
//		// SELECT MONTH then YEAR - TO CHECK ALL PARAMETERS (DEFAULT SETTING - BUT DO ANYHOW)
//		label_payMonthly().waitForExistence(10,  0.25);
//		label_payMonthly(ANY, READY).click();
//		// SELECT MONTH then YEAR - TO CHECK ALL PARAMETERS		
//		
//		String[] sPH = null;
//		
//		// Test Data - Append Name Components For Later Compare Of Screen Name 
//		String sPolicyHolderName = (Common_Variables.proposerTitle+" "+Common_Variables.proposerForename+" "+Common_Variables.proposerLastname);
//		//---------------------------------
//		// Count The Total Number Of CHARS in The Concantonated String
//		int i = (sPolicyHolderName.length());i = i+2;   // Offset For 2 Spaces?
//		//------------------------------------------------------
//		// Record QUOTE REFERENCE Number/ID
//		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
////		String sPriceSection = (String)html_priceSection().getProperty(".contentText");
//		String sQuoteReferenceMain = (String)html_main().getProperty(".contentText");
//
//		//-----------------
//		String[] sQR = sQuoteReferenceID.split("Quote reference");
//		String sSQ1 = sQR[1]; String sReference = sSQ1.substring(0, 18); 
//		//-----------------
//		// Capture Intermediate Quote Reference For Late Comparison - Quote Reference
//		// Is Saved To The Data Pool In The Final Creation Process
//		Common_Variables.intermediateQuoteReference = sSQ1;
//		System.out.println("Your Quote Reference is .... "+sReference);
//		System.out.println("--------------------------------------------------");// 
//		//--------------------------------------------------------------------------
//		sReference = sReference.trim(); // remove blankety blanks
//		VerifyandReport("Quote_Reference", Common_Variables.xmlQuoteReference.trim(), sReference.trim(), " Home Insurance Reference Quote Number ");		
//		// Capture QUOTE DETAILS (RH Central Pane) String Data
//		String sQuoteDetails = (String)html_aside().getProperty(".contentText");
//		// Grab All String Data After "Quote details" Text In RH Pane Of Quote Detail Window
//		System.out.println(sQuoteDetails);// 
//		String[] sQD = sQuoteDetails.split("Quote details");
//		//--------------------------------------------------------------------------
//		// Affinity
//		i = (Common_Variables.xmlAffinity.length());
//		//-----------------
//		String[] sAf = sQuoteDetails.split("Thanks for getting a quote through"); //("Thank you for getting a quote through"); motor
//		String sSAf = sAf[1]; String sAffinity = sSAf.substring(0, i+1); 
//		//-----------------
//		sAffinity=sAffinity.substring(0,1).toUpperCase()+sAffinity.substring(1, sAffinity.length());
//		// Affinity
//		VerifyandReport("Affinity_Combination_Quote_Provider", Common_Variables.xmlAffinity.trim(), sAffinity.trim(), " Affinity Combination Quote Provider ");
//		//--------------------------------------------------------------------------
//		/// Home Insurance SubType Cover type: Buildings & Contents 
//		
//		//Quote reference
//
//		 
//		//WW1HT1272LHP
//
//		//Quote details
//
//		//...change
//
//		//Cover type: Buildings & Contents 

		
	}
}

