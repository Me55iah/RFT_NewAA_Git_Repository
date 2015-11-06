package Travel;

import resources.Common_Variables;
import resources.Travel.DeclarationHelper;
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
public class Declaration extends DeclarationHelper {
	/**
	 * Script Name : <b>Declaration</b> Generated : <b>17 Apr 2013 15:25:43</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		
		browser_htmlBrowser(document_aaTravelInsurance(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
	

		if (Common_Variables.travelBrand.equals("1Stop")) {
			checkBox_aaCustomerMedicallySc2().click();
			
		}

		if (Common_Variables.travelBrand.equals("Go")
				| Common_Variables.travelBrand.equals("AA")) {
			checkBox_aaCustomerMedicallySc().click();
		}

		checkBox_aaCustomerUkResidentt().click();

		if (Common_Variables.travelBrand.equals("AA")) {
			button_paymentsubmit().click();
		}

		if (Common_Variables.travelBrand.equals("Go")
				| Common_Variables.travelBrand.equals("1Stop")) {
			button_paymentsubmit2().click();
		}

	}
}
