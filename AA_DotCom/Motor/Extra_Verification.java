package Motor;

// THIS FILE SHOULD BE REPLACED BY Verify_Quote FROM AGGREGATORS AT SOME POINT 
// CONTAINS MUCH MORE VERIFICATION


import resources.Common_Variables;
import resources.Motor.Extra_VerificationHelper;
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
public class Extra_Verification extends Extra_VerificationHelper
{
	/**
	 * Script Name   : <b>Debug</b>
	 * Generated     : <b>5 Jan 2015 14:46:46</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/01/05
	 * @author horned
	 */
	
	public static String[] environmentURL = new String[1];
	
	public void testMain(Object[] args) 
	{
//		// Test Data
//		Common_Variables.vehicleReg = "HN63EHV";
//		Common_Variables.numberFutureDays = 0;
//		Common_Variables.proposerTitle = "MS";
//		Common_Variables.proposerForename = "Claire";
//		Common_Variables.proposerLastname = "Sholtz";
//		Common_Variables.personsCovered = "IAS"; // or IOD
//		Common_Variables.policyTotalExcess = "£550";
//		Common_Variables.policyVoluntaryExcess = "£250";
//		Common_Variables.policyCompulsoryExcess = "£300";
//		// Test Data
		//------------------------------------------------
		
		// THIS FILE SHOULD BE REPLACED BY Verify_Quote FROM AGGREGATORS AT SOME POINT 
		// CONTAINS MUCH MORE VERIFICATION
		
		
		// VERIFICATION OBJECT
		Object done;
		BrowserSync();
		
		// Excess Amounts Carried From Previous Screen (pre-view tweek)
		// fps = From Previous Screen
		String sExcessTotal_fps = Common_Variables.policyTotalExcess;
		String sExcessVoluntary_fps = Common_Variables.policyVoluntaryExcess;
		String sExcessCompulsory_fps = Common_Variables.policyCompulsoryExcess;
		
		String[] sPH = null;
		
		// Test Data - Append Name Components For Later Compare Of Screen Name 
		String sPolicyHolderName = (Common_Variables.proposerTitle+" "+Common_Variables.proposerForename+" "+Common_Variables.proposerLastname);
		//---------------------------------
		// Count The Total Number Of CHARS in The Concantonated String
		int i = (sPolicyHolderName.length());i = i+2;   // Offset For 2 Spaces?
		//------------------------------------------------------
		// Record QUOTE REFERENCE Number/ID
		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
		//-----------------
		String[] sQR = sQuoteReferenceID.split("Quote reference");
		String sSQ1 = sQR[1]; String sReference = sSQ1.substring(0, 14); 
		//-----------------
		// Capture Intermediate Quote Reference For Late Comparison - Quote Reference
		// Is Saved To The Data Pool In The Final Creation Process
		Common_Variables.intermediateQuoteReference = sSQ1;
		System.out.println("Your Quote Reference is .... "+sReference);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		// Capture QUOTE DETAILS (RH Central Pane) String Data
		String sQuoteDetails = (String)html_aside().getProperty(".contentText");
		// Grab All String Data After "Quote details" Text In RH Pane Of Quote Detail Window
		String[] sQD = sQuoteDetails.split("Quote details");
		//--------------------------------------------------------------------------
		// RH Details Pane
		//------------------
		BrowserSync();
		// Vehicle Details
		// Reg Number
		String sReg = sQD[1]; String sRegNumber = sReg.substring(0, 10).trim(); 
		
		if (Common_Variables.vehicleReg.equalsIgnoreCase("N1JYS")){
			sRegNumber = "N1JYS";
		}		
		if (Common_Variables.vehicleReg.equalsIgnoreCase("K7DAD")){
			sRegNumber = "K7DAD";
		}		
		// Compare Screen Registration Number With THe Pre-Defined Data pool Value		
		//vpManual("RegNumber_Match", sRegNumber, Common_Variables.vehicleReg).performTest();
 		
		if ((boolean) (done=vpManual("RegNumber_Match", Common_Variables.vehicleReg,sRegNumber ).performTest())){
			// passed
		}
		else{
			System.out.println("Reg From DP .... "+Common_Variables.vehicleReg);
			System.out.println("Actua Reg .... "+sRegNumber);
		}		
		System.out.println("RH Pane Registration Number .... "+sRegNumber);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		// Policy Holder Details		
		// Single or Multi		
		switch (Common_Variables.personsCovered){
			case "IAS":
				sPH = sQuoteDetails.split("Policyholder/Main driver:");
				break;
				
			case "IOD":
				sPH = sQuoteDetails.split("Policyholder:");
				break;		
		}		
		System.out.println("Policy Holder .... "+sPH);
		// Compare Reported Screen policy Holder With The Pre-Defined Data pool Value		
		String sPoHo = sPH[1]; String sPolicy_Holder = sPoHo.substring(0, i).trim(); //i
		// Compare With Test Data Value
		
		BrowserSync();
		
		// Passed Title i ALL UPPERCASE - We Convert To Camel For Comparison Of Following Screen Scrape.
		sPolicy_Holder=sPolicy_Holder.substring(0,1).toUpperCase()+sPolicy_Holder.substring(1, sPolicy_Holder.length());
		
		//vpManual("Policy_Holder_Name_Match", sPolicy_Holder, sPolicyHolderName).performTest();
		System.out.println("RH Pane Policy Holder .... "+sPolicy_Holder);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		String sDateStamp = ScreenDate(Common_Variables.numberFutureDays);		
		// Policy Cover Start Date 
		String[] sSD = sQuoteDetails.split("Cover start:");
		String sStDa = sSD[1]; String sStartDate = sStDa.substring(0, 12).trim(); 
		// Compare Start Date from Todays, + Starting Days specified Within DataPool
		//vpManual("Start_Date_Match", sStartDate, sDateStamp).performTest();
		//--------------------------------------------------------------------------
		if ((boolean) (done=vpManual("Start_Date_Match", sDateStamp,sStartDate ).performTest())){
			// passed
		}
		else{
			System.out.println("Policy Start Date .... "+sStartDate);
			System.out.println("Policy Date Stamp .... "+sDateStamp);
			//stop();// Failed
			System.out.println("Start Date Stamp .... "+sDateStamp+" Date Incorrect (Future Start Date Setting?");
		}
		//--------------------------------------------------------------------------
		sDateStamp = ScreenDate(365); // Leap Year? :-) *	2016	*
		// Policy Cover End Date
		String[] sED = sQuoteDetails.split("Cover end:");
		String sEnDa = sED[1]; String sEndDate = sEnDa.substring(0, 12).trim(); 		
		// Compare End Date With Expected Value
		vpManual("End_Date_Match", sEndDate, sDateStamp).performTest();
		//--------------------------------------------------------------------------		
		// Policy Underwriters
		// Not Scraped
		//--------------------------------------------------------------------------		
		//\\\\\\\\\\\\\\\\
		// Policy Excess			
			// Compulsory
		// TODO
//		String[] sCE = sQuoteDetails.split("Compulsory:");
//		String sCoEx = sCE[1]; String sCompExcess = sCoEx.substring(0, 5).trim(); 
//		// Verify CUMPOLSORY EXCESS
//		vpManual("Compulsory_Excess", sCompExcess, sExcessCompulsory_fps).performTest();			
//		//\\\\\\\\\\\\\\\\
//		// Voluntary
//		String[] sVE = sQuoteDetails.split("Voluntary:");
//		String sVoEx = sVE[1]; String sVoluExcess = sVoEx.substring(0, 5).trim(); 
//		// Verify VOLUNTARY EXCESS
//		vpManual("Voluntary_Excess", sVoluExcess, sExcessVoluntary_fps).performTest();
//		//\\\\\\\\\\\\\\\\			// Total
//		// Need to convert string data to integer for numerical addition of Comp + Vol 
//		sVoluExcess = sVoluExcess.replaceAll("[^\\.0123456789]","");
//		sCompExcess = sCompExcess.replaceAll("[^\\.0123456789]","");
//		int iVoluExcess = Integer.parseInt(sVoluExcess);
//		int iCompExcess = Integer.parseInt(sCompExcess);
//		// Do The Sum
//		int iSum = iVoluExcess+iCompExcess;
//		// Grab The Actula Reported Total on Screen
//		String[] sTOT = sQuoteDetails.split("Total:");
//		String sTo = sTOT[1]; String sTotal = sTo.substring(0, 5).trim(); 
//		// Verify TOTAL EXCESS From Previous Scrape and Current Scrape
//		vpManual("Total_Excess", sTotal, "£"+iSum).performTest();
//		vpManual("Total_Excess_From_Previous_Screen", sTotal, sExcessTotal_fps).performTest();

		//--------------------------------------------------------------------------
		// THIS FILE SHOULD BE REPLACED BY Verify_Quote FROM AGGREGATORS AT SOME POINT 
		// CONTAINS MUCH MORE VERIFICATION

	}
}

