package Money_Super_Market.Motor;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Money_Super_Market.Motor.Motor_MSM_to_AA_Mappings_TestHelper;
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
public class Motor_MSM_to_AA_Mappings_Test extends
		Motor_MSM_to_AA_Mappings_TestHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl
	 */

	public static int startRow;
	public static int endRow;
	public static int currentRow;
	public static String[] environmentURL = new String[1];
	public static int dpIndex;

	public void testMain(Object[] args) {

		Common_Variables.MSM = true;

		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("Start time = " + timeStamp);

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());

		// Don't touch this, ever....
		dpIndex = 0;
		while (!dpDone()) {
			dpIndex++;
			dpNext();
		}

		dpIndex = dpIndex - 1;
		dpReset();
		endRow = dpIndex; // Script works out what the end row is for it's self

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
		// then we don't run payments.

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

			setDatapool("Quote_Reference", "");
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
			environmentURL[0] = "https://www.theaa.com/car-insurance/buy/car-details";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "https://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/car-insurance/buy/car-details";

		}

		System.out.println("Started Motor Tests.....");

		while (currentRow <= endRow) {

			java.util.Date startingTime = Calendar.getInstance().getTime();

			System.out.println("Executing Motor Test - " + currentRow);

			// Do variables assignments
			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");
			Common_Variables.homeTelNo = dpString("Home_tel_No");

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
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");
			Common_Variables.vehicleValue = dpString("Vehicle_Value");
			Common_Variables.coverType = dpString("Cover_Type");
			Common_Variables.personsCovered = dpString("Persons_Covered");
			Common_Variables.insuredClaims = dpBoolean("Insured_Claims");
			Common_Variables.insuredConvictions = dpBoolean("Insured_Convictions");
			Common_Variables.firstDriverTitle = dpString("First_Driver_Title");
			Common_Variables.firstDriverMaritalStatus = dpString("First_Driver_Marital_Status");
			Common_Variables.firstDriverOccupation = dpString("First_Driver_Occupation");
			Common_Variables.firstDriverEmployerBiz = dpString("First_Driver_Employer_Biz");
			Common_Variables.firstDriverDOB = dpString("First_Driver_DOB");
			Common_Variables.firstDriverRelationship = dpString("First_Driver_Relationship");
			Common_Variables.firstDriverClaims = dpBoolean("First_Driver_Claims");
			Common_Variables.firstDriverConvictions = dpBoolean("First_Driver_Convictions");
			Common_Variables.secondDriverClaims = dpBoolean("Second_Driver_Claims");
			Common_Variables.secondDriverConvictions = dpBoolean("Second_Driver_Convictions");
			Common_Variables.businessUse = dpBoolean("Business_Use");
			Common_Variables.NCB = dpString("NCB");
			Common_Variables.numberFutureDays = dpString("Future_Date_Num_Days");
			Common_Variables.paymentType = dpString("Payment_Type");
			Common_Variables.VehicleKeptLocation = dpString("Where_Car_Kept");
			Common_Variables.maritalStatus = dpString("Marital_Status");
			Common_Variables.insuredNumPrevClaims = Integer
					.parseInt(dpString("Insured_Num_Prev_Claims"));
			Common_Variables.insuredFirstClaimMonth = dpString("Insured_First_Claim_Month");
			Common_Variables.insuredFirstClaimYear = dpString("Insured_First_Claim_Year");
			Common_Variables.insuredFirstClaimDescription = dpString("Insured_First_Claim Description");
			Common_Variables.insuredSecondClaimMonth = dpString("Insured_Second_Claim_Month");
			Common_Variables.insuredSecondClaimYear = dpString("Insured_Second_Claim_Year");
			Common_Variables.insuredSecondClaimDescription = dpString("Insured_Second_Claim_Description");

			startApp("IE", environmentURL);

			callScript("Motor.The_Car");

			if (Common_Variables.timeout == false) {

				callScript("Motor.Your_Details");

				callScript("Motor.Your_Quote");

				if (Common_Variables.referal == false) {

					// Save the Quote number to the datapool
					setDatapool("Quote_Reference",
							Common_Variables.quoteReference);

					setDatapool("Annual_Premium",
							Common_Variables.annualPremium);

					if (Common_Variables.paymentType
							.equals("AA Instalment Account (TIA)")) {

						setDatapool("Deposit", Common_Variables.depositAmount);
						setDatapool("Instalment_Amount",
								Common_Variables.monthlyPrice);
						setDatapool("Total_Annual_Price",
								Common_Variables.totalAnnualPrice);

					}

					java.util.Date now = Calendar.getInstance().getTime();
					long timeElapsed = now.getTime() - startingTime.getTime();

					String elapsedTime = new SimpleDateFormat("mm:ss")
							.format(timeElapsed);

					setDatapool("Elapsed_Time", "" + elapsedTime);

					// System.out.println(elapsedTime);

					storeDatapool();

					Common_Variables.annualPremium = "";
					Common_Variables.depositAmount = "";
					Common_Variables.monthlyPrice = "";
					Common_Variables.totalAnnualPrice = "";

					browser_htmlBrowser(document__ThankYouForBuyingAAH(),
							MAY_EXIT).close();

					currentRow++;
					dpNext();

					sleep(5.0);

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

					unregisterAll();

					Common_Variables.referal = false;

				}

			} else {
				System.out.println("Datapool Row - " + currentRow
						+ " Timed out, next row initiated.");
				browser_htmlBrowser(document__ThankYouForBuyingAAH(), MAY_EXIT)
						.close();

				currentRow++;
				dpNext();

				sleep(5.0);

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
