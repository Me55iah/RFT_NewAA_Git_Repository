package BreakDown_Cover_MK2;
import resources.BreakDown_Cover_MK2.ConfirmationHelper;
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
public class Confirmation extends ConfirmationHelper
{
	/**
	 * Script Name   : <b>Confirmation</b>
	 * Generated     : <b>8 Jun 2015 14:54:49</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/08
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------	
		// Thanks for buying AA Breakdown Cover
		//--------------------------------------------------------------------	
		String sTitle = "Breakdown_Cover_Payment_Complete";
		String sReport = "Breakdown Cover Was Purchased Successfully";
		String sExpected = "Thanks for buying AA Breakdown Cover";
		//                  Thanks for buying AA Breakdown Cover
		//--------------------------------------------------------------------	
		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		String sActual = (String)html_container().getProperty(".text");
		if (sActual.contains("Thanks for buying AA Breakdown Cover")){
			sActual = "Thanks for buying AA Breakdown Cover";	 		
		}
		//--------------------------------------------------------------------	
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------	
		callScript("BreakDown_Cover_MK2.Verifications.Confirmation_Page");
		//--------------------------------------------------------------------	
	}
}

