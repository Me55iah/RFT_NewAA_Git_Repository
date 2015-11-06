package BreakDown_Cover_MK2;
import resources.Common_Variables;
import resources.BreakDown_Cover_MK2.Buy_CoverHelper;
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
public class Buy_Cover extends Buy_CoverHelper
{
	/**
	 * Script Name   : <b>Buy_Cover</b>
	 * Generated     : <b>8 Jun 2015 13:41:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/08
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		try {
			//-----------------------------------------------------------------------------------------
			// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
			// String sPaymentOptions = "Annual Card";
			// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
			//-----------------------------------------------------------------------------------------

			String sPaymentOptions = Common_Variables.paymentType;
			
			
			//--------------------------------------------------------------------		
			// Presentation Varies Depending On Payment Type Selection
			//--------------------------------------------------------------------		
			callScript("BreakDown_Cover_MK2.Variations.TermsConditions_Buy");
			//--------------------------------------------------------------------		
			
			//--------------------------------------------------------------------		
			// Payment Options
			switch (sPaymentOptions){
			//--------------------------------------------------------------------
				case "Annual Bank Account":
					callScript("Utilities.Pay_DD_New");
					break;
					//--------------------------------------------------------------------
				case "Annual Card":
					callScript("Utilities.Pay_CC");
					break;
					//--------------------------------------------------------------------
				case "Month":
					callScript("Utilities.Pay_DD_New");
					callScript("Utilities.Pay_CC");
					break;
					//--------------------------------------------------------------------
			}
			
			//--------------------------------------------------------------------		
			// Presentation Varies Depending On Payment Type Selection
			//--------------------------------------------------------------------		
			callScript("BreakDown_Cover_MK2.Variations.TermsConditions_Buy");
			//--------------------------------------------------------------------		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		//--------------------------------------------------------------------				
				
	}
}

