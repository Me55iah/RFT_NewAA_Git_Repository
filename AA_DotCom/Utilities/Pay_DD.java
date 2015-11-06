package Utilities;
import resources.Utilities.Pay_DDHelper;
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
public class Pay_DD extends Pay_DDHelper
{
	/**
	 * Script Name   : <b>Pay_DD</b>
	 * Generated     : <b>15 Dec 2014 16:11:54</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/15
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------  TO TRY CATCH
		// To DP IF Required
		String sSortCode = "08-90-73";
		String sAccountNumber = "08383923";
		String sAccountName = "Ronald McDonald";
		// To DP IF Required
		//----------------------------------------------------------------		
		BrowserSync();
		// Synch
		text_sortCode().waitForExistence(25.0,  0.25);
		//----------------------------------------------------------------
		// SORT CODE
		// Document: Breakdown Cover : Your payment - The AA: RegularExpression(.*uk-breakdown.*)
		text_sortCode(ANY, READY).click(atPoint(38,8));
		iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sSortCode);
		//----------------------------------------------------------------
		// ACCOUNT NUMBER
		text_accountNo(ANY, READY).click(atPoint(40,10));
		iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountNumber);
		//----------------------------------------------------------------
		// ACCOUNT NAME
		text_accountName(ANY, READY).click(atPoint(40,10));
		iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountName);
		//----------------------------------------------------------------
		// SUBMIT
		html_formTerms(ANY, READY).click(atPoint(30,362));
		button_buyBreakdownCoversubmit(ANY, READY).click();
		//----------------------------------------------------------------
		BrowserSync();
		//----------------------------------------------------------------  TO TRY CATCH
		
	}
}

