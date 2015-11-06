package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Other_Vehicle_CaravanHelper;
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
public class Other_Vehicle_Caravan extends Other_Vehicle_CaravanHelper
{
	/**
	 * Script Name   : <b>Second_Vehicle_Caravan</b>
	 * Generated     : <b>26 Jun 2015 13:16:25</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

//		//-------------------------------------------------------------------------
//		// Test Data	
//		//-------------------------------------------------------------------------
//		Boolean bAnotherVehicle = true;
//		Boolean bMainDriverCompanyCar = true;		
//		Boolean bAnotherPolicy = false;		
//		Boolean bCompanyCarPersonalUse = false;	
//		Boolean bNamedDriver = false;		
//		Boolean bCaravanOwner = false;		
//		Boolean bCurrentyUsingCompanyCar = false;
//		String sOtherVehicle_NCD = "4";
//		String sCompanyCarYears = "1";
//		//-------------------------------------------------------------------------
//		// Test Data	
//		//-------------------------------------------------------------------------
		// Second Vehicle and/or Caravan
//		//-------------------------------------------------------------------------
		Boolean bAnotherVehicle = Common_Variables.otherVehicle;
		Boolean bMainDriverCompanyCar = Common_Variables.mainDriverCompanyCar; // false;		
		Boolean bAnotherPolicy = Common_Variables.anotherPolicy; // false;		
		Boolean bCompanyCarPersonalUse = Common_Variables.companyCarPersonalUse; // false;	
		Boolean bNamedDriver = Common_Variables.namedDriver; // false;		
		Boolean bCaravanOwner = Common_Variables.caravanOwner; // false;		
		Boolean bCurrentyUsingCompanyCar = Common_Variables.companyCarinUse; // false;
		String sOtherVehicle_NCD = Common_Variables.otherVehicle_NCD;
		String sCompanyCarYears = Common_Variables.companyCarYears; // "4";
//		//-------------------------------------------------------------------------
//		// Own a Second (or more) Vehicles		
		if (bAnotherVehicle == true){
			label_yes_OV().waitForExistence(20,  0.25);
			label_yes_OV(ANY, READY).click();
			sleep(0.5);
			//--------------------------------------------------------------------
			// Options
			//--------------------------------------------------------------------
			// I have another car insured in my name (I'm the policyholder) 
			//--------------------------------------------------------------------
			if (bAnotherPolicy == true){
				label_iHaveAnotherCarInsuredIn().waitForExistence(5,  0.25);
				label_iHaveAnotherCarInsuredIn(ANY, READY).click();
				//----------------------------------------------------------------
				// ENTER NUMBER OF YEARS NCD
				//----------------------------------------------------------------
				text_aaMotorDrivers0OtherVehic().waitForExistence(5,  0.25);
				text_aaMotorDrivers0OtherVehic(ANY, READY).click(atPoint(182,32));
				iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sOtherVehicle_NCD);
			}
			//--------------------------------------------------------------------
			// I am the main driver of a company car 
			//--------------------------------------------------------------------
			if (bMainDriverCompanyCar == true){
				label_iAmTheMainDriverOfACompa().waitForExistence(5,  0.25);
				label_iAmTheMainDriverOfACompa(ANY, READY).click();
				//----------------------------------------------------------------
				// Years Driving The Company Car
				//----------------------------------------------------------------
				sleep(1);
				text_aaMotorDrivers0OtherVehic2().waitForExistence(5,  0.25);
				text_aaMotorDrivers0OtherVehic2(ANY, READY).click(atPoint(160,26));
				iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sCompanyCarYears);
				//----------------------------------------------------------------
				// Are you insured to drive the company car outside work? 
				//----------------------------------------------------------------
				// No Other Activity
				if (bCompanyCarPersonalUse == true){
					label_yes_IOS().waitForExistence(5,  0.25);
					label_yes_IOS(ANY, READY).click();
				}
				else{
					label_no_IOS().waitForExistence(5,  0.25);
					label_no_IOS(ANY, READY).click();
				}			
			}
			//----------------------------------------------------------------
			// Are you currently using the company car?
			//----------------------------------------------------------------						
			if (bCurrentyUsingCompanyCar == true){
				label_yes_UCC().waitForExistence(5,  0.25);
				label_yes_UCC(ANY, READY).click();
			}
			else{
				label_no_UCC().waitForExistence(5,  0.25);
				label_no_UCC(ANY, READY).click();
				//------------------------------------------------------------
				// If Not, When Did You Last Use It
				//------------------------------------------------------------
				// Month And Year
				//------------------------------------------------------------
				list_aaMotorDrivers0OtherVehic().waitForExistence(5,  0.25);
				list_aaMotorDrivers0OtherVehic(ANY, READY).click();
				list_aaMotorDrivers0OtherVehic(ANY, READY).click(atText("January"));
				list_aaMotorDrivers0OtherVehic2(ANY, READY).click();
				list_aaMotorDrivers0OtherVehic2(ANY, READY).click(atText("2015"));
			}		
			//--------------------------------------------------------------------
			// I am a named driver on another car insurance policy 
			//--------------------------------------------------------------------
			if (bNamedDriver == true){
				// NO OTHER ACTIVITY
				label_iAmANamedDriverOnAnother().waitForExistence(5,  0.25);
				label_iAmANamedDriverOnAnother(ANY, READY).click();
			}
		//-----------------------------------------------------------------------
		}
		else {
			label_no_OV().waitForExistence(20,  0.25);
			label_no_OV(ANY, READY).click();
		}
		//-----------------------------------------------------------------------
		// Own a Caravan		
		if (bCaravanOwner == true){
			label_Caravan_yes().waitForExistence(20,  0.25);		
			label_Caravan_yes(ANY, READY).click();
		}
		else {
			label_Caravan_no().waitForExistence(20,  0.25);		
			label_Caravan_no(ANY, READY).click();
		//-----------------------------------------------------------------------
		}
	}
}

