package Basics_Road;
import resources.Common_Variables;
import resources.Basics_Road.Summary_2Helper;
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
public class Summary_2 extends Summary_2Helper
{
	/**
	 * Script Name   : <b>Summary_2</b>
	 * Generated     : <b>27 Jan 2015 12:16:11</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/01/27
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// Debug Test Data Start   **** COMMENT I AND OUT AS REQUIRED ****
		
//		(Common_Variables.totalQuotePrice) = "389.31";
		
//		(Common_Variables.coverType) = "Annual";
//		(Common_Variables.paymentType) = "Annual";
		// ********************      Debug Test Data End     ***************************	

		
		//------------------------------------------------------------------------------------------
		// Synchronise
		html_priceFull(ANY, LOADED).waitForExistence(50, 0.25);
		sleep(2);
		//------------------------------------------------------------------------------------------
		String sPriceFull_ContentText = (String)html_priceFull().getProperty(".contentText");
		// Save Totals To Store
		Common_Variables.totalQuotePrice = sPriceFull_ContentText;
		//------------------------------------------------------------------------------------------
		// Verification Of Structure and Some Content - Specifics are handled above (total Price)
		
		
		//------------------------------------------------------------------------------------------
		// Terms and Conditions		
		//checkBox_termson(ANY, READY).click();
		
		label_iConfirmThatYouHaveBroug(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Synchronise
		button_payNowsubmit(ANY, LOADED).waitForExistence(20, 0.25);
		//------------------------------------------------------------------------------------------
		// Pay Now
		button_payNowsubmit(ANY, READY).click();

		
	}
}

