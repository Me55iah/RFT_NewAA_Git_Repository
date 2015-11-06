package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Fuel_TypeHelper;
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
public class Fuel_Type extends Fuel_TypeHelper
{
	/**
	 * Script Name   : <b>Fuel_Type</b>
	 * Generated     : <b>26 Jun 2015 09:10:10</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------
		// Test Data
		//String sFuelType = "Petrol";
		// Test Data
		//--------------------------------------------------------------------
		// String sFuelType = "Petrol";
		//--------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		// Fuel Type
		String sFuelType;
		try {
			sFuelType = Common_Variables.fuelType;
			//--------------------------------------------------------------------
			switch (sFuelType){
			//--------------------------------------------------------------------
				case "Petrol":
					label_petrol(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "Diesel":
					label_diesel(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "Electric":
					label_electric(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "Hybrid":
					label_hybridOther(ANY, READY).click();
					break;								
					//--------------------------------------------------------------------
			}
		} catch (Exception e) {
			// Nothing To Do
			// e.printStackTrace();
		}
		//--------------------------------------------------------------------
		sleep(0.5);
		//--------------------------------------------------------------------
	}
}

