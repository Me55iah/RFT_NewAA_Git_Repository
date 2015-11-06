package Home;

import resources.Common_Variables;
import resources.Home.Your_Direct_DebitHelper;
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

////////////////////////////////////////////////////////////////////////////////////////
//  25/11/2014 - Process Logic Flow changed - Auto to CARD Payment Now - Line 88 - DH //
////////////////////////////////////////////////////////////////////////////////////////

public class Your_Direct_Debit extends Your_Direct_DebitHelper {
	/**
	 * Script Name : <b>Your_Direct_Debit</b> Generated : <b>28 Feb 2013
	 * 12:17:22</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/02/28
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		String sortcode1 = Common_Variables.Payment_Bank_Sortcode.substring(0,
				2);
		String sortcode2 = Common_Variables.Payment_Bank_Sortcode.substring(3,
				5);
		String sortcode3 = Common_Variables.Payment_Bank_Sortcode.substring(6);

		// HTML Browser
		// Document: Home Insurance : Set up your direct debit for Home
		// Insurance Plus - The AA:
		// RegularExpression(https://.*theaa\.com/home-insurance/viewBankDetails\.do)
		text_sortCode1_3(ANY, READY).click(atPoint(15, 8));

		// text_sortCode1_2(ANY, READY).click(atPoint(12,11));

		browser_htmlBrowser(document_homeInsuranceSetUpYou(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys(sortcode1);
		browser_htmlBrowser(document_homeInsuranceSetUpYou(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_homeInsuranceSetUpYou(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys(sortcode2);
		browser_htmlBrowser(document_homeInsuranceSetUpYou(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_homeInsuranceSetUpYou(ANY, LOADED),
				DEFAULT_FLAGS).inputChars(sortcode3);
		
		
		
		// HTML Browser
		// Document: Home Insurance : Set up your direct debit for Home Insurance Plus - The AA: RegularExpression(https://.*theaa\.com/home-insurance/viewBankDetails\.do)
		text_accountNumber3(ANY, READY).click(atPoint(64,8));
		
		
		// Document: Home Insurance : Set up your direct debit for Home Insurance Plus - The AA: RegularExpression(https://.*theaa\.com/home-insurance/viewBankDetails\.do)
		text_accountNumber3(ANY, READY).click(atPoint(23,16));
		browser_htmlBrowser(document_homeInsuranceSetUpYou2(),DEFAULT_FLAGS).inputKeys("{Num1}{Num2}{Num3}{Num4}{Num5}{Num6}{Num7}{Num8}");
		text_accountName4(ANY, READY).click(atPoint(60,16));
		browser_htmlBrowser(document_homeInsuranceSetUpYou2(),DEFAULT_FLAGS).inputChars("theaa");
		
		text_accountName4(ANY, READY).click(atPoint(51,14));
		//button_nextsubmit2(ANY, READY).click();
	
		sleep(1.0);
		//text_accountNumber2(ANY, LOADED).setText(Common_Variables.Payment_Bank_Account_Number);
		//text_accountName3(ANY, LOADED).setText(Common_Variables.Payment_Bank_Account_Name);

		button_nextsubmit(ANY, READY).click();
		sleep(5.0);
		// CHANGED - PROCESS FLOW CHANGE
		//button_proceedToCardPaymentsub(ANY, LOADED).waitForExistence();
		//button_proceedToCardPaymentsub(ANY, LOADED).click();
		
		// callScript("Generic_Scripts.Your_Card_Payment");
		callScript("Utilities.Pay_CC"); // Generic_Scripts.Your_Card_Payment - IE11/WIN7

	}
}
