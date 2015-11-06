import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Motor_Regression_TestHelper;
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
 * Description : Functional Test Script
 * 
 * @author courtl
 */
@SuppressWarnings("unused")
public class Full_Motor_Regression_Test extends
		Full_Motor_Regression_TestHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl
	 */
	//////////////////////////////////////////////////////////////////////////////
	// DH - TEST PASSED ON 24th November 2014 - ALL
	//////////////////////////////////////////////////////////////////////////////
	
	public static int startRow;
	public static int endRow;
	public static int currentRow;
	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {
		
		Common_Variables.MSM = false;

		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("Start time = " + timeStamp);

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();       // IE11
		

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());

		// Set Row to end on in Datapool, don't change this unless you really
		// have to.
		endRow = 18; // 18

		if (Common_Variables.bulkTest == false) {

			// This code triggers a question at runtime that will ask what row
			// you want to start on/
			Common_Variables.startRow = Integer.parseInt(Common
					.startRow(endRow));

			// This code triggers a question at runtime to specify the
			// Environment you wish to use.

			Common_Variables.selectedEnvironment = Common.selectedUAT();
		}

		// Decide here if this is a LIVE or PRE LIVE test, if it's LIVE or PL1
		// then we
		// don't run payments.
		if (Common_Variables.selectedEnvironment.contains("prelive")) {
			Common_Variables.liveTest = false;
		}
		if (Common_Variables.selectedEnvironment.equals("live")) {
			Common_Variables.liveTest = true;
		}

		System.out.println("Start row = " + Common_Variables.startRow);
		System.out.println("End row = " + endRow);

		int currentRow = 0;

		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;
		}

		// Blank the TIA Policy Number field for each customers, ready to
		// store the new one we create.
		while (currentRow <= endRow) {
			setDatapool("TIA_Policy_Number", "");
			setDatapool("Customer_Number", "");
			setDatapool("Customer_Name", "");
			setDatapool("Quote_Reference", "");
			setDatapool("Result", "");
			setDatapool("Annual_Premium", "");
			setDatapool("Deposit", "");
			setDatapool("Instalment_Amount", "");
			setDatapool("Total_Annual_Price", "");
			setDatapool("Elapsed_Time", "");
			currentRow++;
			dpNext();
		}

		// Save changes to the datapool
		storeDatapool();

		// Variable for current Datapool Row - DON'T TOUCH THIS, EVER!
		dpReset();
		currentRow = 0;

		// Move to the selected row to Start on
		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;
		}

		// Set the Test Environment you wish to use
		if (Common_Variables.liveTest == true) {
			environmentURL[0] = "https://www.theaa.com/car-insurance/buy/car-details?ForceSplit=na:old";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "https://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/car-insurance/buy/car-details?ForceSplit=na:old";

		}

		System.out.println("Started Motor Tests.....");

		while (currentRow <= endRow) {

			java.util.Date startingTime = Calendar.getInstance().getTime();

			System.out.println("Executing Motor Test - " + currentRow);

			// Do variables assignments
			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");
			Common_Variables.membership = dpBoolean("Membership");

			// Do all the variable assignments here, from the datapool
			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
			Common_Variables.proposerLastname = dpString("Proposer_Lastname");
			Common_Variables.qrProposerLastname = dpString("Proposer_Lastname");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");
			Common_Variables.dateTestPassed = dpString("Date_Test_Passed");

			// Product Info
			Common_Variables.proposerOccupation = dpString("Occupation_Code");
			Common_Variables.proposerBusiness = dpString("Occupation_Industry");
			Common_Variables.retrieveQuote = dpBoolean("Quote_and_Retrieve");
			Common_Variables.membershipYN = dpString("Membership");
			Common_Variables.membershipNum = dpString("Membership_Num");
			Common_Variables.provCode = dpString("ProvCode");
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");
			Common_Variables.vehicleValue = dpString("Vehicle_Value");
			Common_Variables.coverType = dpString("Cover_Type");
			Common_Variables.writtenConfirmation = dpString("Written_Confirmation_YN");
			Common_Variables.No_Sale = dpString("No_Sale");
			Common_Variables.upgrades_HireCar = dpBoolean("Upgrade_Hire_Car");
			Common_Variables.upgrades_MAP = dpBoolean("Upgrade_MAP");
			Common_Variables.upgrades_MOAHP_Single = dpBoolean("Upgrades_MOAHP_Single");
			Common_Variables.upgrades_MOAHP_Joint = dpBoolean("Upgrade_MOAHP_Joint");
			Common_Variables.upgrades_MOXIN = dpBoolean("Upgrades_MOXIN");
			Common_Variables.personsCovered = dpString("Persons_Covered");
			Common_Variables.insuredClaims = dpBoolean("Insured_Claims");
			Common_Variables.insuredConvictions = dpBoolean("Insured_Convictions");
			Common_Variables.firstDriverClaims = dpBoolean("First_Driver_Claims");
			Common_Variables.firstDriverConvictions = dpBoolean("First_Driver_Convictions");
			Common_Variables.secondDriverClaims = dpBoolean("Second_Driver_Claims");
			Common_Variables.secondDriverConvictions = dpBoolean("Second_Driver_Convictions");
			Common_Variables.businessUse = dpBoolean("Business_Use");
			Common_Variables.roadQuote = dpBoolean("Road_Quote_YN");
			Common_Variables.NCB = dpString("NCB");
			Common_Variables.numberFutureDays = dpInt("Future_Date_Num_Days");
			Common_Variables.VehicleKeptLocation = dpString("Where_Car_Kept");
			Common_Variables.maritalStatus = dpString("Marital_Status");
			Common_Variables.insuredNumPrevClaims = 1;
			Common_Variables.homeTelNo = "";
			
			// MVD Updates
			Common_Variables.otherVehicleUsage = dpBoolean("Other_Vehicle_Usage"); 
			Common_Variables.otherVehicleOption = dpInt("Other_Vehicle_Options");
			// Extra Verification on Driver Details/Quote Page
			Common_Variables.intermediateQuoteReference = ("");
			
			// Payment information
			Common_Variables.paymentType = dpString("Payment_Type");
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

			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
					+ Common_Variables.proposerForename + " "
					+ Common_Variables.proposerLastname);

			storeDatapool();

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			startApp("IE", environmentURL);

			callScript("Motor.The_Car");

			if (Common_Variables.timeout == false) {

				callScript("Motor.Your_Details");

				callScript("Motor.Your_Quote_view"); // Extension to existing

				if (Common_Variables.referal == false) {

					if (Common_Variables.yourQuote == true) {

						callScript("Motor.Boost_Your_Cover");
						Common_Variables.boostCover = true;
					}

					if (Common_Variables.boostCover == true) {

						// System.out.println("Instalments = "
						// + Common_Variables.instalments);

						callScript("Motor.Confirm_Your_Details");

						setDatapool("Quote_Reference",
								Common_Variables.quoteReference);
						storeDatapool();

						// Decide whether to convert or not, if it's a LIVE
						// test,
						// then
						// don't convert.

						if (Common_Variables.liveTest == false) {

							if (!Common_Variables.selectedEnvironment
									.equals("prelive1")) {

								if (Common_Variables.instalments == false) {
									callScript("Motor.Your_Card_Payment");

								}
								if (Common_Variables.instalments == true) {

									if (Common_Variables.paymentType
											.equals("Single Payment")) {

										callScript("Motor.Your_Card_Payment");

									} else {

										callScript("Motor.Your_Direct_Debit");
										callScript("Motor.Your_Card_Payment");

									}

								}
							}
						}
					}

					// Save the Quote number to the datapool
					setDatapool("Quote_Reference",
							Common_Variables.quoteReference);

					// Save the policy number to the datapool
					setDatapool("TIA_Policy_Number",
							Common_Variables.TIA_Policy_Number);

					setDatapool("Annual_Premium",
							Common_Variables.annualPremium);

					if (Common_Variables.paymentType
							.equals("AA Instalment Account (TIA)")) {
						if (Common_Variables.boostCover == true) {
							setDatapool("Deposit",
									Common_Variables.depositAmount);
							setDatapool("Instalment_Amount",
									Common_Variables.monthlyPrice);
							setDatapool("Total_Annual_Price",
									Common_Variables.totalAnnualPrice);
						}

					}

					if (Common_Variables.boostCover == false) {
						setDatapool("Result", "Sale not Completed");
					} else {
						setDatapool("Result", "Sale");
					}

					java.util.Date now = Calendar.getInstance().getTime();
					long timeElapsed = now.getTime() - startingTime.getTime();

					String elapsedTime = new SimpleDateFormat("mm:ss")
							.format(timeElapsed);

					setDatapool("Elapsed_Time", "" + elapsedTime);

					// System.out.println(elapsedTime);

					storeDatapool();

					browser_htmlBrowser(document__ThankYouForBuyingAAH(),
							MAY_EXIT).close();

					currentRow++;
					dpNext();

					sleep(5.0);
					//------------------------------------------------------------------------------------------
					BrowserSync();
					//------------------------------------------------------------------------------------------

					unregisterAll();
				}

				if (Common_Variables.referal == true) {

					System.out.println("Datapool row " + currentRow
							+ " Failed to generate quote");
					browser_htmlBrowser(document__ThankYouForBuyingAAH(),
							MAY_EXIT).close();

					currentRow++;
					dpNext();

					sleep(5.0);
					//------------------------------------------------------------------------------------------
					BrowserSync();
					//------------------------------------------------------------------------------------------

					unregisterAll();

					Common_Variables.referal = false;

				}

			} else {
				System.out.println("Datapool Row - " + currentRow
						+ " Timed out, next row initiated.");
				browser_htmlBrowser(document__ThankYouForBuyingAAH(), MAY_EXIT)
						.close();

				callScript("Utilities.Stay_Awake");
				
				currentRow++;
				dpNext();

				sleep(5.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

				unregisterAll();

				Common_Variables.timeout = false;

			}
		}

		dpTermination(true);

		// Time stamp the end of the test
		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("End time = " + timeStamp2);

	}
}
