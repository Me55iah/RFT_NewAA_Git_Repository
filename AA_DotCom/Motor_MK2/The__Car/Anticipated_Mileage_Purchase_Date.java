package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Anticipated_Mileage_Purchase_DateHelper;
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
public class Anticipated_Mileage_Purchase_Date extends Anticipated_Mileage_Purchase_DateHelper
{
	/**
	 * Script Name   : <b>Anticipated_Mileage_Purchase_Date</b>
	 * Generated     : <b>26 Jun 2015 10:45:15</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//-----------------------------------------------------------------------------------------
// 		// Test Data
// 		String sMileage = "10000";
// 		String sPurchaseMonth = "June";
// 		String sPurchaseYear = "2015";
// 		// Test Data
//		//-----------------------------------------------------------------------------------------
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------		
		// Vehicle Configuration - Anticipated Annual Mileage and Purchase Date
		//--------------------------------------------------------------------		
		String sMileage = Common_Variables.vehicleMileage;
		String sPurchaseMonth = Common_Variables.vehiclePurchaseMonth;
		String sPurchaseYear = Common_Variables.vehiclePurchaseYear;
		//--------------------------------------------------------------------		
		// Mileage Entry
		//--------------------------------------------------------------------------------
		html_aboutYourCar().waitForExistence(2,  0.25);
		html_aboutYourCar(ANY, READY).click(atPoint(209,31));
		iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(sMileage);
		//--------------------------------------------------------------------------------
		// Purchase Date - Month
		//--------------------------------------------------------------------------------
		list_aaVehiclePurchaseMonth().waitForExistence(2,  0.25);
		list_aaVehiclePurchaseMonth(ANY, READY).click();
		list_aaVehiclePurchaseMonth(ANY, READY).click(atText(sPurchaseMonth));	
		//--------------------------------------------------------------------------------
		// Purchase Date - Year
		//--------------------------------------------------------------------------------
		list_aaVehiclePurchaseYear().waitForExistence(2,  0.25);
		list_aaVehiclePurchaseYear(ANY, READY).click();
		list_aaVehiclePurchaseYear(ANY, READY).click(atText(sPurchaseYear));
		//--------------------------------------------------------------------------------
	}
}

