package Travel;

import resources.Common_Variables;
import resources.Travel.Policy_ExtrasHelper;
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
public class Policy_Extras extends Policy_ExtrasHelper {
	/**
	 * Script Name : <b>Policy_Extras</b> Generated : <b>17 Apr 2013
	 * 14:13:39</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		boolean upgrades = false;

		form_formQuote().waitForExistence();

		int currentRow = 0;
		int iUpgrade_Row = Integer
				.parseInt(Common_Variables.upgrade_DatapoolRow);

		while (currentRow < iUpgrade_Row) {

			dpNext();
			currentRow++;
		}

		if (dpBoolean("Excess_Waiver") == true) {

			radioButton_Excess_Waiver().click();
			sleep(0.5);
			upgrades = true;

		}

		if (dpBoolean("Travel_Disruption_Extension") == true) {
		
		// HTML Browser
		// Document: RegularExpression(.*): RegularExpression(.*)
		checkBox_aaTiRiskDataSelectedQ8().click();
		//checkBox_aaTiRiskDataSelectedQ9().click();
		//checkBox_aaTiRiskDataSelectedQ10().click();

		//checkBox_aaTiRiskDataSelectedQ().click();

			sleep(0.5);
			upgrades = true;

		}
		if (dpBoolean("Deletion_of_Baggage_and_Money_Cover") == true) {

			checkBox_aaTiRiskDataSelectedQ2().click();
			sleep(0.5);
			upgrades = true;
		}

		if (dpBoolean("Business_Cover") == true) {

			checkBox_aaTiRiskDataSelectedQ3().click();
			sleep(0.5);
			upgrades = true;
		}

		if (dpBoolean("Cruise_Cover") == true) {

			checkBox_aaTiRiskDataSelectedQ4().click();
			sleep(0.5);
			upgrades = true;
		}

		if (dpBoolean("Golf_Cover") == true) {

			checkBox_aaTiRiskDataSelectedQ5().click();
			sleep(0.5);
			upgrades = true;

		}

		if (dpBoolean("Wedding_Cover") == true) {

			checkBox_aaTiRiskDataSelectedQ6().click();
			sleep(0.5);
			upgrades = true;
		}

		if (dpBoolean("Grade_1_Activities") == true) {

		}

		if (dpBoolean("Grade_2_Activities") == true) {

		}

		if (dpBoolean("Grade_3_Activities") == true) {

		}

		if (dpBoolean("Grade_3_Activities") == true) {

		}

		if (Common_Variables.winterSports == true) {

			checkBox_aaTiRiskDataSelectedQ7().click();
			upgrades = true;
			sleep(0.5);

		}

		if (upgrades == true) {
			button_updateQuotesubmit().click();
			sleep(5.0);
		}

		browser_htmlBrowser(document_aaTravelInsurance(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		if (Common_Variables.quoteOnly == true) {

			if (Common_Variables.travelBrand.equals("AA")) {

				String totalPrice_Text = (String) html_totalPrice()
						.getProperty(".text");

				Common_Variables.annualPremium = totalPrice_Text;
			}
			if (Common_Variables.travelBrand.equals("AA")) {

				String totalPrice_Text = (String) html_totalPrice2()
						.getProperty(".text");

				Common_Variables.annualPremium = totalPrice_Text;

			}

		}

		if (Common_Variables.quoteOnly == false) {

			button_yourDetailssubmit().click();

			text_aaTiCustomers0AddressHous().waitForExistence();
		}

	}
}
