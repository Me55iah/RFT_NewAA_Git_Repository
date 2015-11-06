package Basics_Road;
import resources.Common_Variables;
import resources.Basics_Road.Payment_3Helper;
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
public class Payment_3 extends Payment_3Helper
{
	/**
	 * Script Name   : <b>Payment_3</b>
	 * Generated     : <b>11 Feb 2015 13:34:06</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/11
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
		//------------------------------------------------------------------------------------------
		// Synchronise
		//form_directDebitForm(ANY, LOADED).waitForExistence(50, 0.25);
		//sleep(2);
		BrowserSync();
		//------------------------------------------------------------------------------------------
		
//		// Debug
//		String sPriceCarriedForward = "£40.00";
//		Common_Variables.paymentType = "Annual Direct Debit";
//		//String sPriceCarriedForward = Common_Variables.totalQuotePrice;
//		// Debug
		
		//--------------------------------------------------------------
		String sPriceCarriedForward = Common_Variables.totalQuotePrice;
		String sQuickPick = Common_Variables.quickPick;
		//String sTotal_ContentText = ("");
		
 		switch (Common_Variables.paymentType){
		
 			case "Annual Direct Debit": // 2 DD Cases - 2 Variants Exist Currently Accross The AA COM  (HM Variant)
			//------------------------------------------------------------------------------------------
			// ACCOUNT NAME - ***  Reuse of Payment_CardName for sake of repetition  ***
			//------------------------------------------------------------------------------------------
 				html_sortCode().waitForExistence(20, 0.25);
 				// SORT
				html_sortCode(ANY, READY).click(atPoint(20,20));
				iE(document_basicBreakdownInsuran(),DEFAULT_FLAGS).inputChars("089073");
				// ACCOUNT NUMBER
				html_accountNumber(ANY, READY).click(atPoint(62,14));
				iE(document_basicBreakdownInsuran(),DEFAULT_FLAGS).inputChars("08383923");
				// NAME on Account
				text_accountName(ANY, READY).click(atPoint(46,15));
				iE(document_basicBreakdownInsuran(),DEFAULT_FLAGS).inputChars("Burt Millichip");
 								
				//------------------------------------------------------------------------------------------				
		 		// Terms and Conditions
				//label_iConfirmThatYouHaveBroug(ANY, READY).click();				 
		 		//checkBox_ddon().waitForExistence(20, 0.25);
				//checkBox_ddon(ANY, READY).click();
				label_pleaseConfirmThisIsYourA2().click();
				
				
				//button_continuesubmit3().click();
				
				
				
				String sTotalQuotePrice = (String)html_ddTotal().getProperty(".contentText");
				
				sTotalQuotePrice = (sTotalQuotePrice.substring(18));
				
				vpManual("Total_Basic_Selection", sQuickPick, Common_Variables.quickPick).performTest();
				// vpManual("Total_Carried_Forward", sTotalQuotePrice, "£"+sQuickPick).performTest();

				break;
	
 			case "Monthly Direct Debit":				
			//------------------------------------------------------------------------------------------
			// SORT CODE
//			html_sortCode().waitForExistence(10.0,  0.25);
//			html_sortCode(ANY, READY).click(atPoint(23, 19));
//			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.DD_SortCode);
//			//------------------------------------------------------------------------------------------
//			// ACCOUNT NUMBER
//			html_accountNumber().waitForExistence(10.0,  0.25);
//			html_accountNumber(ANY, READY).click(atPoint(23, 19));
//			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.DD_AccountNumber);
//			//------------------------------------------------------------------------------------------
//			// ACCOUNT NAME - ***  Reuse of Payment_CardName for sake of repetition  ***
//			text_accountName().waitForExistence(10.0,  0.25);
//			text_accountName(ANY, READY).click(atPoint(52, 23));//                        V   REUSED   V
//			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.Payment_CardName);
//			//------------------------------------------------------------------------------------------
//			// Accept Conditions - CheckBox
//			checkBox_ddon().waitForExistence(20,  0.25);
//			checkBox_ddon(ANY, READY).click();
//			//------------------------------------------------------------------------------------------
//			// Submit Payment
//			button_continuesubmit().waitForExistence(25.0,  0.25);
//			button_continuesubmit(ANY, READY).click();
//			//------------------------------------------------------------------------------------------
//			sleep(10.0);
//			//------------------------------------------------------------------------------------------
//			boolean Secure = button_continuesubmit().exists();
//			if (Secure == true) {
//				button_continuesubmit(ANY, READY).click();}
				break;
			//---------------------------------------------------
			// ALL Card Transactions, Monthly, Yearly and One Off (Single Trip)	
 			case "Monthly Card Payment":	
 				break;
 			
 			case "Annual Card Payment":   							 
			//------------------------------------------------------------------------------------------
				//------------------------------------------------------------------------------------------
				// Card Type
				list_cardModelTypeModelCodedVa().waitForExistence(20,  0.25);
				list_cardModelTypeModelCodedVa(ANY, READY).click();
				list_cardModelTypeModelCodedVa(ANY, READY).click(atText(Common_Variables.Payment_CardType));
				//------------------------------------------------------------------------------------------
				// Card Number
				html_cardModelAccountNumberMod().waitForExistence(20,  0.25);
				html_cardModelAccountNumberMod(ANY, READY).click(atPoint(23, 19));
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.Payment_CardNumber);
				//------------------------------------------------------------------------------------------
				// Name on Card
				text_cardModelCardholderNameMo().waitForExistence(20,  0.25);
				text_cardModelCardholderNameMo(ANY, READY).click(atPoint(52, 23));
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.Payment_CardName);
				//------------------------------------------------------------------------------------------
				// Expiry Date Month
				list_cardModelExpiryDateModelM().waitForExistence(20,  0.25);
				list_cardModelExpiryDateModelM(ANY, READY).click();
				sleep(0.25);
				
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputChars("11");
				//iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputChars(Common_Variables.endMonth);
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputKeys("{ENTER}");
				//list_cardModelExpiryDateModelM(ANY, READY).click(atText(Common_Variables.endMonth));
				//------------------------------------------------------------------------------------------
				// Expiry Date Year
				list_cardModelExpiryDateModelY().waitForExistence(20,  0.25);
				list_cardModelExpiryDateModelY(ANY, READY).click();
				sleep(0.25);
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputChars("2017");
				//iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputChars(Common_Variables.endYear);
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputKeys("{ENTER}");
				//list_cardModelExpiryDateModelY(ANY, READY).click(atText(Common_Variables.endYear));				
				//------------------------------------------------------------------------------------------
				// Card Security Number
				html_cardModelVerificationNumb().waitForExistence(20,  0.25);
				html_cardModelVerificationNumb(ANY, READY).click(atPoint(30, 22));
				//------------------------------------------------------------------------------------------
				// Payment Security Code					
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.Payment_SecCode);			
				//------------------------------------------------------------------------------------------
				// Confirm Amount
				sTotalQuotePrice = (String) html_total_card_payment().getProperty(".text");
				// sTotalQuotePrice = sTotalQuotePrice.substring(1);                          // Scrape the Squid £
				vpManual("Total_Carried_Forward", sTotalQuotePrice, "£"+sQuickPick).performTest();
				// vpManual("Total_Carried_Forward", sTotalQuotePrice, "£"+sQuickPick).performTest();
				//------------------------------------------------------------------------------------------
//				try {
//					if (Common_Variables.priceToPay.equals(sTotalQuotePrice)){ // was totalQuotePrice
//						logTestResult("The Total Quote as Reported on The Summary Page, is "+sTotalQuotePrice+" As Expected", true);
//					}
//					else {
//						logTestResult("The Total Quote as Reported on The Summary Page, is "+sTotalQuotePrice+" But "+Common_Variables.totalQuotePrice+" Was Expected", false);
//						}
//				} catch (Exception e) {
//					if (Common_Variables.totalQuotePrice.equals(sTotalQuotePrice)){ // was totalQuotePrice
//						logTestResult("The Total Quote as Reported on The Summary Page, is "+sTotalQuotePrice+" As Expected", true);
//					}
//					else {
//						logTestResult("The Total Quote as Reported on The Summary Page, is "+sTotalQuotePrice+" But "+Common_Variables.totalQuotePrice+" Was Expected", false);
//						}
//				}
				//------------------------------------------------------------------------------------------
				// Submit Payment
				if (button_buyNowsubmit().isShowing()){
					button_buyNowsubmit().waitForExistence(25.0,  0.25);
					button_buyNowsubmit(ANY, READY).click();
				}
				//------------------------------------------------------------------------------------------
//				sleep(10.0);
//				//------------------------------------------------------------------------------------------
//				Secure = button_buyNowsubmit().exists();
//				if (Secure == true) {
//					button_buyNowsubmit(ANY, READY).click();}
				//html_total_card_payment().waitForExistence(25,  0.25);
				//sTotal_ContentText = (String)html_total_card_payment().getProperty(".contentText");
				
				//------------------------------------------------------------------------------------------				
				break;
		
 		}	
		//------------------------------------------------------------------------------------------						
		sleep(2);
 		
 		// Price Carried Forward Correctly?
		//------------------------------------------------------------------------------------------				
		
 		//String sPriceCarriedForward = Common_Variables.totalQuotePrice;
		
		//sTotal_ContentText = sTotal_ContentText.substring(18).trim(); 
		
		// Removal all Characters To The £ Sign On Scraped Value
		// System.out.println("Total Price = " +sTotal_ContentText+" And "+sPriceCarriedForward);
		//------------------------------------------------------------------------------------------
		//String sExpectedPrice = "£40.00";
		//vpManual("Total_Carried_Forward", sExpectedPrice, sTotal_ContentText).performTest();          //***************
		//logTestResult("The Price Carried Forward From Previous Page Was "+sPriceCarriedForward+" As Expected ", true);
				
		// VP Long Form Of Above - vpManual
//		if (sExpectedPrice.trim().equalsIgnoreCase(sPriceCarriedForward.trim())){ // sTotal_ContentText
//			logTestResult("The Price Carried Forward From Previous Page Was "+sPriceCarriedForward+" As Expected ", true);
//		}
//		else {
//			logTestResult("The Price Carried Forward From Previous Page Was "+sTotal_ContentText+" But Expected "+sPriceCarriedForward, false);
//		}
		
		//------------------------------------------------------------------------------------------
		// Submit Payment

		sleep(2);

		if (button_continuesubmit().exists()){
	 		button_continuesubmit().waitForExistence(25.0,  0.25);
	 		button_continuesubmit(ANY, READY).click();
	 	}
		
		//------------------------------------------------------------------------------------------
		try {
			String sPleaseConfirmYouHaveReadThis = (String)label_pleaseConfirmYouHaveRead().getProperty(".contentText");
			
			//------------------------------------------------------------------------------------------
			if (sPleaseConfirmYouHaveReadThis.contains("Please confirm you have read this information")){
				
				label_pleaseConfirmThisIsYourA2(ANY, READY).click();
				
		 		button_continuesubmit().waitForExistence(2.0,  0.25);
		 		button_continuesubmit(ANY, READY).click();
			//------------------------------------------------------------------------------------------
			}
		} catch (ObjectNotFoundException e) {
			
			
		}
		
		
		//iE().close();
 		//------------------------------------------------------------------------------------------

	//------------------------------------------------------------------------------------------			
	//------------------------------------------------------------------------------------------		
	}
}

