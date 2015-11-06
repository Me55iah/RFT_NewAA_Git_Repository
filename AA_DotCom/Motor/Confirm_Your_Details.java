package Motor;
import resources.Motor.Confirm_Your_DetailsHelper;
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
public class Confirm_Your_Details extends Confirm_Your_DetailsHelper
{
	/**
	 * Script Name   : <b>Confirm_Your_Details</b>
	 * Generated     : <b>12 Mar 2013 13:04:13</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2013/03/12
	 * @author courtl
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		html_main(ANY, READY).waitForExistence();
		
		button_yessubmit(ANY, READY).click();
		
		RationalTestScript.unregisterAll();
		
		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------
			
				
		
		
	}
}

