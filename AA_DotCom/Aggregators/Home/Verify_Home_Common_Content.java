package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Verify_Home_Common_ContentHelper;
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
public class Verify_Home_Common_Content extends Verify_Home_Common_ContentHelper
{
	/**
	 * Script Name   : <b>Verify_Home_Common_Content</b>
	 * Generated     : <b>7 May 2015 14:04:02</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/07
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// Common Content Across Buildings & Contents, Contents and Building ( IN RH QUOTE PANE )
		//---------------------------------------------------------------------------------------
		// FOR MONTHLY AND ANNUAL QUOTES
		// 
		String sInsType = Common_Variables.xmlInsuranceType;
		String sCoverType = "";
		String sPaymentOption = Common_Variables.xmlPaymentOption;
		//------------------------------------------------------------------------------------------
		// 
		// Type Normalisation
		switch (sInsType){
			
			case "1":
				sInsType = "Combined";
				sCoverType = "Buildings & Contents"; // For Verification on HMI
				break;
				
			case "2":
				sInsType = "Contents";
				sCoverType = sInsType; // For Verification on HMI
				break;
				
			case "3":
				sInsType = "Building";
				sCoverType = "Buildings"; // For Verification on HMI
			break;
		}

		
		//---------------------------------------------------------------------------------------
		// COMMON DETAILS AS PER XML - Quote  Reference - Insurance Affinity and Insurance SubType (B&C, Contents or Building(s)
		// TO RH Pane Of Quote Page
		//---------------------------------------------------------------------------------------
		
		//Object done;
		BrowserSync();
				
		// SELECT MONTH then YEAR - TO CHECK ALL PARAMETERS (DEFAULT SETTING - BUT DO ANYHOW)
		label_payMonthly().waitForExistence(10,  0.25);
		label_payMonthly(ANY, READY).click();
		// SELECT MONTH then YEAR - TO CHECK ALL PARAMETERS		
		
		String[] sPH = null;
		
		// Test Data - Append Name Components For Later Compare Of Screen Name 
		String sPolicyHolderName = (Common_Variables.proposerTitle+" "+Common_Variables.proposerForename+" "+Common_Variables.proposerLastname);
		//---------------------------------
		// Count The Total Number Of CHARS in The Concantonated String
		int i = (sPolicyHolderName.length());i = i+2;   // Offset For 2 Spaces?
		//------------------------------------------------------
		// Record QUOTE REFERENCE Number/ID IN RH QUOTE PANE
		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
//		String sPriceSection = (String)html_priceSection().getProperty(".contentText");
		String sQuoteReferenceMain = (String)html_main().getProperty(".contentText");

		//-----------------
		String[] sQR = sQuoteReferenceID.split("Quote reference");
		String sSQ1 = sQR[1]; String sReference = sSQ1.substring(0, 18); 
		//-----------------
		// Capture Intermediate Quote Reference For Late Comparison - Quote Reference
		// Is Saved To The Data Pool In The Final Creation Process
		Common_Variables.intermediateQuoteReference = sSQ1;
		System.out.println("Your Quote Reference is .... "+sReference);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		sReference = sReference.trim(); // remove blankety blanks
		VerifyandReport(sInsType+"_Quote_Reference", Common_Variables.xmlQuoteReference.trim(), sReference.trim(), sInsType+" Home Insurance Reference Quote Number ");		
		// Capture QUOTE DETAILS (RH Central Pane) String Data
		String sQuoteDetails = (String)html_aside().getProperty(".contentText");
		// Grab All String Data After "Quote details" Text In RH Pane Of Quote Detail Window
		System.out.println(sQuoteDetails);// 
		String[] sQD = sQuoteDetails.split("Quote details");
		//--------------------------------------------------------------------------
		// Affinity IN RH QUOTE PANE
		i = (Common_Variables.xmlAffinity.length());
		//-----------------
		String[] sAf = sQuoteDetails.split("Thanks for getting a quote through"); //("Thank you for getting a quote through"); motor
		String sSAf = sAf[1]; String sAffinity = sSAf.substring(0, i+1); 
		//-----------------
		sAffinity=sAffinity.substring(0,1).toUpperCase()+sAffinity.substring(1, sAffinity.length());
		// Affinity
		VerifyandReport(sPaymentOption+"_Affinity_"+sInsType+"_Quote_Provider", Common_Variables.xmlAffinity.trim(), sAffinity.trim(), (sPaymentOption+" Affinity "+sInsType+" Quote Provider "));
		//--------------------------------------------------------------------------
		/// Home Insurance SubType Cover type: Buildings & Contents IN RH QUOTE PANE
		
		i = (sCoverType.length());
		
		String[] sCT = sQuoteReferenceID.split("Cover type:");
		String sCT1 = sCT[1]; String sCover_Type = sCT1.substring(1, i+1); 

		// Compare Scraped and Reference Values
		VerifyandReport(sPaymentOption+"_Cover_Type_"+sInsType, sCoverType.trim(), sCover_Type.trim(), (sPaymentOption+" Insurance Type = "+sInsType));

		//--------------------------------------------------------------------------	
		
	}
}

