
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.eclipse.hyades.edit.datapool.IDatapool;
import org.eclipse.hyades.datapool.*;
import resources.Common;
import resources.Common_Variables;
import resources.Full_EBC_Regression_Test_MK2Helper;
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
public class Full_EBC_Regression_Test_MK2 extends Full_EBC_Regression_Test_MK2Helper
{
	/**
	 * Script Name   : <b>Full_EBC_Regression_Test_MK2</b>
	 * Generated     : <b>5 Dec 2014 09:34:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
	
	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   Uplift of EBC (European Breakdown Cover) - Dave Horne - December 2014 - Angular Journeys
	//
	////////////////////////////////////////////////////////////////////////////////////////
	
	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;
	
	// NO OPTION TO BUY BY DIRET DEBIT CURRENTLY FEB 2015
	
	public void testMain(Object[] args) {

		int currentRow = 0;
		dpReset();
		// Get Datapool RowCount - Automatically Resolved Now :-)
		int iRecordCount = dpCurrent().getEquivalenceClass().getRecordCount();
		
		Common_Variables.endRow=iRecordCount; //  //Common_Variables.endRow=25;
		endRow = Common_Variables.endRow; // Specific to this test function

		//--------------------------------------------------------------------
		// START OF SCRIPT TIMING
		CurrTime(); String sTimeStampS = CurrTime();
		System.out.println("Start time = " + sTimeStampS);
		//--------------------------------------------------------------------

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();
		
		// Sets The Function Area For Testing
		Common_Variables.functionalArea = "european-breakdown-cover";
		
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

		System.out.println("Started EBC (NEW) Tests.....");

//		IDatapool dp = (IDatapool) getDatapool();
//		this.dpInitialization(dp, Common_Variables.startRow);
		
		//while (currentRow <= endRow) {
		while (!dpDone()) {
			//---------------------------------------------------------------------------------------------
			// Launch chosen test environment			
			System.out.println(" Confirm Enviromment Selected Was "+Common_Variables.selectedEnvironment);
			logTestResult(" Confirmed, Test Enviromment Selected Was "+Common_Variables.selectedEnvironment, true);
			StartBrowser(Common_Variables.selectedEnvironment);
			//---------------------------------------------------------------------------------------------			
			BrowserSync();
			//---------------------------------------------------------------------------------------------
			System.out.println("European Breakdown Cover Tests - " + currentRow);
			//---------------------------------------------------------------------------------------------

			// Do variables assignments
			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");

			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
			Common_Variables.proposerLastname = dpString("Proposer_Lastname");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");

			// Do all the variable assignments here, from the datapool
			Common_Variables.paymentType = dpString("Payment_Type");
			// Payment Card details
			Common_Variables.Payment_CardType = dpString("Payment_CardType");
			Common_Variables.Payment_CardName = dpString("Customer_Name");
			Common_Variables.Payment_CardNumber = dpString("Payment_CardNumber");
			Common_Variables.Payment_StartDate = dpString("Payment_StartDate");
			Common_Variables.Payment_ExpiryDate = dpString("Payment_ExpiryDate");
			Common_Variables.Payment_SecCode = dpString("Payment_SecCode");
			Common_Variables.DD_SortCode = dpString("DD_SortCode");
			Common_Variables.DD_AccountNumber = dpString("DD_AccountNumber");

			// Product Info
			Common_Variables.quoteOnly = dpBoolean("quoteOnly");
			Common_Variables.membershipYN = dpString("Membership");
			Common_Variables.membershipNum = dpString("Membership_Num");
			Common_Variables.coverType = dpString("Cover_Type");
			Common_Variables.zone = dpString("Zone");
			Common_Variables.EBC_Product = dpString("EBC_Product");
			Common_Variables.EBC_Destination = dpString("EBC_Destination");
			Common_Variables.EBC_Cover_Level = dpString("Cover_Level");
			
			Common_Variables.totalQuotePrice = dpString("totalQuotePrice");
			Common_Variables.priceToPay = dpString("Price_to_Pay");
			
			Common_Variables.personsTravelling = dpString("EBC_Persons_Travelling");
			Common_Variables.EBC_tripDuration = Integer.parseInt(dpString("EBC_Trip_Duration_Days"));
			Common_Variables.EBC_tripFutureStartDay = Integer.parseInt(dpString("EBC_tripFutureStartDay"));
			Common_Variables.partsAndLabour = dpBoolean("Parts_and_Labour_YN");
			Common_Variables.towingYN = dpBoolean("Towing_YN");
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");

			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
												+ Common_Variables.proposerForename + " "
															+ Common_Variables.proposerLastname);

			//storeDatapool();

			//---------------------------------------------------------------------------------------------
			// Set the Bank Account Name to the new customer name we generated.
			
			// Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			// Common_Variables.Payment_CardName = dpString("Customer_Name");
			//---------------------------------------------------------------------------------------------

			// Create the quote      - Stage 1
			 
			System.gc();
			callScript("EBC_MK2.Your_Trip");

			// Select Zone           - Stage 2
			unregisterAll();
			System.gc();
			callScript("EBC_MK2.Select_Zone");

			// Your Quote            - Stage 3
			unregisterAll();
			System.gc();
			callScript("EBC_MK2.Your_Quote");

			// Personal Details      - Stage 4
			unregisterAll();
			System.gc();
			callScript("EBC_MK2.Personal_Details");

			// Summary               - Stage 5
			unregisterAll();
			System.gc();
			callScript("EBC_MK2.Summary");

			// Payment Options       - Stage 6
			// Before Live Payments NOT Processed.
			// Now CAN DO with selected addresses
			if (Common_Variables.liveTest == false) {
//				callScript("EBC_MK2.Payment_Options");}
			
				unregisterAll();
				System.gc();
				callScript("EBC_MK2.Payment_Options");
			
				// Confirmation of quote - Stage 7
				unregisterAll();
				System.gc();
				callScript("EBC_MK2.Confirmation");
			}
				//stop();
			
//			if (Common_Variables.EBC_Product.equals("Annual cover")) {
//				callScript("EBC.Select_Zone");
//
//			}

//			callScript("EBC.Your_Quote");
//			callScript("EBC.Your_Details");

			// Decide whether to convert or not, if it's a LIVE test, then
			// don't convert.

//			if (Common_Variables.liveTest == false) {
//
//				if (Common_Variables.paymentType
//						.equals("Continuous Credit Card")) {
//					callScript("EBC.Your_Card_Payment");
//				}
//				if (Common_Variables.paymentType.equals("Annual Direct Debit")) {
//					// callScript("EBC.Your_Direct_Debit");
//				}
//				if (Common_Variables.paymentType
//						.equals("Single Credit/Debit card")) {
//					callScript("EBC.Your_Card_Payment");
//				}
//			}

			//setDatapool("Price_to_Pay", Common_Variables.annualPremium);
			//storeDatapool();

			if (Common_Variables.selectedEnvironment.equals("prelive4")) {
				// Save the policy number to the datapool
				setDatapool("TIA_Policy_Number",
						resources.Common_Variables.TIA_Policy_Number);

				storeDatapool();
			}
			//----------------------------------------------------------------
			sleep(3.0);
			// Close Browser Prior to Next Increment/Journey
			iE(EBC(), DEFAULT_FLAGS).close();			
	
			sleep(2.0);
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
