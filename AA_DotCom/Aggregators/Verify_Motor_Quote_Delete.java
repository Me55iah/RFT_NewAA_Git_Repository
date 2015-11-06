package Aggregators;
import resources.Common_Variables;
import resources.Aggregators.Verify_Motor_Quote_DeleteHelper;
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
public class Verify_Motor_Quote_Delete extends Verify_Motor_Quote_DeleteHelper
{
	/**
	 * Script Name   : <b>Verify_Quote</b>
	 * Generated     : <b>26 Feb 2015 11:03:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//--------------------------------------------------------
//		// Test Data
//		Common_Variables.vehicleReg = "E30MER";
//		Common_Variables.numberFutureDays = 1;
//		Common_Variables.proposerTitle = "MR";
//		Common_Variables.proposerForename = "TESTERFIRSTNAME";
//		Common_Variables.proposerLastname = "TESTERLASTNAME";
//		Common_Variables.personsCovered = "IOD"; // or IOD / IAS
//		Common_Variables.policyTotalExcess = "300";
//		Common_Variables.policyVoluntaryExcess = "100";
//		Common_Variables.policyCompulsoryExcess = "200";
//		
//		Common_Variables.xmlQuoteReference = "WW1MT082R281";
//		Common_Variables.xmlAffinity = "comparethemarket.com";
//		
//		
//		Common_Variables.xmlPrice = "402.05";
//		Common_Variables.xmlTotalAmount = "441.01";
//		Common_Variables.xmlTotalAmountAddons = "";
//		Common_Variables.xmlInstalmentAmount = "36.55";      // same?
//		Common_Variables.xmlInstallmentAmountDeposit = "38.96";
//		Common_Variables.xmlInstallmentAmountDepositAddons = "";
//		Common_Variables.xmlInsurerName = "Acromas(AA)"; // s (AA)"; // (AA)";
//		Common_Variables.monthlyPrice = "36.55";      		// same?
//		Common_Variables.annualPremium = "389.60";
//		
//		
//		Common_Variables.intialDeposit = "41.68";
//		Common_Variables.elevenPayments = "£36.55";      	// same?
//		Common_Variables.totalCredit = "£402.05";
//		Common_Variables.totalPayable = "£441.01"; 
//		Common_Variables.carInsuranceAnnual = "£389.60";
//		Common_Variables.carInsuranceMonth = "£36.55";     	// same?
//		
//		Common_Variables.MLA = "2.44"; //"25.99 // 2.45
		//Common_Variables.
		//--------------------------------------------------------
		
		//Common_Variables.startDate = "";
		
		//String sPolicyHolder = Common_Variables.proposerTitle+" "+Common_Variables.proposerForename+" "+Common_Variables.proposerLastname;
		// Test Data
//		//-----------------------------------------------------------------------------------------------------------------------------------
//		// Save TO Common Variables
//		String sXML_QuoteReference = Common_Variables.xmlQuoteReference;
//		String sXML_QuoteReference_Addons = Common_Variables.xmlQuoteReferenceAddons;
//		String sAf = Common_Variables.affinity;
//		String sRT = Common_Variables.requestType;
//		String sPrice = Common_Variables.xmlPrice;
//		String sPriceAddons = Common_Variables.xmlPriceAddons; 
//		String sTotalAmount = Common_Variables.xmlTotalAmount;
//		String sTotalAmountAddons = Common_Variables.xmlTotalAmountAddons;
//		String sInstallmentAmount = Common_Variables.xmlInstallmentAmount;
//		String sInstallmentAmountAddons = Common_Variables.xmlInstallmentAmountAddons;
//		String sInstallmentAmountDeposit = Common_Variables.xmlInstallmentAmountDeposit; 
//		String sInstallmentAmountDepositAddons = Common_Variables.xmlInstallmentAmountDepositAddons;
//		String sInsurerName = Common_Variables.xmlInsurerName;
//		String sVoluntaryExcess = Common_Variables.xmlVoluntaryExcess;
//		String sCompulsaryExcess = Common_Variables.xmlCompulsoryExcess;
//		String sPostcode = Common_Variables.proposer_PostCode;
//		
//		String sSurname = Common_Variables.proposerLastname;
//		String sTestEnvironment = Common_Variables.environment;
//		String sDOB = Common_Variables.proposerDOB;
		
		//Common_Variables.proposerDOB = sDOBDate_DD+"/"+sDOBDate_MM+"/"+sDOBDate_YYYY;
		
		
		//Object done;
		BrowserSync();
		
		// Excess Amounts Carried From Previous Screen (pre-view tweek)
		// fps = From Previous Screen
		//String sExcessTotal_fps = Common_Variables.policyTotalExcess;
		//String sExcessVoluntary_fps = Common_Variables.policyVoluntaryExcess;
		//String sExcessCompulsory_fps = Common_Variables.policyCompulsoryExcess;
		
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
		// Record QUOTE REFERENCE Number/ID
		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
		String sPriceSection = (String)html_priceSection().getProperty(".contentText");
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
		VerifyandReport("Quote_Reference", Common_Variables.xmlQuoteReference.trim(), sReference.trim(), " Insurance Reference Quote Number ");		
		// Capture QUOTE DETAILS (RH Central Pane) String Data
		String sQuoteDetails = (String)html_aside().getProperty(".contentText");
		// Grab All String Data After "Quote details" Text In RH Pane Of Quote Detail Window
		System.out.println(sQuoteDetails);// 
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
		//--------------------------------------------------------------------------
		VerifyandReport("RegNumber_Match", Common_Variables.vehicleReg.trim(), sRegNumber.trim(), " Vehicle Registration Number");		
		System.out.println("RH Pane Registration Number .... "+sRegNumber);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		// Policy Holder Details		
		// Single or Multi	(Primary)	
		switch (Common_Variables.personsCovered){
			case "IAS": // INSURED ANY SPECIFIED
				sPH = sQuoteDetails.split("Policyholder/Main driver:");
				break;
				
			case "IOD": // INSURED ONLY DRIVER
				sPH = sQuoteDetails.split("Policyholder:");
				break;		
		}		
	
		//--------------------------------------------------------------------------
		// Insurer Transformation
		
		switch (Common_Variables.xmlInsurerName){
		case "Acroma": // 
			Common_Variables.xmlInsurerName = "Acromas(AA)";
			break;
			
		case "TBD": //
			sPH = sQuoteDetails.split("Policyholder:");
			break;		
		}		
		
		
		//--------------------------------------------------------------------------
		System.out.println("Policy Holder .... "+sPH);
		// Compare Reported Screen policy Holder With The Pre-Defined Data pool Value		
		String sPoHo = sPH[1]; String sPolicy_Holder = sPoHo.substring(0, i+3).trim(); // 2 spaces, +1 to Length
		//--------------------------------------------------------------------------
		BrowserSync();		
		// Passed Title i ALL UPPERCASE - We Convert To Camel For Comparison Of Following Screen Scrape.
		sPolicy_Holder=sPolicy_Holder.substring(0,1).toUpperCase()+sPolicy_Holder.substring(1, sPolicy_Holder.length());		
		//sPolicy_Holder=sPolicy_Holder.substring(0, sPolicy_Holder.length());
		VerifyandReport("Policy_Holder_Name_Match", sPolicy_Holder, sPolicyHolderName, " The Policy Holder ");
		//--------------------------------------------------------------------------
		System.out.println("RH Pane Policy Holder .... "+sPolicy_Holder);
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		System.out.println("--------------------------------------------------");// 
		//--------------------------------------------------------------------------
		String sDateStamp = ScreenDate(Common_Variables.numberFutureDays);		
		// Policy Cover Start Date 
		String[] sSD = sQuoteDetails.split("Cover start:");
		String sStDa = sSD[1]; String sStartDate = sStDa.substring(0, 12).trim(); 
		// Compare Start Date from Todays, + Starting Days specified Within DataPool
		//--------------------------------------------------------------------------
//		VerifyandReport("Start_Date_Match", sDateStamp.trim(), sStartDate.trim(), " Policy Start Date ");
		System.out.println(sDateStamp+" sDateStamp "+sStartDate+" sStartDate ");// 
		//--------------------------------------------------------------------------
		sDateStamp = ScreenDate(365+Common_Variables.numberFutureDays); // Leap Year? :-) *	2016	*
		// Policy Cover End Date
		String[] sED = sQuoteDetails.split("Cover end:");
		String sEnDa = sED[1]; String sEndDate = sEnDa.substring(0, 12).trim(); 		
		// Compare End Date With Expected Value		
//		VerifyandReport("End_Date_Match", sEndDate.trim(), sDateStamp.trim(), " Policy End Date ");				
		System.out.println(sDateStamp+" sDateStamp "+sEndDate+" sStartDate ");// 
		//--------------------------------------------------------------------------		
//		//\\\\\\\\\\\\\\\\
//		// Policy Excess			 RIGHT HAND EXCESS VALUES REMOVED FROM CURRENT BUILD
//		// Compulsory
//		String[] sCE = sQuoteDetails.split("Compulsory:");
//		
////		sPolicy_Holder=sPolicy_Holder.substring(0,1).toUpperCase()+sPolicy_Holder.substring(1, sPolicy_Holder.length());		
//		
//		String sCoEx = sCE[1]; String sCompExcess = sCoEx.substring(sCoEx.length()); 
////		String sCoEx = sCE[1]; String sCompExcess = sCoEx.substring(0, 5).trim(); 
//		
//		// Verify CUMPOLSORY EXCESS		
//		VerifyandReport("Compulsory_Excess", sCompExcess.trim(), Common_Variables.xmlCompulsoryExcess.trim(), " Compulsory Excess Value ");		
//		//\\\\\\\\\\\\\\\\
//		// Voluntary
//		String[] sVE = sQuoteDetails.split("Voluntary:");
//		
//		//		String sVoEx = sVE[1]; String sVoluExcess = sVoEx.substring(sVoEx.length()); 				
//		String sVoEx = sVE[1]; String sVoluExcess = sVoEx.substring(0, 5).trim(); 		
//		// Verify VOLUNTARY EXCESS		
//		VerifyandReport("Voluntary_Excess", sVoluExcess.trim(),  Common_Variables.xmlVoluntaryExcess.trim(), " Voluntary Excess Value ");				 
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
////		String sTo = sTOT[1]; String sTotal = sTo.substring(sTo.length());  
//		String sTo = sTOT[1]; String sTotal = sTo.substring(0, 5).trim(); 
//		// Verify TOTAL EXCESS From Previous Scrape and Current Scrape		
//		VerifyandReport("Total_Excess", sTotal.trim(), "£"+iSum, " Total Excess Value ");	
		// Strangely Does Not Work :)
		//VerifyandReport("Total_Excess_From_Previous_Screen", sTotal.trim(), Common_Variables.policyTotalExcess, " Total Excess Value (Previous Screen) ");				
		//--------------------------------------------------------------------------
		// LH EXCESS VALUES
		
		// Voluntary
		String sMotorVoluntaryExcessCode_LH_Value = 
		   (String)list_aaMotorVoluntaryExcessCod().getProperty(".value");
		i = sMotorVoluntaryExcessCode_LH_Value.length();
		sMotorVoluntaryExcessCode_LH_Value = sMotorVoluntaryExcessCode_LH_Value.substring(1, i);
		//--------------------------------------------------------------------------
		// Compulsory		
		String[] sComExc = sQuoteReferenceMain.split("Compulsory excess");		
		String sCE = sComExc[1]; String sComp = sCE.substring(5, 8).trim(); 
		//--------------------------------------------------------------------------
		// Total Excess		
		String[] sTotExc = sQuoteReferenceMain.split("Total excess");
		String sTE = sTotExc[1]; String sTotal = sTE.substring(5, 8).trim(); 
		
		//System.out.println(sTotal+" "+sComp+" "+sMotorVoluntaryExcessCode_LH_Value);	
		// VERIFY EXCESS VALUES
		//--------------------------------------------------------------------------
		System.out.println(" Voluntary_Excess_From_Previous_Screen = "+sMotorVoluntaryExcessCode_LH_Value+" From Store "+Common_Variables.xmlVoluntaryExcess);
		VerifyandReport("Voluntary_Excess_From_Previous_Screen", sMotorVoluntaryExcessCode_LH_Value.trim(), Common_Variables.xmlVoluntaryExcess.trim(), " Voluntary Excess Value (Previous Screen) ");				
		System.out.println(" Compulsory_Excess_From_Previous_Screen = "+sComp+" From Store "+Common_Variables.xmlCompulsoryExcess);		// Comparison Completed Below
//		VerifyandReport("Compulsory_Excess_From_Previous_Screen", sComp.trim(), Common_Variables.xmlCompulsoryExcess.trim(), " Compulsory Excess Value (Previous Screen) ");					
		// VerifyandReport("Total_Excess_From_Previous_Screen", sTotal.trim(), Common_Variables.policyTotalExcess, " Total Excess Value (Previous Screen) ");				

		int iVE = Integer.parseInt(sMotorVoluntaryExcessCode_LH_Value);
		int iCE = Integer.parseInt(sComp);
		int iTE = Integer.parseInt(sTotal);
		String sVC = String.valueOf(iCE+iVE);
		
		VerifyandReport("Total_Excess_Equals_Voluntary_Plus_Compulsory", sTotal, sVC, " Total Excess = Voluntary + Compulsory ");				

		//System.out.println(" Common Variable "+Common_Variables.policyTotalExcess+" sTotal "+sTotal+" iSum £ "+iSum);
                                               
		// Pricing Values For Quote Amounts
		//--------------------------------------------------------------------------
		// Insurer Underwriter Name
 		//----------------- 		
		String[] sIn = sQuoteDetails.split("Policy underwritten by:");
		String sInsurer = sIn[1];
		i = (Common_Variables.xmlInsurerName.length());
		//-----------------		
		sInsurer = sInsurer.replaceAll("\\s",""); // Removes line feeds, nulls, ect.
		sInsurer.trim();
		i = (sInsurer.length());
//		System.out.println(" Underwriter = "+sInsurer+"   "+Common_Variables.xmlInsurerName+" "+i); // .trim()
		// 
		// i = (sInsurer.length());
		
 		//sInsurer.trim();
		sInsurer = sInsurer.substring(0, i); 
 		// Undewriter
		VerifyandReport("Policy_underwritten_by", Common_Variables.xmlInsurerName, sInsurer, " Policy underwritten by ");
		//--------------------------------------------------------------------------
		// Affinity
		i = (Common_Variables.xmlAffinity.length());
		//-----------------
		String[] sAf = sQuoteDetails.split("Thank you for getting a quote through");
		String sSAf = sAf[1]; String sAffinity = sSAf.substring(0, i+1); 
		//-----------------
		sAffinity=sAffinity.substring(0,1).toUpperCase()+sAffinity.substring(1, sAffinity.length());
		// Affinity
		VerifyandReport("Affinity_Quote_Provider", Common_Variables.xmlAffinity.trim(), sAffinity.trim(), " Affinity Quote Provider ");
		//--------------------------------------------------------------------------
		// Scrape the 2 PRIMARY LH Values for DP Compare
		String sMonthlyAmount = (String)label_payMonthly().getProperty(".text");
		String sAnnualAmount = (String)label_annualPayment().getProperty(".text");
		
		sMonthlyAmount = sMonthlyAmount.replaceAll("[^\\.0123456789]","");
		sAnnualAmount = sAnnualAmount.replaceAll("[^\\.0123456789]","");
		//int iMonthlyAmount = Integer.parseInt(sMonthlyAmount);
		//int iAnnualAmount = Integer.parseInt(sAnnualAmount);

		//-----------------
		// Detect Payment Type (Defaults MONTHLY or Annually)
		// MONTH
		String sPayMonthlySelected = (String)label_payMonthly().getProperty(".className");
 		if (sPayMonthlySelected.equalsIgnoreCase("lradio-label lradioselected")){
			// Monthly Payment Selected
			//-----------------
			BrowserSync();
			// Initial Deposit
			String[] sId = sPriceSection.split("£"); // Initial deposit (card payment) 
			String sIDep = sId[2];// String sInitialDeposit = sIDep.substring(0, i+1);
			i = (Common_Variables.xmlDeposit.length()); // xmlInstallmentAmountDeposit
			String sInitialDeposit = sIDep.substring(0, i); 
			//System.out.println(" Init Deposit = "+sInitialDeposit+"   "+sIDep+" "+i); // .trim()
			//-----------------
			VerifyandReport("Monthly_Initial_Deposit", Common_Variables.xmlDeposit, sInitialDeposit, " Initial Deposit Cost ");
			//-----------------
			// 11 Monthly Payments
			i = (Common_Variables.xmlInstalmentAmount.length());
			String[] s11m = sPriceSection.split("£");
			String s11Pay = s11m[3]; String sElevenPayments = s11Pay.substring(0, i); 
			//-----------------
			VerifyandReport("Eleven_Monthly_Payments",Common_Variables.xmlInstalmentAmount, sElevenPayments, " Eleven Monthly Payments ");
			//-----------------
			// Total Credit
			Common_Variables.xmlCalculatedCredit  = Common_Variables.xmlCalculatedCredit.replaceAll("[^\\.0123456789]","");
			//i = (Common_Variables.xmlCalculatedCredit.length());
			String[] sTC = sQuoteDetails.split("£");			
			i = (sTC.length);			
			String sTotCred = sTC[4]; String sTotalCredit = sTotCred.substring(0, i+1); 

			sTotalCredit = sTotalCredit.replaceAll("[^\\.0123456789]","");	

			
//			removeStringDebris(sTotalCredit);
			
			
			// String to Double
			double dxmlCalculatedCredit = Double.parseDouble(Common_Variables.xmlCalculatedCredit);
			// Rounding 2 sig fig
			dxmlCalculatedCredit = Math.round(dxmlCalculatedCredit*100.0)/100.0;
			// Double To String
 			String sxmlCalculatedCredit = Double.toString(dxmlCalculatedCredit);
			
//			String sxmlCalculatedCredit = "";			
//			round2SigFigs(Common_Variables.xmlCalculatedCredit, sxmlCalculatedCredit);
			
			
			System.out.println(" Screen Credit Value = "+sTotalCredit+" Calculated  "+sxmlCalculatedCredit+" "+i);
			//-----------------
			VerifyandReport("Total_Credit", sxmlCalculatedCredit.trim(), sTotalCredit.trim(), " Total Credit ");
			//-----------------
			// Total Payable
			i = (Common_Variables.xmlTotalAmount.length());
			String[] sTPay = sQuoteDetails.split("£");
			String sTotPay = sTPay[5]; String sTotalPayable = sTotPay.substring(0, i); 
			//-----------------
			VerifyandReport("Total_Payable", Common_Variables.xmlTotalAmount, sTotalPayable, " Total Payable ");
			//-----------------
			// COMPARE ON 2 PAGE ITEMS !!!
			String sSummaryMonthly_ContentText = (String)html_monthlySummary().getProperty(".contentText");
			//-----------------
			VerifyandReport("Monthly_Quotes_Match_On_Page", sSummaryMonthly_ContentText.trim(), "£"+sMonthlyAmount.trim(), " Left Hand and Right Hand Primary Monthly Quote Cost ");
			//-----------------
			//  Motor Legal (NO LONGER DISPLAYED WITH RH QUOTE WINDOW) DOES FOR MONEYSUPF
			String sMotorLegalAssistance = "";
			Double dMotorLegalAssistance = null;
			
//			if (Common_Variables.sMLA.equalsIgnoreCase("yes")){
//				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
//				String sMotorLA = sMla[2]; 
//				i = sMotorLA.length();
//				sMotorLegalAssistance = sMotorLA.substring(0, i); 
//				//-----------------
////				System.out.println(" Monthly MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
//				System.out.println(" Monthly MLA = "+sMotorLegalAssistance+" dP  "+Common_Variables.MLA+" "+i);
//				VerifyandReport("Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
//				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
//				// String to Double (For later addition to Insurance Monthly Total)
//				dMotorLegalAssistance = Double.parseDouble(sMotorLegalAssistance);
//				// Rounding 2 sig fig
//				dMotorLegalAssistance = Math.round(dMotorLegalAssistance*100.0)/100.0;
//				//--------------------------------------------------------------------------------------------------------------------
//
//			}
			
			
//			try {
//				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
//				String sMotorLA = sMla[2]; 
//				i = sMotorLA.length();
//				sMotorLegalAssistance = sMotorLA.substring(0, i); 
//				//-----------------
//				System.out.println(" Monthly MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
//				VerifyandReport("Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
//				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
//				// String to Double (For later addition to Insurance Monthly Total)
//				dMotorLegalAssistance = Double.parseDouble(sMotorLegalAssistance);
//				// Rounding 2 sig fig
//				dMotorLegalAssistance = Math.round(dMotorLegalAssistance*100.0)/100.0;
//				//--------------------------------------------------------------------------------------------------------------------
//			} catch (Exception e) {
//				System.out.println(" Monthly MLA NOT DETECTED"); 
//				// e.printStackTrace();
//			}
			//-----------------
			// Car Insurance
			i = (Common_Variables.xmlInstalmentAmount.length());
			String[] sCim = sQuoteDetails.split("Car insurance "); // Car insurance
			String sCarInsM = sCim[2]; String sCarInsuranceMonth = sCarInsM.substring(1, i+1); // 1 /+1 Cim[2]
			
			
			//String sMotorLegalAss = String.valueOf(sMotorLegalAssistance);
			//String sCarInsMonth = String.valueOf(sCarInsuranceMonth);
			
			// String to Double
			double dCarInsuranceMonth = Double.parseDouble(sCarInsuranceMonth);
			
			// Rounding 2 sig fig

			dCarInsuranceMonth = Math.round(dCarInsuranceMonth*100.0)/100.0;

			// ADD MLA TO INSURANCE COST (If it exists)
//			try{
//				dCarInsuranceMonth = dCarInsuranceMonth + dMotorLegalAssistance;  // was negated
//			} catch (Exception e) {
//				System.out.println(" MLA NOT ADDED TO MONTHLY COST AS MLA NOT DETECTED"); 
//				// e.printStackTrace();
//			}
			
			// Double To String
			sCarInsuranceMonth = Double.toString(dCarInsuranceMonth);

			// ADD MLA TO INSURANCE COST (If it exists)
			if (Common_Variables.sMLA.equalsIgnoreCase("yes")){
				dCarInsuranceMonth = dCarInsuranceMonth + 2.43; // dMotorLegalAssistance;
			
			
			//-----------------
			System.out.println(" MLA "+dMotorLegalAssistance+" Car Insurance Month = "+sCarInsuranceMonth+" Installment Amount "+Common_Variables.xmlInstalmentAmount+" PLUS MLA ");
//			VerifyandReport("Monthly_Car_Insurance_Cost", sCarInsuranceMonth.trim(), Common_Variables.xmlInstalmentAmount, " Car Insurance Monthly Subtotal Cost ");
 		}}

 		// SELECT YEAR - TO CHECK ALL PARAMETERS
		label_annualPayment().waitForExistence(10,  0.25);
		label_annualPayment(ANY, READY).click();		
		// SELECT YEAR - TO CHECK ALL PARAMETERS
		BrowserSync();		
		// ANNUAL
		String sPayYearlySelected = (String)label_annualPayment().getProperty(".className");
		if (sPayYearlySelected.equalsIgnoreCase("lradio-label lradioselected")){
			// Annual Payment Selected
			String sSummaryAnnual_ContentText = (String)html_annualSummary().getProperty(".contentText");			
			//-----------------
			VerifyandReport("Annual_Quotes_Match_On_Page", "£"+sAnnualAmount.trim(), sSummaryAnnual_ContentText.trim(), "  Left Hand and Right Hand Primary Annual Quote Cost ");
			//-----------------
			// Motor Legal (NO LONGER DISPLAYED WITH RH QUOTE WINDOW) DOES FOR MONEYSUPF
			try {
				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
				String sMotorLA = sMla[1]; String sMotorLegalAssistance = sMotorLA.substring(0, i+1); 
				//-----------------
				System.out.println(" Annual MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
				VerifyandReport("Annual_Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)

			//--------------------------------------------------------------------------------------------------------------------
			} catch (Exception e) {
				System.out.println(" Annual MLA NOT DETECTED"); 
				// e.printStackTrace();
			}
			////-----------------		
			// Car Insurance
			i = (Common_Variables.xmlPrice.length());
			String[] sCiA = sQuoteDetails.split("Car insurance "); // Small Text Below LARGE - Reflecting Same Amount
			String sCarInsA = sCiA[1]; String sCarInsuranceAnnual = sCarInsA.substring(1, i+1); 
			//-----------------
//			VerifyandReport("Annual_Car_Insurance_Cost", sCarInsuranceAnnual.trim(), Common_Variables.xmlPrice, " Car Insurance Annual Subtotal Cost ");
		}		
		//-------------------------------------------------------------------------		
		// RESET YEAR SELECTION BACK TO MONTH FOR TIDYNESS
		label_payMonthly().waitForExistence(10,  0.25);
		label_payMonthly(ANY, READY).click();
		// RESET YEAR SELECTION BACK TO MONTH FOR TIDYNESS
		//-------------------------------------------------------------------------
		

	 // MLA AND TOTALS NOT BEING SUMMED )Above) MLA Not Detected correctly, need to fix
//		switch (sQuoteRetrievalType){
//		// Aggrogators
//			case "motor-retrievequote":
//				 
//				break;
//
//		
//			case "home-retrievequote":
//				 
//				break;
//
//		
//		}

	


	}
}

