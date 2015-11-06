package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Policy_OffersHelper;
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
public class Policy_Offers extends Policy_OffersHelper
{
	/**
	 * Script Name   : <b>Policy_Offers</b>
	 * Generated     : <b>3 Jul 2015 13:38:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
//		// Test Data
//		Boolean bRegNumberKnown = false;
//		String sRegNumber = "NKD305M";
//		String sRegYear = "1970";
//		String sVehicleMake = "FORD";
//		String sVehicleModel = "CORTINA";
//		// Test Data
		//-----------------------------------------------------------------------------------------
		// Do You Know The Car Registration Number
		Boolean bFreeBreakdownCover = Common_Variables.upgrades_MLA; 	// Legal Assistance
		Boolean bAddRelay = Common_Variables.upgrades_MAP; 	// Personal Accident
		Boolean bAddRelayHomeStart = Common_Variables.upgrades_HireCar; 	// Courtesy Car
		Boolean bBlueBadgeHolder = Common_Variables.upgrades_MOXIN; 	// Excess		
		//-----------------------------------------------------------------------------------------
		// Free Breakdown Cover Added Addition
		if (bFreeBreakdownCover == true){
			label_freeBreakdownCoverAdded().waitForExistence(5, 0.25);
			label_freeBreakdownCoverAdded(ANY, READY).click();				
			//-----------------------------------------------------------------------------------------
			// Add Relay Addition
			if (bAddRelay == true){
				label_addRelay().waitForExistence(5, 0.25);			
				label_addRelay(ANY, READY).click();
			}
			//-----------------------------------------------------------------------------------------
			// Add Relay Home Start Addition
			if (bAddRelayHomeStart == true){			
				label_addRelayHomeStart().waitForExistence(5, 0.25);
				label_addRelayHomeStart(ANY, READY).click();
			}
			//-----------------------------------------------------------------------------------------
			//	Excess Protection Addition
			if (bBlueBadgeHolder == true){
				label_iAmABlueBadgeHolder().waitForExistence(5, 0.25);
				label_iAmABlueBadgeHolder(ANY, READY).click();
			}
		//-----------------------------------------------------------------------------------------		 
		}
	}
}

