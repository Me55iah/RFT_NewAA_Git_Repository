package HER;

import resources.Common_Variables;
import resources.HER.Your_DetailsHelper;
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
public class Your_Details extends Your_DetailsHelper {
	/**
	 * Script Name : <b>Your_Details</b> Generated : <b>9 Apr 2013 13:20:44</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(2.0);

		if (Common_Variables.proposerTitle.equals("Mr")) {
			radioButton_title_Mr(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Mrs")) {
			radioButton_title_Mrs(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Miss")) {
			radioButton_title_Miss(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.proposerTitle.equals("Ms")) {
			radioButton_title_Ms(ANY, LOADED).setState(SELECTED);
		}

		text_firstName(ANY, LOADED).setText(Common_Variables.proposerForename);
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		text_surname(ANY, LOADED).setText(Common_Variables.proposerLastname);
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		text_dob(ANY, LOADED).setText(Common_Variables.proposerDOB);
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		text_email(ANY, LOADED).setText("Tia@Tiatest.com");
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		text_tel(ANY, LOADED).setText("01234567890");
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		sleep(1.0);
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");
		text_addr1(ANY, LOADED).setText(Common_Variables.proposer_HouseNumber);
		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		text_postcode(ANY, LOADED).setText(Common_Variables.proposer_PostCode);

		button_findYourAddress(ANY, LOADED).click();

		sleep(5.0);

		button_next(ANY, LOADED).waitForExistence();

		browser_htmlBrowser(document_homeEmergencyResponse(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		button_next(ANY, LOADED).click();

		sleep(3.0);

		boolean propertyType = list_propertyType(ANY, LOADED)
				.ensureObjectIsVisible();

		while (propertyType == false) {
			sleep(1.0);
			propertyType = list_propertyType(ANY, LOADED)
					.ensureObjectIsVisible();
		}

	}
}
