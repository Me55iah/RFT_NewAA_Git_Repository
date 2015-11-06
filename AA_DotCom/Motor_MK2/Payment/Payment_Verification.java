package Motor_MK2.Payment;
import resources.Motor_MK2.Payment.Payment_VerificationHelper;
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
public class Payment_Verification extends Payment_VerificationHelper
{
	/**
	 * Script Name   : <b>Payment_Verification</b>
	 * Generated     : <b>14 Jul 2015 09:57:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/14
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Submit Verification Process  (VERISIGN) **  BEHAVIOUR CHANGE **
		//-----------------------------------------------------------------------------------------
		
		button_submit().waitForExistence(50,  0.25);
		button_submit(ANY, READY).click();
		
//		try {
//			button_submit().waitForExistence(50,  0.25);
//			button_submit(ANY, READY).click();
//		} catch (ObjectNotFoundException e) {
//			// nuffin
//		}
		
		//-----------------------------------------------------------------------------------------
		//
		//-----------------------------------------------------------------------------------------

	}
}

