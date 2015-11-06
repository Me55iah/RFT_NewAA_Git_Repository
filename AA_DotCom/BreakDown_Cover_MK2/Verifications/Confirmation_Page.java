package BreakDown_Cover_MK2.Verifications;
import java.awt.List.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays.*;
import java.util.regex.Matcher;
//import com.google.common.collect.ListsLists;

import resources.Common_Variables;
import resources.BreakDown_Cover_MK2.Verifications.Confirmation_PageHelper;
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
public class Confirmation_Page extends Confirmation_PageHelper
{
	/**
	 * Script Name   : <b>Confirmation_Page</b>
	 * Generated     : <b>11 Jun 2015 09:47:28</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/11
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
		sCustomer_Name = sCustomer_Name.toUpperCase();
	
//		String sVariableName = "";
//		String sVariableContent = "";	
//		String sStartingPoint = "";
//		String sEndingPoint = "";
		
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
		
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)html_container().getProperty(".text");
		//------------------------------------------------------------
		
		//------------------------------------------------------------
		// TOTAL COST
		//------------		
		// Length of Comparison String - From Initial (Reference) Value		
		int i = (sPricevalue.length());
		//------------		
		// Grab ALL Text From "Total cost: " Sub String 
		//------------------------------------------------------------
		String[] sFromTC = sContainer_Text.split("Total cost: ");
		//------------------------------------------------------------
		// Assign Above Sub String To String sTotalCost
		String sTotalCost = sFromTC[1];
		//------------------------------------------------------------
		// Detect CC Charge For Branch
		if (!sContainer_Text.contains("First month instalment")){
			//------------------------------------------------------------
			// Truncate sTotalCost To Match The Length Of The Datum Value (sPricevalue) Reference
			sTotalCost = sTotalCost.substring(0, i);
			//------------------------------------------------------------
			// VERIFY - Compare Initial With Final Displayed Values
			VerifyandReport("Confirmation_Page_Total_Cost", sPricevalue, sTotalCost, " Total Cost ");
			//------------------------------------------------------------
		}
		else {
			//------------------------------------------------------------
			// This Is The CC Charge Detection and TOTALS Branch
			i = (sTotalCost.indexOf("First month instalment"));
			//------------------------------------------------------------
			sTotalCost = sTotalCost.substring(0, i);
			//------------------------------------------------------------
			// First Month Installment
			//------------------------------------------------------------
			String[] sFMI = sContainer_Text.split("First month instalment ");
			//------------------------------------------------------------
			// Assign Above Sub String To String sTotalCost
			String sFirstMonthInstallment = sFMI[1];
			//------------------------------------------------------------
			// First Month Installment
			sFirstMonthInstallment = sFirstMonthInstallment.substring(0, 7);
			System.out.println("First Installment = "+sFirstMonthInstallment); 
			//------------------------------------------------------------
			// credit-card fee
			//------------------------------------------------------------
			String[] sCCF = sContainer_Text.split("credit-card fee ");
			//------------------------------------------------------------
			// Assign Above Sub String To String sTotalCost
			String sCreditCardFee = sCCF[1];
			//------------------------------------------------------------
			// First Month Installment
			sCreditCardFee = sCreditCardFee.substring(0, 6);
			System.out.println("Credit Card Fee = "+sCreditCardFee); 
			//------------------------------------------------------------
			// VERIFY - Compare Initial With Final Displayed Values
			VerifyandReport("Confirmation_Page_Total_Cost", sTotalCost, sTotalCost, " Total Cost ");
			//------------------------------------------------------------
		}
		//------------------------------------------------------------
		// Console Reporting
		System.out.println("Total Cost = "+sTotalCost); 
		//System.out.println("Total Cost String Length = "+i); 
		//------------------------------------------------------------
		// F U L L    N A M E
		//------------------------------------------------------------
		// Grab ALL Text From "We have you covered " Sub String 
		//------------------------------------------------------------
		// Length of Comparison String - From Initial (Reference) Value	
		i = (sCustomer_Name.length());
		// Customer Name
		sFromTC = sContainer_Text.split("We have you covered "); 
		//------------------------------------------------------------
		// Assign Above Sub String To String sCustomer
		String sCustomer = sFromTC[1];
 		//------------------------------------------------------------
		// Truncate sTotalCost To Match The Length Of The Datum Value (sPricevalue) Reference
		sCustomer = sCustomer.substring(0, i);
		//------------------------------------------------------------
		// VERIFY - Compare Initial With Final Displayed Values
		VerifyandReport("Confirm_Main_Member_Name", sCustomer_Name, sCustomer, "Customer Name ");
		//------------------------------------------------------------
		// Console Reporting
		System.out.println("Customer Name = "+sCustomer); 
		//System.out.println("Customer Name String Length = "+i); 
		//------------------------------------------------------------
		
		//------------------------------------------------------------
		// HIGHLIGHTED CENTRAL SECTION OF PAGE START
		//------------------------------------------------------------
 
 		String[] sFromThanks = sContainer_Text.split("Thanks for buying AA Breakdown Cover");
 
 		// DEBUG CONTAINED TEXT
 		// System.out.println("ALL CONTAINER TEXT = "+sALL);
		
		//------------------------------------------------------------
 		// Membership Number                        TODO No Current Reference From Process Start
		//------------------------------------------------------------
 		
 		sFromThanks = sContainer_Text.split("Membership number ");
		// Assign Above Sub String To String sCustomer
 		sMembershipNumber = sFromThanks[1];
 		i = 16;
 		//------------------------------------------------------------
 		sMembershipNumber = sMembershipNumber.substring(0, i);
 		//------------------------------------------------------------
		VerifyandReport("Confirm_Membership_Number", sMembershipNumber, sMembershipNumber, " Membership Number ");
		//------------------------------------------------------------
		// Console Reporting
		System.out.println("Membership Number = "+sMembershipNumber); 
		
		try {
			//------------------------------------------------------------
			// Additional Members                         
			//------------------------------------------------------------
			// DESTRUCTIVE TO UNDERLYING STRING
			// FIND FROM "Additional members ">
			sFromThanks = sContainer_Text.split("Additional members ");
			// Assign Above Sub String To String sCustomer               // Additional members MISS Pauline Plunkett MS PSLAMI PLINKINGSPURSPUR MR Ronnie Van Persil Cover
			//------------------------------------------------------------
			String sAdditional_Members = sFromThanks[1];
			// Grab SubString From Index 0 to Occurance Of "Cover" In String 		
			//------------------------------------------------------------
			// FIND TO <"Cover"
			i = (sAdditional_Members.indexOf("Cover"));
			//------------------------------------------------------------
			// Truncate End Pre-Marker 1 ("Additional members ") and Start Post_Marker 2 ("Cover")
			//------------------------------------------------------------
			sAdditional_Members = sAdditional_Members.substring(0, i);
			//------------------------------------------------------------

			//String sAdditionalMembers = sFromThanks[1];
			System.out.println("Additional Members = "+sAdditional_Members); 
			//System.out.println("Additional Members Length = "+ i);
		} catch (Exception e) {
			
			System.out.println("No Additional Members In This Instance"); 
		}

 		//------------------------------------------------------------
		// Cover
 		//------------------------------------------------------------
		// Grab AGAIN ALL Text Due To Destructive Nature Of Above
		sContainer_Text = (String)html_container().getProperty(".text");
		//------------------------------------------------------------
		// FIND FROM "Cover ">
		sFromThanks = sContainer_Text.split(" Cover ");
		//------------------------------------------------------------
		String sCover = sFromThanks[2];
		//------------------------------------------------------------
//		System.out.println("ALL CONTAINER TEXT = "+sFromThanks);
		//------------------------------------------------------------
 		// FIND TO <"Total"
 		i = (sCover.indexOf(" Total"));
		//------------------------------------------------------------
 		// Truncate End Pre-Marker 1 ("Cover ") and Start Post_Marker 2 ("Total")
 		//------------------------------------------------------------
 		try {
			sCover = sCover.substring(0, i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} 		
 		//------------------------------------------------------------
		System.out.println("Cover Includes = "+sCover+"."); 
 		//------------------------------------------------------------
		// HIGHLIGHTED CENTRAL SECTION OF PAGE END
		//------------------------------------------------------------
		
		//----------------------------------------------------------------------	
		System.out.println("---------------------------------------------------");
		System.out.println("Road Breakdown Test Journey Completed - Scenario "+Common_Variables.currentRow);
		System.out.println("---------------------------------------------------");
		//----------------------------------------------------------------------	
		 
	}
}

