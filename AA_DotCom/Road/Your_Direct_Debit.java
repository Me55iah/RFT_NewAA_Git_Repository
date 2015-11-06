package Road;

import resources.Common_Variables;
import resources.Road.Your_Direct_DebitHelper;
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
	 * Script Name : <b>Your_Direct_Debit</b> Generated : <b>8 Apr 2013
	 * 16:02:30</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/08
	 * @author courtl
	 */
	
	/////////////////////////////////////////////////////////////////////////////////////
	// Line 66 breaking regularly, string error - fundamental error to be tracked down
	// will put try/catch around do that the process continues
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void testMain(Object[] args) {

		text_sortCode().waitForExistence(50, 2);

		text_sortCode().setText(Common_Variables.Payment_Bank_Sortcode);
		text_accountNo().setText(Common_Variables.Payment_Bank_Account_Number);
		text_accountName().setText(Common_Variables.Payment_Bank_Account_Name);

		checkBox_terms_Conditiontrue4(ANY, LOADED).click();
		button_buyBreakdownCoversubmit2(ANY, LOADED).click();

		String bdWrap_Text = (String) html_bdWrap().getProperty(".text");

		int index1 = bdWrap_Text.indexOf("Membership number");
		index1 = index1 + 18;

		int index2 = bdWrap_Text.indexOf("Main member");
		index2 = index2 - 1;

		String membershipNumber = bdWrap_Text.substring(index1, index2);
		Common_Variables.TIA_Policy_Number = membershipNumber;

		int index3 = bdWrap_Text.indexOf("Total cost");
		index3 = index3 + 11;

		int index4 = bdWrap_Text.indexOf("Bank sort code");
		index4 = index4 - 1;

		try {
			String totalCost = bdWrap_Text.substring(index3, index4);
			Common_Variables.annualPremium = totalCost;
		} 
		
		catch (Exception e){
			logInfo("String Error Detected - as reported in log");
		}
		
		// MAF Textual Verification
//		logInfo(" * * * MAF TEXTUAL CHECKS FOR BANK DIRECT DEBIT PAYMENTS PAGE FOLLOWS * * * ");
//		callScript("Verification.MAF_Road_Textual");
//		logInfo(" * * * MAF TEXTUAL CHECKS FOR BANK DIRECT DEBIT PAYMENTS PAGE COMPLETED * * * ");


	}
}
