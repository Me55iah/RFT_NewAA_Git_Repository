package Motor;

import resources.Motor.Proposer_Previous_ConvictionsHelper;
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
public class Proposer_Previous_Convictions extends
		Proposer_Previous_ConvictionsHelper {
	/**
	 * Script Name : <b>Proposer_Previous_Convictions</b> Generated : <b>28 Mar
	 * 2013 11:03:24</b> Description : Functional Test Script Original Host :
	 * WinNT Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/28
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(10.0);
		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------
		
		// Bring Control Into View
		browser_htmlBrowser(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");		
		
		link_addAConviction().waitForExistence();
		link_addAConviction(ANY, READY).click();
		
		list_aaMotorDrivers0Conviction().waitForExistence();

		list_aaMotorDrivers0Conviction(ANY, READY)
				.click(atText("SP30 - Exceeding statutory speed limit on a public road"));

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		list_aaMotorDrivers0Conviction2(ANY, READY).select(
				dpString("aaMotorDrivers0Convictions0DateMonth"));
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		list_aaMotorDrivers0Conviction3(ANY, READY).select(
				dpString("aaMotorDrivers0Convictions0DateYear"));
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		list_aaMotorDrivers0Conviction4(ANY, READY).select(
				dpString("aaMotorDrivers0Convictions0PointsIncurred"));
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		text_aaMotorDrivers0Conviction(ANY, READY).setText(
				dpString("aaMotorDrivers0Convictions0FineIncurred"));

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		radioButton_aaMotorDrivers0Con(ANY, READY).click();

		link_convictionConfirm(ANY, READY).click();

		//sleep(5.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

	}
}
