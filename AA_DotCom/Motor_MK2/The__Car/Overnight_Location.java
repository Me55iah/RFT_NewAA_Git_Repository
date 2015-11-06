package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Overnight_LocationHelper;
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
public class Overnight_Location extends Overnight_LocationHelper
{
	/**
	 * Script Name   : <b>Overnight_Location</b>
	 * Generated     : <b>26 Jun 2015 12:48:19</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------		
		// Vehicle Overnight Storage Location
		//--------------------------------------------------------------------		
		String sVehicleStorage = Common_Variables.VehicleKeptLocation;
		String sGaragePostCode = Common_Variables.vehicleKeptPostcode;
		boolean bKeptHomeAddress = Common_Variables.vehicleKeptHomeAddress;
		//--------------------------------------------------------------------
		// Vehicle Overnight Storage Location
		list_aboutYourCar().waitForExistence(2,  0.25);
		list_aboutYourCar(ANY, READY).click();
		sleep(0.5);
		list_aboutYourCar(ANY, READY).click(atText(sVehicleStorage));
		//--------------------------------------------------------------------
		// Vehicle Overnight Address Location
		if (bKeptHomeAddress == true){
			label_yes().waitForExistence(20,  0.25);
			label_yes(ANY, READY).click();
		}		
		else {
			label_no().waitForExistence(20,  0.25);
			label_no(ANY, READY).click();
			//----------------------------------------------------------------
			// Set KEPT Location PostCode
			//----------------------------------------------------------------
			text_aaVehicleGaragedpostcode().waitForExistence(20,  0.25);
			text_aaVehicleGaragedpostcode().click(atPoint(34,38));
			iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sGaragePostCode);			
		}
		//--------------------------------------------------------------------
	}
}

