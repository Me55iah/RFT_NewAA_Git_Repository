package Generic_Scripts;

import resources.Common_Variables;
import resources.Generic_Scripts.Your_Card_PaymentHelper;
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
public class Your_Card_Payment extends Your_Card_PaymentHelper {
	/**
	 * Script Name : <b>Your_Card_Payment</b> Generated : <b>8 Apr 2013
	 * 14:50:56</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/08
	 * @author courtl
	 */
	public void testMain(Object[] args) {
		
		
		

		//list_cardModelTypeModelCodedVa().waitForExistence();
		//------------------------------------------------------------------------------------------
		// callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------
		BrowserSync();
		
		list_cardModelTypeModelCodedVa(ANY, READY).click();
		list_cardModelTypeModelCodedVa(ANY, READY).click(
				atText(Common_Variables.Payment_CardType));

		text_cardModelAccountNumberMod(ANY, READY).click(atPoint(23, 19));
		browser_htmlBrowser(document_theAAPaymentGateway(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.Payment_CardNumber);

		text_cardModelCardholderNameMo(ANY, READY).click(atPoint(52, 23));
		browser_htmlBrowser(document_theAAPaymentGateway(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.Payment_CardName);

		list_cardModelExpiryDateModelM(ANY, READY).click();
		list_cardModelExpiryDateModelM(ANY, READY).click(
				atText(Common_Variables.endMonth));

		list_cardModelExpiryDateModelY(ANY, READY).click();
		list_cardModelExpiryDateModelY(ANY, READY).click(
				atText("20" + Common_Variables.endYear));

		text_cardModelVerificationNumb(ANY, READY).click(atPoint(30, 22));
		browser_htmlBrowser(document_theAAPaymentGateway(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.Payment_SecCode);

		button_buyNowsubmit(ANY, READY).click();

		sleep(10.0);

		boolean Secure = button_submit2().exists();

		if (Secure == true) {

			button_submit2(ANY, READY).click();
		}
		// BELOW NOT COMMENTED BY DAVE, was done already
		//-------------------------------------------------
//		image_aaCreditCardApplyToday4().waitForExistence();
		
		// html_bdWrap(ANY,LOADED).waitForExistence();

		// String bdWrap_Text = (String) html_bdWrap().getProperty(".text");
		//
		// int index1 = bdWrap_Text.indexOf("Membership number");
		// index1 = index1 + 18;
		//
		// int index2 = bdWrap_Text.indexOf("Main member");
		// index2 = index2 - 1;
		//
		// String membershipNumber = bdWrap_Text.substring(index1, index2);
		// Common_Variables.TIA_Policy_Number = membershipNumber;
		//
		// int index3 = bdWrap_Text.indexOf("Total cost");
		// index3 = index3 + 11;
		//
		// int index4 = bdWrap_Text.indexOf("Card type");
		// index4 = index4 - 1;
		//
		// String totalCost = bdWrap_Text.substring(index3, index4);
		//
		// Common_Variables.annualPremium = totalCost;
//ignore
	}
}
