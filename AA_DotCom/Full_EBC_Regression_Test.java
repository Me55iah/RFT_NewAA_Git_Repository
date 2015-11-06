import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Utilities.Portal_Synchronisation;
import resources.Common;
import resources.Common_Variables;
import resources.Full_EBC_Regression_TestHelper;
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
public class Full_EBC_Regression_Test extends Full_EBC_Regression_TestHelper {
	/**
	 * Script Name : <b>Full_EBC_Regression_Test</b> Generated : <b>11 Apr 2013
	 * 13:36:05</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/11
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

		System.out.println("Start time = " + timeStamp);

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
			environmentURL[0] = "http://www.theaa.com/european-breakdown-cover/viewBreakdownCoverDetails.do";
		}

		if (Common_Variables.liveTest == false) {

			environmentURL[0] = "http://"
					+ Common_Variables.selectedEnvironment
					+ ".theaa.com/european-breakdown-cover/viewBreakdownCoverDetails.do";

		} 

		// Work through the list of data, creating the appropriate new quotes or
		// a policy, according to the value entered in the product column of the
		// datapool.

		System.out.println("Started EBC Tests.....");

		while (currentRow <= endRow) {

			// Launch chosen test environment
			startApp("IE", environmentURL);

			System.out.println("Executing EBC Test - " + currentRow);

			// Blank the TIA Policy Number field for each customers, ready to
			// store the new one we create.
			setDatapool("TIA_Policy_Number", "");
			setDatapool("Customer_Name", "");

			// Create new random Customer last name
			callScript("Create_New_Customer");

			setDatapool("Proposer_Lastname", Common_Variables.proposerLastname);
			storeDatapool();

			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");

			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
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

			// Product Info
			Common_Variables.quoteOnly = dpBoolean("quoteOnly");
			Common_Variables.membershipYN = dpString("Membership");
			Common_Variables.membershipNum = dpString("Membership_Num");
			Common_Variables.coverType = dpString("Cover_Type");
			Common_Variables.zone = dpString("Zone");
			Common_Variables.EBC_Product = dpString("EBC_Product");
			Common_Variables.EBC_Destination = dpString("EBC_Destination");
			Common_Variables.EBC_Cover_Level = dpString("Cover_Level");
			Common_Variables.personsTravelling = dpString("EBC_Persons_Travelling");
			//Common_Variables.EBC_tripDuration = dpString("EBC_Trip_Duration_Days");
			Common_Variables.partsAndLabour = dpBoolean("Parts_and_Labour_YN");
			Common_Variables.towingYN = dpBoolean("Towing_YN");
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");

			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
					+ Common_Variables.proposerForename + " "
					+ Common_Variables.proposerLastname);

			storeDatapool();

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			// Create the quote
			callScript("EBC.Your_Trip");

			if (Common_Variables.EBC_Product.equals("Annual cover")) {
				callScript("EBC.Select_Zone");

			}

			callScript("EBC.Your_Quote");
			callScript("EBC.Your_Details");

			// Decide whether to convert or not, if it's a LIVE test, then
			// don't convert.

			if (Common_Variables.liveTest == false) {

				if (Common_Variables.paymentType
						.equals("Continuous Credit Card")) {
					callScript("EBC.Your_Card_Payment");

				}
				if (Common_Variables.paymentType.equals("Annual Direct Debit")) {
					// callScript("EBC.Your_Direct_Debit");

				}
				if (Common_Variables.paymentType
						.equals("Single Credit/Debit card")) {
					callScript("EBC.Your_Card_Payment");

				}

			}

			setDatapool("Price_to_Pay", Common_Variables.annualPremium);
			storeDatapool();

			if (Common_Variables.selectedEnvironment.equals("prelive4")) {
				// Save the policy number to the datapool
				setDatapool("TIA_Policy_Number",
						resources.Common_Variables.TIA_Policy_Number);

				storeDatapool();
			}

			sleep(3.0);

			// HTML Browser
			browser_htmlBrowser(document_europeanBreakdownCove(), DEFAULT_FLAGS)
					.close();

			sleep(2.0);

			dpNext();
			currentRow++;

		}

		storeDatapool();

		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("End time = " + timeStamp2);
	}
}
