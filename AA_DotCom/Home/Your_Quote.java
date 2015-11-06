package Home;

import resources.Common_Variables;
import resources.Home.Your_QuoteHelper;
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
	 * Script Name : <b>Your_Quote</b> Generated : <b>26 Feb 2013 14:51:50</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/26
	 * @author courtl
	 */

	public static String[] environmentURL = new String[1];

	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------
		
		BrowserSync();
				
		sleep(5.0);
		label_annualPayment(ANY, LOADED).waitForExistence();
		sleep(5.0);

		//-----------------------------------------------------------------			
		callScript("Home.Important_Information_Screen");
		//-----------------------------------------------------------------				
		
		boolean premEndorsement = html_premEndorsementsOverlay(ANY, LOADED)
				.exists();

		boolean securityEndorsement5 = html_endorsementsOverlay(ANY, LOADED)
				.exists();

		if (securityEndorsement5 == true) {

			boolean close5 = image_close4(ANY, LOADED).exists();
			if (close5 == true) {
				image_close4(ANY, LOADED).click();
			}

		}

		if (premEndorsement == true) {

			boolean close5 = image_close4(ANY, LOADED).exists();
			if (close5 == true) {
				image_close4(ANY, LOADED).click();
			}

		}

		unregisterAll();

		boolean HIP = Home_Insurance_Standard(ANY, LOADED).exists();

		if (HIP == true) {

			// Choose policy type - Standard or Home Insurance Plus
			if (Common_Variables.homeInsPlus == true) {
				Home_Insurance_Premium().click(atPoint(36, 23));
			}

			if (Common_Variables.homeInsPlus == false) {
				Home_Insurance_Standard().click(atPoint(36, 23));
			}
		}

		// Make payment type selection
		if (Common_Variables.paymentType.equals("Single Payment")) {

			label_annualPayment().click();

		}

		if (Common_Variables.paymentType.equals("AA Instalment Account (TIA)")) {

			label_payMonthly().click();

		}

		sleep(1.0);

		// Get the Quote Reference

		String actions_Text = (String) html_actions(ANY, LOADED).getProperty(
				".text");

		// Commented for PCI testing in PL7, may require addressing prior to
		// release if change not mirrored in PL1 or Live
		// String actions_Text = (String) html_aside(ANY, LOADED).getProperty(
		// ".text");

		int index = actions_Text.indexOf("Quote details");
		int index3 = index - 13;
		index = index - 1;

		Common_Variables.quoteReference = actions_Text.substring(index3, index);

		if (Common_Variables.coverType.equals("Contents")
				| Common_Variables.coverType.equals("Buildings and Contents")) {

			if (Common_Variables.homeInsPlus == false) {

				Contents_SI(ANY, LOADED).select(Common_Variables.contentsSI);

				sleep(1.0);

				if (Common_Variables.contentsAD == true) {

					html_sectioN2Div().click(atPoint(379, 25));

				}
			}

			browser_htmlBrowser(document_homeInsuranceYourQuot(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtPgDn}");

			list_contentsvolexcess2(ANY, LOADED).select(
					Common_Variables.contentsVolXS);
			sleep(1.0);

			// If Calculate is required, recalculate Premiums after
			// upgrades
			button_recalculatesubmit().waitForExistence();
			button_recalculatesubmit(ANY, LOADED).click();

			//button_buyNowsubmit().waitForExistence();

			BrowserSync();
			
			//-----------------------------------------------------------------			
			callScript("Home.Important_Information_Screen");
			//-----------------------------------------------------------------				


			// If the Security Endorsements popup appears, clear it.
			boolean securityEndorsement20 = html_endorsementsOverlay(ANY,
					LOADED).exists();

			if (securityEndorsement20 == true) {

				boolean close20 = image_close4(ANY, LOADED).exists();
				if (close20 == true) {
					image_close4(ANY, LOADED).click();
				}

			}

		}

		unregisterAll();

		if (Common_Variables.coverType.equals("Buildings")
				| Common_Variables.coverType.equals("Buildings and Contents")) {

			list_buildingvolexcess2(ANY, LOADED).select(
					Common_Variables.buildingsVolXS);
			sleep(1.0);

			// If Calculate is required, recalculate Premiums after
			// upgrades
			button_recalculatesubmit(ANY, LOADED).click();

			button_buyNowsubmit().waitForExistence();

			// If the Security Endorsements popup appears, clear it.
			boolean securityEndorsement2 = html_endorsementsOverlay(ANY, LOADED)
					.exists();

			if (securityEndorsement2 == true) {

				boolean close2 = image_close4(ANY, LOADED).exists();
				if (close2 == true) {
					image_close4(ANY, LOADED).click();
				}

			}

		}

		boolean HIP4 = Home_Insurance_Standard(ANY, LOADED).exists();

		if (HIP4 == true) {

			// Choose policy type - Standard or Home Insurance Plus
			if (Common_Variables.homeInsPlus == true) {
				Home_Insurance_Premium().click(atPoint(36, 23));
			}

			if (Common_Variables.homeInsPlus == false) {
				Home_Insurance_Standard().click(atPoint(36, 23));
			}

			// Make payment type selection
			if (Common_Variables.paymentType.equals("Single Payment")) {

				label_annualPayment().click();

			}

			if (Common_Variables.paymentType
					.equals("AA Instalment Account (TIA)")) {

				label_payMonthly().click();

			}

		}
		
		//-----------------------------------------------------------------			
		callScript("Home.Important_Information_Screen");
		//-----------------------------------------------------------------				

		browser_htmlBrowser(document_homeInsuranceYourQuot(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		browser_htmlBrowser(document_homeInsuranceYourQuot(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ExtPgDn}");

		// Remove Free Road Membership
		html_breakdownDiv().click(atPoint(378, 28));

		sleep(1.0);

		if (Common_Variables.paymentType.equals("AA Instalment Account (TIA)")) {

			String PayByInstalments_Text = (String) html_aside(ANY, LOADED)
					.getProperty(".text");

			int index102 = PayByInstalments_Text.indexOf("deposit");
			index102 = index102 + 11;

			int index103 = PayByInstalments_Text.indexOf("monthly");
			index103 = index103 + 20;

			int index104 = PayByInstalments_Text.indexOf("payable");
			index104 = index104 + 10;

			if (Common_Variables.coverType.equals("Buildings")) {

				Common_Variables.buildingsDepositPrice = PayByInstalments_Text
						.substring(index102, (index102 + 6));
				Common_Variables.buildingsDepositPrice = Common_Variables.buildingsDepositPrice
						.trim();

				Common_Variables.buildingsMonthlyPrice = PayByInstalments_Text
						.substring(index103, (index103 + 6));
				Common_Variables.buildingsMonthlyPrice = Common_Variables.buildingsMonthlyPrice
						.trim();

				Common_Variables.buildingsTotalAnnualPrice = PayByInstalments_Text
						.substring(index104, (index104 + 6));
				Common_Variables.buildingsTotalAnnualPrice = Common_Variables.buildingsTotalAnnualPrice
						.trim();
				//---------------------------------------------------------------------------------------
				System.out.println("Building(s) Cover");
				System.out.println("Deposit = "+Common_Variables.buildingsDepositPrice);
				System.out.println("Monthly Payment = "+Common_Variables.buildingsMonthlyPrice);
				System.out.println("Annual Payment = "+Common_Variables.buildingsTotalAnnualPrice);
				//---------------------------------------------------------------------------------------
						
			}

			if (Common_Variables.coverType.equals("Contents")) {

				Common_Variables.contentsDepositPrice = PayByInstalments_Text
						.substring(index102, (index102 + 6));
				Common_Variables.contentsDepositPrice = Common_Variables.contentsDepositPrice
						.trim();

				Common_Variables.contentsMonthlyPrice = PayByInstalments_Text
						.substring(index103, (index103 + 6));
				Common_Variables.contentsMonthlyPrice = Common_Variables.contentsMonthlyPrice
						.trim();

				Common_Variables.contentsTotalAnnualPrice = PayByInstalments_Text
						.substring(index104, (index104 + 6));
				Common_Variables.contentsTotalAnnualPrice = Common_Variables.contentsTotalAnnualPrice
						.trim();

				//---------------------------------------------------------------------------------------
				System.out.println("Content(s) Cover");
				System.out.println("Deposit = "+Common_Variables.contentsDepositPrice);
				System.out.println("Monthly Payment = "+Common_Variables.contentsMonthlyPrice);
				System.out.println("Annual Payment = "+Common_Variables.contentsTotalAnnualPrice);
				//---------------------------------------------------------------------------------------
			
			}

			if (Common_Variables.coverType.equals("Buildings and Contents")) {

				Common_Variables.combinedDepositPrice = PayByInstalments_Text
						.substring(index102, (index102 + 6));
				Common_Variables.combinedDepositPrice = Common_Variables.combinedDepositPrice
						.trim();

				Common_Variables.combinedMonthlyPrice = PayByInstalments_Text
						.substring(index103, (index103 + 6));
				Common_Variables.combinedMonthlyPrice = Common_Variables.combinedMonthlyPrice
						.trim();

				Common_Variables.combinedTotalAnnualPrice = PayByInstalments_Text
						.substring(index104, (index104 + 6));
				Common_Variables.combinedTotalAnnualPrice = Common_Variables.combinedTotalAnnualPrice
						.trim();

				//---------------------------------------------------------------------------------------
				System.out.println("Buildings and Contents Cover");
				System.out.println("Deposit = "+Common_Variables.combinedDepositPrice);
				System.out.println("Monthly Payment = "+Common_Variables.combinedMonthlyPrice);
				System.out.println("Annual Payment = "+Common_Variables.combinedTotalAnnualPrice);
				//---------------------------------------------------------------------------------------
			
			}

		}

		if (Common_Variables.paymentType.equals("Single Payment")) {

			boolean HIP2 = Home_Insurance_Standard(ANY, LOADED).exists();

			if (HIP2 == true) {

				String OneCardPayment_Text = (String) Home_Insurance_Premium(
						ANY, LOADED).getProperty(".text");

				int index101 = OneCardPayment_Text.indexOf("£");

				if (Common_Variables.coverType.equals("Buildings")) {

					Common_Variables.buildingsAnnualPremium = OneCardPayment_Text
							.substring(index101);

				}

				if (Common_Variables.coverType.equals("Contents")) {

					Common_Variables.contentsAnnualPremium = OneCardPayment_Text
							.substring(index101);

				}

				if (Common_Variables.coverType.equals("Buildings and Contents")) {

					Common_Variables.combinedAnnualPremium = OneCardPayment_Text
							.substring(index101);

				}
			}
		}

		if (Common_Variables.retrieveQuote == true) {

			// HTML Browser
			browser_htmlBrowser(document_homeInsuranceYourQuot(ANY, LOADED),
					DEFAULT_FLAGS).close();

			sleep(3.0);

			// Set the Test Environment you wish to use
			if (Common_Variables.liveTest == true) {
				environmentURL[0] = "https://www.theaa.com/home-insurance/viewQuoteRetrieve.do";
			}

			if (Common_Variables.liveTest == false) {

				environmentURL[0] = "https://"
						+ Common_Variables.selectedEnvironment
						+ ".theaa.com/home-insurance/viewQuoteRetrieve.do";

				if (Common_Variables.selectedEnvironment.equals("prelive1")) {
					environmentURL[0] = "https://prelive1.theaa.com/home-insurance/viewQuoteRetrieve.do";
				}
				if (Common_Variables.selectedEnvironment.equals("prelive9")) {
					environmentURL[0] = "https://prelive9.theaa.com/home-insurance/viewQuoteRetrieve.do";
				}
				if (Common_Variables.selectedEnvironment.equals("prelive2")) {
					environmentURL[0] = "https://prelive2.theaa.com/home-insurance/viewQuoteRetrieve.do";
				}

			}

			startApp("IE", environmentURL);

			browser_htmlBrowser(document_homeInsuranceRetrieve2(ANY, LOADED),
					DEFAULT_FLAGS).waitForExistence();

			text_surname2(ANY, LOADED).waitForExistence();
			text_surname2(ANY, LOADED).click(atPoint(9, 8));
			browser_htmlBrowser(document_homeInsuranceRetrieve2(ANY, LOADED),
					DEFAULT_FLAGS).inputChars(
					Common_Variables.qrProposerLastname);
			list_birthDay2(ANY, LOADED).click();
			list_birthDay2(ANY, LOADED).click(atText("1"));
			list_birthMonth2(ANY, LOADED).click();
			list_birthMonth2(ANY, LOADED).click(atText("January"));
			list_birthYear2(ANY, LOADED).click();
			list_birthYear2(ANY, LOADED).click(atText("1950"));
			text_postcode2(ANY, LOADED).click(atPoint(18, 10));
			browser_htmlBrowser(document_homeInsuranceRetrieve2(ANY, LOADED),
					DEFAULT_FLAGS).inputChars(
					Common_Variables.proposer_PostCode);
			browser_htmlBrowser(document_homeInsuranceRetrieve2(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{TAB}");
			browser_htmlBrowser(document_homeInsuranceRetrieve2(ANY, LOADED),
					DEFAULT_FLAGS).inputChars(Common_Variables.quoteReference);
			button_getQuotesubmit().click();

			label_annualPayment(ANY, LOADED).waitForExistence();

			sleep(5.0);

			// If the Security Endorsements popup appears, clear it.
			boolean securityEndorsement3 = html_endorsementsOverlay(ANY, LOADED)
					.exists();

			if (securityEndorsement3 == true) {

				boolean close2 = image_close4(ANY, LOADED).exists();
				if (close2 == true) {
					image_close4(ANY, LOADED).click();
				}

			}

			sleep(1.0);

			boolean HIP3 = Home_Insurance_Standard(ANY, LOADED).exists();

			if (HIP3 == true) {

				// Choose policy type - Standard or Home Insurance Plus
				if (Common_Variables.homeInsPlus == true) {
					Home_Insurance_Premium().click(atPoint(36, 23));
				}

				if (Common_Variables.homeInsPlus == false) {
					Home_Insurance_Standard().click(atPoint(36, 23));
				}
			}

			// Make payment type selection
			if (Common_Variables.paymentType.equals("Single Payment")) {

				label_annualPayment().click();

			}

			if (Common_Variables.paymentType
					.equals("AA Instalment Account (TIA)")) {

				label_payMonthly().click();

			}

			browser_htmlBrowser(document_homeInsuranceYourQuot(), DEFAULT_FLAGS)
					.inputKeys("{ExtPgDn}");

			sleep(2.0);

			// Remove Free Road Membership
			html_breakdownDiv().click(atPoint(378, 28));

		}

		//stop();
		
		//-----------------------------------------------------------------
		// Final Console Detail
		//---------------------------------------------------------------------------------------
		System.out.println("Quote Reference = "+Common_Variables.quoteReference);
		System.out.println("Surname = "+Common_Variables.qrProposerLastname);
		System.out.println("Postcode = "+Common_Variables.proposer_PostCode);
		System.out.println("Date of Birth = 1 January 1950");  // Fixed, Above
		
		//---------------------------------------------------------------------------------------
		//-----------------------------------------------------------------			
		//callScript("Home.Important_Information_Screen");
		//-----------------------------------------------------------------				

		browser_htmlBrowser(document_homeInsuranceYourQuot(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		sleep(2.0);

		// Buy Now

		boolean buynow = button_buyNowsubmit(ANY, LOADED).exists();
		if (buynow == true) {
			button_buyNowsubmit3().waitForExistence(5,  0.25);
			button_buyNowsubmit3(ANY, READY).click();
		} else if (buynow == true)
			// The AA): RegularExpression(.*)
			button_buyNowsubmit2().waitForExistence(5,  0.25);
			button_buyNowsubmit2(ANY, READY).click();

	}

}
