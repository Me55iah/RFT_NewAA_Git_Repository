

import resources.Common_Variables;
import resources.Full_Home_Membership_Regression_MK2Helper;
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
import java.text.SimpleDateFormat;  // excess
import java.util.Calendar;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Full_Home_Membership_Regression_MK2 extends Full_Home_Membership_Regression_MK2Helper
{
	/**
	 * Script Name   : <b>Full_Home_Membership_Regression_MK2</b>
	 * Generated     : <b>5 Feb 2015 13:29:29</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/05
	 * @author horned
	 */
	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   NEW HM - Dave Horne - January 2015
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
		
		Common_Variables.endRow=iRecordCount; // Common_Variables.endRow=23;
		endRow = Common_Variables.endRow; // Specific to this test function

		//--------------------------------------------------------------------
		// START OF SCRIPT TIMING
		CurrTime(); String sTimeStampS = CurrTime();
		System.out.println("Start time = " + sTimeStampS);
		//--------------------------------------------------------------------

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();
		
		// Sets The Function Area For Testing
		Common_Variables.functionalArea = "home-membership";
		
		// Selection Of Environment and dP Starting Row
		callScript("Utilities.Environment_Selector");

		// Starting Row Parsed From Orevious Line
		// currentRow = Common_Variables.startRow;
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

		System.out.println("Started Home Membership (NEW) Tests.....");

		while (!dpDone()) {

			//---------------------------------------------------------------------------------------------
			// Launch chosen test environment			
			System.out.println(" Confirm Enviromment Selected Was "+Common_Variables.selectedEnvironment);
			logTestResult(" Confirmed, Test Enviromment Selected Was "+Common_Variables.selectedEnvironment, true);
			StartBrowser(Common_Variables.selectedEnvironment);
			//---------------------------------------------------------------------------------------------			
			BrowserSync();
			//---------------------------------------------------------------------------------------------
			System.out.println("Executing HM Test - " + currentRow);
			//---------------------------------------------------------------------------------------------

			// Do variables assignments
			Common_Variables.proposerForename = ("TiaTest");
			Common_Variables.proposerTitle = dpString ("Title");
			Common_Variables.Payment_CardName = ("HRH Prince of Whales"); // :-)
			Common_Variables.proposerDOB = dpString ("DOB");
			//Common_Variables.proposerOccupation = dpString("Occupation");
			//Common_Variables.employerBusiness = dpString("Employer_Business");
			Common_Variables.membership = dpBoolean("Membership");
			Common_Variables.proposer_HouseNumber = dpString("House_Number");
			Common_Variables.proposer_PostCode = dpString("PostCode");
			Common_Variables.propertyType = dpString("Property_Type");
			
			Common_Variables.receive_Policy_Documents = dpString("Receive_Policy_Documents");
			Common_Variables.policy_Excess = dpString("Policy_Excess");
			
			Common_Variables.currentRow = currentRow;
			Common_Variables.firstHome = dpBoolean("First_Home");
			Common_Variables.coverType = dpString("coverType");
			Common_Variables.buildingsAD = dpBoolean("Buildings_AD");
			Common_Variables.contentsAD = dpBoolean("Contents_AD");
			Common_Variables.contentsSI = dpString("Contents_Sum_Insured");
			Common_Variables.contentsVolXS = dpString("Contents_Vol_XS");
			Common_Variables.previousClaims = dpBoolean("Previous_Claims");
			Common_Variables.section3 = dpBoolean("Section_3");
			Common_Variables.section3Amount = dpString("Section_3_Amount");
			Common_Variables.section3a = dpBoolean("Section_3A");
			Common_Variables.section3aAmount = dpString("specItemValue");
			Common_Variables.specItemValue = dpString("specItemValue");
			Common_Variables.paymentType = dpString("Payment_Type");
			Common_Variables.retrieveQuote = dpBoolean("Quote_Retrieve");
			
			Common_Variables.homeInsType = dpString("Home_Ins_Type");
			Common_Variables.centralHeatingInsType = dpString("Heating_Ins_Type");
			
			Common_Variables.insCoverStartDay = dpInt ("Future_Date_Num_Days");
			
			Common_Variables.HEC = dpBoolean("HEC");
			Common_Variables.HLE = dpBoolean("HLE");
			Common_Variables.HAP = dpBoolean("HAP");
			Common_Variables.buildingsMarketValue = dpString("Buildings_Market_Value");
			Common_Variables.yearBuilt = dpString("Year_Built");
			Common_Variables.numBedrooms = dpString("Num_Bedrooms");
			Common_Variables.buildingsVolXS = dpString("Buildings_Vol_XS");
			Common_Variables.Payment_CardType = dpString("Payment_CardType");
			Common_Variables.Payment_CardNumber = dpString("Payment_CardNumber");
			Common_Variables.Payment_StartDate = dpString("Payment_StartDate");
			Common_Variables.Payment_ExpiryDate = dpString("Payment_ExpiryDate");
			Common_Variables.Payment_Bank_Account_Number = dpString("Bank_Account_Number");
			Common_Variables.Payment_Bank_Sortcode = dpString("Bank_Sort_Code");

			Common_Variables.startMonth = Common_Variables.Payment_StartDate
					.substring(0, 2);
			Common_Variables.startYear = Common_Variables.Payment_StartDate
					.substring(2, 4);
			Common_Variables.endMonth = Common_Variables.Payment_ExpiryDate
					.substring(0, 2);
			Common_Variables.endYear = Common_Variables.Payment_ExpiryDate
					.substring(2, 4);

			Common_Variables.Payment_SecCode = dpString("Payment_SecCode");

			//---------------------------------------------------------------------------------------------
			// Script Executions
						
			 // QUOTE
			System.gc();
			callScript("Home_MK2.Quick_Quote");
			
			// OPTIONS
			unregisterAll();
			System.gc();
			callScript("Home_MK2.Cover_Options");
			
			// COMPLETE
			unregisterAll();
			System.gc();
			callScript("Home_MK2.Complete_Order");
			
			// CONFIRMATION
			unregisterAll();
			System.gc();
			callScript("Home_MK2.Pre_Payment_Confirmation");
			
			//----------------------------------------------------------------
			//  * * * *  R E U S E    O F    E B C    C O D E  * * * *
			// Payment Options       - Stage 5
			// Before Live Payments NOT Processed.
			// Now CAN DO with selected addresses
			if (Common_Variables.liveTest == false) {  // REUSE FROM EBC CHANGE BACK false
				
				// PAYMENT OPTIONS
				unregisterAll();
				System.gc();
				callScript("Home_MK2.Payment_Options");
			
				// SECURITY CHECK
				unregisterAll();
				System.gc();
				callScript("Utilities.Card_Security_Check");

				// CONFIRMATION
				// Confirmation of quote - Stage 7
				unregisterAll();
				System.gc();
			 	callScript("Home_MK2.Confirmation");
			}
//			if (Common_Variables.selectedEnvironment.equals("prelive4")) {
//				// Save the policy number to the datapool
//				setDatapool("TIA_Policy_Number",
//						resources.Common_Variables.TIA_Policy_Number);
//
//				storeDatapool();
//			}
			//----------------------------------------------------------------
			sleep(3);
			// Close Browser Prior to Next Increment/Journey
			iE(document_homeMembership(), DEFAULT_FLAGS).close();			
	
			sleep(2);
			//----------------------------------------------------------------

			dpNext();
			currentRow++;
		}

		// storeDatapool();
		//--------------------------------------------------------------------
		// END OF SCRIPT TIMING
		CurrTime(); String timeStampE = CurrTime();
		System.out.println("End time = " + timeStampE);
		//--------------------------------------------------------------------

	}
}
