package Road;

import resources.Common_Variables;
import resources.Road.ConfirmationHelper;
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
public class Confirmation extends ConfirmationHelper {
	/**
	 * Script Name : <b>Confirmation</b> Generated : <b>29 Jul 2014 11:31:28</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2014/07/29
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		label_iConfirmThatYouHaveInfor().waitForExistence();
		checkBox_terms_Conditiontrue().click();

		if (Common_Variables.paymentType.equals("CMM")) {
			button_buyBreakdownCoversubmit(ANY, READY).click();
		} else

			button_buyBreakdownCoverbutton(ANY, READY).click();

	}
}
