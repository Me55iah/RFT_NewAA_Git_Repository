package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Payment_OptionsHelper;
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
public class Payment_Options extends Payment_OptionsHelper
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
		// Payment Frequency - Type
		String sPaymentFrequency = Common_Variables.paymentType; 	 
		//------------------------------------------------------------------------------------------
		// Default MONTHLY OPTION
		switch (sPaymentFrequency){
			//--------------------------------------------
			// MONTHLY PAYMENTS (Default)
			//--------------------------------------------
			case "Instalment": // DD or CC
				 		
				stop();
				break;
			//--------------------------------------------
			// Annual Single Payment
			//--------------------------------------------
			case "Single Payment": // CC 
		
		
				// HTML Browser
				// -------------------------------------------------------------------------------------------------
				list_cardType().click();
				list_cardType().click(atText("Visa"));
				html_cardNumber().click(atPoint(198,35));
				html_cardNumber().click(atPoint(130,38));
				browser_htmlBrowser(document_carInsuranceYourCardP(),DEFAULT_FLAGS).inputKeys("^v");
				text_cardName().click(atPoint(131,37));
				browser_htmlBrowser(document_carInsuranceYourCardP(),DEFAULT_FLAGS).inputChars("ronald mcdonald");
				list_cardStartMonth().click();
				list_cardStartMonth().click(atText("02"));
				list_cardStartYear().click();
				list_cardStartYear().click(atText("09"));
				list_cardExpiryMonth().click();
				list_cardExpiryMonth().click(atText("01"));
				list_cardExpiryYear().click();
				list_cardExpiryYear().click(atText("17"));
				html_cardCvcNumber().click(atPoint(148,46));
				browser_htmlBrowser(document_carInsuranceYourCardP(),DEFAULT_FLAGS).inputChars("222");
				label_iConfirmThatYouHaveBroug().click();
				button_submit().click();
				


				 
				break;	
		}		
		//-----------------------------------------------------------------------------------------

	}
}

