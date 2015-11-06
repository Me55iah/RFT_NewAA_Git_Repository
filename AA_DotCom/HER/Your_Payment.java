package HER;

import resources.Common_Variables;
import resources.HER.Your_PaymentHelper;
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
public class Your_Payment extends Your_PaymentHelper {
	/**
	 * Script Name : <b>Your_Payment</b> Generated : <b>9 Apr 2013 14:06:47</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		if (Common_Variables.paymentType.equals("AA Instalment Account (TIA)")) {

			list_cardType(ANY, LOADED).waitForExistence();

			String priceInstalments_Text = (String) html_priceInstalments(ANY, LOADED)
					.getProperty(".text");

			int index1 = priceInstalments_Text.indexOf(" ");
			String instalment = priceInstalments_Text.substring(0, index1);
			instalment = instalment.trim();
			Common_Variables.monthlyPrice = instalment;

			int index2 = priceInstalments_Text.indexOf("for");
			index2 = index2 + 13;
			int index3 = index2 + 7;
			
			String annual = priceInstalments_Text.substring(index2, index3);
			annual = annual.trim();
			Common_Variables.annualPremium = annual;

			String aside_Text = (String) html_aside().getProperty(".text");

			int index4 = aside_Text.indexOf("Quote reference");
			index4 = index4 + 16;

			int index5 = index4 + 12;

			String quoteRef = aside_Text.substring(index4, index5);
			Common_Variables.quoteReference = quoteRef;

			list_cardType(ANY, LOADED).select(Common_Variables.Payment_CardType);
			text_cardNumber(ANY, LOADED).setText(Common_Variables.Payment_CardNumber);
			text_cardHolderName(ANY, LOADED).setText(Common_Variables.Payment_CardName);
			list_cardExpiryMonth(ANY, LOADED).select("November");
			list_cardExpiryYear(ANY, LOADED).select("2017");

			String sortcode1 = Common_Variables.Payment_Bank_Sortcode
					.substring(0, 2);
			String sortcode2 = Common_Variables.Payment_Bank_Sortcode
					.substring(3, 5);
			String sortcode3 = Common_Variables.Payment_Bank_Sortcode
					.substring(6);

			text_bankAccountSortCode1(ANY, LOADED).setText(sortcode1);
			text_bankAccountSortCode2(ANY, LOADED).setText(sortcode2);
			text_bankAccountSortCode3(ANY, LOADED).setText(sortcode3);
			text_bankAccountNo().setText(
					Common_Variables.Payment_Bank_Account_Number);
			text_bankAccountHolderName().setText(
					Common_Variables.Payment_Bank_Account_Name);

//			checkBox_confirmAuthorisedForD(ANY, LOADED).click();
			checkBox_termsAndConditionsCon(ANY, LOADED).click();
			button_submit().click();

		}

		if (Common_Variables.paymentType.equals("Credit Card Instalments")) {

			list_cardType(ANY, LOADED).waitForExistence();

			String priceInstalments_Text = (String) html_priceInstalments(ANY, LOADED)
					.getProperty(".text");

			int index1 = priceInstalments_Text.indexOf(" ");
			String instalment = priceInstalments_Text.substring(0, index1);
			instalment = instalment.trim();
			Common_Variables.monthlyPrice = instalment;

			int index2 = priceInstalments_Text.indexOf("for");
			index2 = index2 + 13;
			int index3 = index2 + 7;
			String annual = priceInstalments_Text.substring(index2, index3);
			annual = annual.trim();
			Common_Variables.annualPremium = annual;

			String aside_Text = (String) html_aside().getProperty(".text");

			int index4 = aside_Text.indexOf("Quote reference");
			index4 = index4 + 16;

			int index5 = index4 + 12;

			String quoteRef = aside_Text.substring(index4, index5);
			Common_Variables.quoteReference = quoteRef;

			list_cardType(ANY, LOADED).select(Common_Variables.Payment_CardType);
			text_cardNumber(ANY, LOADED).setText(Common_Variables.Payment_CardNumber);
			text_cardHolderName(ANY, LOADED).setText(Common_Variables.Payment_CardName);
			list_cardExpiryMonth(ANY, LOADED).select("November");
			list_cardExpiryYear(ANY, LOADED).select("2017");

			checkBox_termsAndConditionsCon(ANY, LOADED).click();
			button_submit(ANY, LOADED).click();

		}

		if (Common_Variables.paymentType.equals("Single Payment")) {

			list_cardType().waitForExistence();

			String priceInstalments_Text = (String) html_priceInstalments(ANY, LOADED)
					.getProperty(".text");

			int index1 = priceInstalments_Text.indexOf(" ");
			String instalment = priceInstalments_Text.substring(0, index1);
			instalment = instalment.trim();
			Common_Variables.monthlyPrice = instalment;

			int index2 = priceInstalments_Text.indexOf("for");
			index2 = index2 + 13;
			int index3 = index2 + 7;
			String annual = priceInstalments_Text.substring(index2, index3);
			annual = annual.trim();
			Common_Variables.annualPremium = annual;

			String aside_Text = (String) html_aside().getProperty(".text");

			int index4 = aside_Text.indexOf("Quote reference");
			index4 = index4 + 16;

			int index5 = index4 + 12;

			String quoteRef = aside_Text.substring(index4, index5);
			Common_Variables.quoteReference = quoteRef;

			list_cardType(ANY, LOADED).select(Common_Variables.Payment_CardType);
			text_cardNumber(ANY, LOADED).setText(Common_Variables.Payment_CardNumber);
			text_cardHolderName(ANY, LOADED).setText(Common_Variables.Payment_CardName);
			list_cardExpiryMonth(ANY, LOADED).select("November");
			list_cardExpiryYear(ANY, LOADED).select("2017");

			checkBox_termsAndConditionsCon(ANY, LOADED).click();
			button_submit(ANY, LOADED).click();
		}

		html_main(ANY, LOADED).waitForExistence();

		// Get Policy Number
		String aside_Text2 = (String) html_aside2(ANY, LOADED).getProperty(".text");

		int index6 = aside_Text2.indexOf("Policy number:");
		index6 = index6 + 15;

		int index7 = index6 + 9;

		String policyRef = aside_Text2.substring(index6, index7);
		Common_Variables.TIA_Policy_Number = policyRef;

	}
}
