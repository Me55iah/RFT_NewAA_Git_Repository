package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Verify_Home_Monthly_PricesHelper;
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
public class Verify_Home_Monthly_Prices extends Verify_Home_Monthly_PricesHelper
{
	/**
	 * Script Name   : <b>Verify_Home_Monthly_Prices</b>
	 * Generated     : <b>11 May 2015 11:58:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/11
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// MONTHLY
		
		// Side Cost Window
		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
//		String sPriceSection = (String)html_priceSection().getProperty(".contentText");
		// Main Cost Page
		String sQuoteReferenceMain = (String)html_main().getProperty(".contentText");
		
		// Standard Cost Window
		String sStandardSelection =  (String)html_standardSelectDiv().getProperty(".text");

		// Premium Cost Window
		String sPremiumSelection =  (String)html_premiumSelectDiv().getProperty(".text");
		
		
		// FOR MONTHLY AND ANNUAL QUOTES
		// 
		String sInsType = Common_Variables.xmlInsuranceType;
		String sCoverType = "";
		String sPaymentOption = Common_Variables.xmlPaymentOption;

//		// Jump Out Of MSF - Common Stuff Verified, But Pricing Not YET!
//		if (Common_Variables.xmlAffinity.contains("moneysupermarket")){
//			if (sInsType.equals("1")){
//				System.out.println(" MoneySuperMarket Combined Issues To Resolve - Page Presentation Different");
//				return;
//			}
//		}
//		if (Common_Variables.xmlAffinity.contains("confused")){
//			if (sInsType.equals("1")){
//				System.out.println(" Confused Combined Issues To Resolve - Page Presentation Different");
//				return;
//			}
//		}
//		if (Common_Variables.xmlAffinity.contains("gocompare")){
//			if (sInsType.equals("1")){
//				System.out.println(" gocompare Combined Issues To Resolve - Page Presentation Different");
//				return;
//			}
//		}
		
		
		
//		if (Common_Variables.xmlAffinity.contains("comparethemarket")){
//			// Works OK
//		}
//		
//		else{
//			if (sInsType.equals("1")){
//				System.out.println(" MSM/Conf/GoCom Combined Issues To Resolve - Page Presentation Different");
//				
//				// Combined Quote Page Returned, Is Different From The CTM and contents or Buildings Quote of These Affinities
//				
//				return;
//			}
//		}

		//------------------------------------------------------------------------------------------
		callScript("Utilities.Home_Monthly_Selector");
		//------------------------------------------------------------------------------------------
		// 
		// Type Normalisation
		String sNormalize = null;
		
		// Type Normalisation
		switch (sInsType){
			
		case "1":
			sInsType = "Combined";
			sCoverType = "Buildings & Contents"; // For Verification on HMI
			// ---------------------------------------------------------------------------------
			// NOT CTM? - Re-sample To Show Updated HMI for BUILDINGS AND CONTENTS ONLY
			// ONLY NEED T DO THIS ONCE - COMPL:ETED VIA ANNUAL_PRICES
/*			if (!Common_Variables.xmlAffinity.contains("comparethemarket")){
				callScript("Aggregators.Home.Policy_Resample");
			}
*/			// ---------------------------------------------------------------------------------
			// Premium Checks
//			callScript("Utilities.Home_Premium_Selection");
			// ---------------------------------------------------------------------------------
//			// Monthly Combined Premium Cost
//			String[] sAC = sPremiumSelection.split("£"); //  
//			String sPremiumMonthlyCost = sAC[1];//  
//			// removeStringDebris(sMonthlyCost);		
//			sPremiumMonthlyCost = sPremiumMonthlyCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			VerifyandReport("Plus_Combined_Monthly_Payment", Common_Variables.xmlJointPrice_P, sPremiumMonthlyCost, " Premium Combined Monthly Cost ");
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Monthly Combined Standard Cost
			String[] sSC = sStandardSelection.split("£"); //  
			String sStandardMonthlyCost = sSC[1];//  
			// removeStringDebris(sMonthlyCost);		
			sStandardMonthlyCost = sStandardMonthlyCost.replaceAll("[^\\.0123456789]","");			

			//-----------------
			// Normalise After Re-Sample
 			//home_Normalising(sNormalize);   // Null Exception for this combination
			//-----------------
			
