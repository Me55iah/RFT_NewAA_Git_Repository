package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_Model_SelectionHelper;
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
public class Vehicle_Model_Selection extends Vehicle_Model_SelectionHelper
{
	/**
	 * Script Name   : <b>Exact_Model_Selection</b>
	 * Generated     : <b>26 Jun 2015 09:38:14</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//--------------------------------------------------------------------	
////		// Test Data
//		String sYearOfManufacture = "1970";
//		String sVehicleModel = "CORTINA";
//		String sVehicleManufacturer = "FORD";
////		// Test Data
//		//--------------------------------------------------------------------	
		// Choose Exact Make and Model
		//--------------------------------------------------------------------	
		String sYearOfManufacture = Common_Variables.vehicleRegYear;
		String sVehicleModel = Common_Variables.vehicleModel;
		String sVehicleManufacturer = Common_Variables.vehicleManufacturer;
		//--------------------------------------------------------------------	
		
		sleep(5); //		BrowserSync();
	
		// If Plate Not Successfully Returned
		String sNoRegistrationNumberMatch_Text = (String)html_vehicleLookUp().getProperty(".text");	// label_doYouKnowTheRegistration	
		//-------------------------------------------------------------------------
		// Detect Registration Match Unsuccessful Message		// We couldn't match the registration number
		if (sNoRegistrationNumberMatch_Text.contains("find the car by make and model.")){
			//--------------------------------------------------------------------			
			// Set Values Manually
			label_iDonTKnowTheCarRegistrat().waitForExistence(10,  0.25);
			label_iDonTKnowTheCarRegistrat(ANY, READY).click();
			sleep(1);
			//--------------------------------------------------------------------		
//			if (list_aaMotorVehicleModel().isEnabled()){
//				sleep(2);
				//--------------------------------------------------------------------
			try {
				//--------------------------------------------------------------------
				// Year of Registration
				//--------------------------------------------------------------------				
				html_aaMotorVehicleRegyear().waitForExistence(10,  0.25);
				html_aaMotorVehicleRegyear(ANY, READY).click(atPoint(48,32));
				iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sYearOfManufacture);
				//iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys("{TAB}");
				
		
				iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys("{ENTER}");
				
				
				sleep(1);
	//			html_aaMotorVehicleRegyear().click(atPoint(103,34));
	//			iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys("1970{TAB}");
	//			list_aaMotorVehicleMake().click();
	//			list_aaMotorVehicleMake().click(atText("FORD"));
	//			list_aaMotorVehicleModel().click();
	//			list_aaMotorVehicleModel().click(atText("CORTINA"));
				//--------------------------------------------------------------------
				// Select Manufacturer
				//--------------------------------------------------------------------			
				// BrowserSync();
				//--------------------------------------------------------------------		
	 			//iE().activate();
				//callScript("Utilities.pageDown");
 				list_aaMotorVehicleMake2().waitForExistence(10,  0.25);
 	 			list_aaMotorVehicleMake2(ANY, READY).click();
				sleep(0.25);
				//list_aaMotorVehicleMake(ANY, READY).click();
				list_aaMotorVehicleMake2(ANY, READY).click(atText(sVehicleManufacturer));
				sleep(0.25);
				// Selection Issue, RETRY
 	 			list_aaMotorVehicleMake2(ANY, READY).click();
				sleep(0.25);
				//list_aaMotorVehicleMake(ANY, READY).click();
				list_aaMotorVehicleMake2(ANY, READY).click(atText(sVehicleManufacturer));
				sleep(0.25);
				//--------------------------------------------------------------------
				// Bring HMI Components into View
				// callScript("Utilities.pageDown");
				//--------------------------------------------------------------------
				// Select Model
				//--------------------------------------------------------------------			
//				BrowserSync();
				//--------------------------------------------------------------------			
	 			// iE().activate();
				list_aaMotorVehicleModel2().waitForExistence(10,  0.25);
	 			list_aaMotorVehicleModel2(ANY, READY).click();
				sleep(0.5);
				// list_aaMotorVehicleModel(ANY, READY).click();
				list_aaMotorVehicleModel2(ANY, READY).click(atText(sVehicleModel));
			} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		 
				//--------------------------------------------------------------------						
//		 
			}//--------------------------------------------------------------------		
		}	
	//stop();
	}
}

