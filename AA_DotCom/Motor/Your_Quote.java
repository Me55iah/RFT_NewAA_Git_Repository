package Motor;

import resources.Common_Variables;
import resources.Motor.Your_QuoteHelper;
import Utilities.Portal_Synchronisation;
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
public class Your_Quote extends Your_QuoteHelper {
	/**
	 * Script Name : <b>Your_Quote</b> Generated : <b>11 Mar 2013 14:08:24</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/03/11
	 * @author courtl
	 */

	public static boolean quote;
	public static String priceSection_Text;
	public static String Annual_Payment_Value;
	public static String pageAddress;
	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {

		//sleep(10.0); // plus synchronisation, below, can be really long delay here!
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		
		list_aaMotorCoverType().waitForExistence(50.0,  0.25);

		// Verifications points to check that combo boxes have correct choices
		// available
		list_aaMotorCoverType().performTest(aaMotorCoverType_listVP());
		list_aaMotorVoluntaryExcessCod().performTest(
				aaMotorVoluntaryExcessCode_listVP());

		// Now we have to decide which version of the Your Quote Cover screen is
		// being presented, we do that by getting the page address

		pageAddress = (String) browser_htmlBrowser(ANY, LOADED).getProperty(
				".documentName");

		boolean quotePage = pageAddress.contains("quote-view");

//		while (quotePage == false) {
//			sleep(1.0);
//			pageAddress = (String) browser_htmlBrowser(ANY, LOADED)
//					.getProperty(".documentName");
//			quotePage = pageAddress.contains("quote-view");
//		}

		pageAddress = (String) browser_htmlBrowser(ANY, LOADED).getProperty(
				".documentName");

		Common_Variables.viewA = pageAddress.contains("quote-viewa");

		if (Common_Variables.viewA == true) {

			quote = html_priceSection2(ANY, LOADED).exists();
			int index2 = 0;

			while (quote == false && index2 < 120) {

				quote = html_priceSection2(ANY, LOADED).exists();

				sleep(1.0);
				index2++;
			}
		} else {

			quote = html_priceSection3(ANY, LOADED).exists();
			int index3 = 0;

			while (quote == false && index3 < 120) {

				quote = html_priceSection3(ANY, LOADED).exists();

				sleep(1.0);
				index3++;
			}

		}

		if (quote == true) {

			if (Common_Variables.viewA == true) {
				priceSection_Text = (String) html_priceSection2(ANY, LOADED)
						.getProperty(".text");
			}

			if (Common_Variables.viewA == false) {
				priceSection_Text = (String) html_priceSection3(ANY, LOADED)
						.getProperty(".text");
			}

//			 System.out.println(priceSection_Text);

			Common_Variables.instalments = priceSection_Text
					.contains("monthly");

			if (Common_Variables.paymentType.contains("Single Payment")) {

				if (Common_Variables.viewA == false) {

					label_£72607AnnualPayment2(ANY, LOADED).click();
				}

				if (Common_Variables.viewA == true) {
					label_£41190AnnualPayment(ANY, LOADED).click();
				}

				//sleep(5.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

			}

			if (Common_Variables.paymentType
					.contains("AA Instalment Account (TIA)")) {
				label_£2305PayMonthly(ANY, LOADED).click();
				//sleep(5.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

			}

			if (Common_Variables.paymentType
					.contains("AA Instalment Account (TIA)")) {

				int cpInt = priceSection_Text.indexOf("(card payment)");
				cpInt = cpInt - 1;
				int cpInt2 = cpInt - 7;

				Common_Variables.depositAmount = priceSection_Text.substring(
						cpInt2, cpInt);
				Common_Variables.depositAmount = Common_Variables.depositAmount
						.trim();
				Common_Variables.monthlyPrice = priceSection_Text.substring(0,
						7);
				Common_Variables.monthlyPrice = Common_Variables.monthlyPrice
						.trim();

				int tpInt = priceSection_Text.indexOf("Total payable");
				tpInt = tpInt + 16;

				String totalSub = priceSection_Text.substring(tpInt);
				int tpInt2 = totalSub.indexOf(" ");

				Common_Variables.totalAnnualPrice = totalSub.substring(0,
						tpInt2);
				Common_Variables.totalAnnualPrice = Common_Variables.totalAnnualPrice
						.trim();
				
				Common_Variables.annualPremium = totalSub.substring(tpInt2);
				Common_Variables.annualPremium = Common_Variables.annualPremium.trim();

			}

			// Got to get the annual premium if it's a single payment case
			if (Common_Variables.paymentType.contains("Single Payment")) {

				if (Common_Variables.viewA == false) {
					Annual_Payment_Value = (String) label_£72607AnnualPayment2(
							ANY, LOADED).getProperty(".text");
				}
				if (Common_Variables.viewA == true) {
					Annual_Payment_Value = (String) label_£41190AnnualPayment(
							ANY, LOADED).getProperty(".text");
				}

				int spaceIndex = Annual_Payment_Value.indexOf(" ");
				Common_Variables.annualPremium = (String) Annual_Payment_Value
						.subSequence(0, spaceIndex);
				Common_Variables.annualPremium = Common_Variables.annualPremium
						.trim();

			}

			// Grab the Quote Ref
			String aside_Text = (String) html_aside(ANY, LOADED).getProperty(
					".text");

			int qrIndex = aside_Text.indexOf("Quote reference");
			qrIndex = qrIndex + 16;

			Common_Variables.quoteReference = aside_Text.substring(qrIndex,
					qrIndex + 12);
			Common_Variables.quoteReference = Common_Variables.quoteReference
					.trim();

			if (Common_Variables.retrieveQuote == true) {
				// Here we will save the Quote ref, then close down the browser,
				// reopen it and search for the quote to get us back to this
				// point in the script

				// HTML Browser
				browser_htmlBrowser(
						document_carInsuranceYourQuote(ANY, LOADED),
						DEFAULT_FLAGS).close();

				sleep(5.0);

				// Set the Test Environment you wish to use
				if (Common_Variables.liveTest == true) {
					environmentURL[0] = "https://www.theaa.com/car-insurance/buy/quote-retrieval";
				}

				if (Common_Variables.liveTest == false) {

					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/car-insurance/buy/quote-retrieval";

				}

				startApp("IE", environmentURL);

				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

				text_aaQuoteRetrieveSurname(ANY, LOADED).waitForExistence();
				text_aaQuoteRetrieveSurname(ANY, LOADED).click();
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(
						Common_Variables.qrProposerLastname);
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(
						Common_Variables.proposer_PostCode);
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(Common_Variables.proposerDOB);
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				browser_htmlBrowser(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(
						Common_Variables.quoteReference);
				button_retrieveMyQuotesubmit(ANY, LOADED).click();

				//sleep(10.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------


				if (Common_Variables.paymentType.contains("Single Payment")) {

					if (Common_Variables.viewA == false) {

						label_£72607AnnualPayment2(ANY, LOADED).click();
					}

					if (Common_Variables.viewA == true) {
						label_£41190AnnualPayment(ANY, LOADED).click();
					}

				}

			}

			if (Common_Variables.upgrades_MLA == true) {
				label_motorLegalAssistance£245(ANY, LOADED).click();
				sleep(0.5);
			}

			if (Common_Variables.upgrades_MOXIN == true) {
				label_protectYourPolicyExcess£(ANY, LOADED).click();
				sleep(0.5);
			}

			if (Common_Variables.upgrades_HireCar == true) {
				label_carHireCover£281AMonth£2(ANY, LOADED).click();
				sleep(0.5);
			}

			if (Common_Variables.upgrades_MAP == true) {
				label_personalAccidentCover£25(ANY, LOADED).click();
				sleep(0.5);
			}

			// This block only runs if it's NOT a Money Super Market Test
			if (Common_Variables.MSM == false) {

				// All Verification On QUOTE Page Completed Here
				callScript("Motor.Your_Quote_Details_Confirm");
				
				
				button_buyNowsubmit2(ANY, LOADED).click();

				//sleep(6.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

				String htmlBrowser_DocumentName = (String) browser_htmlBrowser()
						.getProperty(".documentName");

				boolean nextPage = htmlBrowser_DocumentName
						.contains("buy/add-ons");
				int buyNowIndex = 0;
				while (nextPage == false && buyNowIndex < 15) {
					sleep(1.0);
					nextPage = label_legalAssistance£2599GetU(ANY, LOADED)
							.exists();
					buyNowIndex++;

				}

				if (htmlBrowser_DocumentName
						.contains("car-insurance/buy/referal")) {

					Common_Variables.referal = true;

				}

				if (nextPage == true) {
					Common_Variables.yourQuote = true;
				} else {
					Common_Variables.yourQuote = false;
				}
			}

			unregisterAll();
		}

	}
}
