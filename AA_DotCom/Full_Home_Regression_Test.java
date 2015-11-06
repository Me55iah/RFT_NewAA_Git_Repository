import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Home_Regression_TestHelper;
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
public class Full_Home_Regression_Test extends Full_Home_Regression_TestHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl
	 */
	
	////////////////////////////////////////////////////////////////////////////////////////
	// DH - TEST PASSED ON 26th November 2014 - Passed 0 through 23, exceptions 17 and 20,
	// tool warnings also after 20 need to be investigated. 17 and 20 need updating
	////////////////////////////////////////////////////////////////////////////////////////

	public static int startRow;
	public static int endRow;
	public static int currentRow;
	public static boolean liveTest;
	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {

		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());
		
		System.out.println("Start time = " + timeStamp);

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();       // IE11
		// Set Row to end on in Datapool, don't change this unless you really
		// have to.
		endRow = 23; // 23

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

		// Variable for current Datapool Row - DON'T TOUCH THIS, EVER!
		Common_Variables.currentRow = 0;

		// Move to the selected row to Start on
		while (Common_Variables.currentRow < Common_Variables.startRow) {
			dpNext();
			Common_Variables.currentRow++;
		}

		// Clear all result data from datapool, starting at startRow and going
		// to endRow
		while (Common_Variables.currentRow <= endRow) {

			setDatapool("TIA_Policy_Number", "");
			setDatapool("Customer_Name", "");
			setDatapool("Quote_Reference", "");
			setDatapool("Buildings_Annual_Premium", "");
			setDatapool("Buildings_Deposit", "");
			setDatapool("Buildings_Installment_Amount", "");
			setDatapool("Buildings_Total_Price", "");
			setDatapool("Contents_Annual_Premium", "");
			setDatapool("Contents_Deposit", "");
			setDatapool("Contents_Instalment_Amount", "");
			setDatapool("Contents_Total_Price", "");
			setDatapool("Annual_Premium", "");
			setDatapool("Deposit", "");
			setDatapool("Instalment_Amount", "");
			setDatapool("Total_Annual_Price", "");
			dpNext();
			Common_Variables.currentRow++;

		}

		storeDatapool();
		dpReset();
		Common_Variables.currentRow = 0;

		// Move to the selected row to Start on
		while (Common_Variables.currentRow < Common_Variables.startRow) {
			dpNext();
			Common_Variables.currentRow++;
		}

		// Set the Test Environment you wish to use
		if (Common_Variables.liveTest == true) {
			environmentURL[0] = "https://www.theaa.com/home-insurance/viewMainDetails.do?disableShuffleFields";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "https://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/home-insurance/viewMainDetails.do?disableShuffleFields";
		}

		System.out.println("Started Home Tests.....");

		while (Common_Variables.currentRow <= endRow) {

			System.out.println("Executing Home Test - "
					+ Common_Variables.currentRow);

			// Save changes to the datapool
			storeDatapool();

			// Do variables assignments
			Common_Variables.proposerForename = ("Tia");
			Common_Variables.proposerOccupation = dpString("Occupation");
			Common_Variables.employerBusiness = dpString("Employer_Business");
			Common_Variables.membership = dpBoolean("Membership");
			Common_Variables.proposer_HouseNumber = dpString("House_Number");
			Common_Variables.proposer_PostCode = dpString("PostCode");
			Common_Variables.propertyType = dpString("Property_Type");
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
			Common_Variables.homeInsPlus = dpBoolean("Home_Ins_Plus");
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

			// Check the customer is correct and select it
			callScript("Create_New_Customer");

			Common_Variables.newCustomerForename = Common_Variables.proposerForename;
			Common_Variables.qrProposerLastname = Common_Variables.proposerLastname;

			setDatapool("Customer_Name", "Mr "
					+ Common_Variables.newCustomerForename + " "
					+ Common_Variables.newCustomerSurname);

			storeDatapool();

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			startApp("IE", environmentURL);

			System.gc();
			
			callScript("Home.You_and_Your_Home");

			System.gc();

			callScript("Home.Your_Quote");

			setDatapool("Quote_Reference", Common_Variables.quoteReference);
			storeDatapool();

			System.gc();

			callScript("Home.Boost_your_Cover");

			System.gc();

			callScript("Home.Confirm_your_Details");

			if (Common_Variables.liveTest == false) {

				if (Common_Variables.paymentType.equals("Single Payment")) {
					callScript("Utilities.Pay_CC"); // Generic_Scripts.Your_Card_Payment - IE11/WIN7

				}

				if (Common_Variables.paymentType
						.equals("AA Instalment Account (TIA)")) {

					callScript("Home.Your_Direct_Debit");
				}

				System.gc();

			}

			// Save the policy number to the datapool
			setDatapool("TIA_Policy_Number", Common_Variables.TIA_Policy_Number);

			if (Common_Variables.coverType.equals("Buildings")) {

				setDatapool("Buildings_Annual_Premium",
						Common_Variables.buildingsAnnualPremium);

				if (Common_Variables.paymentType
						.equals("AA Instalment Account (TIA)")) {

					setDatapool("Buildings_Deposit",
							Common_Variables.buildingsDepositPrice);
					setDatapool("Buildings_Installment_Amount",
							Common_Variables.buildingsMonthlyPrice);
					setDatapool("Buildings_Total_Price",
							Common_Variables.buildingsTotalAnnualPrice);
				}

			}

			if (Common_Variables.coverType.equals("Contents")) {

				setDatapool("Contents_Annual_Premium",
						Common_Variables.contentsAnnualPremium);

				if (Common_Variables.paymentType
						.equals("AA Instalment Account (TIA)")) {

					setDatapool("Contents_Deposit",
							Common_Variables.contentsDepositPrice);
					setDatapool("Contents_Instalment_Amount",
							Common_Variables.contentsMonthlyPrice);
					setDatapool("Contents_Total_Price",
							Common_Variables.contentsTotalAnnualPrice);
				}

			}

			if (Common_Variables.coverType.equals("Buildings and Contents")) {

				setDatapool("Annual_Premium",
						Common_Variables.combinedAnnualPremium);

				if (Common_Variables.paymentType
						.equals("AA Instalment Account (TIA)")) {

					setDatapool("Deposit",
							Common_Variables.combinedDepositPrice);
					setDatapool("Instalment_Amount",
							Common_Variables.combinedMonthlyPrice);
					setDatapool("Total_Annual_Price",
							Common_Variables.combinedTotalAnnualPrice);
				}

			}

			storeDatapool();

			logTestResult(" Home Police Purchase Completed - OK", true);
			
			sleep(5);
 			browser_htmlBrowser(document__ThankYouForBuyingAAH(ANY, LOADED),
					MAY_EXIT).close();

			sleep(3.0);

			Common_Variables.currentRow++;
			dpNext();
			unregisterAll();

		}

		// Time stamp the end of the test
		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("End time = " + timeStamp2);

	}
}
//ignore//
