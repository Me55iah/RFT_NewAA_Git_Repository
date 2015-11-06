package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_ConfigurationHelper;
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
public class Vehicle_Configuration extends Vehicle_ConfigurationHelper
{
	/**
	 * Script Name   : <b>Vehicle_Configuration</b>
	 * Generated     : <b>26 Jun 2015 10:23:22</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------		
		// Vehicle Configuration - Seat Count and Drive (LH/RH)
		//--------------------------------------------------------------------		
		String sNumberSeats = Common_Variables.numberSeats;
		Boolean bRHDrive = Common_Variables.vehicleRightHandDrive;
		//--------------------------------------------------------------------			
		// Right Hand Drive
		if (bRHDrive == true){
			label_yes().waitForExistence(2,  0.25);			
			label_yes(ANY, READY).click();
		}		
		else{
			label_no().waitForExistence(2,  0.25);			
			label_no(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// Number of Seats
		list_aaMotorVehicleNoOfSeats().waitForExistence(2,  0.25);			
		list_aaMotorVehicleNoOfSeats(ANY, READY).click();
		sleep(0.5);
		list_aaMotorVehicleNoOfSeats(ANY, READY).click(atText(sNumberSeats));
		//--------------------------------------------------------------------		
		BrowserSync();
		//--------------------------------------------------------------------		
		
	}
}

