package Motor;
import resources.Common_Variables;
import resources.Motor.Your_Quote_viewHelper;
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
public class Your_Quote_view extends Your_Quote_viewHelper
{
	/**
	 * Script Name   : <b>Your_Quote_view</b>
	 * Generated     : <b>21 Jan 2015 13:30:40</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)   form_quoteForm
	 * 
	 * @since  2015/01/21
	 * @author horned
	 */
	public static boolean quote;
	public static String priceSection_Text;
	public static String Annual_Payment_Value;
	public static String pageAddress;
	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {

		
		// debug ---------------------------------------------
		//Common_Variables.paymentType = ("Single Payment");
		//Common_Variables.paymentType = ("AA Instalment Account (TIA)");
		
		// debug ---------------------------------------------
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		//sleep(10.0); // plus synchronisation, below, can be really long delay here!
		//------------------------------------------------------------------------------------------
		//BrowserSync();
		//------------------------------------------------------------------------------------------
		
		// Detect Number of Street Picker (sometimes appears although all address detail were entered
		
//		if (html_address_Number_Selector().isShowing()){		
//			
//			radioButton_selectedaddresS27().waitForExistence(0.25,  10);
//			radioButton_selectedaddresS27(ANY, READY).click();			
//			
//			// Pagedown
//			//(document_carInsuranceSelectYou(ANY, READY),DEFAULT_FLAGS).click(atPoint(980,16));
//			iE(document_carInsuranceSelectYou(ANY, READY),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
//						
//			button_nextsubmit().waitForExistence(0.25,  10);
//			button_nextsubmit(ANY, READY).doubleClick();
//			
//			// and next page too
//		
//			button_nextsubmit2().waitForExistence(0.25,  10);
//			button_nextsubmit2(ANY, READY).doubleClick();
//		}
		
		html_main().waitForExistence(100,  0.25);
		//------------------------------------------------------
		// Record ALL EXCESS VALUES
		String sExcessValues = (String)html_main().getProperty(".text");
		//-----------------

		// Grab Excess Values
		// policyCompulsoryExcess
		
		String sVoluntaryExcessCode_Value = (String)list_aaMotorVoluntaryExcess().getProperty(".value");
				
		String[] sCoEx = sExcessValues.split("Compulsory excess");
		String sCE = sCoEx[1]; String sCompulsoryExcessValues = sCE.substring(1, 5); 
		
		String[] sToEx = sExcessValues.split("Total excess");
		String sTE = sToEx[1]; String sTotalExcessValues = sTE.substring(1, 5); 
		
		Common_Variables.policyVoluntaryExcess = sVoluntaryExcessCode_Value;
		Common_Variables.policyCompulsoryExcess = sCompulsoryExcessValues;
		Common_Variables.policyTotalExcess = sTotalExcessValues;

		System.out.println("Voluntary Excess = "+(sVoluntaryExcessCode_Value));
		System.out.println("Compulsory Excess = "+(sCompulsoryExcessValues));
		System.out.println("Total Excess = "+(sTotalExcessValues));
		
		
		
		//------------------------------------------------------------------------------------------
		
		list_aaMotorCoverType().waitForExistence(50.0,  0.25);

		// Detect Motor Variant Screen and Set Known .view
		sleep(2);
		logInfo(" Page Split Detected Page Set To Known 'view'");
		iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).click(atPoint(497,37));
		sleep(1);
		iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).click(atPoint(497,38));
		iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).inputKeys("-view{ENTER}");
		
		// Verifications points to check that combo boxes have correct choices
		// available
		list_aaMotorCoverType().performTest(aaMotorCoverType_listVP());
		list_aaMotorVoluntaryExcess().performTest(
				aaMotorVoluntaryExcessCode_listVP());
		
		// Now we have to decide which version of the Your Quote Cover screen is
		// being presented, we do that by getting the page address

		pageAddress = (String) iE(ANY, LOADED).getProperty(
				".documentName");

		boolean quotePage = pageAddress.contains("quote-view");

