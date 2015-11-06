package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Boost_Your_CoverHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.application.Activate;
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
public class Boost_Your_Cover extends Boost_Your_CoverHelper
{
	/**
	 * Script Name   : <b>Boost_Your_Cover</b>
	 * Generated     : <b>14 Aug 2015 14:34:56</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/08/14
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		boolean bUpgradeHireCar = false;
//		boolean bUpgradeProtectExcess = true;
//		boolean bMLAUpgrade = true;
//				
//		//---------------------------------------------------------------------------------------------
//		// Detect Addons Previously Set SO DON'T STE AGAIN
//		//---------------------------------------------------------------------------------------------
//		// Upgrades Excess/Hirecar etc.
//		boolean bUpgradeHireCar = Common_Variables.upgrades_HireCar; // HireCar
////		Common_Variables.upgrades_MAP = dpBoolean("Upgrade_MAP");
////		Common_Variables.upgrades_MOAHP_Single = dpBoolean("Upgrades_MOAHP_Single");
////		Common_Variables.upgrades_MOAHP_Joint = dpBoolean("Upgrade_MOAHP_Joint");
//		boolean bUpgradeProtectExcess = Common_Variables.upgrades_MOXIN; // Excess
//		boolean bMLAUpgrade = Common_Variables.upgrades_MLA;  // Motoring Legal Assistance
////		Common_Variables.volXS = dpString("Voluntary_Excess");		
////		//---------------------------------------------------------------------------------------------
////		// Upgrades Breakdown Cover  
////		Common_Variables.breakDownServiceUsage = dpString("Breakdown_Service_Usage");
////		Common_Variables.upgrades_Breakdown_Cover = dpBoolean("Upgrade_Breakdown_Cover");
////		Common_Variables.upgrades_Add_Relay = dpBoolean("Upgrade_Add_Relay");
////		Common_Variables.upgrades_Add_Relay_Home_Start = dpBoolean("Upgrade_Add_Relay_Home_Start");
////		Common_Variables.blue_Badge_Holder = dpBoolean("Blue_Badge_Holder");	
		
//		if (!bUpgradeHireCar||!bUpgradeProtectExcess||!bMLAUpgrade){
			//---------------------------------------------
			//button_nextsubmit().waitForExistence(5,  0.25);
			sleep(2.5);
	 		//---------------------------------------------
//			try {
//				activate();
			if  (html_main().exists()){
				String sHeader_Text = (String)html_main().getProperty(".text");
				//---------------------------------------------
				if (sHeader_Text.contains("Boost your cover ")){
				//---------------------------------------------	
					logTestResult(" Boost Your Cover Page Displayed OK ", true);
					//-----------------------------------------
					button_nextsubmit().waitForExistence(5,  0.25);
					button_nextsubmit(ANY, READY).click();
				}
//			} catch (ObjectNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
				//---------------------------------------------
		}
		

		// NEED TO ADD EXTRA FUNCTION
		
	}
}

