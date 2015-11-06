package Motor;
import resources.Common_Variables;
import resources.Motor.Your_Quote_Details_ConfirmHelper;
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
 * Description   : Functional Test Script // Quote
 * @author horned
 */
@SuppressWarnings("unused")
public class Your_Quote_Details_Confirm extends Your_Quote_Details_ConfirmHelper
{
	/**
	 * Script Name   : <b>Your_Quote_Details_Confirm</b>
	 * Generated     : <b>15 Jan 2015 11:22:15</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/01/15
	 * @author horned
	 */
	public void testMain(Object[] args) // split
	{
		
		//------------------------------------------------------------------------------
		// ADDITIONS ADDED BY DAVE TO CONFIRM TOTALS MATCH ON QUOTE PAGE    -    Jan 2015
		//------------------------------------------------------------------------------
		
		// # # # # # # #    WILL MODULARISE FOR RE-USE WHEN TIME PERMITS :-) # # # # # # #
		
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // 
		//------------------------------------------------------------------------------------------
		sleep(3);
		
		
		// // Debug
		Common_Variables.paymentType = "AA Instalment Account (TIA)"; //AA Installment Account (TIA)"; // Single Payment"; // 
		// // Debug
		
		//------------------------------------------------------------------------------
		// Grab The Various Values (RAWS) From The GUI For Later Comparisons and Verifications						 
		//  EXAMPLES OF RAW RETURNS
		String sLH_AnnualPayment_Total = (String)label_lH_AnnualPayment().getProperty(".text");				         
		// .text:  £339.03 Annual payment
		String sLH_MonthlylPayment_Total = (String)label_lH_MonthlyPayment().getProperty(".text");			         
		// .text:  £31.80 Pay monthly
		String sLH_ExtraCover_MotorLegalAssistance = (String)label_lH_ExtraCover_MLA().getProperty(".text");		 
		// .text:  Motor Legal Assistance £2.44 a month £25.99 If you have a car accident where the other driver is to blame, get expert legal help to claim compensation from them. If it is more likely than not your case will be successful, you'll get help to claim for injuries or costs which aren't covered by your car insurance. There's no solicitor's fee to pay, so you keep all of your damages.
		String sLH_ExtraCover_PersonalAccidentCover = (String)label_lH_ExtraCover_PAC().getProperty(".text");		 
		// .text:  Personal accident cover £1.41 a month £15.00 The Motor Accident Plan policy pays up to an additional £20,000 on top of any payment provided by your AA car insurance policy – or any other personal accident and life insurance cover – if you, or someone named on your policy, is injured or dies as a result of a car accident.
		String sLH_ExtraCover_CarHireCover = (String)label_lH_ExtraCover_CarHire().getProperty(".text");			 
		// .text:  Car Hire Cover £2.82 a month £29.99 Cover to keep you on the road if your car is written off or stolen.
		String sLH_ExtraCover_ProtectYourPolicyExcess = (String)label_lH_ExtraCover_PYPExcess().getProperty(".text");
		// .text:  Protect your policy excess £3.90 a month £41.49 Claim back your excess if you're at fault or the other party can't be traced. You can reclaim your excess when a claim costs more than the excess.
		String sLH_ExtraCover_MotorProtectNCD = (String)list_lH_ExtraCover_MotorProtec().getProperty(".value");		 
		// .value:  Not Protected
		String sLH_ExtraCover_MotorCoverType = (String)list_lH_ExtraCover_MotorCoverT().getProperty(".value");		 
		// .value:  Comprehensive
		String sLH_ExtraCover_MotorVoluntaryExcess = (String)list_lH_ExtraCover_VoluntaryEx().getProperty(".value"); 
		// .value:  £250
		
/*		//------------------------------------------------------------------------------
		// List Current Status/Values of ALL Addons, Selected Or Not RAW
		System.out.println("Current Value of ADDON - Motor Legal Assistance = "+sLH_ExtraCover_MotorLegalAssistance+" ");
		System.out.println("Current Value of ADDON - Personal Accident Cover = "+sLH_ExtraCover_PersonalAccidentCover+" ");
		System.out.println("Current Value of ADDON - Car Hire Cover = "+sLH_ExtraCover_CarHireCover+" ");
		System.out.println("Current Value of ADDON - Protect Your policy Access = "+sLH_ExtraCover_ProtectYourPolicyExcess+" ");
		System.out.println("Current Value of ADDON - Motor Protect NCD = "+sLH_ExtraCover_MotorProtectNCD+" ");
		System.out.println("Current Value of ADDON - Motor Cover Type = "+sLH_ExtraCover_MotorCoverType+" ");
		System.out.println("Current Value of ADDON - Motor Volintary Access = "+sLH_ExtraCover_MotorVoluntaryExcess+" ");
		//------------------------------------------------------------------------------
*/		// Need To Extract Month and Year Components of Above Strings (If Exist) From LH Components Window
		// ExtraCover Motor Legal Assistance
		String[] sLH_MLA = sLH_ExtraCover_MotorLegalAssistance.split("£");
		String sLH_MLA_Month = sLH_MLA[1]; sLH_MLA_Month = sLH_MLA_Month.substring(0, 5); sLH_MLA_Month.trim();
		String sLH_MLA_Year = sLH_MLA[2]; sLH_MLA_Year = sLH_MLA_Year.substring(0, 6); sLH_MLA_Year.trim();
//		System.out.println("MLA Monthly Value = "+sLH_MLA_Month); sLH_MLA_Month.trim(); // Loose Those Spaces :-)
//		System.out.println("MLA Yearly Value = "+sLH_MLA_Year); sLH_MLA_Year.trim(); // Loose Those Spaces :-)
		// ExtraCover Personal Accident Cover
		String[] sLH_PAC = sLH_ExtraCover_PersonalAccidentCover.split("£");
		String sLH_PAC_Month = sLH_PAC[1]; sLH_PAC_Month = sLH_PAC_Month.substring(0, 5); sLH_PAC_Month.trim();
		String sLH_PAC_Year = sLH_PAC[2]; sLH_PAC_Year = sLH_PAC_Year.substring(0, 6); sLH_PAC_Year.trim();
//		System.out.println("PAC Monthly Value = "+sLH_PAC_Month); sLH_PAC_Month.trim(); // Loose Those Spaces :-)
//		System.out.println("PAC Yearly Value = "+sLH_PAC_Year); sLH_PAC_Year.trim(); // Loose Those Spaces :-)
		// ExtraCover Car Hire Cover
		String[] sLH_CHC = sLH_ExtraCover_CarHireCover.split("£");
		String sLH_CHC_Month = sLH_CHC[1]; sLH_CHC_Month = sLH_CHC_Month.substring(0, 5); sLH_CHC_Month.trim(); 
		String sLH_CHC_Year = sLH_CHC[2]; sLH_CHC_Year = sLH_CHC_Year.substring(0, 6); sLH_CHC_Year.trim();
//		System.out.println("CHC Monthly Value = "+sLH_CHC_Month); sLH_CHC_Month.trim(); // Loose Those Spaces :-)
//		System.out.println("CHC Yearly Value = "+sLH_CHC_Year); sLH_CHC_Year.trim(); // Loose Those Spaces :-)
		// ExtraCover Protect Your policy Access
		String[] sLH_PYPA = sLH_ExtraCover_ProtectYourPolicyExcess.split("£");
		String sLH_PYPA_Month = sLH_PYPA[1]; sLH_PYPA_Month = sLH_PYPA_Month.substring(0, 5); sLH_PYPA_Month.trim();
		String sLH_PYPA_Year = sLH_PYPA[2]; sLH_PYPA_Year = sLH_PYPA_Year.substring(0, 6); sLH_PYPA_Year.trim(); 
//		System.out.println("PYPA Monthly Value = "+sLH_PYPA_Month); sLH_PYPA_Month.trim(); // Loose Those Spaces :-)
//		System.out.println("PYPA Yearly Value = "+sLH_PYPA_Year); sLH_PYPA_Year.trim(); // Loose Those Spaces :-)
		//------------------------------------------------------------------------------
		// RH Sub Totals DATA EXTRACTION  (YAWN!)
		String sRH_AddonListISummary;
		if (Common_Variables.paymentType.equalsIgnoreCase("AA Instalment Account (TIA)"));{
			sRH_AddonListISummary = (String)html_rH_AddonListMonthly().getProperty(".contentText");
		}
		
		switch (Common_Variables.paymentType){		
			case "Single Payment":			
				sRH_AddonListISummary = (String)html_rH_AddonListAnnual().getProperty(".contentText");
				sleep(0.5);
				break;			
			case "AA Instalment Account (TIA)":
				sRH_AddonListISummary = (String)html_rH_AddonListMonthly().getProperty(".contentText");
				sleep(0.5);
				break;
		}
		System.out.println(" --------------------------------------------------");// 		
		int i = 0;
        // String phrase = "the music made   it   hard      to        concentrate";
        String delims = "[^.0-9]+";
        
		String[] tokens = sRH_AddonListISummary.split(delims);
        
        double dIP = 0; double dEx = 0; double dPP = 0; double dCH = 0; double dMP = 0; double dRHSummarySubTotals = 0;
        String sIP = ""; String sEx = ""; String sPP = ""; String sCH = ""; String sMP = "";    
        
        String sDUMMY = ""; @SuppressWarnings("unused")
		double dDUMMY = 0;
		        
        for (i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]+" Count = "+i);
        //sIP = (tokens[i]); sIP.trim(); dIP = Double.parseDouble(sIP);
        //dTotal = dTotal+dIP;