/*		//--------------------------------------------------------------------------------
		while (quotePage == false) {
			sleep(1.0);
			pageAddress = (String) iE(ANY, LOADED)
					.getProperty(".documentName");
			quotePage = pageAddress.contains("quote-view");
		}
		//--------------------------------------------------------------------------------
*/
		pageAddress = (String) iE(ANY, LOADED).getProperty(
				".documentName");

		Common_Variables.viewA = pageAddress.contains("quote-viewa");

		if (Common_Variables.viewA == true) {

			quote = html_priceSection(ANY, LOADED).exists(); // html_priceSection2
			int index2 = 0;

			while (quote == false && index2 < 120) {

				quote = html_priceSection(ANY, LOADED).exists(); // html_priceSection2

				sleep(1.0);
				index2++;
			}
		} else {

			quote = html_priceSection(ANY, LOADED).exists(); // html_priceSection3
			int index3 = 0;

			while (quote == false && index3 < 120) {

				quote = html_priceSection(ANY, LOADED).exists(); // html_priceSection3

				sleep(1.0);
				index3++;
			}

		}

		if (quote == true) {

			if (Common_Variables.viewA == true) {
				priceSection_Text = (String) html_priceSection(ANY, LOADED)  // html_priceSection2
						.getProperty(".text");
			}

			if (Common_Variables.viewA == false) {
				priceSection_Text = (String) html_priceSection(ANY, LOADED) // html_priceSection3
						.getProperty(".text");
			}

//			 System.out.println(priceSection_Text);

			Common_Variables.instalments = priceSection_Text
					.contains("monthly");

			if (Common_Variables.paymentType.contains("Single Payment")) {

				if (Common_Variables.viewA == false) {

					label_annualPayment(ANY, LOADED).click();
				}

				if (Common_Variables.viewA == true) {
					label_annualPayment(ANY, LOADED).click();
				}

				//sleep(5.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

			}

			if (Common_Variables.paymentType
					.contains("AA Instalment Account (TIA)")) {
				label_payMonthly(ANY, LOADED).click();
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
					Annual_Payment_Value = (String) label_annualPayment( // label_£72607AnnualPayment2
							ANY, LOADED).getProperty(".text");
				}
				if (Common_Variables.viewA == true) {
					Annual_Payment_Value = (String) label_annualPayment(  // label_£41190AnnualPayment
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
				iE(
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
				
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys(
						Common_Variables.qrProposerLastname);
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(
						Common_Variables.proposer_PostCode);
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(Common_Variables.proposerDOB);
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				iE(
						document_carInsuranceRetrieveA(ANY, LOADED),
						DEFAULT_FLAGS).inputChars(
						Common_Variables.quoteReference);
						button_retrieveMyQuotesubmit(ANY, LOADED).click();

				//sleep(10.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------


				if (Common_Variables.paymentType.contains("Single Payment")) {

					if (Common_Variables.viewA == false) {

						label_annualPayment(ANY, LOADED).click();
					}

					if (Common_Variables.viewA == true) {
						label_annualPayment(ANY, LOADED).click();
					}

				}

			}

			if (Common_Variables.upgrades_MLA == true) {
				label_legalAssistance(ANY, LOADED).click();
				sleep(0.5);
			}

			if (Common_Variables.upgrades_MOXIN == true) {
				//label_protectYourPolicyExcess(ANY, LOADED).click();
				label_claimBackYourPolicyExces().click();
				sleep(0.5);
			}

			if (Common_Variables.upgrades_HireCar == true) {
				label_courtesyCarUpgrade(ANY, LOADED).click();
		
		
		// HTML Browser
		// Document: Car Insurance: Your quote options - The AA: RegularExpression(car-insurance)
		label_claimBackYourPolicyExces().click();
				
				sleep(0.5);
			}

			if (Common_Variables.upgrades_MAP == true) {
				label_personalAccidentCover(ANY, LOADED).click();
				sleep(0.5);
			}

			// This block only runs if it's NOT a Money Super Market Test
			if (Common_Variables.MSM == false) {

				//------------------------------------------------------------------------------------------
				// All Verification On QUOTE Page Completed Here
				callScript("Motor.Your_Quote_Details_Confirm_view");  // Extension of existing
				//------------------------------------------------------------------------------------------
				
				// Return and Submit
				button_buyNowsubmit().waitForExistence(10,  0.25);
				button_buyNowsubmit(ANY, LOADED).click();

				//sleep(6.0);
				//------------------------------------------------------------------------------------------
				BrowserSync();
				//------------------------------------------------------------------------------------------

				String htmlBrowser_DocumentName = (String) iE()
						.getProperty(".documentName");

				boolean nextPage = htmlBrowser_DocumentName
						.contains("buy/add-ons");
				int buyNowIndex = 0;
				while (nextPage == false && buyNowIndex < 15) {
					sleep(1.0);
					nextPage = label_legalAssistance(ANY, LOADED)
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
