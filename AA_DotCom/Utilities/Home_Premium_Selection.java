package Utilities;
import resources.Utilities.Home_Premium_SelectionHelper;
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
public class Home_Premium_Selection extends Home_Premium_SelectionHelper
{
	/**
	 * Script Name   : <b>Home_Premium_Selection</b>
	 * Generated     : <b>12 May 2015 09:20:03</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/12
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Home PREMIUM SELECTOR LH Central Page Element
		//----------------------------------------------------
		//BrowserSync();
		//----------------------------------------------------
		html_premiumSelectDiv().waitForExistence(10,  0.25);
		html_premiumSelectDiv(ANY, READY).click(atPoint(68,86));
		//----------------------------------------------------
		//BrowserSync();
		//----------------------------------------------------		
	}
}

