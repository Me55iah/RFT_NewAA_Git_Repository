package Utilities;
import resources.Common_Variables;
import resources.Utilities.Pay_CCHelper;
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
public class Pay_CC extends Pay_CCHelper
{
	/**
	 * Script Name   : <b>Pay_CC</b>
	 * Generated     : <b>26 May 2015 11:47:04</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sCardType = "MasterCard"; // Visa Debit MasterCard
//		String sCardNumber = "4263971921256307";
//		String sCardName = "Ronald McDonald";
//		String sCardEndMonth = "10";
//		String sCardEndYear =  "17";
//		String sCardSecCode = "222";
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------

//		String sSortCode = Common_Variables.DD_SortCode;
//		String sAccountNumber = Common_Variables.DD_AccountNumber;
//		String sAccountName = Common_Variables.Payment_CardName;
//		
		String sCardType = Common_Variables.Payment_CardType;
		String sCardNumber = Common_Variables.Payment_CardNumber;
		String sCardName = Common_Variables.Payment_CardName;
		String sCardEndMonth = Common_Variables.endMonth;
		String sCardEndYear = Common_Variables.endYear;
		String sCardSecCode = Common_Variables.Payment_SecCode;
		
		// Update From XP to WIN11 (Angular Update)
		//BrowserSync();
		//----------------------------------------------------------------  TO TRY CATCH
		// Card Type
		//--------------------------------------------------------------------
		try {			
			document_theAAPaymentGateway().waitForExistence(10, 0.25);
			//--------------------------------------------------------------------
			// Temporarily Suspend Log To Hide The Following Erroneous Tool Error!!!
		 	//--------------------------------------------------------------------
		 	setCurrentLogFilter(DISABLE_LOGGING);
		 	//--------------------------------------------------------------------
			list_cardModelTypeModelCodedVa(ANY, READY).click();
			sleep(0.5);
			//-----------------------------------------------------------------------------------
			// IE11 - Win 8.1 Strange Selection Issue (XP and Win 7 OK)  08/10/2015 - DH
			//list_cardModelTypeModelCodedVa().click();
			//list_cardModelTypeModelCodedVa().click(atText("Visa"));
			//-----------------------------------------------------------------------------------
			// Visa
			if (!sCardType.contains("Debit")&&(sCardType.contains("Visa"))){
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ENTER}");
			}
			// Visa Debit
			else if (sCardType.contains("Visa Debit")){
				iE(document_theAAPaymentGateway(),DEFAULT_FLAGS).inputKeys("{ExtDown 2}{ENTER}");
			}
			// Everything Else
			else{
				list_cardModelTypeModelCodedVa(ANY, READY).click(atText(sCardType));
			}
			//list_cardModelTypeModelCodedVa(ANY, READY).click(atText(sCardType));
			sleep(0.5);			
			//----------------------------------------------------------------
			// Card 16 Digit Number
			html_cardModelAccountNumberMod(ANY, READY).doubleClick(atPoint(23, 19));
			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(sCardNumber);
			//----------------------------------------------------------------
			// Name on Card
			text_cardModelCardholderNameMo(ANY, READY).doubleClick(atPoint(52, 23));
			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(sCardName);
			//----------------------------------------------------------------
			// Card Expiry Date Month
			list_cardModelExpiryDateModelM(ANY, READY).click();
			list_cardModelExpiryDateModelM(ANY, READY).click(atText(sCardEndMonth));
			//----------------------------------------------------------------
			// Card Expiry Date Year
			list_cardModelExpiryDateModelY(ANY, READY).click();
			list_cardModelExpiryDateModelY(ANY, READY).click(atText("20" + sCardEndYear));
			//----------------------------------------------------------------
			// Verification Number (3 Digits)
			html_cardModelVerificationNumb(ANY, READY).doubleClick(atPoint(30, 22));
			iE(document_theAAPaymentGateway(), DEFAULT_FLAGS).inputChars(sCardSecCode);
			//----------------------------------------------------------------
			button_buyNowsubmit().waitForExistence(10,  0.25);
			button_buyNowsubmit(ANY, READY).click();
			//----------------------------------------------------------------  TO TRY CATCH
			BrowserSync();
		 	//--------------------------------------------------------------------
			// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
		 	//--------------------------------------------------------------------
			setCurrentLogFilter(ENABLE_LOGGING);
			//----------------------------------------------------------------------------		
		} catch (ObjectNotFoundException e) {
			setCurrentLogFilter(ENABLE_LOGGING);
			logInfo(" * * * There Is A Problem WIth Credit Card Payments, Payment Gateway Issue or Web Services Glitch? * * * ");
			System.out.println(" * * * There Is A PROBLEM WIth Credit Card Payments, Payment Gateway Issue or Web Services Glitch? * * * ");
		}
		

		//sleep(10.0);
		
		// CAPTURE THIS ON IE11 * *  * * * * * * * *  * * * * ** * *  * 

//		boolean Secure = button_submit2().exists();
//
//		if (Secure == true) {
//
//			button_submit2(ANY, READY).click();
//		}
		
		// CAPTURE THIS ON IE11 * *  * * * * * * * *  * * * * ** * *  * 

		
	}
}
