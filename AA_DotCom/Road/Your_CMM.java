package Road;

import resources.Common_Variables;
import resources.Road.Your_CMMHelper;
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
public class Your_CMM extends Your_CMMHelper {
	/**
	 * Script Name : <b>Your_CMM</b> Generated : <b>10 Apr 2013 09:25:55</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/10
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		text_sortCode().waitForExistence();

		text_sortCode().setText(Common_Variables.Payment_Bank_Sortcode);
		text_accountNo().setText(Common_Variables.Payment_Bank_Account_Number);
		text_accountName().setText(Common_Variables.Payment_Bank_Account_Name);

		checkBox_terms_Conditiontrue2(ANY, READY).click();

		button_buyBreakdownCoverbutton(ANY, READY).click();

		callScript("Utilities.Pay_CC");  // IE11
		// callScript("Generic_Scripts.Your_Card_Payment");

		sleep(5.0);

		image_aaCreditCardApplyToday2(ANY, LOADED).waitForExistence();

		String bdWrap_Text = (String) html_bdWrap().getProperty(".text");

		int index1 = bdWrap_Text.indexOf("Membership number");
		index1 = index1 + 18;

		int index2 = bdWrap_Text.indexOf("Main member");
		index2 = index2 - 1;

		String membershipNumber = bdWrap_Text.substring(index1, index2);
		Common_Variables.TIA_Policy_Number = membershipNumber;

		int index3 = bdWrap_Text.indexOf("Total cost");
		index3 = index3 + 11;

		int index4 = bdWrap_Text.indexOf("Card type");
		index4 = index4 - 1;

		try{
			String totalCost = bdWrap_Text.substring(index3, index4);
			Common_Variables.annualPremium = totalCost;
		}
		catch (Exception e) {
			logWarning("Could NOT Resolve Annual Premium Calculation Due to String Index Error - NON FATAL");
		}
		
//		// MAF Textual Verification
//		logInfo(" * * * MAF TEXTUAL CHECKS FOR BANK CARD PAYMENTS PAGE FOLLOWS * * * ");
//		callScript("Verification.MAF_Road_Textual");
//		logInfo(" * * * MAF TEXTUAL CHECKS FOR BANK CARD PAYMENTS PAGE COMPLETED * * * ");

//			try {
//		        String fullName = JOptionPane.showInputDialog("Enter your full name");
//		        String lastName = fullName.split("\\s+")[1];
//		    catch (IOException e) {
//		        System.out.println("Sorry, please enter your full name separated by a space.")
//		        //Repeat try statement. ie. Ask user for a new string?
//		    }
	
		


	}
}