        try{
	       sIP = (tokens[1]); sIP.trim(); dIP = Double.parseDouble(sIP);
	       sEx = (tokens[2]); sEx.trim(); dEx = Double.parseDouble(sEx);        
	       sPP = (tokens[3]); sPP.trim(); dPP = Double.parseDouble(sPP);        
	       sCH = (tokens[4]); sCH.trim(); dCH = Double.parseDouble(sCH); 
	       sMP = (tokens[5]); sMP.trim(); dMP = Double.parseDouble(sMP); 	       
	       sDUMMY = (tokens[6]); sDUMMY.trim(); dDUMMY = Double.parseDouble(sDUMMY);   
        }
         catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Intentional Break");
         }		        
	      dRHSummarySubTotals = dCH+dPP+dEx+dIP+dMP;	        
	      System.out.println("Summary (Right Hand Panel)Sub-Totals = "+(" (1) = "+dIP+" (2) = "+dEx+" (3) = "+dPP+" (4) = "+dCH+" (5) = "+dMP));	      
	      // Set to 2dp
	      dRHSummarySubTotals = Math.round(dRHSummarySubTotals*100)/100.00;	      
	      System.out.println("Total = "+(dRHSummarySubTotals));
		  System.out.println(" --------------------------------------------------");// 
		
		//---------------------------------------------------------------------------------------
		// Select Monthly or Annually Using FIND (Due to 2 objects with same recognition properties)
		//---------------------------------------------------------------------------------------
		String sRH_MonthlySummary = "";
		String sRH_AnnualSummary = "";
		
		Object api1 = "";
		Object api2 = "";
		RootTestObject rto = getRootTestObject();
		TestObject[] gto = rto.find(atDescendant("", api1, "", api2),false);
		
		//------------------------------------------------------------------------------
		// Month
		api1 = "Html.SPAN";
		api2 = "monthly-summary";
		
		rto = getRootTestObject();
		gto = rto.find(atDescendant(".class", api1, ".id", api2),false);
		sleep(1);
		GuiTestObject MonthlySummary = (GuiTestObject)gto[0];
		sRH_MonthlySummary = (String) MonthlySummary.getProperty(".contentText");			 

		//------------------------------------------------------------------------------
		// Year
		api1 = "Html.SPAN";
		api2 = "annual-summary";
		
		rto = getRootTestObject();
		gto = rto.find(atDescendant(".class", api1, ".id", api2),false);		
		sleep(1);		
		GuiTestObject AnnualSummary = (GuiTestObject)gto[0];		
		sRH_AnnualSummary = (String) AnnualSummary.getProperty(".contentText");			 
		
		//------------------------------------------------------------------------------
		// Textual Content Below Summary on RH/Top Side
		String RH_QuoteReference = (String)html_aside().getProperty(".contentText");
		// .text:  Car insurance £31.80 Motor Legal Assistance £2.44 Excess Protection £3.90 Car Hire £2.82 Motor Accident Plan £1.41
		String sQuote_Reference = (String)html_aside().getProperty(".text"); 
		// .text:  Annual payment Pay monthly £42.36 a month Initial deposit (card payment) of £45.15 Then 11 monthly payments of £42.36 26.9 % APR representative** Total credit = £465.96 Total payable = £511.11 £451.50 Cover summary Car insurance £339.03 Motor Legal Assistance £25.99 Excess Protection £41.49 Car Hire £29.99 Motor Accident Plan £15.00 Car insurance £31.80 Motor Legal Assistance £2.44 Excess Protection £3.90 Car Hire £2.82 Motor Accident Plan £1.41 Quote includes your online discount. Prices include Insurance Premium Tax. Your free offers Breakdown Cover 12 months free cover (renewal by annual direct debit) Quote details HN63EHV – 2013, RENAULT, CAPTUR DYNAMIQUE M-NAV TC, 898cc, PETROL, MANUAL ...change Policyholder/Main driver: MS Claire Sholtz tia@tiatest.com Cover start: 15 Jan 2015 Cover end: 15 Jan 2016 ...change Additional drivers: MRS DotcomRegression Tiauifbjruw ...change Policy excess: Compulsory: £150150 Voluntary: £250250 Total: £400400 excess details / policy terms Car Insurance Policy Booklet About AA Insurance Services Please read for arrangement fee details Breakdown Cover Terms Want to return later? We can email this quote to you. Quote reference WW3MT015M8WK Can we help? Call us 0800 316 2457 UK call centres open: Monday to Friday 8am to 8pm Saturday 9am to 5pm										 // 
		//------------------------------------------------------------------------------
		// ADDONS Selection Scrape (To Detect If Selected Or Not?) For Later Use
		String sMotorLegalAssistance_ClassName = (String)label_lH_ExtraCover_MLA().getProperty(".className");
		String sPersonalAccidentCover_ClassName = (String)label_lH_ExtraCover_PAC().getProperty(".className");
		String sCarHireCover_ClassName = (String)label_lH_ExtraCover_CarHire().getProperty(".className");
		String sProtectYourPolicyExcess_ClassName = (String)label_lH_ExtraCover_PYPExcess().getProperty(".className");

		//------------------------------------------------------------------------------
		// Tidy Raws for Later Comparison
		sLH_AnnualPayment_Total = sLH_AnnualPayment_Total.replaceAll("[^\\.0123456789]", ""); 		// Regex - Only  Numbers and "'"
		sLH_MonthlylPayment_Total = sLH_MonthlylPayment_Total.replaceAll("[^\\.0123456789]", ""); 	// Regex - Only  Numbers and "'"
		sRH_MonthlySummary = sRH_MonthlySummary.replaceAll("[^\\.0123456789]", ""); 				// Regex - Only  Numbers and "'"
		sRH_AnnualSummary = sRH_AnnualSummary.replaceAll("[^\\.0123456789]", ""); 					// Regex - Only  Numbers and "'"
		// Need To Extract Monthly and Annual Values from Each of THe Above Strings :-/ Simples?		
		
		//------------------------------------------------------------------------------
		
		// NOTE - ALL THIS ACTIVITY OCCURS AFTER SELECTIONS ARE MADE ON THE 'Your Quote' PAGE
		
		logTestResult(" ---   Your   Quote   Screen  Scrapes   and   Calculations   --- ", true);
		System.out.println();
		// Detect For Monthly/Annual Quote
		
		double dLH_Annual_Total;
		double dLH_Monthly_Total;
		dLH_Annual_Total = 0;
		dLH_Monthly_Total = 0;

		switch (Common_Variables.paymentType){
		
			case "Single Payment":
				dLH_Annual_Total = Double.parseDouble(sLH_AnnualPayment_Total);
				if (sLH_AnnualPayment_Total.equalsIgnoreCase(sRH_AnnualSummary)){
					// Set Variable For RH Sub Total Comparisons (Annual)
					//vpManual("Total_And_Summary_Sub_Total_Equality",dLH_Annual_Total ,dRHSummarySubTotals).performTest();					
					// Report
					if ((sLH_AnnualPayment_Total).equalsIgnoreCase(sRH_AnnualSummary)){                                                                                        /////@@@@@@@@@@@@@@@@@
						logTestResult("Your Annual Quote Amount and Right Hand Summary Payment Amounts £"+sRH_AnnualSummary+" Match As Expected", true);
						System.out.println("Your Annual Quote Amount and Right Hand Summary Payment Amounts £"+sRH_AnnualSummary+" Match As Expected");
					}
					else{
						// Report
						logTestResult("Your Annual Quote Amount £"+dLH_Annual_Total+" and Summary Payment Amounts £"+dRHSummarySubTotals+" Are Different ", false);  //  8888888888888
						System.out.println("Your Annual Quote Amount £"+sLH_AnnualPayment_Total+" and Summary Payment Amounts £"+dRHSummarySubTotals+" Are Different ");					
					}
					logTestResult("Your Annual Quote Amount and Payment Amount £"+sRH_AnnualSummary+" Match As Expected", true);
					System.out.println("Your Annual Quote Amount and Payment Amount £"+sRH_AnnualSummary+" Match As Expected");
				}
				else{
					// Report
					logTestResult("Your Annual Quote Amount £"+sLH_AnnualPayment_Total+" and Payment Amount £"+sRH_AnnualSummary+" Are Different ", false);
					System.out.println("Your Annual Quote Amount £"+sLH_AnnualPayment_Total+" and Payment Amount £"+sRH_AnnualSummary+" Are Different ");					
				}
				break;
			
			case "AA Instalment Account (TIA)": // AA Instalment Account (TIA) // AA Installment Account (TIA)
				dLH_Monthly_Total = Double.parseDouble(sLH_MonthlylPayment_Total);
				if (sLH_MonthlylPayment_Total.equalsIgnoreCase(sRH_MonthlySummary)){
					// Set Variable For RH Sub Total Comparisons (Month)
					//vpManual("Total_And_Summary_Sub_Total_Equality",sLH_MonthlylPayment_Total ,dRHSummarySubTotals).performTest();
					// Report
					if ((sLH_MonthlylPayment_Total).equalsIgnoreCase(sRH_MonthlySummary)){                                                                                       /////@@@@@@@@@@@@@@@@@
						logTestResult("Your Monthly Quote Amount and Right Hand Summary Payment Amounts £"+sRH_MonthlySummary+" Match As Expected", true);
						System.out.println("Your Monthly Quote Amount and Right Hand Summary Payment Amounts £"+sRH_MonthlySummary+" Match As Expected");
					}
					else{
						// Report
						logTestResult("Your Monthly Quote Amount £"+dLH_Monthly_Total+" and Summary Payment Amounts £"+dRHSummarySubTotals+" Are Different ", false);  // 8888888888888
						System.out.println("Your Monthly Quote Amount £"+dLH_Monthly_Total+" and Summary Payment Amounts £"+dRHSummarySubTotals+" Are Different ");					
					}
					logTestResult("Your Monthly Quote Amount and Payment Amount £"+sRH_MonthlySummary+" Match As Expected", true);
					System.out.println("Your Monthly Quote Amount and Payment Amount £"+sRH_MonthlySummary+" Match As Expected");
				}
				else{
					// Report
					logTestResult("Your Monthly Quote Amount £"+sLH_MonthlylPayment_Total+" and Payment Amount £"+sRH_MonthlySummary+" Are Different", false);
					System.out.println("Your Monthly Quote Amount £"+sLH_MonthlylPayment_Total+" and Payment Amount £"+sRH_MonthlySummary+" Are Different ");					
				}
				break;
		}
		//---------------------------------------------------------------------------------------------------------------------
		// Totals Confirmed (Left Hand and Right Hand Sides (Above) Now To Confirm Right Hand Sub Total Summary Totals Up To THe Same Figure.
		
		//---------------------------------------------------------------------------------------------------------------------
		// Check ADDONS Selection
		System.out.println(" --------------------------------------------------");// 
		int iChkBoxCount = 0;
		if (sMotorLegalAssistance_ClassName.equalsIgnoreCase("lcheck-label topround-corners5 lcheckselected")){
			iChkBoxCount=iChkBoxCount+1; System.out.println(" Extra Cover Motor Legal Assistance CheckBox Was Selected");
		}
		if (sPersonalAccidentCover_ClassName.equalsIgnoreCase("lcheck-label topround-corners5 lcheckselected")){
			iChkBoxCount=iChkBoxCount+1; System.out.println(" Extra Cover Personal Accident Cover CheckBox Was Selected");

		}
		if (sCarHireCover_ClassName.equalsIgnoreCase("lcheck-label topround-corners5 lcheckselected")){
			iChkBoxCount=iChkBoxCount+1; System.out.println(" Extra Cover Care Hire Cover CheckBox Was Selected");

		}
		if (sProtectYourPolicyExcess_ClassName.equalsIgnoreCase("lcheck-label topround-corners5 lcheckselected")){
			iChkBoxCount=iChkBoxCount+1; System.out.println(" Extra Cover Protect Your Policy CheckBox Was Selected");

		}
		System.out.println(iChkBoxCount+" Extra Cover CheckBox(s) Were Selected");
		System.out.println(" --------------------------------------------------");// 
		
		// vpManual("CheckboxSelectedCount", iChkBoxCount, i-1).performTest();
		//---------------------------------------------------------------------------------------------------------------------
		// Record QUOTE Number/ID
		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
		
		String[] sQR = sQuoteReferenceID.split("Quote reference");
		String sSQ1 = sQR[1]; String sReference = sSQ1.substring(0, 14); 

		System.out.println("Your Quote Reference is .... "+sReference);
		System.out.println(" --------------------------------------------------");// 
		// RH Side Verification of Additions
		
		System.out.println(" Extra Cover - Motor Protection Is Set To = "+sLH_ExtraCover_MotorProtectNCD);
		System.out.println(" Extra Cover - Motor Cover Type Is Set To = "+sLH_ExtraCover_MotorCoverType);
		System.out.println(" Extra Cover - Voluntary Excess Is Set To = "+sLH_ExtraCover_MotorVoluntaryExcess);
		//---------------------------------------------------------------------------------------------------------------------
		// Set Variable For Further Checks Down The Line
		Common_Variables.totalAnnualPrice = sRH_AnnualSummary;
		Common_Variables.monthlyPrice = sRH_MonthlySummary; 
		//---------------------------------------------------------------------------------------------------------------------
		unregisterAll();
	}
}

