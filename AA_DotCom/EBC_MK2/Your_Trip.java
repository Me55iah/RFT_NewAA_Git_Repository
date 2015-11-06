package EBC_MK2;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.EBC_MK2.Your_TripHelper;
import com.rational.test.ft.*;
import Utilities.Portal_Synchronisation;
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
//Uplift of EBC - Dave Horne - December 2014  - COVER TYPE DETAILS SCREEN (Step 1) (COVER TYP SCRIPT SURPLUS)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Your_Trip extends Your_TripHelper
{
	/**
	 * Script Name   : <b>Your_Trip</b>
	 * Generated     : <b>5 Dec 2014 09:52:46</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// Debug
		//(Common_Variables.vehicleReg) = "NKD305M";
		//(Common_Variables.EBC_Product) = "Single trip";
		// Debug		
		
		//------------------------------------------------------------------------------------------
		// Synchronise
		Registration_Number().waitForExistence(25.0, 0.25);
		//------------------------------------------------------------------------------------------
		// Enter Registration Number
		Registration_Number().setText(Common_Variables.vehicleReg);
		//------------------------------------------------------------------------------------------
		// Annual Cover or Single Trip
		switch (Common_Variables.EBC_Product){
		
			case "Single trip":                               // From (START) and until (END) dated
				label_singleTrip().waitForExistence(20.0,  0.25);
				label_singleTrip(ANY, READY).click();
				logInfo(" Single Trip Selected");
				break;
		
			case "Annual cover":                              // From (START) date only
				label_annual().waitForExistence(20.0,  0.25);
				label_annual(ANY, READY).click();
				logInfo(" Annual Cover Selected");
				break;
		}
		//------------------------------------------------------------------------------------------
		// All Cover Lengths Dealt With Below
		callScript("Utilities.Joda_Date_Selection");
		//------------------------------------------------------------------------------------------
		// Hit Continue TO Set Zone
		continue_Submit().waitForExistence(25.0,  0.25);
		continue_Submit(ANY, READY).click();	
//		//------------------------------------------------------------------------------------------
//		// Detect Unknown Vehicle (Current Main Window is Unnamed, So GO For The Prominent Control)
//		// 1 case pre-defined NKD305M
//		sleep(0.5);
//		if (button_Zone1().isShowing()){
//			return;
//		}
//		// Detect The Rogue Registration Plate :-)
//		callScript("EBC_MK2.Vehicle_Details");
//		//------------------------------------------------------------------------------------------						
	}
}

