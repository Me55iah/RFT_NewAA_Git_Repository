package HER;

import resources.Common_Variables;
import resources.HER.Your_PropertyHelper;
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
public class Your_Property extends Your_PropertyHelper {
	/**
	 * Script Name : <b>Your_Property</b> Generated : <b>9 Apr 2013 13:43:02</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		list_propertyType(ANY, LOADED).select(Common_Variables.typeOfProperty);
		sleep(2.0);
		list_propertyBedrooms(ANY, LOADED).select(Common_Variables.numBedrooms);

//		if (Common_Variables.centralHeatingEmergencyResponse == true
//				| Common_Variables.centralHeatingResponsePlus == true) {
//
//			sleep(2.0);
//
//			list_boilerFuel(ANY, LOADED).select("Gas/LPG");
//			list_boilerType(ANY, LOADED).select("Combination");
//
//
//
//		}

		button_next(ANY, LOADED).click();
		sleep(2.0);
		text_policyStartDate(ANY, LOADED).waitForExistence();
	}
}
