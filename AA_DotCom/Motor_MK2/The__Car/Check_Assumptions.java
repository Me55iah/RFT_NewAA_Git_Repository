package Motor_MK2.The__Car;
import resources.Motor_MK2.The__Car.Check_AssumptionsHelper;
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
public class Check_Assumptions extends Check_AssumptionsHelper
{
	/**
	 * Script Name   : <b>Check_Assumptions</b>
	 * Generated     : <b>10 Sep 2015 10:38:15</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/10
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// HTML Browser
		// Document: Car Insurance: The car - The AA: https://prelive1.theaa.com/car-insurance/buy/car-details
		link_checkTheAssumptions().click();
		 
	}
}

