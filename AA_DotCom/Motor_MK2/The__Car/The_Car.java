package Motor_MK2.The__Car;
import javax.swing.text.StyledEditorKit.BoldAction;

import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Anticipated_Mileage_Purchase_DateHelper;
import resources.Motor_MK2.The__Car.The_CarHelper;
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
public class The_Car extends The_CarHelper
{
	/**
	 * Script Name   : <b>The_Car</b>
	 * Generated     : <b>29 May 2015 11:49:07</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/29
	 * @author horned
	 */
	public void testMain(Object[] args)   //  activate
	{

		//-----------------------------------------------------------------------------------------
		boolean bKnownRegistration = Common_Variables.regNumberKnown;
		//-----------------------------------------------------------------------------------------
		sleep(2);
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// Verification  -  CONFIRM SCREEN TRANSITION - NO VALIDATION ERRORS!!!!
		String sTitle = "The_CAR_Details_Data";
		String sReport = "The CAR Details Data Entry Was Successful, Your Details Screen Appeared As Expected";
		String sExpected = "Your details";
		String sActual = "";
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//--------------------------------------------------------------------
		// Do You Know The Car Registration Number
		//--------------------------------------------------------------------
		if (bKnownRegistration == true){
			callScript("Motor_MK2.The__Car.Known_Registration");  // OR NOT :-)
		}
		if (bKnownRegistration == false){
			callScript("Motor_MK2.The__Car.Unknown_Registration");
		}
		//--------------------------------------------------------------------		
		// Choose Vehicle Make and Model 
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Model_Selection");   // rem
		//--------------------------------------------------------------------		
		BrowserSync();		
		//--------------------------------------------------------------------------------		
		// Fuel Type
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Fuel_Type");
		//--------------------------------------------------------------------------------		
		// Transmission Type
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Transmission_Type");
		//--------------------------------------------------------------------
		// Enter Vehicle Value
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Value");
		//--------------------------------------------------------------------		
		// Vehicle Configuration RH/LH Drive and Number of Seats
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Configuration");
		//--------------------------------------------------------------------		
		//sVehicle Modification Type
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Modification");
		//--------------------------------------------------------------------------------		
		// DETAIL OFF SCREEN _ SCROLL INTO VIEW
		//--------------------------------------------------------------------
//		// Bring HMI Components into View
//		unregisterAll();
//		System.gc();
//		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Vehicle Security Device
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Security_Device");
		//--------------------------------------------------------------------------------		
		// DETAIL OFF SCREEN _ SCROLL INTO VIEW
		//--------------------------------------------------------------------
//		// Bring HMI Components into View
//		unregisterAll();
//		System.gc();
//		callScript("Utilities.pageDown");
//		//--------------------------------------------------------------------
		// Anticipated Annual Mileage and Purchase Date
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Anticipated_Mileage_Purchase_Date");
		//--------------------------------------------------------------------		
		// Vehicle Ownership - Anticipated Usage
		//--------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Ownership_Usage");
		//--------------------------------------------------------------------		
		// Vehicle Ownership - Anticipated Usage
		//--------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Overnight_Location"); // or sensation? :-)
		//--------------------------------------------------------------------		
		// Second Vehicle OR Caravan
		//--------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Other_Vehicle_Caravan"); // or sensation? :-)
		//--------------------------------------------------------------------
//		// Vehicle Configuration RH/LH Drive and Number of Seats
//		//--------------------------------------------------------------------
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.The__Car.Vehicle_Configuration");
//		//--------------------------------------------------------------------		
//		// Vehicle Fuel Type
//		//--------------------------------------------------------------------		
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.The__Car.Fuel_Type");
//		//--------------------------------------------------------------------------------		
//		// Transmission Type
//		//--------------------------------------------------------------------
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.The__Car.Transmission_Type");
//		//--------------------------------------------------------------------		
//		callScript("Motor_MK2.The__Car.Known_Registration");
// 		//--------------------------------------------------------------------------------				
//		
//		//--------------------------------------------------------------------
//		// Choose Exact Make and Model (Exact revisited at script end)
//		//--------------------------------------------------------------------
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.The__Car.Vehicle_Model_Selection");
//		//--------------------------------------------------------------------		
//		BrowserSync();		
//		//--------------------------------------------------------------------
		 
		
//		// Choose Exact Make and Model (Exact revisited at script end)
//		//--------------------------------------------------------------------
//		unregisterAll();
//		System.gc();
//		callScript("Motor_MK2.The__Car.Vehicle_Model_Selection");
//		//--------------------------------------------------------------------		
//	
//		
		//--------------------------------------------------------------------
		// FULL VEHICLE DETAIL IF MULTIPLE MODELS ARE AVAILABLE - SELECT SPECIFIC
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Model_Exact");  // If it exists
		//--------------------------------------------------------------------		
		
		
		//--------------------------------------------------------------------		
		// Vehicle Configuration RH/LH Drive and Number of Seats
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.The__Car.Vehicle_Configuration");   // rem
		//--------------------------------------------------------------------
		BrowserSync();		
		//--------------------------------------------------------------------
		// COMMIT CAR DETAILS
		button_nextsubmit().waitForExistence(20,  0.25);
		sleep(0.5);
	
		button_nextsubmit(ANY, READY).click();
		// Synchromisation - Validation Sluggish To Respond/Clear Entry Point
		sActual = (String)html_main().getProperty(".text");
		if (!sActual.contains("Your details")){
			sleep(5);
			button_nextsubmit(ANY, READY).click();
		}
		
		//--------------------------------------------------------------------
		BrowserSync();		
		//--------------------------------------------------------------------
		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		sActual = (String)html_main().getProperty(".text");
		if (sActual.contains("Your details")){
			sActual = "Your details";
		}
		//--------------------------------------------------------------------
		// Verify Success on CAR Details (YOUR DETAILS SCREEN APPEARANCE)
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------
		// END OF CAR
		//--------------------------------------------------------------------
		 
	}
}

