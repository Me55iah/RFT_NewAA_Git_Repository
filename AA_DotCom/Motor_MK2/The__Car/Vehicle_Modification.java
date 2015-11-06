package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_ModificationHelper;
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
public class Vehicle_Modification extends Vehicle_ModificationHelper
{
	/**
	 * Script Name   : <b>Vehicle_Modification</b>
	 * Generated     : <b>25 Jun 2015 16:06:19</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/25
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------
		// Vehicle Modifications
		//--------------------------------------------------------------------				
		String sVehicleMod = Common_Variables.vehicleMods;
		//--------------------------------------------------------------------				
		// Detect Modification 
		if (sVehicleMod!="None"){
			label_yes().waitForExistence(20,  0.25);			
			label_yes(ANY, READY).click();		
			//--------------------------------------------------------------------		
			//sVehicle Modification Type
			switch (sVehicleMod){
			//--------------------------------------------------------------------		
				case "Alloy Wheels":
					label_alloyWheels().waitForExistence(20,  0.25);
					label_alloyWheels(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "Front Spoiler":
					label_frontSpoilerAirDam().waitForExistence(20,  0.25);
					label_frontSpoilerAirDam(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "Locking Wheel Nuts":
					label_lockingWheelNuts().waitForExistence(20,  0.25);
					label_lockingWheelNuts(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "Rear Roof Spoiler":
					label_rearRoofSpoiler().waitForExistence(20,  0.25);
					label_rearRoofSpoiler(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "Bull Bars":
					label_bullBars().waitForExistence(20,  0.25);
					label_bullBars(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "Dual Controls":
					label_dualControl().waitForExistence(20,  0.25);
					label_dualControl(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "Hand Controls":
					label_handControls().waitForExistence(20,  0.25);
					label_handControls(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------
				case "All":
					label_alloyWheels().waitForExistence(20,  0.25);
					label_alloyWheels(ANY, READY).click();
					label_frontSpoilerAirDam(ANY, READY).click();
					label_lockingWheelNuts(ANY, READY).click();
					label_rearRoofSpoiler(ANY, READY).click();
					label_bullBars(ANY, READY).click();
					label_dualControl(ANY, READY).click();
					label_handControls(ANY, READY).click();
					break;				
					//--------------------------------------------------------------------		
				default:
					//--------------------------------------------------------------------		
					// No Customisation Has Occurred
					label_no().waitForExistence(2,  0.25);			
					label_no(ANY, READY).click();
					break;				
				}	//--------------------------------------------------------------------									 
			}
		else {
			//--------------------------------------------------------------------		
			// No Customisation Has Occurred
			label_no().waitForExistence(2,  0.25);			
			label_no(ANY, READY).click();
			//--------------------------------------------------------------------		
		}
	}
}

