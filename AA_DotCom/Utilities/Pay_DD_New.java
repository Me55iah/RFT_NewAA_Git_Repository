package Utilities;
import resources.Common_Variables;
import resources.Utilities.Pay_DD_NewHelper;
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
public class Pay_DD_New extends Pay_DD_NewHelper
{
	/**
	 * Script Name   : <b>Pad_DD_New</b>
	 * Generated     : <b>9 Jun 2015 16:21:10</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/09
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		// Test Data
//		String sSortCode = "112233";
//		String sAccountNumber = "09079319";
//		String sAccountName = "Burt Millichip";
//		// Test Data
		//----------------------------------------------------------------  TO TRY CATCH
		// To DP IF Required
		String sSortCode = Common_Variables.DD_SortCode;
		String sAccountNumber = Common_Variables.DD_AccountNumber;
		String sAccountName = Common_Variables.Payment_CardName;
		// To DP IF Required
		//----------------------------------------------------------------		
 		BrowserSync();
		// Synch
		//----------------------------------------------------------------
		
		if (text_sortCode().exists()){
			// SORT CODE
			// Document: Breakdown Cover : Your payment - The AA: RegularExpression(.*uk-breakdown.*)
			text_sortCode().waitForExistence(25.0,  0.25);
			text_sortCode(ANY, READY).click(atPoint(38,8));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sSortCode);
			//----------------------------------------------------------------
			// ACCOUNT NUMBER
			text_accountNo().waitForExistence(25.0,  0.25);
			text_accountNo(ANY, READY).click(atPoint(40,10));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountNumber);
			//----------------------------------------------------------------
			// ACCOUNT NAME
			text_accountName().waitForExistence(25.0,  0.25);
			text_accountName(ANY, READY).click(atPoint(40,10));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountName);
			//----------------------------------------------------------------
			// SUBMIT
			//if (button_buyBreakdownCoversubmit().exists()){
			button_buyBreakdownCoversubmit().waitForExistence(25.0,  0.25);
			button_buyBreakdownCoversubmit(ANY, READY).click();
			//}
		}
		
		
		//----------------------------------------------------------------
		BrowserSync();
		//----------------------------------------------------------------  TO TRY CATCH
		
		
		
	}
}

