package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Breakdown_ServiceHelper;
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
public class Breakdown_Service extends Breakdown_ServiceHelper
{
	/**
	 * Script Name   : <b>Breakdown_Service</b>
	 * Generated     : <b>3 Jul 2015 10:15:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		String sBreakdownServiceUsage = Common_Variables.breakDownServiceUsage;
		//--------------------------------------------------------------------
		try {
			list_aaMotorDriversBreakdownCa().waitForExistence(10, 0.25);
			list_aaMotorDriversBreakdownCa(ANY, READY).click();
			sleep(0.5);
			list_aaMotorDriversBreakdownCa().click(atText(sBreakdownServiceUsage));
		} catch (ObjectNotFoundException e) {
			
		}
		//--------------------------------------------------------------------
	}
}

