package Motor;

import resources.Motor.Additional_Driver_ConvictionsHelper;
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
public class Additional_Driver_Convictions extends
		Additional_Driver_ConvictionsHelper {
	/**
	 * Script Name : <b>Additional_Driver_Convictions</b> Generated : <b>27 Mar
	 * 2013 15:30:52</b> Description : Functional Test Script Original Host :
	 * WinNT Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/27
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		link_addAConviction(ANY, READY).click();

		list_aaMotorDrivers1Conviction().waitForExistence();

		list_aaMotorDrivers1Conviction(ANY, READY)
				.click(atText("SP30 - Exceeding statutory speed limit on a public road"));
		// Data Driven Code inserted on 27 Mar 2013
		list_aaMotorDrivers1Conviction2(ANY, READY).select(
				dpString("aaMotorDrivers1Convictions0DateMonth"));
		list_aaMotorDrivers1Conviction3(ANY, READY).select(
				dpString("aaMotorDrivers1Convictions0DateYear"));
		list_aaMotorDrivers1Conviction4(ANY, READY).select(
				dpString("aaMotorDrivers1Convictions0PointsIncurred"));
		text_aaMotorDrivers1Conviction(ANY, READY).setText(
				dpString("aaMotorDrivers1Convictions0FineIncurred"));

		sleep(0.5);
		radioButton_aaMotorDrivers1Con(ANY, READY).click();
		sleep(0.5);
		link_convictionConfirm(ANY, READY).click();

		//sleep(5.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

	}
}
