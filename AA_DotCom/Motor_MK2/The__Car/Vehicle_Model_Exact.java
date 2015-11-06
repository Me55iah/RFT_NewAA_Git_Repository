package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Vehicle_Model_ExactHelper;
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
public class Vehicle_Model_Exact extends Vehicle_Model_ExactHelper
{
	/**
	 * Script Name   : <b>Vehicle_Model_Exact</b>
	 * Generated     : <b>30 Jun 2015 10:56:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//--------------------------------------------------------------------	
//		// Test Data
//		String sYearOfManufacture = "1970";
// 		String sVehicleExactModel = "1966, cortina de luxe, 1298cc, 2 door coupe, petrol, manual";
//		String sVehicleManufacturer = "FORD";
//		// Test Data
//		//--------------------------------------------------------------------	
		// Choose Exact Make and Model
//		//--------------------------------------------------------------------	
//		String sYearOfManufacture = Common_Variables.vehicleRegYear;
		String sVehicleExactModel = Common_Variables.vehicleExactModel;
//		String sVehicleManufacturer = Common_Variables.vehicleManufacturer;
//		//--------------------------------------------------------------------	
		//BrowserSync();
		sleep(5);
//		//--------------------------------------------------------------------	
		// DEFAULT SELECTION FROM 08/07/15
		try {
			// Button Presented To Find Exact Model When Multiple Options are Possible
			String sChooseTheExactModel_Text = (String)list_vehicleList2().getProperty(".text"); // list_vehicleList
			//-------------------------------------------------------------------------
			// Detect Registration Match Unsuccessful Message		// We couldn't match the registration number
			if (sChooseTheExactModel_Text.contains("Please select exact model")){
				//--------------------------------------------------------------------			
				// Set Values Manually
				// sleep(1);
				// label_noFindTheCarByMakeAndMod(ANY, READY).click();
				//link_clickHereToChooseTheExact(ANY, READY).click();			
				//--------------------------------------------------------------------			
				BrowserSync();
				//--------------------------------------------------------------------	
				// Detailed Sublist
				list_vehicleList2(ANY, READY).click();  // list_vehicleList
				sleep(0.75);
				// list_aaMotorVehicleModel(ANY, READY).click();
				// comboListBox_htmlComboLBox(ANY, READY).se(atText(sVehicleExactModel));
				list_vehicleList2().click(atText(sVehicleExactModel));
				//--------------------------------------------------------------------			
				// BrowserSync();
				//--------------------------------------------------------------------	
//				// Commit Model
//				while (!link_makeModelSelect().isEnabled()){
//					sleep(2);
//				}
//				//--------------------------------------------------------------------	
//				link_makeModelSelect(ANY, READY).click();
				//--------------------------------------------------------------------					
			}
		} catch (Exception e) {
			// Nothing to do
			//e.printStackTrace();
		}
//		//--------------------------------------------------------------------	
//		// Commit Model - Second Attempt - Glitchy
//		try {
//			if (link_makeModelSelect().isShowing()){ //while
//				sleep(2);
//				link_makeModelSelect(ANY, READY).click();
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//		//--------------------------------------------------------------------	
//	stop();
	}
}

