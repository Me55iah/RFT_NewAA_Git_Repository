package Motor;

import resources.Common_Variables;
import resources.Motor.Your_Direct_DebitHelper;
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
public class Your_Direct_Debit extends Your_Direct_DebitHelper {
	/**
	 * Script Name : <b>Your_Direct_Debit</b> Generated : <b>13 Mar 2013
	 * 08:39:07</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/13
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		text_bankAccountName().waitForExistence();

		String sortcode1 = Common_Variables.Payment_Bank_Sortcode.substring(0,
				2);
		String sortcode2 = Common_Variables.Payment_Bank_Sortcode.substring(3,
				5);
		String sortcode3 = Common_Variables.Payment_Bank_Sortcode.substring(6);

		text_bankAccountName().click(atPoint(20, 12));
		browser_htmlBrowser(document_carInsuranceYourDirec(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.Payment_Bank_Account_Name);
		text_bankAccountNumber().click(atPoint(53, 10));
		browser_htmlBrowser(document_carInsuranceYourDirec(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.Payment_Bank_Account_Number);
		text_bankSortCode1().click(atPoint(15, 13));
		browser_htmlBrowser(document_carInsuranceYourDirec(), DEFAULT_FLAGS)
				.inputChars(sortcode1);
		text_bankSortCode2().click(atPoint(5, 10));
		browser_htmlBrowser(document_carInsuranceYourDirec(), DEFAULT_FLAGS)
				.inputChars(sortcode2);
		text_bankSortCode3().click(atPoint(10, 10));
		browser_htmlBrowser(document_carInsuranceYourDirec(), DEFAULT_FLAGS)
				.inputChars(sortcode3);

		checkBox_bankPolicyHoldertrue().click();

		button_nextsubmit(ANY,READY).click();
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

	}
}
