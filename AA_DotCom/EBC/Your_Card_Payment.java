package EBC;
import resources.Common_Variables;
import resources.EBC.Your_Card_PaymentHelper;
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
 * Description   : Functional Test Script
 * @author courtl
 */
@SuppressWarnings("unused")
public class Your_Card_Payment extends Your_Card_PaymentHelper
{
	/**
	 * Script Name   : <b>Your_Card_Payment</b>
	 * Generated     : <b>16 Apr 2013 14:22:39</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2013/04/16
	 * @author courtl
	 */
	public void testMain(Object[] args) 
	{
		list_pas_cctype(ANY, LOADED).select(Common_Variables.Payment_CardType);
		text_pas_ccnum(ANY, LOADED).setText(Common_Variables.Payment_CardNumber);
		text_pas_ccname(ANY, LOADED).setText(Common_Variables.Payment_CardName);
		list_pas_ccmonth(ANY, LOADED).select("11-Nov");
		list_pas_ccyear(ANY, LOADED).select("2017");
		text_pas_cccvc(ANY, LOADED).setText(Common_Variables.Payment_SecCode);
		
		
		button_next(ANY, LOADED).click();
		button_confirmPayment(ANY, LOADED).waitForExistence();
		button_confirmPayment(ANY, LOADED).click();
		
	}
}

