import resources.Common_Variables;
import resources.Create_New_CustomerHelper;
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
 * Description : Functional Test Script
 * 
 * @author courtl
 */
public class Create_New_Customer extends Create_New_CustomerHelper {
	/**
	 * Script Name : <b>Create_New_Customer</b> Generated : <b>26 Feb 2013
	 * 09:42:35</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/02/26
	 * @author courtl
	 */

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	//   Dave (reverted) added to surname content - for eazy detection for filtering - (prefix) "Tia" is now "Tiatest" in dp storage and usage - 01/12/2014
	//
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static String surnameSuffix1;
	public static String surnameSuffix2;
	public static String surnameSuffix3;
	public static String surnameSuffix4;
	public int requestedDatapoolRow;
	public static String Surname;

	public void testMain(Object[] args) {

		// Create random suffix to add to the customer surname
		surnameSuffix1 = resources.Common.generateString();
		surnameSuffix2 = resources.Common.generateString();
		surnameSuffix3 = resources.Common.generateString();
		surnameSuffix4 = resources.Common.generateString();

		Surname = "Tia" + surnameSuffix1 + surnameSuffix2 + surnameSuffix3
				+ surnameSuffix4;

		Common_Variables.firstDriverSurname = "Tia" + surnameSuffix1
				+ surnameSuffix2 + surnameSuffix3 + surnameSuffix4;

		Common_Variables.newCustomerForename = Common_Variables.proposerForename;
		Common_Variables.newCustomerSurname = Surname;
		Common_Variables.proposerLastname = Surname;
		

	}
}
