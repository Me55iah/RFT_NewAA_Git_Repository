package HER;

import resources.Common_Variables;
import resources.HER.Choose_Your_CoverHelper;
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
public class Choose_Your_Cover extends Choose_Your_CoverHelper {
	/**
	 * Script Name : <b>Choose_Your_Cover</b> Generated : <b>9 Apr 2013
	 * 13:10:22</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		Home_Emergency_Response(ANY, LOADED).waitForExistence();

		if (Common_Variables.herYN == false) {

			Home_Emergency_Response(ANY, LOADED).click();

			sleep(0.5);
		}

		if (Common_Variables.homeResponsePlus == true) {

			Home_Response_Plus(ANY, LOADED).click();

			sleep(0.5);
		}

		if (Common_Variables.centralHeatingEmergencyResponse == true) {

			Central_Heating_Emergency_Reponse(ANY, LOADED).click();

			sleep(0.5);
		}

		if (Common_Variables.centralHeatingResponsePlus == true) {

			Central_Heating_Response_Plus(ANY, LOADED).click();

			sleep(0.5);
		}

		Buy_now(ANY, LOADED).click();

		text_firstName2(ANY, LOADED).waitForExistence();

	}
}
