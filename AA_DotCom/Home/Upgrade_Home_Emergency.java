package Home;
import resources.Home.Upgrade_Home_EmergencyHelper;
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
public class Upgrade_Home_Emergency extends Upgrade_Home_EmergencyHelper
{
	/**
	 * Script Name   : <b>Upgrade_Home_Emergency</b>
	 * Generated     : <b>27 Feb 2013 11:14:08</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2013/02/27
	 * @author courtl
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		table_basicHomeEmergencyCover£().waitForExistence();
		
		//Add any additional HER products if required
		
		
		//Click buy now
		button_buyNow(ANY, READY).click();
	}
}

