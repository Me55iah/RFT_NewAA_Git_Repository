package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.Vehicle_DetailsHelper;
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
 * Description   : Functional Test Script
 * @author horned
 */



////////////////////////////////////////////////////////////////////////////////////////
//
//Uplift of EBC - Dave Horne - December 2014
//
////////////////////////////////////////////////////////////////////////////////////////

public class Vehicle_Details extends Vehicle_DetailsHelper
{
	/**
	 * Script Name   : <b>Vehicle_Details</b>
	 * Generated     : <b>5 Dec 2014 11:16:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// This page is Displayed IF Vehicle Details are NOT Found by System
		// 1 Off Case NKD305M 1970s MK3 Cortina
		logTestResult("Vehicle Registration - NKD305M Not Detected By LookUp", true);
		//------------------------------------------------------------------------------------------
		// Synchronise
		list_registrationYear(ANY, LOADED).waitForExistence(20, 0.25);

		//------------------------------------------------------------------------------------------		
		// Registration Make and Model
		
		list_registrationYear(ANY, READY).select("1971");
		list_vehicleManufacture(ANY, READY).select("Ford");
		list_vehicleModel(ANY, READY).select("Cortina");
		
		//------------------------------------------------------------------------------------------
		// Fuel Type

		label_petrol().waitForExistence(2,  0.25);
		label_petrol(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		// Transmission Type

		label_manual().waitForExistence(2,  0.25);
		label_manual(ANY, READY).click();
		logTestResult("Vehicle Registration - NKD305M Details Entered Manually", true);
		
		//------------------------------------------------------------------------------------------
		// Submit
		continue_Submit(ANY, LOADED).waitForExistence(20, 0.25);
		continue_Submit(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		
		
	}
}

