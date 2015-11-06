package Travel;

import resources.Common_Variables;
import resources.Travel.Lead_TravellerHelper;
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
public class Lead_Traveller extends Lead_TravellerHelper {
	/**
	 * Script Name : <b>Lead_Traveller</b> Generated : <b>17 Apr 2013
	 * 15:22:04</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/17
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(1.0);

		text_aaTiCustomers0AddressHous().setText(
				Common_Variables.proposer_HouseNumber);
		text_aaTiCustomers0AddressPost().setText(
				Common_Variables.proposer_PostCode);

		if (Common_Variables.travelBrand.equals("AA")) {
			image_btnFindAddress2().click();
		} else {
			image_btnFindAddress().click();
		}

		sleep(10.0);

		browser_htmlBrowser(document_aaTravelInsurance(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		sleep(1.0);

		if (Common_Variables.travelBrand.equals("AA")) {

			if (Common_Variables.medicalScreening.equals("N")) {
				radioButton_aaCustomerMsradiod().click();
				
				button_continuesubmit2().click();

				sleep(8.0);
			}

			if (Common_Variables.medicalScreening.equals("Y")) {

				radioButton_aaCustomerMsradiom().click();
				browser_htmlBrowser(document_aaTravelInsurance2(),
						DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
				button_continuesubmit4().click();
				button_screenNowbutton().waitForExistence();
				button_screenNowbutton().click();

				text_ctl00ContentPlaceHolder1C().waitForExistence();

				text_ctl00ContentPlaceHolder1C2().click(atPoint(38, 8));
				browser_htmlBrowser(document_aaTravelInsurance2(),
						DEFAULT_FLAGS).inputChars("heart attack");
				button_selectbutton().click();

				radioButton_r2215_1on().click();
				radioButton_r2215_2on().click();
				radioButton_r2215_3on().click();
				radioButton_r2215_4on().click();
				radioButton_r2215_5on().click();
				radioButton_r2215_6on().click();
				radioButton_r2215_7on().click();
				radioButton_r2215_8on().click();
				radioButton_r2215_9on().click();
				button_continuesubmit5().click();

				button_finishsubmit().click();
				button_updateQuotesubmit().waitForExistence();
				button_updateQuotesubmit().click();

				sleep(5.0);
		
				image_medicallyScreened(ANY, LOADED).waitForExistence();
				button_continuesubmit6().click();
				
				sleep(8.0);

			}

			

			boolean freeHER = html_heRextracontent().exists();
			if (freeHER == true) {
				browser_htmlBrowser(document_aaTravelInsurance(), DEFAULT_FLAGS)
						.inputKeys("{ExtPgDn}");
				button_continuesubmit3().click();
				sleep(4.0);

			}
		} else {

			button_declarationsubmit().click();
		}

	}
}
