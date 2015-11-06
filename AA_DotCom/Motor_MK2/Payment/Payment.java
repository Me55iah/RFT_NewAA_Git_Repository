package Motor_MK2.Payment;
import resources.Common_Variables;
import resources.Motor_MK2.Payment.PaymentHelper;
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
public class Payment extends PaymentHelper
{
	/**
	 * Script Name   : <b>Payment_Options</b>
	 * Generated     : <b>7 Jul 2015 11:54:08</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/07
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
//		// Test data
//	    String sCardNumber = "4263971921001307"; 
//	    String sCardType = "Visa";
//	    String sCardName = "Ben Nevis";
//	    String sSortCode = "089073";
//	    String sAccountNumber = "08383923";
//		String sAccountName = sCardName;
//		// Test data
		//-----------------------------------------------------------------------------------------
		// String sPaymentFrequency = "Single Payment";
		//-----------------------------------------------------------------------------------------		
		BrowserSync(); // Synchronise
		//-----------------------------------------------------------------------------------------
		// Payment Frequency - Type
		String sPaymentFrequency = Common_Variables.paymentType;  //	 NOTUSED
		//------------------------------------------------------------------------------------------
		// CARD
	    String sCardNumber = Common_Variables.Payment_CardNumber; 
	    String sCardType = Common_Variables.Payment_CardType;
	    String sCardName = Common_Variables.Payment_CardName;
 		String sAccountNumber = Common_Variables.Payment_Bank_Account_Number;
 		String sAccountName = Common_Variables.Payment_CardName;//		
 		String sSortCode = Common_Variables.Payment_Bank_Sortcode;
 		//----------------------------------------------------------------  TO TRY CATCH
//		// To DP IF Required - Crack SC To Sub Elements
		String sSortCode1 = sSortCode.substring(0, 2);
		String sSortCode2 = sSortCode.substring(2, 4);
		String sSortCode3 = sSortCode.substring(4, 6);
		//----------------------------------------------------------------	
		sleep(1);
 		// BrowserSync();
		// Synch
 		// Just Detect The Payment Method Presented, Rather Than Drive From DataPool
		//----------------------------------------------------------------
		// Direct Debit Payment (DD Always First Option Presented)
		//----------------------------------------------------------------
		if (html_bankSortCode1().exists()){
			//-----------
			// SORT CODE **_nn_nn (1)
			html_bankSortCode1().waitForExistence(25.0,  0.25);
			html_bankSortCode1(ANY, READY).click(atPoint(38,8));
			iE(doc_carInsuranceYourDirectDebit(),DEFAULT_FLAGS).inputChars(sSortCode1);
			//-----------
			// SORT CODE nn_**_nn (2)
			html_bankSortCode2().waitForExistence(25.0,  0.25);
			html_bankSortCode2(ANY, READY).click(atPoint(38,8));
			iE(doc_carInsuranceYourDirectDebit(),DEFAULT_FLAGS).inputChars(sSortCode2);
			//-----------
			// SORT CODE nn_nn_** (3)
			html_bankSortCode3().waitForExistence(25.0,  0.25);
			html_bankSortCode3(ANY, READY).click(atPoint(38,8));
			iE(doc_carInsuranceYourDirectDebit(),DEFAULT_FLAGS).inputChars(sSortCode3);
			//----------------------------------------------------------------
			// ACCOUNT NUMBER
			html_bankAccountNumber().waitForExistence(25.0,  0.25);
			html_bankAccountNumber(ANY, READY).click(atPoint(40,10));
			iE(doc_carInsuranceYourDirectDebit(),DEFAULT_FLAGS).inputChars(sAccountNumber);
			//----------------------------------------------------------------
			// ACCOUNT NAME
			text_bankAccountName().waitForExistence(25.0,  0.25);
			text_bankAccountName(ANY, READY).click(atPoint(40,10));
			iE(doc_carInsuranceYourDirectDebit(),DEFAULT_FLAGS).inputChars(sAccountName);
			//----------------------------------------------------------------
			// Confirm Authorised Account Holder
			label_ConfirmAccountHolder().waitForExistence(25.0,  0.25);
			label_ConfirmAccountHolder(ANY, READY).click(atPoint(40,10));
			//----------------------------------------------------------------
			// SUBMIT
			//if (button_buyBreakdownCoversubmit().exists()){
			button_nextsubmit().waitForExistence(25.0,  0.25);
			button_nextsubmit(ANY, READY).click();
			//}
		}
		//----------------------------------------------------------------
		// Card Payment
		//----------------------------------------------------------------
		BrowserSync();
		if (html_cardNumber().exists()){
			// -------------------------------------------------------------------------------------------------
			// Card Payment
			// -------------------------------------------------------------------------------------------------
			// Type
			// -------------------------------------------------------------------------------------------------
			list_cardType().waitForExistence(25,  0.25);
			list_cardType(ANY, READY).click();
			sleep(0.5);
			list_cardType(ANY, READY).click(atText(sCardType)); // Visa
			// -------------------------------------------------------------------------------------------------
			// Card Number
			// -------------------------------------------------------------------------------------------------
			BrowserSync();
			// -------------------------------------------------------------------------------------------------
			sleep(1);
			html_cardNumber().waitForExistence(5,  0.25);
			html_cardNumber(ANY, READY).click();
			iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputKeys(sCardNumber); ///"4263971921256307");
			// -------------------------------------------------------------------------------------------------
			// Card Name
			// -------------------------------------------------------------------------------------------------
			text_cardName().waitForExistence(5,  0.25);
			text_cardName(ANY, READY).click();
			iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputChars(sCardName);
			// -------------------------------------------------------------------------------------------------
			// Card Start Month
			// -------------------------------------------------------------------------------------------------
			list_cardStartMonth().waitForExistence(5,  0.25);
			list_cardStartMonth(ANY, READY).click();
			list_cardStartMonth(ANY, READY).click(atText("02"));
			// -------------------------------------------------------------------------------------------------
			// Card Start Year
			// -------------------------------------------------------------------------------------------------
			list_cardStartYear().waitForExistence(5,  0.25);
			list_cardStartYear(ANY, READY).click();
			list_cardStartYear(ANY, READY).click(atText("09"));
			// -------------------------------------------------------------------------------------------------
			// Card Expire Month
			// -------------------------------------------------------------------------------------------------
			list_cardExpiryMonth().waitForExistence(5,  0.25);
			list_cardExpiryMonth(ANY, READY).click();
			list_cardExpiryMonth(ANY, READY).click(atText("01"));
			// -------------------------------------------------------------------------------------------------
			// Card Expire Year
			// -------------------------------------------------------------------------------------------------
			list_cardExpiryYear().waitForExistence(5,  0.25);
			list_cardExpiryYear(ANY, READY).click();
			list_cardExpiryYear(ANY, READY).click(atText("17"));
			// -------------------------------------------------------------------------------------------------
			// Card CV Number
			// -------------------------------------------------------------------------------------------------
			html_cardCvcNumber().waitForExistence(5,  0.25);
			html_cardCvcNumber(ANY, READY).click();
			iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputChars("222");
			// -------------------------------------------------------------------------------------------------
			// Type (AGAIN - Inconsistent)
			// -------------------------------------------------------------------------------------------------
			list_cardType().waitForExistence(25,  0.25);
			list_cardType(ANY, READY).click();
			sleep(0.5);
			list_cardType(ANY, READY).click(atText(sCardType)); // Visa
			// -------------------------------------------------------------------------------------------------
			// Confirm Importance Checkbox
			// -------------------------------------------------------------------------------------------------
			label_iConfirmThatYouHaveBroug().waitForExistence(5,  0.25);
			label_iConfirmThatYouHaveBroug(ANY, READY).click();
			// -------------------------------------------------------------------------------------------------
			// Submit
			// -------------------------------------------------------------------------------------------------
			button_submit().waitForExistence(5,  0.25);
			button_submit(ANY, READY).click();
			// -------------------------------------------------------------------------------------------------
		}

		
//		// Default MONTHLY OPTION
//		switch (sPaymentFrequency){
//			//--------------------------------------------
//			// MONTHLY PAYMENTS (Default)
//			//--------------------------------------------
//			case "Instalment": // DD or CC
//				 		
//				stop(); 
//				break;
//			//--------------------------------------------
//			// Annual Single Payment
//			//--------------------------------------------
//			case "Single Payment": // CC 
//				// -------------------------------------------------------------------------------------------------
//				// Card Payment
//				// -------------------------------------------------------------------------------------------------
//				// Type
//				// -------------------------------------------------------------------------------------------------
//				list_cardType().waitForExistence(5,  0.25);
//				list_cardType(ANY, READY).click();
//				list_cardType(ANY, READY).click(atText(sCardType)); // Visa
//				// -------------------------------------------------------------------------------------------------
//				// Card Number
//				// -------------------------------------------------------------------------------------------------
//				html_cardNumber().waitForExistence(5,  0.25);
//				html_cardNumber(ANY, READY).click(atPoint(130,38));
//				iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputKeys(sCardNumber); ///"4263971921256307");
//				// -------------------------------------------------------------------------------------------------
//				// Card Name
//				// -------------------------------------------------------------------------------------------------
//				text_cardName().waitForExistence(5,  0.25);
//				text_cardName(ANY, READY).click(atPoint(131,37));
//				iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputChars(sCardName);
//				// -------------------------------------------------------------------------------------------------
//				// Card Start Month
//				// -------------------------------------------------------------------------------------------------
//				list_cardStartMonth().waitForExistence(5,  0.25);
//				list_cardStartMonth(ANY, READY).click();
//				list_cardStartMonth(ANY, READY).click(atText("02"));
//				// -------------------------------------------------------------------------------------------------
//				// Card Start Year
//				// -------------------------------------------------------------------------------------------------
//				list_cardStartYear().waitForExistence(5,  0.25);
//				list_cardStartYear(ANY, READY).click();
//				list_cardStartYear(ANY, READY).click(atText("09"));
//				// -------------------------------------------------------------------------------------------------
//				// Card Expire Month
//				// -------------------------------------------------------------------------------------------------
//				list_cardExpiryMonth().waitForExistence(5,  0.25);
//				list_cardExpiryMonth(ANY, READY).click();
//				list_cardExpiryMonth(ANY, READY).click(atText("01"));
//				// -------------------------------------------------------------------------------------------------
//				// Card Expire Year
//				// -------------------------------------------------------------------------------------------------
//				list_cardExpiryYear().waitForExistence(5,  0.25);
//				list_cardExpiryYear(ANY, READY).click();
//				list_cardExpiryYear(ANY, READY).click(atText("17"));
//				// -------------------------------------------------------------------------------------------------
//				// Card CV Number
//				// -------------------------------------------------------------------------------------------------
//				html_cardCvcNumber().waitForExistence(5,  0.25);
//				html_cardCvcNumber(ANY, READY).click(atPoint(148,46));
//				iE(doc_carInsuranceYourCardPayment(ANY, READY),DEFAULT_FLAGS).inputChars("222");
//				// -------------------------------------------------------------------------------------------------
//				// Confirm Importance Checkbox
//				// -------------------------------------------------------------------------------------------------
//				label_iConfirmThatYouHaveBroug().waitForExistence(5,  0.25);
//				label_iConfirmThatYouHaveBroug(ANY, READY).click();
//				// -------------------------------------------------------------------------------------------------
//				// Submit
//				// -------------------------------------------------------------------------------------------------
//				button_submit().waitForExistence(5,  0.25);
//				button_submit(ANY, READY).click();
//				// -------------------------------------------------------------------------------------------------
//				break;	
//		}		
		//-----------------------------------------------------------------------------------------
		// Payment Verification (Screen)
		callScript("Motor_MK2.Payment.Payment_Verification");
		
	}
}

