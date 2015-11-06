package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Verify_Home_Building_QuoteHelper;
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
public class Verify_Home_Building_Quote extends Verify_Home_Building_QuoteHelper
{
	/**
	 * Script Name   : <b>Verify_Home_Building_Quote</b>
	 * Generated     : <b>7 May 2015 13:29:36</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/07
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//------------------------------------------------------
		logInfo(" START OF Common Value Tests For Buildings ONLY Quote");
		// Check Common Values Remain The Same For Monthly And Annual Quotes
		Common_Variables.xmlInsuranceType = "3"; // Building
		Common_Variables.xmlPaymentOption = "Annual";
 		// Verify Common Content
		// Check For Annual Setting
		label_annualPayment().waitForExistence(50,  0.25);
		label_annualPayment(ANY, READY).click();
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// 1st Iteration For Annual
		callScript("Aggregators.Home.Verify_Home_Common_Content");

		// Check Annual Prices
		callScript("Aggregators.Home.Verify_Home_Annual_Prices");
		// TODO
		//------------------------------------------------------
		// Check For Monthly Setting
		Common_Variables.xmlPaymentOption = "Monthly";
		label_payMonthly().waitForExistence(10,  0.25);
		label_payMonthly(ANY, READY).click();
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// 2nd Iteration For Monthly
		callScript("Aggregators.Home.Verify_Home_Common_Content");
	
		logInfo(" END OF Common Value Tests For Buildings ONLY Quote");
		//------------------------------------------------------

		// Check Monthly Prices
		// TODO
		callScript("Aggregators.Home.Verify_Home_Monthly_Prices");
		//------------------------------------------------------

	}
}

