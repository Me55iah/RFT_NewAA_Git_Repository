package Travel;

import resources.Common_Variables;
import resources.Travel.Your_PaymentHelper;
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
	 * Script Name : <b>Your_Payment</b> Generated : <b>17 Apr 2013 15:32:13</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */

	public static String divPolicyNumber_Text;
	public static String divPolicySummary_Text;

	public void testMain(Object[] args) {

		Common_Variables.startMonth = Common_Variables.Payment_StartDate
				.substring(0, 2);
		Common_Variables.startYear = Common_Variables.Payment_StartDate
				.substring(2, 4);
		Common_Variables.endMonth = Common_Variables.Payment_ExpiryDate
				.substring(0, 2);
		Common_Variables.endYear = Common_Variables.Payment_ExpiryDate
				.substring(2, 4);

		list_cardType().select(Common_Variables.Payment_CardType);
		text_cardName().setText(Common_Variables.Payment_CardName);
		
		text_cardNumber2().setText(Common_Variables.Payment_CardNumber);
		
		list_cardExpiryMonth().select(Common_Variables.endMonth);
		list_cardExpiryYear().select(Common_Variables.endYear);
		text_cardCvcNumber().setText(Common_Variables.Payment_SecCode);

		checkBox_cardASSUMPTIONSCORREC().click();
		button_purchasePolicysubmit().click();

		if (Common_Variables.travelBrand.equals("AA")) {
			button_submit().waitForExistence();
			button_submit().click();
		}

		if (Common_Variables.travelBrand.equals("1Stop")) {
			html_divPolicyNumber2().waitForExistence();

			divPolicyNumber_Text = (String) html_divPolicyNumber2()
					.getProperty(".text");
		}

		if (Common_Variables.travelBrand.equals("AA")
				| Common_Variables.travelBrand.equals("Go")) {
			html_divPolicyNumber().waitForExistence();

			divPolicyNumber_Text = (String) html_divPolicyNumber().getProperty(
					".text");
		}

		// System.out.println(divPolicyNumber_Text);

		String policyNo = divPolicyNumber_Text.substring(14);

		Common_Variables.TIA_Policy_Number = policyNo;

		if (Common_Variables.travelBrand.equals("1Stop")) {
			 divPolicySummary_Text = (String) html_divPolicySummary2()
					.getProperty(".text");
		}

		if (Common_Variables.travelBrand.equals("AA")
				| (Common_Variables.travelBrand.equals("Go"))) {
			 divPolicySummary_Text = (String) html_divPolicySummary()
					.getProperty(".text");
		}

		// System.out.println(divPolicySummary_Text);

		int index1 = divPolicySummary_Text.indexOf("Total cost");
		index1 = index1 + 11;

		int index2 = divPolicySummary_Text.indexOf("Policy", index1);
		index2 = index2 - 1;

		String totalCost = divPolicySummary_Text.substring(index1, index2);

		Common_Variables.annualPremium = totalCost;

	}
}
