
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Road_BreakDown_Cover_Regression_Test_MK2Helper;
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
public class Full_Road_BreakDown_Cover_Regression_Test_MK2 extends Full_Road_BreakDown_Cover_Regression_Test_MK2Helper
{
	/**
	 * Script Name   : <b>Full_Motor_Regression_Test_MK2</b>
	 * Generated     : <b>5 Jun 2015 12:12:43</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */

	public static int startRow;
	public static int endRow;
	public static int currentRow;
	public static String[] environmentURL = new String[1];

		public void testMain(Object[] args) {

			//--------------------------------------------------------------------
			
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
			Common_Variables.functionalArea = "breakdown-cover/uk-breakdown";
			
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

			System.out.println("Started ROAD - UK Breakdown Cover (NEW) Tests.....");

//			IDatapool dp = (IDatapool) getDatapool();
//			this.dpInitialization(dp, Common_Variables.startRow);
			
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
				System.out.println("UK Breakdown Cover Tests - " + currentRow);
				//---------------------------------------------------------------------------------------------

				// Do variables assignments
				Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
				Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");

				Common_Variables.proposerTitle = dpString("Proposer_Title");
				Common_Variables.proposerForename = dpString("Proposer_Forename");
				Common_Variables.proposerLastname = dpString("Proposer_Lastname");
				Common_Variables.proposerDOB = dpString("Proposer_DOB");
				Common_Variables.proposer_PhoneNumber = dpString("Proposer_PhoneNumber");
				Common_Variables.proposer_MobileNumber = dpString("Proposer_MobileNumber");
				Common_Variables.proposer_Email  = dpString("Proposer_Email");
				// Do all the variable assignments here, from the datapool
				Common_Variables.paymentType = dpString("Payment_Type");
				Common_Variables.paymentPeriod = dpString("Payment_Period");
				// Payment Card details
				Common_Variables.Payment_CardType = dpString("Payment_CardType");
				Common_Variables.Payment_CardName = dpString("Customer_Name");
				Common_Variables.Payment_CardNumber = dpString("Payment_CardNumber");
				Common_Variables.Payment_StartDate = dpString("Payment_StartDate");
				Common_Variables.Payment_ExpiryDate = dpString("Payment_ExpiryDate");
				Common_Variables.Payment_SecCode = dpString("Payment_SecCode");
				Common_Variables.DD_SortCode = dpString("Bank_Sort_Code");
				Common_Variables.DD_AccountNumber = dpString("Bank_Account_Number");

				// Product Info
				Common_Variables.personsCovered = dpString("Persons_Covered");
				Common_Variables.quoteReference = dpString("Quote_Reference");
				//Common_Variables.quoteOnly = dpBoolean("quoteOnly");
				Common_Variables.membershipYN = dpString("Membership");
				Common_Variables.membershipNum = dpString("Membership_Num");
				Common_Variables.coverType = dpString("Cover_Type");
				
				Common_Variables.upgrades_AtHome = dpBoolean("Upgrade_At_Home");
				Common_Variables.upgrades_Recovery = dpBoolean("Upgrade_Recovery");
				Common_Variables.upgrades_PartsGarage = dpBoolean("Upgrade_PartsGarage");
				Common_Variables.upgrades_OnwardTravel = dpBoolean("Upgrade_OnwardTravel");
				Common_Variables.free_HE = dpBoolean("6Months_HE_Free");
				Common_Variables.CouncilBadge = dpBoolean("Council_Badge");
				Common_Variables.EBCRequired = dpBoolean("EBC_Addition");
				
				Common_Variables.motorRenewalMonth  = dpString("Motor_Renewal_Month");
				//Common_Variables.zone = dpString("Zone");
				//Common_Variables.EBC_Product = dpString("EBC_Product");
				//Common_Variables.EBC_Destination = dpString("EBC_Destination");
				//Common_Variables.EBC_Cover_Level = dpString("Cover_Level");
				
				Common_Variables.totalQuotePrice = dpString("Total_Quote_Price");
				Common_Variables.priceToPay = dpString("Price_To_Pay");
				
				Common_Variables.propertyType  = dpString("Property_Type");
				Common_Variables.numBedrooms  = dpString("Number_Bedrooms");
			
				//Common_Variables.personsTravelling = dpString("EBC_Persons_Travelling");
				//Common_Variables.EBC_tripDuration = Integer.parseInt(dpString("EBC_Trip_Duration_Days"));
				//Common_Variables.EBC_tripFutureStartDay = Integer.parseInt(dpString("EBC_tripFutureStartDay"));
				//Common_Variables.partsAndLabour = dpBoolean("Parts_and_Labour_YN");
				//Common_Variables.towingYN = dpBoolean("Towing_YN");
				Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");

				setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
													+ Common_Variables.proposerForename + " "
																+ Common_Variables.proposerLastname);
				Common_Variables.full_Name = dpString("Customer_Name");

