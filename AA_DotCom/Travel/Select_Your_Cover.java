package Travel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Travel.Select_Your_CoverHelper;
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
public class Select_Your_Cover extends Select_Your_CoverHelper {
	/**
	 * Script Name : <b>Select_Your_Cover</b> Generated : <b>17 Apr 2013
	 * 12:52:42</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 * @throws ParseException
	 */
	public void testMain(Object[] args) throws ParseException {

		if (Common_Variables.travelBrand.equals("AA")) {

			sleep(5.0);

			browser_htmlBrowser(document_aaTravelInsurance2(ANY, LOADED), LOADED)
					.inputKeys("{F5}");

			sleep(5.0);

			Policy_Type(ANY, LOADED).select(Common_Variables.travelPolicyType);
			
			sleep(2.0);
		}

		if (Common_Variables.travelBrand.equals("Go")) {

			if (Common_Variables.travelPolicyType.equals("Single Trip")) {
				html_divHomepageProducts().waitForExistence();
				image_getAQuote().click();
				html_divContentLeft().waitForExistence();
				image_getATravelInsuranceQuote().click();
				Go_Policy_Type(ANY, LOADED).waitForExistence();

			}

			if (Common_Variables.travelPolicyType.equals("Annual Multi-trip")) {
				html_divHomepageProducts().waitForExistence();
				image_getAQuote2().click();
				html_divContentLeft().waitForExistence();
				image_getATravelInsuranceQuote2().click();
				Go_Policy_Type(ANY, LOADED).waitForExistence();

			}

			if (Common_Variables.travelPolicyType.equals("Backpacker")) {
				html_divHomepageProducts(ANY, LOADED).waitForExistence();
				image_getAQuote3(ANY, LOADED).click();
				html_divContentLeft(ANY, LOADED).waitForExistence();
				image_getATravelInsuranceQuote3(ANY, LOADED).click();
				list_aaTiDestination(ANY, LOADED).waitForExistence();

			}

		}

		if (Common_Variables.travelBrand.equals("1Stop")) {

			if (Common_Variables.travelPolicyType.equals("Single Trip")) {

				html_divHomepageProducts2(ANY, LOADED).waitForExistence();
				image_getAQuote4(ANY, LOADED).click();
				html_divPageImage(ANY, LOADED).waitForExistence();
				image_getAQuote5(ANY, LOADED).click();
				list_aaTiDestination(ANY, LOADED).waitForExistence();

			}
			if (Common_Variables.travelPolicyType.equals("Annual Multi-trip")) {

				html_divHomepageProducts2(ANY, LOADED).waitForExistence();
				image_getAQuote6(ANY, LOADED).click();
				html_divPageImage(ANY, LOADED).waitForExistence();
				image_getAQuote7(ANY, LOADED).click();
				list_aaTiDestination(ANY, LOADED).waitForExistence();

			}
			if (Common_Variables.travelPolicyType.equals("Backpacker")) {

				html_divHomepageProducts2(ANY, LOADED).waitForExistence();
				image_getAQuote8(ANY, LOADED).click();
				html_divPageImage(ANY, LOADED).waitForExistence();
				image_getAQuote7(ANY, LOADED).click();
				list_aaTiDestination(ANY, LOADED).waitForExistence();
			}

		}

		sleep(1.0);

		if (Common_Variables.travelPolicyType.equals("Single Trip")
				&& Common_Variables.travelBrand.equals("AA")) {

			radioButton_DestinationType(ANY, LOADED).waitForExistence();
			radioButton_DestinationType(ANY, LOADED).click();

		}

		sleep(2.0);

		if (Common_Variables.travelBrand.equals("AA")) {
			Destination(ANY, LOADED).select(
					Common_Variables.travelPolicyDestination);
		}

		sleep(2.0);

		if (Common_Variables.travelBrand.equals("Go")
				| Common_Variables.travelBrand.equals("1Stop")) {

			list_aaTiDestination(ANY, LOADED).select(
					Common_Variables.travelPolicyDestination);

		}

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date ipolicyStartDate = format
				.parse(Common_Variables.todaysDate);

		// Add 14 days to todays date to get the start date of the policy.
		java.util.Date policyStartDate = Common.DateUtil.addDays(
				ipolicyStartDate, 14);

		int tripDuration = Integer
				.parseInt(Common_Variables.Travel_tripDuration);

		// Add the trip duration to todays date to get the end date of the
		// policy.
		java.util.Date policyEndDate = Common.DateUtil.addDays(policyStartDate,
				tripDuration);

		final String OLD_FORMAT = "dd/MM/yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		sdf.applyPattern(OLD_FORMAT);
		String startDate = sdf.format(policyStartDate);
		SimpleDateFormat sdf2 = new SimpleDateFormat(OLD_FORMAT);
		sdf.applyPattern(OLD_FORMAT);
		String endDate = sdf2.format(policyEndDate);

		if (!Common_Variables.travelPolicyType.equals("Annual")
				&& !Common_Variables.travelPolicyType
						.equals("Annual Multi-trip")) {

			Start_Date(ANY, LOADED).setText(startDate);
			sleep(1.0);
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{TAB}");
			End_Date(ANY, LOADED).setText(endDate);
			sleep(1.0);
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{TAB}");
			sleep(1.0);

		}

		if (Common_Variables.travelPolicyType.equals("Annual")
				| Common_Variables.travelPolicyType.equals("Annual Multi-trip")) {
			Start_Date(ANY, LOADED).setText(startDate);
			sleep(1.0);
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{TAB}");
		}

		if (Common_Variables.travelBrand.equals("AA")) {
			if (Common_Variables.personsTravelling.equals("1")) {
				list_aaTiTravellergroup(ANY, LOADED).select("Individual");
			}
			if (Common_Variables.personsTravelling.equals("2")) {
				list_aaTiTravellergroup(ANY, LOADED).select("Couple");
			}
			if (Common_Variables.personsTravelling.equals("3")) {
				list_aaTiTravellergroup(ANY, LOADED).select("Family");
			}
		} else {
			if (Common_Variables.personsTravelling.equals("1")) {
				radioButton_Individual(ANY, LOADED).click();
			}
			if (Common_Variables.personsTravelling.equals("2")) {
				radioButton_Couple().click();
			}
			if (Common_Variables.personsTravelling.equals("3")) {
				radioButton_Family(ANY, LOADED).click();
			}

		}

		sleep(3.0);

		// Customer Details
		text_Lead_Customer_DOB(ANY, LOADED).setText(
				Common_Variables.proposerDOB);
		browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");

		if (Common_Variables.proposerTitle.equals("Mr")) {
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtDown}");
		}

		if (Common_Variables.proposerTitle.equals("Mrs")) {
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtDown}{ExtDown}");
		}

		if (Common_Variables.proposerTitle.equals("Miss")) {
			browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtDown}{ExtDown}{ExtDown}");
		}

		browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");
		text_Lead_Customer_Firstname(ANY, LOADED).setText(
				Common_Variables.proposerForename);
		browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");
		textLead_Customer_Lastname(ANY, LOADED).setText(
				Common_Variables.proposerLastname);
		browser_htmlBrowser(document_aaTravelInsurance(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");
		text_Lead_Customer_Contact_Number(ANY, LOADED).setText("01234567890");
		// text_aaTiContactnumberMobileNu().setText("07700900123");

		text_Lead_Customer_Email(ANY, LOADED).setText("test@tiatest.com");

		button_continuesubmit(ANY, LOADED).click();

		html_divQuoteSummary(ANY, LOADED).waitForExistence();

	}
}
