import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Travel_Regression_TestHelper;
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
public class Full_Travel_Regression_Test extends
		Full_Travel_Regression_TestHelper {
	/**
	 * Script Name : <b>Full_Travel_Regression_Test</b> Generated : <b>17 Apr
	 * 2013 10:19:49</b> Description : Functional Test Script Original Host :
	 * WinNT Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */

	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;
	public static String selectedEnvironment;
	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {

		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("Start time = " + timeStamp);

		if (Common_Variables.bulkTest == false) {

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

		// Set Row to end on in Datapool, don't change this unless you really
		// have to.
		// Set Row to end on in Datapool
		if (Common_Variables.liveTest == true) {
			endRow = 16;// 16
		}

		if (Common_Variables.liveTest == false) {
			endRow = 5;// 5
		}

		if (Common_Variables.bulkTest == false) {

			// This code triggers a question at runtime that will ask what row
			// you
			// want to start on/
			startRow = Integer.parseInt(Common.startRow(endRow));
		}

		System.out.println("Start row = " + startRow);
		System.out.println("End row = " + endRow);
		System.out.println("Started Travel Tests.....");

		// Variable for current Datapool Row - DON'T TOUCH THIS, EVER!
		int currentRow = 0;

		// Move to the selected row to Start on
		while (currentRow < startRow) {
			dpNext();
			currentRow++;
		}

		// Work through the list of data, creating the appropriate new quotes or
		// a policy, according to the value entered in the product column of the
		// datapool.

		while (currentRow <= endRow) {

			System.out.println("Executing Travel Test - " + currentRow);

			// Check the customer is correct and select it
			callScript("Create_New_Customer");

			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");

			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");

			Common_Variables.travelBrand = dpString("Travel_Brand");
			Common_Variables.medicalScreening = dpString("Medical_Screening");

			// Payment Card details
			Common_Variables.paymentType = dpString("Payment_Type");
			Common_Variables.Payment_CardType = dpString("Payment_CardType");
			Common_Variables.Payment_CardName = dpString("Customer_Name");
			Common_Variables.Payment_CardNumber = dpString("Payment_CardNumber");
			Common_Variables.Payment_StartDate = dpString("Payment_StartDate");
			Common_Variables.Payment_ExpiryDate = dpString("Payment_ExpiryDate");
			Common_Variables.Payment_SecCode = dpString("Payment_SecCode");

			// Product Info
			Common_Variables.personsTravelling = dpString("Persons_Travelling");
			Common_Variables.travelPolicyType = dpString("Policy_Type");
			Common_Variables.travelPolicyDestination = dpString("Destination");
			Common_Variables.Travel_tripDuration = dpString("Trip_Duration");
			Common_Variables.travel_Policy_Start_Date = dpString("Start_Date");
			Common_Variables.quoteOnly = dpBoolean("Quote_Only");
			Common_Variables.winterSports = dpBoolean("Winter_Sports");
			Common_Variables.upgrade_DatapoolRow = dpString("Upgrade_Datapool_Row");

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");

			if (Common_Variables.liveTest == true) {

				// Set the Test Environment you wish to use
				if (Common_Variables.travelBrand.equals("AA")) {
					Common_Variables.environment = "Travel Live";
					environmentURL[0] = "https://www.theaa.com/travel-insurance/index?&schemeType=1";
				}
				if (Common_Variables.travelBrand.equals("Go")) {
					Common_Variables.environment = "Go Travel Live";
					environmentURL[0] = "http://www.gotravelinsurance.co.uk";
				}
				if (Common_Variables.travelBrand.equals("1Stop")) {
					Common_Variables.environment = "1Stop Travel Live";
					environmentURL[0] = "http://www.1stoptravelinsurance.co.uk";
				}
			}

			if (Common_Variables.liveTest == false) {

				if (Common_Variables.travelBrand.equals("AA")) {

					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/travel-insurance/index?&schemeType=1";

				}
				if (Common_Variables.travelBrand.equals("Go")) {
					environmentURL[0] = "https://10.192.101.84/go-travel-insurance/index";
				}
				if (Common_Variables.travelBrand.equals("1Stop")) {
					environmentURL[0] = "https://test.1stoptravelinsurance.co.uk/onestop-travel-insurance/index";
				}

			}

			// Launch chosen test environment
			startApp("IE", environmentURL);

			// Create quote
			callScript("Travel.Select_Your_Cover");

			callScript("Travel.Your_Quotes");

			callScript("Travel.Policy_Extras");

			if (Common_Variables.quoteOnly == false) {

				callScript("Travel.Lead_Traveller");

				callScript("Travel.Declaration");

				if (Common_Variables.liveTest == false) {
					if (!Common_Variables.selectedEnvironment
							.equals("prelive1")) {

						callScript("Travel.Your_Payment");
					}
				}
			}

			dpNext();
			currentRow++;

			sleep(2.0);

			// Close the browser
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).close();

			sleep(2.0);

			RationalTestScript.unregisterAll();

		}
		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		System.out.println("End time = " + timeStamp2);
	}
}