				//storeDatapool();
				// CC Expiry
				Common_Variables.endMonth = "11";
				Common_Variables.endYear = "17";  // 20 added within CC - 2017
				// Track Current Row For Reporting
				Common_Variables.currentRow = currentRow;
				// CC Expiry
				
				String sBreakDownCover = Common_Variables.personsCovered;
				//---------------------------------------------------------------------------------------------
				// Set the Bank Account Name to the new customer name we generated.
				
				// Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
				// Common_Variables.Payment_CardName = dpString("Customer_Name");
				//---------------------------------------------------------------------------------------------

				System.gc();
				//------------------------------------------------
				// Top Page Selection      			- Stage 1
				//callScript("BreakDown_Cover_MK2.Main_Top_Page");  // 20/10/15 ADDED - Imported From Basics for MOD
				//------------------------------------------------
				unregisterAll();
				System.gc();
				// Create over      			- Stage 1
				callScript("BreakDown_Cover_MK2.BreakDown_Cover");
				//------------------------------------------------
				unregisterAll();
				System.gc();
				// Vehicle Details           	- Stage 2
				//callScript("BreakDown_Cover_MK2.Vehicle_Details");
				//------------------------------------------------
				unregisterAll();
				System.gc();
				// Personal Details           	- Stage 3
				callScript("BreakDown_Cover_MK2.Personal_Details");
				//------------------------------------------------
				unregisterAll();
				System.gc();
				// Special_Offers      			- Stage 4
				callScript("BreakDown_Cover_MK2.Special_Offers");
				//------------------------------------------------
				unregisterAll();
				System.gc();
				// Cover Process Variations
//				if (sBreakDownCover.equalsIgnoreCase("Two People")){
//					//callScript("BreakDown_Cover_MK2.Variations.TwoPerson_TermsConditions");
//				}
				//------------------------------------------------
				unregisterAll();
				if (Common_Variables.liveTest == false) {
					//------------------------------------------------
					System.gc();
					// Buy Cover        		- Stage 5
					callScript("BreakDown_Cover_MK2.Buy_Cover");
					//------------------------------------------------
					unregisterAll();
					System.gc();
					// Confirmation of quote 	- Stage 6
					callScript("BreakDown_Cover_MK2.Confirmation");
					//------------------------------------------------
					unregisterAll();
					System.gc();
				}
				// stop();

				//------------------------------------------------

//				if (Common_Variables.EBC_Product.equals("Annual cover")) {
//					callScript("EBC.Select_Zone");
//
//				}

//				callScript("EBC.Your_Quote");
//				callScript("EBC.Your_Details");

				// Decide whether to convert or not, if it's a LIVE test, then
				// don't convert.

//				if (Common_Variables.liveTest == false) {
	//
//					if (Common_Variables.paymentType
//							.equals("Continuous Credit Card")) {
//						callScript("EBC.Your_Card_Payment");
//					}
//					if (Common_Variables.paymentType.equals("Annual Direct Debit")) {
//						// callScript("EBC.Your_Direct_Debit");
//					}
//					if (Common_Variables.paymentType
//							.equals("Single Credit/Debit card")) {
//						callScript("EBC.Your_Card_Payment");
//					}
//				}

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
				iE(BreakdownCover(), DEFAULT_FLAGS).close();			
		
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
