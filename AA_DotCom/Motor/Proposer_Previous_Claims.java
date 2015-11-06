package Motor;

import resources.Common_Variables;
import resources.Motor.Proposer_Previous_ClaimsHelper;
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
public class Proposer_Previous_Claims extends Proposer_Previous_ClaimsHelper {
	/**
	 * Script Name : <b>Proposer_Previous_Claims</b> Generated : <b>28 Mar 2013
	 * 08:51:07</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/28
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		// HTML Browser
		// Document: Car Insurance: Your details - The AA: RegularExpression(.*.theaa\.com/car-insurance/buy/policyholder-details.*)
		document_carInsuranceYourDetai().drag(atPoint(1588,614), 
                                        atPoint(1580,471));
		link_addDetails().waitForExistence();
		
		link_addDetails().click();
		
		//link_addAClaim().click();

		if (Common_Variables.MSM == false) {

			//------------------------------------------------------------------------------------------
			callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
			//------------------------------------------------------------------------------------------
			
			list_aaMotorDrivers0Claims0Rea(ANY, LOADED).waitForExistence();

			list_aaMotorDrivers0Claims0Rea(ANY, LOADED).click(
					atText("Hit by Third Party"));

			text_aaMotorDrivers0Claims0Val(ANY, LOADED).setText(
					dpString("aaMotorDrivers0Claims0Value"));
			list_aaMotorDrivers0Claims0Mon(ANY, LOADED).select(
					dpString("aaMotorDrivers0Claims0Month"));
			list_aaMotorDrivers0Claims0Yea(ANY, LOADED).select(
					dpString("aaMotorDrivers0Claims0Year"));

			radioButton_aaMotorDrivers0Cla(ANY, LOADED).click();
			radioButton_aaMotorDrivers0Cla2(ANY, LOADED).click();

		}

		if (Common_Variables.MSM == true) {

			if (Common_Variables.prevClaimNumber == 1) {
				
				//------------------------------------------------------------------------------------------
				callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
				//------------------------------------------------------------------------------------------

				list_aaMotorDrivers0Claims0Rea(ANY, LOADED).waitForExistence();

				list_aaMotorDrivers0Claims0Rea(ANY, LOADED).click(
						atText(Common_Variables.insuredFirstClaimDescription));

				text_aaMotorDrivers0Claims0Val(ANY, LOADED).setText(
						dpString("aaMotorDrivers0Claims0Value"));
				list_aaMotorDrivers0Claims0Mon(ANY, LOADED).select(Common_Variables.insuredFirstClaimMonth);
				list_aaMotorDrivers0Claims0Yea(ANY, LOADED).select(Common_Variables.insuredFirstClaimYear);

				radioButton_aaMotorDrivers0Cla(ANY, LOADED).click();
				radioButton_aaMotorDrivers0Cla2(ANY, LOADED).click();
			}
			
			if (Common_Variables.prevClaimNumber == 2) {
				
				//------------------------------------------------------------------------------------------
				callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
				//------------------------------------------------------------------------------------------

				list_aaMotorDrivers0Claims0Rea(ANY, LOADED).waitForExistence();

				list_aaMotorDrivers0Claims0Rea(ANY, LOADED).click(
						atText(Common_Variables.insuredSecondClaimDescription));

				text_aaMotorDrivers0Claims0Val(ANY, LOADED).setText(
						dpString("aaMotorDrivers0Claims0Value"));
				list_aaMotorDrivers0Claims0Mon(ANY, LOADED).select(Common_Variables.insuredSecondClaimMonth);
				list_aaMotorDrivers0Claims0Yea(ANY, LOADED).select(Common_Variables.insuredSecondClaimYear);

				radioButton_aaMotorDrivers0Cla(ANY, LOADED).click();
				radioButton_aaMotorDrivers0Cla2(ANY, LOADED).click();
			}

		}

		//sleep(2.0);
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		link_claimsConfirm(ANY, READY).click();

		//sleep(5.0);
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

	}
}
