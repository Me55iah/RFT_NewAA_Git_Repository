package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Payment_FrequencyHelper;
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
public class Payment_Frequency extends Payment_FrequencyHelper
{
	/**
	 * Script Name   : <b>Payment_Frequency</b>
	 * Generated     : <b>3 Jul 2015 13:39:37</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Payment Frequency - Type
		String sPaymentFrequency = Common_Variables.paymentType; 	 
		//------------------------------------------------------------------------------------------
		// Default MONTHLY OPTION
		switch (sPaymentFrequency){
			//--------------------------------------------
			// MONTHLY PAYMENTS (Default)
			//--------------------------------------------
			case "Instalment":
				label_selected().waitForExistence(5, 0.25);			
				label_selected(ANY, READY).click();
				break;
			//--------------------------------------------
			// Annual Single Payment
			//--------------------------------------------
			case "Single Payment":
				label_select().waitForExistence(5, 0.25);			
				label_select(ANY, READY).click();
				break;	
		}		
		//-----------------------------------------------------------------------------------------

	}
}

