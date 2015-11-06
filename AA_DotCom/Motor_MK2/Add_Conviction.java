package Motor_MK2;
import resources.Motor_MK2.Add_ConvictionHelper;
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
public class Add_Conviction extends Add_ConvictionHelper
{
	/**
	 * Script Name   : <b>Add_Conviction</b>
	 * Generated     : <b>1 Jun 2015 12:39:51</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// HTML Browser
		// Document: Car Insurance: Your details - The AA: https://prelive9.theaa.com/car-insurance/buy/policyholder-details
		list_aaMotorDrivers0Conviction().click();
		list_aaMotorDrivers0Conviction().click(atText("January"));
		list_aaMotorDrivers0Conviction2().click();
		list_aaMotorDrivers0Conviction2().click(atText("2013"));
		list_aaMotorDrivers0Conviction3().click();
		list_aaMotorDrivers0Conviction3().click(atText("3"));
		text_aaMotorDrivers0Conviction().click(atPoint(112,39));
		browser_htmlBrowser(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("100");
		label_no().click();
		label_yes().click();
		text_aaMotorDrivers0Conviction2().click(atPoint(98,43));
		browser_htmlBrowser(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("18");
		link_convictionConfirm().click();
		 
	}
}

