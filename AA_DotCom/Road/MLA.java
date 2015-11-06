package Road;

import resources.Common_Variables;
import resources.Road.MLAHelper;
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
public class MLA extends MLAHelper {
	/**
	 * Script Name : <b>MLA</b> Generated : <b>17 Sep 2013 15:53:26</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/09/17
	 * @author courtl
	 */
	public void testMain(Object[] args) {
		
		label_motorLegalAssistanceIfYo().waitForExistence();

		if (Common_Variables.MLA.equals("Y")) {
			checkBox_selectedOptionsmotorL(ANY, READY).click();
			
		}
		
		button_next(ANY, READY).click();

	}
}
