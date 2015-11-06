package Motor_MK2;
import resources.Motor_MK2.AssumptionsHelper;
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
public class Assumptions extends AssumptionsHelper
{
	/**
	 * Script Name   : <b>Assumptions</b>
	 * Generated     : <b>29 May 2015 11:50:02</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/29
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------
		// Assumptions Page Verification
		html_main().performTest(main_textVP(), 0.25, 20.0);
		//-----------------------------------------------------------
	}
}

