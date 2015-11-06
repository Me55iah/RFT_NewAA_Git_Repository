package Vehicle_Inspection;
import resources.Common_Variables;
import resources.Vehicle_Inspection.Vehicle__InspectionHelper;
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
public class Vehicle__Inspection extends Vehicle__InspectionHelper
{
	/**
	 * Script Name   : <b>Vehicle__Inspection</b>
	 * Generated     : <b>18 Sep 2015 10:58:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/18
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//------------------------------------------------------------------------------------------						
		// Test Data
//		String sVehicleType = "Car";//
//		String sVehicleReg = "WU61ZNE";// 
		// Test Data
		//------------------------------------------------------------------------------------------						
		// DP Connection
		
		String sVehicleType = Common_Variables.vehicleType;
 		String sVehicleReg = Common_Variables.vehicleReg;		
		
		BrowserSync();
		//--------------------------------------------------------------------
		// Vehicle Registration
		text_registration_number().waitForExistence(10.0,  0.25);
		text_registration_number(ANY, READY).click();
		iE(html_ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sVehicleReg);		
		//--------------------------------------------------------------------
		// Synchronise
		text_registration_number(ANY, LOADED).waitForExistence(20, 0.25);
		
		//------------------------------------------------------------------------------------------
		// Default Value ????
		// Select the ZONE that's Required
		switch (sVehicleType){
			
			case "Car":
				label_car(ANY, READY).click();
				logInfo("Car Selected on Vehicle Inspections Page");
				break;
				//--------------------------------------------
			case "Van":
				label_van(ANY, READY).click();
				logInfo("Van Selected on Vehicle Inspections Page");
				break;
				//--------------------------------------------
			case "Motorhome":
				label_motorhome(ANY, READY).click();
				logInfo("Motorhome Selected on Vehicle Inspections Page");
				break;
				//--------------------------------------------
			case "4X4":
				label_motor_4X4(ANY, READY).click();
				logInfo("4 X 4 Selected on Vehicle Inspections Page");
				break;
		}
		
		//------------------------------------------------------------------------------------------
		// Continue to NEXT Page
		button_continuesubmit(ANY, LOADED).waitForExistence(20, 0.25);
		button_continuesubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		
	}
}

