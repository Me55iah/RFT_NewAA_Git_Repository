package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Your_QuoteHelper;
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
public class Your_Quote extends Your_QuoteHelper
{
	/**
	 * Script Name   : <b>Your_Quote</b>
	 * Generated     : <b>2 Jun 2015 15:18:08</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// Verification  -  CONFIRM SCREEN TRANSITION - NO VALIDATION ERRORS!!!!
		String svTitle = "Your_Quote_Data";
		String sReport = "Your Quote Data Was Created Successfully, Payment Screen Appeared As Expected";
		String sExpected = "payment"; //Your car insurance 
		String sActual = "";
		//--------------------------------------------------------------------------------		
		// Initial Quote Pricing Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Initial_Quote_Pricing");
		//--------------------------------------------------------------------------------		
		// Excess Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Policy_Excess");         // NEEDS RELOCATING AFTER EXTRA COVER (EXCESS RECALCULATION)
		//--------------------------------------------------------------------------------		
		// Offer Details
		//--------------------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Policy_Offers");
		//--------------------------------------------------------------------------------		
		// Extra Cover Default Settings
		//--------------------------------------------------------------------------------	
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Extra_Cover_Defaults");
		//--------------------------------------------------------------------------------		
		// Extra Cover Details
		//--------------------------------------------------------------------------------	
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Extra_Cover");
		//--------------------------------------------------------------------------------		
		// Policy Document Option Details
		//--------------------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Policy_Document");
		//--------------------------------------------------------------------------------		
		// Chose How To Pay (Frequency) Details
		//--------------------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Payment_Frequency");
		//--------------------------------------------------------------------------------		
		// Final (SUMMARY) Quote Pricing Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Final_Quote_Pricing");   // REMOVE / REPLACE WITH BELOW ???????
		//--------------------------------------------------------------------------------		
		// PAYMENT SUMMARY Quote Pricing ALL Details
		//--------------------------------------------------------------------		
//		unregisterAll();
//		System.gc();	
//		//-----------------------------------------------------------------------------------------
//		// Payment Frequency - Type
//		String sPaymentFrequency = Common_Variables.paymentType; 	 
//		//------------------------------------------------------------------------------------------
//		// Default MONTHLY OPTION
//		switch (sPaymentFrequency){
//			//--------------------------------------------
//			// MONTHLY PAYMENTS (Default)
//			//--------------------------------------------
//			case "Instalment":
//				// MONTHLY - DATA SCRAPE
//				callScript("Motor_MK2.Your__Quote.Payment_Summary.Monthly_Payment_Summary");  // Final  Capture Of All For Later Verification
//				break;
//			//--------------------------------------------
//			// Annual Single Payment
//			//--------------------------------------------
//			case "Single Payment":
//				// ANNUAL - DATA SCRAPE
//				callScript("Motor_MK2.Your__Quote.Payment_Summary.Annual_Payment_Summary");  // Final  Capture Of All For Later Verification
//				break;	
//		}		
		//-----------------------------------------------------------------------------------------
		// QUOTE DETAILS - and EMAIL
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Quote_Reference_and_Email");
		//--------------------------------------------------------------------------------		
		// COMMIT YOUR QUOTE DETAILS (and take a picture)
		
		//--------------------------------------------------------------------------------				
		logInfo(Common_Variables.intermediateQuoteReference+" Quote Reference To Policy Number",getRootTestObject().getScreenSnapshot());
		//--------------------------------------------------------------------------------				
		// Write to DP and Console
		//setDatapool("Motor_MK2.Motor_MK2.Quote_Reference",Common_Variables.intermediateQuoteReference);
		//System.out.println(" 1 "+sActual);
		
		//--------------------------------------------------------------------------------				
		button_nextsubmit().waitForExistence(20,  0.25);
		button_nextsubmit(ANY, READY).click();
		//--------------------------------------------------------------------
		BrowserSync();		
		//--------------------------------------------------------------------------------		
		// Boost Your Cover
		//--------------------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Quote.Boost_Your_Cover");   // REMOVE  ???????
		//--------------------------------------------------------------------------------	
		// Check Your Details
//		//--------------------------------------------------------------------------------	
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.Your__Quote.Check_Your_Details");
//		//--------------------------------------------------------------------------------		
		// QUOTE DETAILS - and EMAIL
		//--------------------------------------------------------------------
		// ADDITIONAL CAR DETAILS - PRESENTED WHEN CAR WAS NOT FOUND DURING INITIAL DETAIL ENTRY
		try {
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Your__Quote.Additional_Car_Details");
		} catch (Exception e1) {
			
			//e1.printStackTrace();
		}
		//--------------------------------------------------------------------------------	
		// Check Your Details
		//--------------------------------------------------------------------------------	
		// Relates To Above Step. 
		try {
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Your__Quote.Check_Your_Details");
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//--------------------------------------------------------------------------------		
//		// Scrape Following Screen (BOOST YOUR COVER) for ACTUAL Value to Compare
//		// CARD OR DD HENCE THE DETECTION
//		if (html_main().exists()){
//			sActual = (String)html_main().getProperty(".text");
//			System.out.println(" 1 "+sActual);
//			if (sActual.contains("payments"));{
//				sActual = "payment";
//			}
//		}
//		//--------------------------------------------------------------------
////		if (label_iConfirmThatYouHaveBroug().exists()){
////			sActual = (String)label_iConfirmThatYouHaveBroug().getProperty(".text");
////			if (sActual.contains("completing my purchase")){
////				sActual = "payment"; // Your car insurance 
////			 	}
////			}  		
//		//--------------------------------------------------------------------
//		// DD
//		if (html_main_DD().exists()){
//			sActual = (String)html_main_DD().getProperty(".text");
//			System.out.println(" 2 "+sActual);
//			if (sActual.contains("payments"));{
//				sActual = "payment";
//			}
//		}
//		//--------------------------------------------------------------------
//		// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
//		VerifyandReport(svTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------
		//stop();
		// END OF YOUR QUOTE DETAILS
		//--------------------------------------------------------------------
	}
}

