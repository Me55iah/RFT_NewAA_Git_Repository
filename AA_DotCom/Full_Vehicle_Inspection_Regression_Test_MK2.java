
import resources.Common_Variables;
import resources.Full_Vehicle_Inspection_Regression_Test_MK2Helper;
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
public class Full_Vehicle_Inspection_Regression_Test_MK2 extends Full_Vehicle_Inspection_Regression_Test_MK2Helper
{
	/**
	 * Script Name   : <b>Full_Vehicle_Inspection_Regression_Test_MK2</b>
	 * Generated     : <b>26 Aug 2015 14:27:32</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/08/26
	 * @author horned
	 */

	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   Full Vehicle Inspection - Dave Horne - September 2015
	//
	////////////////////////////////////////////////////////////////////////////////////////
	
	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;
	//public static String[] environmentURL = new String[1];
	

	public void testMain(Object[] args) {

		int currentRow = 0;
		dpReset();
		// Get Datapool RowCount - Automatically Resolved Now :-)
		int iRecordCount = dpCurrent().getEquivalenceClass().getRecordCount();
		
		Common_Variables.endRow=iRecordCount; // 
		endRow = Common_Variables.endRow; // Specific to this test function

		//--------------------------------------------------------------------
		// START OF SCRIPT TIMING
		CurrTime(); String sTimeStampS = CurrTime();
		System.out.println("Start time = " + sTimeStampS);
		//--------------------------------------------------------------------

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();
		
		// Sets The Function Area For Testing
		Common_Variables.functionalArea = "vehicle-inspection"; /// 
		
		// Selection Of Environment and dP Starting Row
		callScript("Utilities.Environment_Selector");

		//-----------------------------------------------------------------------------------------------
		// Move to the selected row to Start on
		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;
		}
		//-----------------------------------------------------------------------------------------------		
		// Work through the list of data, creating the appropriate new quotes or
		// a policy, according to the value entered in the product column of the
		// datapool.

		System.out.println("Started Full Vehicle Inspection (NEW) Tests.....");

		while (!dpDone()) {

			//---------------------------------------------------------------------------------------------
			// Launch chosen test environment			
			System.out.println(" Confirm Enviromment Selected Was "+Common_Variables.selectedEnvironment);
			logTestResult(" Confirmed, Test Enviromment Selected Was "+Common_Variables.selectedEnvironment, true);
			StartBrowser(Common_Variables.selectedEnvironment);
			//---------------------------------------------------------------------------------------------			
			// BrowserSync();
			//---------------------------------------------------------------------------------------------
			System.out.println("Executing Full Vehicle Inspection Test - " + currentRow);
			//---------------------------------------------------------------------------------------------

			//---------------------------------------------------------------------------------------------
			//---------------------------------------------------------------------------------------------

			//setDatapool("Proposer_Lastname", Common_Variables.proposerLastname);
			//storeDatapool();
			
			// DP Connection - Ordered As Per Data Pool
	 		Common_Variables.function = dpString("Function");
	 		Common_Variables.expectedOutcome = dpString("Expected_Outcome");
	 		Common_Variables.vehicleStatus = dpString("Vehicle_Status");
	 		Common_Variables.vehicleType = dpString("Vehicle_Type");
	 		Common_Variables.vehicleReg = dpString("Vehicle_Registration");
	 		Common_Variables.vehicleManufacturer = dpString("Vehicle_Make");
	 		Common_Variables.vehicleModel  = dpString("Vehicle_Model");
	 		Common_Variables.abicode = dpString("Vehicle_Abicode");
	 		Common_Variables.vehicleRegYear = dpString("Vehicle_Registration_Year");
	 		Common_Variables.vehicleNumberofDoors = dpString("Vehicle_Door_Count");
	 		Common_Variables.vehicleDoorPlan = dpString("Vehicle_Door_Plan");
	 		Common_Variables.vehicleGears = dpString("Vehicle_Gears"); // Transmission Type
	 		Common_Variables.vehicleEngineSize = dpString("Vehicle_Engine_Size");
	 		Common_Variables.quoteType = dpString("Quote_Type");
	 		Common_Variables.membershipYN = dpString("AA_Membership");
	 		Common_Variables.vendorName = dpString("Vendor_Name");
	 		Common_Variables.vendorPostcode = dpString("Vendor_Postcode");  
	 		Common_Variables.vendorPhone = dpString("Vendor_Phone"); 
	 		Common_Variables.title = dpString("Title");
	 		Common_Variables.foreName = dpString("Forename");
	 		Common_Variables.surName = dpString("Surname");
	 		Common_Variables.houseNumber = dpString("House_Number");
	 		Common_Variables.postCode = dpString("Interested_Party_Postcode");
	 		Common_Variables.phoneNumber = dpString("Phone_Number");
	 		Common_Variables.eMail = dpString("Email");
 			Common_Variables.Payment_CardType = dpString("Card_Type");
 			Common_Variables.Payment_CardNumber = dpString("Card_Number");
 			Common_Variables.Payment_CardName = dpString("Card_Name");
 			Common_Variables.endMonth = dpString("Card_Expiry_MM");
 			Common_Variables.endYear = dpString("Card_Expiry_YYYY"); // CC Call Prefixes 20 - Actual YY
 			Common_Variables.Payment_SecCode = dpString("Card_Security_Code");
 			// DP Connection
			//---------------------------------------------------------------------------------------------
			//
			System.gc();
			// Vehicle Basic Info
			callScript("Vehicle_Inspection.Vehicle__Inspection");
			
			// Detect Vehicles That Fall Outside Acceptable Criteria
			if (!Common_Variables.expectedOutcome.contains("OK")){
				System.gc();
				// Vehicle Outside Of Inspection Bounds
				callScript("Vehicle_Inspection.Sorry_Screen");
			}
			else {	
				System.gc();
				// Vehicle Detailed Info
				callScript("Vehicle_Inspection.Vehicle_Details_Location");
				//-----------------------------------------------------------------------------
				
				System.gc();
				// Vehicle Quote Info
				callScript("Vehicle_Inspection.Your_Quote");
	
				//-----------------------------------------------------------------------------				
				System.gc();
				// Vehicle Vendor and Requester Details
				callScript("Vehicle_Inspection.Seller_Details");
	
				//-----------------------------------------------------------------------------	
				System.gc();
				// Vehicle Detailed Summary Info			
				callScript("Vehicle_Inspection.Summary");
							
				//-----------------------------------------------------------------------------			
				if (Common_Variables.liveTest == false) { // * * *  C H A N G E   B A C K   false for NO live Payments
					// Payment            - Stage 3
					System.gc();
					callScript("Utilities.Pay_CC"); // CC or Debit
	
					// Confirmation      - Stage 4
					System.gc();
					callScript("Vehicle_Inspection.Confirmation");
	
				}				
			}
			//----------------------------------------------------------------
			sleep(3.0);
			//----------------------------------------------------------------

			dpNext();
			currentRow++;
		}

		//storeDatapool();
		//--------------------------------------------------------------------
		// END OF SCRIPT TIMING
		CurrTime(); String timeStampE = CurrTime();
		System.out.println("End time = " + timeStampE);
		//--------------------------------------------------------------------

	}
}

