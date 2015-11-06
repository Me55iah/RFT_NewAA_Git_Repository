package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_Ownership_UsageHelper;
import Utilities.pageDown;

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
public class Vehicle_Ownership_Usage extends Vehicle_Ownership_UsageHelper
{
	/**
	 * Script Name   : <b>Vehicle_Ownership</b>
	 * Generated     : <b>26 Jun 2015 11:25:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//--------------------------------------------------------------------		
//		// Test Data
//		String sVehicleOwner = "Policyholder";
//		String sRegisteredKeeper = "Policyholder";
//		String sVehicleUsage = "Social, Domestic, Pleasure & Commuting (No Business Use)";
//		boolean bHaveCarAlready = true;
//		// Test Data
//		//--------------------------------------------------------------------		
		// Vehicle Ownership - Anticipated Usage
		//--------------------------------------------------------------------		
		String sVehicleOwner = Common_Variables.vehicleOwner;
		String sRegisteredKeeper = Common_Variables.vehicleRegisteredKeeper;
		String sVehicleUsage = Common_Variables.vehicleUsage;
		boolean bHaveCarAlready = Common_Variables.vehicleHaveAlready;
		//--------------------------------------------------------------------		
		// Do You Have The Car Yet?
		if (bHaveCarAlready == false){
			label_iDonTHaveTheCarYet().waitForExistence(20,  0.25);			
			label_iDonTHaveTheCarYet(ANY, READY).click();
		}		
		//--------------------------------------------------------------------
		// Vehicle Owner
		list_aaMotorVehicleVehicleOwne().waitForExistence(20,  0.25);
		list_aaMotorVehicleVehicleOwne(ANY, READY).click();
		list_aaMotorVehicleVehicleOwne(ANY, READY).click(atText(sVehicleOwner));
		//--------------------------------------------------------------------
		// Registered Keeper
		list_aaMotorVehicleRegisteredT().waitForExistence(20,  0.25);
		list_aaMotorVehicleRegisteredT(ANY, READY).click();
		list_aaMotorVehicleRegisteredT(ANY, READY).click(atText(sRegisteredKeeper));
		//--------------------------------------------------------------------
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Vehicle Usage
		list_aaVehicleUsage().waitForExistence(20,  0.25);
		list_aaVehicleUsage(ANY, READY).click();
		sleep(0.5);
		list_aaVehicleUsage(ANY, READY).click(atText(sVehicleUsage));
		//--------------------------------------------------------------------
	}
}

