package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.Payment_OptionsHelper;
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

////////////////////////////////////////////////////////////////////////////////////////
//
//Uplift of EBC - Dave Horne - December 2014 - CARD PAYMENT DETAILS SCREEN (Step 6)
//
////////////////////////////////////////////////////////////////////////////////////////


// GEeneric Script Exist Under Generic_Scripts, But ReWriting Due TO Angular ng Environment

public class Payment_Options extends Payment_OptionsHelper
{
	/**
	 * Script Name   : <b>Your_Card_Payment</b>
	 * Generated     : <b>23 Dec 2014 10:22:52</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2014/12/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Debug Test Data Start   **** COMMENT I AND OUT AS REQUIRED ****
		
//		(Common_Variables.totalQuotePrice) = "£31.39";
//		(Common_Variables.Payment_CardType) = "Visa Debit";
//		(Common_Variables.Payment_CardNumber) = "4508235106432165";
//		(Common_Variables.Payment_CardName) = "Mr Burt Millipede";
//		(Common_Variables.endMonth) = "11";
//		(Common_Variables.endYear) = "2017";
//		(Common_Variables.Payment_SecCode) = "222";
//		(Common_Variables.DD_SortCode) = "222";
//		(Common_Variables.DD_AccountNumber) = "222";		
		
		// ********************      Debug Test Data End     ***************************	
		// CARD PAYMENT COMBINATIONS
		//--------------------------------------------------------------------
		BrowserSync();
		
		// Payment Type
			if (Common_Variables.paymentType.contains("Card Payment")){
				Common_Variables.paymentType = "Card Payment";
			}
				
			switch (Common_Variables.paymentType){
		
			case "Direct Debit": // 2 DD Cases - 2 Variants Exist Currently Accross The AA COM  (HM Variant)
				//------------------------------------------------------------------------------------------
				// ACCOUNT NAME - ***  Reuse of Payment_CardName for sake of repetition  ***
				text_holdersName().waitForExistence(10.0,  0.25);
      			text_holdersName().click(atPoint(68,25));
				iE(AA(),DEFAULT_FLAGS).inputChars("HRH The Laird of Longavvion");
				text_accountNumber().waitForExistence(10.0,  0.25);
				text_accountNumber().click(atPoint(99,13));
				iE(AA(),DEFAULT_FLAGS).inputChars("12345678");
				html_sortCode1().waitForExistence(10.0,  0.25);
				html_sortCode1().click(atPoint(67,20));
				iE(AA(),DEFAULT_FLAGS).inputChars("80");
				html_sortCode1().waitForExistence(10.0,  0.25);
				html_sortCode2().click(atPoint(13,27));
				iE(AA(),DEFAULT_FLAGS).inputChars("02");
				html_sortCode1().waitForExistence(10.0,  0.25);
				html_sortCode3().click(atPoint(8,29));
				iE(AA(),DEFAULT_FLAGS).inputChars("15");	
				//-------------------------------------
				checkBox_termsDDon().waitForExistence(10,  0.25);
				checkBox_termsDDon().click();
				//-------------------------------------
				button_nextsubmit().waitForExistence(25.0,  0.25);
				button_nextsubmit(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				break;
		
			case "Monthly Direct Debit":				
				//------------------------------------------------------------------------------------------
				// SORT CODE
				html_sortCode().waitForExistence(10.0,  0.25);
				html_sortCode(ANY, READY).click(atPoint(23, 19));
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.DD_SortCode);
				//------------------------------------------------------------------------------------------
				// ACCOUNT NUMBER
				html_accountNumber().waitForExistence(10.0,  0.25);
				html_accountNumber(ANY, READY).click(atPoint(23, 19));
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.DD_AccountNumber);
				//------------------------------------------------------------------------------------------
				// ACCOUNT NAME - ***  Reuse of Payment_CardName for sake of repetition  ***
				text_accountName().waitForExistence(10.0,  0.25);
				text_accountName(ANY, READY).click(atPoint(52, 23));//                        V   REUSED   V
				iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(Common_Variables.Payment_CardName);
				//------------------------------------------------------------------------------------------
				// Accept Conditions - CheckBox
				checkBox_ddon().waitForExistence(20,  0.25);
				checkBox_ddon(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				// Submit Payment
				button_continuesubmit().waitForExistence(25.0,  0.25);
				button_continuesubmit(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				sleep(10.0);
				//------------------------------------------------------------------------------------------
				boolean Secure = button_continuesubmit().exists();
				if (Secure == true) {
					button_continuesubmit(ANY, READY).click();}
				break;
				//---------------------------------------------------
				// ALL Card Transactions, Monthly, Yearly and One Off (Single Trip)	
			case "Card Payment":   							 
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
				String sTotalQuotePrice = (String) html_total_card_payment().getProperty(".text");
				sTotalQuotePrice = sTotalQuotePrice.substring(1);                          // Scrape the Squid £
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
				break;
			}		
		//------------------------------------------------------------------------------------------
		// Submit Payment
		button_buyNowsubmit().waitForExistence(25.0,  0.25);
		button_buyNowsubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		boolean Secure = button_buyNowsubmit().exists();
		if (Secure == true) {
			button_buyNowsubmit(ANY, READY).click();}
					
		//------------------------------------------------------------------------------------------			
		//------------------------------------------------------------------------------------------		
	}
}

