package EBC;

import resources.Common_Variables;
import resources.EBC.Your_DetailsHelper;
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
	 * Script Name : <b>Your_Details</b> Generated : <b>16 Apr 2013 10:52:41</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/16
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		sleep(3.0);

		list_title(ANY, LOADED).waitForExistence();

		list_title(ANY, LOADED).select(Common_Variables.proposerTitle);
		
		text_firstName().click();
		browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputChars(Common_Variables.proposerForename);
				
		text_lastName2().click();
		browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputChars(Common_Variables.proposerLastname);
		
		String dobDay = Common_Variables.proposerDOB.substring(0, 2);
		int iDobDay = Integer.parseInt(dobDay);
		String sdobDay = "" + iDobDay;

		String dobMonth = Common_Variables.proposerDOB.substring(2, 4);
		int idobMonth = Integer.parseInt(dobMonth);

		String dobYear = Common_Variables.proposerDOB.substring(4);

		list_birthDay(ANY, LOADED).select(sdobDay);

		list_birthMonth(ANY, LOADED).click();
		int index = 0;

		while (index < idobMonth) {
			browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtDown}");
			index++;
		}
		browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ENTER}");

		list_birthYear(ANY, LOADED).select(dobYear);

		text_addressLine1(ANY, LOADED).setText("324");
		text_addressLine2_2(ANY, READY).click();
		
		
		browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputChars("New Road");
		text_addressLine3(ANY, READY).click();
		
		browser_htmlBrowser(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputChars("Barnsley");
				
		text_postcode(ANY, LOADED).setText("S756GP");

		text_phoneNumber(ANY, LOADED).setText("01234567890");
		text_mobileNumber(ANY, LOADED).setText("07700900123");

		text_email(ANY, LOADED).setText("test@tiatest.com");

		if (Common_Variables.paymentType.equals("Continuous Credit Card")
				&& !Common_Variables.EBC_Product.equals("Single trip")) {
			radioButton_paymentOptionADCC(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.paymentType.equals("Annual Direct Debit")
				&& Common_Variables.EBC_Product.equals("Annual cover")) {
			radioButton_paymentOptionDD(ANY, LOADED).setState(SELECTED);
		}
		if (Common_Variables.paymentType.equals("Single Credit/Debit card")
				&& !Common_Variables.EBC_Cover_Level.equals("Short Break")
				&& !Common_Variables.EBC_Product.equals("Single trip")) {
			radioButton_paymentOptionSDCC(ANY, LOADED).setState(SELECTED);
		}

		checkBox_termsAndCondConsentY(ANY, LOADED).setState(SELECTED);

		button_confirm37h(ANY, LOADED).click();

		if (Common_Variables.paymentType.equals("Continuous Credit Card")
				| Common_Variables.paymentType
						.equals("Single Credit/Debit card")) {

			html_ebcContent(ANY, LOADED).waitForExistence();

			button_continue(ANY, LOADED).click();

		}

	}
}
