package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Unknown_RegistrationHelper;
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
public class Unknown_Registration extends Unknown_RegistrationHelper
{
	/**
	 * Script Name   : <b>Unknown_Registration</b>
	 * Generated     : <b>27 Aug 2015 14:09:03</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/08/27
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
			// LOGIC INCORRECT - WILL FIX WITH EVOLUTION
////		//-----------------------------------------------------------------------------------------
////		// Test Data
// 		Boolean bRegNumberKnown = false;
// 		String sRegNumber = "LSD305M";
// 		String sRegYear = "1999";
// 		String sVehicleMake = "ARO";
// 		String sVehicleModel = "240";
//		// Test Data
////		//-----------------------------------------------------------------------------------------
		//BrowserSync();
		text_aaVehicleReg().waitForExistence(25,  0.25);  // Sync
		//-----------------------------------------------------------------------------------------
		// Do You Know The Car Registration Number
		Boolean bRegNumberKnown = Common_Variables.regNumberKnown;
		String sRegNumber = Common_Variables.vehicleReg;
		String sRegYear = Common_Variables.vehicleRegYear;
		String sVehicleMake = Common_Variables.vehicleManufacturer;
		String sVehicleModel = Common_Variables.vehicleModel;
		//-----------------------------------------------------------------------------------------
		// Find By MAKE and MODEL
		//-----------------------------------------------------------------------------------------
		// Synchronisation
		//while (!label_noNoFindTheCarByMakeAndM().isShowing()){
		while (!label_iDonTKnowTheCarRegistrat().isShowing()){
			sleep(0.5);
		}
		sleep(2);
		//-----------------------------------------------------------------------------------------
		BrowserSync();
		//-----------------------------------------------------------------------------------------
		// SELECTION ISSUE FROM DATADRIVER _ STAND ALONE OK
		label_iDonTKnowTheCarRegistrat().waitForExistence(25,  0.25);
		//label_yes(ANY, READY).click();
		label_iDonTKnowTheCarRegistrat(ANY, READY).click();
		//BrowserSync();
		sleep(0.5);	
		//label_iDonTKnowTheCarRegistrat(ANY, READY).click();
 		//iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		//-----------------------------------------------------------------------------------------
		BrowserSync();
		//-----------------------------------------------------------------------------------------
		// Registration Year
		//-----------------------------------------------------------------------------------------		
		html_aaMotorVehicleRegyear().waitForExistence(25,  0.25);
		html_aaMotorVehicleRegyear(ANY, READY).click();
		sleep(0.5);	
		iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys(sRegYear+"+{TAB 2}");
		//-----------------------------------------------------------------------------------------		
		// Registration Year
		//-----------------------------------------------------------------------------------------		
		list_aaMotorVehicleMake().waitForExistence(25,  0.25);
		list_aaMotorVehicleMake(ANY, READY).click();
		sleep(0.5);	
		list_aaMotorVehicleMake(ANY, READY).click(atText(sVehicleMake));
		//-----------------------------------------------------------------------------------------		
		BrowserSync();
		//-----------------------------------------------------------------------------------------		
		// Model
		//--------------------------------------------------------------------
		list_aaMotorVehicleModel().waitForExistence(5,  0.25);			
		list_aaMotorVehicleModel(ANY, READY).click();
		//BrowserSync();
		sleep(0.5);	
		list_aaMotorVehicleModel().click(atText(sVehicleModel));
		sleep(0.5);		
		//-----------------------------------------------------------------------------------------		
		// Exact Model Selection
		//-----------------------------------------------------------------------------------------		
		try {
			callScript("Motor_MK2.The__Car.Vehicle_Model_Exact");
		} catch (Exception e) {
			// Exact Model Defaults
			//e.printStackTrace();
		//-----------------------------------------------------------------------------------------		
		}
	}
}

