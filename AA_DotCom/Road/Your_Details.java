package Road;

import resources.Common_Variables;
import resources.Road.Your_DetailsHelper;
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
public class Your_Details extends Your_DetailsHelper {
	/**
	 * Script Name : <b>Your_Details</b> Generated : <b>8 Apr 2013 14:24:09</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/08
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(5.0);

		// Get Full price details
		if (Common_Variables.paymentType.equals("CMM")) {
			String scrollSummary_Text = (String) html_scrollSummary(ANY, LOADED)
					.getProperty(".text");

			System.out.println(scrollSummary_Text);

			int index1 = scrollSummary_Text.indexOf("£");
			int index2 = scrollSummary_Text.indexOf("for your first year");
			index2 = index2 - 1;

			String annualPremium = scrollSummary_Text.substring(index1, index2);

			Common_Variables.annualPremium = annualPremium;

			int index3 = scrollSummary_Text.indexOf("for your first year");
			index3 = index3 + 16;
			int index4 = index3 + 7;

			String monthly = scrollSummary_Text.substring(index3, index4);
			monthly = monthly.trim();

			Common_Variables.monthlyPrice = monthly;

		}

		if (Common_Variables.proposerTitle.equals("Mr")) {
			radioButton_policyHolderTitle_Mr(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Mrs")) {
			radioButton_policyHolderTitle_Mrs(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Miss")) {
			radioButton_policyHolderTitle_Miss(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Ms")) {
			radioButton_policyHolderTitle_Ms(ANY, LOADED).setState(SELECTED);
		}

		text_policyHolderFirstname(ANY, LOADED).setText(
				Common_Variables.proposerForename);
		text_policyHolderSurname(ANY, LOADED).setText(
				Common_Variables.proposerLastname);
		text_policyHolderDobDate(ANY, LOADED).setText(
				Common_Variables.proposerDOB);
		text_addressAddressLine1(ANY, LOADED).setText(
				Common_Variables.proposer_HouseNumber);
		text_addressPostcode(ANY, LOADED).setText(
				Common_Variables.proposer_PostCode);

		button_findMyAddressbutton(ANY, LOADED).click();
		sleep(5.0);

		text_emailAddress(ANY, LOADED).setText("Tia@tiatest.com");
		browser_htmlBrowser(document_breakdownCoverYourDet(ANY, LOADED), LOADED)
				.inputKeys("{TAB}");
		text_phoneNumber(ANY, LOADED).setText("01234567890");
		browser_htmlBrowser(document_breakdownCoverYourDet(ANY, LOADED), LOADED)
				.inputKeys("{TAB}");
		text_mobileNumber(ANY, LOADED).setText("07700900123");

		// Add Additional Members

		if (Common_Variables.personsCovered.equals("Two People")) {

			radioButton_additionalMembers0(ANY, LOADED).click();

			text_additionalMembers0FirstNa(ANY, LOADED).setText("Tia");
			text_additionalMembers0Surname(ANY, LOADED).setText("Tiatest");
			text_additionalMembers0DateOfB(ANY, LOADED).setText("01011980");

		}
		if (Common_Variables.personsCovered.equals("Family")) {

			radioButton_additionalMembers0(ANY, LOADED).click();
			text_additionalMembers0FirstNa(ANY, LOADED).setText("David");
			text_additionalMembers0Surname(ANY, LOADED).setText("Secondmember");
			text_additionalMembers0DateOfB(ANY, LOADED).setText("17051974");

			radioButton_additionalMembers1(ANY, LOADED).click();
			text_additionalMembers1FirstNa(ANY, LOADED).setText("Donald");
			text_additionalMembers1Surname(ANY, LOADED).setText("Thirdmember");
			text_additionalMembers1DateOfB(ANY, LOADED).setText("17051974");

			radioButton_additionalMembers2(ANY, LOADED).click();
			text_additionalMembers2FirstNa(ANY, LOADED).setText("Dick");
			text_additionalMembers2Surname(ANY, LOADED).setText("Forthmember");
			text_additionalMembers2DateOfB(ANY, LOADED).setText("17051974");

		}

		if (Common_Variables.upgrades_BRC == false
				&& Common_Variables.upgrades_StayMobile == false
				&& !Common_Variables.personsCovered.equals("Vehicle")) {
			text_personalVehReg2(ANY, LOADED).setText(
					Common_Variables.vehicleReg);
		}

		list_motorInsRenewalMonth(ANY, LOADED).select("January");

		browser_htmlBrowser(document_breakdownCoverYourDet(ANY, LOADED), LOADED)
				.inputKeys("{ExtPgDn}");

		// DG update payment radio button 18/09 as name changed.
		if (Common_Variables.paymentType.equals("ADD")) {

			// bank DD
			radioButton_membershipPaymentT(ANY, READY).click();

		}

		if (Common_Variables.paymentType.equals("CCC")) {

			// card payment annually
			radioButton_membershipPaymentT2(ANY, READY).click();

		}

		if (Common_Variables.paymentType.equals("CMM")) {

			// Monthly payment
			radioButton_membershipPaymentT3(ANY, READY).click();

		}

		browser_htmlBrowser(document_breakdownCoverYourDet(ANY, LOADED), LOADED)
				.inputKeys("{ExtPgDn}");

		button_continuesubmit(ANY, READY).click();

		// button_proceedToSecurePayment(ANY, LOADED).click();

		sleep(5.0);

		// Free HER

		boolean freeHER = label_homeEmergencyResponse247().exists();
		
		// Seems Invalid If Clause - to monitor

		// DAVE put this here, if clause had no brackets? 
		if (freeHER == true){
			list_propertyType(ANY, LOADED).click();
			list_propertyType(ANY, LOADED).click(atText("Detached"));
			list_noOfBedrooms(ANY, LOADED).click();
			list_noOfBedrooms(ANY, LOADED).click(atText("4"));
		
			checkBox_assumptionson(ANY, READY).click();
			continuesubmit(ANY, READY).click();

		}
		
		///////////////////////////////////////////////////////////////////
		//
		// Process Change - 02/03/2014 - Extra CheckBox and Button - DH
		// When FreeHER == false
		//
		///////////////////////////////////////////////////////////////////
		
//		checkBox_assumptionson().exists();{
//			
//		}
//		else {
//			// freeHER FALSE
//			checkBox_assumptionson(ANY, READY).click();
//			continuesubmit(ANY, READY).click();
//		}
		
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave  
		//------------------------------------------------------------------------------------------


		// String Continuesubmit_value = (String)button_continuesubmit3().getProperty("value");
		
		
		// Previous implemenation to above
		
		//checkBox_assumptionson2(ANY, READY).click();
		//continuesubmit(ANY, LOADED).click();
		
		//checkBox_terms_Conditiontrue().click();
		
		// MAF Textual Verification
		logInfo(" * * * MAF TEXTUAL CHECKS FOR YOUR DETAILS PAGE FOLLOWS * * * ");
		callScript("Verification.MAF_Road_Textual");
		logInfo(" * * * MAF TEXTUAL CHECKS FOR YOUR DETAILS PAGE COMPLETED * * * ");

		
		

	}
}
