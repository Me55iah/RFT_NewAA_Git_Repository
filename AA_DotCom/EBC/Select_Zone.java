package EBC;

import resources.Common_Variables;
import resources.EBC.Select_ZoneHelper;
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
public class Select_Zone extends Select_ZoneHelper {
	/**
	 * Script Name : <b>Select_Zone</b> Generated : <b>16 Apr 2013 10:36:50</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/16
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		// XP Only version

		if (Common_Variables.zone.equals("1")) {

			link_zone1_3().click();
			sleep(1.0);
			button_chooseZone1().click();

		}
		if (Common_Variables.zone.equals("2")) {
			link_zone2_2().click();
			sleep(1.0);
			button_chooseZone2().click();

		}
		if (Common_Variables.zone.equals("3")) {

			link_zone3_2().click();
			sleep(1.0);
			button_chooseZone3().click();

		}
		if (Common_Variables.zone.equals("ALL")) {

			link_allZones2().click();
			sleep(1.0);
			button_chooseZonesAll().click();

		}

		link_amendTripDetails(ANY, LOADED).waitForExistence();
	}
}
