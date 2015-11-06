package Vehicle_Inspection;
import resources.Common_Variables;
import resources.Vehicle_Inspection.Vehicle_Details_LocationHelper;
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
public class Vehicle_Details_Location extends Vehicle_Details_LocationHelper
{
	/**
	 * Script Name   : <b>Vehicle_Details_Location</b>
	 * Generated     : <b>18 Sep 2015 11:29:54</b>
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
//		String sVehicleMake = "MAZDA";
//		String sVehicleModel = "2 SPORT D";
//		String sVehicleAbicode = "31539101";
//		String sVehicleRegYear = "2011";
//		String sVehicleNumberofDoors = "5";
//		String sVehicleDoorPlan = "5 DOOR HATCHBACK";
//		String sVehicleTransmissionType = "MANUAL";
//		String sVehicleEngineSize = "1560 CC";
//		String sRegistration_Value = "WU61ZNE";
//		String sVendorPostcode = "PO1 1DF";
		// Test Data
		//------------------------------------------------------------------------------------------  
		// FIELDS TO CAPTURE            * * * *    Appearance Dependent on Previous Selection  * * * *
		//------------------------------------------------------------------------------------------  
		// These are the vehicle's main details:		Typical Format
		// 1) - Make:		 							MAZDA
		// 2) - Model:				 					2 SPORT D
		// 3) - AbiCode:		 						31539101
		// 4) - Year:	 								2011
		// 5) - Doors:				 					5
		// 6) - DoorPlan: 								5 DOOR HATCHBACK
		// 7) - Gears:									MANUAL
		// 8) - Engine Size:							1560 CC
		//------------------------------------------------------------------------------------------ 
		
		String sVehicleMake = Common_Variables.vehicleManufacturer;
		String sVehicleModel = Common_Variables.vehicleModel;
		String sVehicleAbicode = Common_Variables.abicode;
		String sVehicleRegYear = Common_Variables.vehicleRegYear;
		String sVehicleNumberofDoors = Common_Variables.vehicleNumberofDoors;
		String sVehicleDoorPlan = Common_Variables.vehicleDoorPlan;
		String sVehicleTransmissionType = Common_Variables.vehicleGears;
		String sVehicleEngineSize = Common_Variables.vehicleEngineSize;
		String sRegistration_Value = Common_Variables.vehicleReg;
		String sVendorPostcode = Common_Variables.vendorPostcode;
		//------------------------------------------------------------
		String sContainer_Text = "";
		
		String sTitle = ""; String sReport = "";
		//------------------------------------------------------------
		// REGISTRATION MARK: * * * * * 
		// Compare Initial Registration Entry (DataPool) With This Screen Value
		sTitle = "Vehicle_Registration"; sReport = "Vehicle Registration";
		String sActualRegistration_Value = (String)text_reg(ANY,DISABLED).getProperty(".value");
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|--------- Actual --------|----- Expected -----|- Report -|
		VerifyandReport(sTitle, sActualRegistration_Value, sRegistration_Value, sReport);
		System.out.println("Vehicle Registration Mark = "+sRegistration_Value);	 
		//------------------------------------------------------------
		
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		sContainer_Text = (String)form_ctrlVehiclelocation().getProperty(".text");
		//System.out.println(sContainer_Text);
		//------------------------------------------------------------
		// VEHICLE MAKE: * * * * *
		//--------------
		sTitle = "Vehicle_Manufaturer"; sReport = "Vehicle Manufaturer";
		String sStartName = "Make:";  
		String sEndName = "Model:";                
		int iIndex = 1;
		String sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report Stored Value to Page Value	
		//------------------------------------------------------------
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleManufacturer = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleMake, sReport);
		//------------------------------------------------------------
		// VEHICLE MODEL: * * * * *
		//--------------
		sTitle = "Vehicle_Model"; sReport = "Vehicle Model";
		sStartName = "Model:";  
		sEndName = "AbiCode:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleModel = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleModel, sReport);
		//------------------------------------------------------------
		// ABICODE: * * * * *
		//--------------
		sTitle = "Vehicle_AbiCode"; sReport = "Vehicle AbiCode";
		sStartName = "AbiCode:";  
		sEndName = "Year:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.abicode = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleAbicode, sReport);
		//------------------------------------------------------------
		// YEAR: * * * * *
		//--------------
		sTitle = "Vehicle_Registration_Year"; sReport = "Vehicle Registration Year";
		sStartName = "Year:";  
		sEndName = "Doors:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleRegYear = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleRegYear, sReport);
		//------------------------------------------------------------
		// DOORS: (Count) * * * * *
		//--------------
		sTitle = "Vehicle_Door_Count"; sReport = "Vehicle Door Count";
		sStartName = "Doors:";  
		sEndName = "Door Plan:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleNumberofDoors = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleNumberofDoors, sReport);
		//------------------------------------------------------------
		// DOOR PLAN: * * * * *
		//--------------
		sTitle = "Vehicle_Door_Plan"; sReport = "Vehicle Door Plan";
		sStartName = "Door Plan:";  
		sEndName = "Gears:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleDoorPlan = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleDoorPlan, sReport);
		//------------------------------------------------------------
		// GEARS: * * * * *
		//--------------
		sTitle = "Vehicle_Transmission_Type"; sReport = "Vehicle Transmission Type";
		sStartName = "Gears:";  
		sEndName = "Engine Size:";               
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleGears = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleTransmissionType, sReport);
		//------------------------------------------------------------
		// ENGINE SIZE: * * * * *
		//--------------
		sTitle = "Vehicle_Engine_Size"; sReport = "Vehicle Engine Size";
		sStartName = "Engine Size: ";  
		sEndName = "Please give";   // Space Detection ?           
		iIndex = 1;
		sStartNameContent = null;
		//------------------------------------------------------------
		// Compare and Report	
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
		//------------------------------------------------------------
		Common_Variables.vehicleEngineSize = Common_Variables.sActual;
		//------------------------------------------------------------
		// Verify The Stored Value Matches The Service Lookup Value
		//------------------------------------------------------------
		//             |-Title-|-------- Actual -------|-- Expected --|- Report -|
		VerifyandReport(sTitle, Common_Variables.sActual, sVehicleEngineSize, sReport);
		//------------------------------------------------------------------------------------------
		// Vendors Postcode
		text_vendor_postcode(ANY, LOADED).waitForExistence(2, 0.25);
		text_vendor_postcode(ANY, READY).click();
		iE(html_ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sVendorPostcode);
		//------------------------------------------------------------------------------------------
		// Continue to NEXT Page
		button_pleaseGiveMeAQuote(ANY, LOADED).waitForExistence(20, 0.25);
		button_pleaseGiveMeAQuote(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Negative Test - POSTCODE NOT COVERED
		try {
			String sPostcode_Not_Covered = (String)form_accordingToThePostcodeYou().getProperty(".text");
			
			//----------------------------------------------------------------------------------------------
			if (sPostcode_Not_Covered.contains(sVendorPostcode)){
				logTestResult("This Geographical Area is NOT Covered By VI ("+sVendorPostcode+")  ", true);
				System.out.println("This Geographical Area is NOT Covered By VI ("+sVendorPostcode+")  ");
			}
			else{
				logTestResult("This Geographical Area is NOT Covered By VI ("+sVendorPostcode+")  ", true);
				System.out.println("This Geographical Area is NOT Covered By VI ("+sVendorPostcode+")  ");
			}
 
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		
//		// Postcode Vehicle Location
//		
//		
//		//------------------------------------------------------------------------------------------
//		// Synchronise
//		form_ctrlVehiclelocation(ANY, LOADED).waitForExistence(50, 0.25);
//		sleep(2);
//		//------------------------------------------------------------------------------------------
//		// Grab Textual Content From Screen
//		String sContainer_Confirmation = (String)form_ctrlVehiclelocation().getProperty(".contentText");		
//		//------------------------------------------------------------------------------------------
//        // VP Thanks for buying Basic Breakdown Insurance 
//        //html_container().performTest( Journey_CompleteVP() );          //***************
//		//------------------------------------------------------------------------------------------
//        // Separate All Number Groups (As Tokens) From Above TExtual Content
//		int i = 0;
//        String delims = "[^.0-9]+";
//        String[] tokens = sContainer_Confirmation.split(delims);
//		//------------------------------------------------------------------------------------------
//        // Report On The 15th Token (Contains Customer Number)     
//        System.out.println(" Reported Customer Number Is "+tokens[15]);
//        logTestResult(" Reported Customer Number Is "+tokens[15], true);
//        
//        
//        vpManual("Journey_Complete", "Journey_Complete", "Journey_Complete").performTest(); 
//        logTestResult(" Journey Complete ", true);
//		//------------------------------------------------------------------------------------------

		
		
		
	}
}

