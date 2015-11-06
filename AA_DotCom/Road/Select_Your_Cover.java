package Road;

import resources.Common_Variables;
import resources.Road.Select_Your_CoverHelper;
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
public class Select_Your_Cover extends Select_Your_CoverHelper {
	/**
	 * Script Name : <b>Select_Your_Cover</b> Generated : <b>8 Apr 2013
	 * 13:29:37</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/08
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(3.0);
		
//		boolean certWarning = html_mainTitle().exists();
//
//		if (certWarning == true) {
//			link_overridelink().click();
//		}

		if (Common_Variables.upgrades_AtHome == true) {
			checkBox_selectedOptionshomeSt(ANY, LOADED).click();
		}

		if (Common_Variables.upgrades_Recovery == true) {
			checkBox_selectedOptionsrelay(ANY, LOADED).click();
		}

		if (Common_Variables.upgrades_StayMobile == true) {
			checkBox_selectedOptionsstayMo(ANY, LOADED).click();
		}

		if (Common_Variables.upgrades_BRC == true) {
			checkBox_selectedOptionsbreakd(ANY, LOADED).click();
		}

		sleep(3.0);

		
		// MAF Textual Verification
		logInfo(" * * * MAF TEXTUAL CHECKS FOR BREAKDOWN COVER SELECTION PAGE FOLLOWS * * * ");
		callScript("Verification.MAF_Road_Textual");
		logInfo(" * * * MAF TEXTUAL CHECKS FOR BREAKDOWN COVER SELECTION PAGE COMPLETED * * * ");

		
//		button_continue().click();

		// if (Common_Variables.upgrades_BRC == true) {
		//
		// form_vehicleNumberPlateAddAVeh().waitForExistence();
		//
		// text_vehReg().setText(Common_Variables.vehicleReg);
		// sleep(2.0);
		// button_continue4().click();
		// sleep(5.0);
		// button_continue4().click();
		// sleep(5.0);
		//
		// }
		//
		// label_coverForYouYouReCoveredA().waitForExistence();

	}
}
