package EBC_MK2;
import resources.Common_Variables;
import resources.EBC_MK2.Select_ZoneHelper;
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
//   Uplift of EBC - Dave Horne - December 2014 - ZONE DETAILS SCREEN (Step 2)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Select_Zone extends Select_ZoneHelper
{
	/**
	 * Script Name   : <b>Select_Zone</b>
	 * Generated     : <b>5 Dec 2014 09:51:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
	public void testMain(Object[] args) {
		
/*		// Debug Test Data Start   **** COMMENT I AND OUT AS REQUIRED ****
		
		(Common_Variables.zone) = "ALL";
		//(Common_Variables.coverType) = "Single";
		
		// ********************      Debug Test Data End     ***************************	
*/		
		
		//------------------------------------------------------------------------------------------
		// Detect Unknown Vehicle (Current Main Window is Unnamed, So GO For The Prominent Control)
		// 1 case pre-defined NKD305M
//		sleep(2);
//		try {
//			if (label_yearOfRegistration().isShowing()){
//				// Detect The Rogue Registration Plate :-)
//				callScript("EBC_MK2.Vehicle_Details");
//			}
//		}
//		catch (ObjectNotFoundException e){
//			// Just Ignore
//		}
		//------------------------------------------------------------------------------------------						
		if ((Common_Variables.vehicleReg).equalsIgnoreCase("NKD305M")){
			callScript("EBC_MK2.Vehicle_Details");
		}
		//------------------------------------------------------------------------------------------
		// Synchronise
		label_zone1(ANY, LOADED).waitForExistence(20, 0.25);
		
		//------------------------------------------------------------------------------------------
		// Default Value ZONE 1
		// Select the ZONE that's Required
		switch (Common_Variables.zone){
			
			case "1":
				label_zone1(ANY, READY).click();
				logInfo("Zone 1 Selected (8 Countries)");
				break;
				
			case "2":
				label_zone2(ANY, READY).click();
				logInfo("Zone 2 Selected (17 Countries)");
				break;
				
			case "3":
				label_zone3(ANY, READY).click();
				logInfo("Zone 3 Selected (37 Countries)");
				break;
				
			case "ALL":
				label_allZones(ANY, READY).click();
				logInfo("All Zones Selected (44 Countries)");
				break;
		}
		
		//------------------------------------------------------------------------------------------
		// Continue to NEXT Page
		continueWithZone(ANY, LOADED).waitForExistence(20, 0.25);
		continueWithZone(ANY, READY).click();
	}
}


