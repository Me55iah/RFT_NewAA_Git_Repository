package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_ValueHelper;
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
public class Vehicle_Value extends Vehicle_ValueHelper
{
	/**
	 * Script Name   : <b>Vehicle_Value</b>
	 * Generated     : <b>26 Jun 2015 10:11:11</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------		
		// Enter Vehicle Value
		//--------------------------------------------------------------------		
		String sVehicleValue = Common_Variables.vehicleValue;
		//--------------------------------------------------------------------			
		// How Much Is It Worth
		html_aaVehicleValue().waitForExistence(20,  0.25);			
		// html_aaVehicleValue(ANY, READY).click(atPoint(102,46));
		html_aaVehicleValue().click(atPoint(64,35));
		//iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars("20000");	
		iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys(sVehicleValue);
		//--------------------------------------------------------------------
	}
}

