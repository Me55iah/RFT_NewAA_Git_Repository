import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_HER_Regression_TestHelper;
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
public class Full_HER_Regression_Test extends Full_HER_Regression_TestHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl
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

		// Set Row to end on in Datapool, don't change this unless you really
		// have to.
		endRow = 25; // 25

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
			environmentURL[0] = "https://www.theaa.com/home-membership/#/";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "https://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/home-emergency-response/viewChooseCover.do?boiler=n&her=y";

		}

		System.out.println("Started HER Tests.....");

		while (currentRow <= endRow) {

			System.out.println("Executing HER Test - " + currentRow);

			// Blank the TIA Policy Number field for each customers, ready to
			// store the new one we create.
			setDatapool("TIA_Policy_Number", "");
			setDatapool("Customer_Name", "");
			setDatapool("Proposer_Lastname", "");
			setDatapool("Quote_Reference", "");

			// Save changes to the datapool
			storeDatapool();

			// Create new random Customer last name
			callScript("Create_New_Customer");

			setDatapool("Proposer_Lastname", Common_Variables.proposerLastname);
			storeDatapool();

			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");

			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");

			Common_Variables.paymentType = dpString("Payment_Type");
			Common_Variables.Payment_CardType = dpString("New_Business_Sale_CardType");
			Common_Variables.Payment_CardName = dpString("Customer_Name");
			Common_Variables.Payment_CardNumber = dpString("New_Business_Sale_CardNumber");
			// Bank Account Details
			Common_Variables.Payment_Bank_Sortcode = dpString("Bank_Sort_Code");
			Common_Variables.Payment_Bank_Account_Number = dpString("Bank_Account_Number");

			// Product Info
			Common_Variables.herYN = dpBoolean("herYN");
			Common_Variables.centralHeatingEmergencyResponse = dpBoolean("centralHeatingEmergencyResponse");
			Common_Variables.homeResponsePlus = dpBoolean("homeResponsePlus");
			Common_Variables.centralHeatingResponsePlus = dpBoolean("centralHeatingResponsePlus");
			Common_Variables.excessYN = dpBoolean("excessYN");
			Common_Variables.previousSupplier = dpString("previousSupplier");
			Common_Variables.typeOfProperty = dpString("typeOfProperty");
			Common_Variables.numBedrooms = dpString("numBedrooms");
			Common_Variables.membershipYN = dpString("Membership");
			Common_Variables.membershipNum = dpString("Membership_Num");
			Common_Variables.provCode = dpString("ProvCode");
			Common_Variables.nonIPTAddress = "";
			Common_Variables.specificAddress = "";

			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
					+ Common_Variables.proposerForename + " "
					+ Common_Variables.proposerLastname);

			storeDatapool();
			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			// Launch chosen test environment
			startApp("IE", environmentURL);

			callScript("HER.Choose_Your_Cover");

			callScript("HER.Your_Details");

			callScript("HER.Your_Property");

			callScript("HER.Your_Policy");

			callScript("HER.Choose_Payment_Option");

			callScript("HER.Assumptions");

			// Decide whether to convert or not, if it's a LIVE test, then
			// don't convert.

			if (Common_Variables.liveTest == false) {

				callScript("HER.Your_Payment");

				setDatapool("Quote_Reference", Common_Variables.quoteReference);
				storeDatapool();

				// Save the policy number to the datapool
				setDatapool("TIA_Policy_Number",
						Common_Variables.TIA_Policy_Number);

				setDatapool("Total_Price", Common_Variables.annualPremium);
				setDatapool("Monthly_Instalment", Common_Variables.monthlyPrice);

			}

			storeDatapool();

			browser_htmlBrowser(document__ThankYouForBuyingAAH(), MAY_EXIT)
					.close();

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
