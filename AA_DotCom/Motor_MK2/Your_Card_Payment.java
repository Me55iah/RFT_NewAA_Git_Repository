package Road_MK2;
import resources.Common_Variables;
import resources.Road_MK2.Your_Card_PaymentHelper;
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
public class Your_Card_Payment extends Your_Card_PaymentHelper
{
	/**
	 * Script Name   : <b>Your_Card_Payment</b>
	 * Generated     : <b>4 Jun 2015 15:30:24</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/04
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		String sPayment_CardType = "Visa";  				// (Common_Variables.Payment_CardType)
		String sPayment_CardNumber = "4508235106432165"; 	// (Common_Variables.Payment_CardNumber)
		String sPayment_CardName = "President Fred FORD";  	// (Common_Variables.Payment_CardName)
		String sStartMonth = "01";                 			// (Common_Variables.startMonth)
		String sStartYear = "15";							// (Common_Variables.startYear)
 		String sEndMonth = "01";                 			// (Common_Variables.endMonth)
		String sEndYear = "17";							// (Common_Variables.endYear)
		String sPayment_SecCode = "222";                    // (Common_Variables.Payment_SecCode)
		
		//-----------------------------------------------------------------------------------------		
		//Verification
		String sTitle = "The_CAR_Details_Data";
		String sReport = "The CAR Details Data Entry Was Successful";
		String sExpected = "Your details";
		String sActual = "";
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------

		// Update From XP to WIN11 (Angular Update)
		BrowserSync();
		//----------------------------------------------------------------  TO TRY CATCH
		// Card Type
		list_cardType().waitForExistence(10,  0.25);
		list_cardType(ANY, READY).doubleClick();
		list_cardType(ANY, READY).click(atText(sPayment_CardType));
		//----------------------------------------------------------------
		// Card 16 Digit Number
		html_cardNumber().waitForExistence(10,  0.25);
		html_cardNumber(ANY, READY).doubleClick(atPoint(23, 19));
		iE(html_cardNumber(), DEFAULT_FLAGS).inputChars(sPayment_CardNumber);
		//----------------------------------------------------------------
		// Name on Card
		text_cardName().waitForExistence(10,  0.25);
		text_cardName(ANY, READY).doubleClick(atPoint(52, 23));
		iE(document_carInsuranceYourCardP(), DEFAULT_FLAGS).inputChars(sPayment_CardName);
		//----------------------------------------------------------------
		// Card Start Month
		list_cardStartMonth().waitForExistence(10,  0.25);
		list_cardStartMonth(ANY, READY).click();
		list_cardStartMonth(ANY, READY).click(atText(sStartMonth));
		//----------------------------------------------------------------
		// Card Start Year
		list_cardStartYear().waitForExistence(10,  0.25);
		list_cardStartYear(ANY, READY).click();
		list_cardStartYear(ANY, READY).click(atText(sStartYear));
		//----------------------------------------------------------------
		// Card Expiry Date Month
		list_cardExpiryMonth().waitForExistence(10,  0.25);
		list_cardExpiryMonth(ANY, READY).click();
		list_cardExpiryMonth(ANY, READY).click(atText(sEndMonth));
		//----------------------------------------------------------------
		// Card Expiry Date Year
		list_cardExpiryYear().waitForExistence(10,  0.25);
		list_cardExpiryYear(ANY, READY).click();
		list_cardExpiryYear(ANY, READY).click(atText(sEndYear));
		//----------------------------------------------------------------
		// Verification Number (3 Digits)
		html_cardCvcNumber().waitForExistence(10,  0.25);
		html_cardCvcNumber(ANY, READY).doubleClick(atPoint(30, 22));
		iE(document_carInsuranceYourCardP(), DEFAULT_FLAGS).inputChars(sPayment_SecCode);
		//----------------------------------------------------------------
		// Confirm CheckBox
		label_iConfirmThatYouHaveBroug().waitForExistence(10,  0.25);
		label_iConfirmThatYouHaveBroug(ANY, READY).click();
		//----------------------------------------------------------------
		button_submit().waitForExistence(10,  0.25);
		button_submit(ANY, READY).click();
		//----------------------------------------------------------------  TO TRY CATCH
		BrowserSync();
		System.gc();	
	}
}

