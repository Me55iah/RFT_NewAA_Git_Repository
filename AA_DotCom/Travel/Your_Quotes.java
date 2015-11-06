package Travel;

import resources.Common_Variables;
import resources.Travel.Your_QuotesHelper;
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
public class Your_Quotes extends Your_QuotesHelper {
	/**
	 * Script Name : <b>Your_Quotes</b> Generated : <b>17 Apr 2013 14:03:19</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		if (Common_Variables.travelPolicyType.equals("Single Trip")) {
			if (Common_Variables.travelBrand.equals("AA")) {
				button_AA_Single_Trip(ANY, LOADED).click();
			}
			if (Common_Variables.travelBrand.equals("Go")
					| Common_Variables.travelBrand.equals("1Stop")) {
				button_Go_Single_Trip(ANY, LOADED).click();
			}
		}

		if (Common_Variables.travelPolicyType.equals("Annual")
				| Common_Variables.travelPolicyType.equals("Annual Multi-trip")) {
			if (Common_Variables.travelBrand.equals("AA")) {
				button_Essentials_Single_Trip(ANY, LOADED).click();
			}
			if (Common_Variables.travelBrand.equals("Go")
					| Common_Variables.travelBrand.equals("1Stop")) {

				button_Go_Single_Trip(ANY, LOADED).click();

			}

		}

		if (Common_Variables.travelBrand.equals("AA")) {
			if (Common_Variables.travelPolicyType.equals("Backpackers")) {
				button_Essentials_Single_Trip(ANY, LOADED).click();
			}
		}

		if (Common_Variables.travelBrand.equals("Go")
				| Common_Variables.travelBrand.equals("1Stop")) {
			if (Common_Variables.travelPolicyType.equals("Backpacker")) {

				button_Go_Single_Trip(ANY, LOADED).click();

			}
		}

	}
}
