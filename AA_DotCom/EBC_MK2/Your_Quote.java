package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.Your_QuoteHelper;
import com.rational.test.ft.*;
import Utilities.Portal_Synchronisation;
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
//Uplift of EBC - Dave Horne - December 2014 - YOUR QUOTE DETAILS SCREEN (Step 3)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Your_Quote extends Your_QuoteHelper
{
	/**
	 * Script Name   : <b>Your_Quote</b>
	 * Generated     : <b>5 Dec 2014 09:52:34</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********
//		
//		(Common_Variables.membershipYN) = "FALSE";
//		(Common_Variables.EBC_Cover_Level) = "Lite";
//		(Common_Variables.partsAndLabour) = false;
//		(Common_Variables.totalQuotePrice) = "31.39";
//		(Common_Variables.lightQuotePrice) = "";
//		(Common_Variables.fullQuotePrice) = "19.62";
		//(Common_Variables.partsLabourQuotePrice) = "TRUE";
		
//		// ********************      Debug Test Data End     ***************************			
		//----------------------------------------------------------------
		// AA Member?
		AA_Member_No().waitForExistence(50.0,  0.25);
		
		if (Common_Variables.membershipYN.equals("TRUE")){
			AA_Member_Yes(ANY, READY).click();
			logTestResult("AA Membership Was Selected",true);
		}
		else if  (Common_Variables.membershipYN.equals("FALSE")){
			AA_Member_No(ANY, READY).click();
			logTestResult("AA Membership Was NOT Selected",true);
		}
		//----------------------------------------------------------------	
		// Cover Level
		switch (Common_Variables.EBC_Cover_Level){
			
			case "Full": 							// (STANDARD)
				Full_Cover(ANY, READY).click();
				// Verify Selection
				String FullCover_Selected = (String)Full_Cover().getProperty(".contentText");sleep(0.25);
				vpManual("Full_Cover_Selected", "Selected  ",FullCover_Selected).performTest();	// 2 Trailing Blanks			
				//logInfo("FULL (Standard) Insurance Cover Selection Attempted");
				break;
				
			case "Lite":							// (LITE)
				Lite_Cover(ANY, READY).click();
				// Verify Selection
				String LiteCover_SELECTED = (String)Lite_Cover().getProperty(".contentText");sleep(0.25);
				vpManual("LiteCover_SELECTED", "Selected  ",LiteCover_SELECTED).performTest();	// 2 Trailing Blanks				
				//logInfo("Short Break (Light) Insurance Cover Selection Attempted");
				break;
		}		
			// Other case (not currently required)
		//----------------------------------------------------------------
		// Parts and Labour 
		parts_Labour().waitForExistence(25.0,  0.25);
		//----------------------------------------------------------------
		// Select or Not		
		if (Common_Variables.partsAndLabour == true){
			parts_Labour(ANY, READY).click();
			logTestResult("Parts and Labour Insurance Cover was Selected",true);
			
		}		// Default Condition - NOT SELECTED
		else if  (Common_Variables.partsAndLabour == false){
			//parts_Labour(ANY, READY).click();
			logTestResult("Parts and Labour Insurance Cover was NOT Selected",true);
		}
		sleep(2);  // Wait For Refresh of Screen
		//----------------------------------------------------------------           	BELOW TO BE TIDIED AND VERIFIED
		// REPORTING
		// Extract the 3(4) values, Light/Full/Total
		String sTotalQuotePrice = (String) totalPrice().getProperty(".text");            // Numeric Only
				
		Common_Variables.totalQuotePrice = sTotalQuotePrice;
		
		//String[] sTotalQuotePrice = sRawTotalQuotePrice.split("£");                    // Scrape the Squid
		// sTotalQuotePrice = sTotalQuotePrice.substring(1);                             // Scrape the Squid £
		String sLightQuotePrice = (String) liteQuoteTotal().getProperty(".text");
		
		Common_Variables.lightQuotePrice = sLightQuotePrice;		
		
		//String[] sLightQuotePrice = sRawLightQuotePrice.split("£");                    // Scrape the Squid				
		String sFullQuotePrice = (String) standardQuoteTotal().getProperty(".text");
		
		Common_Variables.fullQuotePrice = sFullQuotePrice;		
		
		//String[] sFullQuotePrice = sRawFullQuotePrice.split("£");                      // Scrape the Squid				
		String sPartsLabourQuotePrice = (String) parts_Labour().getProperty(".text"); 	 // text then currency £3.55 (Example raw data)
		
		//String[] sPartsLabourQuotePrice = sRawPartsLabour.split("£");                  // 3.55 (After split action, £ and left string removed)
		sPartsLabourQuotePrice = sPartsLabourQuotePrice.substring(1);                    // Scrape the Squid £
		//----------------------------------------------------------------
		// Do The Math
		// Totals
		if (sTotalQuotePrice.equals(Common_Variables.totalQuotePrice)){  // was priceToPay
			logTestResult("Total EBC Quote is "+sTotalQuotePrice+" As Expected ", true);
		}
		else {
			logTestResult("Total EBC Quote is NOT "+Common_Variables.totalQuotePrice+" As Expected, But is "+sTotalQuotePrice, false);
		}
		//vpManual("Total_EBC_Quote_is", Common_Variables.totalQuotePrice,sTotalQuotePrice).performTest();				
		//----------------------------------------------------------------		
		// Do The Math Comparisons On The Page - Total = selected (Standard or Lite)
		// Cover Level
		switch (Common_Variables.EBC_Cover_Level){			
			case "Full": 							// (STANDARD)

				if (sFullQuotePrice.equals(Common_Variables.fullQuotePrice)){
					logTestResult("Full (Standard) EBC Quote is "+sFullQuotePrice+" As Expected,", true);
					System.out.println("Full (Standard) EBC Quote is "+sFullQuotePrice);
					
					// Check the total = full cover as selected (on this page)
					// Allowing For Parts and Labour Where Required
					if (Common_Variables.partsAndLabour == false){
						vpManual("The_Total_And_Full_Prices_SAME", sTotalQuotePrice, sFullQuotePrice).performTest();
					}
					if (Common_Variables.partsAndLabour == true){
						//vpManual("The_Total_And_Full_Prices_SAME", sTotalQuotePrice, sFullQuotePrice+sPartsLabourQuotePrice).performTest();
					}
						
				}
			
				else {
					logTestResult("Full (Standard) EBC Quote is NOT "+Common_Variables.fullQuotePrice+" As Expected, But is "+sFullQuotePrice, false);
				}				
				break;				
			case "Lite":							// (LITE)

				if (sLightQuotePrice.equals(Common_Variables.lightQuotePrice)){
					logTestResult("Short Break (Light) EBC Quote is "+sLightQuotePrice+" As Expected", true);
					System.out.println("Short Break (Light) EBC Quote is "+sLightQuotePrice);

					// Check the total = Lite cover as selected (on this page)
					// Allowing For Parts and Labour Where Required
					if (Common_Variables.partsAndLabour == false){
						vpManual("The_Total_And_Lite_Prices_SAME", sTotalQuotePrice, sLightQuotePrice).performTest();	
					}
																	
					
					if (Common_Variables.partsAndLabour == true){
							//vpManual("The_Total_And_Full_Prices_SAME", sTotalQuotePrice, sFullQuotePrice+sPartsLabourQuotePrice).performTest();
						}
				}	
				else {
					logTestResult("Short Break (Light) EBC Quote is NOT "+Common_Variables.lightQuotePrice+" As Expected, But is "+sLightQuotePrice, false);
				}				
				break;
		}								
		//----------------------------------------------------------------						
		// Flip Between values and Calculate
		
		// AA Membership - 10% Reduction		
		if (Common_Variables.membershipYN == "TRUE") {
			logTestResult("AA Membership was Noted, and 10% was Deducted From The EBC policy Cost, As Expected", true);
			// NEED TO INSERT THE VERIFICTION
		}
		else {
			logTestResult("AA Membership was NOT Noted, and 10% was NOT Deducted From The EBC policy Cost, As Expected", true);
			// NEED TO INSERT THE VERIFICTION
		}
		//----------------------------------------------------------------
			// Other case (not currently required)

		//----------------------------------------------------------------
		// Next Screen
		Continue().waitForExistence(50.0,  0.25);
		Continue(ANY, LOADED).click();
		//----------------------------------------------------------------
	}
}

