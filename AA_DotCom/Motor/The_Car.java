package Motor;

import resources.Common_Variables;
import resources.Motor.The_CarHelper;
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
public class The_Car extends The_CarHelper {
	/**
	 * Script Name : <b>The_Car</b> Generated : <b>6 Mar 2013 13:59:09</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/03/06
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		link_registrationConfirm().waitForExistence(50.0, 0.25);

		text_aaVehicleReg().setText(Common_Variables.vehicleReg);

		link_registrationConfirm(ANY, LOADED).click();

		//sleep(2.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		boolean vehicleFound = html_foundVehicle().ensureObjectIsVisible();

		while (vehicleFound == false) {
			sleep(1.0);
			vehicleFound = html_foundVehicle().ensureObjectIsVisible();
		}


		html_aaVehicleValue(ANY, LOADED).click(atPoint(47,13));

		// text_aaVehicleValue2().click(atPoint(25, 11));  p
		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.vehicleValue);

		list_aaMotorVehicleNoOfSeats(ANY, LOADED).select("5");

		radioButton_aaVehicleRhdtrue(ANY, LOADED).setState(SELECTED);

		radioButton_aaVehicleModifiedf(ANY, LOADED).setState(SELECTED);

		radioButton_aboutYourCar2MANUF(ANY, LOADED).setState(SELECTED);

		html_aboutYourCar1(ANY, LOADED).click(atPoint(6, 11));

		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputKeys("10000{TAB}");
		sleep(0.5);

		checkBox_aaMotorNotOwnCartrue(ANY, LOADED).click();

		list_aaMotorVehicleVehicleOwne(ANY, LOADED).click();
		list_aaMotorVehicleVehicleOwne(ANY, LOADED).click(atText("Policyholder"));
		list_aaMotorVehicleRegisteredT(ANY, LOADED).click();
		list_aaMotorVehicleRegisteredT(ANY, LOADED).click(atText("Policyholder"));

		if (Common_Variables.businessUse == false) {
			list_aaVehicleUsage().select(
					"Social, Domestic, Pleasure & Commuting (No Business Use)");
		}

		if (Common_Variables.businessUse == true) {
			list_aaVehicleUsage().select(
					"Social, Domestic, Pleasure and Business Use");
		}

		//sleep(0.5);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");

		sleep(0.5);
		//------------------------------------------------------------------------------------------
		// Where Car Is Stored
		list_aboutYourCar1().click();
		list_aboutYourCar1().click(atText(Common_Variables.VehicleKeptLocation));
		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		//------------------------------------------------------------------------------------------

		sleep(0.5);

		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");
		//------------------------------------------------------------------------------------------
		// Where Car Is Stored Button Selection - 
		radioButton_aaVehicleKeptLocat().setState(SELECTED); // Kept At Home
		radioButton_aaMotorDrivers0Use().setState(SELECTED);

		browser_htmlBrowser(document_carInsuranceTheCarThe(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");

		//------------------------------------------------------------------------------------------
		// Other Vehicle Data Setup - Default Set To NO (false, Other Vehicle) DH 13/02/15
		if (Common_Variables.otherVehicleUsage == true){
			// Selected Radio Button
			radioButton_aaMotorDrivers0Use4().waitForExistence(20,  0.25);
			radioButton_aaMotorDrivers0Use4(ANY, READY).click();
			// Assumption That Selection Success - Would Fail Next Step If Selection Failure
			logTestResult(" Other Vehicle Usage CheckBox Was Selected", true);
			//----------------------------------------------------------------
			// Set Any Parameters That Are Required from DP
			callScript("Motor.MVD");
		}
		
		//sleep(2.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		button_nextsubmit(ANY, READY).click();

		//sleep(5.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		String htmlBrowser_DocumentName = (String) browser_htmlBrowser()
				.getProperty(".documentName");

		boolean nextPage = htmlBrowser_DocumentName
				.contains("car-insurance/buy/policyholder-details");

		if (nextPage == false) {

			String DocumentName = (String) browser_htmlBrowser().getProperty(
					".documentName");
			
			Common_Variables.timeout = DocumentName.contains("timeout");

			if (Common_Variables.timeout == true) {
				
			} else {

				
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------
			
				button_nextsubmit(ANY, READY).click();
				//sleep(5.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------
			}
		}

		unregisterAll();

	}
}
