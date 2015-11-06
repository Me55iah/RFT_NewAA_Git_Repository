package Utilities;
import resources.Utilities.Home_Annual_SelectorHelper;
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
public class Home_Annual_Selector extends Home_Annual_SelectorHelper
{
	/**
	 * Script Name   : <b>Home_Annual_Selector</b>
	 * Generated     : <b>12 May 2015 09:11:18</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/12
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// SELECT MONTH then YEAR - TO CHECK ALL PARAMETERS (DEFAULT SETTING - BUT DO ANYHOW)
		//----------------------------------------------------
		//BrowserSync();
		//----------------------------------------------------
		label_annualPayment().waitForExistence(10,  0.25);
		label_annualPayment(ANY, READY).click();
		//----------------------------------------------------
		//BrowserSync();
		//----------------------------------------------------
	}
}

