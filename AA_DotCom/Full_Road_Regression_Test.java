import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Road_Regression_TestHelper;
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
public class Full_Road_Regression_Test extends Full_Road_Regression_TestHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl  tia
	 */

	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;
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
		endRow = 20; // 20

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

		// Variable for current Datapool Row - DON'T TOUCH THIS, EVER!
		int currentRow = 0;

		// Move to the selected row to Start on
		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;
		}

		// Set the Test Environment you wish to use
		if (Common_Variables.liveTest == true) {
			environmentURL[0] = "http://www.theaa.com/breakdown-cover/uk-breakdown/view-options.do?mlaSplit=true";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "http://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/breakdown-cover/uk-breakdown/view-options.do?mlaSplit=true";

		}

		System.out.println("Started Road Tests.....");

		while (currentRow <= endRow) {

			java.util.Date startingTime = Calendar.getInstance().getTime();

			System.out.println("Executing Road Test - " + currentRow);

			// Blank the TIA Policy Number field for each customers, ready to
			// store the new one we create.
			setDatapool("TIA_Policy_Number", "");
			setDatapool("Customer_Name", "");
			setDatapool("Proposer_Lastname", "");
			setDatapool("Quote_Reference", "");

			// Save changes to the datapool
			storeDatapool();

			// Do variables assignments
			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");

			// Do all the variable assignments here, from the datapool
			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");

			// Create new random Customer last name
			callScript("Create_New_Customer");

			setDatapool("Proposer_Lastname", Common_Variables.proposerLastname);
			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
					+ Common_Variables.proposerForename + " "
					+ Common_Variables.proposerLastname);

			storeDatapool();

			// Product Info
			Common_Variables.provCode = dpString("ProvCode");
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");
			Common_Variables.personsCovered = dpString("Persons_Covered");
			Common_Variables.upgrades_AtHome = dpBoolean("Upgrade_At_Home");
			Common_Variables.upgrades_Recovery = dpBoolean("Upgrade_Recovery");
			Common_Variables.upgrades_BRC = dpBoolean("Upgrades_BRC");
			Common_Variables.upgrades_StayMobile = dpBoolean("Upgrade_Stay_Mobile");
			Common_Variables.MLA = dpString("MLA");
			Common_Variables.numberFutureDays = dpString("Future_Date_Num_Days");

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

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			startApp("IE", environmentURL);

			callScript("Road.Select_Your_Cover");

			callScript("Road.Choose_Whos_Covered");

			callScript("Road.Your_Details");
			
			

			if (Common_Variables.liveTest == false) {
				if (Common_Variables.paymentType.equals("ADD")) {
					callScript("Road.Your_Direct_Debit");
				}

				/*
				 * if (Common_Variables.paymentType.equals("CCC")) {
				 * callScript("Road.Confirmation");
				 * setDatapool("Quote_Reference",
				 * Common_Variables.quoteReference); storeDatapool();
				 * callScript("Generic_Scripts.Your_Card_Payment");
				 * 
				 * 
				 * } if (Common_Variables.paymentType.equals("ADD")) {
				 * callScript("Road.Your_Direct_Debit");
				 */
				if (Common_Variables.paymentType.equals("CMM")) {
					callScript("Road.Your_CMM");
				}
				/*
				 * if (Common_Variables.paymentType.equals("CCC")) {
				 * callScript("Road.Confirmation");
				 * setDatapool("Quote_Reference",
				 * Common_Variables.quoteReference); storeDatapool();
				 * callScript("Generic_Scripts.Your_Card_Payment"); }
				 * 
				 * if (Common_Variables.paymentType.equals("CMM")) {
				 * callScript("Road.Your_CMM");
				 */
				if (Common_Variables.paymentType.equals("CCC")) {
					callScript("Road.Confirmation");
					setDatapool("Quote_Reference",
							Common_Variables.quoteReference);
					storeDatapool();
					callScript("Utilities.Pay_CC"); // Generic_Scripts.Your_Card_Payment - IE11/WIN7
				}

				// Save the policy number to the datapool
				setDatapool("TIA_Policy_Number",
						Common_Variables.TIA_Policy_Number);
				setDatapool("Annual_Premium", Common_Variables.annualPremium);

				if (Common_Variables.paymentType.equals("CMM")) {
					setDatapool("Deposit", Common_Variables.depositAmount);
					setDatapool("Instalment_Amount",
							Common_Variables.monthlyPrice);
				}
				storeDatapool();
			}

			java.util.Date now = Calendar.getInstance().getTime();
			long timeElapsed = now.getTime() - startingTime.getTime();

			String elapsedTime = new SimpleDateFormat("mm:ss")
					.format(timeElapsed);

			// System.out.println("Iteration " + currentRow + " run time = "
			// + elapsedTime);

			setDatapool("Elapsed_Time", "" + elapsedTime);

			storeDatapool();

			sleep(2.0);
			
			// MORE STUFF IN HERE - DH - 10 12 2014
		
	
			
			
			
			// VERIFY JOURNEY COMPLETES "WITH YOU ARE COVERED" - DH
			// Youre_CoveredVP().performTest();
			
			
			// END OF JOURNEY - DH
			browser_htmlBrowser(document__ThankYouForBuyingAAH(ANY, LOADED),
					DEFAULT_FLAGS).close();

			currentRow++;
			dpNext();

			sleep(2.0);

		}

		// Time stamp the end of the test
		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("End time = " + timeStamp2);

	}
}
