package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Known_RegistrationHelper;
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
public class Known_Registration extends Known_RegistrationHelper
{
	/**
	 * Script Name   : <b>Known_Registration</b>
	 * Generated     : <b>26 Jun 2015 09:24:11</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// LOGIC INCORRECT - WILL FIX WITH EVOLUTION
//		//-----------------------------------------------------------------------------------------
//		// Test Data
//		Boolean bRegNumberKnown = true;
//		String sRegNumber = "LSD305M";
//		String sRegYear = "1999";
//		String sVehicleMake = "ARO";
//		String sVehicleModel = "240";
//		// Test Data
//		//-----------------------------------------------------------------------------------------
		text_aaVehicleReg().waitForExistence(25,  0.25);  // Sync
		//-----------------------------------------------------------------------------------------
		// Do You Know The Car Registration Number
		Boolean bRegNumberKnown = Common_Variables.regNumberKnown;
		String sRegNumber = Common_Variables.vehicleReg;
		String sRegYear = Common_Variables.vehicleRegYear;
		String sVehicleMake = Common_Variables.vehicleManufacturer;
		String sVehicleModel = Common_Variables.vehicleModel;
		//-----------------------------------------------------------------------------------------
		if (bRegNumberKnown == true){
 			//iE().activate();
			////label_yes().waitForExistence(5,  0.25);
			////label_yes(ANY, READY).click();
			//-----------------------------------------------------------------------------------------
//			callScript("Utilities.pageDown");
			//-----------------------------------------------------------------------------------------
			// Registration Number Entry
			text_aaVehicleReg().waitForExistence(5,  0.25);
			text_aaVehicleReg(ANY, READY).click(atPoint(112,24));
			iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sRegNumber);
			//-----------------------------------------------------------------------------------------
			// Find Car By Make And Model
			//-----------------------------------------------------------------------------------------
			// FIND IT!
			//sleep(0.5);
			//link_registrationConfirm().waitForExistence(5,  0.25);
			link_registrationConfirm(ANY, READY).click();
			//-----------------------------------------------------------------------------------------
			//BrowserSync();
			//-----------------------------------------------------------------------------------------	
			//sleep(0.5);
		}
		//-----------------------------------------------------------------------------------------	
		// * * * Hit Commit To Trigger Page Validation * * *
		// Otherwise, after completing page and not returning vehicle successfully, several fields are cleared and need re-entry
		button_nextsubmit().waitForExistence(5,  0.25);
		button_nextsubmit(ANY, READY).click();
		sleep(0.5);
		// * * * Hit Commit To Trigger Page Validation * * *		
		//-----------------------------------------------------------------------------------------	
		
		//else { // Registration Not Found :-)
		// If Plate Not Successfully Returned
		// String sNoRegistrationNumberMatch_Text = (String)label_doYouKnowTheRegistration().getProperty(".text");	
		String sNoRegistrationNumberMatch_Text = (String)html_vehicleLookUp().getProperty(".text");	
		
		
		//-------------------------------------------------------------------------
		// Detect Registration Match Unsuccessful Message		// We couldn't match the registration number
//		if (sNoRegistrationNumberMatch_Text.contains("Please check the registration number")){
		if (!link_changeCar().isShowing()){		
			//--------------------------------------------------------------------			
			// * * * DEFECT - HAVE TO PUT IN A REG * * *
			//-----------------------------------------------------------------------------------------
//			// Registration Number Entry
//			text_aaVehicleRegold().waitForExistence(20,  0.25);
//			text_aaVehicleRegold(ANY, READY).click(atPoint(112,24));
//			iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sRegNumber);
			//-----------------------------------------------------------------------------------------
			// * * * DEFECT - HAVE TO PUT IN A REG * * *
			//-----------------------------------------------------------------------------------------
//			callScript("Utilities.pageDown");
			//-----------------------------------------------------------------------------------------
// 			iE().activate();
			label_iDonTKnowTheCarRegistrat().waitForExistence(5,  0.25);
			// label_noFindTheCarByMakeAndMod(ANY, READY).click(atPoint(31,407));
			label_iDonTKnowTheCarRegistrat(ANY, READY).click();
			//-----------------------------------------------------------------------------------------		
			html_aaMotorVehicleRegyear().waitForExistence(5,  0.25);
			html_aaMotorVehicleRegyear(ANY, READY).click();
			iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys(sRegYear+"{TAB}");
			//--------------------------------------------------------------------
			sleep(1);
			list_aaMotorVehicleMake2().waitForExistence(5,  0.25);
			list_aaMotorVehicleMake2(ANY, READY).click();
			//sleep(0.5);
			//list_aaMotorVehicleMake(ANY, READY).click();
			sleep(0.5);
			list_aaMotorVehicleMake2().click(atText(sVehicleMake));
			//--------------------------------------------------------------------
			// Bring HMI Components into View
//			callScript("Utilities.pageDown");
// 			iE().activate();
			//--------------------------------------------------------------------
			list_aaMotorVehicleModel2().waitForExistence(5,  0.25);			
			list_aaMotorVehicleModel2(ANY, READY).click();
			sleep(0.5);
			list_aaMotorVehicleModel2().click(atText(sVehicleModel));
			//-----------------------------------------------------------------------------------------		
			// Exact Model Selection
			try {
				callScript("Motor_MK2.The__Car.Vehicle_Model_Exact");
			} catch (Exception e) {
				// Exact Model Defaults
				//e.printStackTrace();
			}
			//-----------------------------------------------------------------------------------------		
		}				
	}
}

