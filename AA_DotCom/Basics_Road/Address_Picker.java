package Basics_Road;
import resources.Basics_Road.Address_PickerHelper;
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
@SuppressWarnings("unused")
public class Address_Picker extends Address_PickerHelper
{
	/**
	 * Script Name   : <b>Address_Picker</b>
	 * Generated     : <b>27 Jan 2015 12:01:32</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/01/27
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// HTML Browser
		// Document: Basic Breakdown Insurance | Cover for your car | AA: RegularExpression(basic-breakdown-insurance)
		list_select().click();
		list_select().click(atText("2 QUEENS ROAD"));
		
	}
}