			String sReferencePrice = Common_Variables.xmlJointPrice;
			
			//-----------------
			VerifyandReport("Standard_Combined_Monthly_Payment", sReferencePrice, sStandardMonthlyCost, " Standard Combined Monthly Cost ");			
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			break;
			
		case "2":
			sInsType = "Contents";
			sCoverType = sInsType; // For Verification on HMI
			// ---------------------------------------------------------------------------------
			// Premium Checks
	//		callScript("Utilities.Home_Premium_Selection");
			// ---------------------------------------------------------------------------------
			// Monthly Combined Premium Cost
//			sAC = sPremiumSelection.split("£"); //  
//			sPremiumMonthlyCost = sAC[1];//  
//			// removeStringDebris(sMonthlyCost);		
//			sPremiumMonthlyCost = sPremiumMonthlyCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			VerifyandReport("Plus_Contents_Monthly_Payment", Common_Variables.xmlContentsPrice_P, sPremiumMonthlyCost, " Premium Contents Monthly Cost ");
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Monthly Combined Standard Cost
			sSC = sStandardSelection.split("£"); //  
			sStandardMonthlyCost = sSC[1];//  
			// removeStringDebris(sMonthlyCost);		
			sStandardMonthlyCost = sStandardMonthlyCost.replaceAll("[^\\.0123456789]","");				
			//-----------------
			 
			// Normalise After Re-Sample
			//home_Normalising(sNormalize);   // Null Exception for this combination
			//-----------------
			
			sReferencePrice = Common_Variables.xmlContentsPrice;

			//-----------------
			VerifyandReport("Standard_Contents_Monthly_Payment", sReferencePrice, sStandardMonthlyCost, " Standard Contents Monthly Cost ");			
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			break;
			
		case "3":
			sInsType = "Building";
			sCoverType = "Buildings"; // For Verification on HMI
			// ---------------------------------------------------------------------------------
			// Premium Checks
//			callScript("Utilities.Home_Premium_Selection");
			// ---------------------------------------------------------------------------------
			// Monthly Combined Premium Cost
//			sAC = sPremiumSelection.split("£"); //  
//			sPremiumMonthlyCost = sAC[1];//  
//			// removeStringDebris(sMonthlyCost);		
//			sPremiumMonthlyCost = sPremiumMonthlyCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			VerifyandReport("Plus_BUildingss_Monthly_Payment", Common_Variables.xmlBuildingPrice_P, sPremiumMonthlyCost, " Premium Building Monthly Cost ");
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Monthly Combined Standard Cost
			sSC = sStandardSelection.split("£"); //  
			sStandardMonthlyCost = sSC[1];//  
			// removeStringDebris(sMonthlyCost);		
			sStandardMonthlyCost = sStandardMonthlyCost.replaceAll("[^\\.0123456789]","");			
			//-----------------			
 			//home_Normalising(sNormalize);   // Null Exception for this combination
			
			sReferencePrice = Common_Variables.xmlBuildingPrice;
			//-----------------
			VerifyandReport("Standard_Building_Monthly_Payment", sReferencePrice, sStandardMonthlyCost, " Standard Building Monthly Cost ");			
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
		break;
	}


		
		
		
		
//		String[] sAC = sPremiumSelection.split("£"); //  
//		String sAnnualCost = sAC[1];//  
//		// removeStringDebris(sMonthlyCost);		
//		sAnnualCost = sAnnualCost.replaceAll("[^\\.0123456789]","");			
//		//-----------------
//		VerifyandReport("Plus_One_Off_Annual_Payment", Common_Variables.xmlPrice, sAnnualCost, " Annual Cost ");
//		
//		
//		
//		// MONTHLY Standard Selection
//		html_standardSelectDiv().waitForExistence(10,  0.25);
//		html_standardSelectDiv(ANY, READY).click(atPoint(68,86));
//		sleep(1);
//
//		//TODO
//		//String[] sAC = sPremiumSelection.split("£"); // Initial deposit (card payment) 
//		sAnnualCost = sAC[2];// String sInitialDeposit = sIDep.substring(0, i+1);
//		
//		// removeStringDebris(sAnnualCost);		
//		sAnnualCost = sAnnualCost.replaceAll("[^\\.0123456789]","");	
//
//		
//		VerifyandReport("Standard_One_Off_Annual_Payment", Common_Variables.xmlPrice, sAnnualCost, " Annual Cost ");

		//		String sQuoteReferenceID = (String)html_aside().getProperty(".contentText");
