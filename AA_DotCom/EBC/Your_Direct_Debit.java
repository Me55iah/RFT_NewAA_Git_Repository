package EBC;

import resources.Common_Variables;
import resources.EBC.Your_Direct_DebitHelper;
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
	 * Script Name : <b>Your_Direct_Debit</b> Generated : <b>16 Apr 2013
	 * 14:40:19</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/16
	 * @author courtl
	 */
	public void testMain(Object[] args) {
		String sortcode1 = Common_Variables.Payment_Bank_Sortcode.substring(0,
				2);
		String sortcode2 = Common_Variables.Payment_Bank_Sortcode.substring(3,
				5);
		String sortcode3 = Common_Variables.Payment_Bank_Sortcode.substring(6);

		text_sortcode1(ANY, READY).setText(sortcode1);
		text_sortcode2(ANY, READY).setText(sortcode2);
		text_sortcode3(ANY, READY).setText(sortcode3);

		text_accountNumber(ANY, READY).setText(
				Common_Variables.Payment_Bank_Account_Number);
		text_accountName().setText(Common_Variables.Payment_Bank_Account_Name);

		button_confirmBank(ANY, READY).click();

		button_submitDirectDebitDetail().waitForExistence();
		button_submitDirectDebitDetail(ANY, READY).click();

		html_ebcContent().waitForExistence();

	}
}
