package Motor;

import resources.Common_Variables;
import resources.Motor.Your_Card_PaymentHelper;
import Utilities.Portal_Synchronisation;
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
 * Description : Functional Test Script
 * 
 * @author courtl
 */
@SuppressWarnings("unused")
public class Your_Card_Payment extends Your_Card_PaymentHelper {
	/**
	 * Script Name : <b>Your_Card_Payment</b> Generated : <b>12 Mar 2013
	 * 13:06:43</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/12
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		list_cardType().waitForExistence();
		//sleep(1.0);

		String mainForm_Text = (String) form_mainForm().getProperty(".text");

		int index3 = mainForm_Text.indexOf("deposit");
		index3 = index3 + 8;

		Common_Variables.depositAmount = mainForm_Text.substring(index3,
				index3 + 7);
		Common_Variables.depositAmount = Common_Variables.depositAmount.trim();

		int index4 = mainForm_Text.indexOf("payments of");
		index4 = index4 + 12;

		Common_Variables.monthlyPrice = mainForm_Text.substring(index4,
				index4 + 7);
		Common_Variables.monthlyPrice = Common_Variables.monthlyPrice.trim();

		list_cardType().select(Common_Variables.Payment_CardType);

		text_cardNumber().setText(Common_Variables.Payment_CardNumber);

		text_cardName().setText(Common_Variables.Payment_CardName);

		list_cardStartMonth().select(Common_Variables.startMonth);

		list_cardStartYear().select(Common_Variables.startYear);

		list_cardExpiryMonth().select(Common_Variables.endMonth);

		list_cardExpiryYear().select(Common_Variables.endYear);

		text_cardCvcNumber().setText(Common_Variables.Payment_SecCode);

		checkBox_aaMotorPaymentCardASS().click();

		button_submit2().click();

		button_submit().click();

		// HTML Browser
		// Document: Car Insurance: Thank you for buying AA Car Insurance - The
		// AA: https://prelive5.theaa.com/car-insurance/buy/sale-confirmation
		
		
		// IMAGE VERIFICAITION NEEDS FIXING BELOX 
		
		//image_carInsuranceCarkey(ANY, LOADED).waitForExistence();

		// image_aaCreditCardApplyToday().waitForExistence();

		// Get the quote Number
		String aside_Text = (String) html_aside().getProperty(".text");

		int index = aside_Text.indexOf("number");
		index = index + 7;

		int index2 = aside_Text.indexOf("Cover");
		index2 = index2 - 1;

		Common_Variables.quoteReference = aside_Text.substring(index, index2);
		Common_Variables.quoteReference = Common_Variables.quoteReference
				.trim();

		//sleep(10.0);
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		// Get the policy Number
		aside_Text = (String) html_aside().getProperty(".text");

		index = aside_Text.indexOf("number");
		index = index + 7;

		index2 = aside_Text.indexOf("Cover");
		index2 = index2 - 1;

		Common_Variables.TIA_Policy_Number = aside_Text
				.substring(index, index2);
		Common_Variables.TIA_Policy_Number = Common_Variables.TIA_Policy_Number
				.trim();

	}
}