//		String sPriceSection = (String)html_priceSection().getProperty(".contentText");
//		String sQuoteReferenceMain = (String)html_main().getProperty(".contentText");
//
//		
//		String sPayMonthlySelected = (String)label_payMonthly().getProperty(".className");
// 		if (sPayMonthlySelected.equalsIgnoreCase("lradio-label lradioselected")){
//			// Monthly Payment Selected
//			//-----------------
//			BrowserSync();
//			// Initial Deposit
//			String[] sId = sPriceSection.split("£"); // Initial deposit (card payment) 
//			String sIDep = sId[2];// String sInitialDeposit = sIDep.substring(0, i+1);
//			i = (Common_Variables.xmlDeposit.length()); // xmlInstallmentAmountDeposit
//			String sInitialDeposit = sIDep.substring(0, i); 
//			//System.out.println(" Init Deposit = "+sInitialDeposit+"   "+sIDep+" "+i); // .trim()
//			//-----------------
//			VerifyandReport("Monthly_Initial_Deposit", Common_Variables.xmlDeposit, sInitialDeposit, " Initial Deposit Cost ");
//			//-----------------
//			// 11 Monthly Payments
//			i = (Common_Variables.xmlInstalmentAmount.length());
//			String[] s11m = sPriceSection.split("£");
//			String s11Pay = s11m[3]; String sElevenPayments = s11Pay.substring(0, i); 
//			//-----------------
//			VerifyandReport("Eleven_Monthly_Payments",Common_Variables.xmlInstalmentAmount, sElevenPayments, " Eleven Monthly Payments ");
//			//-----------------
//			// Total Credit
//			Common_Variables.xmlCalculatedCredit  = Common_Variables.xmlCalculatedCredit.replaceAll("[^\\.0123456789]","");
//			//i = (Common_Variables.xmlCalculatedCredit.length());
//			String[] sTC = sQuoteDetails.split("£");			
//			i = (sTC.length);			
//			String sTotCred = sTC[4]; String sTotalCredit = sTotCred.substring(0, i+1); 
//
//			sTotalCredit = sTotalCredit.replaceAll("[^\\.0123456789]","");	
//
//			
////			removeStringDebris(sTotalCredit);
//			
//			
//			// String to Double
//			double dxmlCalculatedCredit = Double.parseDouble(Common_Variables.xmlCalculatedCredit);
//			// Rounding 2 sig fig
//			dxmlCalculatedCredit = Math.round(dxmlCalculatedCredit*100.0)/100.0;
//			// Double To String
// 			String sxmlCalculatedCredit = Double.toString(dxmlCalculatedCredit);
//			
////			String sxmlCalculatedCredit = "";			
////			round2SigFigs(Common_Variables.xmlCalculatedCredit, sxmlCalculatedCredit);
//			
//			
//			System.out.println(" Screen Credit Value = "+sTotalCredit+" Calculated  "+sxmlCalculatedCredit+" "+i);
//			//-----------------
//			VerifyandReport("Total_Credit", sxmlCalculatedCredit.trim(), sTotalCredit.trim(), " Total Credit ");
//			//-----------------
//			// Total Payable
//			i = (Common_Variables.xmlTotalAmount.length());
//			String[] sTPay = sQuoteDetails.split("£");
//			String sTotPay = sTPay[5]; String sTotalPayable = sTotPay.substring(0, i); 
//			//-----------------
//			VerifyandReport("Total_Payable", Common_Variables.xmlTotalAmount, sTotalPayable, " Total Payable ");
//			//-----------------
//			// COMPARE ON 2 PAGE ITEMS !!!
//			String sSummaryMonthly_ContentText = (String)html_monthlySummary().getProperty(".contentText");
//			//-----------------
//			VerifyandReport("Monthly_Quotes_Match_On_Page", sSummaryMonthly_ContentText.trim(), "£"+sMonthlyAmount.trim(), " Left Hand and Right Hand Primary Monthly Quote Cost ");
//			//-----------------
//			//  Motor Legal (NO LONGER DISPLAYED WITH RH QUOTE WINDOW) DOES FOR MONEYSUPF
//			String sMotorLegalAssistance = "";
//			Double dMotorLegalAssistance = null;
//			
////			if (Common_Variables.sMLA.equalsIgnoreCase("yes")){
////				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
////				String sMotorLA = sMla[2]; 
////				i = sMotorLA.length();
////				sMotorLegalAssistance = sMotorLA.substring(0, i); 
////				//-----------------
//////				System.out.println(" Monthly MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
////				System.out.println(" Monthly MLA = "+sMotorLegalAssistance+" dP  "+Common_Variables.MLA+" "+i);
////				VerifyandReport("Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
////				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
////				// String to Double (For later addition to Insurance Monthly Total)
////				dMotorLegalAssistance = Double.parseDouble(sMotorLegalAssistance);
////				// Rounding 2 sig fig
////				dMotorLegalAssistance = Math.round(dMotorLegalAssistance*100.0)/100.0;
////				//--------------------------------------------------------------------------------------------------------------------
////
////			}
//			
//			
////			try {
////				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
////				String sMotorLA = sMla[2]; 
////				i = sMotorLA.length();
////				sMotorLegalAssistance = sMotorLA.substring(0, i); 
////				//-----------------
////				System.out.println(" Monthly MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
////				VerifyandReport("Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
////				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
////				// String to Double (For later addition to Insurance Monthly Total)
////				dMotorLegalAssistance = Double.parseDouble(sMotorLegalAssistance);
////				// Rounding 2 sig fig
////				dMotorLegalAssistance = Math.round(dMotorLegalAssistance*100.0)/100.0;
////				//--------------------------------------------------------------------------------------------------------------------
////			} catch (Exception e) {
////				System.out.println(" Monthly MLA NOT DETECTED"); 
////				// e.printStackTrace();
////			}
//			//-----------------
//			// Car Insurance
//			i = (Common_Variables.xmlInstalmentAmount.length());
//			String[] sCim = sQuoteDetails.split("Car insurance "); // Car insurance
//			String sCarInsM = sCim[2]; String sCarInsuranceMonth = sCarInsM.substring(1, i+1); // 1 /+1 Cim[2]
//			
//			
//			//String sMotorLegalAss = String.valueOf(sMotorLegalAssistance);
//			//String sCarInsMonth = String.valueOf(sCarInsuranceMonth);
//			
//			// String to Double
//			double dCarInsuranceMonth = Double.parseDouble(sCarInsuranceMonth);
//			
//			// Rounding 2 sig fig
//
//			dCarInsuranceMonth = Math.round(dCarInsuranceMonth*100.0)/100.0;
//
//			// ADD MLA TO INSURANCE COST (If it exists)
////			try{
////				dCarInsuranceMonth = dCarInsuranceMonth + dMotorLegalAssistance;  // was negated
////			} catch (Exception e) {
////				System.out.println(" MLA NOT ADDED TO MONTHLY COST AS MLA NOT DETECTED"); 
////				// e.printStackTrace();
////			}
//			
//			// Double To String
//			sCarInsuranceMonth = Double.toString(dCarInsuranceMonth);
//
//			// ADD MLA TO INSURANCE COST (If it exists)
//			if (Common_Variables.sMLA.equalsIgnoreCase("yes")){
//				dCarInsuranceMonth = dCarInsuranceMonth + 2.43; // dMotorLegalAssistance;
//			
//			
//			//-----------------
//			System.out.println(" MLA "+dMotorLegalAssistance+" Car Insurance Month = "+sCarInsuranceMonth+" Installment Amount "+Common_Variables.xmlInstalmentAmount+" PLUS MLA ");
////			VerifyandReport("Monthly_Car_Insurance_Cost", sCarInsuranceMonth.trim(), Common_Variables.xmlInstalmentAmount, " Car Insurance Monthly Subtotal Cost ");
// 		}}
//
// 		// SELECT YEAR - TO CHECK ALL PARAMETERS
//		// SELECT YEAR - TO CHECK ALL PARAMETERS
//		BrowserSync();		
		
		// HTML Browser
		// Document: RegularExpression(Home Insurance): RegularExpression(nsurance)

	}
}

