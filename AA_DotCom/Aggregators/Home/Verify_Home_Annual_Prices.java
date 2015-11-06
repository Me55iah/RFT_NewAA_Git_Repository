package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Verify_Home_Annual_PricesHelper;
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
public class Verify_Home_Annual_Prices extends Verify_Home_Annual_PricesHelper
{
	/**
	 * Script Name   : <b>Verify_Home_Annual_Prices</b>
	 * Generated     : <b>11 May 2015 11:58:45</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/11
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

		// ANNUAL
		
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
		
		
		
		 
//		if (Common_Variables.xmlAffinity.contains("comparethemarket")||(Common_Variables.firstPass==false)){
//			
//			Common_Variables.firstPass = true;
//			// Works OK
//			 
//		}
//		
//		else{  // Remove This, Re-sample Process From Above Branch
//			if (sInsType.equals("1")){
//				System.out.println(" MSM/Conf/GoCom Combined Issues To Resolve - Page Presentation Different");
//				 
//				// Combined Quote Page Returned, Is Different From The CTM and contents or Buildings Quote of These Affinities
//
//				// DOn't return, Navigate away then back to combined quote
//				return;
//			}
//		}
			 
		 

		
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Home_Annual_Selector");
		//------------------------------------------------------------------------------------------
		// 
		// Type Normalisation
		String sNormalize = null;

		switch (sInsType){
			
		case "1":
			sInsType = "Joint";
			sCoverType = "Buildings & Contents"; // For Verification on HMI
			// ---------------------------------------------------------------------------------

			// NOT CTM? - Re-sample To Show Updated HMI for BUILDINGS AND CONTENTS ONLY
			// ONLY DO THIS ONCE - 1ST PASS IS ANNUAL - SO DO IT HERE - EXIST IN MONTHLY BUT COMMENTED
			//
//			if (!Common_Variables.xmlAffinity.contains("comparethemarket")){
//				callScript("Aggregators.Home.Policy_Resample");
//			}

			
			// ---------------------------------------------------------------------------------
			// Premium Checks
			callScript("Utilities.Home_Premium_Selection");
//			// ---------------------------------------------------------------------------------
//			// Annual Combined Premium Cost
//			String[] sAC = sPremiumSelection.split("£"); //  
//			String sPremiumAnnualCost = sAC[1];//  
//			// removeStringDebris(sAnnualCost);		
//			sPremiumAnnualCost = sPremiumAnnualCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			// PLUS CALCULATION
//			//String sPlusCalculation = (Common_Variables.xmlJointPrice * 1.3413);
//			
//			VerifyandReport("Plus_Combined_Annual_Payment", Common_Variables.xmlJointPrice, sPremiumAnnualCost, " Premium Combined Annual Cost "); // xmlJointPrice_P
			
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Annual Combined Standard Cost
			String[] sSC = sStandardSelection.split("£"); //  sStandardSelection  sQuoteReferenceID
			String sStandardAnnualCost = sSC[1];//  1 - MoneySuperMarket Screen Presentation Different
			// removeStringDebris(sAnnualCost);		
			sStandardAnnualCost = sStandardAnnualCost.replaceAll("[^\\.0123456789]","");			

			//-----------------
			// Normalise After Re-Sample
			//home_Normalising(sNormalize);
			//-----------------
			
			String sReferencePrice = Common_Variables.xmlJointPrice;
			//-----------------
			VerifyandReport("Standard_Combined_Annual_Payment",sReferencePrice, sStandardAnnualCost, " Standard Combined Annual Cost ");			
			// ---------------------------------------------------------------------------------
			
			System.out.println(" xml Joint Price "+Common_Variables.xmlJointPrice);
			System.out.println(" Screen Contents Price "+sStandardAnnualCost);
			
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			break;
			
		case "2":
			sInsType = "Contents";
			sCoverType = sInsType; // For Verification on HMI
			// ---------------------------------------------------------------------------------
			// Premium Checks
//			callScript("Utilities.Home_Premium_Selection");
			// ---------------------------------------------------------------------------------
//			// Annual Combined Premium Cost
//			sAC = sPremiumSelection.split("£"); //  
//			sPremiumAnnualCost = sAC[1];//  
//			// removeStringDebris(sAnnualCost);		
//			sPremiumAnnualCost = sPremiumAnnualCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			VerifyandReport("Plus_Contents_Annual_Payment", Common_Variables.xmlContentsPrice_P, sPremiumAnnualCost, " Premium Contents Annual Cost ");
//			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Annual Combined Standard Cost
			sSC = sStandardSelection.split("£"); // sStandardSelection   sQuoteReferenceID
			sStandardAnnualCost = sSC[1];//    1 - MoneySuperMarket Screen Presentation Different
			// removeStringDebris(sAnnualCost);		
			sStandardAnnualCost = sStandardAnnualCost.replaceAll("[^\\.0123456789]","");		
			
			//-----------------
			// Normalise After Re-Sample
			
			// home_Normalising(sNormalize);
			//-----------------
			
			sReferencePrice = Common_Variables.xmlContentsPrice;
			//-----------------
			//VerifyandReportDB("Standard_Contents_Annual_Payment", dSAT, dADJ, " Standard Contents Annual Cost ");			
			VerifyandReport("Standard_Contents_Annual_Payment", sReferencePrice, sStandardAnnualCost, " Standard Contents Annual Cost ");			
			// ---------------------------------------------------------------------------------

			System.out.println(" xml Contents Price "+Common_Variables.xmlContentsPrice);
			System.out.println(" Screen Contents Price "+sStandardAnnualCost);

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
//			// Annual Combined Premium Cost
//			sAC = sPremiumSelection.split("£"); //  
//			sPremiumAnnualCost = sAC[1];//  
//			// removeStringDebris(sAnnualCost);		
//			sPremiumAnnualCost = sPremiumAnnualCost.replaceAll("[^\\.0123456789]","");			
//			//-----------------
//			VerifyandReport("Plus_BUildingss_Annual_Payment", Common_Variables.xmlBuildingPrice_P, sPremiumAnnualCost, " Premium Building Annual Cost ");
			// ---------------------------------------------------------------------------------
			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
			// Standard Checks
			callScript("Utilities.Home_Standard_Selection");
			// ---------------------------------------------------------------------------------
			// Annual Combined Standard Cost
			//sSC = sStandardSelection.split("£"); //  
			//sStandardAnnualCost = sSC[1];//  
			sSC = sStandardSelection.split("£"); // sStandardSelection   sQuoteReferenceID
			sStandardAnnualCost = sSC[1];//    1 - MoneySuperMarket Screen Presentation Different

			
			// removeStringDebris(sAnnualCost);		
			sStandardAnnualCost = sStandardAnnualCost.replaceAll("[^\\.0123456789]","");		
			//-----------------
//			home_Normalising(sReferencePrice, sNormalizeOutRefPrice);

			//-----------------			
			//home_Normalising(sNormalize);
			System.out.println(" xml Buildingd Price "+Common_Variables.xmlBuildingPrice);
			System.out.println(" Screen Contents Price "+sStandardAnnualCost);
			
			sReferencePrice = Common_Variables.xmlBuildingPrice;
			//-----------------
			VerifyandReport("Standard_Building_Annual_Payment", sReferencePrice, sStandardAnnualCost, " Standard Building Annual Cost ");			
			// ---------------------------------------------------------------------------------


			// Verify The 3 Instances Of This Value On This Page Are Equal
			//TODO
			// ---------------------------------------------------------------------------------
		break;
	}

		
	//stop();
		
		
//		// ANNUAL
//		String sPayYearlySelected = (String)label_annualPayment().getProperty(".className");
//		if (sPayYearlySelected.equalsIgnoreCase("lradio-label lradioselected")){
//			// Annual Payment Selected
//			String sSummaryAnnual_ContentText = (String)html_standardSelectDiv().getProperty(".contentText");			
//			//-----------------
//			VerifyandReport("Annual_Quotes_Match_On_Page", "£"+sAnnualAmount.trim(), sSummaryAnnual_ContentText.trim(), "  Left Hand and Right Hand Primary Annual Quote Cost ");
//			//-----------------
//			// Motor Legal (NO LONGER DISPLAYED WITH RH QUOTE WINDOW) DOES FOR MONEYSUPF
//			try {
//				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
//				String sMotorLA = sMla[1]; String sMotorLegalAssistance = sMotorLA.substring(0, i+1); 
//				//-----------------
//				System.out.println(" Annual MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
//				VerifyandReport("Annual_Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
//				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
//
//			//--------------------------------------------------------------------------------------------------------------------
//			} catch (Exception e) {
//				System.out.println(" Annual MLA NOT DETECTED"); 
//				// e.printStackTrace();
//			}
//			////-----------------		
//			// Car Insurance
//			i = (Common_Variables.xmlPrice.length());
//			String[] sCiA = sQuoteDetails.split("Car insurance "); // Small Text Below LARGE - Reflecting Same Amount
//			String sCarInsA = sCiA[1]; String sCarInsuranceAnnual = sCarInsA.substring(1, i+1); 
//			//-----------------
////			VerifyandReport("Annual_Car_Insurance_Cost", sCarInsuranceAnnual.trim(), Common_Variables.xmlPrice, " Car Insurance Annual Subtotal Cost ");
//		}		
		//-------------------------------------------------------------------------		
		// RESET YEAR SELECTION BACK TO MONTH FOR TIDYNESS
		// RESET YEAR SELECTION BACK TO MONTH FOR TIDYNESS
		//-------------------------------------------------------------------------
		
		
		
	}
}

